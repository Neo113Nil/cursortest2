package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f9786a;

    public SystemTimeOffsetProvider(SystemTimeProvider systemTimeProvider) {
        this.f9786a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j4, TimeUnit timeUnit) {
        return this.f9786a.elapsedRealtime() - timeUnit.toMillis(j4);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j4, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j4, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j4, TimeUnit timeUnit) {
        if (j4 == 0) {
            return 0L;
        }
        return this.f9786a.currentTimeSeconds() - timeUnit.toSeconds(j4);
    }

    public final long systemNanoTimeOffsetInNanos(long j4, TimeUnit timeUnit) {
        return this.f9786a.systemNanoTime() - timeUnit.toNanos(j4);
    }

    public final long systemNanoTimeOffsetInSeconds(long j4, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j4, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
