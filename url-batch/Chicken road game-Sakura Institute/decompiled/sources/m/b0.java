package m;

import r1.q1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b0 extends s0.n implements q1, r1.p {

    /* renamed from: u, reason: collision with root package name */
    public static final t0 f6117u = new t0(5);

    /* renamed from: s, reason: collision with root package name */
    public boolean f6118s;

    /* renamed from: t, reason: collision with root package name */
    public r1.a1 f6119t;

    public final c0 A0() {
        if (!this.f8116r) {
            return null;
        }
        q1 j8 = r1.f.j(this, c0.f6124t);
        if (j8 instanceof c0) {
            return (c0) j8;
        }
        return null;
    }

    @Override // r1.p
    public final void V(r1.a1 a1Var) {
        c0 A0;
        this.f6119t = a1Var;
        if (this.f6118s) {
            if (!a1Var.M0().f8116r) {
                c0 A02 = A0();
                if (A02 != null) {
                    A02.A0(null);
                    return;
                }
                return;
            }
            r1.a1 a1Var2 = this.f6119t;
            if (a1Var2 == null || !a1Var2.M0().f8116r || (A0 = A0()) == null) {
                return;
            }
            A0.A0(this.f6119t);
        }
    }

    @Override // r1.q1
    public final Object o() {
        return f6117u;
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }
}
