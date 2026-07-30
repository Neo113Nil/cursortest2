package defpackage;

import androidx.compose.foundation.layout.b;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class ib extends o81 implements Function2 {
    public final /* synthetic */ long m;
    public final /* synthetic */ boolean n;
    public final /* synthetic */ vl1 o;
    public final /* synthetic */ du1 p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib(long j, boolean z, vl1 vl1Var, du1 du1Var) {
        super(2);
        this.m = j;
        this.n = z;
        this.o = vl1Var;
        this.p = du1Var;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        a00 a00Var = (a00) obj;
        if ((((Number) obj2).intValue() & 3) == 2 && a00Var.B()) {
            a00Var.S();
        } else {
            long j = this.m;
            nj njVar = sz.a;
            du1 du1Var = this.p;
            boolean z = this.n;
            if (j != 9205357640488583168L) {
                a00Var.X(-837727128);
                vh vhVar = z ? s03.b : s03.a;
                vl1 g = b.g(this.o, Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)), 0.0f, 0.0f, 12);
                fc2 a = ec2.a(vhVar, qb2.y, a00Var, 0);
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
                uj2.e(a00Var, a, oz.f);
                uj2.e(a00Var, l, oz.e);
                sc scVar = oz.g;
                if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                    q40.r(D, a00Var, D, scVar);
                }
                uj2.e(a00Var, E, oz.d);
                boolean h = a00Var.h(du1Var);
                Object M = a00Var.M();
                if (h || M == njVar) {
                    M = new hb(du1Var, 0);
                    a00Var.i0(M);
                }
                iv1.k(sl1.a, (Function0) M, z, a00Var, 6);
                a00Var.q(true);
                a00Var.q(false);
            } else {
                a00Var.X(-836867312);
                boolean h2 = a00Var.h(du1Var);
                Object M2 = a00Var.M();
                if (h2 || M2 == njVar) {
                    M2 = new hb(du1Var, 1);
                    a00Var.i0(M2);
                }
                iv1.k(this.o, (Function0) M2, z, a00Var, 0);
                a00Var.q(false);
            }
        }
        return Unit.a;
    }
}
