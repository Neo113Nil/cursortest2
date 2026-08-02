package defpackage;

import java.util.Set;
import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gfo {
    public static final hkh a = hkh.l("com/google/apps/tiktok/dataservice/local/LocalSubscriptionMixinUpdater");
    public final hdy b;
    public final Executor c;
    public final Executor d;
    public final gbf e;
    public final Set f = new qk(0);
    public Set g = new qk(0);
    public int h = 2;

    public gfo(hdy hdyVar, Executor executor, Executor executor2, gbf gbfVar) {
        this.b = hdyVar;
        this.c = executor;
        this.d = executor2;
        this.e = gbfVar;
    }

    public static void a(gex gexVar, gft gftVar) {
        gty aC;
        gaw a2;
        fao.c();
        if (gftVar.b()) {
            aC = hoq.aC(148, "LocalSubscription onLoaded()");
            try {
                a2 = gax.a();
                try {
                    gexVar.b(gftVar.a());
                    a2.close();
                    aC.close();
                    return;
                } finally {
                }
            } finally {
            }
        }
        aC = hoq.aC(147, "LocalSubscription onLoadError()");
        try {
            a2 = gax.a();
            try {
                gexVar.a(gftVar.c());
                a2.close();
                aC.close();
            } finally {
                try {
                    a2.close();
                } catch (Throwable th) {
                    th.addSuppressed(th);
                }
            }
        } finally {
        }
    }

    private final void e(hvi hviVar) {
        fao.c();
        this.g.add(hviVar);
        hviVar.c(gvx.h(new evb(this, hviVar, 13)), this.d);
    }

    public final void b(hrz hrzVar, hvi hviVar) {
        hvi aK = hnu.aK(hviVar);
        bso bsoVar = new bso(this, hrzVar, 15);
        Executor executor = this.d;
        e(hoq.ao(hoq.at(aK, bsoVar, executor), Throwable.class, new bso(this, hrzVar, 16), executor));
    }

    public final void c(hrz hrzVar) {
        fao.c();
        this.f.add(hrzVar);
        if (this.h == 2) {
            this.h = 1;
            e(hoq.aq(new gfm(this, 1), this.e));
        }
    }

    /* JADX WARN: Type inference failed for: r3v4, types: [gew, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v6, types: [hvi, java.lang.Object] */
    public final void d(hrz hrzVar) {
        gfl gflVar = new gfl(this, hrzVar, 0);
        fao.c();
        Object obj = hrzVar.a;
        obj.getClass();
        gfq gfqVar = new gfq(hrzVar, 0);
        gfp gfpVar = (gfp) obj;
        gzp gzpVar = gfpVar.b;
        if (gzpVar.f()) {
            gzpVar.b().cancel(false);
        }
        gzp gzpVar2 = gfpVar.a;
        gty aC = hoq.aC(149, "LocalSubscription newLoad");
        try {
            hvi b = ((gzs) gzpVar2).a.b();
            aC.b(b);
            gfqVar.accept(new gfp(gzpVar2, gzp.h(b), ((gfp) obj).c, ((gfp) obj).d));
            gflVar.accept(b);
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
}
