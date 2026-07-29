package com.cmplay.base.util.gif;

/* loaded from: classes.dex */
class ConditionVariable {
    private volatile boolean mCondition;

    ConditionVariable() {
    }

    synchronized void set(boolean z) {
        try {
            if (z) {
                open();
            } else {
                close();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    synchronized void open() {
        boolean z = this.mCondition;
        this.mCondition = true;
        if (!z) {
            notify();
        }
    }

    synchronized void close() {
        this.mCondition = false;
    }

    synchronized void block() throws InterruptedException {
        while (!this.mCondition) {
            wait();
        }
    }
}
