package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class t5 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function2 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ t5(int i, Function2 function2) {
        super(2);
        this.m = i;
        this.n = function2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        sl1 sl1Var = sl1.a;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    vl1 k = a.g(sl1Var, e6.b).k(new HorizontalAlignElement(qb2.A));
                    oj1 e = fp.e(qb2.p, false);
                    int D = iv1.D(a00Var);
                    v02 l = a00Var.l();
                    vl1 E = bd3.E(a00Var, k);
                    pz.b.getClass();
                    o00 o00Var = oz.b;
                    a00Var.b0();
                    if (a00Var.S) {
                        a00Var.k(o00Var);
                    } else {
                        a00Var.l0();
                    }
                    uj2.e(a00Var, e, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var, D, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    function2.invoke(a00Var, 0);
                    a00Var.q(true);
                }
                break;
            case 1:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    vl1 k2 = a.g(new LayoutWeightElement(1.0f, false), e6.c).k(new HorizontalAlignElement(qb2.A));
                    oj1 e2 = fp.e(qb2.p, false);
                    int D2 = iv1.D(a00Var2);
                    v02 l2 = a00Var2.l();
                    vl1 E2 = bd3.E(a00Var2, k2);
                    pz.b.getClass();
                    o00 o00Var2 = oz.b;
                    a00Var2.b0();
                    if (a00Var2.S) {
                        a00Var2.k(o00Var2);
                    } else {
                        a00Var2.l0();
                    }
                    uj2.e(a00Var2, e2, oz.f);
                    uj2.e(a00Var2, l2, oz.e);
                    sc scVar2 = oz.g;
                    if (a00Var2.S || !Intrinsics.b(a00Var2.M(), Integer.valueOf(D2))) {
                        q40.r(D2, a00Var2, D2, scVar2);
                    }
                    uj2.e(a00Var2, E2, oz.d);
                    function2.invoke(a00Var2, 0);
                    a00Var2.q(true);
                }
                break;
            default:
                a00 a00Var3 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var3.B()) {
                    a00Var3.S();
                } else {
                    vl1 c = androidx.compose.ui.layout.a.c(sl1Var, "Container");
                    oj1 e3 = fp.e(qb2.p, true);
                    int D3 = iv1.D(a00Var3);
                    v02 l3 = a00Var3.l();
                    vl1 E3 = bd3.E(a00Var3, c);
                    pz.b.getClass();
                    o00 o00Var3 = oz.b;
                    a00Var3.b0();
                    if (a00Var3.S) {
                        a00Var3.k(o00Var3);
                    } else {
                        a00Var3.l0();
                    }
                    uj2.e(a00Var3, e3, oz.f);
                    uj2.e(a00Var3, l3, oz.e);
                    sc scVar3 = oz.g;
                    if (a00Var3.S || !Intrinsics.b(a00Var3.M(), Integer.valueOf(D3))) {
                        q40.r(D3, a00Var3, D3, scVar3);
                    }
                    uj2.e(a00Var3, E3, oz.d);
                    function2.invoke(a00Var3, 0);
                    a00Var3.q(true);
                }
                break;
        }
        return Unit.a;
    }
}
