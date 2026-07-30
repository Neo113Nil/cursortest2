package com.google.android.gms.ads.mediation.rtb;

import w2.AbstractC5153a;
import w2.C5158f;
import w2.C5159g;
import w2.InterfaceC5155c;
import w2.j;
import w2.l;
import w2.n;
import y2.C5249a;
import y2.InterfaceC5250b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends AbstractC5153a {
    public abstract void collectSignals(C5249a c5249a, InterfaceC5250b interfaceC5250b);

    public void loadRtbAppOpenAd(C5158f c5158f, InterfaceC5155c interfaceC5155c) {
        loadAppOpenAd(c5158f, interfaceC5155c);
    }

    public void loadRtbBannerAd(C5159g c5159g, InterfaceC5155c interfaceC5155c) {
        loadBannerAd(c5159g, interfaceC5155c);
    }

    public void loadRtbInterstitialAd(j jVar, InterfaceC5155c interfaceC5155c) {
        loadInterstitialAd(jVar, interfaceC5155c);
    }

    @Deprecated
    public void loadRtbNativeAd(l lVar, InterfaceC5155c interfaceC5155c) {
        loadNativeAd(lVar, interfaceC5155c);
    }

    public void loadRtbNativeAdMapper(l lVar, InterfaceC5155c interfaceC5155c) {
        loadNativeAdMapper(lVar, interfaceC5155c);
    }

    public void loadRtbRewardedAd(n nVar, InterfaceC5155c interfaceC5155c) {
        loadRewardedAd(nVar, interfaceC5155c);
    }

    public void loadRtbRewardedInterstitialAd(n nVar, InterfaceC5155c interfaceC5155c) {
        loadRewardedInterstitialAd(nVar, interfaceC5155c);
    }
}
