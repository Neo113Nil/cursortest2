package com.startapp.motiondetector;

/* loaded from: classes.dex */
public class HighPassFilter3D implements SignalProcessor, Valuable {
    private double magnitude;

    /* renamed from: x, reason: collision with root package name */
    private final HighPassFilter f6059x;

    /* renamed from: y, reason: collision with root package name */
    private final HighPassFilter f6060y;
    private final HighPassFilter z;

    public HighPassFilter3D(HighPassFilter highPassFilter, HighPassFilter highPassFilter2, HighPassFilter highPassFilter3) {
        this.f6059x = highPassFilter;
        this.f6060y = highPassFilter2;
        this.z = highPassFilter3;
    }

    public void add(double d4, double d5, double d6) {
        this.f6059x.add(d4);
        this.f6060y.add(d5);
        this.z.add(d6);
        this.magnitude = Math.sqrt((this.z.getValue() * this.z.getValue()) + (this.f6060y.getValue() * this.f6060y.getValue()) + (this.f6059x.getValue() * this.f6059x.getValue()));
    }

    @Override // com.startapp.motiondetector.Valuable
    public double getValue() {
        return this.magnitude;
    }

    public HighPassFilter getX() {
        return this.f6059x;
    }

    public HighPassFilter getY() {
        return this.f6060y;
    }

    public HighPassFilter getZ() {
        return this.z;
    }

    @Override // com.startapp.motiondetector.SignalProcessor
    public void reset() {
        this.f6059x.reset();
        this.f6060y.reset();
        this.z.reset();
        this.magnitude = 0.0d;
    }
}
