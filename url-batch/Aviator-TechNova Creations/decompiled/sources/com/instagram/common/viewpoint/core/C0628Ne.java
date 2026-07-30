package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.RewardedVideoAdListener;
import com.facebook.ads.S2SRewardedVideoAdExtendedListener;

/* renamed from: com.facebook.ads.redexgen.X.Ne, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0628Ne implements RewardedVideoAdListener {
    public final /* synthetic */ C1379gy A00;

    public C0628Ne(C1379gy c1379gy) {
        this.A00 = c1379gy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        c1367gm = this.A00.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1367gm.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        AbstractC0612Mo abstractC0612Mo;
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        C1367gm c1367gm;
        this.A00.A00.A03 = null;
        abstractC0612Mo = this.A00.A00.A04;
        ((AbstractC1434hy) abstractC0612Mo).A2A(false);
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        c1367gm = this.A00.A00.A09;
        s2SRewardedVideoAdExtendedListener.onAdLoaded(c1367gm.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoClosed() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoClosed();
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public final void onRewardedVideoCompleted() {
        S2SRewardedVideoAdExtendedListener s2SRewardedVideoAdExtendedListener;
        s2SRewardedVideoAdExtendedListener = this.A00.A00.A08;
        s2SRewardedVideoAdExtendedListener.onRewardedVideoCompleted();
    }
}
