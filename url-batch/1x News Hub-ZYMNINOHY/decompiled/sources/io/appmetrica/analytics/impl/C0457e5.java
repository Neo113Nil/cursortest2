package io.appmetrica.analytics.impl;

import a.AbstractC0129a;
import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.e5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0457e5 implements Wa, La, InterfaceC0728oh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f7225a;

    /* renamed from: b, reason: collision with root package name */
    public final X4 f7226b;

    /* renamed from: c, reason: collision with root package name */
    public final C0390bf f7227c;

    /* renamed from: d, reason: collision with root package name */
    public final C0467ef f7228d;

    /* renamed from: e, reason: collision with root package name */
    public final S6 f7229e;
    public final C0987yi f;

    /* renamed from: g, reason: collision with root package name */
    public final C0461e9 f7230g;

    /* renamed from: h, reason: collision with root package name */
    public final C0581j0 f7231h;

    /* renamed from: i, reason: collision with root package name */
    public final C0607k0 f7232i;

    /* renamed from: j, reason: collision with root package name */
    public final Wk f7233j;

    /* renamed from: k, reason: collision with root package name */
    public final Vg f7234k;

    /* renamed from: l, reason: collision with root package name */
    public final R8 f7235l;

    /* renamed from: m, reason: collision with root package name */
    public final PublicLogger f7236m;

    /* renamed from: n, reason: collision with root package name */
    public final C0797r9 f7237n;
    public final Z4 o;

    /* renamed from: p, reason: collision with root package name */
    public final InterfaceC0953x9 f7238p;

    /* renamed from: q, reason: collision with root package name */
    public final C0869u3 f7239q;

    /* renamed from: r, reason: collision with root package name */
    public final TimePassedChecker f7240r;

    /* renamed from: s, reason: collision with root package name */
    public final C0984yf f7241s;

    /* renamed from: t, reason: collision with root package name */
    public final zo f7242t;

    /* renamed from: u, reason: collision with root package name */
    public final Ok f7243u;
    public final C0946x2 v;

    public C0457e5(Context context, C0603jm c0603jm, X4 x4, C0896v4 c0896v4, InterfaceC0676mh interfaceC0676mh, AbstractC0406c5 abstractC0406c5) {
        this(context, x4, new C0607k0(), new TimePassedChecker(), new C0586j5(context, x4, c0896v4, abstractC0406c5, c0603jm, interfaceC0676mh, C0876ua.k().x().d(), PackageManagerUtils.getAppVersionCodeInt(context), C0876ua.k().l(), new W4()), c0896v4);
    }

    public final boolean A() {
        C0754ph c0754ph = (C0754ph) this.f7234k.a();
        return c0754ph.f8091n && this.f7240r.didTimePassSeconds(this.f7237n.f8224l, c0754ph.f8096t, "should force send permissions");
    }

    public final boolean B() {
        C0603jm c0603jm;
        C0984yf c0984yf = this.f7241s;
        c0984yf.f6790h.a(c0984yf.f6784a);
        boolean z = ((C0907vf) c0984yf.c()).f8520d;
        Vg vg = this.f7234k;
        synchronized (vg) {
            c0603jm = vg.f8492c.f6596a;
        }
        return !(z && c0603jm.f7677q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final void a(Nl nl, C0603jm c0603jm) {
    }

    @Override // io.appmetrica.analytics.impl.La
    public final X4 b() {
        return this.f7226b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0581j0 c0581j0 = this.f7231h;
        synchronized (c0581j0) {
            c0581j0.f7580a = new Mc();
        }
        this.f7232i.a(this.f7231h.a(), this.f7227c);
    }

    public final synchronized void e() {
        ((C0793r5) this.f7238p).d();
    }

    public final C0946x2 f() {
        return this.v;
    }

    public final C0869u3 g() {
        return this.f7239q;
    }

    @Override // io.appmetrica.analytics.impl.La
    public final Context getContext() {
        return this.f7225a;
    }

    public final C0390bf h() {
        return this.f7227c;
    }

    public final S6 i() {
        return this.f7229e;
    }

    public final R8 j() {
        return this.f7235l;
    }

    public final C0461e9 k() {
        return this.f7230g;
    }

    public final C0797r9 l() {
        return this.f7237n;
    }

    public final InterfaceC0953x9 m() {
        return this.f7238p;
    }

    public final C0754ph n() {
        return (C0754ph) this.f7234k.a();
    }

    public final String o() {
        return this.f7227c.j();
    }

    public final PublicLogger p() {
        return this.f7236m;
    }

    public final C0467ef q() {
        return this.f7228d;
    }

    public final Ok r() {
        return this.f7243u;
    }

    public final Wk s() {
        return this.f7233j;
    }

    public final C0603jm t() {
        C0603jm c0603jm;
        Vg vg = this.f7234k;
        synchronized (vg) {
            c0603jm = vg.f8492c.f6596a;
        }
        return c0603jm;
    }

    public final zo u() {
        return this.f7242t;
    }

    public final void v() {
        C0797r9 c0797r9 = this.f7237n;
        int i3 = c0797r9.f8223k;
        c0797r9.f8225m = i3;
        c0797r9.f8214a.a(i3).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        zo zoVar = this.f7242t;
        synchronized (zoVar) {
            optInt = zoVar.f8716a.a().optInt("last_migration_api_level", 0);
        }
        if (optInt < libraryApiLevel) {
            this.o.getClass();
            Iterator it = AbstractC0129a.r(new C0380b5(this)).iterator();
            while (it.hasNext()) {
                ((AbstractC0354a5) it.next()).a(optInt);
            }
            this.f7242t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0754ph c0754ph = (C0754ph) this.f7234k.a();
        return c0754ph.f8091n && c0754ph.isIdentifiersValid() && this.f7240r.didTimePassSeconds(this.f7237n.f8224l, c0754ph.f8095s, "need to check permissions");
    }

    public final boolean y() {
        C0797r9 c0797r9 = this.f7237n;
        return c0797r9.f8225m < c0797r9.f8223k && ((C0754ph) this.f7234k.a()).o && ((C0754ph) this.f7234k.a()).isIdentifiersValid();
    }

    public final void z() {
        Vg vg = this.f7234k;
        synchronized (vg) {
            vg.f8490a = null;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa
    public final void a(W5 w5) {
        String a3 = Vf.a("Event received on service", EnumC0567ib.a(w5.f6818d), w5.getName(), w5.getValue());
        if (a3 != null) {
            this.f7236m.info(a3, new Object[0]);
        }
        String str = this.f7226b.f6861b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f.a(w5, new C0962xi());
    }

    public final void b(W5 w5) {
        this.f7231h.a(w5.f);
        C0556i0 a3 = this.f7231h.a();
        C0607k0 c0607k0 = this.f7232i;
        C0390bf c0390bf = this.f7227c;
        synchronized (c0607k0) {
            if (a3.f7492b > c0390bf.d().f7492b) {
                c0390bf.a(a3).b();
                this.f7236m.info("Save new app environment for %s. Value: %s", this.f7226b, a3.f7491a);
            }
        }
    }

    public C0457e5(Context context, X4 x4, C0607k0 c0607k0, TimePassedChecker timePassedChecker, C0586j5 c0586j5, C0896v4 c0896v4) {
        this.f7225a = context.getApplicationContext();
        this.f7226b = x4;
        this.f7232i = c0607k0;
        this.f7240r = timePassedChecker;
        zo f = c0586j5.f();
        this.f7242t = f;
        this.f7241s = C0876ua.k().t();
        C0390bf a3 = c0586j5.e().a();
        this.f7227c = a3;
        this.v = c0586j5.a(a3);
        Vg a4 = c0586j5.a(this);
        this.f7234k = a4;
        PublicLogger a5 = c0586j5.d().a();
        this.f7236m = a5;
        this.f7228d = C0876ua.k().z();
        C0581j0 a6 = c0607k0.a(x4, a5, a3);
        this.f7231h = a6;
        this.f7235l = c0586j5.a();
        S6 b3 = c0586j5.b(this);
        this.f7229e = b3;
        Ai d3 = c0586j5.d(this);
        this.o = C0586j5.b();
        w();
        Wk a7 = C0586j5.a(this, f, new C0432d5(this));
        this.f7233j = a7;
        a5.info("Read app environment for component %s. Value: %s", x4.toString(), a6.a().f7491a);
        Ok c3 = c0586j5.c();
        this.f7243u = c3;
        this.f7237n = c0586j5.a(a3, f, a7, b3, a6, c3, d3);
        C0461e9 c4 = C0586j5.c(this);
        this.f7230g = c4;
        this.f = C0586j5.a(this, c4);
        this.f7239q = c0586j5.b(a3);
        this.f7238p = c0586j5.a(d3, b3, a4, c0896v4, x4, a3);
        b3.e();
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.La
    public synchronized void a(C0896v4 c0896v4) {
        long j3;
        try {
            this.f7234k.a(c0896v4);
            boolean z = false;
            if (Boolean.TRUE.equals(c0896v4.f8483h)) {
                this.f7236m.setEnabled(true);
            } else {
                if (Boolean.FALSE.equals(c0896v4.f8483h)) {
                    this.f7236m.setEnabled(false);
                }
            }
            C0946x2 c0946x2 = this.v;
            Set<String> set = c0896v4.o;
            long currentTimeMillis = c0946x2.f8609d.currentTimeMillis();
            boolean z2 = false;
            for (String str : set) {
                Long l3 = (Long) c0946x2.f8610e.get(str);
                if (l3 != null) {
                    j3 = l3.longValue();
                } else {
                    j3 = -1;
                    z2 = true;
                }
                if (currentTimeMillis - j3 > c0946x2.f8607b) {
                    c0946x2.f8610e.put(str, Long.valueOf(currentTimeMillis));
                    z = true;
                }
            }
            if (z) {
                c0946x2.a(c0946x2.f8610e);
                c0946x2.f8606a.a(c0946x2.f8610e);
            }
            if (z2) {
                this.f7234k.e();
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // io.appmetrica.analytics.impl.Wa, io.appmetrica.analytics.impl.Ul
    public final synchronized void a(C0603jm c0603jm) {
        this.f7234k.a(c0603jm);
        ((C0793r5) this.f7238p).e();
    }

    public final void a(String str) {
        this.f7227c.j(str).b();
    }
}
