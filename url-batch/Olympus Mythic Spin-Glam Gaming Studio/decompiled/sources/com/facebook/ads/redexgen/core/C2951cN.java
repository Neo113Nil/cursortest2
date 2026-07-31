package com.facebook.ads.redexgen.core;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* renamed from: com.facebook.ads.redexgen.X.cN, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2951cN extends AnimatorListenerAdapter {
    public final /* synthetic */ KE A00;
    public final /* synthetic */ boolean A01;

    public C2951cN(KE ke, boolean z) {
        this.A00 = ke;
        this.A01 = z;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        C2967cd c2967cd;
        DZ dz;
        AbstractC3383jd abstractC3383jd;
        DZ dz2;
        DZ dz3;
        M3 m3;
        M3 m32;
        super.onAnimationEnd(animator);
        c2967cd = this.A00.A0K;
        c2967cd.setTranslationY(0.0f);
        this.A00.A0T();
        if (!this.A01) {
            m3 = this.A00.A0I;
            if (m3 != null) {
                m32 = this.A00.A0I;
                m32.destroy();
            }
        }
        dz = this.A00.A0g;
        if (dz != null) {
            abstractC3383jd = this.A00.A0E;
            if (!abstractC3383jd.A1i()) {
                dz3 = this.A00.A0g;
                dz3.setVisibility(this.A01 ? 8 : 0);
            } else {
                dz2 = this.A00.A0g;
                dz2.setVisibility(8);
            }
        }
    }
}
