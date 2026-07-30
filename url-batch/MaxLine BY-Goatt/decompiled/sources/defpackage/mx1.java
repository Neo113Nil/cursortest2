package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class mx1 implements oj1 {
    public final Function1 a;
    public final boolean b;
    public final float c;
    public final yx1 d;

    public mx1(Function1 function1, boolean z, float f, yx1 yx1Var) {
        this.a = function1;
        this.b = z;
        this.c = f;
        this.d = yx1Var;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
        return c(h41Var, list, i, sc.H);
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        return d(h41Var, list, i, sc.I);
    }

    public final int c(h41 h41Var, List list, int i, Function2 function2) {
        Object obj;
        int i2;
        int i3;
        Object obj2;
        int i4;
        Object obj3;
        Object obj4;
        int i5;
        int i6;
        Object obj5;
        int i7;
        Object obj6;
        Object obj7;
        int size = list.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size) {
                obj = null;
                break;
            }
            obj = list.get(i8);
            if (Intrinsics.b(pu2.e((jj1) obj), "Leading")) {
                break;
            }
            i8++;
        }
        jj1 jj1Var = (jj1) obj;
        if (jj1Var != null) {
            i2 = i == Integer.MAX_VALUE ? i : i - jj1Var.Y(Integer.MAX_VALUE);
            i3 = ((Number) function2.invoke(jj1Var, Integer.valueOf(i))).intValue();
        } else {
            i2 = i;
            i3 = 0;
        }
        int size2 = list.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size2) {
                obj2 = null;
                break;
            }
            obj2 = list.get(i9);
            if (Intrinsics.b(pu2.e((jj1) obj2), "Trailing")) {
                break;
            }
            i9++;
        }
        jj1 jj1Var2 = (jj1) obj2;
        if (jj1Var2 != null) {
            int Y = jj1Var2.Y(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= Y;
            }
            i4 = ((Number) function2.invoke(jj1Var2, Integer.valueOf(i))).intValue();
        } else {
            i4 = 0;
        }
        int size3 = list.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size3) {
                obj3 = null;
                break;
            }
            obj3 = list.get(i10);
            if (Intrinsics.b(pu2.e((jj1) obj3), "Label")) {
                break;
            }
            i10++;
        }
        Object obj8 = (jj1) obj3;
        int intValue = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(yk3.L(this.c, i2, i)))).intValue() : 0;
        int size4 = list.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = null;
                break;
            }
            obj4 = list.get(i11);
            if (Intrinsics.b(pu2.e((jj1) obj4), "Prefix")) {
                break;
            }
            i11++;
        }
        jj1 jj1Var3 = (jj1) obj4;
        if (jj1Var3 != null) {
            i5 = ((Number) function2.invoke(jj1Var3, Integer.valueOf(i2))).intValue();
            int Y2 = jj1Var3.Y(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= Y2;
            }
        } else {
            i5 = 0;
        }
        int size5 = list.size();
        int i12 = 0;
        while (true) {
            if (i12 >= size5) {
                i6 = 0;
                obj5 = null;
                break;
            }
            obj5 = list.get(i12);
            i6 = 0;
            if (Intrinsics.b(pu2.e((jj1) obj5), "Suffix")) {
                break;
            }
            i12++;
        }
        jj1 jj1Var4 = (jj1) obj5;
        if (jj1Var4 != null) {
            int intValue2 = ((Number) function2.invoke(jj1Var4, Integer.valueOf(i2))).intValue();
            int Y3 = jj1Var4.Y(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= Y3;
            }
            i7 = intValue2;
        } else {
            i7 = i6;
        }
        int size6 = list.size();
        for (int i13 = i6; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (Intrinsics.b(pu2.e((jj1) obj9), "TextField")) {
                int intValue3 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
                int size7 = list.size();
                int i14 = i6;
                while (true) {
                    if (i14 >= size7) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i14);
                    if (Intrinsics.b(pu2.e((jj1) obj6), "Hint")) {
                        break;
                    }
                    i14++;
                }
                Object obj10 = (jj1) obj6;
                int intValue4 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : i6;
                int size8 = list.size();
                int i15 = i6;
                while (true) {
                    if (i15 >= size8) {
                        obj7 = null;
                        break;
                    }
                    Object obj11 = list.get(i15);
                    if (Intrinsics.b(pu2.e((jj1) obj11), "Supporting")) {
                        obj7 = obj11;
                        break;
                    }
                    i15++;
                }
                Object obj12 = (jj1) obj7;
                return kx1.c(i3, i4, i5, i7, intValue3, intValue, intValue4, obj12 != null ? ((Number) function2.invoke(obj12, Integer.valueOf(i))).intValue() : i6, this.c, pu2.a, h41Var.d(), this.d);
            }
        }
        ch2.k("Collection contains no element matching the predicate.");
        return i6;
    }

    public final int d(h41 h41Var, List list, int i, Function2 function2) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        Object obj5;
        Object obj6;
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj7 = list.get(i2);
            if (Intrinsics.b(pu2.e((jj1) obj7), "TextField")) {
                int intValue = ((Number) function2.invoke(obj7, Integer.valueOf(i))).intValue();
                int size2 = list.size();
                int i3 = 0;
                while (true) {
                    obj = null;
                    if (i3 >= size2) {
                        obj2 = null;
                        break;
                    }
                    obj2 = list.get(i3);
                    if (Intrinsics.b(pu2.e((jj1) obj2), "Label")) {
                        break;
                    }
                    i3++;
                }
                jj1 jj1Var = (jj1) obj2;
                int intValue2 = jj1Var != null ? ((Number) function2.invoke(jj1Var, Integer.valueOf(i))).intValue() : 0;
                int size3 = list.size();
                int i4 = 0;
                while (true) {
                    if (i4 >= size3) {
                        obj3 = null;
                        break;
                    }
                    obj3 = list.get(i4);
                    if (Intrinsics.b(pu2.e((jj1) obj3), "Trailing")) {
                        break;
                    }
                    i4++;
                }
                jj1 jj1Var2 = (jj1) obj3;
                int intValue3 = jj1Var2 != null ? ((Number) function2.invoke(jj1Var2, Integer.valueOf(i))).intValue() : 0;
                int size4 = list.size();
                int i5 = 0;
                while (true) {
                    if (i5 >= size4) {
                        obj4 = null;
                        break;
                    }
                    obj4 = list.get(i5);
                    if (Intrinsics.b(pu2.e((jj1) obj4), "Leading")) {
                        break;
                    }
                    i5++;
                }
                jj1 jj1Var3 = (jj1) obj4;
                int intValue4 = jj1Var3 != null ? ((Number) function2.invoke(jj1Var3, Integer.valueOf(i))).intValue() : 0;
                int size5 = list.size();
                int i6 = 0;
                while (true) {
                    if (i6 >= size5) {
                        obj5 = null;
                        break;
                    }
                    obj5 = list.get(i6);
                    if (Intrinsics.b(pu2.e((jj1) obj5), "Prefix")) {
                        break;
                    }
                    i6++;
                }
                jj1 jj1Var4 = (jj1) obj5;
                int intValue5 = jj1Var4 != null ? ((Number) function2.invoke(jj1Var4, Integer.valueOf(i))).intValue() : 0;
                int size6 = list.size();
                int i7 = 0;
                while (true) {
                    if (i7 >= size6) {
                        obj6 = null;
                        break;
                    }
                    obj6 = list.get(i7);
                    if (Intrinsics.b(pu2.e((jj1) obj6), "Suffix")) {
                        break;
                    }
                    i7++;
                }
                jj1 jj1Var5 = (jj1) obj6;
                int intValue6 = jj1Var5 != null ? ((Number) function2.invoke(jj1Var5, Integer.valueOf(i))).intValue() : 0;
                int size7 = list.size();
                int i8 = 0;
                while (true) {
                    if (i8 >= size7) {
                        break;
                    }
                    Object obj8 = list.get(i8);
                    if (Intrinsics.b(pu2.e((jj1) obj8), "Hint")) {
                        obj = obj8;
                        break;
                    }
                    i8++;
                }
                jj1 jj1Var6 = (jj1) obj;
                return kx1.d(intValue4, intValue3, intValue5, intValue6, intValue, intValue2, jj1Var6 != null ? ((Number) function2.invoke(jj1Var6, Integer.valueOf(i))).intValue() : 0, this.c, pu2.a, h41Var.d(), this.d);
            }
        }
        ch2.k("Collection contains no element matching the predicate.");
        return 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v11 */
    /* JADX WARN: Type inference failed for: r10v2, types: [n12] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v5 */
    /* JADX WARN: Type inference failed for: r1v6, types: [n12] */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [n12] */
    /* JADX WARN: Type inference failed for: r3v11 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v5, types: [n12] */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9, types: [n12] */
    /* JADX WARN: Type inference failed for: r9v22 */
    /* JADX WARN: Type inference failed for: r9v23, types: [n12] */
    /* JADX WARN: Type inference failed for: r9v24 */
    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        Object obj;
        pj1 pj1Var;
        Object obj2;
        Object obj3;
        n12 n12Var;
        n12 n12Var2;
        Object obj4;
        int i;
        n12 n12Var3;
        int i2;
        Object obj5;
        Object obj6;
        Object obj7;
        int i3;
        pj1 G;
        mx1 mx1Var = this;
        List list2 = list;
        yx1 yx1Var = mx1Var.d;
        int R = qj1Var.R(yx1Var.c());
        long a = u10.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i4 = 0;
        while (true) {
            if (i4 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i4);
            if (Intrinsics.b(a.a((jj1) obj), "Leading")) {
                break;
            }
            i4++;
        }
        jj1 jj1Var = (jj1) obj;
        n12 c = jj1Var != null ? jj1Var.c(a) : null;
        float f = pu2.b;
        int i5 = c != null ? c.m : 0;
        int max = Math.max(0, c != null ? c.n : 0);
        int size2 = list2.size();
        int i6 = 0;
        while (true) {
            if (i6 >= size2) {
                pj1Var = null;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i6);
            pj1Var = null;
            if (Intrinsics.b(a.a((jj1) obj2), "Trailing")) {
                break;
            }
            i6++;
        }
        jj1 jj1Var2 = (jj1) obj2;
        n12 c2 = jj1Var2 != null ? jj1Var2.c(v10.k(a, -i5, 0, 2)) : pj1Var;
        int i7 = i5 + (c2 != 0 ? c2.m : 0);
        int max2 = Math.max(max, c2 != 0 ? c2.n : 0);
        int size3 = list2.size();
        int i8 = 0;
        while (true) {
            if (i8 >= size3) {
                obj3 = pj1Var;
                break;
            }
            obj3 = list2.get(i8);
            if (Intrinsics.b(a.a((jj1) obj3), "Prefix")) {
                break;
            }
            i8++;
        }
        jj1 jj1Var3 = (jj1) obj3;
        if (jj1Var3 != null) {
            n12Var = c;
            n12Var2 = jj1Var3.c(v10.k(a, -i7, 0, 2));
        } else {
            n12Var = c;
            n12Var2 = pj1Var;
        }
        int i9 = i7 + (n12Var2 != 0 ? n12Var2.m : 0);
        int max3 = Math.max(max2, n12Var2 != 0 ? n12Var2.n : 0);
        int size4 = list2.size();
        int i10 = 0;
        while (true) {
            if (i10 >= size4) {
                obj4 = pj1Var;
                break;
            }
            obj4 = list2.get(i10);
            if (Intrinsics.b(a.a((jj1) obj4), "Suffix")) {
                break;
            }
            i10++;
        }
        jj1 jj1Var4 = (jj1) obj4;
        if (jj1Var4 != null) {
            i = i9;
            n12Var3 = jj1Var4.c(v10.k(a, -i9, 0, 2));
        } else {
            i = i9;
            n12Var3 = pj1Var;
        }
        int i11 = i + (n12Var3 != 0 ? n12Var3.m : 0);
        int max4 = Math.max(max3, n12Var3 != 0 ? n12Var3.n : 0);
        int R2 = qj1Var.R(yx1Var.b(qj1Var.getLayoutDirection())) + qj1Var.R(yx1Var.a(qj1Var.getLayoutDirection()));
        int i12 = -i11;
        int L = yk3.L(mx1Var.c, i12 - R2, -R2);
        int i13 = -R;
        long j2 = v10.j(L, i13, a);
        int size5 = list2.size();
        int i14 = 0;
        while (true) {
            if (i14 >= size5) {
                i2 = R;
                obj5 = pj1Var;
                break;
            }
            obj5 = list2.get(i14);
            int i15 = i14;
            i2 = R;
            if (Intrinsics.b(a.a((jj1) obj5), "Label")) {
                break;
            }
            i14 = i15 + 1;
            R = i2;
        }
        jj1 jj1Var5 = (jj1) obj5;
        ?? c3 = jj1Var5 != null ? jj1Var5.c(j2) : pj1Var;
        mx1Var.a.invoke(new ql2(c3 != 0 ? ph2.a(c3.m, c3.n) : 0L));
        int size6 = list2.size();
        int i16 = 0;
        while (true) {
            if (i16 >= size6) {
                obj6 = pj1Var;
                break;
            }
            obj6 = list2.get(i16);
            int i17 = size6;
            if (Intrinsics.b(a.a((jj1) obj6), "Supporting")) {
                break;
            }
            i16++;
            size6 = i17;
        }
        jj1 jj1Var6 = (jj1) obj6;
        int a0 = jj1Var6 != null ? jj1Var6.a0(u10.j(j)) : 0;
        int max5 = Math.max((c3 != 0 ? c3.n : 0) / 2, qj1Var.R(yx1Var.d()));
        long a2 = u10.a(v10.j(i12, (i13 - max5) - a0, j), 0, 0, 0, 0, 11);
        int size7 = list2.size();
        int i18 = 0;
        while (i18 < size7) {
            int i19 = i18;
            jj1 jj1Var7 = (jj1) list2.get(i18);
            if (Intrinsics.b(a.a(jj1Var7), "TextField")) {
                n12 c4 = jj1Var7.c(a2);
                long a3 = u10.a(a2, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i20 = 0;
                while (true) {
                    if (i20 >= size8) {
                        obj7 = pj1Var;
                        break;
                    }
                    obj7 = list2.get(i20);
                    int i21 = size8;
                    int i22 = i20;
                    if (Intrinsics.b(a.a((jj1) obj7), "Hint")) {
                        break;
                    }
                    i20 = i22 + 1;
                    size8 = i21;
                }
                jj1 jj1Var8 = (jj1) obj7;
                ?? c5 = jj1Var8 != null ? jj1Var8.c(a3) : pj1Var;
                int max6 = Math.max(max4, Math.max(c4.n, c5 != 0 ? c5.n : 0) + max5 + i2);
                n12 n12Var4 = n12Var;
                int d = kx1.d(n12Var != null ? n12Var4.m : 0, c2 != 0 ? c2.m : 0, n12Var2 != 0 ? n12Var2.m : 0, n12Var3 != 0 ? n12Var3.m : 0, c4.m, c3 != 0 ? c3.m : 0, c5 != 0 ? c5.m : 0, mx1Var.c, j, qj1Var.d(), mx1Var.d);
                int i23 = 0;
                int i24 = d;
                ?? c6 = jj1Var6 != null ? jj1Var6.c(u10.a(v10.k(a, 0, -max6, 1), 0, d, 0, 0, 9)) : pj1Var;
                int i25 = c6 != 0 ? c6.n : 0;
                if (n12Var4 != null) {
                    i3 = 0;
                    i23 = n12Var4.n;
                } else {
                    i3 = 0;
                }
                n12 n12Var5 = c3;
                int c7 = kx1.c(i23, c2 != 0 ? c2.n : i3, n12Var2 != 0 ? n12Var2.n : i3, n12Var3 != 0 ? n12Var3.n : i3, c4.n, c3 != 0 ? c3.n : i3, c5 != 0 ? c5.n : i3, c6 != 0 ? c6.n : i3, mx1Var.c, j, qj1Var.d(), mx1Var.d);
                int i26 = c7 - i25;
                int size9 = list2.size();
                int i27 = i3;
                n12 n12Var6 = c6;
                while (i27 < size9) {
                    jj1 jj1Var9 = (jj1) list2.get(i27);
                    if (Intrinsics.b(a.a(jj1Var9), "Container")) {
                        n12 n12Var7 = c4;
                        n12 n12Var8 = n12Var6;
                        int i28 = i24;
                        G = qj1Var.G(i28, c7, mi1.c(), new lx1(c7, i28, n12Var4, c2, n12Var2, n12Var3, n12Var7, n12Var5, c5, jj1Var9.c(v10.a(i24 != Integer.MAX_VALUE ? i24 : i3, i24, i26 != Integer.MAX_VALUE ? i26 : i3, i26)), n12Var8, mx1Var, qj1Var));
                        return G;
                    }
                    i27++;
                    i24 = i24;
                    n12Var6 = n12Var6;
                    c4 = c4;
                    n12Var5 = n12Var5;
                    n12Var4 = n12Var4;
                    mx1Var = this;
                    list2 = list;
                }
                ch2.k("Collection contains no element matching the predicate.");
                return pj1Var;
            }
            i18 = i19 + 1;
            mx1Var = this;
            list2 = list;
            a2 = a2;
        }
        ch2.k("Collection contains no element matching the predicate.");
        return pj1Var;
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
        return c(h41Var, list, i, sc.J);
    }

    @Override // defpackage.oj1
    public final int i(h41 h41Var, List list, int i) {
        return d(h41Var, list, i, sc.K);
    }
}
