package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mb extends o81 implements Function2 {
    public final /* synthetic */ int m = 0;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ int o;
    public final /* synthetic */ Object p;
    public final /* synthetic */ Object q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(vl1 vl1Var, Function0 function0, boolean z, int i) {
        super(2);
        this.p = vl1Var;
        this.q = function0;
        this.n = z;
        this.o = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        int i2 = this.o;
        Object obj3 = this.q;
        Object obj4 = this.p;
        boolean z = this.n;
        a00 a00Var = (a00) obj;
        ((Number) obj2).intValue();
        switch (i) {
            case 0:
                iv1.k((vl1) obj4, (Function0) obj3, z, a00Var, s03.R(i2 | 1));
                break;
            default:
                nk2.b(z, (k92) obj4, (gv2) obj3, a00Var, s03.R(i2 | 1));
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mb(boolean z, k92 k92Var, gv2 gv2Var, int i) {
        super(2);
        this.n = z;
        this.p = k92Var;
        this.q = gv2Var;
        this.o = i;
    }
}
