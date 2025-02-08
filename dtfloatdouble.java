import java.util.Scanner;

public class Main { 
    public static void main(String[] args) {
        float f1 = 1.123456789f;
        System.out.println(f1);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bitte Zahl Eingeben: ");
        float f2 = scanner.nextFloat();
        System.out.println("Die kleine Zahl: " + f2);
        
        scanner.close();
    }
}
