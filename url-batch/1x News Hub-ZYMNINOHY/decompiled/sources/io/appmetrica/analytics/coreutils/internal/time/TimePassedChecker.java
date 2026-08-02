package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f5533a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f5533a = timeProvider;
    }

    public final boolean didTimePassMillis(long j3, long j4, String str) {
        long currentTimeMillis = this.f5533a.currentTimeMillis();
        return currentTimeMillis < j3 || currentTimeMillis - j3 >= j4;
    }

    public final boolean didTimePassSeconds(long j3, long j4, String str) {
        long currentTimeSeconds = this.f5533a.currentTimeSeconds();
        return currentTimeSeconds < j3 || currentTimeSeconds - j3 >= j4;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
