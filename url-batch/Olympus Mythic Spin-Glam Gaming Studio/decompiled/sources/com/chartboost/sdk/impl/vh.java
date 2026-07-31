package com.chartboost.sdk.impl;

import android.os.SystemClock;

/* loaded from: classes6.dex */
public class vh {
    public long a() {
        return System.currentTimeMillis();
    }

    public long b() {
        return System.nanoTime();
    }

    public long c() {
        return SystemClock.uptimeMillis();
    }
}
