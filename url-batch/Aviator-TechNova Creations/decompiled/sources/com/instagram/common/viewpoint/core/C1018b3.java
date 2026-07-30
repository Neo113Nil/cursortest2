package com.instagram.common.viewpoint.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.b3, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C1018b3 extends AnimatorListenerAdapter {
    public final /* synthetic */ JU A00;
    public final /* synthetic */ boolean A01;

    public C1018b3(JU ju, boolean z) {
        this.A00 = ju;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C1034bJ c1034bJ;
        C0362Cw c0362Cw;
        AbstractC1434hy abstractC1434hy;
        C0362Cw c0362Cw2;
        C0362Cw c0362Cw3;
        LJ lj;
        LJ lj2;
        super.onAnimationEnd(animator);
        c1034bJ = this.A00.A0O;
        c1034bJ.setTranslationY(0.0f);
        this.A00.A0W();
        if (!this.A01) {
            lj = this.A00.A0L;
            if (lj != null) {
                lj2 = this.A00.A0L;
                lj2.destroy();
            }
        }
        c0362Cw = this.A00.A0m;
        if (c0362Cw != null) {
            abstractC1434hy = this.A00.A0H;
            if (!abstractC1434hy.A1a()) {
                c0362Cw3 = this.A00.A0m;
                c0362Cw3.setVisibility(this.A01 ? 8 : 0);
            } else {
                c0362Cw2 = this.A00.A0m;
                c0362Cw2.setVisibility(8);
            }
        }
    }
}
