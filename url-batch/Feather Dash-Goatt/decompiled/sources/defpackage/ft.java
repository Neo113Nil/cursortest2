package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class ft extends zl0 implements kj1, sc0 {
    public ft s;
    public ft t;
    public long u;

    public final void A0() {
        ft ftVar = this.t;
        if (ftVar != null) {
            ftVar.A0();
            return;
        }
        ft ftVar2 = this.s;
        if (ftVar2 != null) {
            ftVar2.A0();
        }
    }

    public final void B0() {
        ft ftVar = this.t;
        if (ftVar != null) {
            ftVar.B0();
        }
        ft ftVar2 = this.s;
        if (ftVar2 != null) {
            ftVar2.B0();
        }
        this.s = null;
    }

    public final void C0(s40 s40Var) {
        kj1 kj1Var;
        ft ftVar;
        ft ftVar2 = this.s;
        if (ftVar2 == null || !m90.h(ftVar2, la0.I(s40Var))) {
            if (this.d.r) {
                z11 z11Var = new z11();
                ka0.J(this, new z6(z11Var, this, s40Var, 2));
                kj1Var = (kj1) z11Var.d;
            } else {
                kj1Var = null;
            }
            ftVar = (ft) kj1Var;
        } else {
            ftVar = ftVar2;
        }
        if (ftVar != null && ftVar2 == null) {
            ftVar.A0();
            ftVar.C0(s40Var);
            ft ftVar3 = this.t;
            if (ftVar3 != null) {
                ftVar3.B0();
            }
        } else if (ftVar == null && ftVar2 != null) {
            ft ftVar4 = this.t;
            if (ftVar4 != null) {
                ftVar4.A0();
                ftVar4.C0(s40Var);
            }
            ftVar2.B0();
        } else if (!Intrinsics.a(ftVar, ftVar2)) {
            if (ftVar != null) {
                ftVar.A0();
                ftVar.C0(s40Var);
            }
            if (ftVar2 != null) {
                ftVar2.B0();
            }
        } else if (ftVar != null) {
            ftVar.C0(s40Var);
        } else {
            ft ftVar5 = this.t;
            if (ftVar5 != null) {
                ftVar5.C0(s40Var);
            }
        }
        this.s = ftVar;
    }

    public final void D0() {
        ft ftVar = this.t;
        if (ftVar != null) {
            ftVar.D0();
            return;
        }
        ft ftVar2 = this.s;
        if (ftVar2 != null) {
            ftVar2.D0();
        }
    }

    @Override // defpackage.kj1
    public final Object h() {
        return j41.i;
    }

    @Override // defpackage.sc0
    public final void l(long j) {
        this.u = j;
    }

    @Override // defpackage.zl0
    public final void s0() {
        this.t = null;
        this.s = null;
    }

    public final boolean z0() {
        ft ftVar = this.s;
        if (ftVar != null) {
            return ftVar.z0();
        }
        ft ftVar2 = this.t;
        if (ftVar2 != null) {
            return ftVar2.z0();
        }
        return false;
    }
}
