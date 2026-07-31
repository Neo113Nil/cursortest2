package x;

import java.util.List;
import r.s1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class j implements u1.e0 {

    /* renamed from: b, reason: collision with root package name */
    public static final j f8226b = new j(0);

    /* renamed from: c, reason: collision with root package name */
    public static final j f8227c = new j(1);

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8228a;

    public /* synthetic */ j(int i) {
        this.f8228a = i;
    }

    @Override // u1.e0
    public final u1.f0 e(w1.n0 n0Var, List list, long j7) {
        switch (this.f8228a) {
            case 0:
                return n0Var.e0(r2.a.j(j7), r2.a.i(j7), d6.v.f2327d, new s1(23));
            default:
                return n0Var.e0(r2.a.f(j7) ? r2.a.h(j7) : 0, r2.a.e(j7) ? r2.a.g(j7) : 0, d6.v.f2327d, new s1(23));
        }
    }
}
