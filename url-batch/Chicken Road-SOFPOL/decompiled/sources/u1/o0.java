package u1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class o0 extends w1.c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final o0 f7254a = new o0();

    @Override // u1.e0
    public final f0 e(w1.n0 n0Var, List list, long j7) {
        int size = list.size();
        d6.v vVar = d6.v.f2327d;
        if (size == 0) {
            return n0Var.e0(r2.a.j(j7), r2.a.i(j7), vVar, m0.f7238g);
        }
        if (size == 1) {
            l0 e8 = ((d0) list.get(0)).e(j7);
            return n0Var.e0(r2.b.f(e8.f7230d, j7), r2.b.e(e8.f7231e, j7), vVar, new c1.g(e8, 4));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size2 = list.size();
        int i = 0;
        int i8 = 0;
        for (int i9 = 0; i9 < size2; i9++) {
            l0 e9 = ((d0) list.get(i9)).e(j7);
            i = Math.max(e9.f7230d, i);
            i8 = Math.max(e9.f7231e, i8);
            arrayList.add(e9);
        }
        return n0Var.e0(r2.b.f(i, j7), r2.b.e(i8, j7), vVar, new q.q(1, arrayList));
    }
}
