package u5;

import androidx.work.impl.WorkDatabase;
import c6.p;
import c6.q;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class h {

    /* renamed from: a, reason: collision with root package name */
    public static final String f9635a = t5.o.f("Schedulers");

    public static void a(t5.b bVar, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        q B = workDatabase.B();
        workDatabase.c();
        try {
            ArrayList f3 = B.f(bVar.f9289h);
            ArrayList e2 = B.e();
            if (f3.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = f3.size();
                int i3 = 0;
                while (i3 < size) {
                    Object obj = f3.get(i3);
                    i3++;
                    B.l(((p) obj).f1839a, currentTimeMillis);
                }
            }
            workDatabase.u();
            workDatabase.h();
            if (f3.size() > 0) {
                p[] pVarArr = (p[]) f3.toArray(new p[f3.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    g gVar = (g) it.next();
                    if (gVar.e()) {
                        gVar.d(pVarArr);
                    }
                }
            }
            if (e2.size() > 0) {
                p[] pVarArr2 = (p[]) e2.toArray(new p[e2.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    g gVar2 = (g) it2.next();
                    if (!gVar2.e()) {
                        gVar2.d(pVarArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.h();
            throw th;
        }
    }
}
