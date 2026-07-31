package com.bytedance.zmn.zmn.fs;

import android.os.SystemClock;

/* loaded from: classes13.dex */
public abstract class fs implements Runnable {
    private final long zmn = SystemClock.elapsedRealtime();

    protected abstract void zmn(long j);

    @Override // java.lang.Runnable
    public void run() {
        zmn(SystemClock.elapsedRealtime() - this.zmn);
    }
}
