package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.widget.RelativeLayout;

/* renamed from: com.facebook.ads.redexgen.X.bQ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2892bQ implements Animator.AnimatorListener {
    public final /* synthetic */ C2893bR A00;

    public C2892bQ(C2893bR c2893bR) {
        this.A00 = c2893bR;
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        RelativeLayout relativeLayout;
        C3218gi c3218gi;
        this.A00.A06();
        relativeLayout = this.A00.A05;
        YB.A0O(relativeLayout, 8);
        c3218gi = this.A00.A07;
        c3218gi.A0F().ADG();
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationRepeat(Animator animator) {
    }

    @Override // android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.A00.A01 = true;
    }
}
