package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f9787a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f9787a = timeProvider;
    }

    public final boolean didTimePassMillis(long j4, long j5, String str) {
        long currentTimeMillis = this.f9787a.currentTimeMillis();
        return currentTimeMillis < j4 || currentTimeMillis - j4 >= j5;
    }

    public final boolean didTimePassSeconds(long j4, long j5, String str) {
        long currentTimeSeconds = this.f9787a.currentTimeSeconds();
        return currentTimeSeconds < j4 || currentTimeSeconds - j4 >= j5;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
