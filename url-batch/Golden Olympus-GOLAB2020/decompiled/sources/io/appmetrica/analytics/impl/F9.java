package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class F9 {

    /* renamed from: a, reason: collision with root package name */
    public final C2756kf f37517a;

    /* renamed from: b, reason: collision with root package name */
    public final C3024uo f37518b;

    /* renamed from: c, reason: collision with root package name */
    public final Sk f37519c;

    /* renamed from: d, reason: collision with root package name */
    public final C2645g7 f37520d;

    /* renamed from: e, reason: collision with root package name */
    public final C2486a9 f37521e;

    /* renamed from: f, reason: collision with root package name */
    public final Kk f37522f;

    /* renamed from: g, reason: collision with root package name */
    public final C2664h0 f37523g;

    /* renamed from: h, reason: collision with root package name */
    public final C2802m9 f37524h;

    /* renamed from: i, reason: collision with root package name */
    public final C3005u5 f37525i;

    /* renamed from: j, reason: collision with root package name */
    public final TimeProvider f37526j;

    /* renamed from: k, reason: collision with root package name */
    public final int f37527k;

    /* renamed from: l, reason: collision with root package name */
    public long f37528l;

    /* renamed from: m, reason: collision with root package name */
    public int f37529m;

    public F9(C2756kf c2756kf, C3024uo c3024uo, Sk sk, C2645g7 c2645g7, C2664h0 c2664h0, C2486a9 c2486a9, Kk kk, int i4, C3005u5 c3005u5, C2802m9 c2802m9, SystemTimeProvider systemTimeProvider) {
        this.f37517a = c2756kf;
        this.f37518b = c3024uo;
        this.f37519c = sk;
        this.f37520d = c2645g7;
        this.f37523g = c2664h0;
        this.f37521e = c2486a9;
        this.f37522f = kk;
        this.f37527k = i4;
        this.f37524h = c2802m9;
        this.f37526j = systemTimeProvider;
        this.f37525i = c3005u5;
        this.f37528l = c2756kf.h();
        this.f37529m = c2756kf.g();
    }

    public final void a(C2773l6 c2773l6, Uk uk) {
        Map map = c2773l6.f39391p;
        Kk kk = this.f37522f;
        kk.getClass();
        map.putAll(new HashMap(kk.f37900b));
        c2773l6.c(this.f37517a.i());
        c2773l6.f39390o = Integer.valueOf(this.f37518b.b());
        C2638g0 a4 = this.f37523g.a();
        C2486a9 c2486a9 = this.f37521e;
        c2486a9.getClass();
        Z8 z8 = (Z8) c2486a9.f38668b.a(EnumC3063wb.a(c2773l6.f39379d));
        C2645g7 c2645g7 = this.f37520d;
        S8 a5 = z8.a(c2773l6);
        int i4 = c2773l6.f39379d;
        C2802m9 c2802m9 = this.f37524h;
        D7 d7 = new D7(c2645g7.f39048g, uk, i4, c2802m9, a5, (C3095xh) c2645g7.f39049h.f39775k.a(), a4);
        Long valueOf = Long.valueOf(uk.f38378a);
        Wk wk = uk.f38381d;
        Long valueOf2 = Long.valueOf(uk.f38379b);
        EnumC3063wb a6 = EnumC3063wb.a(d7.f37349h.f39379d);
        long j4 = 0;
        if (!R9.f38192g.contains(EnumC3063wb.a(i4))) {
            C3024uo c3024uo = c2802m9.f39441b;
            synchronized (c3024uo) {
                j4 = c3024uo.f39951a.a().optLong("global_number", 0L);
            }
            c2802m9.f39441b.b(1 + j4);
        }
        c2645g7.a(c2645g7.f39053l.fromModel(new A7(valueOf, wk, valueOf2, a6, Long.valueOf(j4), Long.valueOf(uk.f38380c), d7.a())));
        this.f37525i.f39894a.h();
    }
}
