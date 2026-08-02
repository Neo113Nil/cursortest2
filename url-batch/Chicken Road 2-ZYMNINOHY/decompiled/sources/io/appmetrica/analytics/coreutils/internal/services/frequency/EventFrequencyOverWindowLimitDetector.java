package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f9776a;

    /* renamed from: b, reason: collision with root package name */
    private int f9777b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f9778c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f9779d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j4, int i4, EventFrequencyStorage eventFrequencyStorage) {
        this.f9776a = j4;
        this.f9777b = i4;
        this.f9778c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f9779d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f9778c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j4 = uptimeMillis - longValue;
        if (j4 < 0 || j4 > this.f9776a) {
            this.f9778c.putWindowStart(str, uptimeMillis);
            this.f9778c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f9778c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f9778c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f9777b;
    }

    public final synchronized void updateParameters(long j4, int i4) {
        this.f9776a = j4;
        this.f9777b = i4;
    }
}
