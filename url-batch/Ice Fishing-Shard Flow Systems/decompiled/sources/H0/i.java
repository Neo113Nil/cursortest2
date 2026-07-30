package H0;

import G0.C0103c;
import G0.s;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f901a = s.f("Schedulers");

    public static void a(C0103c c0103c, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        P0.q t6 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList b7 = t6.b(c0103c.f790h);
            ArrayList a7 = t6.a();
            if (b7.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = b7.size();
                int i2 = 0;
                while (i2 < size) {
                    Object obj = b7.get(i2);
                    i2++;
                    t6.h(((P0.p) obj).f2220a, currentTimeMillis);
                }
            }
            workDatabase.o();
            workDatabase.k();
            if (b7.size() > 0) {
                P0.p[] pVarArr = (P0.p[]) b7.toArray(new P0.p[b7.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.f()) {
                        hVar.e(pVarArr);
                    }
                }
            }
            if (a7.size() > 0) {
                P0.p[] pVarArr2 = (P0.p[]) a7.toArray(new P0.p[a7.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.f()) {
                        hVar2.e(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
