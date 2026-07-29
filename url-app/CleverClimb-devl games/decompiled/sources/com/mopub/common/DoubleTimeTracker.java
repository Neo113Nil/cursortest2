package com.mopub.common;

import android.os.SystemClock;
import com.mopub.common.logging.MoPubLog;

/* loaded from: classes2.dex */
public class DoubleTimeTracker {
    private long interval;
    private final Clock mClock;
    private long startedTimestamp;
    private volatile State state;

    public interface Clock {
        long elapsedRealTime();
    }

    private enum State {
        STARTED,
        PAUSED
    }

    public DoubleTimeTracker() {
        this(new SystemClockClock());
    }

    @VisibleForTesting
    public DoubleTimeTracker(Clock clock) {
        this.mClock = clock;
        this.state = State.PAUSED;
    }

    public synchronized void start() {
        if (this.state == State.STARTED) {
            MoPubLog.v("DoubleTimeTracker already started.");
        } else {
            this.state = State.STARTED;
            this.startedTimestamp = this.mClock.elapsedRealTime();
        }
    }

    public synchronized void pause() {
        if (this.state == State.PAUSED) {
            MoPubLog.v("DoubleTimeTracker already paused.");
            return;
        }
        this.interval += computeIntervalDiff();
        this.startedTimestamp = 0L;
        this.state = State.PAUSED;
    }

    public synchronized double getInterval() {
        return this.interval + computeIntervalDiff();
    }

    private synchronized long computeIntervalDiff() {
        if (this.state == State.PAUSED) {
            return 0L;
        }
        return this.mClock.elapsedRealTime() - this.startedTimestamp;
    }

    private static class SystemClockClock implements Clock {
        private SystemClockClock() {
        }

        @Override // com.mopub.common.DoubleTimeTracker.Clock
        public long elapsedRealTime() {
            return SystemClock.elapsedRealtime();
        }
    }
}
