package com.facebook.ads.redexgen.X;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;

/* renamed from: com.facebook.ads.redexgen.X.Pv, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0758Pv extends AnimatorListenerAdapter {
    public final /* synthetic */ C0603Ju A00;

    public C0758Pv(C0603Ju c0603Ju) {
        this.A00 = c0603Ju;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        View view;
        view = this.A00.A00;
        view.setVisibility(8);
    }
}
