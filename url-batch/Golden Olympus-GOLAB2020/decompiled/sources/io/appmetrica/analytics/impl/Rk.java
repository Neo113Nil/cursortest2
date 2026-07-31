package io.appmetrica.analytics.impl;

/* loaded from: classes3.dex */
public final class Rk {

    /* renamed from: a, reason: collision with root package name */
    public final C3024uo f38215a;

    public Rk(C3024uo c3024uo) {
        this.f38215a = c3024uo;
    }

    public final long a() {
        long optLong;
        C3024uo c3024uo = this.f38215a;
        synchronized (c3024uo) {
            optLong = c3024uo.f39951a.a().optLong("session_id", -1L);
        }
        long j4 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f38215a.c(j4);
        return j4;
    }
}
