package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class l9 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ int n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l9(int i, mb1 mb1Var, Object obj) {
        super(2);
        this.m = 3;
        this.o = mb1Var;
        this.n = i;
        this.p = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.n;
        Object obj3 = this.p;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                j8.g((vl1) obj4, (Function2) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                iv1.c((gv2) obj4, (my) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ((fa1) obj4).c(i2, obj3, (a00) obj, s03.R(1));
                break;
            case 3:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else {
                    ((mb1) obj4).c(i2, obj3, a00Var, 0);
                }
                break;
            case 4:
                ((Number) obj2).intValue();
                tk3.s((jd2) obj4, (my) obj3, (a00) obj, s03.R(i2 | 1));
                break;
            case 5:
                ((Number) obj2).intValue();
                ((iy1) obj4).c(i2, obj3, (a00) obj, s03.R(1));
                break;
            default:
                ((Number) obj2).intValue();
                ((fz2) obj4).a(obj3, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9(int i, int i2, Object obj, Object obj2) {
        super(2);
        this.m = i2;
        this.o = obj;
        this.p = obj2;
        this.n = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ l9(mb1 mb1Var, int i, Object obj, int i2, int i3) {
        super(2);
        this.m = i3;
        this.o = mb1Var;
        this.n = i;
        this.p = obj;
    }
}
