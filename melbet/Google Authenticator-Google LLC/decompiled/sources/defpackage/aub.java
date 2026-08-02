package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class aub {
    public static final /* synthetic */ int a = 0;

    static {
        asq.b("Schedulers");
    }

    public static void a(arv arvVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.isEmpty()) {
            return;
        }
        axu C = workDatabase.C();
        new ArrayList();
        workDatabase.m();
        try {
            List e = C.e();
            yp ypVar = arvVar.n;
            c(C, e);
            List v = C.v();
            List d = C.d(arvVar.k);
            c(C, d);
            if (e != null) {
                d.addAll(e);
            }
            workDatabase.p();
            workDatabase.n();
            b(d, list, true);
            b(v, list, false);
        } catch (Throwable th) {
            workDatabase.n();
            throw th;
        }
    }

    private static void b(List list, List list2, boolean z) {
        if (list.isEmpty()) {
            return;
        }
        axt[] axtVarArr = (axt[]) list.toArray(new axt[list.size()]);
        ListIterator listIterator = ((kpt) list2).listIterator(0);
        while (listIterator.hasNext()) {
            atz atzVar = (atz) listIterator.next();
            if (atzVar.d() == z) {
                atzVar.c(axtVarArr);
            }
        }
    }

    private static void c(axu axuVar, List list) {
        if (list.size() > 0) {
            long currentTimeMillis = System.currentTimeMillis();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                axuVar.x(((axt) it.next()).b, currentTimeMillis);
            }
        }
    }
}
