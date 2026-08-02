package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class Utils {
    public static double gaussian(double d4, double d5, double d6, double d7) {
        return Math.exp((-Math.pow(d4 - d6, 2.0d)) / d7) * d5;
    }

    public static double logisticalFunction(double d4, double d5, double d6) {
        return 1.0d / (Math.exp((d5 - d4) * d6) + 1.0d);
    }

    public static double logisticalFunction0(double d4, double d5, double d6, double d7) {
        return (logisticalFunction(d4, d5, d6) - d7) / (1.0d - d7);
    }

    public static double logisticalFunction1(double d4, double d5, double d6, double d7) {
        return logisticalFunction(d4, d5, d6) / d7;
    }

    public static double smsq(double d4, double d5, double d6) {
        return (d6 * d6) + (d5 * d5) + (d4 * d4);
    }
}
