package com.facebook.ads.redexgen.core;

import android.animation.ValueAnimator;

/* renamed from: com.facebook.ads.redexgen.X.dd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C3029dd implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ AnonymousClass55 A00;

    public C3029dd(AnonymousClass55 anonymousClass55) {
        this.A00 = anonymousClass55;
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
