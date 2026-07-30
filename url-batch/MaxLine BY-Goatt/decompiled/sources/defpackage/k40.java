package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class k40 extends o81 implements Function1 {
    public final /* synthetic */ xy2 m;
    public final /* synthetic */ nv2 n;
    public final /* synthetic */ boolean o;
    public final /* synthetic */ c11 p;
    public final /* synthetic */ sc1 q;
    public final /* synthetic */ cu1 r;
    public final /* synthetic */ gv2 s;
    public final /* synthetic */ to0 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k40(xy2 xy2Var, nv2 nv2Var, boolean z, c11 c11Var, sc1 sc1Var, cu1 cu1Var, gv2 gv2Var, to0 to0Var) {
        super(1);
        this.m = xy2Var;
        this.n = nv2Var;
        this.o = z;
        this.p = c11Var;
        this.q = sc1Var;
        this.r = cu1Var;
        this.s = gv2Var;
        this.t = to0Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        sh2 sh2Var = (sh2) obj;
        yd ydVar = this.m.a;
        t71[] t71VarArr = ii2.a;
        ji2 ji2Var = gi2.E;
        t71[] t71VarArr2 = ii2.a;
        t71 t71Var = t71VarArr2[18];
        sh2Var.d(ji2Var, ydVar);
        nv2 nv2Var = this.n;
        long j = nv2Var.b;
        ji2 ji2Var2 = gi2.F;
        t71 t71Var2 = t71VarArr2[19];
        sh2Var.d(ji2Var2, new jw2(j));
        boolean z = this.o;
        if (!z) {
            sh2Var.d(gi2.i, Unit.a);
        }
        ji2 ji2Var3 = gi2.M;
        t71 t71Var3 = t71VarArr2[25];
        sh2Var.d(ji2Var3, Boolean.valueOf(z));
        sc1 sc1Var = this.q;
        ii2.a(sh2Var, new d40(sc1Var, 2));
        if (z) {
            sh2Var.d(rh2.j, new r1(null, new d40(sc1Var, sh2Var)));
            sh2Var.d(rh2.n, new r1(null, new i40(z, sc1Var, sh2Var, nv2Var)));
        }
        cu1 cu1Var = this.r;
        boolean z2 = this.o;
        gv2 gv2Var = this.s;
        sh2Var.d(rh2.i, new r1(null, new j40(cu1Var, z2, nv2Var, gv2Var, sc1Var)));
        c11 c11Var = this.p;
        int i = c11Var.e;
        k7 k7Var = new k7(6, sc1Var, c11Var);
        sh2Var.d(gi2.G, new b11(i));
        sh2Var.d(rh2.o, new r1(null, k7Var));
        sh2Var.d(rh2.b, new r1(null, new k7(7, sc1Var, this.t)));
        sh2Var.d(rh2.c, new r1(null, new h40(gv2Var, 1)));
        if (!jw2.b(j)) {
            sh2Var.d(rh2.p, new r1(null, new h40(gv2Var, 2)));
            if (z) {
                sh2Var.d(rh2.q, new r1(null, new h40(gv2Var, 3)));
            }
        }
        if (z) {
            sh2Var.d(rh2.r, new r1(null, new h40(gv2Var, 0)));
        }
        return Unit.a;
    }
}
