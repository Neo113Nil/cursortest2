package io.appmetrica.analytics.coreutils.internal.services.frequency;

import java.util.LinkedHashMap;

/* loaded from: classes.dex */
public final class InMemoryEventFrequencyStorage implements EventFrequencyStorage {

    /* renamed from: a, reason: collision with root package name */
    private final LinkedHashMap f9780a = new LinkedHashMap();

    /* renamed from: b, reason: collision with root package name */
    private final LinkedHashMap f9781b = new LinkedHashMap();

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Integer getWindowOccurrencesCount(String str) {
        return (Integer) this.f9781b.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public Long getWindowStart(String str) {
        return (Long) this.f9780a.get(str);
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowOccurrencesCount(String str, int i4) {
        this.f9781b.put(str, Integer.valueOf(i4));
    }

    @Override // io.appmetrica.analytics.coreutils.internal.services.frequency.EventFrequencyStorage
    public void putWindowStart(String str, long j4) {
        this.f9780a.put(str, Long.valueOf(j4));
    }
}
