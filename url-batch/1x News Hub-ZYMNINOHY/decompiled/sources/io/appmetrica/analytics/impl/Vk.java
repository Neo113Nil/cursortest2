package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vk {

    /* renamed from: a, reason: collision with root package name */
    public final zo f6804a;

    public Vk(zo zoVar) {
        this.f6804a = zoVar;
    }

    public final long a() {
        long optLong;
        zo zoVar = this.f6804a;
        synchronized (zoVar) {
            optLong = zoVar.f8716a.a().optLong("session_id", -1L);
        }
        long j3 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f6804a.c(j3);
        return j3;
    }
}
