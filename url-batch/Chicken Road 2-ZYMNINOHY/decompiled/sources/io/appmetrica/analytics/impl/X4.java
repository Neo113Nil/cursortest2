package io.appmetrica.analytics.impl;

import a.AbstractC0124a;
import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* loaded from: classes.dex */
public class X4 implements Pa, Ea, InterfaceC0720jh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f11222a;

    /* renamed from: b, reason: collision with root package name */
    public final Q4 f11223b;

    /* renamed from: c, reason: collision with root package name */
    public final We f11224c;

    /* renamed from: d, reason: collision with root package name */
    public final Ze f11225d;

    /* renamed from: e, reason: collision with root package name */
    public final L6 f11226e;

    /* renamed from: f, reason: collision with root package name */
    public final C0980ti f11227f;

    /* renamed from: g, reason: collision with root package name */
    public final X8 f11228g;

    /* renamed from: h, reason: collision with root package name */
    public final C0703j0 f11229h;

    /* renamed from: i, reason: collision with root package name */
    public final C0729k0 f11230i;

    /* renamed from: j, reason: collision with root package name */
    public final Rk f11231j;

    /* renamed from: k, reason: collision with root package name */
    public final Qg f11232k;

    /* renamed from: l, reason: collision with root package name */
    public final M8 f11233l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f11234m;
    public final C0738k9 n;
    public final S4 o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0894q9 f11235p;

    /* renamed from: q, reason: collision with root package name */
    public final C0784m3 f11236q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f11237r;

    /* renamed from: s, reason: collision with root package name */
    public final C0977tf f11238s;

    /* renamed from: t, reason: collision with root package name */
    public final C1090xo f11239t;

    /* renamed from: u, reason: collision with root package name */
    public final Jk f11240u;
    public final C0861p2 v;

    public X4(Context context, C0622fm c0622fm, Q4 q4, C0837o4 c0837o4, InterfaceC0669hh interfaceC0669hh, V4 v4) {
        this(context, q4, new C0729k0(), new TimePassedChecker(), new C0528c5(context, q4, c0837o4, v4, c0622fm, interfaceC0669hh, C0817na.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0817na.k().l(), new P4()), c0837o4);
    }

    public final boolean A() {
        C0746kh c0746kh = (C0746kh) this.f11232k.a();
        return c0746kh.n && this.f11237r.didTimePassSeconds(this.n.f12212k, c0746kh.f12236t, "should force send permissions");
    }

    public final boolean B() {
        C0622fm c0622fm;
        C0977tf c0977tf = this.f11238s;
        c0977tf.f10815h.a(c0977tf.f10808a);
        boolean z = ((C0900qf) c0977tf.c()).f12619d;
        Qg qg = this.f11232k;
        synchronized (qg) {
            c0622fm = qg.f12499c.f10564a;
        }
        return !(z && c0622fm.f11874q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final void a(Jl jl, C0622fm c0622fm) {
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Q4 b() {
        return this.f11223b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0703j0 c0703j0 = this.f11229h;
        synchronized (c0703j0) {
            c0703j0.f12084a = new Fc();
        }
        this.f11230i.a(this.f11229h.a(), this.f11224c);
    }

    public final synchronized void e() {
        ((C0734k5) this.f11235p).d();
    }

    public final C0861p2 f() {
        return this.v;
    }

    public final C0784m3 g() {
        return this.f11236q;
    }

    @Override // io.appmetrica.analytics.impl.Ea
    public final Context getContext() {
        return this.f11222a;
    }

    public final We h() {
        return this.f11224c;
    }

    public final L6 i() {
        return this.f11226e;
    }

    public final M8 j() {
        return this.f11233l;
    }

    public final X8 k() {
        return this.f11228g;
    }

    public final C0738k9 l() {
        return this.n;
    }

    public final InterfaceC0894q9 m() {
        return this.f11235p;
    }

    public final C0746kh n() {
        return (C0746kh) this.f11232k.a();
    }

    public final String o() {
        return this.f11224c.j();
    }

    public final PublicLogger p() {
        return this.f11234m;
    }

    public final Ze q() {
        return this.f11225d;
    }

    public final Jk r() {
        return this.f11240u;
    }

    public final Rk s() {
        return this.f11231j;
    }

    public final C0622fm t() {
        C0622fm c0622fm;
        Qg qg = this.f11232k;
        synchronized (qg) {
            c0622fm = qg.f12499c.f10564a;
        }
        return c0622fm;
    }

    public final C1090xo u() {
        return this.f11239t;
    }

    public final void v() {
        C0738k9 c0738k9 = this.n;
        int i4 = c0738k9.f12211j;
        c0738k9.f12213l = i4;
        c0738k9.f12202a.a(i4).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        C1090xo c1090xo = this.f11239t;
        synchronized (c1090xo) {
            optInt = c1090xo.f13040a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = AbstractC0124a.H(new U4(this)).iterator();
            while (it.hasNext()) {
                ((T4) it.next()).a(optInt);
            }
            this.f11239t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0746kh c0746kh = (C0746kh) this.f11232k.a();
        return c0746kh.n && c0746kh.isIdentifiersValid() && this.f11237r.didTimePassSeconds(this.n.f12212k, c0746kh.f12235s, "need to check permissions");
    }

    public final boolean y() {
        C0738k9 c0738k9 = this.n;
        return c0738k9.f12213l < c0738k9.f12211j && ((C0746kh) this.f11232k.a()).o && ((C0746kh) this.f11232k.a()).isIdentifiersValid();
    }

    public final void z() {
        Qg qg = this.f11232k;
        synchronized (qg) {
            qg.f12497a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa
    public final void a(P5 p5) {
        String a3 = Qf.a("Event received on service", EnumC0508bb.a(p5.f10797d), p5.getName(), p5.getValue());
        if (a3 != null) {
            this.f11234m.info(a3, new Object[0]);
        }
        String str = this.f11223b.f10837b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f11227f.a(p5, new C0954si());
    }

    public final void b(P5 p5) {
        this.f11229h.a(p5.f10799f);
        C0678i0 a3 = this.f11229h.a();
        C0729k0 c0729k0 = this.f11230i;
        We we = this.f11224c;
        synchronized (c0729k0) {
            if (a3.f12012b > we.d().f12012b) {
                we.a(a3).b();
                this.f11234m.info("Save new app environment for %s. Value: %s", this.f11223b, a3.f12011a);
            }
        }
    }

    public X4(Context context, Q4 q4, C0729k0 c0729k0, TimePassedChecker timePassedChecker, C0528c5 c0528c5, C0837o4 c0837o4) {
        this.f11222a = context.getApplicationContext();
        this.f11223b = q4;
        this.f11230i = c0729k0;
        this.f11237r = timePassedChecker;
        C1090xo f4 = c0528c5.f();
        this.f11239t = f4;
        this.f11238s = C0817na.k().t();
        We a3 = c0528c5.e().a();
        this.f11224c = a3;
        this.v = c0528c5.a(a3);
        Qg a4 = c0528c5.a(this);
        this.f11232k = a4;
        PublicLogger a5 = c0528c5.d().a();
        this.f11234m = a5;
        this.f11225d = C0817na.k().y();
        C0703j0 a6 = c0729k0.a(q4, a5, a3);
        this.f11229h = a6;
        this.f11233l = c0528c5.a();
        L6 b4 = c0528c5.b(this);
        this.f11226e = b4;
        C1032vi d4 = c0528c5.d(this);
        this.o = C0528c5.b();
        w();
        Rk a7 = C0528c5.a(this, f4, new W4(this));
        this.f11231j = a7;
        a5.info("Read app environment for component %s. Value: %s", q4.toString(), a6.a().f12011a);
        Jk c4 = c0528c5.c();
        this.f11240u = c4;
        this.n = c0528c5.a(a3, f4, a7, b4, a6, c4, d4);
        X8 c5 = C0528c5.c(this);
        this.f11228g = c5;
        this.f11227f = C0528c5.a(this, c5);
        this.f11236q = c0528c5.b(a3);
        this.f11235p = c0528c5.a(d4, b4, a4, c0837o4, q4, a3);
        b4.d();
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ea
    public synchronized void a(C0837o4 c0837o4) {
        long j4;
        try {
            this.f11232k.a(c0837o4);
            boolean z = false;
            if (Boolean.TRUE.equals(c0837o4.f12491h)) {
                this.f11234m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0837o4.f12491h)) {
                    this.f11234m.setEnabled(false);
                }
            }
            C0861p2 c0861p2 = this.v;
            Set<String> set = c0837o4.o;
            long currentTimeMillis = c0861p2.f12556d.currentTimeMillis();
            boolean z4 = false;
            for (String str : set) {
                Long l4 = (Long) c0861p2.f12557e.get(str);
                if (l4 != null) {
                    j4 = l4.longValue();
                } else {
                    j4 = -1;
                    z4 = true;
                }
                if (currentTimeMillis - j4 > c0861p2.f12554b) {
                    c0861p2.f12557e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c0861p2.a(c0861p2.f12557e);
                c0861p2.f12553a.a(c0861p2.f12557e);
            }
            if (z4) {
                this.f11232k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Pa, io.appmetrica.analytics.impl.Ql
    public final synchronized void a(C0622fm c0622fm) {
        this.f11232k.a(c0622fm);
        ((C0734k5) this.f11235p).e();
    }

    public final void a(String str) {
        this.f11224c.j(str).b();
    }
}
