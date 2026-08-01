package com.onesignal.inAppMessages.internal.display.impl;

import android.view.animation.Interpolator;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class l implements Interpolator {
    private double mAmplitude;
    private double mFrequency;

    public l(double d10, double d11) {
        this.mAmplitude = d10;
        this.mFrequency = d11;
    }

    @Override // android.animation.TimeInterpolator
    public float getInterpolation(float f3) {
        return (float) ((Math.cos(this.mFrequency * f3) * Math.pow(2.718281828459045d, (-f3) / this.mAmplitude) * (-1)) + 1);
    }
}
