package com.yandex.mobile.ads.unity.wrapper.appopenad;

/* loaded from: classes3.dex */
public interface UnityAppOpenAdListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(String str);

    void onAdImpression(String str);

    void onAdShown();
}
