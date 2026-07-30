package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final /* synthetic */ class jh1 implements Function2 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    public /* synthetic */ jh1(String str, boolean z, Function1 function1, int i) {
        this.o = str;
        this.n = z;
        this.p = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.p;
        boolean z = this.n;
        Object obj4 = this.o;
        int i2 = 1;
        switch (i) {
            case 0:
                op1 op1Var = (op1) obj4;
                up1 up1Var = (up1) obj3;
                a00 a00Var = (a00) obj;
                int intValue = ((Integer) obj2).intValue();
                if (a00Var.P(intValue & 1, (intValue & 3) != 2)) {
                    if (z) {
                        a00Var.X(2086422720);
                        iv1.g(null, cw.b, 0L, null, yj1.H(1799326632, new qk(i2, op1Var, up1Var), a00Var), a00Var, 196656);
                    } else {
                        a00Var.X(2083152220);
                    }
                    a00Var.q(false);
                } else {
                    a00Var.S();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                zj2.f((String) obj4, z, (Function1) obj3, (a00) obj, s03.R(1));
                break;
        }
        return Unit.a;
    }

    public /* synthetic */ jh1(boolean z, op1 op1Var, up1 up1Var) {
        this.n = z;
        this.o = op1Var;
        this.p = up1Var;
    }
}
