package io.appmetrica.analytics.impl;

/* loaded from: classes.dex */
public final class Qk {

    /* renamed from: a, reason: collision with root package name */
    public final C1090xo f10849a;

    public Qk(C1090xo c1090xo) {
        this.f10849a = c1090xo;
    }

    public final long a() {
        long optLong;
        C1090xo c1090xo = this.f10849a;
        synchronized (c1090xo) {
            optLong = c1090xo.f13040a.a().optLong("session_id", -1L);
        }
        long j4 = optLong >= 10000000000L ? 1 + optLong : 10000000000L;
        this.f10849a.b(j4);
        return j4;
    }
}
