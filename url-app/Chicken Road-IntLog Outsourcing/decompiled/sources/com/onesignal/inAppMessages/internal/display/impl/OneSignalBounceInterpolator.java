package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* loaded from: classes.dex */
public final class OneSignalBounceInterpolator implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public OneSignalBounceInterpolator(double d6, double d7) {
        this.mAmplitude = d6;
        this.mFrequency = d7;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        return (float) ((Math.cos(this.mFrequency * f3) * Math.pow(2.718281828459045d, (-f3) / this.mAmplitude) * (-1)) + 1);
    }
}
