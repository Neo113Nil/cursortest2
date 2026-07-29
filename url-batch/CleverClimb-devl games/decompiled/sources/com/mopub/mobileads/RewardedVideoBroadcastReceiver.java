package com.mopub.mobileads;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.mopub.common.IntentActions;
import com.mopub.common.Preconditions;
import com.mopub.mobileads.RewardedVastVideoInterstitial;

/* loaded from: classes2.dex */
public class RewardedVideoBroadcastReceiver extends BaseBroadcastReceiver {
    private static IntentFilter sIntentFilter;
    private RewardedVastVideoInterstitial.RewardedVideoInterstitialListener mRewardedVideoListener;

    public RewardedVideoBroadcastReceiver(RewardedVastVideoInterstitial.RewardedVideoInterstitialListener rewardedVideoInterstitialListener, long j) {
        super(j);
        this.mRewardedVideoListener = rewardedVideoInterstitialListener;
        getIntentFilter();
    }

    @Override // com.mopub.mobileads.BaseBroadcastReceiver
    public IntentFilter getIntentFilter() {
        if (sIntentFilter == null) {
            sIntentFilter = new IntentFilter();
            sIntentFilter.addAction(IntentActions.ACTION_REWARDED_VIDEO_COMPLETE);
        }
        return sIntentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(intent);
        if (this.mRewardedVideoListener != null && shouldConsumeBroadcast(intent) && IntentActions.ACTION_REWARDED_VIDEO_COMPLETE.equals(intent.getAction())) {
            this.mRewardedVideoListener.onVideoComplete();
            unregister(this);
        }
    }
}
