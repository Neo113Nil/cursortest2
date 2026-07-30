package p1;

import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class q0 extends r1.b0 {

    /* renamed from: b, reason: collision with root package name */
    public static final q0 f7076b = new q0("Undefined intrinsics block and it is required");

    @Override // p1.f0
    public final g0 a(h0 h0Var, List list, long j8) {
        boolean isEmpty = list.isEmpty();
        e6.v vVar = e6.v.f2827f;
        if (isEmpty) {
            return h0Var.C(m2.a.j(j8), m2.a.i(j8), vVar, o0.f7071i);
        }
        if (list.size() == 1) {
            n0 b9 = ((e0) list.get(0)).b(j8);
            return h0Var.C(r4.a.w(j8, b9.f7063f), r4.a.v(j8, b9.f7064g), vVar, new k.c0(b9, 2));
        }
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i7 = 0; i7 < size; i7++) {
            arrayList.add(((e0) list.get(i7)).b(j8));
        }
        int size2 = arrayList.size();
        int i8 = 0;
        int i9 = 0;
        for (int i10 = 0; i10 < size2; i10++) {
            n0 n0Var = (n0) arrayList.get(i10);
            i8 = Math.max(n0Var.f7063f, i8);
            i9 = Math.max(n0Var.f7064g, i9);
        }
        return h0Var.C(r4.a.w(j8, i8), r4.a.v(j8, i9), vVar, new a0.p0(2, arrayList));
    }
}
