package io.appmetrica.analytics.impl;

import android.content.Context;
import android.text.TextUtils;
import io.appmetrica.analytics.AppMetrica;
import io.appmetrica.analytics.coreutils.internal.services.PackageManagerUtils;
import io.appmetrica.analytics.coreutils.internal.time.TimePassedChecker;
import io.appmetrica.analytics.internal.CounterConfigurationReporterType;
import io.appmetrica.analytics.logger.appmetrica.internal.PublicLogger;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.collections.CollectionsKt;

/* loaded from: classes3.dex */
public class Y4 implements Qa, Fa, InterfaceC0307kh {

    /* renamed from: a, reason: collision with root package name */
    public final Context f1126a;
    public final R4 b;
    public final Xe c;
    public final C0047af d;
    public final M6 e;
    public final C0558ui f;
    public final Y8 g;
    public final C0264j0 h;
    public final C0290k0 i;
    public final Sk j;
    public final Rg k;
    public final N8 l;
    public final PublicLogger m;
    public final C0325l9 n;
    public final T4 o;
    public final InterfaceC0474r9 p;
    public final C0369n3 q;
    public final TimePassedChecker r;
    public final C0555uf s;
    public final yo t;
    public final Kk u;
    public final C0443q2 v;

    public Y4(Context context, C0209gm c0209gm, R4 r4, C0420p4 c0420p4, InterfaceC0255ih interfaceC0255ih, W4 w4) {
        this(context, r4, new C0290k0(), new TimePassedChecker(), new C0115d5(context, r4, c0420p4, w4, c0209gm, interfaceC0255ih, C0401oa.k().w().c(), PackageManagerUtils.getAppVersionCodeInt(context), C0401oa.k().l(), new Q4()), c0420p4);
    }

    public final boolean A() {
        C0333lh c0333lh = (C0333lh) this.k.a();
        return c0333lh.n && this.r.didTimePassSeconds(this.n.k, c0333lh.t, "should force send permissions");
    }

    public final boolean B() {
        C0209gm c0209gm;
        C0555uf c0555uf = this.s;
        c0555uf.h.a(c0555uf.f1015a);
        boolean z = ((C0480rf) c0555uf.c()).d;
        Rg rg = this.k;
        synchronized (rg) {
            c0209gm = rg.c.f949a;
        }
        return !(z && c0209gm.q);
    }

