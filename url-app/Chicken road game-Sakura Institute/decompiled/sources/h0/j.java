package h0;

import g0.a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class j extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final j f4620c;

    static {
        int i7 = 0;
        f4620c = new j(i7, i7, 3);
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        while (true) {
            int i7 = a2Var.f3685v;
            if ((i7 >= 0 || a2Var.f3684u <= 0) && i7 != 0) {
                a2Var.D();
                if (g0.d.m(a2Var.f3665b, a2Var.p(a2Var.f3685v))) {
                    bVar.F();
                }
                a2Var.i();
            }
        }
        a2Var.i();
    }
}
