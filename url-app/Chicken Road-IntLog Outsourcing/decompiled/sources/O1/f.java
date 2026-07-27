package O1;

import B0.t;
import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class f implements Callable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2249a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2250b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2251c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f2252d;

    public /* synthetic */ f(Object obj, Object obj2, Object obj3, int i2) {
        this.f2249a = i2;
        this.f2250b = obj;
        this.f2251c = obj2;
        this.f2252d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f2249a) {
            case 0:
                g gVar = (g) this.f2250b;
                gVar.getClass();
                return gVar.f2253a.submit(new B3.c((Callable) this.f2251c, 6, (B1.g) this.f2252d));
            default:
                WorkDatabase workDatabase = ((t0.f) this.f2250b).f11856e;
                t u5 = workDatabase.u();
                String str = (String) this.f2252d;
                ((ArrayList) this.f2251c).addAll(u5.h(str));
                return workDatabase.t().g(str);
        }
    }
}
