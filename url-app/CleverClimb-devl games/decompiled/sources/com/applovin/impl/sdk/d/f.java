package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.nativeAds.AppLovinNativeAd;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import java.util.List;

/* loaded from: classes.dex */
abstract class f extends a {

    /* renamed from: a, reason: collision with root package name */
    protected final AppLovinNativeAdPrecacheListener f3090a;

    /* renamed from: c, reason: collision with root package name */
    private final List<NativeAdImpl> f3091c;

    /* renamed from: d, reason: collision with root package name */
    private final AppLovinNativeAdLoadListener f3092d;
    private int e;

    f(String str, List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super(str, jVar);
        this.f3091c = list;
        this.f3092d = appLovinNativeAdLoadListener;
        this.f3090a = null;
    }

    f(String str, List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        super(str, jVar);
        if (list == null) {
            throw new IllegalArgumentException("Native ads cannot be null");
        }
        this.f3091c = list;
        this.f3092d = null;
        this.f3090a = appLovinNativeAdPrecacheListener;
    }

    private void a(int i) {
        if (this.f3092d != null) {
            this.f3092d.onNativeAdsFailedToLoad(i);
        }
    }

    private void a(List<AppLovinNativeAd> list) {
        if (this.f3092d != null) {
            this.f3092d.onNativeAdsLoaded(list);
        }
    }

    protected String a(String str, com.applovin.impl.sdk.n nVar, List<String> list) {
        if (!com.applovin.impl.sdk.e.i.b(str)) {
            a("Asked to cache file with null/empty URL, nothing to do.");
            return null;
        }
        if (!com.applovin.impl.sdk.e.l.a(str, list)) {
            a("Domain is not whitelisted, skipping precache for URL " + str);
            return null;
        }
        try {
            String a2 = nVar.a(d(), str, null, list, true, true, null);
            if (a2 != null) {
                return a2;
            }
            c("Unable to cache icon resource " + str);
            return null;
        } catch (Exception e) {
            a("Unable to cache icon resource " + str, e);
            return null;
        }
    }

    protected abstract void a(NativeAdImpl nativeAdImpl);

    protected abstract void a(NativeAdImpl nativeAdImpl, int i);

    protected abstract boolean a(NativeAdImpl nativeAdImpl, com.applovin.impl.sdk.n nVar);

    @Override // java.lang.Runnable
    public void run() {
        List<AppLovinNativeAd> list;
        for (NativeAdImpl nativeAdImpl : this.f3091c) {
            a("Beginning resource caching phase...");
            if (a(nativeAdImpl, this.f3073b.N())) {
                this.e++;
                a(nativeAdImpl);
            } else {
                d("Unable to cache resources");
            }
        }
        try {
            if (this.e == this.f3091c.size()) {
                list = this.f3091c;
            } else {
                if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.dy)).booleanValue()) {
                    d("Mismatch between successful populations and requested size");
                    a(-6);
                    return;
                }
                list = this.f3091c;
            }
            a(list);
        } catch (Throwable th) {
            b().u().c(c(), "Encountered exception while notifying publisher code", th);
        }
    }
}
