package com.github.mikephil.charting.highlight;

/* loaded from: classes3.dex */
public final class j {
    public float from;
    public float to;

    public j(float f8, float f9) {
        this.from = f8;
        this.to = f9;
    }

    public boolean contains(float f8) {
        return f8 > this.from && f8 <= this.to;
    }

    public boolean isLarger(float f8) {
        return f8 > this.to;
    }

    public boolean isSmaller(float f8) {
        return f8 < this.from;
    }
}
