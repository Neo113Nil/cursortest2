package m0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l0.C0488b;
import u0.C0686p;
import u0.C0687q;

/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final String f5357a = l0.q.f("Schedulers");

    public static void a(C0488b c0488b, WorkDatabase workDatabase, List list) {
        if (list == null || list.size() == 0) {
            return;
        }
        C0687q t6 = workDatabase.t();
        workDatabase.c();
        try {
            ArrayList b7 = t6.b(c0488b.f5251h);
            ArrayList a7 = t6.a();
            if (b7.size() > 0) {
                long currentTimeMillis = System.currentTimeMillis();
                int size = b7.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = b7.get(i7);
                    i7++;
                    t6.h(currentTimeMillis, ((C0686p) obj).f6000a);
                }
            }
            workDatabase.o();
            workDatabase.k();
            if (b7.size() > 0) {
                C0686p[] c0686pArr = (C0686p[]) b7.toArray(new C0686p[b7.size()]);
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    h hVar = (h) it.next();
                    if (hVar.e()) {
                        hVar.b(c0686pArr);
                    }
                }
            }
            if (a7.size() > 0) {
                C0686p[] c0686pArr2 = (C0686p[]) a7.toArray(new C0686p[a7.size()]);
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    h hVar2 = (h) it2.next();
                    if (!hVar2.e()) {
                        hVar2.b(c0686pArr2);
                    }
                }
            }
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
