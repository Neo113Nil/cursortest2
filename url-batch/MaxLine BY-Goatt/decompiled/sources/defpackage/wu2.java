package defpackage;

import androidx.compose.ui.layout.a;
import java.util.List;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-f637039a30e7f02c20533c4f80288990fc1f8a3fc9c006e2afe538d0c6568abe */
/* loaded from: classes.dex */
public final class wu2 implements oj1 {
    public final boolean a;
    public final float b;
    public final yx1 c;

    public wu2(boolean z, float f, yx1 yx1Var) {
        this.a = z;
        this.b = f;
        this.c = yx1Var;
    }

    public static int d(List list, int i, Function2 function2) {
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
                    if (Intrinsics.b(pu2.e((jj1) obj4), "Prefix")) {
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
                    if (Intrinsics.b(pu2.e((jj1) obj5), "Suffix")) {
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
                    if (Intrinsics.b(pu2.e((jj1) obj6), "Leading")) {
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
                int i9 = intValue4 + intValue5;
                return Math.max(Math.max(intValue + i9, Math.max((jj1Var6 != null ? ((Number) function2.invoke(jj1Var6, Integer.valueOf(i))).intValue() : 0) + i9, intValue2)) + intValue6 + intValue3, u10.j(pu2.a));
            }
        }
        ch2.k("Collection contains no element matching the predicate.");
        return 0;
    }

    @Override // defpackage.oj1
    public final int a(h41 h41Var, List list, int i) {
        return c(h41Var, list, i, fi2.B);
    }

    @Override // defpackage.oj1
    public final int b(h41 h41Var, List list, int i) {
        return d(list, i, fi2.C);
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
        int intValue = obj8 != null ? ((Number) function2.invoke(obj8, Integer.valueOf(i2))).intValue() : 0;
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
            int intValue2 = ((Number) function2.invoke(jj1Var3, Integer.valueOf(i2))).intValue();
            int Y2 = jj1Var3.Y(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= Y2;
            }
            i5 = intValue2;
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
            int intValue3 = ((Number) function2.invoke(jj1Var4, Integer.valueOf(i2))).intValue();
            int Y3 = jj1Var4.Y(Integer.MAX_VALUE);
            if (i2 != Integer.MAX_VALUE) {
                i2 -= Y3;
            }
            i7 = intValue3;
        } else {
            i7 = i6;
        }
        int size6 = list.size();
        for (int i13 = i6; i13 < size6; i13++) {
            Object obj9 = list.get(i13);
            if (Intrinsics.b(pu2.e((jj1) obj9), "TextField")) {
                int intValue4 = ((Number) function2.invoke(obj9, Integer.valueOf(i2))).intValue();
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
                int intValue5 = obj10 != null ? ((Number) function2.invoke(obj10, Integer.valueOf(i2))).intValue() : i6;
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
                return ak2.c(intValue4, intValue, i3, i4, i5, i7, intValue5, obj12 != null ? ((Number) function2.invoke(obj12, Integer.valueOf(i))).intValue() : i6, this.b, pu2.a, h41Var.d(), this.c);
            }
        }
        ch2.k("Collection contains no element matching the predicate.");
        return i6;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v25 */
    /* JADX WARN: Type inference failed for: r10v26, types: [n12] */
    /* JADX WARN: Type inference failed for: r10v43 */
    /* JADX WARN: Type inference failed for: r11v30 */
    /* JADX WARN: Type inference failed for: r11v31, types: [n12] */
    /* JADX WARN: Type inference failed for: r11v32 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v5, types: [n12] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [n12] */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11, types: [n12] */
    /* JADX WARN: Type inference failed for: r8v26 */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v11 */
    /* JADX WARN: Type inference failed for: r9v2, types: [n12] */
    @Override // defpackage.oj1
    public final pj1 f(qj1 qj1Var, List list, long j) {
        Object obj;
        pj1 pj1Var;
        Object obj2;
        Object obj3;
        int i;
        ?? r2;
        Object obj4;
        int i2;
        ?? r8;
        int i3;
        Object obj5;
        Object obj6;
        int i4;
        Object obj7;
        pj1 G;
        List list2 = list;
        yx1 yx1Var = this.c;
        int R = qj1Var.R(yx1Var.d());
        int R2 = qj1Var.R(yx1Var.c());
        long a = u10.a(j, 0, 0, 0, 0, 10);
        int size = list2.size();
        int i5 = 0;
        while (true) {
            if (i5 >= size) {
                obj = null;
                break;
            }
            obj = list2.get(i5);
            if (Intrinsics.b(a.a((jj1) obj), "Leading")) {
                break;
            }
            i5++;
        }
        jj1 jj1Var = (jj1) obj;
        n12 c = jj1Var != null ? jj1Var.c(a) : null;
        float f = pu2.b;
        int i6 = c != null ? c.m : 0;
        int max = Math.max(0, c != null ? c.n : 0);
        int size2 = list2.size();
        int i7 = 0;
        while (true) {
            if (i7 >= size2) {
                pj1Var = null;
                obj2 = null;
                break;
            }
            obj2 = list2.get(i7);
            pj1Var = null;
            if (Intrinsics.b(a.a((jj1) obj2), "Trailing")) {
                break;
            }
            i7++;
        }
        jj1 jj1Var2 = (jj1) obj2;
        n12 c2 = jj1Var2 != null ? jj1Var2.c(v10.k(a, -i6, 0, 2)) : pj1Var;
        int i8 = i6 + (c2 != 0 ? c2.m : 0);
        int max2 = Math.max(max, c2 != 0 ? c2.n : 0);
        int size3 = list2.size();
        int i9 = 0;
        while (true) {
            if (i9 >= size3) {
                obj3 = pj1Var;
                break;
            }
            obj3 = list2.get(i9);
            if (Intrinsics.b(a.a((jj1) obj3), "Prefix")) {
                break;
            }
            i9++;
        }
        jj1 jj1Var3 = (jj1) obj3;
        if (jj1Var3 != null) {
            i = i8;
            r2 = jj1Var3.c(v10.k(a, -i8, 0, 2));
        } else {
            i = i8;
            r2 = pj1Var;
        }
        int i10 = (r2 != 0 ? r2.m : 0) + i;
        int max3 = Math.max(max2, r2 != 0 ? r2.n : 0);
        int size4 = list2.size();
        int i11 = 0;
        while (true) {
            if (i11 >= size4) {
                obj4 = pj1Var;
                break;
            }
            obj4 = list2.get(i11);
            int i12 = size4;
            if (Intrinsics.b(a.a((jj1) obj4), "Suffix")) {
                break;
            }
            i11++;
            size4 = i12;
        }
        jj1 jj1Var4 = (jj1) obj4;
        if (jj1Var4 != null) {
            i2 = R;
            r8 = jj1Var4.c(v10.k(a, -i10, 0, 2));
        } else {
            i2 = R;
            r8 = pj1Var;
        }
        int i13 = i10 + (r8 != 0 ? r8.m : 0);
        int max4 = Math.max(max3, r8 != 0 ? r8.n : 0);
        int i14 = -i13;
        long j2 = v10.j(i14, -R2, a);
        int size5 = list2.size();
        int i15 = 0;
        while (true) {
            if (i15 >= size5) {
                i3 = R2;
                obj5 = pj1Var;
                break;
            }
            obj5 = list2.get(i15);
            i3 = R2;
            int i16 = size5;
            if (Intrinsics.b(a.a((jj1) obj5), "Label")) {
                break;
            }
            i15++;
            size5 = i16;
            R2 = i3;
        }
        jj1 jj1Var5 = (jj1) obj5;
        ?? c3 = jj1Var5 != null ? jj1Var5.c(j2) : pj1Var;
        int size6 = list2.size();
        int i17 = 0;
        while (true) {
            if (i17 >= size6) {
                obj6 = pj1Var;
                break;
            }
            obj6 = list2.get(i17);
            if (Intrinsics.b(a.a((jj1) obj6), "Supporting")) {
                break;
            }
            i17++;
        }
        jj1 jj1Var6 = (jj1) obj6;
        int a0 = jj1Var6 != null ? jj1Var6.a0(u10.j(j)) : 0;
        int i18 = i2 + (c3 != 0 ? c3.n : 0);
        long j3 = v10.j(i14, ((-i18) - i3) - a0, u10.a(j, 0, 0, 0, 0, 11));
        int size7 = list2.size();
        int i19 = 0;
        n12 n12Var = c3;
        n12 n12Var2 = r8;
        while (i19 < size7) {
            jj1 jj1Var7 = (jj1) list2.get(i19);
            int i20 = size7;
            int i21 = i19;
            if (Intrinsics.b(a.a(jj1Var7), "TextField")) {
                n12 c4 = jj1Var7.c(j3);
                long a2 = u10.a(j3, 0, 0, 0, 0, 14);
                int size8 = list2.size();
                int i22 = 0;
                while (true) {
                    if (i22 >= size8) {
                        i4 = i18;
                        obj7 = pj1Var;
                        break;
                    }
                    obj7 = list2.get(i22);
                    int i23 = size8;
                    i4 = i18;
                    if (Intrinsics.b(a.a((jj1) obj7), "Hint")) {
                        break;
                    }
                    i22++;
                    size8 = i23;
                    i18 = i4;
                }
                jj1 jj1Var8 = (jj1) obj7;
                n12 c5 = jj1Var8 != null ? jj1Var8.c(a2) : pj1Var;
                int max5 = Math.max(max4, Math.max(c4.n, c5 != 0 ? c5.n : 0) + i4 + i3);
                int i24 = c != null ? c.m : 0;
                int i25 = c2 != 0 ? c2.m : 0;
                int i26 = (r2 != 0 ? r2.m : 0) + (n12Var2 != null ? n12Var2.m : 0);
                int max6 = Math.max(Math.max(c4.m + i26, Math.max((c5 != 0 ? c5.m : 0) + i26, n12Var != null ? n12Var.m : 0)) + i24 + i25, u10.j(j));
                ?? c6 = jj1Var6 != null ? jj1Var6.c(u10.a(v10.k(a, 0, -max5, 1), 0, max6, 0, 0, 9)) : pj1Var;
                int i27 = c6 != 0 ? c6.n : 0;
                int c7 = ak2.c(c4.n, n12Var != null ? n12Var.n : 0, c != null ? c.n : 0, c2 != 0 ? c2.n : 0, r2 != 0 ? r2.n : 0, n12Var2 != null ? n12Var2.n : 0, c5 != 0 ? c5.n : 0, c6 != 0 ? c6.n : 0, this.b, j, qj1Var.d(), this.c);
                int i28 = c7 - i27;
                int size9 = list2.size();
                int i29 = 0;
                n12 n12Var3 = n12Var;
                n12 n12Var4 = r2;
                n12 n12Var5 = n12Var2;
                while (i29 < size9) {
                    jj1 jj1Var9 = (jj1) list2.get(i29);
                    n12 n12Var6 = n12Var3;
                    if (Intrinsics.b(a.a(jj1Var9), "Container")) {
                        n12 c8 = jj1Var9.c(v10.a(max6 != Integer.MAX_VALUE ? max6 : 0, max6, i28 != Integer.MAX_VALUE ? i28 : 0, i28));
                        n12 n12Var7 = c4;
                        int i30 = c7;
                        G = qj1Var.G(max6, i30, mi1.c(), new vu2(n12Var6, max6, i30, n12Var7, c5, c, c2, n12Var4, n12Var5, c8, c6, this, i2, qj1Var));
                        return G;
                    }
                    i29++;
                    list2 = list;
                    n12Var4 = n12Var4;
                    n12Var5 = n12Var5;
                    c7 = c7;
                    c4 = c4;
                    n12Var3 = n12Var6;
                }
                ch2.k("Collection contains no element matching the predicate.");
                return pj1Var;
            }
            i19 = i21 + 1;
            list2 = list;
            size7 = i20;
            j3 = j3;
            n12Var2 = n12Var2;
            n12Var = n12Var;
        }
        ch2.k("Collection contains no element matching the predicate.");
        return pj1Var;
    }

    @Override // defpackage.oj1
    public final int g(h41 h41Var, List list, int i) {
        return c(h41Var, list, i, fi2.D);
    }

    @Override // defpackage.oj1
    public final int i(h41 h41Var, List list, int i) {
        return d(list, i, fi2.E);
    }
}
