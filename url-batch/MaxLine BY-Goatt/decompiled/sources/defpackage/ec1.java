package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ec1 extends ul1 implements xh2 {
    public Function0 A;
    public zb1 B;
    public ww1 C;
    public boolean D;
    public ye2 E;
    public final cc1 F = new cc1(this, 0);
    public cc1 G;

    public ec1(Function0 function0, zb1 zb1Var, ww1 ww1Var, boolean z) {
        this.A = function0;
        this.B = zb1Var;
        this.C = ww1Var;
        this.D = z;
        G0();
    }

    public final void G0() {
        this.E = new ye2(new bc1(this, 1), new bc1(this, 2));
        this.G = this.D ? new cc1(this, 1) : null;
    }

    @Override // defpackage.xh2
    public final void M(sh2 sh2Var) {
        t71[] t71VarArr = ii2.a;
        ji2 ji2Var = gi2.m;
        t71[] t71VarArr2 = ii2.a;
        int i = 6;
        t71 t71Var = t71VarArr2[6];
        sh2Var.d(ji2Var, Boolean.TRUE);
        sh2Var.d(gi2.L, this.F);
        ww1 ww1Var = this.C;
        ye2 ye2Var = this.E;
        if (ww1Var == ww1.m) {
            if (ye2Var == null) {
                Intrinsics.f("scrollAxisRange");
                throw null;
            }
            ji2 ji2Var2 = gi2.u;
            t71 t71Var2 = t71VarArr2[12];
            sh2Var.d(ji2Var2, ye2Var);
        } else {
            if (ye2Var == null) {
                Intrinsics.f("scrollAxisRange");
                throw null;
            }
            ji2 ji2Var3 = gi2.t;
            t71 t71Var3 = t71VarArr2[11];
            sh2Var.d(ji2Var3, ye2Var);
        }
        cc1 cc1Var = this.G;
        if (cc1Var != null) {
            sh2Var.d(rh2.f, new r1(null, cc1Var));
        }
        sh2Var.d(rh2.B, new r1(null, new s72(i, new bc1(this, 0))));
        nv c = this.B.c();
        ji2 ji2Var4 = gi2.f;
        t71 t71Var4 = t71VarArr2[22];
        sh2Var.d(ji2Var4, c);
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
