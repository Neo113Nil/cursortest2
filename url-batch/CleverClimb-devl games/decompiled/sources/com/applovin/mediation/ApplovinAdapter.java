package com.applovin.mediation;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import com.google.android.gms.ads.AdSize;
import com.google.android.gms.ads.mediation.MediationAdRequest;
import com.google.android.gms.ads.mediation.MediationBannerAdapter;
import com.google.android.gms.ads.mediation.MediationBannerListener;
import com.google.android.gms.ads.mediation.MediationInterstitialAdapter;
import com.google.android.gms.ads.mediation.MediationInterstitialListener;
import com.google.android.gms.ads.mediation.OnContextChangedListener;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes.dex */
public class ApplovinAdapter implements MediationBannerAdapter, MediationInterstitialAdapter, OnContextChangedListener, MediationRewardedVideoAdAdapter {
    private static final int BANNER_HEIGHT_OFFSET_TOLERANCE = 10;
    private static final int BANNER_STANDARD_HEIGHT = 50;
    private static final String DEFAULT_ZONE = "";
    private static final boolean LOGGING_ENABLED = true;
    private AppLovinAdView mAdView;
    private Context mContext;
    private AppLovinIncentivizedInterstitial mIncentivizedInterstitial;
    private final AtomicBoolean mInitialized = new AtomicBoolean();
    private MediationInterstitialListener mMediationInterstitialListener;
    private MediationRewardedVideoAdListener mMediationRewardedVideoAdListener;
    private Bundle mNetworkExtras;
    private String mPlacement;
    private AppLovinSdk mSdk;
    private String mZoneId;
    private static final HashMap<String, Queue<AppLovinAd>> INTERSTITIAL_AD_QUEUES = new HashMap<>();
    private static final Object INTERSTITIAL_AD_QUEUES_LOCK = new Object();
    private static final HashMap<String, AppLovinIncentivizedInterstitial> INCENTIVIZED_ADS = new HashMap<>();
    private static final Object INCENTIVIZED_ADS_LOCK = new Object();

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onDestroy() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onPause() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationAdapter
    public void onResume() {
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void requestInterstitialAd(Context context, MediationInterstitialListener mediationInterstitialListener, Bundle bundle, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mSdk = AppLovinUtils.retrieveSdk(bundle, context);
        this.mContext = context;
        this.mNetworkExtras = bundle2;
        this.mMediationInterstitialListener = mediationInterstitialListener;
        this.mPlacement = AppLovinUtils.retrievePlacement(bundle);
        this.mZoneId = AppLovinUtils.retrieveZoneId(bundle);
        log(3, "Requesting interstitial for zone: " + this.mZoneId + " and placement: " + this.mPlacement);
        AppLovinAdLoadListener appLovinAdLoadListener = new AppLovinAdLoadListener() { // from class: com.applovin.mediation.ApplovinAdapter.1
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                ApplovinAdapter.log(3, "Interstitial did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + ApplovinAdapter.this.mZoneId + " and placement: " + ApplovinAdapter.this.mPlacement);
                synchronized (ApplovinAdapter.INTERSTITIAL_AD_QUEUES_LOCK) {
                    Queue queue = (Queue) ApplovinAdapter.INTERSTITIAL_AD_QUEUES.get(ApplovinAdapter.this.mZoneId);
                    if (queue == null) {
                        queue = new LinkedList();
                        ApplovinAdapter.INTERSTITIAL_AD_QUEUES.put(ApplovinAdapter.this.mZoneId, queue);
                    }
                    queue.offer(appLovinAd);
                    AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.1
                        @Override // java.lang.Runnable
                        public void run() {
                            ApplovinAdapter.this.mMediationInterstitialListener.onAdLoaded(ApplovinAdapter.this);
                        }
                    });
                }
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(final int i) {
                ApplovinAdapter.log(6, "Interstitial failed to load with error: " + i);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.1.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApplovinAdapter.this.mMediationInterstitialListener.onAdFailedToLoad(ApplovinAdapter.this, AppLovinUtils.toAdMobErrorCode(i));
                    }
                });
            }
        };
        synchronized (INTERSTITIAL_AD_QUEUES_LOCK) {
            Queue<AppLovinAd> queue = INTERSTITIAL_AD_QUEUES.get(this.mZoneId);
            if (queue != null && (queue == null || !queue.isEmpty())) {
                log(3, "Enqueued interstitial found. Finishing load...");
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApplovinAdapter.this.mMediationInterstitialListener.onAdLoaded(ApplovinAdapter.this);
                    }
                });
            }
            if (!TextUtils.isEmpty(this.mZoneId)) {
                this.mSdk.getAdService().loadNextAdForZoneId(this.mZoneId, appLovinAdLoadListener);
            } else {
                this.mSdk.getAdService().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
            }
        }
    }

    @Override // com.google.android.gms.ads.mediation.MediationInterstitialAdapter
    public void showInterstitial() {
        synchronized (INTERSTITIAL_AD_QUEUES_LOCK) {
            this.mSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.mNetworkExtras));
            Queue<AppLovinAd> queue = INTERSTITIAL_AD_QUEUES.get(this.mZoneId);
            AppLovinAd poll = queue != null ? queue.poll() : null;
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.mSdk, this.mContext);
            AppLovinInterstitialAdListener appLovinInterstitialAdListener = new AppLovinInterstitialAdListener(this, this.mMediationInterstitialListener);
            create.setAdDisplayListener(appLovinInterstitialAdListener);
            create.setAdClickListener(appLovinInterstitialAdListener);
            create.setAdVideoPlaybackListener(appLovinInterstitialAdListener);
            if (poll != null) {
                log(3, "Showing interstitial for zone: " + this.mZoneId + " placement: " + this.mPlacement);
                create.showAndRender(poll, this.mPlacement);
            } else {
                log(3, "Attempting to show interstitial before one was loaded");
                if (TextUtils.isEmpty(this.mZoneId) && create.isAdReadyToDisplay()) {
                    log(3, "Showing interstitial preloaded by SDK");
                    create.show(this.mPlacement);
                } else {
                    this.mMediationInterstitialListener.onAdOpened(this);
                    this.mMediationInterstitialListener.onAdClosed(this);
                }
            }
        }
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void initialize(Context context, MediationAdRequest mediationAdRequest, String str, MediationRewardedVideoAdListener mediationRewardedVideoAdListener, Bundle bundle, Bundle bundle2) {
        log(3, "Attempting to initialize SDK");
        if (!this.mInitialized.getAndSet(LOGGING_ENABLED)) {
            this.mSdk = AppLovinUtils.retrieveSdk(bundle, context);
            this.mContext = context;
            this.mNetworkExtras = bundle2;
            this.mMediationRewardedVideoAdListener = mediationRewardedVideoAdListener;
        }
        mediationRewardedVideoAdListener.onInitializationSucceeded(this);
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public boolean isInitialized() {
        return this.mInitialized.get();
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void loadAd(MediationAdRequest mediationAdRequest, Bundle bundle, Bundle bundle2) {
        synchronized (INCENTIVIZED_ADS_LOCK) {
            this.mPlacement = AppLovinUtils.retrievePlacement(bundle);
            this.mZoneId = AppLovinUtils.retrieveZoneId(bundle);
            log(3, "Requesting rewarded video for zone: " + this.mZoneId + " and placement: " + this.mPlacement);
            if (INCENTIVIZED_ADS.containsKey(this.mZoneId)) {
                this.mIncentivizedInterstitial = INCENTIVIZED_ADS.get(this.mZoneId);
            } else {
                if ("".equals(this.mZoneId)) {
                    this.mIncentivizedInterstitial = AppLovinIncentivizedInterstitial.create(this.mSdk);
                } else {
                    this.mIncentivizedInterstitial = AppLovinIncentivizedInterstitial.create(this.mZoneId, this.mSdk);
                }
                INCENTIVIZED_ADS.put(this.mZoneId, this.mIncentivizedInterstitial);
            }
        }
        if (this.mIncentivizedInterstitial.isAdReadyToDisplay()) {
            AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.3
                @Override // java.lang.Runnable
                public void run() {
                    ApplovinAdapter.this.mMediationRewardedVideoAdListener.onAdLoaded(ApplovinAdapter.this);
                }
            });
            return;
        }
        final String str = this.mPlacement;
        final String str2 = this.mZoneId;
        this.mIncentivizedInterstitial.preload(new AppLovinAdLoadListener() { // from class: com.applovin.mediation.ApplovinAdapter.4
            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void adReceived(AppLovinAd appLovinAd) {
                ApplovinAdapter.log(3, "Rewarded video did load ad: " + appLovinAd.getAdIdNumber() + " for zone: " + str2 + " and placement: " + str);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.4.1
                    @Override // java.lang.Runnable
                    public void run() {
                        ApplovinAdapter.this.mMediationRewardedVideoAdListener.onAdLoaded(ApplovinAdapter.this);
                    }
                });
            }

            @Override // com.applovin.sdk.AppLovinAdLoadListener
            public void failedToReceiveAd(final int i) {
                ApplovinAdapter.log(6, "Rewarded video failed to load with error: " + i);
                AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.4.2
                    @Override // java.lang.Runnable
                    public void run() {
                        ApplovinAdapter.this.mMediationRewardedVideoAdListener.onAdFailedToLoad(ApplovinAdapter.this, AppLovinUtils.toAdMobErrorCode(i));
                    }
                });
            }
        });
    }

    @Override // com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdAdapter
    public void showVideo() {
        if (this.mIncentivizedInterstitial.isAdReadyToDisplay()) {
            this.mSdk.getSettings().setMuted(AppLovinUtils.shouldMuteAudio(this.mNetworkExtras));
            log(3, "Showing rewarded video for zone: " + this.mZoneId + " placement: " + this.mPlacement);
            AppLovinIncentivizedAdListener appLovinIncentivizedAdListener = new AppLovinIncentivizedAdListener(this, this.mMediationRewardedVideoAdListener);
            this.mIncentivizedInterstitial.show(this.mContext, this.mPlacement, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener, appLovinIncentivizedAdListener);
            return;
        }
        log(3, "Attempting to show rewarded video before one was loaded");
        this.mMediationRewardedVideoAdListener.onAdOpened(this);
        this.mMediationRewardedVideoAdListener.onAdClosed(this);
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public void requestBannerAd(Context context, final MediationBannerListener mediationBannerListener, Bundle bundle, AdSize adSize, MediationAdRequest mediationAdRequest, Bundle bundle2) {
        this.mSdk = AppLovinUtils.retrieveSdk(bundle, context);
        this.mPlacement = AppLovinUtils.retrievePlacement(bundle);
        this.mZoneId = AppLovinUtils.retrieveZoneId(bundle);
        log(3, "Requesting banner of size " + adSize + " for zone: " + this.mZoneId + " and placement: " + this.mPlacement);
        AppLovinAdSize appLovinAdSizeFromAdMobAdSize = appLovinAdSizeFromAdMobAdSize(adSize);
        if (appLovinAdSizeFromAdMobAdSize != null) {
            this.mAdView = new AppLovinAdView(this.mSdk, appLovinAdSizeFromAdMobAdSize, context);
            AppLovinBannerAdListener appLovinBannerAdListener = new AppLovinBannerAdListener(this.mZoneId, this.mPlacement, this.mAdView, this, mediationBannerListener);
            this.mAdView.setAdDisplayListener(appLovinBannerAdListener);
            this.mAdView.setAdClickListener(appLovinBannerAdListener);
            this.mAdView.setAdViewEventListener(appLovinBannerAdListener);
            if (!TextUtils.isEmpty(this.mZoneId)) {
                this.mSdk.getAdService().loadNextAdForZoneId(this.mZoneId, appLovinBannerAdListener);
                return;
            } else {
                this.mSdk.getAdService().loadNextAd(appLovinAdSizeFromAdMobAdSize, appLovinBannerAdListener);
                return;
            }
        }
        log(6, "Failed to request banner with unsupported size");
        AppLovinSdkUtils.runOnUiThread(new Runnable() { // from class: com.applovin.mediation.ApplovinAdapter.5
            @Override // java.lang.Runnable
            public void run() {
                mediationBannerListener.onAdFailedToLoad(ApplovinAdapter.this, 1);
            }
        });
    }

    @Override // com.google.android.gms.ads.mediation.MediationBannerAdapter
    public View getBannerView() {
        return this.mAdView;
    }

    private AppLovinAdSize appLovinAdSizeFromAdMobAdSize(AdSize adSize) {
        boolean z = (adSize.getWidth() == -1 && adSize.getHeight() == -2) ? LOGGING_ENABLED : false;
        if (AdSize.BANNER.equals(adSize) || AdSize.LARGE_BANNER.equals(adSize) || z) {
            return AppLovinAdSize.BANNER;
        }
        if (AdSize.MEDIUM_RECTANGLE.equals(adSize)) {
            return AppLovinAdSize.MREC;
        }
        if (AdSize.LEADERBOARD.equals(adSize)) {
            return AppLovinAdSize.LEADER;
        }
        if (Math.abs(50 - adSize.getHeight()) <= 10) {
            return AppLovinAdSize.BANNER;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.mediation.OnContextChangedListener
    public void onContextChanged(Context context) {
        if (context != null) {
            log(3, "Context changed: " + context);
            this.mContext = context;
        }
    }

    static void log(int i, String str) {
        Log.println(i, "AppLovinAdapter", str);
    }
}
