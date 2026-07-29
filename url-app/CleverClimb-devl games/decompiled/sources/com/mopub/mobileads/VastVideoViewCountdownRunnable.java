package com.mopub.mobileads;

import android.os.Handler;
import com.mopub.common.Preconditions;

/* loaded from: classes2.dex */
public class VastVideoViewCountdownRunnable extends RepeatingHandlerRunnable {
    private final VastVideoViewController mVideoViewController;

    public VastVideoViewCountdownRunnable(VastVideoViewController vastVideoViewController, Handler handler) {
        super(handler);
        Preconditions.checkNotNull(handler);
        Preconditions.checkNotNull(vastVideoViewController);
        this.mVideoViewController = vastVideoViewController;
    }

    @Override // com.mopub.mobileads.RepeatingHandlerRunnable
    public void doWork() {
        this.mVideoViewController.updateCountdown();
        if (this.mVideoViewController.shouldBeInteractable()) {
            this.mVideoViewController.makeVideoInteractable();
        }
    }
}
