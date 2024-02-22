import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class MainClass {

	public static void main(String[] args) {

		ImageIcon icon = new ImageIcon("logo2.png");

		JFrame pencere = new JFrame("Instagram");
		pencere.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pencere.setSize(420, 420);
		pencere.setResizable(false);
		pencere.setLocationRelativeTo(null);
		pencere.setLayout(null);
		pencere.setIconImage(icon.getImage());
		pencere.getContentPane().setBackground(new Color(0xEB90F2));

		JLabel label = new JLabel();
		label.setText("Instagram");
		label.setIcon(icon);
		label.setFont(new Font("Consolas", Font.BOLD, 25));
		label.setForeground(Color.black);
		label.setHorizontalTextPosition(JLabel.CENTER);
		label.setVerticalTextPosition(JLabel.BOTTOM);
		label.setIconTextGap(5);
		label.setBounds(135, 20, 130, 110);

		JLabel userLabel = new JLabel();
		userLabel.setText("Username");
		userLabel.setFont(new Font("Consolas", Font.BOLD, 12));
		userLabel.setForeground(Color.black);
		userLabel.setBounds(128, 140, 60, 20);

		JLabel passwordLabel = new JLabel();
		passwordLabel.setText("Password");
		passwordLabel.setFont(new Font("Consolas", Font.BOLD, 12));
		passwordLabel.setForeground(Color.black);
		passwordLabel.setBounds(128, 192, 60, 20);

		JTextField field1 = new JTextField();
		field1.setFont(new Font("Consolas", Font.BOLD, 18));
		field1.setBounds(128, 160, 150, 25);
		field1.setBackground(new Color(0xEB90F2));
		field1.setBorder(BorderFactory.createLineBorder(Color.black, 2));

		JPasswordField field2 = new JPasswordField();
		field2.setFont(new Font("Consolas", Font.PLAIN, 20));
		field2.setBounds(128, 212, 150, 25);
		field2.setBackground(new Color(0xEB90F2));
		field2.setBorder(BorderFactory.createLineBorder(Color.black, 2));

		JButton btn1 = new JButton("Ýlerle");
		btn1.setFocusable(false);
		btn1.setBounds(128, 255, 70, 30);
		btn1.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		btn1.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.out.println("Giris basarili !");

			}
		});

		JButton btn2 = new JButton("Çýkýþ");
		btn2.setFocusable(false);
		btn2.setBounds(208, 255, 70, 30);
		btn2.setBorder(BorderFactory.createLineBorder(Color.black, 2));
		btn2.addActionListener(new ActionListener() {

			public void actionPerformed(ActionEvent e) {

				System.exit(1);

			}
		});

		pencere.add(label);
		pencere.add(userLabel);
		pencere.add(passwordLabel);
		pencere.add(field1);
		pencere.add(field2);
		pencere.add(btn1);
		pencere.add(btn2);

		pencere.setVisible(true);

	}

}
