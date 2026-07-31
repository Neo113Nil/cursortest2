package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.LayoutTransition;

/* renamed from: com.facebook.ads.redexgen.X.bL, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2887bL extends AnimatorListenerAdapter {
    public final /* synthetic */ RunnableC2888bM A00;

    public C2887bL(RunnableC2888bM runnableC2888bM) {
        this.A00 = runnableC2888bM;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        LayoutTransition layoutTransition = new LayoutTransition();
        layoutTransition.setDuration(250L);
        layoutTransition.setDuration(3, 0L);
        layoutTransition.addTransitionListener(new C2886bK(this));
        this.A00.A00.A0M.setLayoutTransition(layoutTransition);
        ((AbstractC2881bF) this.A00.A00).A09.setVisibility(8);
        this.A00.A00.A0Q.setVisibility(8);
        this.A00.A00.A0P.setVisibility(8);
    }
}
