package s7;

import java.util.Objects;
import java.util.concurrent.Callable;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class r1 implements Callable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f8971d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f8972e;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ Object f8973i;

    public r1(j4 j4Var, r4 r4Var) {
        this.f8971d = 2;
        this.f8973i = r4Var;
        Objects.requireNonNull(j4Var);
        this.f8972e = j4Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        switch (this.f8971d) {
            case 0:
                w1 w1Var = (w1) this.f8972e;
                w1Var.f9082d.V();
                m mVar = w1Var.f9082d.f8762i;
                j4.T(mVar);
                return mVar.p0((String) this.f8973i);
            case 1:
                w1 w1Var2 = (w1) this.f8972e;
                w1Var2.f9082d.V();
                return new i(w1Var2.f9082d.p0(((r4) this.f8973i).f8976d));
            default:
                r4 r4Var = (r4) this.f8973i;
                String str = r4Var.f8976d;
                c7.c0.g(str);
                j4 j4Var = (j4) this.f8972e;
                c2 c10 = j4Var.c(str);
                b2 b2Var = b2.ANALYTICS_STORAGE;
                if (c10.i(b2Var) && c2.c(100, r4Var.G).i(b2Var)) {
                    return j4Var.c0(r4Var).F();
                }
                j4Var.b().B.a("Analytics storage consent denied. Returning null app instance id");
                return null;
        }
    }

    public /* synthetic */ r1(w1 w1Var, Object obj, int i3) {
        this.f8971d = i3;
        this.f8973i = obj;
        this.f8972e = w1Var;
    }
}
