package io.appmetrica.analytics.coreutils.internal.services.frequency;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata
/* loaded from: classes3.dex */
public final class EventFrequencyOverWindowLimitDetector {

    /* renamed from: a, reason: collision with root package name */
    private long f37061a;

    /* renamed from: b, reason: collision with root package name */
    private int f37062b;

    /* renamed from: c, reason: collision with root package name */
    private final EventFrequencyStorage f37063c;

    /* renamed from: d, reason: collision with root package name */
    private final SystemTimeProvider f37064d = new SystemTimeProvider();

    public EventFrequencyOverWindowLimitDetector(long j4, int i4, @NotNull EventFrequencyStorage eventFrequencyStorage) {
        this.f37061a = j4;
        this.f37062b = i4;
        this.f37063c = eventFrequencyStorage;
    }

    public final boolean detect(@NotNull String str) {
        long longValue;
        long uptimeMillis = this.f37064d.uptimeMillis();
        EventFrequencyStorage eventFrequencyStorage = this.f37063c;
        Long windowStart = eventFrequencyStorage.getWindowStart(str);
        if (windowStart == null) {
            eventFrequencyStorage.putWindowStart(str, uptimeMillis);
            longValue = uptimeMillis;
        } else {
            longValue = windowStart.longValue();
        }
        long j4 = uptimeMillis - longValue;
        if (j4 < 0 || j4 > this.f37061a) {
            this.f37063c.putWindowStart(str, uptimeMillis);
            this.f37063c.putWindowOccurrencesCount(str, 1);
            return false;
        }
        Integer windowOccurrencesCount = this.f37063c.getWindowOccurrencesCount(str);
        int intValue = (windowOccurrencesCount != null ? windowOccurrencesCount.intValue() : 0) + 1;
        this.f37063c.putWindowOccurrencesCount(str, intValue);
        return intValue > this.f37062b;
    }

    public final synchronized void updateParameters(long j4, int i4) {
        this.f37061a = j4;
        this.f37062b = i4;
    }
}
