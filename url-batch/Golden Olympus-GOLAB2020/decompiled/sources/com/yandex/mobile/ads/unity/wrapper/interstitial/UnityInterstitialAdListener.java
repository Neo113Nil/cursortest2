package com.yandex.mobile.ads.unity.wrapper.interstitial;

/* loaded from: classes3.dex */
public interface UnityInterstitialAdListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(String str);

    void onAdImpression(String str);

    void onAdShown();
}
