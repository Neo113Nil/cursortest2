package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class un0 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ xh n;
    public final /* synthetic */ zh o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ qb2 r;
    public final /* synthetic */ my s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public un0(vl1 vl1Var, xh xhVar, zh zhVar, int i, int i2, qb2 qb2Var, my myVar, int i3) {
        super(2);
        this.m = vl1Var;
        this.n = xhVar;
        this.o = zhVar;
        this.p = i;
        this.q = i2;
        this.r = qb2Var;
        this.s = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(1573297);
        xn0.a(this.m, this.n, this.o, this.p, this.q, this.r, this.s, (a00) obj, R);
        return Unit.a;
    }
}
