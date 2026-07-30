package com.crrepa.band.my.device.muslim.utils;

/* loaded from: classes2.dex */
public class a {
    public static int calculateBearing(double d8, double d9, double d10, double d11) {
        double degreesToRadians = degreesToRadians(d8);
        double degreesToRadians2 = degreesToRadians(d9);
        double degreesToRadians3 = degreesToRadians(d10);
        double degreesToRadians4 = degreesToRadians(d11) - degreesToRadians2;
        return (radiansToDegrees(Math.atan2(Math.sin(degreesToRadians4) * Math.cos(degreesToRadians3), (Math.cos(degreesToRadians) * Math.sin(degreesToRadians3)) - ((Math.sin(degreesToRadians) * Math.cos(degreesToRadians3)) * Math.cos(degreesToRadians4)))) + 360) % 360;
    }

    public static double degreesToRadians(double d8) {
        return (d8 * 3.141592653589793d) / 180.0d;
    }

    public static void main(String[] strArr) {
        double calculateBearing = calculateBearing(28.1149d, 112.5842d, 21.424055d, 39.826164d);
        System.out.println("The bearing angle from current position to target position is: " + calculateBearing + " degrees.");
    }

    public static int radiansToDegrees(double d8) {
        return (int) Math.round((d8 * 180.0d) / 3.141592653589793d);
    }
}
