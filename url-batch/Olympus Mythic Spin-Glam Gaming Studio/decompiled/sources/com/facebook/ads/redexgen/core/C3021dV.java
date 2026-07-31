package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dV, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3021dV implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C5F A00;

    public C3021dV(C5F c5f) {
        this.A00 = c5f;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        C2255Ek c2255Ek;
        C2255Ek c2255Ek2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        c2255Ek = this.A00.A0b;
        c2255Ek.getLayoutParams().height = num.intValue();
        c2255Ek2 = this.A00.A0b;
        c2255Ek2.requestLayout();
    }
}
