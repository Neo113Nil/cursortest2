package com.instagram.common.viewpoint.core;

import android.view.animation.Animation;

/* renamed from: com.facebook.ads.redexgen.X.Fs, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0436Fs extends XO {
    public final /* synthetic */ C0435Fr A00;

    public C0436Fs(C0435Fr c0435Fr) {
        this.A00 = c0435Fr;
    }

    @Override // com.instagram.common.viewpoint.core.XO, android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        XP.A0F(this.A00.A01);
        this.A00.A00.ADh();
    }
}
