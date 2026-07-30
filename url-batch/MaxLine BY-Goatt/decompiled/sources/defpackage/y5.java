package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y5 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ my o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y5(Function2 function2, my myVar, int i) {
        super(2);
        this.m = i;
        this.n = function2;
        this.o = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = 0;
        my myVar = this.o;
        Function2 function2 = this.n;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    a00Var.X(1497073862);
                    if (function2 != null) {
                        function2.invoke(a00Var, 0);
                        Unit unit = Unit.a;
                    }
                    a00Var.q(false);
                    myVar.invoke(a00Var, 0);
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    zx1 zx1Var = e6.a;
                    e6.b(yj1.H(1887135077, new y5(function2, myVar, i2), a00Var2), a00Var2, 438);
                }
                break;
        }
        return Unit.a;
    }
}
