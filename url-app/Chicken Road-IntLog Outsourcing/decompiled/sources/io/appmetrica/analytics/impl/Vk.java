package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Vk {

    /* renamed from: a, reason: collision with root package name */
    public final zo f7637a;

    public Vk(zo zoVar) {
        this.f7637a = zoVar;
    }

    public final long a() {
        long optLong;
        zo zoVar = this.f7637a;
        synchronized (zoVar) {
            optLong = zoVar.f9678a.a().optLong("session_id", -1L);
        }
        long j2 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f7637a.c(j2);
        return j2;
    }
}
