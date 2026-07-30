package T0;

import androidx.work.impl.WorkDatabase;
import java.util.Iterator;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends N2.r {

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ int f3035v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ K0.p f3036w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Object f3037x;

    public /* synthetic */ b(K0.p pVar, Object obj, int i) {
        this.f3035v = i;
        this.f3036w = pVar;
        this.f3037x = obj;
    }

    @Override // N2.r
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f3035v) {
            case 0:
                K0.p pVar = this.f3036w;
                workDatabase = pVar.f1532c;
                workDatabase.c();
                try {
                    N2.r.a(pVar, ((UUID) this.f3037x).toString());
                    workDatabase.o();
                    workDatabase.k();
                    K0.i.a(pVar.f1531b, pVar.f1532c, pVar.f1534e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                K0.p pVar2 = this.f3036w;
                workDatabase = pVar2.f1532c;
                workDatabase.c();
                try {
                    Iterator it = workDatabase.t().f((String) this.f3037x).iterator();
                    while (it.hasNext()) {
                        N2.r.a(pVar2, (String) it.next());
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
