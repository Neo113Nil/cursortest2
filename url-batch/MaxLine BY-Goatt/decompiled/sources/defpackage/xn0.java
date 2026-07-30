package defpackage;

import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public abstract class xn0 {
    public static final k50 a = new k50();

    public static final void a(vl1 vl1Var, xh xhVar, zh zhVar, int i, int i2, qb2 qb2Var, my myVar, a00 a00Var, int i3) {
        my myVar2;
        Object obj;
        vl1 vl1Var2;
        qb2 qb2Var2;
        int i4;
        int i5;
        a00Var.Z(437853230);
        if (((i3 | 224262) & 599187) == 599186 && a00Var.B()) {
            a00Var.S();
            vl1Var2 = vl1Var;
            i4 = i;
            i5 = i2;
            qb2Var2 = qb2Var;
            myVar2 = myVar;
        } else {
            qb2 qb2Var3 = qb2.R;
            Object M = a00Var.M();
            Object obj2 = sz.a;
            if (M == obj2) {
                M = new zn0();
                a00Var.i0(M);
            }
            zn0 zn0Var = (zn0) M;
            boolean f = a00Var.f(zn0Var);
            Object M2 = a00Var.M();
            if (f || M2 == obj2) {
                M2 = new bo0(xhVar, zhVar, xhVar.a(), a, zhVar.a(), zn0Var);
                a00Var.i0(M2);
            }
            bo0 bo0Var = (bo0) M2;
            Object M3 = a00Var.M();
            int i6 = 1;
            if (M3 == obj2) {
                ArrayList arrayList = new ArrayList();
                myVar2 = myVar;
                arrayList.add(new my(-139531073, new x5(myVar2, i6), true));
                q40.u(2);
                a00Var.i0(arrayList);
                obj = arrayList;
            } else {
                myVar2 = myVar;
                obj = M3;
            }
            my myVar3 = new my(1271844412, new c0(10, (List) obj), true);
            boolean f2 = a00Var.f(bo0Var);
            Object M4 = a00Var.M();
            if (f2 || M4 == obj2) {
                M4 = new mm1(bo0Var);
                a00Var.i0(M4);
            }
            oj1 oj1Var = (oj1) M4;
            int D = iv1.D(a00Var);
            v02 l = a00Var.l();
            vl1Var2 = sl1.a;
            vl1 E = bd3.E(a00Var, vl1Var2);
            pz.b.getClass();
            Function0 function0 = oz.b;
            a00Var.b0();
            if (a00Var.S) {
                a00Var.k(function0);
            } else {
                a00Var.l0();
            }
            uj2.e(a00Var, oj1Var, oz.f);
            uj2.e(a00Var, l, oz.e);
            sc scVar = oz.g;
            if (a00Var.S || !Intrinsics.b(a00Var.M(), Integer.valueOf(D))) {
                q40.r(D, a00Var, D, scVar);
            }
            uj2.e(a00Var, E, oz.d);
            myVar3.invoke(a00Var, 0);
            a00Var.q(true);
            qb2Var2 = qb2Var3;
            i4 = Integer.MAX_VALUE;
            i5 = Integer.MAX_VALUE;
        }
        n72 s = a00Var.s();
        if (s != null) {
            s.d = new un0(vl1Var2, xhVar, zhVar, i4, i5, qb2Var2, myVar2, i3);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final long b(List list, xt0 xt0Var, xt0 xt0Var2, int i, int i2, int i3, zn0 zn0Var) {
        boolean z;
        int i4;
        n31 n31Var;
        int i5 = 0;
        if (list.isEmpty()) {
            return n31.a(0, 0);
        }
        int i6 = Integer.MAX_VALUE;
        tn0 tn0Var = new tn0(zn0Var, v10.a(0, i, 0, Integer.MAX_VALUE), i2, i3);
        jj1 jj1Var = (jj1) zv.w(0, list);
        int intValue = jj1Var != null ? ((Number) xt0Var2.a(jj1Var, 0, Integer.valueOf(i))).intValue() : 0;
        int intValue2 = jj1Var != null ? ((Number) xt0Var.a(jj1Var, 0, Integer.valueOf(intValue))).intValue() : 0;
        int i7 = 0;
        int i8 = 0;
        if (tn0Var.b(list.size() > 1, 0, n31.a(i, Integer.MAX_VALUE), jj1Var == null ? null : new n31(n31.a(intValue2, intValue)), 0, 0, 0, false, false).b) {
            n31 a2 = zn0Var.a(0, 0, jj1Var != null);
            return n31.a(a2 != null ? (int) (a2.a & 4294967295L) : 0, 0);
        }
        int size = list.size();
        int i9 = i;
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = i8;
            if (i10 >= size) {
                break;
            }
            int i15 = i9 - intValue2;
            int i16 = i10 + 1;
            i8 = Math.max(i14, intValue);
            jj1 jj1Var2 = (jj1) zv.w(i16, list);
            int intValue3 = jj1Var2 != null ? ((Number) xt0Var2.a(jj1Var2, Integer.valueOf(i16), Integer.valueOf(i))).intValue() : i5;
            int intValue4 = jj1Var2 != null ? ((Number) xt0Var.a(jj1Var2, Integer.valueOf(i16), Integer.valueOf(intValue3))).intValue() + i2 : i5;
            if (i10 + 2 < list.size()) {
                i10 = i16;
                z = 1;
            } else {
                i10 = i16;
                z = i5;
            }
            int i17 = i10 - i12;
            int i18 = i13;
            long a3 = n31.a(i15, i6);
            if (jj1Var2 == null) {
                i4 = i15;
                n31Var = null;
            } else {
                i4 = i15;
                n31Var = new n31(n31.a(intValue4, intValue3));
            }
            int i19 = intValue4;
            sn0 b = tn0Var.b(z, i17, a3, n31Var, i18, i7, i8, false, false);
            if (b.a) {
                int i20 = i8 + i3 + i7;
                rn0 a4 = tn0Var.a(b, jj1Var2 != null, i18, i20, i4, i17);
                int i21 = i19 - i2;
                i13 = i18 + 1;
                if (b.b) {
                    if (a4 != null) {
                        long j = a4.c;
                        if (!a4.d) {
                            i20 += ((int) (j & 4294967295L)) + i3;
                        }
                    }
                    i7 = i20;
                    i11 = i10;
                } else {
                    i9 = i;
                    i12 = i10;
                    intValue2 = i21;
                    i7 = i20;
                    i8 = 0;
                }
            } else {
                intValue2 = i19;
                i9 = i4;
                i13 = i18;
            }
            intValue = intValue3;
            i11 = i10;
            i5 = 0;
            i6 = Integer.MAX_VALUE;
        }
        return n31.a(i7 - i3, i11);
    }

    public static final long c(jj1 jj1Var, bo0 bo0Var, long j, Function1 function1) {
        if (z71.E(z71.B(jj1Var)) != 0.0f) {
            bo0Var.getClass();
            int V = jj1Var.V(Integer.MAX_VALUE);
            return n31.a(V, jj1Var.a0(V));
        }
        z71.B(jj1Var);
        n12 c = jj1Var.c(j);
        function1.invoke(c);
        bo0Var.getClass();
        return n31.a(c.e0(), c.d0());
    }
}
