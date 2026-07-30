package defpackage;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public abstract class m01 {
    public final eg0 a;

    public m01(Function0 function0) {
        this.a = new eg0(function0);
    }

    public abstract n01 a(Object obj);

    public gm1 b() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final gm1 c(n01 n01Var, gm1 gm1Var) {
        Object obj = n01Var.e;
        boolean z = n01Var.d;
        ou ouVar = null;
        if (gm1Var instanceof ou) {
            if (z) {
                ouVar = (ou) gm1Var;
                ouVar.a.setValue(n01Var.a());
            }
        } else if ((gm1Var instanceof le1) && ((n01Var.b || obj != null) && !z)) {
            le1 le1Var = (le1) gm1Var;
            if (Intrinsics.a(n01Var.a(), le1Var.a)) {
                ouVar = le1Var;
            }
        }
        if (ouVar != null) {
            return ouVar;
        }
        if (!z) {
            return new le1(n01Var.a());
        }
        vb1 vb1Var = n01Var.c;
        if (vb1Var == null) {
            vb1Var = j41.o;
        }
        return new ou(new av0(obj, vb1Var));
    }
}
