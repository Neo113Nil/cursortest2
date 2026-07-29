package com.mopub.mobileads;

import android.app.Activity;
import com.mopub.common.MoPubReward;
import com.mopub.common.VisibleForTesting;
import com.mopub.common.logging.MoPubLog;
import com.mopub.mobileads.MoPubRewardedAd;
import com.mopub.mraid.RewardedMraidInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
public class MoPubRewardedPlayable extends MoPubRewardedAd {
    static final String MOPUB_REWARDED_PLAYABLE_ID = "mopub_rewarded_playable_id";
    private RewardedMraidInterstitial mRewardedMraidInterstitial = new RewardedMraidInterstitial();

    @Override // com.mopub.mobileads.MoPubRewardedAd, com.mopub.mobileads.CustomEventRewardedAd
    protected void loadWithSdkInitialized(Activity activity, Map<String, Object> map, Map<String, String> map2) throws Exception {
        super.loadWithSdkInitialized(activity, map, map2);
        if (this.mRewardedMraidInterstitial == null) {
            MoPubLog.w("mRewardedMraidInterstitial is null. Has this class been invalidated?");
        } else {
            this.mRewardedMraidInterstitial.loadInterstitial(activity, new MoPubRewardedPlayableListener(), map, map2);
        }
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected String getAdNetworkId() {
        return this.mAdUnitId != null ? this.mAdUnitId : MOPUB_REWARDED_PLAYABLE_ID;
    }

    @Override // com.mopub.mobileads.MoPubRewardedAd, com.mopub.mobileads.CustomEventRewardedAd
    protected void onInvalidate() {
        if (this.mRewardedMraidInterstitial != null) {
            this.mRewardedMraidInterstitial.onInvalidate();
        }
        this.mRewardedMraidInterstitial = null;
        super.onInvalidate();
    }

    @Override // com.mopub.mobileads.CustomEventRewardedAd
    protected void show() {
        if (isReady() && this.mRewardedMraidInterstitial != null) {
            MoPubLog.d("Showing MoPub rewarded playable.");
            this.mRewardedMraidInterstitial.showInterstitial();
        } else {
            MoPubLog.d("MoPub rewarded playable not loaded. Unable to show playable.");
        }
    }

    private class MoPubRewardedPlayableListener extends MoPubRewardedAd.MoPubRewardedAdListener implements RewardedMraidInterstitial.RewardedMraidInterstitialListener {
        public MoPubRewardedPlayableListener() {
            super(MoPubRewardedPlayable.class);
        }

        @Override // com.mopub.mraid.RewardedMraidInterstitial.RewardedMraidInterstitialListener
        public void onMraidComplete() {
            if (MoPubRewardedPlayable.this.getRewardedAdCurrencyName() == null) {
                MoPubLog.d("No rewarded video was loaded, so no reward is possible");
            } else {
                MoPubRewardedVideoManager.onRewardedVideoCompleted(this.mCustomEventClass, MoPubRewardedPlayable.this.getAdNetworkId(), MoPubReward.success(MoPubRewardedPlayable.this.getRewardedAdCurrencyName(), MoPubRewardedPlayable.this.getRewardedAdCurrencyAmount()));
            }
        }
    }

    @VisibleForTesting
    @Deprecated
    void setRewardedMraidInterstitial(RewardedMraidInterstitial rewardedMraidInterstitial) {
        this.mRewardedMraidInterstitial = rewardedMraidInterstitial;
    }

    @VisibleForTesting
    @Deprecated
    RewardedMraidInterstitial getRewardedMraidInterstitial() {
        return this.mRewardedMraidInterstitial;
    }
}
