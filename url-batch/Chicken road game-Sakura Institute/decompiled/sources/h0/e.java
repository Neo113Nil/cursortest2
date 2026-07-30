package h0;

import g0.a2;
import g0.v1;
import java.util.ArrayList;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final e f4615c = new e(0, 2, 1);

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        g0.c cVar = (g0.c) pVar.e(0);
        Object e9 = pVar.e(1);
        if (e9 instanceof v1) {
            ((ArrayList) tVar.f3892c).add(((v1) e9).f3952a);
        }
        if (a2Var.f3677n != 0) {
            g0.d.w("Can only append a slot if not current inserting");
            throw null;
        }
        int i7 = a2Var.f3672i;
        int i8 = a2Var.f3673j;
        int c4 = a2Var.c(cVar);
        int f9 = a2Var.f(a2Var.f3665b, a2Var.p(c4 + 1));
        a2Var.f3672i = f9;
        a2Var.f3673j = f9;
        a2Var.s(1, c4);
        if (i7 >= f9) {
            i7++;
            i8++;
        }
        a2Var.f3666c[f9] = e9;
        a2Var.f3672i = i7;
        a2Var.f3673j = i8;
    }

    @Override // h0.c0
    public final String c(int i7) {
        return i7 == 0 ? "anchor" : i7 == 1 ? "value" : super.c(i7);
    }
}
