package com.mopub.mobileads;

import android.app.Activity;
import android.os.Handler;
import android.text.TextUtils;
import com.cmplay.a.d;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;
import com.facebook.ads.RewardedVideoAd;
import com.facebook.ads.RewardedVideoAdListener;
import com.mopub.common.DataKeys;
import com.mopub.common.LifecycleListener;
import com.mopub.common.MoPubReward;
import com.mopub.common.logging.MoPubLog;
import java.util.Map;

/* loaded from: classes2.dex */
public class FacebookRewardedVideo extends CustomEventRewardedVideo implements RewardedVideoAdListener {
    private static final int ONE_HOURS_MILLIS = 3600000;
    private String mPlacementId;
    private RewardedVideoAd mRewardedVideoAd;
    private Handler mHandler = new Handler();
    private Runnable mAdExpiration = new Runnable() { // from class: com.mopub.mobileads.FacebookRewardedVideo.1
        @Override // java.lang.Runnable
        public void run() {
            MoPubLog.d("Expiring unused Facebook Rewarded Video ad due to Facebook's 60-minute expiration policy.");
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(FacebookRewardedVideo.class, FacebookRewardedVideo.this.mPlacementId, MoPubErrorCode.EXPIRED);
            new d().a(2, 3, 0, 22, 99);
            FacebookRewardedVideo.this.onInvalidate();
        }
    };

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected boolean checkAndInitializeSdk(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        return false;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected LifecycleListener getLifecycleListener() {
        return null;
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        if (!map2.isEmpty()) {
            this.mPlacementId = map2.get("placement_id");
            if (!TextUtils.isEmpty(this.mPlacementId)) {
                if (this.mRewardedVideoAd != null) {
                    this.mRewardedVideoAd.destroy();
                    this.mRewardedVideoAd = null;
                }
                MoPubLog.d("Creating a Facebook Rewarded Video instance, and registering callbacks.");
                this.mRewardedVideoAd = new RewardedVideoAd(activity, this.mPlacementId);
                this.mRewardedVideoAd.setAdListener(this);
            } else {
                new d().a(2, 3, 0, 22, 99);
                MoPubRewardedVideoManager.onRewardedVideoLoadFailure(FacebookRewardedVideo.class, getAdNetworkId(), MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR);
                MoPubLog.d(MoPubErrorCode.ADAPTER_CONFIGURATION_ERROR.toString());
                MoPubLog.d("Placement ID is null or empty.");
                return;
            }
        }
        if (this.mRewardedVideoAd.isAdLoaded()) {
            new d().a(2, 2, 0, 22, 99);
            MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(FacebookRewardedVideo.class, this.mPlacementId);
        } else if (this.mRewardedVideoAd != null) {
            MoPubLog.d("Sending Facebook an ad request.");
            AdSettings.setMediationService("MOPUB_5.0.0");
            String str = map2.get(DataKeys.ADM_KEY);
            if (!TextUtils.isEmpty(str)) {
                this.mRewardedVideoAd.loadAdFromBid(str);
            } else {
                this.mRewardedVideoAd.loadAd();
            }
            new d().a(2, 1, 0, 22, 99);
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        return this.mRewardedVideoAd != null ? this.mRewardedVideoAd.getPlacementId() : "";
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        cancelExpirationTimer();
        if (this.mRewardedVideoAd != null) {
            MoPubLog.d("Performing cleanup tasks...");
            this.mRewardedVideoAd.setAdListener(null);
            this.mRewardedVideoAd.destroy();
            this.mRewardedVideoAd = null;
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected boolean hasVideoAvailable() {
        return this.mRewardedVideoAd != null && this.mRewardedVideoAd.isAdLoaded();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedVideo
    protected void showVideo() {
        if (hasVideoAvailable()) {
            MoPubLog.d("Facebook Rewarded Video creative is available. Showing...");
            this.mRewardedVideoAd.show();
        } else {
            new d().a(2, 3, 0, 22, 99);
            MoPubRewardedVideoManager.onRewardedVideoLoadFailure(FacebookRewardedVideo.class, this.mPlacementId, MoPubErrorCode.VIDEO_NOT_AVAILABLE);
            MoPubLog.d("Facebook Rewarded Video creative is not available. Try re-requesting.");
        }
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoCompleted() {
        MoPubLog.d("Facebook Rewarded Video creative is completed. Awarding the user.");
        MoPubRewardedVideoManager.onRewardedVideoCompleted(FacebookRewardedVideo.class, this.mPlacementId, MoPubReward.success("", 0));
    }

    @Override // com.facebook.ads.RewardedVideoAdListener, com.facebook.ads.AdListener
    public void onLoggingImpression(Ad ad) {
        cancelExpirationTimer();
        MoPubRewardedVideoManager.onRewardedVideoStarted(FacebookRewardedVideo.class, this.mPlacementId);
        new d().a(2, 4, 0, 22, 99);
        MoPubLog.d("Facebook Rewarded Video creative started playing.");
    }

    @Override // com.facebook.ads.RewardedVideoAdListener
    public void onRewardedVideoClosed() {
        MoPubRewardedVideoManager.onRewardedVideoClosed(FacebookRewardedVideo.class, this.mPlacementId);
        MoPubLog.d("Facebook Rewarded Video creative closed.");
    }

    @Override // com.facebook.ads.AdListener
    public void onAdLoaded(Ad ad) {
        cancelExpirationTimer();
        this.mHandler.postDelayed(this.mAdExpiration, 3600000L);
        new d().a(2, 2, 0, 22, 99);
        MoPubRewardedVideoManager.onRewardedVideoLoadSuccess(FacebookRewardedVideo.class, this.mPlacementId);
        MoPubLog.d("Facebook Rewarded Video creative cached.");
    }

    @Override // com.facebook.ads.AdListener
    public void onAdClicked(Ad ad) {
        MoPubRewardedVideoManager.onRewardedVideoClicked(FacebookRewardedVideo.class, this.mPlacementId);
        MoPubLog.d("Facebook Rewarded Video creative clicked.");
    }

    @Override // com.facebook.ads.AdListener
    public void onError(Ad ad, AdError adError) {
        cancelExpirationTimer();
        new d().a(2, 3, 0, 22, 99);
        MoPubRewardedVideoManager.onRewardedVideoLoadFailure(FacebookRewardedVideo.class, this.mPlacementId, mapErrorCode(adError.getErrorCode()));
        MoPubLog.d("Loading/Playing Facebook Rewarded Video creative encountered an error: " + mapErrorCode(adError.getErrorCode()).toString());
    }

    private static MoPubErrorCode mapErrorCode(int i) {
        if (i == 2001) {
            return MoPubErrorCode.INTERNAL_ERROR;
        }
        switch (i) {
            case 1000:
                return MoPubErrorCode.NO_CONNECTION;
            case 1001:
                return MoPubErrorCode.NETWORK_NO_FILL;
            default:
                return MoPubErrorCode.UNSPECIFIED;
        }
    }

    private void cancelExpirationTimer() {
        this.mHandler.removeCallbacks(this.mAdExpiration);
    }
}
