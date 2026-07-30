package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class aa1 extends o81 implements Function2 {
    public final /* synthetic */ lw0 m;
    public final /* synthetic */ vl1 n;
    public final /* synthetic */ va1 o;
    public final /* synthetic */ zx1 p;
    public final /* synthetic */ zh q;
    public final /* synthetic */ xh r;
    public final /* synthetic */ om0 s;
    public final /* synthetic */ boolean t;
    public final /* synthetic */ Function1 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public aa1(lw0 lw0Var, vl1 vl1Var, va1 va1Var, zx1 zx1Var, zh zhVar, xh xhVar, om0 om0Var, boolean z, Function1 function1, int i) {
        super(2);
        this.m = lw0Var;
        this.n = vl1Var;
        this.o = va1Var;
        this.p = zx1Var;
        this.q = zhVar;
        this.r = xhVar;
        this.s = om0Var;
        this.t = z;
        this.u = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        int R = s03.R(1772593);
        o70.e(this.m, this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, (a00) obj, R);
        return Unit.a;
    }
}
