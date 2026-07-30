package defpackage;

import androidx.compose.foundation.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class y8 extends o81 implements Function2 {
    public final /* synthetic */ int m;
    public final /* synthetic */ long n;
    public final /* synthetic */ Object o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y8(int i, long j, Object obj) {
        super(2);
        this.m = i;
        this.n = j;
        this.o = obj;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.m;
        long j = this.n;
        Object obj3 = this.o;
        switch (i) {
            case 0:
                a00 a00Var = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
                    a00Var.S();
                } else if (j != 9205357640488583168L) {
                    a00Var.X(1828881000);
                    vl1 g = b.g((vl1) obj3, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, 0.0f, 12);
                    oj1 e = fp.e(qb2.q, false);
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
                    uj2.e(a00Var, e, oz.f);
                    uj2.e(a00Var, l, oz.e);
                    sc scVar = oz.g;
                    if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                        q40.r(D, a00Var, D, scVar);
                    }
                    uj2.e(a00Var, E, oz.d);
                    e9.b(null, a00Var, 0, 1);
                    a00Var.q(true);
                    a00Var.q(false);
                } else {
                    a00Var.X(1829217412);
                    e9.b((vl1) obj3, a00Var, 0, 0);
                    a00Var.q(false);
                }
                break;
            default:
                a00 a00Var2 = (a00) obj;
                if ((((Number) obj2).intValue() & 3) == 2 && a00Var2.B()) {
                    a00Var2.S();
                } else {
                    pu2.c(j, (Function2) obj3, a00Var2, 0);
                }
                break;
        }
        return Unit.a;
    }
}
