package com.instagram.common.viewpoint.core;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.InterstitialAdExtendedListener;
import com.facebook.ads.InterstitialAdListener;

/* renamed from: com.facebook.ads.redexgen.X.Nd, reason: case insensitive filesystem */
/* loaded from: assets/audience_network.dex */
public class C0627Nd implements InterstitialAdListener {
    public final /* synthetic */ AbstractC1434hy A00;
    public final /* synthetic */ C1384h4 A01;

    public C0627Nd(C1384h4 c1384h4, AbstractC1434hy abstractC1434hy) {
        this.A01 = c1384h4;
        this.A00 = abstractC1434hy;
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdClicked(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onAdLoaded(Ad ad) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1376gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1376gv.A6c());
    }

    @Override // com.facebook.ads.AdListener
    public final void onError(Ad ad, AdError adError) {
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        this.A01.A00.A01 = null;
        this.A00.A2A(false);
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1376gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onAdLoaded(c1376gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDismissed(Ad ad) {
        C02246y c02246y;
        InterstitialAdExtendedListener interstitialAdExtendedListener;
        C1376gv c1376gv;
        C02246y c02246y2;
        C02246y c02246y3;
        C02246y c02246y4;
        this.A01.A00.A04 = false;
        c02246y = this.A01.A00.A03;
        if (c02246y != null) {
            c02246y2 = this.A01.A00.A03;
            c02246y2.A0S(new C1386h6(this));
            c02246y3 = this.A01.A00.A03;
            c02246y3.A0N();
            c02246y4 = this.A01.A00.A03;
            c02246y4.A0K();
            this.A01.A00.A03 = null;
        }
        interstitialAdExtendedListener = this.A01.A00.A07;
        c1376gv = this.A01.A00.A08;
        interstitialAdExtendedListener.onInterstitialDismissed(c1376gv.A6c());
    }

    @Override // com.facebook.ads.InterstitialAdListener
    public final void onInterstitialDisplayed(Ad ad) {
    }

    @Override // com.facebook.ads.AdListener
    public final void onLoggingImpression(Ad ad) {
    }
}
