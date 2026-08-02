package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class HighPassFilter implements SignalProcessor, Valuable {
    private final double newPart;
    private final double oldPart;
    private double result;

    public HighPassFilter(double d4) {
        double d5 = d4 + 1.0d;
        this.oldPart = d4 / d5;
        this.newPart = 1.0d / d5;
    }

    public void add(double d4) {
        this.result = (d4 * this.newPart) + (this.oldPart * this.result);
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.result;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.result = 0.0d;
    }
}
