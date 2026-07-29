package com.mopub.mobileads;

import android.app.Activity;
import com.mopub.common.MoPubReward;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubRewardedAd;
import com.mopub.mobileads.RewardedVastVideoInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoPubRewardedVideo extends MoPubRewardedAd {
    static final String MOPUB_REWARDED_VIDEO_ID = "mopub_rewarded_video_id";
    private RewardedVastVideoInterstitial mRewardedVastVideoInterstitial = new RewardedVastVideoInterstitial();

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        return this.mAdUnitId != null ? this.mAdUnitId : MOPUB_REWARDED_VIDEO_ID;
    }

    @Override // com.mopub.mobileads.MoPubRewardedAd, com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        if (this.mRewardedVastVideoInterstitial != null) {
            this.mRewardedVastVideoInterstitial.onInvalidate();
        }
        this.mRewardedVastVideoInterstitial = null;
        super.onInvalidate();
    }

    @Override // com.mopub.mobileads.MoPubRewardedAd, com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        super.loadWithSdkInitialized(activity, map, map2);
        if (this.mRewardedVastVideoInterstitial == null) {
            MoPubLog.w("mRewardedVastVideoInterstitial is null. Has this class been invalidated?");
        } else {
            this.mRewardedVastVideoInterstitial.loadInterstitial(activity, new MoPubRewardedVideoListener(), map, map2);
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void show() {
        if (isReady() && this.mRewardedVastVideoInterstitial != null) {
            MoPubLog.d("Showing MoPub rewarded video.");
            this.mRewardedVastVideoInterstitial.showInterstitial();
        } else {
            MoPubLog.d("Unable to show MoPub rewarded video");
        }
    }

    private class MoPubRewardedVideoListener extends MoPubRewardedAd.MoPubRewardedAdListener implements RewardedVastVideoInterstitial.RewardedVideoInterstitialListener {
        public MoPubRewardedVideoListener() {
            super(MoPubRewardedVideo.class);
        }

        @Override // com.mopub.mobileads.RewardedVastVideoInterstitial.RewardedVideoInterstitialListener
        public void onVideoComplete() {
            if (MoPubRewardedVideo.this.getRewardedAdCurrencyName() == null) {
                MoPubLog.d("No rewarded video was loaded, so no reward is possible");
            } else {
                MoPubRewardedVideoManager.onRewardedVideoCompleted(this.mCustomEventClass, MoPubRewardedVideo.this.getAdNetworkId(), MoPubReward.success(MoPubRewardedVideo.this.getRewardedAdCurrencyName(), MoPubRewardedVideo.this.getRewardedAdCurrencyAmount()));
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    void setRewardedVastVideoInterstitial(RewardedVastVideoInterstitial rewardedVastVideoInterstitial) {
        this.mRewardedVastVideoInterstitial = rewardedVastVideoInterstitial;
    }

    @VisibleForTesting
    @Deprecated
    RewardedVastVideoInterstitial getRewardedVastVideoInterstitial() {
        return this.mRewardedVastVideoInterstitial;
    }
}
