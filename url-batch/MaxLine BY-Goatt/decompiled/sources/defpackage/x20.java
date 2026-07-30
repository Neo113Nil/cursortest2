package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class x20 extends o81 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ my n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ Function0 p;
    public final /* synthetic */ int q;
    public final /* synthetic */ Object r;
    public final /* synthetic */ tt0 s;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(my myVar, my myVar2, my myVar3, Function2 function2, boolean z, Function0 function0, int i) {
        super(2);
        this.n = myVar;
        this.r = myVar2;
        this.s = myVar3;
        this.t = function2;
        this.o = z;
        this.p = function0;
        this.q = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.q;
        Object obj3 = this.t;
        tt0 tt0Var = this.s;
        Object obj4 = this.r;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                int R = s03.R(i2 | 1);
                Function0 function0 = this.p;
                l41.d((g30) obj4, function0, (ih2) tt0Var, (vl1) obj3, this.o, this.n, (a00) obj, R);
                break;
            default:
                ((Number) obj2).intValue();
                int R2 = s03.R(i2 | 1);
                my myVar = this.n;
                iv1.i(myVar, (my) obj4, (my) tt0Var, (Function2) obj3, this.o, this.p, (a00) obj, R2);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x20(g30 g30Var, Function0 function0, ih2 ih2Var, vl1 vl1Var, boolean z, my myVar, int i) {
        super(2);
        this.r = g30Var;
        this.p = function0;
        this.s = ih2Var;
        this.t = vl1Var;
        this.o = z;
        this.n = myVar;
        this.q = i;
    }
}
