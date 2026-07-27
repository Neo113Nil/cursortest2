package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0948r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0541bf f9148a;

    /* renamed from: b, reason: collision with root package name */
    public final zo f9149b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f9150c;

    /* renamed from: d, reason: collision with root package name */
    public final S6 f9151d;

    /* renamed from: e, reason: collision with root package name */
    public final M8 f9152e;

    /* renamed from: f, reason: collision with root package name */
    public final Ok f9153f;

    /* renamed from: g, reason: collision with root package name */
    public final C0732j0 f9154g;

    /* renamed from: h, reason: collision with root package name */
    public final Y8 f9155h;

    /* renamed from: i, reason: collision with root package name */
    public final C0660g5 f9156i;

    /* renamed from: j, reason: collision with root package name */
    public final TimeProvider f9157j;

    /* renamed from: k, reason: collision with root package name */
    public final int f9158k;

    /* renamed from: l, reason: collision with root package name */
    public long f9159l;

    /* renamed from: m, reason: collision with root package name */
    public int f9160m;

    public C0948r9(C0541bf c0541bf, zo zoVar, Wk wk, S6 s6, C0732j0 c0732j0, M8 m8, Ok ok, int i2, C0660g5 c0660g5, Y8 y8, SystemTimeProvider systemTimeProvider) {
        this.f9148a = c0541bf;
        this.f9149b = zoVar;
        this.f9150c = wk;
        this.f9151d = s6;
        this.f9154g = c0732j0;
        this.f9152e = m8;
        this.f9153f = ok;
        this.f9158k = i2;
        this.f9155h = y8;
        this.f9157j = systemTimeProvider;
        this.f9156i = c0660g5;
        this.f9159l = c0541bf.i();
        this.f9160m = c0541bf.h();
    }

    public final void a(W5 w5, Yk yk) {
        Map map = w5.f7663p;
        Ok ok = this.f9153f;
        ok.getClass();
        map.putAll(new HashMap(ok.f7229b));
        w5.c(this.f9148a.j());
        w5.f7662o = Integer.valueOf(this.f9149b.b());
        C0707i0 a6 = this.f9154g.a();
        M8 m8 = this.f9152e;
        m8.getClass();
        L8 l8 = (L8) m8.f7136b.a(EnumC0718ib.a(w5.f7651d));
        S6 s6 = this.f9151d;
        E8 a7 = l8.a(w5);
        int i2 = w5.f7651d;
        Y8 y8 = this.f9155h;
        C0895p7 c0895p7 = new C0895p7(s6.f7426g, yk, i2, y8, a7, (C0905ph) s6.f7427h.f8095k.a(), a6);
        Long valueOf = Long.valueOf(yk.f7754a);
        EnumC0521al enumC0521al = yk.f7757d;
        Long valueOf2 = Long.valueOf(yk.f7755b);
        EnumC0718ib a8 = EnumC0718ib.a(c0895p7.f8993h.f7651d);
        long j2 = 0;
        if (!D9.f6676g.contains(EnumC0718ib.a(i2))) {
            zo zoVar = y8.f7736b;
            synchronized (zoVar) {
                j2 = zoVar.f9678a.a().optLong("global_number", 0L);
            }
            y8.f7736b.b(1 + j2);
        }
        s6.a(s6.f7431l.fromModel(new C0817m7(valueOf, enumC0521al, valueOf2, a8, Long.valueOf(j2), Long.valueOf(yk.f7756c), c0895p7.a())));
        this.f9156i.f8226a.h();
    }
}
