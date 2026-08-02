package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.r9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0797r9 {

    /* renamed from: a, reason: collision with root package name */
    public final C0390bf f8214a;

    /* renamed from: b, reason: collision with root package name */
    public final zo f8215b;

    /* renamed from: c, reason: collision with root package name */
    public final Wk f8216c;

    /* renamed from: d, reason: collision with root package name */
    public final S6 f8217d;

    /* renamed from: e, reason: collision with root package name */
    public final M8 f8218e;
    public final Ok f;

    /* renamed from: g, reason: collision with root package name */
    public final C0581j0 f8219g;

    /* renamed from: h, reason: collision with root package name */
    public final Y8 f8220h;

    /* renamed from: i, reason: collision with root package name */
    public final C0509g5 f8221i;

    /* renamed from: j, reason: collision with root package name */
    public final TimeProvider f8222j;

    /* renamed from: k, reason: collision with root package name */
    public final int f8223k;

    /* renamed from: l, reason: collision with root package name */
    public long f8224l;

    /* renamed from: m, reason: collision with root package name */
    public int f8225m;

    public C0797r9(C0390bf c0390bf, zo zoVar, Wk wk, S6 s6, C0581j0 c0581j0, M8 m8, Ok ok, int i3, C0509g5 c0509g5, Y8 y8, SystemTimeProvider systemTimeProvider) {
        this.f8214a = c0390bf;
        this.f8215b = zoVar;
        this.f8216c = wk;
        this.f8217d = s6;
        this.f8219g = c0581j0;
        this.f8218e = m8;
        this.f = ok;
        this.f8223k = i3;
        this.f8220h = y8;
        this.f8222j = systemTimeProvider;
        this.f8221i = c0509g5;
        this.f8224l = c0390bf.i();
        this.f8225m = c0390bf.h();
    }

    public final void a(W5 w5, Yk yk) {
        Map map = w5.f6828p;
        Ok ok = this.f;
        ok.getClass();
        map.putAll(new HashMap(ok.f6418b));
        w5.c(this.f8214a.j());
        w5.o = Integer.valueOf(this.f8215b.b());
        C0556i0 a3 = this.f8219g.a();
        M8 m8 = this.f8218e;
        m8.getClass();
        L8 l8 = (L8) m8.f6327b.a(EnumC0567ib.a(w5.f6818d));
        S6 s6 = this.f8217d;
        E8 a4 = l8.a(w5);
        int i3 = w5.f6818d;
        Y8 y8 = this.f8220h;
        C0744p7 c0744p7 = new C0744p7(s6.f6603g, yk, i3, y8, a4, (C0754ph) s6.f6604h.f7234k.a(), a3);
        Long valueOf = Long.valueOf(yk.f6914a);
        EnumC0370al enumC0370al = yk.f6917d;
        Long valueOf2 = Long.valueOf(yk.f6915b);
        EnumC0567ib a5 = EnumC0567ib.a(c0744p7.f8068h.f6818d);
        long j3 = 0;
        if (!D9.f5891g.contains(EnumC0567ib.a(i3))) {
            zo zoVar = y8.f6897b;
            synchronized (zoVar) {
                j3 = zoVar.f8716a.a().optLong("global_number", 0L);
            }
            y8.f6897b.b(1 + j3);
        }
        s6.a(s6.f6608l.fromModel(new C0666m7(valueOf, enumC0370al, valueOf2, a5, Long.valueOf(j3), Long.valueOf(yk.f6916c), c0744p7.a())));
        this.f8221i.f7356a.h();
    }
}
