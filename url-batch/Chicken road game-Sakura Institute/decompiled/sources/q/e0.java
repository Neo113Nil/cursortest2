package q;

import r1.j1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class e0 extends s0.n implements j1 {

    /* renamed from: s, reason: collision with root package name */
    public float f7274s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7275t;

    @Override // r1.j1
    public final Object h0(Object obj) {
        k0 k0Var = obj instanceof k0 ? (k0) obj : null;
        if (k0Var == null) {
            k0Var = new k0();
        }
        k0Var.f7297a = this.f7274s;
        k0Var.f7298b = this.f7275t;
        return k0Var;
    }
}
