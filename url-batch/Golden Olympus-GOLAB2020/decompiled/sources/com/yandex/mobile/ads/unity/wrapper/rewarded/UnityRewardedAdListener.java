package com.yandex.mobile.ads.unity.wrapper.rewarded;

/* loaded from: classes3.dex */
public interface UnityRewardedAdListener {
    void onAdClicked();

    void onAdDismissed();

    void onAdFailedToShow(String str);

    void onAdImpression(String str);

    void onAdShown();

    void onRewarded(int i4, String str);
}
