package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class e40 extends o81 implements Function1 {
    public final /* synthetic */ sc1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ sv2 o;
    public final /* synthetic */ nv2 p;
    public final /* synthetic */ c11 q;
    public final /* synthetic */ cu1 r;
    public final /* synthetic */ gv2 s;
    public final /* synthetic */ a50 t;
    public final /* synthetic */ op u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e40(sc1 sc1Var, boolean z, sv2 sv2Var, nv2 nv2Var, c11 c11Var, cu1 cu1Var, gv2 gv2Var, a50 a50Var, op opVar) {
        super(1);
        this.m = sc1Var;
        this.n = z;
        this.o = sv2Var;
        this.p = nv2Var;
        this.q = c11Var;
        this.r = cu1Var;
        this.s = gv2Var;
        this.t = a50Var;
        this.u = opVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        cw2 d;
        xo0 xo0Var = (xo0) obj;
        sc1 sc1Var = this.m;
        if (sc1Var.b() != xo0Var.a()) {
            sc1Var.f.setValue(Boolean.valueOf(xo0Var.a()));
            boolean b = sc1Var.b();
            cu1 cu1Var = this.r;
            nv2 nv2Var = this.p;
            if (b && this.n) {
                s93.x(this.o, sc1Var, nv2Var, this.q, cu1Var);
            } else {
                s93.u(sc1Var);
            }
            if (xo0Var.a() && (d = sc1Var.d()) != null) {
                z71.H(this.t, null, new da(this.u, nv2Var, sc1Var, d, cu1Var, null, 3), 3);
            }
            if (!xo0Var.a()) {
                this.s.e(null);
            }
        }
        return Unit.a;
    }
}
