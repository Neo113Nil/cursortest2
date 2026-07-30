package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0435Fr extends AbstractRunnableC0846Vt {
    public final /* synthetic */ InterfaceC1109cW A00;
    public final /* synthetic */ C1110cX A01;

    public C0435Fr(C1110cX c1110cX, InterfaceC1109cW interfaceC1109cW) {
        this.A01 = c1110cX;
        this.A00 = interfaceC1109cW;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0846Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0436Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
