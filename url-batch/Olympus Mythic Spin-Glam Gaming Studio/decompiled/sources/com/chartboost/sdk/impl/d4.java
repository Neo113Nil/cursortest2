package com.chartboost.sdk.impl;

import com.google.android.exoplayer2.upstream.cache.CacheSpan;

/* loaded from: classes8.dex */
public abstract class d4 {
    public static final int b(CacheSpan cacheSpan, CacheSpan cacheSpan2) {
        long j = cacheSpan.lastTouchTimestamp;
        long j2 = cacheSpan2.lastTouchTimestamp;
        if (j - j2 == 0) {
            return cacheSpan.compareTo(cacheSpan2);
        }
        return j < j2 ? -1 : 1;
    }
}
