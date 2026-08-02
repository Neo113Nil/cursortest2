package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;
import java.io.IOException;
import java.util.Iterator;
import java.util.TreeSet;
import java.util.concurrent.Callable;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class gnq implements Callable {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    private final /* synthetic */ int c;

    public /* synthetic */ gnq(ikj ikjVar, gpm gpmVar, int i) {
        this.c = i;
        this.b = ikjVar;
        this.a = gpmVar;
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v16, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v3, types: [java.lang.Object, java.util.concurrent.Future] */
    /* JADX WARN: Type inference failed for: r9v33, types: [java.lang.Object, java.util.Set] */
    /* JADX WARN: Type inference failed for: r9v51, types: [java.lang.Object, java.util.Map] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.c;
        if (i == 0) {
            String str = ((fuf) hnu.aR(this.a)).b.k;
            return ("incognito".equals(str) || "pseudonymous".equals(str)) ? gzp.h("anonymous") : gzp.g((String) hnu.aR(this.b));
        }
        int i2 = 5;
        int i3 = 3;
        if (i == 1) {
            iwq iwqVar = (iwq) this.a;
            return (iae) hnu.x(new ifn((PackageManager) iwqVar.c).c(((Context) iwqVar.b).getPackageName()), new gia(new ghz(i3), i2)).get(this.b);
        }
        if (i == 2) {
            Object obj = ((ikj) this.b).a;
            gpm gpmVar = (gpm) this.a;
            return ((gpj) obj).c(gpmVar.c, String.valueOf(gpmVar.a).concat(".pb"));
        }
        if (i == 3) {
            Object obj2 = this.a;
            ((gqh) obj2).b.writeLock().lock();
            ?? r9 = this.b;
            try {
                gsa gsaVar = gsa.a;
                try {
                    gsaVar = ((gqh) obj2).a();
                } catch (IOException e) {
                    if (!((gqh) obj2).g(e)) {
                        ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 405, "SyncManagerDataStore.java")).s("Unable to read or clear store, will not update scheduled account ids. ");
                    }
                }
                jkj C = gsaVar.C();
                if (!C.b.M()) {
                    C.t();
                }
                ((gsa) C.b).f = jkq.a;
                TreeSet treeSet = new TreeSet();
                for (gqs gqsVar : r9) {
                    if (gqsVar.a()) {
                        treeSet.add(Integer.valueOf(gqsVar.c.a));
                    }
                }
                if (!C.b.M()) {
                    C.t();
                }
                gsa gsaVar2 = (gsa) C.b;
                jkt jktVar = gsaVar2.f;
                if (!jktVar.c()) {
                    gsaVar2.f = jkp.y(jktVar);
                }
                jiz.f(treeSet, gsaVar2.f);
                try {
                    ((gqh) obj2).f((gsa) C.q());
                } catch (IOException e2) {
                    ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e2)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "updateScheduledAccountIds", 426, "SyncManagerDataStore.java")).s("Error writing scheduled account ids");
                }
                return null;
            } finally {
            }
        }
        if (i != 4) {
            Object obj3 = this.a;
            if (i == 5) {
                Object obj4 = ((gqn) obj3).h;
                ?? r92 = this.b;
                synchronized (obj4) {
                    Iterator it = r92.keySet().iterator();
                    while (it.hasNext()) {
                    }
                }
                return null;
            }
            idt idtVar = (idt) obj3;
            int ordinal = idtVar.h.ordinal();
            Object obj5 = this.b;
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal == 2) {
                        return gyf.a;
                    }
                    if (ordinal != 3) {
                        if (ordinal != 4) {
                            throw new RuntimeException(null, null);
                        }
                    }
                }
                idu iduVar = idtVar.e;
                return iduVar.a();
            }
            idu iduVar2 = idtVar.e;
            return iduVar2.b();
        }
        Object obj6 = this.a;
        ((gqh) obj6).b.writeLock().lock();
        ?? r93 = this.b;
        try {
            gsa gsaVar3 = gsa.a;
            try {
                gsaVar3 = ((gqh) obj6).a();
            } catch (IOException e3) {
                if (!((gqh) obj6).g(e3)) {
                    ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e3)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 446, "SyncManagerDataStore.java")).s("Unable to read or clear store. Cannot remove account.");
                }
            }
            jkj k = gsa.a.k();
            k.w(gsaVar3);
            if (!k.b.M()) {
                k.t();
            }
            ((gsa) k.b).d = jlu.a;
            for (grz grzVar : gsaVar3.d) {
                gsc gscVar = grzVar.c;
                if (gscVar == null) {
                    gscVar = gsc.a;
                }
                if (!r93.contains(new gqs(gscVar))) {
                    k.D(grzVar);
                }
            }
            try {
                ((gqh) obj6).f((gsa) k.q());
            } catch (IOException e4) {
                ((hkf) ((hkf) ((hkf) gqh.a.f()).h(e4)).i("com/google/apps/tiktok/sync/impl/SyncManagerDataStore", "removeSyncRequests", 466, "SyncManagerDataStore.java")).s("Error writing sync data file. Cannot remove account.");
            }
            return null;
        } finally {
        }
    }

    public /* synthetic */ gnq(Object obj, Object obj2, int i) {
        this.c = i;
        this.a = obj;
        this.b = obj2;
    }
}
