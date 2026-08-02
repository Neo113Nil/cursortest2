package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.coreutils.internal.time.TimeProvider;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

/* renamed from: io.appmetrica.analytics.impl.k9, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0738k9 {

    /* renamed from: a, reason: collision with root package name */
    public final We f12202a;

    /* renamed from: b, reason: collision with root package name */
    public final C1090xo f12203b;

    /* renamed from: c, reason: collision with root package name */
    public final Rk f12204c;

    /* renamed from: d, reason: collision with root package name */
    public final L6 f12205d;

    /* renamed from: e, reason: collision with root package name */
    public final H8 f12206e;

    /* renamed from: f, reason: collision with root package name */
    public final Jk f12207f;

    /* renamed from: g, reason: collision with root package name */
    public final C0703j0 f12208g;

    /* renamed from: h, reason: collision with root package name */
    public final Z4 f12209h;

    /* renamed from: i, reason: collision with root package name */
    public final TimeProvider f12210i;

    /* renamed from: j, reason: collision with root package name */
    public final int f12211j;

    /* renamed from: k, reason: collision with root package name */
    public long f12212k;

    /* renamed from: l, reason: collision with root package name */
    public int f12213l;

    public C0738k9(We we, C1090xo c1090xo, Rk rk, L6 l6, C0703j0 c0703j0, H8 h8, Jk jk, int i4, Z4 z4, SystemTimeProvider systemTimeProvider) {
        this.f12202a = we;
        this.f12203b = c1090xo;
        this.f12204c = rk;
        this.f12205d = l6;
        this.f12208g = c0703j0;
        this.f12206e = h8;
        this.f12207f = jk;
        this.f12211j = i4;
        this.f12210i = systemTimeProvider;
        this.f12209h = z4;
        this.f12212k = we.i();
        this.f12213l = we.h();
    }

    public final void a(P5 p5, Tk tk) {
        long optLong;
        Map map = p5.f10807p;
        Jk jk = this.f12207f;
        jk.getClass();
        map.putAll(new HashMap(jk.f10498b));
        p5.c(this.f12202a.j());
        p5.o = Integer.valueOf(this.f12203b.b());
        C0678i0 a3 = this.f12208g.a();
        H8 h8 = this.f12206e;
        h8.getClass();
        G8 g8 = (G8) h8.f10362b.a(EnumC0508bb.a(p5.f10797d));
        L6 l6 = this.f12205d;
        C1126z8 a4 = g8.a(p5);
        int i4 = p5.f10797d;
        C1090xo c1090xo = this.f12203b;
        C0659h7 c0659h7 = new C0659h7(l6.f10572g, tk, i4, c1090xo, a4, (C0746kh) l6.f10573h.f11232k.a(), a3);
        Long valueOf = Long.valueOf(tk.f11010a);
        Vk vk = tk.f11013d;
        Long valueOf2 = Long.valueOf(tk.f11011b);
        EnumC0508bb a5 = EnumC0508bb.a(c0659h7.f11979h.f10797d);
        long j4 = 0;
        if (!AbstractC1049w9.f12930g.contains(EnumC0508bb.a(i4))) {
            synchronized (c1090xo) {
                JSONObject a6 = c1090xo.f13040a.a();
                optLong = a6.optLong("global_number", 0L);
                c1090xo.f13040a.a(a6.put("global_number", optLong + 1));
            }
            j4 = optLong;
        }
        l6.a(l6.f10577l.fromModel(new C0581e7(valueOf, vk, valueOf2, a5, Long.valueOf(j4), Long.valueOf(tk.f11012c), c0659h7.a())));
        this.f12209h.f11338a.h();
    }
}
