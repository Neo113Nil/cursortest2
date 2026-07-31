package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class l implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public l(double d7, double d8) {
        this.mAmplitude = d7;
        this.mFrequency = d8;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f7) {
        return (float) ((Math.cos(this.mFrequency * f7) * Math.pow(2.718281828459045d, (-f7) / this.mAmplitude) * (-1)) + 1);
    }
}
