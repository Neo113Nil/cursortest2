package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class qb1 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ q80 n;
    public final /* synthetic */ yx1 o;
    public final /* synthetic */ im2 p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ by1 r;
    public final /* synthetic */ hr1 s;
    public final /* synthetic */ zn t;
    public final /* synthetic */ by1 u;
    public final /* synthetic */ my v;
    public final /* synthetic */ int w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qb1(vl1 vl1Var, q80 q80Var, yx1 yx1Var, im2 im2Var, boolean z, by1 by1Var, hr1 hr1Var, zn znVar, by1 by1Var2, my myVar, int i, int i2) {
        super(2);
        this.m = vl1Var;
        this.n = q80Var;
        this.o = yx1Var;
        this.p = im2Var;
        this.q = z;
        this.r = by1Var;
        this.s = hr1Var;
        this.t = znVar;
        this.u = by1Var2;
        this.v = myVar;
        this.w = i;
        this.x = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        yk3.i(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, (a00) obj, s03.R(this.w | 1), s03.R(this.x));
        return Unit.a;
    }
}
