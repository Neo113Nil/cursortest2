package com.mopub.mobileads;

import android.content.Context;
import com.mopub.common.VisibleForTesting;
import com.mopub.mobileads.CustomEventInterstitial;
import java.util.Map;

/* loaded from: classes2.dex */
class RewardedVastVideoInterstitial extends VastVideoInterstitial {
    private RewardedVideoBroadcastReceiver mRewardedVideoBroadcastReceiver;

    interface RewardedVideoInterstitialListener extends CustomEventInterstitial.CustomEventInterstitialListener {
        void onVideoComplete();
    }

    RewardedVastVideoInterstitial() {
    }

    @Override // com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void loadInterstitial(Context context, CustomEventInterstitial.CustomEventInterstitialListener customEventInterstitialListener, Map<String, Object> map, Map<String, String> map2) {
        super.loadInterstitial(context, customEventInterstitialListener, map, map2);
        if (customEventInterstitialListener instanceof RewardedVideoInterstitialListener) {
            this.mRewardedVideoBroadcastReceiver = new RewardedVideoBroadcastReceiver((RewardedVideoInterstitialListener) customEventInterstitialListener, this.mBroadcastIdentifier);
            this.mRewardedVideoBroadcastReceiver.register(this.mRewardedVideoBroadcastReceiver, context);
        }
    }

    @Override // com.mopub.mobileads.VastVideoInterstitial, com.mopub.mobileads.VastManager.VastManagerListener
    public void onVastVideoConfigurationPrepared(VastVideoConfig vastVideoConfig) {
        if (vastVideoConfig != null) {
            vastVideoConfig.setIsRewardedVideo(true);
        }
        super.onVastVideoConfigurationPrepared(vastVideoConfig);
    }

    @Override // com.mopub.mobileads.VastVideoInterstitial, com.mopub.mobileads.ResponseBodyInterstitial, com.mopub.mobileads.CustomEventInterstitial
    public void onInvalidate() {
        super.onInvalidate();
        if (this.mRewardedVideoBroadcastReceiver != null) {
            this.mRewardedVideoBroadcastReceiver.unregister(this.mRewardedVideoBroadcastReceiver);
        }
    }

    @VisibleForTesting
    @Deprecated
    RewardedVideoBroadcastReceiver getRewardedVideoBroadcastReceiver() {
        return this.mRewardedVideoBroadcastReceiver;
    }
}
