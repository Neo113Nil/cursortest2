package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class dx1 extends o81 implements Function2 {
    public final /* synthetic */ qb2 m;
    public final /* synthetic */ String n;
    public final /* synthetic */ Function2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ ch2 r;
    public final /* synthetic */ b41 s;
    public final /* synthetic */ Function2 t;
    public final /* synthetic */ du2 u;
    public final /* synthetic */ yx1 v;
    public final /* synthetic */ my w;
    public final /* synthetic */ int x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dx1(qb2 qb2Var, String str, Function2 function2, boolean z, boolean z2, ch2 ch2Var, b41 b41Var, Function2 function22, du2 du2Var, yx1 yx1Var, my myVar, int i) {
        super(2);
        this.m = qb2Var;
        this.n = str;
        this.o = function2;
        this.p = z;
        this.q = z2;
        this.r = ch2Var;
        this.s = b41Var;
        this.t = function22;
        this.u = du2Var;
        this.v = yx1Var;
        this.w = myVar;
        this.x = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        this.m.k(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, (a00) obj, s03.R(this.x | 1));
        return Unit.a;
    }
}
