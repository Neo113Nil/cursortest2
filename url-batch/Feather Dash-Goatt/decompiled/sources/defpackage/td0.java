package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-dd5e919efaf02f4d8ff55d6a5e2559a4e7180bda542179c0d9d8fc6a077876b4 */
/* loaded from: classes.dex */
public final class td0 extends gd0 {
    public final /* synthetic */ xd0 a;
    public final /* synthetic */ Function2 b;

    public td0(xd0 xd0Var, Function2 function2) {
        this.a = xd0Var;
        this.b = function2;
    }

    @Override // defpackage.vk0
    public final wk0 f(ej0 ej0Var, List list, long j) {
        xd0 xd0Var = this.a;
        rd0 rd0Var = xd0Var.l;
        rd0Var.d = ej0Var.getLayoutDirection();
        rd0Var.e = ej0Var.k();
        rd0Var.g = ej0Var.f();
        boolean m = ej0Var.m();
        Function2 function2 = this.b;
        if (m || xd0Var.d.m == null) {
            xd0Var.h = 0;
            wk0 wk0Var = (wk0) function2.b(rd0Var, new mm(j));
            return new sd0(wk0Var, xd0Var, xd0Var.h, wk0Var, 1);
        }
        xd0Var.i = 0;
        wk0 wk0Var2 = (wk0) function2.b(xd0Var.m, new mm(j));
        return new sd0(wk0Var2, xd0Var, xd0Var.i, wk0Var2, 0);
    }
}
