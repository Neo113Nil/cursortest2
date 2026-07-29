package com.applovin.mediation;

import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.google.android.gms.ads.reward.RewardItem;
import com.google.android.gms.ads.reward.mediation.MediationRewardedVideoAdListener;
import java.util.Map;

/* loaded from: classes.dex */
class AppLovinIncentivizedAdListener implements AppLovinAdClickListener, AppLovinAdDisplayListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {
    private final ApplovinAdapter mAdapter;
    private boolean mFullyWatched;
    private final MediationRewardedVideoAdListener mMediationRewardedVideoAdListener;
    private AppLovinRewardItem mRewardItem;

    AppLovinIncentivizedAdListener(ApplovinAdapter applovinAdapter, MediationRewardedVideoAdListener mediationRewardedVideoAdListener) {
        this.mAdapter = applovinAdapter;
        this.mMediationRewardedVideoAdListener = mediationRewardedVideoAdListener;
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adDisplayed(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video displayed");
        this.mMediationRewardedVideoAdListener.onAdOpened(this.mAdapter);
    }

    @Override // com.applovin.sdk.AppLovinAdDisplayListener
    public void adHidden(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video dismissed");
        if (this.mFullyWatched && this.mRewardItem != null) {
            this.mMediationRewardedVideoAdListener.onRewarded(this.mAdapter, this.mRewardItem);
        }
        this.mMediationRewardedVideoAdListener.onAdClosed(this.mAdapter);
        this.mFullyWatched = false;
        this.mRewardItem = null;
    }

    @Override // com.applovin.sdk.AppLovinAdClickListener
    public void adClicked(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video clicked");
        this.mMediationRewardedVideoAdListener.onAdClicked(this.mAdapter);
        this.mMediationRewardedVideoAdListener.onAdLeftApplication(this.mAdapter);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackBegan(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "Rewarded video playback began");
        this.mMediationRewardedVideoAdListener.onVideoStarted(this.mAdapter);
    }

    @Override // com.applovin.sdk.AppLovinAdVideoPlaybackListener
    public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
        ApplovinAdapter.log(3, "Rewarded video playback ended at playback percent: " + d2 + "%");
        this.mFullyWatched = z;
        if (z) {
            this.mMediationRewardedVideoAdListener.onVideoCompleted(this.mAdapter);
        }
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
        ApplovinAdapter.log(6, "Rewarded video validation request for ad did exceed quota with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
        ApplovinAdapter.log(6, "Rewarded video validation request for ad failed with error code: " + i);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
        ApplovinAdapter.log(6, "Rewarded video validation request was rejected with response: " + map);
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userDeclinedToViewAd(AppLovinAd appLovinAd) {
        ApplovinAdapter.log(3, "User declined to view rewarded video");
    }

    @Override // com.applovin.sdk.AppLovinAdRewardListener
    public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
        String str = map.get("currency");
        int parseDouble = (int) Double.parseDouble(map.get("amount"));
        ApplovinAdapter.log(3, "Rewarded " + parseDouble + " " + str);
        this.mRewardItem = new AppLovinRewardItem(parseDouble, str);
    }

    private static final class AppLovinRewardItem implements RewardItem {
        private final int mAmount;
        private final String mType;

        private AppLovinRewardItem(int i, String str) {
            this.mAmount = i;
            this.mType = str;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public String getType() {
            return this.mType;
        }

        @Override // com.google.android.gms.ads.reward.RewardItem
        public int getAmount() {
            return this.mAmount;
        }
    }
}
