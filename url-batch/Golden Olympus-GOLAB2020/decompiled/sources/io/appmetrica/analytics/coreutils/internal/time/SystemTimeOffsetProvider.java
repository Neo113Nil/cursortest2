package io.appmetrica.analytics.coreutils.internal.time;

import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class SystemTimeOffsetProvider {

    /* renamed from: a, reason: collision with root package name */
    private final SystemTimeProvider f37071a;

    public SystemTimeOffsetProvider(@NotNull SystemTimeProvider systemTimeProvider) {
        this.f37071a = systemTimeProvider;
    }

    public final long elapsedRealtimeOffset(long j4, @NotNull TimeUnit timeUnit) {
        return this.f37071a.elapsedRealtime() - timeUnit.toMillis(j4);
    }

    public final long elapsedRealtimeOffsetInSeconds(long j4, @NotNull TimeUnit timeUnit) {
        return TimeUnit.MILLISECONDS.toSeconds(elapsedRealtimeOffset(j4, timeUnit));
    }

    public final long offsetInSecondsIfNotZero(long j4, @NotNull TimeUnit timeUnit) {
        if (j4 == 0) {
            return 0L;
        }
        return this.f37071a.currentTimeSeconds() - timeUnit.toSeconds(j4);
    }

    public final long systemNanoTimeOffsetInNanos(long j4, @NotNull TimeUnit timeUnit) {
        return this.f37071a.systemNanoTime() - timeUnit.toNanos(j4);
    }

    public final long systemNanoTimeOffsetInSeconds(long j4, @NotNull TimeUnit timeUnit) {
        return TimeUnit.NANOSECONDS.toSeconds(systemNanoTimeOffsetInNanos(j4, timeUnit));
    }

    public SystemTimeOffsetProvider() {
        this(new SystemTimeProvider());
    }
}
