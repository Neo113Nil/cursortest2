package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ia1 extends o81 implements Function2 {
    public final /* synthetic */ vl1 m;
    public final /* synthetic */ va1 n;
    public final /* synthetic */ nw0 o;
    public final /* synthetic */ zx1 p;
    public final /* synthetic */ om0 q;
    public final /* synthetic */ boolean r;
    public final /* synthetic */ zh s;
    public final /* synthetic */ xh t;
    public final /* synthetic */ Function1 u;
    public final /* synthetic */ int v;
    public final /* synthetic */ int w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ia1(vl1 vl1Var, va1 va1Var, nw0 nw0Var, zx1 zx1Var, om0 om0Var, boolean z, zh zhVar, xh xhVar, Function1 function1, int i, int i2) {
        super(2);
        this.m = vl1Var;
        this.n = va1Var;
        this.o = nw0Var;
        this.p = zx1Var;
        this.q = om0Var;
        this.r = z;
        this.s = zhVar;
        this.t = xhVar;
        this.u = function1;
        this.v = i;
        this.w = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        l41.j(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, s03.R(this.v | 1), s03.R(this.w));
        return Unit.a;
    }
}
