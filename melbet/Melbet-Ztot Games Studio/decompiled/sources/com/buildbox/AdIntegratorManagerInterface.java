package com.buildbox;

/* loaded from: classes.dex */
public interface AdIntegratorManagerInterface {
    void bannerAdZoneAttempt(String str, String str2, boolean z);

    void bannerFailed(String str);

    void bannerImpression(String str);

    void bannerLoaded(String str);

    void interstitialAdZoneAttempt(String str, String str2, boolean z);

    void interstitialClosed(String str);

    void interstitialFailed(String str);

    void interstitialImpression(String str);

    void interstitialLoaded(String str);

    void networkFailed(String str);

    void networkLoaded(String str);

    void rewardedVideoAdZoneAttempt(String str, String str2, boolean z);

    void rewardedVideoDidEnd(String str, boolean z);

    void rewardedVideoDidReward(String str, boolean z);

    void rewardedVideoFailed(String str);

    void rewardedVideoImpression(String str);

    void rewardedVideoLoaded(String str);

    void sdkFailed(String str);

    void sdkLoaded(String str);
}
