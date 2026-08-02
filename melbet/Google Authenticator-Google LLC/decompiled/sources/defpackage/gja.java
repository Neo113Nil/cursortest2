package defpackage;

import android.content.Intent;
import androidx.work.WorkerParameters;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gja implements htr {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gja(Object obj, Object obj2, int i) {
        this.c = i;
        this.b = obj;
        this.a = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v13, types: [hvi, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v32, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r4v12, types: [gce, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, java.util.Map] */
    @Override // defpackage.htr
    public final hvi a(Object obj) {
        hvi f;
        long j;
        int i = 3;
        int i2 = 1;
        switch (this.c) {
            case 0:
                etn etnVar = (etn) obj;
                gty aB = hoq.aB(182, "ConsistencyTierState.setNewValues", gub.a, true);
                Object obj2 = this.b;
                Object obj3 = this.a;
                try {
                    ggh gghVar = (ggh) ((iee) obj3).e.get(obj2);
                    if (gghVar != null) {
                        int ordinal = gghVar.ordinal();
                        if (ordinal == 1) {
                            Object obj4 = ((iee) obj3).a;
                            etnVar.getClass();
                            f = hti.f(((iwq) obj4).g((String) obj2, etnVar), gvx.a(new gia(obj3, 8)), huf.a);
                        } else if (ordinal == 3) {
                            Object obj5 = ((iee) obj3).g;
                            etnVar.getClass();
                            f = ((iwq) obj5).g((String) obj2, etnVar);
                        }
                        aB.b(f);
                        ixf.j(aB, null);
                        return f;
                    }
                    throw new UnsupportedOperationException();
                } finally {
                }
            case 1:
                String str = (String) obj;
                str.getClass();
                return ((fym) this.b).g(str, (frv) this.a);
            case 2:
                String str2 = (String) obj;
                str2.getClass();
                return ((fym) this.b).g(str2, (frv) this.a);
            case 3:
                gon gonVar = (gon) this.b;
                goo a = gonVar.a(obj);
                Intent intent = (Intent) this.a;
                hvi a2 = a.a(intent);
                if (a instanceof gol) {
                    gol golVar = (gol) a;
                    j = (intent.getFlags() & 268435456) != 0 ? golVar.c() : golVar.b();
                } else {
                    j = -1;
                }
                if (j <= 0) {
                    return a2;
                }
                return hoq.ap(hnu.aQ(a2, j - (dih.s().toMillis() - gonVar.b), TimeUnit.MILLISECONDS, gonVar.c), TimeoutException.class, new gcs(2), huf.a);
            case 4:
                Set keySet = ((HashMap) this.b).keySet();
                gqh gqhVar = ((gqn) this.a).e;
                return gqhVar.c.submit(new gnq(gqhVar, keySet, i));
            case 5:
                ?? r0 = this.b;
                Object obj6 = this.a;
                gqn gqnVar = (gqn) obj6;
                return hoq.ax(gqnVar.h(r0), new cap(obj6, (Object) r0, (Long) obj, 15), gqnVar.b);
            case 6:
                ArrayList arrayList = new ArrayList();
                Iterator it = ((List) obj).iterator();
                while (true) {
                    Object obj7 = this.b;
                    if (!it.hasNext()) {
                        return hnu.aV(arrayList).a(gvx.i(new bws(13)), ((gra) obj7).a);
                    }
                    Object obj8 = this.a;
                    UUID uuid = ((atc) it.next()).a;
                    if (!((WorkerParameters) obj8).a.equals(uuid)) {
                        arrayList.add(((gra) obj7).b.b(uuid));
                    }
                }
            case 7:
                Object obj9 = this.b;
                gra graVar = (gra) obj9;
                return hnu.bL(hti.g(graVar.b.d("com.google.apps.tiktok.sync.impl.workmanager.SyncWorker"), gvx.c(new gja(obj9, this.a, 6)), graVar.a), new bws(12), huf.a);
            case 8:
                ArrayList arrayList2 = new ArrayList();
                Iterator it2 = ((List) obj).iterator();
                while (true) {
                    Object obj10 = this.a;
                    Object obj11 = this.b;
                    if (!it2.hasNext()) {
                        return hoq.aU(arrayList2).t(new gib(obj11, obj10, 11), ((grd) obj11).c);
                    }
                    atc atcVar = (atc) it2.next();
                    UUID uuid2 = ((WorkerParameters) obj10).a;
                    UUID uuid3 = atcVar.a;
                    if (!uuid2.equals(uuid3)) {
                        arrayList2.add(((grd) obj11).d.b(uuid3));
                    }
                }
            case 9:
                grd grdVar = (grd) this.b;
                fwm fwmVar = grdVar.e;
                gri griVar = (gri) grdVar.b;
                if (fwmVar.l()) {
                    WorkerParameters workerParameters = (WorkerParameters) this.a;
                    if (!workerParameters.c.contains(grd.f(griVar.c()))) {
                        ((hkf) ((hkf) grd.a.e()).i("com/google/apps/tiktok/sync/impl/workmanager/SyncPeriodicWorker", "maybeCancelThisWorkerIfItHasWrongMainProcessTag", 154, "SyncPeriodicWorker.java")).s("Cancelling Sync worker since it has the wrong tag");
                        return grdVar.d.b(workerParameters.a);
                    }
                }
                return hve.a;
            case 10:
                return ((grd) this.b).e((WorkerParameters) this.a);
            default:
                ArrayList arrayList3 = new ArrayList();
                HashSet hashSet = new HashSet();
                for (atc atcVar2 : (List) obj) {
                    if (atcVar2.b == atb.a) {
                        hashSet.add(atcVar2.d);
                    }
                }
                hjr it3 = hfm.n(hashSet).iterator();
                while (it3.hasNext()) {
                    ?? r1 = this.b;
                    ary aryVar = (ary) it3.next();
                    if (!r1.contains(aryVar)) {
                        gri griVar2 = (gri) this.a;
                        String d = gri.d(aryVar, griVar2.c());
                        ghf ghfVar = griVar2.f;
                        arrayList3.add(hti.f(((iyi) ghfVar.e).f(ghfVar.d.a(d), new bwu(20)), new gxw(i2), huf.a));
                    }
                }
                return hnu.aV(arrayList3).a(gvx.i(new bws(17)), huf.a);
        }
    }

    public /* synthetic */ gja(Object obj, Object obj2, int i, byte[] bArr) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
