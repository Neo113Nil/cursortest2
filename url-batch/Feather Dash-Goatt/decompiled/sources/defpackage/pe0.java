package defpackage;

import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class pe0 {
    public final p51 a;
    public final te0 b;
    public final vn0 c;

    public pe0(p51 p51Var, te0 te0Var) {
        this.a = p51Var;
        this.b = te0Var;
        long[] jArr = q61.a;
        this.c = new vn0();
    }

    public final Function2 a(Object obj, int i, Object obj2) {
        vn0 vn0Var = this.c;
        oe0 oe0Var = (oe0) vn0Var.g(obj);
        int i2 = 2;
        if (oe0Var != null && oe0Var.c == i && Intrinsics.a(oe0Var.b, obj2)) {
            hk hkVar = oe0Var.d;
            if (hkVar != null) {
                return hkVar;
            }
            hk hkVar2 = new hk(818252804, true, new il(oe0Var.e, i2, oe0Var));
            oe0Var.d = hkVar2;
            return hkVar2;
        }
        oe0 oe0Var2 = new oe0(this, i, obj, obj2);
        vn0Var.m(obj, oe0Var2);
        hk hkVar3 = oe0Var2.d;
        if (hkVar3 != null) {
            return hkVar3;
        }
        hk hkVar4 = new hk(818252804, true, new il(this, i2, oe0Var2));
        oe0Var2.d = hkVar4;
        return hkVar4;
    }

    public final Object b(Object obj) {
        if (obj == null) {
            return null;
        }
        oe0 oe0Var = (oe0) this.c.g(obj);
        if (oe0Var != null) {
            return oe0Var.b;
        }
        mf0 mf0Var = (mf0) this.b.invoke();
        int b = mf0Var.d.b(obj);
        if (b != -1) {
            return mf0Var.b(b);
        }
        return null;
    }
}
