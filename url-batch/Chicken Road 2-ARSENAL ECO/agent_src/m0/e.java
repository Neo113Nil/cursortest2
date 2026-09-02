package m0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5338a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f5339b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f5340c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f5341d;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i7) {
        this.f5338a = i7;
        this.f5339b = obj;
        this.f5340c = obj2;
        this.f5341d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f5338a) {
            case 0:
                f fVar = (f) this.f5339b;
                ArrayList arrayList = (ArrayList) this.f5340c;
                String str = (String) this.f5341d;
                WorkDatabase workDatabase = fVar.f5347j;
                arrayList.addAll(workDatabase.u().s(str));
                return workDatabase.t().g(str);
            default:
                return ((q1.e) this.f5339b).f5772f.submit(new G4.c((Callable) this.f5340c, 10, (a6.d) this.f5341d));
        }
    }
}
