package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class p90 extends ul1 {
    public final int A = ls1.e(this);
    public ul1 B;

    @Override // defpackage.ul1
    public final void B0() {
        super.B0();
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.B0();
        }
    }

    @Override // defpackage.ul1
    public final void C0() {
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.C0();
        }
        super.C0();
    }

    @Override // defpackage.ul1
    public final void D0() {
        super.D0();
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.D0();
        }
    }

    @Override // defpackage.ul1
    public final void E0(ul1 ul1Var) {
        this.m = ul1Var;
        for (ul1 ul1Var2 = this.B; ul1Var2 != null; ul1Var2 = ul1Var2.r) {
            ul1Var2.E0(ul1Var);
        }
    }

    @Override // defpackage.ul1
    public final void F0(ks1 ks1Var) {
        this.t = ks1Var;
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.F0(ks1Var);
        }
    }

    public final void G0(o90 o90Var) {
        ul1 ul1Var = ((ul1) o90Var).m;
        if (ul1Var != o90Var) {
            ul1 ul1Var2 = o90Var instanceof ul1 ? (ul1) o90Var : null;
            ul1 ul1Var3 = ul1Var2 != null ? ul1Var2.q : null;
            if (ul1Var == this.m && Intrinsics.b(ul1Var3, this)) {
                return;
            }
            lh.g("Cannot delegate to an already delegated node");
            return;
        }
        if (ul1Var.z) {
            h21.b("Cannot delegate to an already attached node");
        }
        ul1Var.E0(this.m);
        int i = this.o;
        int f = ls1.f(ul1Var);
        ul1Var.o = f;
        int i2 = this.o;
        int i3 = f & 2;
        if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof a91)) {
            h21.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + ul1Var);
        }
        ul1Var.r = this.B;
        this.B = ul1Var;
        ul1Var.q = this;
        I0(f | this.o, false);
        if (this.z) {
            if (i3 == 0 || (i & 2) != 0) {
                F0(this.t);
            } else {
                fs1 fs1Var = s03.J(this).P;
                this.m.F0(null);
                fs1Var.g();
            }
            ul1Var.w0();
            ul1Var.C0();
            if (!ul1Var.z) {
                h21.b("autoInvalidateInsertedNode called on unattached node");
            }
            ls1.a(ul1Var, -1, 1);
        }
    }

    public final void H0(o90 o90Var) {
        ul1 ul1Var = null;
        for (ul1 ul1Var2 = this.B; ul1Var2 != null; ul1Var2 = ul1Var2.r) {
            if (ul1Var2 == o90Var) {
                boolean z = ul1Var2.z;
                if (z) {
                    hn1 hn1Var = ls1.a;
                    if (!z) {
                        h21.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    ls1.a(ul1Var2, -1, 2);
                    ul1Var2.D0();
                    ul1Var2.x0();
                }
                ul1Var2.E0(ul1Var2);
                ul1Var2.p = 0;
                ul1 ul1Var3 = ul1Var2.r;
                if (ul1Var == null) {
                    this.B = ul1Var3;
                } else {
                    ul1Var.r = ul1Var3;
                }
                ul1Var2.r = null;
                ul1Var2.q = null;
                int i = this.o;
                int f = ls1.f(this);
                I0(f, true);
                if (this.z && (i & 2) != 0 && (f & 2) == 0) {
                    fs1 fs1Var = s03.J(this).P;
                    this.m.F0(null);
                    fs1Var.g();
                    return;
                }
                return;
            }
            ul1Var = ul1Var2;
        }
        dm0.i(o90Var, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [ul1] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void I0(int i, boolean z) {
        ul1 ul1Var;
        int i2 = this.o;
        this.o = i;
        if (i2 != i) {
            ul1 ul1Var2 = this.m;
            if (ul1Var2 == this) {
                this.p = i;
            }
            boolean z2 = this.z;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.o;
                    r2.o = i;
                    if (r2 == ul1Var2) {
                        break;
                    } else {
                        r2 = r2.q;
                    }
                }
                if (z && r2 == ul1Var2) {
                    i = ls1.f(ul1Var2);
                    ul1Var2.o = i;
                }
                int i3 = i | ((r2 == 0 || (ul1Var = r2.r) == null) ? 0 : ul1Var.p);
                for (ul1 ul1Var3 = r2; ul1Var3 != null; ul1Var3 = ul1Var3.q) {
                    i3 |= ul1Var3.o;
                    ul1Var3.p = i3;
                }
            }
        }
    }

    @Override // defpackage.ul1
    public final void w0() {
        super.w0();
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.F0(this.t);
            if (!ul1Var.z) {
                ul1Var.w0();
            }
        }
    }

    @Override // defpackage.ul1
    public final void x0() {
        for (ul1 ul1Var = this.B; ul1Var != null; ul1Var = ul1Var.r) {
            ul1Var.x0();
        }
        super.x0();
    }
}
