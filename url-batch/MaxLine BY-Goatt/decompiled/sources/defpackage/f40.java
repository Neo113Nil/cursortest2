package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class f40 extends o81 implements Function1 {
    public final /* synthetic */ sc1 m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ x63 o;
    public final /* synthetic */ gv2 p;
    public final /* synthetic */ nv2 q;
    public final /* synthetic */ cu1 r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f40(sc1 sc1Var, boolean z, x63 x63Var, gv2 gv2Var, nv2 nv2Var, cu1 cu1Var) {
        super(1);
        this.m = sc1Var;
        this.n = z;
        this.o = x63Var;
        this.p = gv2Var;
        this.q = nv2Var;
        this.r = cu1Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        wv2 wv2Var;
        t81 t81Var;
        t81 t81Var2;
        t81 t81Var3 = (t81) obj;
        sc1 sc1Var = this.m;
        lz1 lz1Var = sc1Var.o;
        sc1Var.h = t81Var3;
        cw2 d = sc1Var.d();
        if (d != null) {
            d.b = t81Var3;
        }
        if (this.n) {
            zw0 a = sc1Var.a();
            zw0 zw0Var = zw0.n;
            nv2 nv2Var = this.q;
            gv2 gv2Var = this.p;
            if (a == zw0Var) {
                if (((Boolean) sc1Var.l.getValue()).booleanValue() && ((Boolean) ((mc1) this.o).a.getValue()).booleanValue()) {
                    gv2Var.o();
                } else {
                    gv2Var.k();
                }
                sc1Var.m.setValue(Boolean.valueOf(nk2.l(gv2Var, true)));
                sc1Var.n.setValue(Boolean.valueOf(nk2.l(gv2Var, false)));
                lz1Var.setValue(Boolean.valueOf(jw2.b(nv2Var.b)));
            } else if (sc1Var.a() == zw0.o) {
                lz1Var.setValue(Boolean.valueOf(nk2.l(gv2Var, true)));
            }
            cu1 cu1Var = this.r;
            s93.J(sc1Var, nv2Var, cu1Var);
            cw2 d2 = sc1Var.d();
            if (d2 != null && (wv2Var = sc1Var.e) != null && sc1Var.b() && (t81Var = d2.b) != null && t81Var.y() && (t81Var2 = d2.c) != null) {
                bw2 bw2Var = d2.a;
                s72 s72Var = new s72(12, t81Var);
                w72 l = ph2.l(t81Var);
                w72 M = t81Var.M(t81Var2, false);
                if (Intrinsics.b((wv2) wv2Var.a.b.get(), wv2Var)) {
                    wv2Var.b.f(nv2Var, cu1Var, bw2Var, s72Var, l, M);
                }
            }
        }
        return Unit.a;
    }
}