    public void C() {
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final void a(Kl kl, C0209gm c0209gm) {
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final R4 b() {
        return this.b;
    }

    public CounterConfigurationReporterType c() {
        return CounterConfigurationReporterType.MANUAL;
    }

    public final void d() {
        C0264j0 c0264j0 = this.h;
        synchronized (c0264j0) {
            c0264j0.f1313a = new Gc();
        }
        this.i.a(this.h.a(), this.c);
    }

    public final synchronized void e() {
        ((C0321l5) this.p).d();
    }

    public final C0443q2 f() {
        return this.v;
    }

    public final C0369n3 g() {
        return this.q;
    }

    @Override // io.appmetrica.analytics.impl.Fa
    public final Context getContext() {
        return this.f1126a;
    }

    public final Xe h() {
        return this.c;
    }

    public final M6 i() {
        return this.e;
    }

    public final N8 j() {
        return this.l;
    }

    public final Y8 k() {
        return this.g;
    }

    public final C0325l9 l() {
        return this.n;
    }

    public final InterfaceC0474r9 m() {
        return this.p;
    }

    public final C0333lh n() {
        return (C0333lh) this.k.a();
    }

    public final String o() {
        return this.c.j();
    }

    public final PublicLogger p() {
        return this.m;
    }

    public final C0047af q() {
        return this.d;
    }

    public final Kk r() {
        return this.u;
    }

    public final Sk s() {
        return this.j;
    }

    public final C0209gm t() {
        C0209gm c0209gm;
        Rg rg = this.k;
        synchronized (rg) {
            c0209gm = rg.c.f949a;
        }
        return c0209gm;
    }

    public final yo u() {
        return this.t;
    }

    public final void v() {
        C0325l9 c0325l9 = this.n;
        int i = c0325l9.j;
        c0325l9.l = i;
        c0325l9.f1357a.a(i).b();
    }

    public final void w() {
        int optInt;
        int libraryApiLevel = AppMetrica.getLibraryApiLevel();
        yo yoVar = this.t;
        synchronized (yoVar) {
            optInt = yoVar.f1591a.a().optInt("last_migration_api_level", 0);
        }
        Integer valueOf = Integer.valueOf(optInt);
        if (valueOf.intValue() < libraryApiLevel) {
            this.o.getClass();
            List listOf = CollectionsKt.listOf(new V4(this));
            int intValue = valueOf.intValue();
            Iterator it = listOf.iterator();
            while (it.hasNext()) {
                ((U4) it.next()).a(intValue);
            }
            this.t.b(libraryApiLevel);
        }
    }

    public final boolean x() {
        C0333lh c0333lh = (C0333lh) this.k.a();
        return c0333lh.n && c0333lh.isIdentifiersValid() && this.r.didTimePassSeconds(this.n.k, c0333lh.s, "need to check permissions");
    }

    public final boolean y() {
        C0325l9 c0325l9 = this.n;
        return c0325l9.l < c0325l9.j && ((C0333lh) this.k.a()).o && ((C0333lh) this.k.a()).isIdentifiersValid();
    }

    public final void z() {
        Rg rg = this.k;
        synchronized (rg) {
            rg.f1426a = null;
        }
    }

    public final void b(Q5 q5) {
        this.h.a(q5.f);
        C0239i0 a2 = this.h.a();
        C0290k0 c0290k0 = this.i;
        Xe xe = this.c;
        synchronized (c0290k0) {
            if (a2.b > xe.d().b) {
                xe.a(a2).b();
                this.m.info("Save new app environment for %s. Value: %s", this.b, a2.f1297a);
            }
        }
    }

    @Override // io.appmetrica.analytics.impl.Qa
    public final void a(Q5 q5) {
        String a2 = Rf.a("Event received on service", EnumC0095cb.a(q5.d), q5.getName(), q5.getValue());
        if (a2 != null) {
            this.m.info(a2, new Object[0]);
        }
        String str = this.b.b;
        if (TextUtils.isEmpty(str) || "-1".equals(str)) {
            return;
        }
        this.f.a(q5, new C0533ti());
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Fa
    public synchronized void a(C0420p4 c0420p4) {
        long j;
        this.k.a(c0420p4);
        boolean z = false;
        if (Boolean.TRUE.equals(c0420p4.h)) {
            this.m.setEnabled(true);
        } else {
            if (Boolean.FALSE.equals(c0420p4.h)) {
                this.m.setEnabled(false);
            }
        }
        C0443q2 c0443q2 = this.v;
        Set<String> set = c0420p4.o;
        long currentTimeMillis = c0443q2.d.currentTimeMillis();
        boolean z2 = false;
        for (String str : set) {
            Long l = (Long) c0443q2.e.get(str);
            if (l != null) {
                j = l.longValue();
            } else {
                j = -1;
                z2 = true;
            }
            if (currentTimeMillis - j > c0443q2.b) {
                c0443q2.e.put(str, Long.valueOf(currentTimeMillis));
                z = true;
            }
        }
        if (z) {
            c0443q2.a(c0443q2.e);
            c0443q2.f1445a.a(c0443q2.e);
        }
        if (z2) {
            this.k.e();
        }
    }

    public Y4(Context context, R4 r4, C0290k0 c0290k0, TimePassedChecker timePassedChecker, C0115d5 c0115d5, C0420p4 c0420p4) {
        this.f1126a = context.getApplicationContext();
        this.b = r4;
        this.i = c0290k0;
        this.r = timePassedChecker;
        yo f = c0115d5.f();
        this.t = f;
        this.s = C0401oa.k().t();
        Xe a2 = c0115d5.e().a();
        this.c = a2;
        this.v = c0115d5.a(a2);
        Rg a3 = c0115d5.a(this);
        this.k = a3;
        PublicLogger a4 = c0115d5.d().a();
        this.m = a4;
        this.d = C0401oa.k().y();
        C0264j0 a5 = c0290k0.a(r4, a4, a2);
        this.h = a5;
        this.l = c0115d5.a();
        M6 b = c0115d5.b(this);
        this.e = b;
        C0608wi d = c0115d5.d(this);
        this.o = C0115d5.b();
        w();
        Sk a6 = C0115d5.a(this, f, new X4(this));
        this.j = a6;
        a4.info("Read app environment for component %s. Value: %s", r4.toString(), a5.a().f1297a);
        Kk c = c0115d5.c();
        this.u = c;
        this.n = c0115d5.a(a2, f, a6, b, a5, c, d);
        Y8 c2 = C0115d5.c(this);
        this.g = c2;
        this.f = C0115d5.a(this, c2);
        this.q = c0115d5.b(a2);
        this.p = c0115d5.a(d, b, a3, c0420p4, r4, a2);
        b.d();
    }

    @Override // io.appmetrica.analytics.impl.Qa, io.appmetrica.analytics.impl.Rl
    public final synchronized void a(C0209gm c0209gm) {
        this.k.a(c0209gm);
        ((C0321l5) this.p).e();
    }

    public final void a(String str) {
        this.c.j(str).b();
    }
}
