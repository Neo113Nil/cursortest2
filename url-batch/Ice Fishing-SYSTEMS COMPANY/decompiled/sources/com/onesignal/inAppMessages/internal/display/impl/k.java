package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes2.dex */
public final class k implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public k(double d2, double d3) {
        this.mAmplitude = d2;
        this.mFrequency = d3;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f6) {
        return (float) ((Math.cos(this.mFrequency * f6) * Math.pow(2.718281828459045d, (-f6) / this.mAmplitude) * (-1)) + 1);
    }
}
