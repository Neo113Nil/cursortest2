package com.mopub.mraid;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import com.mopub.common.AdReport;
import com.mopub.common.CloseableLayout;
import com.mopub.common.IntentActions;
import com.mopub.common.VisibleForTesting;
import com.mopub.mobileads.BaseBroadcastReceiver;
import com.mopub.mobileads.RewardedMraidCountdownRunnable;
import com.mopub.mobileads.VastVideoRadialCountdownWidget;

/* loaded from: classes2.dex */
public class RewardedMraidController extends MraidController {

    @VisibleForTesting
    static final int DEFAULT_PLAYABLE_DURATION_FOR_CLOSE_BUTTON_MILLIS = 30000;
    public static final int DEFAULT_PLAYABLE_DURATION_FOR_CLOSE_BUTTON_SECONDS = 30;
    public static final boolean DEFAULT_PLAYABLE_SHOULD_REWARD_ON_CLICK = false;
    public static final int MILLIS_IN_SECOND = 1000;

    @VisibleForTesting
    static final long PLAYABLE_COUNTDOWN_UPDATE_INTERVAL_MILLIS = 250;
    private final long mBroadcastIdentifier;
    private CloseableLayout mCloseableLayout;
    private RewardedMraidCountdownRunnable mCountdownRunnable;
    private int mCurrentElapsedTimeMillis;
    private boolean mIsCalibrationDone;
    private boolean mIsRewarded;
    private VastVideoRadialCountdownWidget mRadialCountdownWidget;
    private final int mShowCloseButtonDelay;
    private boolean mShowCloseButtonEventFired;

    @Override // com.mopub.mraid.MraidController
    protected void handleCustomClose(boolean z) {
    }

    @VisibleForTesting
    public RewardedMraidController(Context context, AdReport adReport, PlacementType placementType, int i, long j) {
        super(context, adReport, placementType);
        int i2 = i * 1000;
        if (i2 < 0 || i2 > 30000) {
            this.mShowCloseButtonDelay = 30000;
        } else {
            this.mShowCloseButtonDelay = i2;
        }
        this.mBroadcastIdentifier = j;
    }

    public void create(Context context, CloseableLayout closeableLayout) {
        this.mCloseableLayout = closeableLayout;
        this.mCloseableLayout.setCloseAlwaysInteractable(false);
        this.mCloseableLayout.setCloseVisible(false);
        addRadialCountdownWidget(context, 4);
        this.mRadialCountdownWidget.calibrateAndMakeVisible(this.mShowCloseButtonDelay);
        this.mIsCalibrationDone = true;
        this.mCountdownRunnable = new RewardedMraidCountdownRunnable(this, new Handler(Looper.getMainLooper()));
    }

    public void pause() {
        stopRunnables();
    }

    @Override // com.mopub.mraid.MraidController
    public void resume() {
        startRunnables();
    }

    @Override // com.mopub.mraid.MraidController
    public void destroy() {
        stopRunnables();
    }

    @Override // com.mopub.mraid.MraidController
    protected void handleClose() {
        if (this.mShowCloseButtonEventFired) {
            super.handleClose();
        }
    }

    public boolean backButtonEnabled() {
        return this.mShowCloseButtonEventFired;
    }

    public boolean isPlayableCloseable() {
        return !this.mShowCloseButtonEventFired && this.mCurrentElapsedTimeMillis >= this.mShowCloseButtonDelay;
    }

    public void showPlayableCloseButton() {
        this.mShowCloseButtonEventFired = true;
        this.mRadialCountdownWidget.setVisibility(8);
        this.mCloseableLayout.setCloseVisible(true);
        if (this.mIsRewarded) {
            return;
        }
        BaseBroadcastReceiver.broadcastAction(getContext(), this.mBroadcastIdentifier, IntentActions.ACTION_REWARDED_PLAYABLE_COMPLETE);
        this.mIsRewarded = true;
    }

    public void updateCountdown(int i) {
        this.mCurrentElapsedTimeMillis = i;
        if (this.mIsCalibrationDone) {
            this.mRadialCountdownWidget.updateCountdownProgress(this.mShowCloseButtonDelay, this.mCurrentElapsedTimeMillis);
        }
    }

    private void startRunnables() {
        this.mCountdownRunnable.startRepeating(PLAYABLE_COUNTDOWN_UPDATE_INTERVAL_MILLIS);
    }

    private void stopRunnables() {
        this.mCountdownRunnable.stop();
    }

    private void addRadialCountdownWidget(Context context, int i) {
        this.mRadialCountdownWidget = new VastVideoRadialCountdownWidget(context);
        this.mRadialCountdownWidget.setVisibility(i);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.mRadialCountdownWidget.getLayoutParams();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(marginLayoutParams.width + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin, marginLayoutParams.height + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin);
        layoutParams.gravity = 53;
        this.mCloseableLayout.addView(this.mRadialCountdownWidget, layoutParams);
    }

    @VisibleForTesting
    @Deprecated
    public int getShowCloseButtonDelay() {
        return this.mShowCloseButtonDelay;
    }

    @VisibleForTesting
    @Deprecated
    public VastVideoRadialCountdownWidget getRadialCountdownWidget() {
        return this.mRadialCountdownWidget;
    }

    @VisibleForTesting
    @Deprecated
    public RewardedMraidCountdownRunnable getCountdownRunnable() {
        return this.mCountdownRunnable;
    }

    @VisibleForTesting
    @Deprecated
    public boolean isCalibrationDone() {
        return this.mIsCalibrationDone;
    }

    @VisibleForTesting
    @Deprecated
    public boolean isShowCloseButtonEventFired() {
        return this.mShowCloseButtonEventFired;
    }

    @VisibleForTesting
    @Deprecated
    public boolean isRewarded() {
        return this.mIsRewarded;
    }
}
