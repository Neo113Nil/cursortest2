package com.applovin.impl.sdk;

import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import java.util.LinkedHashSet;
import java.util.List;

/* loaded from: classes.dex */
public class d extends r {
    d(j jVar) {
        super(jVar);
    }

    @Override // com.applovin.impl.sdk.r
    com.applovin.impl.sdk.ad.d a(com.applovin.impl.sdk.ad.j jVar) {
        return ((AppLovinAdBase) jVar).getAdZone();
    }

    @Override // com.applovin.impl.sdk.r
    com.applovin.impl.sdk.d.a a(com.applovin.impl.sdk.ad.d dVar) {
        com.applovin.impl.sdk.d.m mVar = new com.applovin.impl.sdk.d.m(dVar, this, this.f3361a);
        mVar.a(true);
        return mVar;
    }

    public void a() {
        for (com.applovin.impl.sdk.ad.d dVar : com.applovin.impl.sdk.ad.d.b(this.f3361a)) {
            if (!dVar.d()) {
                h(dVar);
            }
        }
    }

    @Override // com.applovin.impl.sdk.m
    public void a(com.applovin.impl.sdk.ad.d dVar, int i) {
        c(dVar, i);
    }

    @Override // com.applovin.impl.sdk.r
    void a(Object obj, com.applovin.impl.sdk.ad.d dVar, int i) {
        if (obj instanceof m) {
            ((m) obj).a(dVar, i);
        }
        if (obj instanceof AppLovinAdLoadListener) {
            ((AppLovinAdLoadListener) obj).failedToReceiveAd(i);
        }
    }

    @Override // com.applovin.impl.sdk.r
    void a(Object obj, com.applovin.impl.sdk.ad.j jVar) {
        ((AppLovinAdLoadListener) obj).adReceived((AppLovinAd) jVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ void a(LinkedHashSet linkedHashSet) {
        super.a((LinkedHashSet<com.applovin.impl.sdk.ad.d>) linkedHashSet);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ boolean a(com.applovin.impl.sdk.ad.d dVar, Object obj) {
        return super.a(dVar, obj);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void adReceived(AppLovinAd appLovinAd) {
        b((com.applovin.impl.sdk.ad.j) appLovinAd);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ void b(com.applovin.impl.sdk.ad.d dVar, int i) {
        super.b(dVar, i);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ boolean b(com.applovin.impl.sdk.ad.d dVar) {
        return super.b(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ com.applovin.impl.sdk.ad.j c(com.applovin.impl.sdk.ad.d dVar) {
        return super.c(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ com.applovin.impl.sdk.ad.j d(com.applovin.impl.sdk.ad.d dVar) {
        return super.d(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ com.applovin.impl.sdk.ad.j e(com.applovin.impl.sdk.ad.d dVar) {
        return super.e(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ void f(com.applovin.impl.sdk.ad.d dVar) {
        super.f(dVar);
    }

    @Override // com.applovin.sdk.AppLovinAdLoadListener
    public void failedToReceiveAd(int i) {
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ boolean g(com.applovin.impl.sdk.ad.d dVar) {
        return super.g(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ void h(com.applovin.impl.sdk.ad.d dVar) {
        super.h(dVar);
    }

    @Override // com.applovin.impl.sdk.r
    public /* bridge */ /* synthetic */ void i(com.applovin.impl.sdk.ad.d dVar) {
        super.i(dVar);
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
    public void onNativeAdsFailedToLoad(int i) {
    }

    @Override // com.applovin.nativeAds.AppLovinNativeAdLoadListener
    public void onNativeAdsLoaded(List<AppLovinNativeAd> list) {
    }
}
