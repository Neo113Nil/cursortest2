package com.buildbox.adapter.admob;

import android.app.Activity;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.Log;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.buildbox.AdIntegratorInterface;
import com.buildbox.AdIntegratorManagerInterface;
import com.buildbox.AdLoadState;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdError;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.OnUserEarnedRewardListener;
import com.google.android.gms.ads.RequestConfiguration;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;
import com.google.android.gms.ads.rewarded.RewardItem;
import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;
import java.lang.ref.WeakReference;
import java.util.HashMap;

/* loaded from: classes.dex */
public class AdIntegrator implements AdIntegratorInterface {
    private static final String TAG = "AdIntegratorAdMob";
    private static String adNetworkId = "admob";
    private WeakReference<Activity> activity;
    private AdIntegratorManagerInterface adIntegratorManager;
    private AdView banner;
    private RelativeLayout bannerContainer;
    private String bannerID;
    private InterstitialAd interstitial;
    private String interstitialID;
    private boolean isAgeRestricted;
    private RewardedAd rewardedVideo;
    private String rewardedVideoID;
    private HashMap<String, String> storedInitValues;
    private boolean userConsent;
    private AdLoadState bannerLoadState = AdLoadState.NONE;
    private AdLoadState interstitialLoadState = AdLoadState.NONE;
    private AdLoadState rewardedVideoLoadState = AdLoadState.NONE;
    private AdLoadState sdkLoadState = AdLoadState.NONE;

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityStarted(Activity activity) {
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityStopped(Activity activity) {
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void initAds(HashMap<String, String> hashMap, WeakReference<Activity> weakReference, AdIntegratorManagerInterface adIntegratorManagerInterface) {
        if (sdkNeedsInit()) {
            Log.d(TAG, "initAds: " + hashMap + weakReference + this.adIntegratorManager);
            this.storedInitValues = hashMap;
            this.activity = weakReference;
            this.adIntegratorManager = adIntegratorManagerInterface;
            this.bannerID = hashMap.get("Banner ID");
            this.interstitialID = hashMap.get("Interstitial ID");
            String str = hashMap.get("Rewarded Video ID");
            this.rewardedVideoID = str;
            if (this.bannerID == null || this.interstitialID == null || str == null) {
                Log.w(TAG, "Network sdk configuration incomplete");
                if (this.bannerID == null) {
                    Log.w(TAG, "Banner ID not found");
                }
                if (this.interstitialID == null) {
                    Log.w(TAG, "Interstitial ID not found");
                }
                if (this.rewardedVideoID == null) {
                    Log.w(TAG, "Rewarded Video ID not found");
                }
                if (this.bannerID == null && this.interstitialID == null && this.rewardedVideoID == null) {
                    Log.e(TAG, "no zones defined; initialization cannot continue");
                    networkFailed();
                    return;
                }
            }
            this.sdkLoadState = AdLoadState.LOADING;
            MobileAds.initialize(this.activity.get(), new OnInitializationCompleteListener() { // from class: com.buildbox.adapter.admob.AdIntegrator.1
                @Override // com.google.android.gms.ads.initialization.OnInitializationCompleteListener
                public void onInitializationComplete(InitializationStatus initializationStatus) {
                    Log.d(AdIntegrator.TAG, "AdMob SDK Version: " + MobileAds.getVersion());
                    if (AdIntegrator.this.bannerID != null) {
                        AdIntegrator.this.bannerLoadState = AdLoadState.WAITING;
                    }
                    if (AdIntegrator.this.interstitialID != null) {
                        AdIntegrator.this.interstitialLoadState = AdLoadState.WAITING;
                    }
                    if (AdIntegrator.this.rewardedVideoID != null) {
                        AdIntegrator.this.rewardedVideoLoadState = AdLoadState.WAITING;
                    }
                    AdIntegrator.this.sdkLoadState = AdLoadState.LOADED;
                    AdIntegrator.this.networkLoaded();
                }
            });
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void cleanup() {
        Log.d(TAG, "cleanup");
        hideBanner();
        AdView adView = this.banner;
        if (adView != null) {
            RelativeLayout relativeLayout = this.bannerContainer;
            if (relativeLayout != null) {
                relativeLayout.removeView(adView);
            }
            this.banner = null;
        }
        if (this.interstitial != null) {
            this.interstitial = null;
        }
        if (this.rewardedVideo != null) {
            this.rewardedVideo = null;
        }
        this.bannerLoadState = AdLoadState.NONE;
        this.interstitialLoadState = AdLoadState.NONE;
        this.rewardedVideoLoadState = AdLoadState.NONE;
        RelativeLayout relativeLayout2 = this.bannerContainer;
        if (relativeLayout2 != null) {
            ViewGroup viewGroup = (ViewGroup) relativeLayout2.getParent();
            if (viewGroup != null) {
                viewGroup.removeView(this.bannerContainer);
            }
            this.bannerContainer = null;
        }
        this.sdkLoadState = AdLoadState.NONE;
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void setUserConsent(boolean z) {
        this.userConsent = z;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void setTargetsChildren(boolean z) {
        Log.d(TAG, "setTargetsChildren: " + z);
        this.isAgeRestricted = z;
        if (z) {
            MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTagForChildDirectedTreatment(1).build());
        } else {
            MobileAds.setRequestConfiguration(new RequestConfiguration.Builder().setTagForChildDirectedTreatment(0).build());
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void initBanner() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
        } else {
            if (this.bannerID == null) {
                return;
            }
            Log.d(TAG, "initBanner");
            this.bannerLoadState = AdLoadState.LOADED;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addBannerAdView() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return;
        }
        if (this.banner != null) {
            return;
        }
        Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "unable to get activity; cannot add banner view");
            return;
        }
        if (this.bannerContainer == null) {
            Log.d(TAG, "add banner container");
            RelativeLayout relativeLayout = new RelativeLayout(this.activity.get());
            this.bannerContainer = relativeLayout;
            relativeLayout.setBackgroundColor(0);
            ((FrameLayout) this.activity.get().findViewById(android.R.id.content)).addView(this.bannerContainer);
            this.bannerContainer.setVisibility(4);
        }
        AdView adView = new AdView(activity);
        this.banner = adView;
        adView.setAdUnitId(this.bannerID);
        this.banner.setAdSize(getBannerAdSize());
        this.banner.setAdListener(new AdListener() { // from class: com.buildbox.adapter.admob.AdIntegrator.2
            @Override // com.google.android.gms.ads.AdListener
            public void onAdLoaded() {
                Log.d(AdIntegrator.TAG, "Banner - onAdLoaded");
                AdIntegrator.this.bannerLoaded();
                AdIntegrator.this.adIntegratorManager.bannerAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.bannerID, true);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdFailedToLoad(LoadAdError loadAdError) {
                Log.d(AdIntegrator.TAG, "Banner - onAdFailedToLoad: " + loadAdError);
                AdIntegrator.this.bannerContainer.removeView(AdIntegrator.this.banner);
                AdIntegrator.this.banner = null;
                AdIntegrator.this.bannerFailed();
                AdIntegrator.this.adIntegratorManager.bannerAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.bannerID, false);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdImpression() {
                Log.d(AdIntegrator.TAG, "Banner - onAdImpression");
                AdIntegrator.this.adIntegratorManager.bannerImpression(AdIntegrator.adNetworkId);
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdOpened() {
                Log.d(AdIntegrator.TAG, "Banner - onAdOpened");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClicked() {
                Log.d(AdIntegrator.TAG, "Banner - onAdClicked");
            }

            @Override // com.google.android.gms.ads.AdListener
            public void onAdClosed() {
                Log.d(AdIntegrator.TAG, "Banner - onAdClosed");
            }
        });
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-2, -2);
        layoutParams.addRule(12);
        layoutParams.addRule(14, -1);
        this.banner.setLayoutParams(layoutParams);
        this.bannerContainer.addView(this.banner);
        this.banner.setVisibility(4);
    }

    private AdSize getBannerAdSize() {
        Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "unable to get activity; returning default banner size");
            return AdSize.BANNER;
        }
        return AdSize.getCurrentOrientationAnchoredAdaptiveBannerAdSize(activity, (int) (r1.widthPixels / Resources.getSystem().getDisplayMetrics().density));
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean showBanner() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return false;
        }
        Log.d(TAG, "showBanner");
        if (this.bannerLoadState != AdLoadState.LOADED) {
            Log.d(TAG, "no banner ready: LS=" + this.bannerLoadState);
            return false;
        }
        this.activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.adapter.admob.AdIntegrator.3
            @Override // java.lang.Runnable
            public void run() {
                Log.d(AdIntegrator.TAG, "banner will show (ui thread)");
                if (AdIntegrator.this.banner == null || AdIntegrator.this.bannerContainer == null) {
                    AdIntegrator.this.addBannerAdView();
                }
                if (AdIntegrator.this.banner == null || AdIntegrator.this.bannerContainer == null) {
                    Log.e(AdIntegrator.TAG, "unable to create banner ad view");
                    return;
                }
                AdIntegrator.this.bannerContainer.setVisibility(0);
                AdIntegrator.this.banner.setVisibility(0);
                AdIntegrator.this.banner.resume();
                AdIntegrator.this.banner.loadAd(AdIntegrator.this.getAdRequest());
            }
        });
        return true;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void hideBanner() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
        } else {
            Log.d(TAG, "hideBanner");
            this.activity.get().runOnUiThread(new Runnable() { // from class: com.buildbox.adapter.admob.AdIntegrator.4
                @Override // java.lang.Runnable
                public void run() {
                    Log.d(AdIntegrator.TAG, "hideBanner (ui thread)");
                    if (AdIntegrator.this.bannerContainer != null) {
                        AdIntegrator.this.bannerContainer.setVisibility(4);
                    }
                    if (AdIntegrator.this.banner != null) {
                        AdIntegrator.this.banner.setVisibility(4);
                        AdIntegrator.this.banner.pause();
                    }
                }
            });
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean isBannerVisible() {
        AdView adView;
        return sdkIsReady() && (adView = this.banner) != null && adView.getVisibility() == 0;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void initInterstitial() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return;
        }
        if (this.interstitialID == null) {
            return;
        }
        Log.d(TAG, "initInterstitial");
        Activity activity = this.activity.get();
        if (activity == null) {
            Log.w(TAG, "activity not available");
            return;
        }
        if (this.interstitial != null) {
            Log.d(TAG, "Already have a preloaded interstitial, can't load another yet");
            return;
        }
        if (this.interstitialLoadState != AdLoadState.WAITING) {
            Log.d(TAG, "Not preloading an interstitial while in load state " + this.interstitialLoadState);
        } else {
            Log.d(TAG, "loading next interstitial");
            this.interstitialLoadState = AdLoadState.LOADING;
            InterstitialAd.load(activity, this.interstitialID, getAdRequest(), new InterstitialAdLoadCallback() { // from class: com.buildbox.adapter.admob.AdIntegrator.5
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(InterstitialAd interstitialAd) {
                    Log.d(AdIntegrator.TAG, "Interstitial - onAdLoaded");
                    AdIntegrator.this.interstitial = interstitialAd;
                    AdIntegrator.this.interstitial.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.buildbox.adapter.admob.AdIntegrator.5.1
                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdClicked() {
                            Log.d(AdIntegrator.TAG, "Interstitial - onAdClicked");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            Log.d(AdIntegrator.TAG, "Interstitial - onAdFailedToShowFullScreenContent: " + adError);
                            AdIntegrator.this.interstitial = null;
                            AdIntegrator.this.interstitialFailed();
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            Log.d(AdIntegrator.TAG, "Interstitial - onAdShowedFullScreenContent");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            Log.d(AdIntegrator.TAG, "Interstitial - onAdDismissedFullScreenContent");
                            AdIntegrator.this.interstitial = null;
                            AdIntegrator.this.interstitialClosed();
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdImpression() {
                            Log.d(AdIntegrator.TAG, "Interstitial - onAdImpression.");
                            AdIntegrator.this.adIntegratorManager.interstitialImpression(AdIntegrator.adNetworkId);
                        }
                    });
                    AdIntegrator.this.interstitialLoaded();
                    AdIntegrator.this.adIntegratorManager.interstitialAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.interstitialID, true);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Log.d(AdIntegrator.TAG, "Interstitial - onAdFailedToLoad: " + loadAdError);
                    AdIntegrator.this.interstitial = null;
                    AdIntegrator.this.interstitialFailed();
                    AdIntegrator.this.adIntegratorManager.interstitialAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.interstitialID, false);
                }
            });
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean showInterstitial() {
        Log.d(TAG, "showInterstitial");
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return false;
        }
        if (this.interstitial == null) {
            Log.w(TAG, "No interstitial ready to show");
            return false;
        }
        if (this.interstitialLoadState != AdLoadState.LOADED) {
            Log.w(TAG, "interstitial is loaded but loadstate is not ready: " + this.interstitialLoadState);
            return false;
        }
        final Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "Unable to get activity");
            return false;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.buildbox.adapter.admob.AdIntegrator.6
            @Override // java.lang.Runnable
            public void run() {
                Log.d(AdIntegrator.TAG, "interstitial will show (ui thread)");
                AdIntegrator.this.interstitial.show(activity);
            }
        });
        return true;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void initRewardedVideo() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return;
        }
        if (this.rewardedVideoID == null) {
            return;
        }
        Log.d(TAG, "initRewardedVideo");
        Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "Unable to get activity");
            return;
        }
        if (this.rewardedVideo != null) {
            Log.d(TAG, "Already have a rewarded video, can't load another yet");
            return;
        }
        if (this.rewardedVideoLoadState != AdLoadState.WAITING) {
            Log.d(TAG, "Not preloading a rewarded video while in load state " + this.rewardedVideoLoadState);
        } else {
            this.rewardedVideoLoadState = AdLoadState.LOADING;
            RewardedAd.load(activity, this.rewardedVideoID, getAdRequest(), new RewardedAdLoadCallback() { // from class: com.buildbox.adapter.admob.AdIntegrator.7
                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdLoaded(RewardedAd rewardedAd) {
                    Log.d(AdIntegrator.TAG, "Rewarded - onAdLoaded");
                    AdIntegrator.this.rewardedVideo = rewardedAd;
                    AdIntegrator.this.rewardedVideo.setFullScreenContentCallback(new FullScreenContentCallback() { // from class: com.buildbox.adapter.admob.AdIntegrator.7.1
                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdClicked() {
                            Log.d(AdIntegrator.TAG, "Rewarded - onAdClicked");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdFailedToShowFullScreenContent(AdError adError) {
                            Log.d(AdIntegrator.TAG, "Rewarded - onAdFailedToShowFullScreenContent: " + adError);
                            AdIntegrator.this.rewardedVideo = null;
                            AdIntegrator.this.rewardedVideoFailed();
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdShowedFullScreenContent() {
                            Log.d(AdIntegrator.TAG, "Rewarded - onAdShowedFullScreenContent");
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdDismissedFullScreenContent() {
                            Log.d(AdIntegrator.TAG, "Rewarded - onAdDismissedFullScreenContent");
                            AdIntegrator.this.rewardedVideo = null;
                            AdIntegrator.this.rewardedVideoDidEnd(true);
                        }

                        @Override // com.google.android.gms.ads.FullScreenContentCallback
                        public void onAdImpression() {
                            Log.d(AdIntegrator.TAG, "Reward - onAdImpression");
                            AdIntegrator.this.adIntegratorManager.rewardedVideoImpression(AdIntegrator.adNetworkId);
                        }
                    });
                    AdIntegrator.this.rewardedVideoLoaded();
                    AdIntegrator.this.adIntegratorManager.rewardedVideoAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.rewardedVideoID, true);
                }

                @Override // com.google.android.gms.ads.AdLoadCallback
                public void onAdFailedToLoad(LoadAdError loadAdError) {
                    Log.d(AdIntegrator.TAG, "Rewarded - onAdFailedToLoad: " + loadAdError);
                    AdIntegrator.this.rewardedVideo = null;
                    AdIntegrator.this.rewardedVideoFailed();
                    AdIntegrator.this.adIntegratorManager.rewardedVideoAdZoneAttempt(AdIntegrator.adNetworkId, AdIntegrator.this.rewardedVideoID, false);
                }
            });
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean showRewardedVideo() {
        if (!sdkIsReady()) {
            Log.d(TAG, "SDK not ready");
            return false;
        }
        Log.d(TAG, "showRewardedVideo");
        final Activity activity = this.activity.get();
        if (activity == null) {
            Log.e(TAG, "could not get activity");
            return false;
        }
        if (this.rewardedVideo == null) {
            Log.w(TAG, "no rewarded video available");
            return false;
        }
        activity.runOnUiThread(new Runnable() { // from class: com.buildbox.adapter.admob.AdIntegrator.8
            @Override // java.lang.Runnable
            public void run() {
                Log.d(AdIntegrator.TAG, "rewarded video will show (ui thread)");
                AdIntegrator.this.rewardedVideo.show(activity, new OnUserEarnedRewardListener() { // from class: com.buildbox.adapter.admob.AdIntegrator.8.1
                    @Override // com.google.android.gms.ads.OnUserEarnedRewardListener
                    public void onUserEarnedReward(RewardItem rewardItem) {
                        Log.d(AdIntegrator.TAG, "Rewarded - onUserEarnedReward");
                        AdIntegrator.this.rewardedVideoDidReward(true);
                    }
                });
            }
        });
        return true;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean isRewardedVideoAvailable() {
        return sdkIsReady() && this.rewardedVideo != null && this.rewardedVideoLoadState == AdLoadState.LOADED;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public AdRequest getAdRequest() {
        if (this.userConsent) {
            return new AdRequest.Builder().build();
        }
        Bundle bundle = new Bundle();
        if (!this.userConsent || this.isAgeRestricted) {
            Log.d(TAG, "admob ad request is non-personalized due to COPPA or GDPR");
            bundle.putString("PPT", "1");
        }
        return new AdRequest.Builder().addNetworkExtrasBundle(AdMobAdapter.class, bundle).build();
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void interstitialClosed() {
        Log.d(TAG, "interstitial closed");
        this.interstitialLoadState = AdLoadState.WAITING;
        initInterstitial();
        this.adIntegratorManager.interstitialClosed(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void rewardedVideoDidReward(boolean z) {
        Log.d(TAG, "rewarded video did reward " + z);
        this.adIntegratorManager.rewardedVideoDidReward(adNetworkId, z);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void rewardedVideoDidEnd(boolean z) {
        Log.d(TAG, "rewarded video did end " + z);
        this.rewardedVideoLoadState = AdLoadState.WAITING;
        initRewardedVideo();
        this.adIntegratorManager.rewardedVideoDidEnd(adNetworkId, z);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void networkLoaded() {
        Log.d(TAG, "Network loaded");
        this.sdkLoadState = AdLoadState.LOADED;
        this.adIntegratorManager.sdkLoaded(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void bannerLoaded() {
        Log.d(TAG, "banner loaded");
        this.bannerLoadState = AdLoadState.LOADED;
        this.adIntegratorManager.bannerLoaded(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void interstitialLoaded() {
        Log.d(TAG, "interstitial loaded");
        this.interstitialLoadState = AdLoadState.LOADED;
        this.adIntegratorManager.interstitialLoaded(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void rewardedVideoLoaded() {
        Log.d(TAG, "rewarded loaded");
        this.rewardedVideoLoadState = AdLoadState.LOADED;
        this.adIntegratorManager.rewardedVideoLoaded(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void networkFailed() {
        Log.d(TAG, "network failed");
        this.sdkLoadState = AdLoadState.FAILED;
        this.adIntegratorManager.sdkFailed(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void bannerFailed() {
        Log.d(TAG, "banner failed");
        this.bannerLoadState = AdLoadState.FAILED;
        this.adIntegratorManager.bannerFailed(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void interstitialFailed() {
        Log.d(TAG, "interstitial failed");
        this.interstitialLoadState = AdLoadState.FAILED;
        this.adIntegratorManager.interstitialFailed(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void rewardedVideoFailed() {
        Log.d(TAG, "rewarded video failed");
        this.rewardedVideoLoadState = AdLoadState.FAILED;
        this.adIntegratorManager.rewardedVideoFailed(adNetworkId);
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityCreated(Activity activity) {
        Log.d(TAG, "onActivityCreated" + activity);
        if (activity == this.activity.get() || this.storedInitValues == null) {
            return;
        }
        Log.d(TAG, "reinitializing to new activity");
        cleanup();
        WeakReference<Activity> weakReference = new WeakReference<>(activity);
        this.activity = weakReference;
        initAds(this.storedInitValues, weakReference, this.adIntegratorManager);
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityResumed(Activity activity) {
        AdView adView = this.banner;
        if (adView != null) {
            adView.resume();
        }
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityPaused(Activity activity) {
        AdView adView = this.banner;
        if (adView != null) {
            adView.pause();
        }
    }

    @Override // com.buildbox.AdIntegratorInterface, com.buildbox.Integrator
    public void onActivityDestroyed(Activity activity) {
        AdView adView = this.banner;
        if (adView != null) {
            adView.destroy();
            this.banner = null;
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void clearBannerLoadStateErrors() {
        if (this.bannerLoadState == AdLoadState.FAILED) {
            this.bannerLoadState = AdLoadState.LOADED;
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void clearInterstitialLoadStateErrors() {
        if (this.interstitialLoadState == AdLoadState.FAILED) {
            this.interstitialLoadState = AdLoadState.WAITING;
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public void clearRewardedVideoLoadStateErrors() {
        if (this.rewardedVideoLoadState == AdLoadState.FAILED) {
            this.rewardedVideoLoadState = AdLoadState.WAITING;
        }
    }

    @Override // com.buildbox.AdIntegratorInterface
    public int bannerLoadState() {
        return this.bannerLoadState.toInt();
    }

    @Override // com.buildbox.AdIntegratorInterface
    public int interstitialLoadState() {
        return this.interstitialLoadState.toInt();
    }

    @Override // com.buildbox.AdIntegratorInterface
    public int rewardedVideoLoadState() {
        return this.rewardedVideoLoadState.toInt();
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean sdkNeedsInit() {
        return this.sdkLoadState == AdLoadState.NONE || this.sdkLoadState == AdLoadState.WAITING || this.sdkLoadState == AdLoadState.FAILED;
    }

    @Override // com.buildbox.AdIntegratorInterface
    public boolean sdkIsReady() {
        return this.sdkLoadState == AdLoadState.LOADED;
    }
}
