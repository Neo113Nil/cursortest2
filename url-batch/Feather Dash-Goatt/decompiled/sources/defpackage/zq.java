package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class zq extends zl0 {
    public final int s = rp0.e(this);
    public zl0 t;

    public final void A0(yq yqVar) {
        zl0 zl0Var = null;
        for (zl0 zl0Var2 = this.t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
            if (zl0Var2 == yqVar) {
                boolean z = zl0Var2.r;
                if (z) {
                    ln0 ln0Var = rp0.a;
                    if (!z) {
                        o80.b("autoInvalidateRemovedNode called on unattached node");
                    }
                    rp0.a(zl0Var2, -1, 2);
                    zl0Var2.w0();
                    zl0Var2.q0();
                }
                zl0Var2.x0(zl0Var2);
                zl0Var2.h = 0;
                zl0 zl0Var3 = zl0Var2.j;
                if (zl0Var == null) {
                    this.t = zl0Var3;
                } else {
                    zl0Var.j = zl0Var3;
                }
                zl0Var2.j = null;
                zl0Var2.i = null;
                int i = this.g;
                int f = rp0.f(this);
                B0(f, true);
                if (this.r && (i & 2) != 0 && (f & 2) == 0) {
                    l7 l7Var = op.I(this).J;
                    this.d.y0(null);
                    l7Var.j();
                    return;
                }
                return;
            }
            zl0Var = zl0Var2;
        }
        af.j(yqVar, "Could not find delegate: ");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [zl0] */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    public final void B0(int i, boolean z) {
        zl0 zl0Var;
        int i2 = this.g;
        this.g = i;
        if (i2 != i) {
            zl0 zl0Var2 = this.d;
            if (zl0Var2 == this) {
                this.h = i;
            }
            boolean z2 = this.r;
            ?? r2 = this;
            if (z2) {
                while (r2 != 0) {
                    i |= r2.g;
                    r2.g = i;
                    if (r2 == zl0Var2) {
                        break;
                    } else {
                        r2 = r2.i;
                    }
                }
                if (z && r2 == zl0Var2) {
                    i = rp0.f(zl0Var2);
                    zl0Var2.g = i;
                }
                int i3 = i | ((r2 == 0 || (zl0Var = r2.j) == null) ? 0 : zl0Var.h);
                for (zl0 zl0Var3 = r2; zl0Var3 != null; zl0Var3 = zl0Var3.i) {
                    i3 |= zl0Var3.g;
                    zl0Var3.h = i3;
                }
            }
        }
    }

    @Override // defpackage.zl0
    public final void p0() {
        super.p0();
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.y0(this.l);
            if (!zl0Var.r) {
                zl0Var.p0();
            }
        }
    }

    @Override // defpackage.zl0
    public final void q0() {
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.q0();
        }
        super.q0();
    }

    @Override // defpackage.zl0
    public final void u0() {
        super.u0();
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.u0();
        }
    }

    @Override // defpackage.zl0
    public final void v0() {
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.v0();
        }
        super.v0();
    }

    @Override // defpackage.zl0
    public final void w0() {
        super.w0();
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.w0();
        }
    }

    @Override // defpackage.zl0
    public final void x0(zl0 zl0Var) {
        this.d = zl0Var;
        for (zl0 zl0Var2 = this.t; zl0Var2 != null; zl0Var2 = zl0Var2.j) {
            zl0Var2.x0(zl0Var);
        }
    }

    @Override // defpackage.zl0
    public final void y0(qp0 qp0Var) {
        this.l = qp0Var;
        for (zl0 zl0Var = this.t; zl0Var != null; zl0Var = zl0Var.j) {
            zl0Var.y0(qp0Var);
        }
    }

    public final yq z0(yq yqVar) {
        zl0 zl0Var = ((zl0) yqVar).d;
        if (zl0Var != yqVar) {
            zl0 zl0Var2 = yqVar instanceof zl0 ? (zl0) yqVar : null;
            zl0 zl0Var3 = zl0Var2 != null ? zl0Var2.i : null;
            if (zl0Var != this.d || !Intrinsics.a(zl0Var3, this)) {
                dd0.j("Cannot delegate to an already delegated node");
                return null;
            }
        } else {
            if (zl0Var.r) {
                o80.b("Cannot delegate to an already attached node");
            }
            zl0Var.x0(this.d);
            int i = this.g;
            int f = rp0.f(zl0Var);
            zl0Var.g = f;
            int i2 = this.g;
            int i3 = f & 2;
            if (i3 != 0 && (i2 & 2) != 0 && !(this instanceof ad0)) {
                o80.b("Delegating to multiple LayoutModifierNodes without the delegating node implementing LayoutModifierNode itself is not allowed.\nDelegating Node: " + this + "\nDelegate Node: " + zl0Var);
            }
            zl0Var.j = this.t;
            this.t = zl0Var;
            zl0Var.i = this;
            B0(f | this.g, false);
            if (this.r) {
                if (i3 == 0 || (i & 2) != 0) {
                    y0(this.l);
                } else {
                    l7 l7Var = op.I(this).J;
                    this.d.y0(null);
                    l7Var.j();
                }
                zl0Var.p0();
                zl0Var.v0();
                if (!zl0Var.r) {
                    o80.b("autoInvalidateInsertedNode called on unattached node");
                }
                rp0.a(zl0Var, -1, 1);
            }
        }
        return yqVar;
    }
}
