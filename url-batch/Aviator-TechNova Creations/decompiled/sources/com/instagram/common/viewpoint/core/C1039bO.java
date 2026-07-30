package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.bO, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1039bO extends AnimatorListenerAdapter {
    public final /* synthetic */ C0513Is A00;
    public final /* synthetic */ boolean A01;

    public C1039bO(C0513Is c0513Is, boolean z) {
        this.A00 = c0513Is;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z;
        LJ lj;
        LJ lj2;
        super.onAnimationEnd(animator);
        C0513Is c0513Is = this.A00;
        z = this.A00.A0D;
        c0513Is.A0q(z, true);
        if (!this.A01) {
            lj = this.A00.A08;
            if (lj != null) {
                lj2 = this.A00.A08;
                lj2.destroy();
            }
        }
    }
}
