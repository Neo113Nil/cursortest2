package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cg, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1591cg extends AnimatorListenerAdapter {
    public final /* synthetic */ C1002Ji A00;
    public final /* synthetic */ boolean A01;

    public C1591cg(C1002Ji c1002Ji, boolean z8) {
        this.A00 = c1002Ji;
        this.A01 = z8;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        boolean z8;
        M3 m32;
        M3 m33;
        super.onAnimationEnd(animator);
        C1002Ji c1002Ji = this.A00;
        z8 = this.A00.A0D;
        c1002Ji.A0t(z8, true);
        if (!this.A01) {
            m32 = this.A00.A08;
            if (m32 != null) {
                m33 = this.A00.A08;
                m33.destroy();
            }
        }
    }
}
