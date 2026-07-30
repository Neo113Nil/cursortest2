package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class cx1 extends o81 implements Function2 {
    public final /* synthetic */ qb2 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ b41 o;
    public final /* synthetic */ vl1 p;
    public final /* synthetic */ du2 q;
    public final /* synthetic */ fk2 r;
    public final /* synthetic */ float s;
    public final /* synthetic */ float t;
    public final /* synthetic */ int u;
    public final /* synthetic */ int v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cx1(qb2 qb2Var, boolean z, b41 b41Var, vl1 vl1Var, du2 du2Var, fk2 fk2Var, float f, float f2, int i, int i2) {
        super(2);
        this.m = qb2Var;
        this.n = z;
        this.o = b41Var;
        this.p = vl1Var;
        this.q = du2Var;
        this.r = fk2Var;
        this.s = f;
        this.t = f2;
        this.u = i;
        this.v = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.m.j(this.n, this.o, this.p, this.q, this.r, this.s, this.t, (a00) obj, s03.R(this.u | 1), this.v);
        return Unit.a;
    }
}
