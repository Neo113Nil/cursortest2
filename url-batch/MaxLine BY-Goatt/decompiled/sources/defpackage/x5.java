package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x5 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ my n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(my myVar, int i) {
        super(2);
        this.m = i;
        this.n = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        my myVar = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                e6.b(myVar, (a00) obj, s03.R(439));
                break;
            case 1:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    myVar.a(co0.a, a00Var, 6);
                }
                break;
            case 2:
                ((Number) obj2).intValue();
                zm3.e(myVar, (a00) obj, s03.R(7));
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    myVar.invoke(a00Var2, 0);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x5(my myVar, int i, int i2) {
        super(2);
        this.m = i2;
        this.n = myVar;
    }
}
