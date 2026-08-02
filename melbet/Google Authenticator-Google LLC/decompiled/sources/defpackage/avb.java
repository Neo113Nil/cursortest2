package defpackage;

import android.net.ConnectivityManager;
import androidx.work.impl.WorkDatabase;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final /* synthetic */ class avb implements kri {
    public final /* synthetic */ Object a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    private final /* synthetic */ int d;

    public /* synthetic */ avb(auy auyVar, String str, bvw bvwVar, int i) {
        this.d = i;
        this.a = auyVar;
        this.b = str;
        this.c = bvwVar;
    }

    /* JADX WARN: Type inference failed for: r0v6, types: [java.lang.Object, java.util.Set] */
    @Override // defpackage.kri
    public final Object a() {
        int i = this.d;
        int i2 = 1;
        if (i != 0) {
            if (i == 1) {
                Object obj = this.c;
                ayi.a(new auj((auy) this.a, (String) this.b, 2, ixc.b(obj)));
                return kow.a;
            }
            if (i != 2) {
                Object obj2 = this.c;
                if (i != 3) {
                    return ((cfe) this.b).d(((fug) this.a).e((frv) obj2).b);
                }
                return ((cfe) this.b).d(((fug) this.a).e((frv) obj2).b);
            }
            if (((ksu) this.b).a) {
                Object obj3 = this.a;
                Object obj4 = this.c;
                asq.a();
                String str = awa.a;
                ((ConnectivityManager) obj4).unregisterNetworkCallback((ConnectivityManager.NetworkCallback) obj3);
            }
            return kow.a;
        }
        Object obj5 = this.a;
        Object obj6 = this.b;
        bvw bvwVar = (bvw) this.c;
        String str2 = (String) obj6;
        auy auyVar = (auy) obj5;
        avb avbVar = new avb(bvwVar, auyVar, str2, i2);
        axu C = auyVar.d.C();
        List k = C.k(str2);
        if (k.size() > 1) {
            throw new UnsupportedOperationException("Can't apply UPDATE policy to the chains of work.");
        }
        axr axrVar = (axr) ixc.g(k);
        if (axrVar == null) {
            avbVar.a();
            return kow.a;
        }
        String str3 = axrVar.a;
        axt c = C.c(str3);
        if (c == null) {
            throw new IllegalStateException("WorkSpec with " + str3 + ", that matches a name \"" + str2 + "\", wasn't found");
        }
        if (!c.d()) {
            throw new UnsupportedOperationException("Can't update OneTimeWorker to Periodic Worker. Update operation must preserve worker's type.");
        }
        if (axrVar.b == atb.f) {
            C.m(str3);
            avbVar.a();
            return kow.a;
        }
        axt e = axt.e((axt) bvwVar.b, str3, null, null, null, 0, 0L, 0, 0, 0L, 0, 33554430);
        atx atxVar = auyVar.f;
        atxVar.getClass();
        WorkDatabase workDatabase = auyVar.d;
        workDatabase.getClass();
        arv arvVar = auyVar.c;
        arvVar.getClass();
        List list = auyVar.e;
        list.getClass();
        ?? r0 = bvwVar.c;
        String str4 = e.b;
        axt c2 = workDatabase.C().c(str4);
        if (c2 == null) {
            throw new IllegalArgumentException(a.Z(str4, "Worker with ", " doesn't exist"));
        }
        if (!c2.c.a()) {
            if (c2.d() ^ e.d()) {
                ajt ajtVar = new ajt(6);
                throw new UnsupportedOperationException("Can't update " + ajtVar.a(c2) + " Worker to " + ajtVar.a(e) + " Worker. Update operation must preserve worker's type.");
            }
            boolean e2 = atxVar.e(str4);
            if (!e2) {
                ListIterator listIterator = ((kpt) list).listIterator(0);
                while (listIterator.hasNext()) {
                    ((atz) listIterator.next()).b(str4);
                }
            }
            workDatabase.o(new efj(workDatabase, str4, c2, e, (Set) r0, e2, 1));
            if (!e2) {
                aub.a(arvVar, workDatabase, list);
            }
        }
        return kow.a;
    }

    public /* synthetic */ avb(bvw bvwVar, auy auyVar, String str, int i) {
        this.d = i;
        this.c = bvwVar;
        this.a = auyVar;
        this.b = str;
    }

    public /* synthetic */ avb(fug fugVar, frv frvVar, cfe cfeVar, int i) {
        this.d = i;
        this.a = fugVar;
        this.c = frvVar;
        this.b = cfeVar;
    }

    public /* synthetic */ avb(ksu ksuVar, ConnectivityManager connectivityManager, avv avvVar, int i) {
        this.d = i;
        this.b = ksuVar;
        this.c = connectivityManager;
        this.a = avvVar;
    }
}
