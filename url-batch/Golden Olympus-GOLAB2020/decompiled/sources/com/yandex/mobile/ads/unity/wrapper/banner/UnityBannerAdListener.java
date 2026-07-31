package com.yandex.mobile.ads.unity.wrapper.banner;

/* loaded from: classes3.dex */
public interface UnityBannerAdListener {
    void onAdClicked();

    void onAdFailedToLoad(String str);

    void onAdLoaded();

    void onImpression(String str);

    void onLeftApplication();

    void onReturnedToApplication();
}
