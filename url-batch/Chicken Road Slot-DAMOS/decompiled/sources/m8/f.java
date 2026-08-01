package m8;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f6595d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f6596e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f6597i;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Object f6598r;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i3) {
        this.f6595d = i3;
        this.f6596e = obj;
        this.f6597i = obj2;
        this.f6598r = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f6595d) {
            case 0:
                return ((g) this.f6596e).f6599d.submit(new a6.f(16, (Callable) this.f6597i, (l.d) this.f6598r));
            default:
                u5.e eVar = (u5.e) this.f6596e;
                ArrayList arrayList = (ArrayList) this.f6597i;
                String str = (String) this.f6598r;
                WorkDatabase workDatabase = eVar.f9625s;
                arrayList.addAll(workDatabase.C().e(str));
                return workDatabase.B().k(str);
        }
    }
}
