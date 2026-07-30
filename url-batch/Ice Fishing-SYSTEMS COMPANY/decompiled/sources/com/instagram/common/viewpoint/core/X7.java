package com.instagram.common.viewpoint.core;

import android.view.animation.Interpolator;

/* loaded from: assets/audience_network/classes2.dex */
public final class X7 implements Interpolator {
    public final float A00;

    public X7(float f6) {
        this.A00 = f6;
    }

    @Override // android.animation.TimeInterpolator
    public final float getInterpolation(float f6) {
        return (float) Math.pow(f6, this.A00);
    }
}
