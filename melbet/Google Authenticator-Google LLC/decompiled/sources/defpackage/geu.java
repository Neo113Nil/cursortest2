package defpackage;

import j$.time.Instant;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class geu {
    public final gbf a;
    public final Executor b;
    public gef c;
    public final AtomicReference d = new AtomicReference(null);
    public gej e;
    public gei f;
    public gen g;
    public final gbd h;
    public final gbd i;
    public final dih j;
    public final iwq k;

    public geu(gdn gdnVar, dih dihVar, iwq iwqVar, gbf gbfVar, Executor executor) {
        gel gelVar = gen.a;
        gyf gyfVar = gyf.a;
        this.g = new gen(0L, gelVar, false, gyfVar, gyfVar);
        this.h = new gbd(2, new ges(1));
        this.i = new gbd(1, new ges(0));
        this.j = dihVar;
        this.k = iwqVar;
        this.a = gbfVar;
        gei geiVar = new gei(gdnVar, new gdr(), 0L, 1, new gej(gdnVar, Long.MIN_VALUE, new gdv(0L), new gdz(0L), 0, Instant.ofEpochMilli(Long.MIN_VALUE)));
        this.f = geiVar;
        this.e = geiVar.e;
        this.b = executor;
    }

    public static void f(gdl gdlVar) {
        gty aC = hoq.aC(139, "BackgroundCallbacks.onBackgroundFetch");
        try {
            gdlVar.a();
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static void g(gdl gdlVar) {
        gty aC = hoq.aC(141, "BackgroundCallbacks.onBackgroundFetchSucceeded");
        try {
            gdlVar.b();
            aC.close();
        } catch (Throwable th) {
            try {
                aC.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public static gen j(gen genVar, gdy gdyVar) {
        gzp h;
        gzp gzpVar;
        gen a;
        gzp gzpVar2 = genVar.f;
        if (gzpVar2.f() && gzpVar2.b() == gdyVar) {
            h = gyf.a;
            a = genVar.a(gdyVar);
            gzpVar = h;
        } else {
            if (!gzpVar2.f()) {
                gzp gzpVar3 = genVar.e;
                if (gzpVar3.f() && gzpVar3.b() == gdyVar) {
                    h = gzp.h(((gdy) gzpVar3.b()).a().c());
                    gyf gyfVar = gyf.a;
                    a = genVar.a((gdy) gzpVar3.b());
                    gzpVar = gyfVar;
                }
            }
            if (gzpVar2.f() && ((gdy) gzpVar2.b()).a().c().equals(gdyVar.a().c())) {
                h = gyf.a;
                gzpVar = gzp.h(gdyVar);
                a = genVar;
            } else {
                h = gzp.h(gdyVar.a().c());
                gzpVar = genVar.e;
                a = genVar.a(gdyVar);
            }
        }
        if (h.f()) {
            gty aC = hoq.aC(138, "SubscriptionCallbacks.onNewData");
            try {
                gaw a2 = gax.a();
                try {
                    genVar.c.h(gdyVar.a().c());
                    a2.close();
                    aC.close();
                } finally {
                }
            } catch (Throwable th) {
                try {
                    aC.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        if (gzpVar.f()) {
            ((gdy) gzpVar.b()).c();
        }
        return a;
    }

    final void a() {
        gef gefVar = this.c;
        if (gefVar != null) {
            this.k.m(this.f.b, gefVar);
            this.c = null;
        }
        this.h.a();
        this.i.a();
        gzp gzpVar = this.g.e;
        if (gzpVar.f()) {
            ((gdy) gzpVar.b()).c();
        }
        gen genVar = this.g;
        gzp gzpVar2 = genVar.f;
        if (!gzpVar2.f() || gzpVar2.equals(genVar.e)) {
            return;
        }
        ((gdy) this.g.f.b()).c();
    }

    public final void b(gej gejVar, gdy gdyVar) {
        hoq.H(gdyVar.a().d());
        this.g = j(this.g, gdyVar);
        this.e = gejVar;
    }

    final void c() {
        gen genVar = this.g;
        this.g = new gen(genVar.b + 1, gen.a, false, genVar.e, gyf.a);
    }

    /* JADX WARN: Type inference failed for: r12v5, types: [hvi, java.lang.Object] */
    public final void d(gej gejVar) {
        gty aC;
        fao.c();
        gen genVar = this.g;
        if (!genVar.e.f()) {
            gel gelVar = genVar.c;
            aC = hoq.aC(143, "SubscriptionCallbacks.onPending");
            try {
                gaw a = gax.a();
                try {
                    gelVar.i();
                    a.close();
                    aC.close();
                } finally {
                }
            } finally {
            }
        } else if ((genVar.c instanceof gdl) && this.h.b()) {
            gen genVar2 = this.g;
            if (!genVar2.d) {
                gen b = genVar2.b(true);
                this.g = b;
                f((gdl) b.c);
            }
        }
        gdn gdnVar = gejVar.a;
        long j = gejVar.b;
        long j2 = gejVar.c.a;
        hoq.I(j2 != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        gej gejVar2 = new gej(gdnVar, j, new gdv(j2 + 1), gejVar.d, gejVar.e, gejVar.f);
        gdn gdnVar2 = gejVar2.a;
        aC = hoq.aC(136, "DataSource fetchAndStoreData()");
        try {
            hvi b2 = gdnVar2.b();
            aC.b(b2);
            cfe cfeVar = new cfe(b2);
            aC.close();
            this.h.d(cfeVar);
            cfeVar.a.c(gvx.h(new gbm(this, gejVar2, (Object) cfeVar, 6)), huf.a);
        } finally {
        }
    }

    public final void e(gej gejVar) {
        fao.c();
        long j = gejVar.d.a;
        hoq.I(j != Long.MAX_VALUE, "You've just overflowed a long. Consider upgrading to a BigDecimal, if this happens more than once.");
        gdz gdzVar = new gdz(j + 1);
        Instant instant = gejVar.f;
        int i = gejVar.e + 1;
        gej gejVar2 = new gej(gejVar.a, gejVar.b, gejVar.c, gdzVar, i, instant);
        gdn gdnVar = gejVar2.a;
        gty aC = hoq.aC(137, "DataSource loadData()");
        try {
            htz a = gdnVar.a();
            aC.a(a);
            gdy gdyVar = new gdy(a);
            aC.close();
            this.i.d(gdyVar);
            gdyVar.b().c(gvx.h(new gbm(this, gejVar2, (Object) gdyVar, 4)), huf.a);
        } finally {
        }
    }

    public final void h(Throwable th) {
        gen genVar = this.g;
        if (genVar.e.f()) {
            gel gelVar = genVar.c;
            if (gelVar instanceof gek) {
                gek gekVar = (gek) gelVar;
                gty aC = hoq.aC(145, "RefreshCallbacks.onRefreshError");
                try {
                    gekVar.a();
                    aC.close();
                } catch (Throwable th2) {
                    try {
                        aC.close();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            }
        } else {
            gel gelVar2 = genVar.c;
            gty aC2 = hoq.aC(142, "SubscriptionCallbacks.onError");
            try {
                gaw a = gax.a();
                try {
                    gelVar2.g(th);
                    a.close();
                    aC2.close();
                } finally {
                }
            } catch (Throwable th4) {
                try {
                    aC2.close();
                } catch (Throwable th5) {
                    th4.addSuppressed(th5);
                }
                throw th4;
            }
        }
        if (this.g.d && i()) {
            gdl gdlVar = (gdl) this.g.c;
            gty aC3 = hoq.aC(140, "BackgroundCallbacks.onBackgroundFetchError");
            try {
                gdlVar.c();
                aC3.close();
                this.g = this.g.b(false);
            } catch (Throwable th6) {
                try {
                    aC3.close();
                } catch (Throwable th7) {
                    th6.addSuppressed(th7);
                }
                throw th6;
            }
        }
    }

    public final boolean i() {
        if (!(this.g.c instanceof gdl) || !this.h.b() || !this.i.b()) {
            return false;
        }
        hoq.H(this.g.d);
        return true;
    }
}
