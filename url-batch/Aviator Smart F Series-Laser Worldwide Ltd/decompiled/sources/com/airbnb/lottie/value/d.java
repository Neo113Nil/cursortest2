package com.airbnb.lottie.value;

/* loaded from: classes.dex */
public class d {
    private float scaleX;
    private float scaleY;

    public d(float f8, float f9) {
        this.scaleX = f8;
        this.scaleY = f9;
    }

    public boolean equals(float f8, float f9) {
        return this.scaleX == f8 && this.scaleY == f9;
    }

    public float getScaleX() {
        return this.scaleX;
    }

    public float getScaleY() {
        return this.scaleY;
    }

    public void set(float f8, float f9) {
        this.scaleX = f8;
        this.scaleY = f9;
    }

    public String toString() {
        return getScaleX() + "x" + getScaleY();
    }

    public d() {
        this(1.0f, 1.0f);
    }
}
