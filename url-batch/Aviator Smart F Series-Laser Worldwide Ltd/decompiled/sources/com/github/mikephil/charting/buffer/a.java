package com.github.mikephil.charting.buffer;

/* loaded from: classes3.dex */
public abstract class a {
    public final float[] buffer;
    protected float phaseX = 1.0f;
    protected float phaseY = 1.0f;
    protected int mFrom = 0;
    protected int mTo = 0;
    protected int index = 0;

    public a(int i8) {
        this.buffer = new float[i8];
    }

    public abstract void feed(Object obj);

    public void limitFrom(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.mFrom = i8;
    }

    public void limitTo(int i8) {
        if (i8 < 0) {
            i8 = 0;
        }
        this.mTo = i8;
    }

    public void reset() {
        this.index = 0;
    }

    public void setPhases(float f8, float f9) {
        this.phaseX = f8;
        this.phaseY = f9;
    }

    public int size() {
        return this.buffer.length;
    }
}
