package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class if0 extends zl0 implements j81 {
    public Function0 s;
    public df0 t;
    public et0 u;
    public boolean v;
    public z61 w;
    public final ff0 x = new ff0(this, 0);
    public ff0 y;

    public if0(Function0 function0, df0 df0Var, et0 et0Var, boolean z) {
        this.s = function0;
        this.t = df0Var;
        this.u = et0Var;
        this.v = z;
        z0();
    }

    @Override // defpackage.j81
    public final void W(u81 u81Var) {
        dc0[] dc0VarArr = s81.a;
        t81 t81Var = p81.m;
        dc0[] dc0VarArr2 = s81.a;
        dc0 dc0Var = dc0VarArr2[6];
        u81Var.a(t81Var, Boolean.TRUE);
        u81Var.a(p81.J, this.x);
        et0 et0Var = this.u;
        et0 et0Var2 = et0.d;
        z61 z61Var = this.w;
        if (et0Var == et0Var2) {
            if (z61Var == null) {
                Intrinsics.e("scrollAxisRange");
                throw null;
            }
            t81 t81Var2 = p81.v;
            dc0 dc0Var2 = dc0VarArr2[13];
            u81Var.a(t81Var2, z61Var);
        } else {
            if (z61Var == null) {
                Intrinsics.e("scrollAxisRange");
                throw null;
            }
            t81 t81Var3 = p81.u;
            dc0 dc0Var3 = dc0VarArr2[12];
            u81Var.a(t81Var3, z61Var);
        }
        ff0 ff0Var = this.y;
        if (ff0Var != null) {
            u81Var.a(g81.f, new z0(null, ff0Var));
        }
        u81Var.a(g81.B, new z0(null, new a3(22, new gf0(this, 2))));
        df0 df0Var = this.t;
        df0Var.getClass();
        xh xhVar = new xh(((Number) df0Var.a.getValue()).intValue(), 1);
        t81 t81Var4 = p81.f;
        dc0 dc0Var4 = dc0VarArr2[23];
        u81Var.a(t81Var4, xhVar);
    }

    @Override // defpackage.zl0
    public final boolean o0() {
        return false;
    }

    public final void z0() {
        this.w = new z61(new gf0(this, 0), new gf0(this, 1));
        this.y = this.v ? new ff0(this, 1) : null;
    }
}
