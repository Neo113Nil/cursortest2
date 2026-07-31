package n;

import t0.AbstractC0993f;
import t0.InterfaceC1003p;

/* renamed from: n.N, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0671N extends U.p implements t0.r0, InterfaceC1003p {

    /* renamed from: s, reason: collision with root package name */
    public static final i0 f7060s = new i0(5);

    /* renamed from: q, reason: collision with root package name */
    public boolean f7061q;

    /* renamed from: r, reason: collision with root package name */
    public t0.b0 f7062r;

    @Override // t0.InterfaceC1003p
    public final void c0(t0.b0 b0Var) {
        C0672O y02;
        this.f7062r = b0Var;
        if (this.f7061q) {
            if (!b0Var.K0().f4501p) {
                C0672O y03 = y0();
                if (y03 != null) {
                    y03.y0(null);
                    return;
                }
                return;
            }
            t0.b0 b0Var2 = this.f7062r;
            if (b0Var2 == null || !b0Var2.K0().f4501p || (y02 = y0()) == null) {
                return;
            }
            y02.y0(this.f7062r);
        }
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // t0.r0
    public final Object w() {
        return f7060s;
    }

    public final C0672O y0() {
        if (!this.f4501p) {
            return null;
        }
        t0.r0 j3 = AbstractC0993f.j(this, C0672O.f7063r);
        if (j3 instanceof C0672O) {
            return (C0672O) j3;
        }
        return null;
    }
}
