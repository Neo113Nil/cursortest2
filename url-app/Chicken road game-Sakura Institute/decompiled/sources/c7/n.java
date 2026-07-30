package c7;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n extends f1 implements m {
    public final Object d0(j6.c cVar) {
        Object obj;
        do {
            obj = f1.f1692f.get(this);
            if (!(obj instanceof u0)) {
                if (obj instanceof p) {
                    throw ((p) obj).f1725a;
                }
                return a0.v(obj);
            }
        } while (Z(obj) < 0);
        c1 c1Var = new c1(a8.m.A(cVar), this);
        c1Var.r();
        c1Var.u(new e(2, a0.m(this, true, new j0(2, c1Var))));
        return c1Var.q();
    }
}
