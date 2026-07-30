package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class b40 extends o81 implements Function2 {
    public final /* synthetic */ boolean A;
    public final /* synthetic */ Function1 B;
    public final /* synthetic */ cu1 C;
    public final /* synthetic */ ca0 D;
    public final /* synthetic */ my m;
    public final /* synthetic */ sc1 n;
    public final /* synthetic */ pw2 o;
    public final /* synthetic */ int p;
    public final /* synthetic */ int q;
    public final /* synthetic */ dv2 r;
    public final /* synthetic */ nv2 s;
    public final /* synthetic */ ch2 t;
    public final /* synthetic */ vl1 u;
    public final /* synthetic */ vl1 v;
    public final /* synthetic */ vl1 w;
    public final /* synthetic */ vl1 x;
    public final /* synthetic */ op y;
    public final /* synthetic */ gv2 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b40(my myVar, sc1 sc1Var, pw2 pw2Var, int i, int i2, dv2 dv2Var, nv2 nv2Var, ch2 ch2Var, vl1 vl1Var, vl1 vl1Var2, vl1 vl1Var3, vl1 vl1Var4, op opVar, gv2 gv2Var, boolean z, Function1 function1, cu1 cu1Var, ca0 ca0Var) {
        super(2);
        this.m = myVar;
        this.n = sc1Var;
        this.o = pw2Var;
        this.p = i;
        this.q = i2;
        this.r = dv2Var;
        this.s = nv2Var;
        this.t = ch2Var;
        this.u = vl1Var;
        this.v = vl1Var2;
        this.w = vl1Var3;
        this.x = vl1Var4;
        this.y = opVar;
        this.z = gv2Var;
        this.A = z;
        this.B = function1;
        this.C = cu1Var;
        this.D = ca0Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            this.m.a(yj1.H(2032502107, new a40(this.n, this.o, this.p, this.q, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D), a00Var), a00Var, 6);
        }
        return Unit.a;
    }
}
