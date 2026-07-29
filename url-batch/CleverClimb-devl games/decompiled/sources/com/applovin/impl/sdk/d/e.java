package com.applovin.impl.sdk.d;

import com.applovin.impl.sdk.ad.NativeAdImpl;
import com.applovin.nativeAds.AppLovinNativeAdLoadListener;
import com.applovin.nativeAds.AppLovinNativeAdPrecacheListener;
import com.applovin.sdk.AppLovinErrorCodes;
import java.util.List;

/* loaded from: classes.dex */
public class e extends f {
    public e(List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdLoadListener appLovinNativeAdLoadListener) {
        super("TaskCacheNativeAdImages", list, jVar, appLovinNativeAdLoadListener);
    }

    public e(List<NativeAdImpl> list, com.applovin.impl.sdk.j jVar, AppLovinNativeAdPrecacheListener appLovinNativeAdPrecacheListener) {
        super("TaskCacheNativeAdImages", list, jVar, appLovinNativeAdPrecacheListener);
    }

    private boolean b(NativeAdImpl nativeAdImpl) {
        c("Unable to cache image resource");
        a(nativeAdImpl, !com.applovin.impl.sdk.e.e.a(d(), this.f3073b) ? AppLovinErrorCodes.NO_NETWORK : AppLovinErrorCodes.UNABLE_TO_PRECACHE_IMAGE_RESOURCES);
        return false;
    }

    @Override // com.applovin.impl.sdk.d.a
    public com.applovin.impl.sdk.c.i a() {
        return com.applovin.impl.sdk.c.i.j;
    }

    @Override // com.applovin.impl.sdk.d.f
    protected void a(NativeAdImpl nativeAdImpl) {
        if (this.f3090a != null) {
            this.f3090a.onNativeAdImagesPrecached(nativeAdImpl);
        }
    }

    @Override // com.applovin.impl.sdk.d.f
    protected void a(NativeAdImpl nativeAdImpl, int i) {
        if (this.f3090a != null) {
            this.f3090a.onNativeAdImagePrecachingFailed(nativeAdImpl, i);
        }
    }

    @Override // com.applovin.impl.sdk.d.f
    protected boolean a(NativeAdImpl nativeAdImpl, com.applovin.impl.sdk.n nVar) {
        a("Beginning native ad image caching for #" + nativeAdImpl.getAdId());
        if (!((Boolean) this.f3073b.a(com.applovin.impl.sdk.b.b.bs)).booleanValue()) {
            a("Resource caching is disabled, skipping...");
            return true;
        }
        String a2 = a(nativeAdImpl.getSourceIconUrl(), nVar, nativeAdImpl.getResourcePrefixes());
        if (a2 == null) {
            return b(nativeAdImpl);
        }
        nativeAdImpl.setIconUrl(a2);
        String a3 = a(nativeAdImpl.getSourceImageUrl(), nVar, nativeAdImpl.getResourcePrefixes());
        if (a3 == null) {
            return b(nativeAdImpl);
        }
        nativeAdImpl.setImageUrl(a3);
        return true;
    }

    @Override // com.applovin.impl.sdk.d.f, java.lang.Runnable
    public /* bridge */ /* synthetic */ void run() {
        super.run();
    }
}
