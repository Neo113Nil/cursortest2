package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class lb1 extends o81 implements Function2 {
    public final /* synthetic */ int m = 1;
    public final /* synthetic */ Object n;
    public final /* synthetic */ int o;
    public final /* synthetic */ int p;
    public final /* synthetic */ Object q;
    public final /* synthetic */ Object r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(mb1 mb1Var, Object obj, int i, Object obj2, int i2) {
        super(2);
        this.q = mb1Var;
        this.n = obj;
        this.o = i;
        this.r = obj2;
        this.p = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.p;
        Object obj3 = this.q;
        switch (i) {
            case 0:
                ((Number) obj2).intValue();
                s93.t((mb1) obj3, this.n, this.o, this.r, (a00) obj, s03.R(i2 | 1));
                break;
            default:
                ((Number) obj2).intValue();
                my myVar = (my) this.r;
                int R = s03.R(i2 | 1);
                Object obj4 = this.n;
                int i3 = this.o;
                ll3.c(obj4, i3, (ub1) obj3, myVar, (a00) obj, R);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lb1(Object obj, int i, ub1 ub1Var, my myVar, int i2) {
        super(2);
        this.n = obj;
        this.o = i;
        this.q = ub1Var;
        this.r = myVar;
        this.p = i2;
    }
}
