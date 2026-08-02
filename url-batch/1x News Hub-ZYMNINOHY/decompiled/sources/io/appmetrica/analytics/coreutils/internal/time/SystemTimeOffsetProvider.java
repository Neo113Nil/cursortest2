package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f5532a;

    public SystemTimeOffsetProvider(SystemTimeProvider systemTimeProvider) {
        this.f5532a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j3, TimeUnit timeUnit) {
        return this.f5532a.elapsedRealtime() - timeUnit.toMillis(j3);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j3, TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j3, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j3, TimeUnit timeUnit) {
        if (j3 == 0) {
            return 0L;
        }
        return this.f5532a.currentTimeSeconds() - timeUnit.toSeconds(j3);
    }

    public final long systemNanoTimeOffsetInNanos(long j3, TimeUnit timeUnit) {
        return this.f5532a.systemNanoTime() - timeUnit.toNanos(j3);
    }

    public final long systemNanoTimeOffsetInSeconds(long j3, TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j3, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
