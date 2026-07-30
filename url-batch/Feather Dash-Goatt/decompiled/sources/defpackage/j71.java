package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class j71 extends zq implements ul, uq0 {
    public i5 A;
    public v71 B;
    public yq C;
    public j5 D;
    public i5 E;
    public boolean F;
    public w71 u;
    public et0 v;
    public boolean w;
    public xp x;
    public gn0 y;
    public boolean z;

    @Override // defpackage.uq0
    public final void B() {
        j5 j5Var = (j5) mo.k(this, cu0.a);
        if (Intrinsics.a(j5Var, this.D)) {
            return;
        }
        this.D = j5Var;
        this.E = null;
        yq yqVar = this.C;
        if (yqVar != null) {
            A0(yqVar);
        }
        this.C = null;
        C0();
        v71 v71Var = this.B;
        if (v71Var != null) {
            w71 w71Var = this.u;
            et0 et0Var = this.v;
            v71Var.Q0(this.z ? this.E : this.A, this.x, this.y, et0Var, w71Var, this.w, this.F);
        }
    }

    public final void C0() {
        yq yqVar = this.C;
        if (yqVar != null) {
            if (((zl0) yqVar).d.r) {
                return;
            }
            z0(yqVar);
            return;
        }
        if (this.z) {
            gb0.G(this, new i6(9, this));
        }
        i5 i5Var = this.z ? this.E : this.A;
        if (i5Var != null) {
            zq zqVar = i5Var.i;
            if (zqVar.d.r) {
                return;
            }
            z0(zqVar);
            this.C = zqVar;
        }
    }

    public final boolean D0() {
        vc0 vc0Var = vc0.d;
        if (this.r) {
            vc0Var = op.I(this).D;
        }
        return vc0Var != vc0.e || this.v == et0.d;
    }

    public final void E0(i5 i5Var, xp xpVar, gn0 gn0Var, et0 et0Var, w71 w71Var, boolean z, boolean z2) {
        boolean z3;
        this.u = w71Var;
        this.v = et0Var;
        boolean z4 = true;
        if (this.z != z) {
            this.z = z;
            z3 = true;
        } else {
            z3 = false;
        }
        if (Intrinsics.a(this.A, i5Var)) {
            z4 = false;
        } else {
            this.A = i5Var;
        }
        if (z3 || (z4 && !z)) {
            yq yqVar = this.C;
            if (yqVar != null) {
                A0(yqVar);
            }
            this.C = null;
            C0();
        }
        this.w = z2;
        this.x = xpVar;
        this.y = gn0Var;
        boolean D0 = D0();
        this.F = D0;
        v71 v71Var = this.B;
        if (v71Var != null) {
            v71Var.Q0(this.z ? this.E : this.A, xpVar, gn0Var, et0Var, w71Var, z2, D0);
        }
    }

    @Override // defpackage.yq
    public final void j0() {
        boolean D0 = D0();
        if (this.F != D0) {
            this.F = D0;
            w71 w71Var = this.u;
            et0 et0Var = this.v;
            boolean z = this.z;
            E0(z ? this.E : this.A, this.x, this.y, et0Var, w71Var, z, this.w);
        }
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.zl0
    public final void r0() {
        this.F = D0();
        C0();
        if (this.B == null) {
            w71 w71Var = this.u;
            v71 v71Var = new v71(this.z ? this.E : this.A, this.x, this.y, this.v, w71Var, this.w, this.F);
            z0(v71Var);
            this.B = v71Var;
        }
    }

    @Override // defpackage.zl0
    public final void s0() {
        yq yqVar = this.C;
        if (yqVar != null) {
            A0(yqVar);
        }
    }
}
