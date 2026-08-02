package defpackage;

import android.util.SparseArray;
import j$.time.Instant;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class gvn {
    public static final hkh a = hkh.l("com/google/apps/tiktok/tracing/TraceManagerImpl");
    public final koe b;
    public final ConcurrentMap c = new ConcurrentHashMap(2, 0.75f, 1);
    public final gzp d;
    public final AtomicLong e;
    public final int f;
    public final int g;
    private final gtp h;
    private final koe i;
    private final gtb j;

    public gvn(gtp gtpVar, koe koeVar, koe koeVar2, gzp gzpVar, gtb gtbVar, Map map, Map map2, gzp gzpVar2) {
        int i;
        this.h = gtpVar;
        this.b = koeVar;
        this.i = koeVar2;
        this.j = gtbVar;
        if (map.isEmpty()) {
            this.f = 500;
        } else {
            hoq.y(map.size() == 1, "Please only specify the max number of spans once.");
            this.f = ((gtj) hnu.X(map.keySet())).a();
        }
        this.d = gzpVar2;
        if (map2.isEmpty()) {
            i = 900000;
            this.g = 900000;
        } else {
            hoq.y(map2.size() == 1, "Please only specify the trace deadline limit once.");
            i = ((gvc) hnu.X(map2.keySet())).a();
            this.g = i;
        }
        this.e = new AtomicLong(i);
    }

    private static final void f(guq guqVar, String str) {
        gso gsoVar;
        if (guqVar == null || guqVar == gtw.a || (guqVar instanceof gtq) || gsn.a == gsm.a) {
            return;
        }
        if (guqVar instanceof gsr) {
            String m = gta.m(guqVar);
            m.getClass();
            if (!ksp.b("", m)) {
                m = ": ".concat(m);
            }
            gsoVar = new gso(m, str, ((gsr) guqVar).h());
        } else {
            gsoVar = new gso(str);
        }
        koc.b(gsoVar, gwd.c());
        if (gsn.a != gsm.c) {
            throw gsoVar;
        }
        ((hkf) ((hkf) gvk.a.f().g(hlo.a, "TraceManager")).h(gsoVar).i("com/google/apps/tiktok/tracing/TraceManager$Companion", "reportDuplicateTraceException", 144, "TraceManager.kt")).u("Duplicate trace %s", new ekn(str));
    }

    private final guq g(String str, guc gucVar, long j, long j2, int i, int i2, int i3) {
        UUID b = this.j.b();
        String bK = gse.bK(b);
        boolean aD = hoq.aD(b.getLeastSignificantBits(), 0.0f);
        jkj k = gvy.a.k();
        long leastSignificantBits = b.getLeastSignificantBits();
        if (!k.b.M()) {
            k.t();
        }
        gvy gvyVar = (gvy) k.b;
        gvyVar.b |= 2;
        gvyVar.d = leastSignificantBits;
        long mostSignificantBits = b.getMostSignificantBits();
        if (!k.b.M()) {
            k.t();
        }
        jkp jkpVar = k.b;
        gvy gvyVar2 = (gvy) jkpVar;
        gvyVar2.b |= 1;
        gvyVar2.c = mostSignificantBits;
        if (!jkpVar.M()) {
            k.t();
        }
        jkp jkpVar2 = k.b;
        gvy gvyVar3 = (gvy) jkpVar2;
        gvyVar3.b |= 4;
        gvyVar3.f = j;
        long j3 = j2 / 1000000;
        if (!jkpVar2.M()) {
            k.t();
        }
        jkp jkpVar3 = k.b;
        gvy gvyVar4 = (gvy) jkpVar3;
        gvyVar4.b |= 8;
        gvyVar4.g = j3;
        if (!jkpVar3.M()) {
            k.t();
        }
        gvy gvyVar5 = (gvy) k.b;
        gvyVar5.j = 1;
        gvyVar5.b |= 64;
        gvy gvyVar6 = (gvy) k.q();
        gwk gwkVar = new gwk(str, i3, gucVar, i);
        gwl gwlVar = new gwl(this, b, bK, gvyVar6, gwkVar, j2, aD, false);
        gun a2 = gta.a();
        gts gtsVar = new gts(gwkVar, gwlVar, a2);
        gtp gtpVar = this.h;
        if (gtpVar.d.compareAndSet(false, true)) {
            gtpVar.c.execute(new gfm(gtpVar, 14));
        }
        gto gtoVar = new gto(gtsVar, gtpVar.b);
        gtp.a.put(gtoVar, true);
        gtn gtnVar = gtoVar.a;
        Executor executor = (Executor) this.b.b();
        gwlVar.g = gtnVar;
        gtnVar.c(gwlVar, executor);
        this.c.put(b, gwlVar);
        gta.g(a2, gtsVar);
        return gtsVar;
    }

    public final /* bridge */ /* synthetic */ List a() {
        int i = hel.d;
        heg hegVar = new heg(4);
        Iterator it = this.c.entrySet().iterator();
        while (it.hasNext()) {
            hegVar.h(((gwl) ((Map.Entry) it.next()).getValue()).b());
        }
        return hegVar.g();
    }

    public final void b(gvy gvyVar, SparseArray sparseArray, String str) {
        gun a2 = gta.a();
        guq guqVar = a2.c;
        gta.f(new gtm(str, gtm.a, gtm.b, gub.a, a2));
        try {
            Iterator it = ((jsd) this.i).b().iterator();
            RuntimeException runtimeException = null;
            while (it.hasNext()) {
                try {
                    ((gvj) it.next()).a(gvyVar, sparseArray);
                } catch (RuntimeException e) {
                    if (runtimeException != null) {
                        runtimeException.addSuppressed(e);
                    } else {
                        runtimeException = e;
                    }
                }
            }
            if (runtimeException == null) {
            } else {
                throw runtimeException;
            }
        } finally {
            gta.g(a2, guqVar);
        }
    }

    public final gtt c(String str, guc gucVar, int i, int i2) {
        guq b = gta.b();
        f(b, str);
        guq g = g(str, gucVar, Instant.now().toEpochMilli(), dih.q(), 1, 2, i2);
        return b == ((gts) g).b ? g : new gvl(g, b, 1);
    }

    public final gtt d(guc gucVar, long j, long j2, int i, int i2) {
        guq b = gta.b();
        f(b, "Application creation");
        guq g = g("Application creation", gucVar, j, j2, 1, 2, i2);
        return b == ((gts) g).b ? g : new gvl(g, b, 0);
    }

    public final gup e(String str, guc gucVar, int i, int i2) {
        guq b = gta.b();
        f(b, str);
        return new gvm(new gty(g(str, gucVar, Instant.now().toEpochMilli(), dih.q(), 2, 2, i2), false), b);
    }
}
