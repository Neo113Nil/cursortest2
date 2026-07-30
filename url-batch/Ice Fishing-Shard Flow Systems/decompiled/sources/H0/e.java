package H0;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class e implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f882d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f883e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f884i;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ Object f885l;

    public /* synthetic */ e(Object obj, Object obj2, Object obj3, int i2) {
        this.f882d = i2;
        this.f883e = obj;
        this.f884i = obj2;
        this.f885l = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f882d) {
            case 0:
                f fVar = (f) this.f883e;
                ArrayList arrayList = (ArrayList) this.f884i;
                String str = (String) this.f885l;
                WorkDatabase workDatabase = fVar.f891m;
                arrayList.addAll(workDatabase.u().w(str));
                return workDatabase.t().g(str);
            default:
                return ((T1.f) this.f883e).f2586d.submit(new A.j((Callable) this.f884i, 11, (B.f) this.f885l));
        }
    }
}
