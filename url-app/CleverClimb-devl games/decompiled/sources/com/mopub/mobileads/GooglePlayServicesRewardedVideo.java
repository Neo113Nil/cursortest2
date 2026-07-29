package com.mopub.mobileads;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.Log;
import com.cmplay.a.d;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.RewardedVideoAd;
import com.google.android.gms.ads.reward.RewardedVideoAdListener;
import com.mopub.common.BaseLifecycleListener;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MediationSettings;
import com.mopub.common.MoPubReward;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* loaded from: classes2.dex */
public class GooglePlayServicesRewardedVideo extends CustomEventRewardedVideo implements RewardedVideoAdListener {
    private static final String ADAPTER_VERSION = "0.1.0";
    private static final String KEY_EXTRA_AD_UNIT_ID = "adunit";
    private static final String KEY_EXTRA_APPLICATION_ID = "appid";
    private static final String TAG = "MoPubToAdMobRewarded";
    private static AtomicBoolean sIsInitialized;
    private boolean isAdLoaded;
    private String mAdUnitId;
    private LifecycleListener mLifecycleListener = new BaseLifecycleListener() { // from class: com.mopub.mobileads.GooglePlayServicesRewardedVideo.1
        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onPause(Activity activity) {
            super.onPause(activity);
            if (GooglePlayServicesRewardedVideo.this.mRewardedVideoAd != null) {
                GooglePlayServicesRewardedVideo.this.mRewardedVideoAd.pause(activity);
            }
        }

        @Override // com.mopub.common.BaseLifecycleListener, com.mopub.common.LifecycleListener
        public void onResume(Activity activity) {
            super.onResume(activity);
            if (GooglePlayServicesRewardedVideo.this.mRewardedVideoAd != null) {
                GooglePlayServicesRewardedVideo.this.mRewardedVideoAd.resume(activity);
            }
        }
    };
    private RewardedVideoAd mRewardedVideoAd;

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdOpened() {
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
    }

