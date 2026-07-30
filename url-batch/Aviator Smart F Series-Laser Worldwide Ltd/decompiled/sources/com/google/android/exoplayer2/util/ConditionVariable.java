package com.google.android.exoplayer2.util;

@Deprecated
/* loaded from: classes3.dex */
public class ConditionVariable {
    private final Clock clock;
    private boolean isOpen;

    public ConditionVariable() {
        this(Clock.DEFAULT);
    }

    public synchronized void block() {
        while (!this.isOpen) {
            wait();
        }
    }

    public synchronized void blockUninterruptible() {
        boolean z7 = false;
        while (!this.isOpen) {
            try {
                wait();
            } catch (InterruptedException unused) {
                z7 = true;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
    }

    public synchronized boolean close() {
        boolean z7;
        z7 = this.isOpen;
        this.isOpen = false;
        return z7;
    }

    public synchronized boolean isOpen() {
        return this.isOpen;
    }

    public synchronized boolean open() {
        if (this.isOpen) {
            return false;
        }
        this.isOpen = true;
        notifyAll();
        return true;
    }

    public ConditionVariable(Clock clock) {
        this.clock = clock;
    }

    public synchronized boolean block(long j8) {
        if (j8 <= 0) {
            return this.isOpen;
        }
        long elapsedRealtime = this.clock.elapsedRealtime();
        long j9 = j8 + elapsedRealtime;
        if (j9 < elapsedRealtime) {
            block();
        } else {
            while (!this.isOpen && elapsedRealtime < j9) {
                wait(j9 - elapsedRealtime);
                elapsedRealtime = this.clock.elapsedRealtime();
            }
        }
        return this.isOpen;
    }
}
