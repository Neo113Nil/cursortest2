package com.startapp.motiondetector;

/* loaded from: classes3.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;
    private final HighPassFilter x;
    private final HighPassFilter y;
    private final HighPassFilter z;

    public HighPassFilter getX() {
        return this.x;
    }

    public HighPassFilter getY() {
        return this.y;
    }

    public HighPassFilter getZ() {
        return this.z;
    }

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.x = highPassFilter;
        this.y = highPassFilter2;
        this.z = highPassFilter3;
    }

    public void add(double d, double d2, double d3) {
        this.x.add(d);
        this.y.add(d2);
        this.z.add(d3);
        this.magnitude = Math.sqrt((this.x.getValue() * this.x.getValue()) + (this.y.getValue() * this.y.getValue()) + (this.z.getValue() * this.z.getValue()));
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.x.reset();
        this.y.reset();
        this.z.reset();
        this.magnitude = 0.0d;
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }
}
