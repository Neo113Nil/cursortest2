package com.mopub.mraid;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import com.mopub.common.IntentActions;
import com.mopub.mobileads.BaseBroadcastReceiver;
import com.mopub.mraid.RewardedMraidInterstitial;

/* loaded from: classes2.dex */
public class RewardedPlayableBroadcastReceiver extends BaseBroadcastReceiver {
    private static IntentFilter sIntentFilter;
    private RewardedMraidInterstitial.RewardedMraidInterstitialListener mRewardedMraidListener;

    public RewardedPlayableBroadcastReceiver(RewardedMraidInterstitial.RewardedMraidInterstitialListener rewardedMraidInterstitialListener, long j) {
        super(j);
        this.mRewardedMraidListener = rewardedMraidInterstitialListener;
        getIntentFilter();
    }

    @Override // com.mopub.mobileads.BaseBroadcastReceiver
    public IntentFilter getIntentFilter() {
        if (sIntentFilter == null) {
            sIntentFilter = new IntentFilter();
            sIntentFilter.addAction(IntentActions.ACTION_REWARDED_PLAYABLE_COMPLETE);
        }
        return sIntentFilter;
    }

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        if (this.mRewardedMraidListener != null && shouldConsumeBroadcast(intent) && IntentActions.ACTION_REWARDED_PLAYABLE_COMPLETE.equals(intent.getAction())) {
            this.mRewardedMraidListener.onMraidComplete();
            unregister(this);
        }
    }
}
