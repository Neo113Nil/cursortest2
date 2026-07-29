package com.ironsource.sdk.c;

import com.ironsource.sdk.data.e;

/* compiled from: Constants.java */
/* loaded from: classes2.dex */
public class a {

    /* compiled from: Constants.java */
    /* renamed from: com.ironsource.sdk.c.a$a, reason: collision with other inner class name */
    public static class C0375a {

        /* renamed from: a, reason: collision with root package name */
        public String f7007a;

        /* renamed from: b, reason: collision with root package name */
        public String f7008b;

        /* renamed from: c, reason: collision with root package name */
        public String f7009c;

        public static C0375a a(e.d dVar) {
            C0375a c0375a = new C0375a();
            if (dVar == e.d.RewardedVideo) {
                c0375a.f7007a = "initRewardedVideo";
                c0375a.f7008b = "onInitRewardedVideoSuccess";
                c0375a.f7009c = "onInitRewardedVideoFail";
            } else if (dVar == e.d.Interstitial) {
                c0375a.f7007a = "initInterstitial";
                c0375a.f7008b = "onInitInterstitialSuccess";
                c0375a.f7009c = "onInitInterstitialFail";
            } else if (dVar == e.d.OfferWall) {
                c0375a.f7007a = "initOfferWall";
                c0375a.f7008b = "onInitOfferWallSuccess";
                c0375a.f7009c = "onInitOfferWallFail";
            }
            return c0375a;
        }

        public static C0375a b(e.d dVar) {
            C0375a c0375a = new C0375a();
            if (dVar == e.d.RewardedVideo) {
                c0375a.f7007a = "showRewardedVideo";
                c0375a.f7008b = "onShowRewardedVideoSuccess";
                c0375a.f7009c = "onShowRewardedVideoFail";
            } else if (dVar == e.d.Interstitial) {
                c0375a.f7007a = "showInterstitial";
                c0375a.f7008b = "onShowInterstitialSuccess";
                c0375a.f7009c = "onShowInterstitialFail";
            } else if (dVar == e.d.OfferWall) {
                c0375a.f7007a = "showOfferWall";
                c0375a.f7008b = "onShowOfferWallSuccess";
                c0375a.f7009c = "onInitOfferWallFail";
            }
            return c0375a;
        }
    }
}
