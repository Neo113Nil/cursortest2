package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class d6 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ tt0 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(g30 g30Var, Function0 function0, vl1 vl1Var, ih2 ih2Var, int i) {
        super(2);
        this.m = 1;
        this.q = g30Var;
        this.n = function0;
        this.o = vl1Var;
        this.r = ih2Var;
        this.p = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.p;
        tt0 tt0Var = this.r;
        Object obj3 = this.q;
        Object obj4 = this.o;
        Object obj5 = this.n;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                e6.d((Function0) obj5, (vl1) obj4, (cb0) obj3, (my) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 1:
                ((Number) obj2).intValue();
                l41.c((g30) obj3, (Function0) obj5, (vl1) obj4, (ih2) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            case 2:
                ((Number) obj2).intValue();
                k30.c((o32) obj4, (Function0) obj5, (y20) obj3, (ih2) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                pi1.a((gw) obj5, (jk2) obj4, (l13) obj3, (my) tt0Var, (a00) obj, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d6(o32 o32Var, Function0 function0, y20 y20Var, ih2 ih2Var, int i) {
        super(2);
        this.m = 2;
        this.o = o32Var;
        this.n = function0;
        this.q = y20Var;
        this.r = ih2Var;
        this.p = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d6(Object obj, Object obj2, Object obj3, my myVar, int i, int i2) {
        super(2);
        this.m = i2;
        this.n = obj;
        this.o = obj2;
        this.q = obj3;
        this.r = myVar;
        this.p = i;
    }
}
