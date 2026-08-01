package com.facebook.ads.redexgen.X;

import android.animation.ValueAnimator;
import android.view.View;

/* loaded from: assets/audience_network.dex */
public class OB implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ C0826Sl A00;

    public OB(C0826Sl c0826Sl) {
        this.A00 = c0826Sl;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        View view;
        View view2;
        Integer num = (Integer) valueAnimator.getAnimatedValue();
        view = this.A00.A0A;
        view.getLayoutParams().height = num.intValue();
        view2 = this.A00.A0A;
        view2.requestLayout();
    }
}
