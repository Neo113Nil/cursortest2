package com.mopub.mobileads;

import android.os.Handler;
import com.mopub.common.Preconditions;
import com.mopub.common.VisibleForTesting;

/* loaded from: classes2.dex */
public abstract class RepeatingHandlerRunnable implements Runnable {
    protected final Handler mHandler;
    private volatile boolean mIsRunning;
    protected volatile long mUpdateIntervalMillis;

    public abstract void doWork();

    public RepeatingHandlerRunnable(Handler handler) {
        Preconditions.checkNotNull(handler);
        this.mHandler = handler;
    }

    @Override // java.lang.Runnable
    public void run() {
        if (this.mIsRunning) {
            doWork();
            this.mHandler.postDelayed(this, this.mUpdateIntervalMillis);
        }
    }

    public void startRepeating(long j) {
        Preconditions.checkArgument(j > 0, "intervalMillis must be greater than 0. Saw: %d", Long.valueOf(j));
        this.mUpdateIntervalMillis = j;
        if (this.mIsRunning) {
            return;
        }
        this.mIsRunning = true;
        this.mHandler.post(this);
    }

    public void stop() {
        this.mIsRunning = false;
    }

    @VisibleForTesting
    @Deprecated
    public boolean isRunning() {
        return this.mIsRunning;
    }
}
