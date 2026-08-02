package defpackage;

import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gib implements htq {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gib(gka gkaVar, int i) {
        this.c = i;
        this.b = gkaVar;
        this.a = "file_completion_present";
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r0v31, types: [java.lang.Object, java.util.Map$Entry] */
    /* JADX WARN: Type inference failed for: r0v57, types: [idd, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v1, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v15, types: [java.lang.Object, krt] */
    /* JADX WARN: Type inference failed for: r13v16, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v20, types: [java.lang.Object, java.util.concurrent.Callable] */
    /* JADX WARN: Type inference failed for: r13v22, types: [gjj, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r13v31, types: [hvi, java.lang.Object] */
    @Override // defpackage.htq
    public final hvi a() {
        int i = 11;
        int i2 = 6;
        byte[] bArr = null;
        switch (this.c) {
            case 0:
                return hoq.au(this.a, new fvr(new gdg(this.b, 6, (float[]) null), i), huf.a);
            case 1:
                return ((gid) this.b).h.i((String) this.a);
            case 2:
                giz gizVar = (giz) this.a;
                frv frvVar = gizVar.d;
                Object obj = this.b;
                if (ksp.b(obj, frvVar)) {
                    return hnu.aJ(null);
                }
                frv frvVar2 = (frv) obj;
                gizVar.d = frvVar2;
                giy giyVar = (giy) hnu.bq(gizVar.a, giy.class, frvVar2);
                hvi b = gizVar.b.b(frvVar2);
                List h = giyVar.q().h();
                List h2 = giyVar.p().h();
                List b2 = ixc.b(b);
                List l = ixc.l(h, h2);
                ArrayList arrayList = new ArrayList(ixc.w(l));
                Iterator it = l.iterator();
                while (it.hasNext()) {
                    arrayList.add(((iyi) it.next()).c);
                }
                return hoq.aU(ixc.l(b2, arrayList)).t(gvx.b(new fca(h, h2, gizVar, b, 5)), huf.a);
            case 3:
                return this.a.a(((giz) this.b).d);
            case 4:
                return ((gka) this.b).a(1, (String) this.a);
            case 5:
                return hoq.ar(this.a, ((gjl) this.b).h);
            case 6:
                hvm hvmVar = ((gjw) this.a).c;
                ?? r13 = this.b;
                return hti.f(hnu.aQ(r13.a(), 180L, TimeUnit.SECONDS, hvmVar), gvx.a(new fxn(i)), huf.a);
            case 7:
                iwq iwqVar = gjw.m;
                return ((gka) this.b).a(2, (String) this.a);
            case 8:
                ?? r0 = this.a;
                String str = (String) r0.getKey();
                Object b3 = ((koe) r0.getValue()).b();
                b3.getClass();
                Object obj2 = this.b;
                gjw gjwVar = (gjw) obj2;
                gjj gjjVar = (gjj) b3;
                Set b4 = ((jsd) gjwVar.f).b();
                b4.getClass();
                ArrayList arrayList2 = new ArrayList(ixc.w(b4));
                Iterator it2 = b4.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(new gjk((gka) it2.next(), str, 2));
                }
                return gjwVar.k.m(new gib(gjjVar, obj2, i2, bArr), hnu.ae(arrayList2));
            case 9:
                ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "scheduleNextSyncInline", 625, "SyncManagerImpl.java")).s("Scheduling next wakeup");
                gqn gqnVar = (gqn) this.b;
                hvi g = gqnVar.g(this.a, ((Long) hnu.aR(gqnVar.g)).longValue());
                gqnVar.d.b(g, "SyncManager: Scheduling inline");
                g.c(new gfm(g, 12), gqnVar.b);
                return g;
            case 10:
                ((hkf) ((hkf) gqn.a.e()).i("com/google/apps/tiktok/sync/impl/SyncManagerImpl", "runSynclet", 428, "SyncManagerImpl.java")).u("Starting synclet: %s", new igk(igj.a, ((gqs) this.a).b.b()));
                gpv gpvVar = (gpv) this.b;
                boolean z = gpvVar.b;
                hoq.I(z, "Synclet binding must be enabled to have a Synclet");
                hoq.I(z, "Synclet binding must be enabled to have a SyncletProvider");
                koe koeVar = gpvVar.c;
                koeVar.getClass();
                gpu gpuVar = (gpu) koeVar.b();
                gpuVar.getClass();
                return gpuVar.b();
            case 11:
                return ((grd) this.a).d.b(((WorkerParameters) this.b).a);
            default:
                ?? r02 = this.a;
                Object obj3 = this.b;
                gty aC = hoq.aC(289, "FrameworkChannel#getTransportChannel");
                try {
                    hvi aJ = hnu.aJ(r02.a((idc) obj3));
                    aC.close();
                    return aJ;
                } finally {
                }
        }
    }

    public /* synthetic */ gib(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }

    public /* synthetic */ gib(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    public gib(krt krtVar, giz gizVar, int i) {
        this.c = i;
        this.a = krtVar;
        this.b = gizVar;
    }
}
