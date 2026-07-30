package h0;

import g0.a2;
import g0.p1;
import g0.v1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class x extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final x f4638c = new x(1, 0, 2);

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        int d8 = pVar.d(0);
        int o2 = a2Var.o();
        int i7 = a2Var.f3685v;
        int E = a2Var.E(a2Var.f3665b, a2Var.p(i7));
        int f9 = a2Var.f(a2Var.f3665b, a2Var.p(i7 + 1));
        for (int max = Math.max(E, f9 - d8); max < f9; max++) {
            Object obj = a2Var.f3666c[a2Var.g(max)];
            if (obj instanceof v1) {
                tVar.h(((v1) obj).f3952a, o2 - max, -1, -1);
            } else if (obj instanceof p1) {
                ((p1) obj).d();
            }
        }
        g0.d.O(d8 > 0);
        int i8 = a2Var.f3685v;
        int E2 = a2Var.E(a2Var.f3665b, a2Var.p(i8));
        int f10 = a2Var.f(a2Var.f3665b, a2Var.p(i8 + 1)) - d8;
        g0.d.O(f10 >= E2);
        a2Var.C(f10, d8, i8);
        int i9 = a2Var.f3672i;
        if (i9 >= E2) {
            a2Var.f3672i = i9 - d8;
        }
    }

    @Override // h0.c0
    public final String b(int i7) {
        return i7 == 0 ? "count" : super.b(i7);
    }
}
