package com.google.android.gms.ads.mediation.rtb;

import androidx.annotation.RecentlyNonNull;
import c3.a;
import c3.d;
import c3.g;
import c3.h;
import c3.k;
import c3.l;
import c3.m;
import c3.o;
import c3.q;
import c3.r;
import c3.v;
import e3.b;

/* loaded from: classes.dex */
public abstract class RtbAdapter extends a {
    public abstract void collectSignals(@RecentlyNonNull e3.a aVar, @RecentlyNonNull b bVar);

    public void loadRtbBannerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<g, Object> dVar) {
        loadBannerAd(hVar, dVar);
    }

    public void loadRtbInterscrollerAd(@RecentlyNonNull h hVar, @RecentlyNonNull d<k, Object> dVar) {
        dVar.a(new r2.a(7, getClass().getSimpleName().concat(" does not support interscroller ads."), "com.google.android.gms.ads"));
    }

    public void loadRtbInterstitialAd(@RecentlyNonNull m mVar, @RecentlyNonNull d<l, Object> dVar) {
        loadInterstitialAd(mVar, dVar);
    }

    public void loadRtbNativeAd(@RecentlyNonNull o oVar, @RecentlyNonNull d<v, Object> dVar) {
        loadNativeAd(oVar, dVar);
    }

    public void loadRtbRewardedAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        loadRewardedAd(rVar, dVar);
    }

    public void loadRtbRewardedInterstitialAd(@RecentlyNonNull r rVar, @RecentlyNonNull d<q, Object> dVar) {
        loadRewardedInterstitialAd(rVar, dVar);
    }
}
