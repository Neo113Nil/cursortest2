package T0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class c extends N2.r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ K0.p f3038v;

    public c(K0.p pVar) {
        this.f3038v = pVar;
    }

    @Override // N2.r
    public final void b() {
        K0.p pVar = this.f3038v;
        WorkDatabase workDatabase = pVar.f1532c;
        workDatabase.c();
        try {
            Iterator it = workDatabase.t().g().iterator();
            while (it.hasNext()) {
                N2.r.a(pVar, (String) it.next());
            }
            workDatabase.o();
            workDatabase.k();
            K0.i.a(pVar.f1531b, pVar.f1532c, pVar.f1534e);
        } catch (Throwable th) {
            workDatabase.k();
            throw th;
        }
    }
}
