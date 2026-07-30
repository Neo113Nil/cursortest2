package Q0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends c {

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f2292i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ H0.p f2293l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Object f2294m;

    public /* synthetic */ b(H0.p pVar, Object obj, int i2) {
        this.f2292i = i2;
        this.f2293l = pVar;
        this.f2294m = obj;
    }

    @Override // Q0.c
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f2292i) {
            case 0:
                H0.p pVar = this.f2293l;
                workDatabase = pVar.f920c;
                workDatabase.c();
                try {
                    c.a(pVar, ((UUID) this.f2294m).toString());
                    workDatabase.o();
                    workDatabase.k();
                    H0.i.a(pVar.f919b, pVar.f920c, pVar.f922e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                H0.p pVar2 = this.f2293l;
                workDatabase = pVar2.f920c;
                workDatabase.c();
                try {
                    ArrayList f7 = workDatabase.t().f((String) this.f2294m);
                    int size = f7.size();
                    int i2 = 0;
                    while (i2 < size) {
                        Object obj = f7.get(i2);
                        i2++;
                        c.a(pVar2, (String) obj);
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
