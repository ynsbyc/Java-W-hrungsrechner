import java. util.Scanner;
/**
 * Währungsumrechner von Yunus B.
 */
public class Währungsumrechner {
    public static void main(String[] args) {
        System.out.println("Dollar");
        System.out.println("Euro");
        Scanner scan = new Scanner(System.in);
        System. out.println("Wählen Sie die Währung aus, die Sie umrechnen möchten");
        int auswahl = scan.nextInt();
        System.out.println("Nennen Sie den gewünschten Betrag");
        double anzahl = scan.nextDouble();
        switch (auswahl) {
            case 1:
                Dollar_Zu_Euro(anzahl);
                break;
            case 2:
                Euro_Zu_Dollar(anzahl);
                break;
            default:
                System.out.println("Ungültige Auswahl!");
        }
    }
    public static void Dollar_Zu_Euro(double amt) {
        System.out.println("1 Dollar= " + 0.93 + " Euro");
        System.out.println();
        System.out.println(amt+"Dollar = " + (amt*0.93) + " Euro");
    }
    public static void Euro_Zu_Dollar(double amt){
        System.out.println("1 Euro = " + 1.07 + "Dollar");
        System.out.println();
        System.out.println(amt+" Euro = " + (amt*1.07) + "Dollar");
    }
}