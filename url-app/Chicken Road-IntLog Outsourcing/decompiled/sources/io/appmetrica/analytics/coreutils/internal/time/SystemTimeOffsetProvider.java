package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f6297a;

    public SystemTimeOffsetProvider(SystemTimeProvider systemTimeProvider) {
        this.f6297a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j2, TimeUnit timeUnit) {
        return this.f6297a.elapsedRealtime() - timeUnit.toMillis(j2);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j2, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j2, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j2, TimeUnit timeUnit) {
        if (j2 == 0) {
            return 0L;
        }
        return this.f6297a.currentTimeSeconds() - timeUnit.toSeconds(j2);
    }

    public final long systemNanoTimeOffsetInNanos(long j2, TimeUnit timeUnit) {
        return this.f6297a.systemNanoTime() - timeUnit.toNanos(j2);
    }

    public final long systemNanoTimeOffsetInSeconds(long j2, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j2, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
