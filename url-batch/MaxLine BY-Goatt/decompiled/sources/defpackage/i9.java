package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class i9 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ tt0 n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(o32 o32Var, Function0 function0, ih2 ih2Var, int i) {
        super(2);
        this.m = 3;
        this.q = o32Var;
        this.p = function0;
        this.n = ih2Var;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.o;
        tt0 tt0Var = this.n;
        Object obj3 = this.q;
        Object obj4 = this.p;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                j8.c((Function0) obj4, (cb0) obj3, (my) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                iv1.f((du1) obj4, (f6) obj3, (my) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                ih2 ih2Var = (ih2) tt0Var;
                l41.c((g30) obj3, (Function0) obj4, sl1.a, ih2Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 3:
                ((Number) obj2).intValue();
                k30.d((o32) obj3, (Function0) obj4, (ih2) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 4:
                ((Number) obj2).intValue();
                ((gc1) obj4).e(obj3, (my) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                j8.f((gq2) obj4, (vl1) obj3, (Function2) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i9(g30 g30Var, Function0 function0, ih2 ih2Var, int i) {
        super(2);
        this.m = 2;
        this.q = g30Var;
        this.p = function0;
        this.n = ih2Var;
        this.o = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9(Object obj, Object obj2, Function2 function2, int i, int i2) {
        super(2);
        this.m = i2;
        this.p = obj;
        this.q = obj2;
        this.n = function2;
        this.o = i;
    }
}
