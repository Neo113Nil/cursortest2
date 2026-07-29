package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;

/* loaded from: classes.dex */
public class g extends f {
    public g(List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super("TaskCacheNativeAdVideos", list, jVar, appLovinNativeAdLoadListener);
    }

    public g(List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        super("TaskCacheNativeAdVideos", list, jVar, appLovinNativeAdPrecacheListener);
    }

    private boolean b(NativeAdImpl nativeAdImpl) {
        c("Unable to cache video resource " + nativeAdImpl.getSourceVideoUrl());
        a(nativeAdImpl, !com.applovin.impl.sdk.e.e.a(d(), this.f3073b) ? AppLovinErrorCodes.NO_NETWORK : AppLovinErrorCodes.UNABLE_TO_PRECACHE_VIDEO_RESOURCES);
        return false;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.k;
    }

    @Override // com.applovin.impl.sdk.d.f
    protected void a(NativeAdImpl nativeAdImpl) {
        if (this.f3090a != null) {
            this.f3090a.onNativeAdVideoPreceached(nativeAdImpl);
        }
    }

    @Override // com.applovin.impl.sdk.d.f
    protected void a(NativeAdImpl nativeAdImpl, int i) {
        if (this.f3090a != null) {
            this.f3090a.onNativeAdVideoPrecachingFailed(nativeAdImpl, i);
        }
    }

    @Override // com.applovin.impl.sdk.d.f
    protected boolean a(NativeAdImpl nativeAdImpl, com.applovin.impl.sdk.n nVar) {
        if (!com.applovin.impl.sdk.e.i.b(nativeAdImpl.getSourceVideoUrl())) {
            return true;
        }
        a("Beginning native ad video caching" + nativeAdImpl.getAdId());
        if (((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.bs)).booleanValue()) {
            String a2 = a(nativeAdImpl.getSourceVideoUrl(), nVar, nativeAdImpl.getResourcePrefixes());
            if (a2 == null) {
                return b(nativeAdImpl);
            }
            nativeAdImpl.setVideoUrl(a2);
        } else {
            a("Resource caching is disabled, skipping...");
        }
        return true;
    }

    @Override // com.applovin.impl.sdk.d.f, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
