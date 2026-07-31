package com.facebook.ads.redexgen.core;

import android.animation.Animator;

/* renamed from: com.facebook.ads.redexgen.X.bP, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2891bP implements Animator.AnimatorListener {
    public final /* synthetic */ C2893bR A00;

    public C2891bP(C2893bR c2893bR) {
        this.A00 = c2893bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C3218gi c3218gi;
        this.A00.A06();
        this.A00.A02 = true;
        c3218gi = this.A00.A07;
        c3218gi.A0F().ADF();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
    }
}
