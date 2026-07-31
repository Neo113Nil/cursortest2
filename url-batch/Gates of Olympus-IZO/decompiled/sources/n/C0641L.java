package n;

import t0.AbstractC0898f;
import t0.InterfaceC0908p;
import t0.q0;

/* renamed from: n.L, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0641L extends U.k implements q0, InterfaceC0908p {

    /* renamed from: s, reason: collision with root package name */
    public static final b0 f6015s = new b0(5);

    /* renamed from: q, reason: collision with root package name */
    public boolean f6016q;

    /* renamed from: r, reason: collision with root package name */
    public t0.a0 f6017r;

    @Override // t0.InterfaceC0908p
    public final void b0(t0.a0 a0Var) {
        C0642M v0;
        this.f6017r = a0Var;
        if (this.f6016q) {
            if (!a0Var.B0().p) {
                C0642M v02 = v0();
                if (v02 != null) {
                    v02.v0(null);
                    return;
                }
                return;
            }
            t0.a0 a0Var2 = this.f6017r;
            if (a0Var2 == null || !a0Var2.B0().p || (v0 = v0()) == null) {
                return;
            }
            v0.v0(this.f6017r);
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // t0.q0
    public final Object v() {
        return f6015s;
    }

    public final C0642M v0() {
        if (!this.p) {
            return null;
        }
        q0 j3 = AbstractC0898f.j(this, C0642M.f6018r);
        if (j3 instanceof C0642M) {
            return (C0642M) j3;
        }
        return null;
    }
}
