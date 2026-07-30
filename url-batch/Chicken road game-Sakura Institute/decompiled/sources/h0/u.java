package h0;

import g0.a2;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class u extends c0 {

    /* renamed from: c, reason: collision with root package name */
    public static final u f4635c;

    static {
        int i7 = 0;
        f4635c = new u(i7, i7, 3);
    }

    @Override // h0.c0
    public final void a(a0.p pVar, b1.b bVar, a2 a2Var, g0.t tVar) {
        if (a2Var.f3677n != 0) {
            g0.d.w("Cannot reset when inserting");
            throw null;
        }
        a2Var.z();
        a2Var.f3683t = 0;
        a2Var.f3684u = a2Var.m() - a2Var.f3671h;
        a2Var.f3672i = 0;
        a2Var.f3673j = 0;
        a2Var.f3678o = 0;
    }
}
