package defpackage;

import java.util.List;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class s91 extends f91 {
    public final /* synthetic */ v91 b;
    public final /* synthetic */ Function2 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s91(v91 v91Var, Function2 function2, String str) {
        super(str);
        this.b = v91Var;
        this.c = function2;
    }

    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        v91 v91Var = this.b;
        q91 q91Var = v91Var.t;
        q91Var.m = qj1Var.getLayoutDirection();
        q91Var.n = qj1Var.d();
        q91Var.o = qj1Var.p();
        boolean w = qj1Var.w();
        Function2 function2 = this.c;
        if (w || v91Var.m.s == null) {
            v91Var.p = 0;
            pj1 pj1Var = (pj1) function2.invoke(q91Var, new u10(j));
            return new r91(pj1Var, v91Var, v91Var.p, pj1Var, 1);
        }
        v91Var.q = 0;
        pj1 pj1Var2 = (pj1) function2.invoke(v91Var.u, new u10(j));
        return new r91(pj1Var2, v91Var, v91Var.q, pj1Var2, 0);
    }
}
