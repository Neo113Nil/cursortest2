package defpackage;

import androidx.compose.foundation.layout.HorizontalAlignElement;
import androidx.compose.foundation.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class u5 extends o81 implements Function2 {
    public final /* synthetic */ Function2 m;
    public final /* synthetic */ Function2 n;
    public final /* synthetic */ long o;
    public final /* synthetic */ long p;
    public final /* synthetic */ long q;
    public final /* synthetic */ my r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u5(Function2 function2, Function2 function22, long j, long j2, long j3, long j4, my myVar) {
        super(2);
        this.m = function2;
        this.n = function22;
        this.o = j2;
        this.p = j3;
        this.q = j4;
        this.r = myVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            vl1 g = a.g(sl1.a, e6.a);
            int i = 0;
            qw a = ow.a(s93.c, qb2.A, a00Var, 0);
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1 E = bd3.E(a00Var, g);
            pz.b.getClass();
            o00 o00Var = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            sc scVar = oz.f;
            uj2.e(a00Var, a, scVar);
            sc scVar2 = oz.e;
            uj2.e(a00Var, l, scVar2);
            sc scVar3 = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar3);
            }
            sc scVar4 = oz.d;
            uj2.e(a00Var, E, scVar4);
            a00Var.X(-1924971291);
            a00Var.q(false);
            a00Var.X(-1924961479);
            Function2 function2 = this.m;
            if (function2 != null) {
                yj1.f(this.o, n13.a(9, a00Var), yj1.H(434448772, new t5(i, function2), a00Var), a00Var, 384);
            }
            a00Var.q(false);
            a00Var.X(-1924936431);
            int i2 = 1;
            Function2 function22 = this.n;
            if (function22 != null) {
                yj1.f(this.p, n13.a(2, a00Var), yj1.H(-796843771, new t5(i2, function22), a00Var), a00Var, 384);
            }
            a00Var.q(false);
            HorizontalAlignElement horizontalAlignElement = new HorizontalAlignElement(qb2.C);
            oj1 e = fp.e(qb2.p, false);
            int D2 = iv1.D(a00Var);
            v02 l2 = a00Var.l();
            vl1 E2 = bd3.E(a00Var, horizontalAlignElement);
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(o00Var);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, e, scVar);
            uj2.e(a00Var, l2, scVar2);
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D2))) {
                q40.r(D2, a00Var, D2, scVar3);
            }
            uj2.e(a00Var, E2, scVar4);
            yj1.f(this.q, n13.a(10, a00Var), this.r, a00Var, 0);
            a00Var.q(true);
            a00Var.q(true);
        }
        return Unit.a;
    }
}
