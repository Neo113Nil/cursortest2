package com.mopub.mobileads;

import android.os.Handler;
import com.mopub.common.Preconditions;
import com.mopub.mraid.RewardedMraidController;

/* loaded from: classes2.dex */
public class RewardedMraidCountdownRunnable extends RepeatingHandlerRunnable {
    private int mCurrentElapsedTimeMillis;
    private final RewardedMraidController mRewardedMraidController;

    public RewardedMraidCountdownRunnable(RewardedMraidController rewardedMraidController, Handler handler) {
        super(handler);
        Preconditions.checkNotNull(handler);
        Preconditions.checkNotNull(rewardedMraidController);
        this.mRewardedMraidController = rewardedMraidController;
    }

    @Override // com.mopub.mobileads.RepeatingHandlerRunnable
    public void doWork() {
        this.mCurrentElapsedTimeMillis = (int) (this.mCurrentElapsedTimeMillis + this.mUpdateIntervalMillis);
        this.mRewardedMraidController.updateCountdown(this.mCurrentElapsedTimeMillis);
        if (this.mRewardedMraidController.isPlayableCloseable()) {
            this.mRewardedMraidController.showPlayableCloseButton();
        }
    }

    @Deprecated
    int getCurrentElapsedTimeMillis() {
        return this.mCurrentElapsedTimeMillis;
    }
}
