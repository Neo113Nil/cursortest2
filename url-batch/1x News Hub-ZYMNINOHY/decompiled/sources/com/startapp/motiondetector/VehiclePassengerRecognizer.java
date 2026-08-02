package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class VehiclePassengerRecognizer implements SignalProcessor, Valuable {
    private static final double alphaLa = 0.0d;
    private static final double alphaVa = 0.0d;
    private static final double alphaVf = 0.0d;
    private static final double weightLa = 100.0d;
    private static final double weightSum = 270.0d;
    private static final double weightVa = 70.0d;
    private static final double weightVf = 100.0d;
    private double la;
    private double probability;
    private double va;
    private double vf;

    public static double laFunciton(double d3) {
        if (d3 < 0.0d) {
            return 0.0d;
        }
        if (d3 < 0.5d) {
            return Math.pow(d3 * 2.0d, 4.0d);
        }
        if (d3 > 5.0d) {
            return Math.exp((5.0d - d3) * 4.0d);
        }
        return 1.0d;
    }

    public static double vaFunciton(double d3) {
        if (d3 < 0.0d) {
            return 0.0d;
        }
        if (d3 < 0.5d) {
            return Math.pow(d3 * 2.0d, 4.0d);
        }
        if (d3 > 2.0d) {
            return Math.exp((2.0d - d3) * 6.0d);
        }
        return 1.0d;
    }

    public static double vfFunction(double d3) {
        return Math.min(Utils.gaussian(d3, 2.0d, 7.0d, 1.0d), 1.0d);
    }

    public void add(double d3, double d4, double d5) {
        this.vf = (vfFunction(d3) * 1.0d) + (this.vf * 0.0d);
        this.va = (vaFunciton(d4) * 1.0d) + (this.va * 0.0d);
        double laFunciton = (laFunciton(d5) * 1.0d) + (this.la * 0.0d);
        this.la = laFunciton;
        this.probability = ((laFunciton * 100.0d) / weightSum) + ((this.va * weightVa) / weightSum) + ((this.vf * 100.0d) / weightSum);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.probability;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.vf = 0.0d;
        this.va = 0.0d;
        this.la = 0.0d;
        this.probability = 0.0d;
    }
}
