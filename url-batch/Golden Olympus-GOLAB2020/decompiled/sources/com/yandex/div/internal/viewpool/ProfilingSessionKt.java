package com.yandex.div.internal.viewpool;

import kotlin.Metadata;

@Metadata
/* loaded from: classes2.dex */
public abstract class ProfilingSessionKt {
    private static final long floorTo(long j4, long j5) {
        return (j4 / j5) * j5;
    }

    public static final long roundRoughly(long j4) {
        if (j4 < 0) {
            return 0L;
        }
        if (j4 < 100) {
            return floorTo(j4, 20L);
        }
        if (j4 < 1000) {
            return floorTo(j4, 100L);
        }
        if (j4 < 2000) {
            return floorTo(j4, 200L);
        }
        if (j4 < 5000) {
            return floorTo(j4, 500L);
        }
        if (j4 < 10000) {
            return floorTo(j4, 1000L);
        }
        if (j4 < 20000) {
            return floorTo(j4, 2000L);
        }
        if (j4 < 50000) {
            return floorTo(j4, 5000L);
        }
        return 50000L;
    }
}
