package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class z8 extends o81 implements Function2 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(long j, yx1 yx1Var, my myVar) {
        super(2);
        this.n = j;
        this.o = yx1Var;
        this.p = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int R = s03.R(1);
                e9.a((du1) obj4, (vl1) obj3, this.n, (a00) obj, R);
                break;
            default:
                a00 a00Var = (a00) obj;
                int intValue = ((Number) obj2).intValue();
                int i2 = 3;
                if ((intValue & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    yj1.f(this.n, ((l13) a00Var.j(n13.a)).m, yj1.H(1327513942, new n8(i2, (yx1) obj4, (my) obj3), a00Var), a00Var, 384);
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z8(du1 du1Var, vl1 vl1Var, long j, int i) {
        super(2);
        this.o = du1Var;
        this.p = vl1Var;
        this.n = j;
    }
}
