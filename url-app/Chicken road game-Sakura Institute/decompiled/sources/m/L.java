package m;

import r0.AbstractC1065f;
import r0.InterfaceC1075p;

/* loaded from: classes.dex */
public final class L extends S.n implements r0.q0, InterfaceC1075p {

    /* renamed from: v, reason: collision with root package name */
    public static final f0 f8030v = new f0(5);

    /* renamed from: t, reason: collision with root package name */
    public boolean f8031t;

    /* renamed from: u, reason: collision with root package name */
    public r0.a0 f8032u;

    public final M B0() {
        if (!this.f3990s) {
            return null;
        }
        r0.q0 j4 = AbstractC1065f.j(this, M.f8033u);
        if (j4 instanceof M) {
            return (M) j4;
        }
        return null;
    }

    @Override // r0.InterfaceC1075p
    public final void H(r0.a0 a0Var) {
        M B02;
        this.f8032u = a0Var;
        if (this.f8031t) {
            if (!a0Var.O0().f3990s) {
                M B03 = B0();
                if (B03 != null) {
                    B03.B0(null);
                    return;
                }
                return;
            }
            r0.a0 a0Var2 = this.f8032u;
            if (a0Var2 == null || !a0Var2.O0().f3990s || (B02 = B0()) == null) {
                return;
            }
            B02.B0(this.f8032u);
        }
    }

    @Override // S.n
    public final boolean q0() {
        return false;
    }

    @Override // r0.q0
    public final Object u() {
        return f8030v;
    }
}
