package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.ranges.d;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mm1 implements oj1 {
    public final bo0 a;

    public mm1(bo0 bo0Var) {
        this.a = bo0Var;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
        ArrayList z = zm3.z(h41Var);
        bo0 bo0Var = this.a;
        zn0 zn0Var = bo0Var.f;
        List list2 = (List) zv.w(1, z);
        jj1 jj1Var = list2 != null ? (jj1) zv.v(list2) : null;
        List list3 = (List) zv.w(2, z);
        zn0Var.b(jj1Var, list3 != null ? (jj1) zv.v(list3) : null, v10.b(i, 0, 13));
        List list4 = (List) zv.v(z);
        if (list4 == null) {
            list4 = ah0.m;
        }
        return (int) (xn0.b(list4, bo0Var.i, bo0Var.h, i, h41Var.R(bo0Var.c), h41Var.R(bo0Var.e), bo0Var.f) >> 32);
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        ArrayList z = zm3.z(h41Var);
        bo0 bo0Var = this.a;
        zn0 zn0Var = bo0Var.f;
        List list2 = (List) zv.w(1, z);
        jj1 jj1Var = list2 != null ? (jj1) zv.v(list2) : null;
        List list3 = (List) zv.w(2, z);
        zn0Var.b(jj1Var, list3 != null ? (jj1) zv.v(list3) : null, v10.b(0, i, 7));
        List list4 = (List) zv.v(z);
        if (list4 == null) {
            list4 = ah0.m;
        }
        int R = h41Var.R(bo0Var.c);
        xt0 xt0Var = bo0Var.g;
        int size = list4.size();
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i2 < size) {
            int intValue = ((Number) xt0Var.a((jj1) list4.get(i2), Integer.valueOf(i2), Integer.valueOf(i))).intValue() + R;
            int i6 = i2 + 1;
            if (i6 - i4 == Integer.MAX_VALUE || i6 == list4.size()) {
                i3 = Math.max(i3, (i5 + intValue) - R);
                i4 = i2;
                i5 = 0;
            } else {
                i5 += intValue;
            }
            i2 = i6;
        }
        return i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof mm1) && Intrinsics.b(this.a, ((mm1) obj).a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        pj1 G;
        jj1 jj1Var;
        zn0 zn0Var;
        jj1 jj1Var2;
        jj1 jj1Var3;
        eo1 eo1Var;
        Iterator it;
        n31 n31Var;
        sn0 sn0Var;
        rn0 rn0Var;
        zm1 zm1Var;
        pj1 G2;
        jj1 jj1Var4;
        jj1 jj1Var5;
        zm1 zm1Var2;
        c82 c82Var;
        n31 n31Var2;
        int i;
        n31 n31Var3;
        n31 n31Var4;
        sn0 sn0Var2;
        int i2;
        int i3;
        pj1 G3;
        ArrayList z = zm3.z(qj1Var);
        bo0 bo0Var = this.a;
        zn0 zn0Var2 = bo0Var.f;
        if (!z.isEmpty()) {
            if (u10.g(j) != 0) {
                List list2 = (List) zv.u(z);
                if (list2.isEmpty()) {
                    G3 = qj1Var.G(0, 0, mi1.c(), bl0.p);
                    return G3;
                }
                List list3 = (List) zv.w(1, z);
                jj1 jj1Var6 = list3 != null ? (jj1) zv.v(list3) : null;
                List list4 = (List) zv.w(2, z);
                jj1 jj1Var7 = list4 != null ? (jj1) zv.v(list4) : null;
                list2.size();
                zn0Var2.getClass();
                long g0 = tk3.g0(tk3.D(tk3.B(j, 1), 10));
                if (jj1Var6 != null) {
                    xn0.c(jj1Var6, bo0Var, g0, new yn0(zn0Var2, bo0Var, 0));
                    zn0Var2.a = jj1Var6;
                }
                if (jj1Var7 != null) {
                    xn0.c(jj1Var7, bo0Var, g0, new yn0(zn0Var2, bo0Var, 1));
                    zn0Var2.c = jj1Var7;
                }
                Iterator it2 = list2.iterator();
                float f = bo0Var.c;
                float f2 = bo0Var.e;
                long B = tk3.B(j, 1);
                zn0 zn0Var3 = bo0Var.f;
                eo1 eo1Var2 = new eo1(new pj1[16]);
                int h = u10.h(B);
                int j2 = u10.j(B);
                int g = u10.g(B);
                zm1 zm1Var3 = r31.a;
                zm1 zm1Var4 = new zm1();
                ArrayList arrayList = new ArrayList();
                int ceil = (int) Math.ceil(qj1Var.D(f));
                int ceil2 = (int) Math.ceil(qj1Var.D(f2));
                long a = v10.a(0, h, 0, g);
                long g02 = tk3.g0(tk3.D(a, 14));
                c82 c82Var2 = new c82();
                if (it2.hasNext()) {
                    try {
                        jj1Var = (jj1) it2.next();
                    } catch (IndexOutOfBoundsException unused) {
                        jj1Var = null;
                    }
                    zn0Var = zn0Var3;
                    jj1Var2 = jj1Var;
                } else {
                    zn0Var = zn0Var3;
                    jj1Var2 = null;
                }
                if (jj1Var2 != null) {
                    eo1Var = eo1Var2;
                    it = it2;
                    jj1Var3 = jj1Var2;
                    n31Var = new n31(xn0.c(jj1Var2, bo0Var, g02, new m7(2, c82Var2)));
                } else {
                    jj1Var3 = jj1Var2;
                    eo1Var = eo1Var2;
                    it = it2;
                    n31Var = null;
                }
                Integer valueOf = n31Var != null ? Integer.valueOf((int) (n31Var.a >> 32)) : null;
                Integer valueOf2 = n31Var != null ? Integer.valueOf((int) (n31Var.a & 4294967295L)) : null;
                ym1 ym1Var = new ym1();
                ym1 ym1Var2 = new ym1();
                zn0 zn0Var4 = zn0Var;
                ArrayList arrayList2 = arrayList;
                tn0 tn0Var = new tn0(zn0Var4, B, ceil, ceil2);
                n31 n31Var5 = n31Var;
                sn0 b = tn0Var.b(it.hasNext(), 0, n31.a(h, g), n31Var5, 0, 0, 0, false, false);
                Integer num = valueOf2;
                if (b.b) {
                    sn0Var = b;
                    rn0Var = tn0Var.a(sn0Var, n31Var5 != null, -1, 0, h, 0);
                } else {
                    sn0Var = b;
                    rn0Var = null;
                }
                Integer num2 = num;
                int i4 = j2;
                int i5 = 0;
                int i6 = 0;
                int i7 = 0;
                int i8 = 0;
                int i9 = 0;
                jj1 jj1Var8 = jj1Var3;
                rn0 rn0Var2 = rn0Var;
                int i10 = g;
                sn0 sn0Var3 = sn0Var;
                int i11 = 0;
                int i12 = h;
                while (!sn0Var3.b && jj1Var8 != null) {
                    valueOf.getClass();
                    int intValue = valueOf.intValue();
                    num2.getClass();
                    int intValue2 = num2.intValue();
                    rn0 rn0Var3 = rn0Var2;
                    int i13 = i6 + intValue;
                    int max = Math.max(i5, intValue2);
                    int i14 = i12 - intValue;
                    int i15 = i11 + 1;
                    zn0Var4.getClass();
                    arrayList2.add(jj1Var8);
                    zm1Var4.h(i11, c82Var2.m);
                    int i16 = i15 - i7;
                    if (it.hasNext()) {
                        try {
                            jj1Var4 = (jj1) it.next();
                        } catch (IndexOutOfBoundsException unused2) {
                            jj1Var4 = null;
                        }
                        jj1Var5 = jj1Var4;
                    } else {
                        jj1Var5 = null;
                    }
                    c82Var2.m = null;
                    if (jj1Var5 != null) {
                        zm1Var2 = zm1Var4;
                        c82Var = c82Var2;
                        n31Var2 = new n31(xn0.c(jj1Var5, bo0Var, g02, new m7(1, c82Var2)));
                    } else {
                        zm1Var2 = zm1Var4;
                        c82Var = c82Var2;
                        n31Var2 = null;
                    }
                    Integer valueOf3 = n31Var2 != null ? Integer.valueOf(((int) (n31Var2.a >> 32)) + ceil) : null;
                    long j3 = g02;
                    Integer valueOf4 = n31Var2 != null ? Integer.valueOf((int) (n31Var2.a & 4294967295L)) : null;
                    boolean hasNext = it.hasNext();
                    int i17 = i8;
                    long a2 = n31.a(i14, i10);
                    if (n31Var2 == null) {
                        i = i14;
                        n31Var3 = n31Var2;
                        n31Var4 = null;
                    } else {
                        valueOf3.getClass();
                        int intValue3 = valueOf3.intValue();
                        valueOf4.getClass();
                        i = i14;
                        n31Var3 = n31Var2;
                        n31Var4 = new n31(n31.a(intValue3, valueOf4.intValue()));
                    }
                    sn0 b2 = tn0Var.b(hasNext, i16, a2, n31Var4, i17, i9, max, false, false);
                    int i18 = max;
                    if (b2.a) {
                        i4 = Math.min(Math.max(i4, i13), h);
                        int i19 = i9 + i18;
                        sn0Var2 = b2;
                        rn0 a3 = tn0Var.a(sn0Var2, n31Var3 != null, i17, i19, i, i16);
                        ym1Var2.a(i18);
                        i10 = (g - i19) - ceil2;
                        ym1Var.a(i15);
                        i8 = i17 + 1;
                        i9 = i19 + ceil2;
                        rn0Var2 = a3;
                        valueOf = valueOf3 != null ? Integer.valueOf(valueOf3.intValue() - ceil) : null;
                        i7 = i15;
                        i2 = h;
                        i3 = 0;
                        i18 = 0;
                    } else {
                        sn0Var2 = b2;
                        i2 = i;
                        i3 = i13;
                        valueOf = valueOf3;
                        rn0Var2 = rn0Var3;
                        i8 = i17;
                    }
                    i5 = i18;
                    jj1Var8 = jj1Var5;
                    i11 = i15;
                    num2 = valueOf4;
                    zm1Var4 = zm1Var2;
                    c82Var2 = c82Var;
                    i12 = i2;
                    g02 = j3;
                    i6 = i3;
                    sn0Var3 = sn0Var2;
                }
                rn0 rn0Var4 = rn0Var2;
                zm1 zm1Var5 = zm1Var4;
                if (rn0Var4 != null) {
                    long j4 = rn0Var4.c;
                    arrayList2.add(rn0Var4.a);
                    zm1Var = zm1Var5;
                    zm1Var.h(arrayList2.size() - 1, rn0Var4.b);
                    int i20 = ym1Var.b - 1;
                    if (rn0Var4.d) {
                        ym1Var2.f(i20, Math.max(ym1Var2.c(i20), (int) (j4 & 4294967295L)));
                        ym1Var.f(i20, ym1Var.d() + 1);
                    } else {
                        ym1Var2.a((int) (j4 & 4294967295L));
                        ym1Var.a(ym1Var.d() + 1);
                    }
                } else {
                    zm1Var = zm1Var5;
                }
                int size = arrayList2.size();
                n12[] n12VarArr = new n12[size];
                for (int i21 = 0; i21 < size; i21++) {
                    n12VarArr[i21] = zm1Var.b(i21);
                }
                int i22 = ym1Var.b;
                int[] iArr = new int[i22];
                for (int i23 = 0; i23 < i22; i23++) {
                    iArr[i23] = 0;
                }
                int i24 = ym1Var.b;
                int[] iArr2 = new int[i24];
                for (int i25 = 0; i25 < i24; i25++) {
                    iArr2[i25] = 0;
                }
                int[] iArr3 = ym1Var.a;
                int i26 = ym1Var.b;
                int i27 = i4;
                int i28 = 0;
                int i29 = 0;
                int i30 = 0;
                while (i29 < i26) {
                    int i31 = iArr3[i29];
                    ArrayList arrayList3 = arrayList2;
                    int i32 = i26;
                    bo0 bo0Var2 = bo0Var;
                    pj1 E = yj1.E(bo0Var2, i27, u10.i(a), u10.h(a), ym1Var2.c(i29), ceil, qj1Var, arrayList3, n12VarArr, i28, i31, iArr, i29);
                    int e = E.e();
                    int c = E.c();
                    iArr2[i29] = c;
                    i30 += c;
                    i27 = Math.max(i27, e);
                    eo1Var.b(E);
                    i29++;
                    bo0Var = bo0Var2;
                    arrayList2 = arrayList3;
                    i28 = i31;
                    i26 = i32;
                    ym1Var2 = ym1Var2;
                }
                eo1 eo1Var3 = eo1Var;
                bo0 bo0Var3 = bo0Var;
                if (eo1Var3.o == 0) {
                    i27 = 0;
                    i30 = 0;
                }
                zh zhVar = bo0Var3.b;
                int c2 = d.c(((eo1Var3.o - 1) * qj1Var.R(zhVar.a())) + i30, u10.i(B), u10.g(B));
                zhVar.i(qj1Var, c2, iArr2, iArr);
                G2 = qj1Var.G(d.c(i27, u10.j(B), u10.h(B)), c2, mi1.c(), new wn0(0, eo1Var3));
                return G2;
            }
            zn0Var2.getClass();
        }
        G = qj1Var.G(0, 0, mi1.c(), bl0.o);
        return G;
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
        ArrayList z = zm3.z(h41Var);
        bo0 bo0Var = this.a;
        zn0 zn0Var = bo0Var.f;
        List list2 = (List) zv.w(1, z);
        jj1 jj1Var = list2 != null ? (jj1) zv.v(list2) : null;
        List list3 = (List) zv.w(2, z);
        zn0Var.b(jj1Var, list3 != null ? (jj1) zv.v(list3) : null, v10.b(i, 0, 13));
        List list4 = (List) zv.v(z);
        if (list4 == null) {
            list4 = ah0.m;
        }
        return (int) (xn0.b(list4, bo0Var.i, bo0Var.h, i, h41Var.R(bo0Var.c), h41Var.R(bo0Var.e), bo0Var.f) >> 32);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @Override // defpackage.oj1
    public final int i(h41 h41Var, List list, int i) {
        ArrayList z = zm3.z(h41Var);
        bo0 bo0Var = this.a;
        zn0 zn0Var = bo0Var.f;
        int i2 = 1;
        List list2 = (List) zv.w(1, z);
        jj1 jj1Var = list2 != null ? (jj1) zv.v(list2) : null;
        char c = 2;
        List list3 = (List) zv.w(2, z);
        int i3 = 0;
        zn0Var.b(jj1Var, list3 != null ? (jj1) zv.v(list3) : null, v10.b(0, i, 7));
        List list4 = (List) zv.v(z);
        if (list4 == null) {
            list4 = ah0.m;
        }
        List list5 = list4;
        int R = h41Var.R(bo0Var.c);
        int R2 = h41Var.R(bo0Var.e);
        zn0 zn0Var2 = bo0Var.f;
        xt0 xt0Var = bo0Var.i;
        xt0 xt0Var2 = bo0Var.h;
        if (list5.isEmpty()) {
            return 0;
        }
        int size = list5.size();
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            iArr[i4] = 0;
        }
        int size2 = list5.size();
        int[] iArr2 = new int[size2];
        for (int i5 = 0; i5 < size2; i5++) {
            iArr2[i5] = 0;
        }
        int size3 = list5.size();
        int i6 = 0;
        while (i6 < size3) {
            jj1 jj1Var2 = (jj1) list5.get(i6);
            char c2 = c;
            int intValue = ((Number) xt0Var.a(jj1Var2, Integer.valueOf(i6), Integer.valueOf(i))).intValue();
            iArr[i6] = intValue;
            iArr2[i6] = ((Number) xt0Var2.a(jj1Var2, Integer.valueOf(i6), Integer.valueOf(intValue))).intValue();
            i6++;
            c = c2;
            i3 = i3;
        }
        int i7 = i3;
        if (Integer.MAX_VALUE < list5.size()) {
            zn0Var2.getClass();
        }
        if (Integer.MAX_VALUE >= list5.size()) {
            zn0Var2.getClass();
        }
        int min = Math.min(Integer.MAX_VALUE, list5.size());
        int i8 = i7;
        int i9 = i8;
        while (i8 < size) {
            i9 += iArr[i8];
            i8++;
        }
        int size4 = ((list5.size() - 1) * R) + i9;
        if (size2 == 0) {
            b71.f();
            return i7;
        }
        int i10 = iArr2[i7];
        t31 it = new IntRange(1, size2 - 1, 1).iterator();
        while (it.o) {
            int i11 = iArr2[it.nextInt()];
            if (i10 < i11) {
                i10 = i11;
            }
        }
        if (size == 0) {
            b71.f();
            return 0;
        }
        int i12 = iArr[i7];
        t31 it2 = new IntRange(1, size - 1, 1).iterator();
        while (it2.o) {
            int i13 = iArr[it2.nextInt()];
            if (i12 < i13) {
                i12 = i13;
            }
        }
        int i14 = size4;
        while (i12 <= size4 && i10 != i) {
            int i15 = (i12 + size4) / 2;
            zn0 zn0Var3 = zn0Var2;
            long b = xn0.b(list5, new vn0(iArr, i7), new vn0(iArr2, i2), i15, R, R2, zn0Var3);
            int[] iArr3 = iArr;
            int i16 = (int) (b >> 32);
            int i17 = (int) (4294967295L & b);
            if (i16 > i || i17 < min) {
                i12 = i15 + 1;
                if (i12 > size4) {
                    return i12;
                }
            } else {
                if (i16 >= i) {
                    return i15;
                }
                size4 = i15 - 1;
            }
            i10 = i16;
            iArr = iArr3;
            i14 = i15;
            zn0Var2 = zn0Var3;
            i7 = 0;
            i2 = 1;
        }
        return i14;
    }

    public final String toString() {
        return "MultiContentMeasurePolicyImpl(measurePolicy=" + this.a + ')';
    }
}
