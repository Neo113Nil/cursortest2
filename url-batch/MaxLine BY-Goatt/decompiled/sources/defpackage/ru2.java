package defpackage;

import androidx.compose.ui.input.key.a;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ru2 extends o81 implements xt0 {
    public final /* synthetic */ sc1 m;
    public final /* synthetic */ gv2 n;
    public final /* synthetic */ nv2 o;
    public final /* synthetic */ boolean p;
    public final /* synthetic */ boolean q;
    public final /* synthetic */ cu1 r;
    public final /* synthetic */ z13 s;
    public final /* synthetic */ Function1 t;
    public final /* synthetic */ int u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ru2(sc1 sc1Var, gv2 gv2Var, nv2 nv2Var, boolean z, boolean z2, cu1 cu1Var, z13 z13Var, Function1 function1, int i) {
        super(3);
        this.m = sc1Var;
        this.n = gv2Var;
        this.o = nv2Var;
        this.p = z;
        this.q = z2;
        this.r = cu1Var;
        this.s = z13Var;
        this.t = function1;
        this.u = i;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        a00 a00Var = (a00) obj2;
        ((Number) obj3).intValue();
        a00Var.X(851809892);
        Object M = a00Var.M();
        nj njVar = sz.a;
        if (M == njVar) {
            M = new iw2();
            a00Var.i0(M);
        }
        iw2 iw2Var = (iw2) M;
        Object M2 = a00Var.M();
        if (M2 == njVar) {
            M2 = new m70();
            a00Var.i0(M2);
        }
        Function1 function1 = this.t;
        int i = this.u;
        qu2 qu2Var = new qu2(this.m, this.n, this.o, this.p, this.q, iw2Var, this.r, this.s, (m70) M2, function1, i);
        boolean h = a00Var.h(qu2Var);
        Object M3 = a00Var.M();
        if (h || M3 == njVar) {
            rk rkVar = new rk(1, qu2Var, qu2.class, "process", "process-ZmokQxo(Landroid/view/KeyEvent;)Z", 0, 0, 6);
            a00Var.i0(rkVar);
            M3 = rkVar;
        }
        vl1 a = a.a((Function1) ((j71) M3));
        a00Var.q(false);
        return a;
    }
}
