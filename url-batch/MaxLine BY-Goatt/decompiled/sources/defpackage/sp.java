package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class sp extends ul1 implements lp, r81, rz2 {
    public static final nj C = new nj(4);
    public h20 A;
    public boolean B;

    public static final w72 G0(sp spVar, ks1 ks1Var, Function0 function0) {
        w72 w72Var;
        if (spVar.z && spVar.B) {
            ks1 I = s03.I(spVar);
            if (!ks1Var.Q0().z) {
                ks1Var = null;
            }
            if (ks1Var != null && (w72Var = (w72) function0.invoke()) != null) {
                float f = I.M(ks1Var, false).a;
                return w72Var.g((Float.floatToRawIntBits(r4.b) & 4294967295L) | (Float.floatToRawIntBits(f) << 32));
            }
        }
        return null;
    }

    @Override // defpackage.r81
    public final void q(t81 t81Var) {
        this.B = true;
    }

    @Override // defpackage.rz2
    public final Object r() {
        return C;
    }

    @Override // defpackage.lp
    public final Object t0(ks1 ks1Var, Function0 function0, r30 r30Var) {
        Object t = j8.t(new rp(this, ks1Var, function0, new bn(this, ks1Var, function0, 1), null), r30Var);
        return t == b50.m ? t : Unit.a;
    }

    @Override // defpackage.ul1
    public final boolean v0() {
        return false;
    }
}
