package io.appmetrica.analytics.coreutils.internal.time;

/* loaded from: classes.dex */
public final class TimePassedChecker {

    /* renamed from: a, reason: collision with root package name */
    private final TimeProvider f6298a;

    public TimePassedChecker(TimeProvider timeProvider) {
        this.f6298a = timeProvider;
    }

    public final boolean didTimePassMillis(long j2, long j6, String str) {
        long currentTimeMillis = this.f6298a.currentTimeMillis();
        return currentTimeMillis < j2 || currentTimeMillis - j2 >= j6;
    }

    public final boolean didTimePassSeconds(long j2, long j6, String str) {
        long currentTimeSeconds = this.f6298a.currentTimeSeconds();
        return currentTimeSeconds < j2 || currentTimeSeconds - j2 >= j6;
    }

    public TimePassedChecker() {
        this(new SystemTimeProvider());
    }
}
