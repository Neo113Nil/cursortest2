package com.startapp.motiondetector;

/* loaded from: classes3.dex */
public class HighPassFilter implements SignalProcessor, Valuable {
    private final double newPart;
    private final double oldPart;
    private double result;

    public HighPassFilter(double d) {
        double d2 = d + 1.0d;
        this.oldPart = d / d2;
        this.newPart = 1.0d / d2;
    }

    public void add(double d) {
        this.result = (this.oldPart * this.result) + (d * this.newPart);
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