    public GooglePlayServicesRewardedVideo() {
        sIsInitialized = new AtomicBoolean(false);
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected LifecycleListener getLifecycleListener() {
        return this.mLifecycleListener;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        return this.mAdUnitId;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        if (this.mRewardedVideoAd != null) {
            this.mRewardedVideoAd.setRewardedVideoAdListener(null);
            this.mRewardedVideoAd = null;
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        if (sIsInitialized.getAndSet(true)) {
            return false;
        }
        Log.i(TAG, "Adapter version - 0.1.0");
        if (TextUtils.isEmpty(map2.get(KEY_EXTRA_APPLICATION_ID))) {
            MobileAds.initialize(activity);
        } else {
            MobileAds.initialize(activity, map2.get(KEY_EXTRA_APPLICATION_ID));
        }
        if (TextUtils.isEmpty(map2.get(KEY_EXTRA_AD_UNIT_ID))) {
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(GooglePlayServicesRewardedVideo.class, GooglePlayServicesRewardedVideo.class.getSimpleName(), MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            new d().a(2, 3, 0, 23, 99);
            return false;
        }
        this.mAdUnitId = map2.get(KEY_EXTRA_AD_UNIT_ID);
        this.mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(activity);
        this.mRewardedVideoAd.setRewardedVideoAdListener(this);
        return true;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        this.isAdLoaded = false;
        if (TextUtils.isEmpty(map2.get(KEY_EXTRA_AD_UNIT_ID))) {
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(GooglePlayServicesRewardedVideo.class, GooglePlayServicesRewardedVideo.class.getSimpleName(), MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
            new d().a(2, 3, 0, 23, 99);
            return;
        }
        this.mAdUnitId = map2.get(KEY_EXTRA_AD_UNIT_ID);
        if (this.mRewardedVideoAd == null) {
            this.mRewardedVideoAd = MobileAds.getRewardedVideoAdInstance(activity);
            this.mRewardedVideoAd.setRewardedVideoAdListener(this);
        }
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: com.mopub.mobileads.GooglePlayServicesRewardedVideo.2
            @Override // java.lang.Runnable
            public void run() {
                if (GooglePlayServicesRewardedVideo.this.mRewardedVideoAd.isLoaded()) {
                    MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(GooglePlayServicesRewardedVideo.class, GooglePlayServicesRewardedVideo.this.mAdUnitId);
                    new d().a(2, 2, 0, 23, 99);
                    return;
                }
                AdRequest.Builder builder = new AdRequest.Builder();
                builder.setRequestAgent("MoPub");
                GooglePlayServicesRewardedVideo.this.forwardNpaIfSet(builder);
                GooglePlayServicesRewardedVideo.this.mRewardedVideoAd.loadAd(GooglePlayServicesRewardedVideo.this.mAdUnitId, builder.build());
                new d().a(2, 1, 0, 23, 99);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void forwardNpaIfSet(AdRequest.Builder builder) {
        if (GooglePlayServicesMediationSettings.getNpaBundle() == null || GooglePlayServicesMediationSettings.getNpaBundle().isEmpty()) {
            return;
        }
        builder.addNetworkExtrasBundle(AdMobAdapter.class, GooglePlayServicesMediationSettings.getNpaBundle());
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected boolean hasVideoAvailable() {
        return this.mRewardedVideoAd != null && this.isAdLoaded;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected void showVideo() {
        if (hasVideoAvailable()) {
            this.mRewardedVideoAd.show();
        } else {
            MoPubRewardedVideoManager.onRewardedVideoPlaybackError(GooglePlayServicesRewardedVideo.class, this.mAdUnitId, getMoPubErrorCode(0));
        }
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLoaded() {
        new d().a(2, 2, 0, 23, 99);
        MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(GooglePlayServicesRewardedVideo.class, this.mAdUnitId);
        this.isAdLoaded = true;
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoStarted() {
        MoPubRewardedVideoManager.onRewardedVideoStarted(GooglePlayServicesRewardedVideo.class, this.mAdUnitId);
        new d().a(2, 4, 0, 23, 99);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdClosed() {
        MoPubRewardedVideoManager.onRewardedVideoClosed(GooglePlayServicesRewardedVideo.class, this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewarded(RewardItem rewardItem) {
        MoPubRewardedVideoManager.onRewardedVideoCompleted(GooglePlayServicesRewardedVideo.class, this.mAdUnitId, MoPubReward.success(rewardItem.getType(), rewardItem.getAmount()));
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdLeftApplication() {
        MoPubRewardedVideoManager.onRewardedVideoClicked(GooglePlayServicesRewardedVideo.class, this.mAdUnitId);
    }

    @Override // com.google.android.gms.ads.reward.RewardedVideoAdListener
    public void onRewardedVideoAdFailedToLoad(int i) {
        new d().a(2, 3, 0, 23, 99);
        MoPubRewardedVideoManager.onRewardedVideoLoadFailure(GooglePlayServicesRewardedVideo.class, this.mAdUnitId, getMoPubErrorCode(i));
    }

    private MoPubErrorCode getMoPubErrorCode(int i) {
        switch (i) {
            case 0:
                return MoPubErrorCode.INTERNAL_ERROR;
            case 1:
                return MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR;
            case 2:
                return MoPubErrorCode.NO_CONNECTION;
            case 3:
                return MoPubErrorCode.NO_FILL;
            default:
                return MoPubErrorCode.UNSPECIFIED;
        }
    }

    public static final class GooglePlayServicesMediationSettings implements MediationSettings {
        private static Bundle npaBundle;

        public GooglePlayServicesMediationSettings() {
        }

        public GooglePlayServicesMediationSettings(Bundle bundle) {
            npaBundle = bundle;
        }

        public void setNpaBundle(Bundle bundle) {
            npaBundle = bundle;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static Bundle getNpaBundle() {
            return npaBundle;
        }
    }
}
