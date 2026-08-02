package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;

    /* renamed from: x, reason: collision with root package name */
    private final HighPassFilter f2983x;

    /* renamed from: y, reason: collision with root package name */
    private final HighPassFilter f2984y;
    private final HighPassFilter z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.f2983x = highPassFilter;
        this.f2984y = highPassFilter2;
        this.z = highPassFilter3;
    }

    public void add(double d3, double d4, double d5) {
        this.f2983x.add(d3);
        this.f2984y.add(d4);
        this.z.add(d5);
        this.magnitude = Math.sqrt((this.z.getValue() * this.z.getValue()) + (this.f2984y.getValue() * this.f2984y.getValue()) + (this.f2983x.getValue() * this.f2983x.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.f2983x;
    }

    public HighPassFilter getY() {
        return this.f2984y;
    }

    public HighPassFilter getZ() {
        return this.z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f2983x.reset();
        this.f2984y.reset();
        this.z.reset();
        this.magnitude = 0.0d;
    }
}
