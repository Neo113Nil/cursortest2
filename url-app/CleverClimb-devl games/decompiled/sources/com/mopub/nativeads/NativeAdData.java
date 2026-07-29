package com.mopub.nativeads;

/* loaded from: classes2.dex */
class NativeAdData {
    private final MoPubAdRenderer adRenderer;
    private final NativeAd adResponse;
    private final String adUnitId;

    NativeAdData(String str, MoPubAdRenderer moPubAdRenderer, NativeAd nativeAd) {
        this.adUnitId = str;
        this.adRenderer = moPubAdRenderer;
        this.adResponse = nativeAd;
    }

    String getAdUnitId() {
        return this.adUnitId;
    }

    MoPubAdRenderer getAdRenderer() {
        return this.adRenderer;
    }

    NativeAd getAd() {
        return this.adResponse;
    }
}
