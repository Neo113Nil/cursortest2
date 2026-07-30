package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class kf0 {
    public final u5 a;

    public kf0(Function1 function1) {
        u5 u5Var = new u5();
        u5Var.b = new eo0(new ja0[16]);
        this.a = u5Var;
        function1.invoke(this);
    }

    public final void a(int i, Function1 function1, hk hkVar) {
        yw ywVar = new yw(function1, 16, hkVar);
        u5 u5Var = this.a;
        u5Var.getClass();
        if (i < 0) {
            r80.a("size should be >=0");
        }
        if (i == 0) {
            return;
        }
        ja0 ja0Var = new ja0(u5Var.a, i, ywVar);
        u5Var.a += i;
        ((eo0) u5Var.b).b(ja0Var);
    }
}
