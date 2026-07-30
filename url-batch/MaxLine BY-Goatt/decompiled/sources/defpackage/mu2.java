package defpackage;

import androidx.compose.ui.graphics.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mu2 extends o81 implements xt0 {
    public final /* synthetic */ so2 m;
    public final /* synthetic */ long n;
    public final /* synthetic */ pw2 o;
    public final /* synthetic */ Function2 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu2(ez2 ez2Var, long j, pw2 pw2Var, Function2 function2) {
        super(3);
        this.m = ez2Var;
        this.n = j;
        this.o = pw2Var;
        this.p = function2;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        vl1 vl1Var = (vl1) obj;
        a00 a00Var = (a00) obj2;
        int intValue = ((Number) obj3).intValue();
        if ((intValue & 6) == 0) {
            intValue |= a00Var.f(vl1Var) ? 4 : 2;
        }
        if ((intValue & 19) == 18 && a00Var.B()) {
            a00Var.S();
        } else {
            so2 so2Var = this.m;
            boolean f = a00Var.f(so2Var);
            Object M = a00Var.M();
            if (f || M == sz.a) {
                M = new lq1(so2Var, 1);
                a00Var.i0(M);
            }
            vl1 a = a.a(vl1Var, (Function1) M);
            oj1 e = fp.e(qb2.p, false);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, a);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            pu2.b(this.n, this.o, this.p, a00Var, 0);
            a00Var.q(true);
        }
        return Unit.a;
    }
}
