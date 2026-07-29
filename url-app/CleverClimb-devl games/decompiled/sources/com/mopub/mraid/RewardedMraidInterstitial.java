package com.mopub.mraid;

import android.content.Context;
import com.mopub.common.DataKeys;
import com.mopub.common.VisibleForTesting;
import com.mopub.mobileads.CustomEventInterstitial;
import com.mopub.mobileads.RewardedMraidActivity;
import java.util.Map;

/* loaded from: classes2.dex */
public class RewardedMraidInterstitial extends MraidInterstitial {
    private int mRewardedDuration;
    private RewardedPlayableBroadcastReceiver mRewardedPlayableBroadcastReceiver;
    private boolean mShouldRewardOnClick;

    public interface RewardedMraidInterstitialListener extends CustomEventInterstitial.CustomEventInterstitialListener {
        void onMraidComplete();
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        super.loadInterstitial(context, customEventInterstitialListener, map, map2);
        if (customEventInterstitialListener instanceof RewardedMraidInterstitialListener) {
            this.mRewardedPlayableBroadcastReceiver = new RewardedPlayableBroadcastReceiver((RewardedMraidInterstitialListener) customEventInterstitialListener, this.mBroadcastIdentifier);
            this.mRewardedPlayableBroadcastReceiver.register(this.mRewardedPlayableBroadcastReceiver, context);
        }
        Object obj = map.get(DataKeys.REWARDED_AD_DURATION_KEY);
        this.mRewardedDuration = obj instanceof Integer ? ((Integer) obj).intValue() : 30;
        Object obj2 = map.get(DataKeys.SHOULD_REWARD_ON_CLICK_KEY);
        this.mShouldRewardOnClick = obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false;
    }

    @Override // com.mopub.mraid.MraidInterstitial, com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void showInterstitial() {
        RewardedMraidActivity.start(this.mContext, this.mAdReport, this.mHtmlData, this.mBroadcastIdentifier, this.mRewardedDuration, this.mShouldRewardOnClick);
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void onInvalidate() {
        super.onInvalidate();
        if (this.mRewardedPlayableBroadcastReceiver != null) {
            this.mRewardedPlayableBroadcastReceiver.unregister(this.mRewardedPlayableBroadcastReceiver);
        }
    }

    @VisibleForTesting
    @Deprecated
    int getRewardedDuration() {
        return this.mRewardedDuration;
    }

    @VisibleForTesting
    @Deprecated
    boolean isShouldRewardOnClick() {
        return this.mShouldRewardOnClick;
    }
}
