package defpackage;

import android.os.RemoteException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kcq extends kcs implements jyo {
    public final List a;
    private final kdw r;

    public kcq(kjm kjmVar, jwt jwtVar, List list) {
        super(kjmVar, jwtVar, jyp.a(kcq.class, "from ".concat(String.valueOf(String.valueOf(jwtVar.a(jye.a))))));
        this.r = new kdw();
        this.a = list;
    }

    final synchronized kbq a(kma kmaVar, String str, kaa kaaVar) {
        boolean z;
        jxk jxkVar;
        if (m()) {
            return kbq.l.e("transport is shutdown");
        }
        kdw kdwVar = this.r;
        hoq.I(kdwVar.a != null, "Not yet set!");
        kmc kmcVar = ((kcl) kdwVar.a).a;
        int i = kob.a;
        klw klwVar = ((klv) kmcVar).b;
        Executor klhVar = klwVar.e != huf.a ? new klh(klwVar.e) : new kld();
        jzw jzwVar = khd.c;
        if (kaaVar.i(jzwVar)) {
            String str2 = (String) kaaVar.c(jzwVar);
            if (klwVar.t.a(str2) == null) {
                kmaVar.i(klw.c);
                kmaVar.d(kbq.j.e(String.format("Can't find decompressor for %s", str2)), new kaa());
                return kbq.b;
            }
        }
        kmm b = kmaVar.b();
        b.getClass();
        kuq a = klwVar.f.a(str);
        Long l = (Long) kaaVar.c(khd.b);
        jxr jxrVar = klwVar.s;
        jxrVar.getClass();
        ixj[] ixjVarArr = b.b;
        if (ixjVarArr.length > 0) {
            ixj ixjVar = ixjVarArr[0];
            throw null;
        }
        if (l == null) {
            jxkVar = new jxk(jxrVar);
        } else {
            jxs g = jxs.g(l.longValue(), TimeUnit.NANOSECONDS, klwVar.w);
            ScheduledExecutorService scheduledExecutorService = ((klv) kmcVar).c.g;
            jxr.m(scheduledExecutorService, "scheduler");
            jxs b2 = jxrVar.b();
            if (b2 == null || b2.compareTo(g) > 0) {
                z = true;
            } else {
                z = false;
                g = b2;
            }
            jxk jxkVar2 = new jxk(jxrVar, g);
            if (z) {
                if (g.f()) {
                    jxkVar2.j(new TimeoutException("context timed out"));
                } else {
                    synchronized (jxkVar2) {
                        iaq iaqVar = new iaq(jxkVar2, 11, null);
                        scheduledExecutorService.getClass();
                        jxkVar2.b = scheduledExecutorService.schedule(iaqVar, g.a - System.nanoTime(), TimeUnit.NANOSECONDS);
                    }
                }
            }
            jxkVar = jxkVar2;
        }
        klp klpVar = new klp(klhVar, klwVar.e, kmaVar, jxkVar);
        kmaVar.i(klpVar);
        hvw hvwVar = new hvw();
        jxk jxkVar3 = jxkVar;
        klhVar.execute(new klu((klv) kmcVar, jxkVar3, a, str, kmaVar, klpVar, hvwVar, b, kaaVar));
        klhVar.execute(new klt(jxkVar3, hvwVar, kaaVar, kmaVar, klpVar));
        return kbq.b;
    }

    @Override // defpackage.kcs
    protected final kde b(int i) {
        return new kdb(this, this.k, i);
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kmc] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, java.util.List] */
    @Override // defpackage.kcs
    public final void d() {
        ixa ixaVar = new ixa();
        kdw kdwVar = this.r;
        ?? r1 = kdwVar.a;
        if (r1 != 0) {
            r1.a();
            return;
        }
        if (kdwVar.b == null) {
            kdwVar.b = new ArrayList();
        }
        kdwVar.b.add(ixaVar);
    }

    public final synchronized void e() {
        j(kbq.b, false);
    }

    public final synchronized void f(kbq kbqVar) {
        j(kbqVar, true);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, java.util.List] */
    public final synchronized void g(kmc kmcVar) {
        kdw kdwVar = this.r;
        hoq.I(kdwVar.a == null, "Already set!");
        kdwVar.a = kmcVar;
        ?? r1 = kdwVar.b;
        if (r1 != 0) {
            for (ixa ixaVar : r1) {
                kmcVar.a();
            }
            kdwVar.b = null;
        }
        if (!m()) {
            kdo kdoVar = this.m;
            kdoVar.getClass();
            try {
                kdq c = kdq.c();
                try {
                    c.a().writeInt(1);
                    c.a().writeStrongBinder(this.h);
                    kdoVar.a(1, c);
                    c.close();
                } catch (Throwable th) {
                    try {
                        c.close();
                    } catch (Throwable th2) {
                        th.addSuppressed(th2);
                    }
                    throw th;
                }
            } catch (RemoteException e) {
                j(kcs.h(e), true);
            }
            if (!m()) {
                n(3);
                jwt jwtVar = this.k;
                kmc kmcVar2 = ((kcl) kmcVar).a;
                ((klv) kmcVar2).a.cancel(false);
                ((klv) kmcVar2).a = null;
                Iterator it = ((klv) kmcVar2).b.h.iterator();
                if (it.hasNext()) {
                    throw null;
                }
                this.k = jwtVar;
            }
        }
    }
}
