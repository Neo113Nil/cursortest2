package com.startapp.motiondetector;

/* loaded from: classes3.dex */
public class Utils {
    public static double smsq(double d, double d2, double d3) {
        return (d * d) + (d2 * d2) + (d3 * d3);
    }

    public static double logisticalFunction(double d, double d2, double d3) {
        return 1.0d / (Math.exp((d2 - d) * d3) + 1.0d);
    }

    public static double logisticalFunction0(double d, double d2, double d3, double d4) {
        return (logisticalFunction(d, d2, d3) - d4) / (1.0d - d4);
    }

    public static double logisticalFunction1(double d, double d2, double d3, double d4) {
        return logisticalFunction(d, d2, d3) / d4;
    }

    public static double gaussian(double d, double d2, double d3, double d4) {
        return d2 * Math.exp((-Math.pow(d - d3, 2.0d)) / d4);
    }
}
