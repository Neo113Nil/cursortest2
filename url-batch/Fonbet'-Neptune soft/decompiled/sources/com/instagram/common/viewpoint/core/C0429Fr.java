package com.instagram.common.viewpoint.core;

import android.view.animation.AccelerateInterpolator;
import android.view.animation.AlphaAnimation;

/* renamed from: com.facebook.ads.redexgen.X.Fr, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0429Fr extends AbstractRunnableC0840Vt {
    public final /* synthetic */ InterfaceC1103cW A00;
    public final /* synthetic */ C1104cX A01;

    public C0429Fr(C1104cX c1104cX, InterfaceC1103cW interfaceC1103cW) {
        this.A01 = c1104cX;
        this.A00 = interfaceC1103cW;
    }

    @Override // com.instagram.common.viewpoint.core.AbstractRunnableC0840Vt
    public final void A07() {
        AlphaAnimation alphaAnimation = new AlphaAnimation(1.0f, 0.0f);
        alphaAnimation.setDuration(300L);
        alphaAnimation.setInterpolator(new AccelerateInterpolator());
        alphaAnimation.setAnimationListener(new C0430Fs(this));
        this.A01.startAnimation(alphaAnimation);
    }
}
