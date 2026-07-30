package defpackage;

import androidx.compose.ui.layout.a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mc extends o81 implements xt0 {
    public final /* synthetic */ int m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mc(int i, Object obj) {
        super(3);
        this.m = i;
        this.n = obj;
    }

    @Override // defpackage.xt0
    public final Object a(Object obj, Object obj2, Object obj3) {
        pj1 G;
        pj1 G2;
        long a;
        long a2;
        int i = this.m;
        nj njVar = sz.a;
        Object obj4 = this.n;
        switch (i) {
            case 0:
                n12 c = ((jj1) obj2).c(((u10) obj3).a);
                G = ((qj1) obj).G(c.m, c.n, mi1.c(), new p8(7, c, (r20) obj4));
                return G;
            case 1:
                long j = ((au1) obj3).a;
                ((jg1) obj4).n.c(((t22) obj2).c);
                Unit unit = Unit.a;
                return Unit.a;
            case 2:
                vl1 vl1Var = (vl1) obj;
                a00 a00Var = (a00) obj2;
                ((Number) obj3).intValue();
                gv2 gv2Var = (gv2) obj4;
                a00Var.X(1980580247);
                ca0 ca0Var = (ca0) a00Var.j(p00.h);
                Object M = a00Var.M();
                if (M == njVar) {
                    M = ij2.j(new x31(0L));
                    a00Var.i0(M);
                }
                zn1 zn1Var = (zn1) M;
                boolean h = a00Var.h(gv2Var);
                Object M2 = a00Var.M();
                if (h || M2 == njVar) {
                    M2 = new k7(20, gv2Var, zn1Var);
                    a00Var.i0(M2);
                }
                Function0 function0 = (Function0) M2;
                boolean f = a00Var.f(ca0Var);
                Object M3 = a00Var.M();
                if (f || M3 == njVar) {
                    M3 = new kv2(ca0Var, zn1Var, 1);
                    a00Var.i0(M3);
                }
                pd pdVar = oh2.a;
                vl1 n = bd3.n(vl1Var, new j30(4, function0, (Function1) M3));
                a00Var.q(false);
                return n;
            case 3:
                long j2 = ((u10) obj3).a;
                long j3 = ((lv2) obj4).f;
                n12 c2 = ((jj1) obj2).c(u10.a(j2, d.c((int) (j3 >> 32), u10.j(j2), u10.h(j2)), 0, d.c((int) (j3 & 4294967295L), u10.i(j2), u10.g(j2)), 0, 10));
                G2 = ((qj1) obj).G(c2.m, c2.n, mi1.c(), new bb(c2, 10));
                return G2;
            case 4:
                a00 a00Var2 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var2.X(1582736677);
                ca0 ca0Var2 = (ca0) a00Var2.j(p00.h);
                hp0 hp0Var = (hp0) a00Var2.j(p00.k);
                u81 u81Var = (u81) a00Var2.j(p00.n);
                pw2 pw2Var = (pw2) obj4;
                boolean f2 = a00Var2.f(pw2Var) | a00Var2.f(u81Var);
                Object M4 = a00Var2.M();
                if (f2 || M4 == njVar) {
                    M4 = ci2.i(pw2Var, u81Var);
                    a00Var2.i0(M4);
                }
                pw2 pw2Var2 = (pw2) M4;
                boolean f3 = a00Var2.f(hp0Var) | a00Var2.f(pw2Var2);
                Object M5 = a00Var2.M();
                if (f3 || M5 == njVar) {
                    un2 un2Var = pw2Var2.a;
                    ip0 ip0Var = un2Var.f;
                    jq0 jq0Var = un2Var.c;
                    if (jq0Var == null) {
                        jq0Var = jq0.q;
                    }
                    fq0 fq0Var = un2Var.d;
                    int i2 = fq0Var != null ? fq0Var.a : 0;
                    gq0 gq0Var = un2Var.e;
                    M5 = ((jp0) hp0Var).b(ip0Var, jq0Var, i2, gq0Var != null ? gq0Var.a : 65535);
                    a00Var2.i0(M5);
                }
                so2 so2Var = (so2) M5;
                Object M6 = a00Var2.M();
                Object obj5 = M6;
                if (M6 == njVar) {
                    Object value = so2Var.getValue();
                    lv2 lv2Var = new lv2();
                    lv2Var.a = u81Var;
                    lv2Var.b = ca0Var2;
                    lv2Var.c = hp0Var;
                    lv2Var.d = pw2Var;
                    lv2Var.e = value;
                    a2 = iu2.a(pw2Var, ca0Var2, hp0Var, iu2.a, 1);
                    lv2Var.f = a2;
                    a00Var2.i0(lv2Var);
                    obj5 = lv2Var;
                }
                lv2 lv2Var2 = (lv2) obj5;
                Object value2 = so2Var.getValue();
                if (u81Var != lv2Var2.a || !Intrinsics.b(ca0Var2, lv2Var2.b) || !Intrinsics.b(hp0Var, lv2Var2.c) || !Intrinsics.b(pw2Var2, lv2Var2.d) || !Intrinsics.b(value2, lv2Var2.e)) {
                    lv2Var2.a = u81Var;
                    lv2Var2.b = ca0Var2;
                    lv2Var2.c = hp0Var;
                    lv2Var2.d = pw2Var2;
                    lv2Var2.e = value2;
                    a = iu2.a(pw2Var2, ca0Var2, hp0Var, iu2.a, 1);
                    lv2Var2.f = a;
                }
                boolean h2 = a00Var2.h(lv2Var2);
                Object M7 = a00Var2.M();
                if (h2 || M7 == njVar) {
                    M7 = new mc(3, lv2Var2);
                    a00Var2.i0(M7);
                }
                vl1 b = a.b((xt0) M7);
                a00Var2.q(false);
                return b;
            case 5:
                a00 a00Var3 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var3.X(-1608161351);
                Function1 function1 = (Function1) obj4;
                boolean f4 = a00Var3.f(function1);
                Object M8 = a00Var3.M();
                if (f4 || M8 == njVar) {
                    M8 = new z10(function1);
                    a00Var3.i0(M8);
                }
                z10 z10Var = (z10) M8;
                a00Var3.q(false);
                return z10Var;
            default:
                a00 a00Var4 = (a00) obj2;
                ((Number) obj3).intValue();
                a00Var4.X(-1415685722);
                z63 z63Var = (z63) obj4;
                boolean f5 = a00Var4.f(z63Var);
                Object M9 = a00Var4.M();
                if (f5 || M9 == njVar) {
                    M9 = new d31(z63Var);
                    a00Var4.i0(M9);
                }
                d31 d31Var = (d31) M9;
                a00Var4.q(false);
                return d31Var;
        }
    }
}
