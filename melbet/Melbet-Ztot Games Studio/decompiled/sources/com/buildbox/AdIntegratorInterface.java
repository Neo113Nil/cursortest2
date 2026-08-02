package com.buildbox;

import android.app.Activity;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public interface AdIntegratorInterface extends Integrator {
    void bannerFailed();

    int bannerLoadState();

    void bannerLoaded();

    void cleanup();

    void clearBannerLoadStateErrors();

    void clearInterstitialLoadStateErrors();

    void clearRewardedVideoLoadStateErrors();

    void hideBanner();

    void initAds(HashMap<String, String> hashMap, WeakReference<Activity> weakReference, AdIntegratorManagerInterface adIntegratorManagerInterface);

    void initBanner();

    void initInterstitial();

    void initRewardedVideo();

    void interstitialClosed();

    void interstitialFailed();

    int interstitialLoadState();

    void interstitialLoaded();

    boolean isBannerVisible();

    boolean isRewardedVideoAvailable();

    void networkFailed();

    void networkLoaded();

    @Override // com.buildbox.Integrator
    void onActivityCreated(Activity activity);

    @Override // com.buildbox.Integrator
    void onActivityDestroyed(Activity activity);

    @Override // com.buildbox.Integrator
    void onActivityPaused(Activity activity);

    @Override // com.buildbox.Integrator
    void onActivityResumed(Activity activity);

    @Override // com.buildbox.Integrator
    void onActivityStarted(Activity activity);

    @Override // com.buildbox.Integrator
    void onActivityStopped(Activity activity);

    void rewardedVideoDidEnd(boolean z);

    void rewardedVideoDidReward(boolean z);

    void rewardedVideoFailed();

    int rewardedVideoLoadState();

    void rewardedVideoLoaded();

    boolean sdkIsReady();

    boolean sdkNeedsInit();

    void setTargetsChildren(boolean z);

    @Override // com.buildbox.Integrator
    void setUserConsent(boolean z);

    boolean showBanner();

    boolean showInterstitial();

    boolean showRewardedVideo();
}
