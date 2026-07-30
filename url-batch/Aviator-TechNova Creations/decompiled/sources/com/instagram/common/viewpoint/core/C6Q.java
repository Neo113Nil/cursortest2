package com.instagram.common.viewpoint.core;

import android.widget.FrameLayout;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdLayout;

/* renamed from: com.facebook.ads.redexgen.X.6Q, reason: invalid class name */
/* loaded from: assets/audience_network.dex */
public final class C6Q extends C1302fg {
    public InterfaceC1160dM A00;

    /* JADX WARN: Failed to parse debug info
    java.lang.ArrayIndexOutOfBoundsException
     */
    public final void A06(NativeAdLayout nativeAdLayout, C1159dL c1159dL, NativeAd nativeAd, C0819Ur c0819Ur) {
        C0973aK c0973aK = new C0973aK(c1159dL);
        MediaView mediaView = new MediaView(c1159dL);
        AdOptionsView adOptionsView = new AdOptionsView(c1159dL, nativeAd, nativeAdLayout);
        c0819Ur.A09(adOptionsView, 28);
        this.A00 = new EP(c1159dL, nativeAd, c0819Ur, C0702Qc.A0L(nativeAd.getInternalNativeAd()).A18(), c0973aK, mediaView, adOptionsView);
        XP.A0K(nativeAdLayout, c0819Ur.A00());
        nativeAd.registerViewForInteraction(nativeAdLayout, mediaView, c0973aK, this.A00.getViewsForInteraction());
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -1);
        layoutParams.gravity = 17;
        nativeAdLayout.addView(this.A00.getView(), layoutParams);
    }

    @Override // com.instagram.common.viewpoint.core.R8, com.facebook.ads.internal.api.AdComponentViewParentApi
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.A00.unregisterView();
    }
}
