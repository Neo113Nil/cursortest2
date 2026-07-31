package v0;

import T0.AbstractRunnableC0182q;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.UUID;

/* loaded from: classes.dex */
public final class b extends AbstractRunnableC0182q {

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ int f6054h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ m0.o f6055i;

    /* renamed from: j, reason: collision with root package name */
    public final /* synthetic */ Object f6056j;

    public /* synthetic */ b(m0.o oVar, Object obj, int i7) {
        this.f6054h = i7;
        this.f6055i = oVar;
        this.f6056j = obj;
    }

    @Override // T0.AbstractRunnableC0182q
    public final void b() {
        WorkDatabase workDatabase;
        switch (this.f6054h) {
            case 0:
                m0.o oVar = this.f6055i;
                workDatabase = oVar.f5375c;
                workDatabase.c();
                try {
                    AbstractRunnableC0182q.a(oVar, ((UUID) this.f6056j).toString());
                    workDatabase.o();
                    workDatabase.k();
                    m0.i.a(oVar.f5374b, oVar.f5375c, oVar.f5377e);
                    return;
                } finally {
                    workDatabase.k();
                }
            default:
                m0.o oVar2 = this.f6055i;
                workDatabase = oVar2.f5375c;
                workDatabase.c();
                try {
                    ArrayList f7 = workDatabase.t().f((String) this.f6056j);
                    int size = f7.size();
                    int i7 = 0;
                    while (i7 < size) {
                        Object obj = f7.get(i7);
                        i7++;
                        AbstractRunnableC0182q.a(oVar2, (String) obj);
                    }
                    workDatabase.o();
                    return;
                } catch (Throwable th) {
                    throw th;
                }
        }
    }
}
