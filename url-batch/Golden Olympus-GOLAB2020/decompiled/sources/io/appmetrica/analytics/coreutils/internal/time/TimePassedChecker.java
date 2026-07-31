package io.appmetrica.analytics.coreutils.internal.time;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f37072a;

    public TimePassedChecker(@NotNull TimeProvider timeProvider) {
        this.f37072a = timeProvider;
    }

    public final boolean didTimePassMillis(long j4, long j5, @NotNull String str) {
        long currentTimeMillis = this.f37072a.currentTimeMillis();
        return currentTimeMillis < j4 || currentTimeMillis - j4 >= j5;
    }

    public final boolean didTimePassSeconds(long j4, long j5, @NotNull String str) {
        long currentTimeSeconds = this.f37072a.currentTimeSeconds();
        return currentTimeSeconds < j4 || currentTimeSeconds - j4 >= j5;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
