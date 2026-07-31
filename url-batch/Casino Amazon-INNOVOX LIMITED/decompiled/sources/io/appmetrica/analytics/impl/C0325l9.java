package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.l9, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0325l9 {

    /* renamed from: a, reason: collision with root package name */
    public final Xe f1357a;
    public final yo b;
    public final Sk c;
    public final M6 d;
    public final I8 e;
    public final Kk f;
    public final C0264j0 g;
    public final C0037a5 h;
    public final TimeProvider i;
    public final int j;
    public long k;
    public int l;

    public C0325l9(Xe xe, yo yoVar, Sk sk, M6 m6, C0264j0 c0264j0, I8 i8, Kk kk, int i, C0037a5 c0037a5, SystemTimeProvider systemTimeProvider) {
        this.f1357a = xe;
        this.b = yoVar;
        this.c = sk;
        this.d = m6;
        this.g = c0264j0;
        this.e = i8;
        this.f = kk;
        this.j = i;
        this.i = systemTimeProvider;
        this.h = c0037a5;
        this.k = xe.i();
        this.l = xe.h();
    }

    public final void a(Q5 q5, Uk uk) {
        long optLong;
        Map map = q5.p;
        Kk kk = this.f;
        kk.getClass();
        map.putAll(new HashMap(kk.b));
        q5.c(this.f1357a.j());
        q5.o = Integer.valueOf(this.b.b());
        C0239i0 a2 = this.g.a();
        I8 i8 = this.e;
        i8.getClass();
        H8 h8 = (H8) i8.b.a(EnumC0095cb.a(q5.d));
        M6 m6 = this.d;
        A8 a3 = h8.a(q5);
        int i = q5.d;
        yo yoVar = this.b;
        C0246i7 c0246i7 = new C0246i7(m6.g, uk, i, yoVar, a3, (C0333lh) m6.h.k.a(), a2);
        Long valueOf = Long.valueOf(uk.f1080a);
        Wk wk = uk.d;
        Long valueOf2 = Long.valueOf(uk.b);
        EnumC0095cb a4 = EnumC0095cb.a(c0246i7.h.d);
        long j = 0;
        if (!AbstractC0624x9.g.contains(EnumC0095cb.a(i))) {
            synchronized (yoVar) {
                JSONObject a5 = yoVar.f1591a.a();
                optLong = a5.optLong("global_number", 0L);
                yoVar.f1591a.a(a5.put("global_number", optLong + 1));
            }
            j = optLong;
        }
        m6.a(m6.l.fromModel(new C0168f7(valueOf, wk, valueOf2, a4, Long.valueOf(j), Long.valueOf(uk.c), c0246i7.a())));
        this.h.f1157a.h();
    }
}
