package io.reactivex.internal.util;

import io.reactivex.plugins.RxJavaPlugins;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes3.dex */
public final class BackpressureHelper {
    private BackpressureHelper() {
        throw new IllegalStateException("No instances!");
    }

    public static long add(AtomicLong atomicLong, long j8) {
        long j9;
        do {
            j9 = atomicLong.get();
            if (j9 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j9, addCap(j9, j8)));
        return j9;
    }

    public static long addCancel(AtomicLong atomicLong, long j8) {
        long j9;
        do {
            j9 = atomicLong.get();
            if (j9 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j9 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
        } while (!atomicLong.compareAndSet(j9, addCap(j9, j8)));
        return j9;
    }

    public static long addCap(long j8, long j9) {
        long j10 = j8 + j9;
        if (j10 < 0) {
            return Long.MAX_VALUE;
        }
        return j10;
    }

    public static long multiplyCap(long j8, long j9) {
        long j10 = j8 * j9;
        if (((j8 | j9) >>> 31) == 0 || j10 / j8 == j9) {
            return j10;
        }
        return Long.MAX_VALUE;
    }

    public static long produced(AtomicLong atomicLong, long j8) {
        long j9;
        long j10;
        do {
            j9 = atomicLong.get();
            if (j9 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j10 = j9 - j8;
            if (j10 < 0) {
                RxJavaPlugins.onError(new IllegalStateException("More produced than requested: " + j10));
                j10 = 0L;
            }
        } while (!atomicLong.compareAndSet(j9, j10));
        return j10;
    }

    public static long producedCancel(AtomicLong atomicLong, long j8) {
        long j9;
        long j10;
        do {
            j9 = atomicLong.get();
            if (j9 == Long.MIN_VALUE) {
                return Long.MIN_VALUE;
            }
            if (j9 == Long.MAX_VALUE) {
                return Long.MAX_VALUE;
            }
            j10 = j9 - j8;
            if (j10 < 0) {
                RxJavaPlugins.onError(new IllegalStateException("More produced than requested: " + j10));
                j10 = 0L;
            }
        } while (!atomicLong.compareAndSet(j9, j10));
        return j10;
    }
}
