package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;

/* loaded from: classes.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f5522a;

    /* renamed from: b, reason: collision with root package name */
    private int f5523b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f5524c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f5525d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j3, int i3, EventFrequencyStorage eventFrequencyStorage) {
        this.f5522a = j3;
        this.f5523b = i3;
        this.f5524c = eventFrequencyStorage;
    }

    public final boolean detect(String str) {
        long longValue;
        long uptimeMillis = this.f5525d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f5524c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j3 = uptimeMillis - longValue;
        if (j3 < 0 || j3 > this.f5522a) {
            this.f5524c.putWindowStart(str, uptimeMillis);
            this.f5524c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f5524c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f5524c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f5523b;
    }

    public final synchronized void updateParameters(long j3, int i3) {
        this.f5522a = j3;
        this.f5523b = i3;
    }
}
