package q;

import g0.k1;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final b f7257a = new b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final b f7258b = new b(1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f7259c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f7260d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f7261e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f7262f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f7263g = 15;

    /* renamed from: h, reason: collision with root package name */
    public static final int f7264h = 48;

    public static final void a(g0.p pVar, s0.o oVar) {
        m mVar = m.f7306c;
        int i7 = pVar.P;
        s0.o c4 = s0.a.c(pVar, oVar);
        k1 m8 = pVar.m();
        r1.j.f7810d.getClass();
        r1.n nVar = r1.i.f7781b;
        b1.b bVar = pVar.f3820a;
        pVar.U();
        if (pVar.O) {
            pVar.l(nVar);
        } else {
            pVar.d0();
        }
        g0.d.Q(pVar, mVar, r1.i.f7784e);
        g0.d.Q(pVar, m8, r1.i.f7783d);
        g0.d.Q(pVar, c4, r1.i.f7782c);
        r1.h hVar = r1.i.f7785f;
        if (pVar.O || !r6.k.a(pVar.G(), Integer.valueOf(i7))) {
            a0.m.q(i7, pVar, i7, hVar);
        }
        pVar.p(true);
    }

    public static final k0 b(p1.e0 e0Var) {
        Object g9 = e0Var.g();
        if (g9 instanceof k0) {
            return (k0) g9;
        }
        return null;
    }

    public static final float c(k0 k0Var) {
        if (k0Var != null) {
            return k0Var.f7297a;
        }
        return 0.0f;
    }

    public static p1.g0 d(j0 j0Var, int i7, int i8, int i9, int i10, int i11, p1.h0 h0Var, List list, p1.n0[] n0VarArr, int i12) {
        int[] iArr;
        float f9;
        String str;
        long j8;
        int i13;
        int i14;
        int e9;
        int i15;
        String str2;
        int i16;
        int i17;
        int i18;
        float f10;
        boolean z8;
        int i19;
        float f11;
        int i20;
        int i21;
        List list2 = list;
        int i22 = i12;
        long j9 = i11;
        int[] iArr2 = new int[i22];
        float f12 = 0.0f;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        int i26 = 0;
        int i27 = 0;
        while (i23 < i22) {
            p1.e0 e0Var = (p1.e0) list2.get(i23);
            float c4 = c(b(e0Var));
            if (c4 > 0.0f) {
                f12 += c4;
                i24++;
                i20 = i23;
            } else {
                int i28 = i9 - i25;
                p1.n0 n0Var = n0VarArr[i23];
                if (n0Var == null) {
                    i20 = i23;
                    f11 = f12;
                    i21 = i28;
                    n0Var = e0Var.b(j0Var.d(0, i9 == Integer.MAX_VALUE ? Integer.MAX_VALUE : i28 < 0 ? 0 : i28, i10, false));
                } else {
                    f11 = f12;
                    i20 = i23;
                    i21 = i28;
                }
                p1.n0 n0Var2 = n0Var;
                int j10 = j0Var.j(n0Var2);
                int i29 = j0Var.i(n0Var2);
                iArr2[i20] = j10;
                int i30 = i21 - j10;
                if (i30 < 0) {
                    i30 = 0;
                }
                i26 = Math.min(i11, i30);
                i25 += j10 + i26;
                i27 = Math.max(i27, i29);
                n0VarArr[i20] = n0Var2;
                f12 = f11;
            }
            i23 = i20 + 1;
        }
        float f13 = f12;
        int i31 = i27;
        if (i24 != 0) {
            int i32 = i9 != Integer.MAX_VALUE ? i9 : i7;
            long j11 = (i24 - 1) * j9;
            iArr = iArr2;
            long j12 = (i32 - i25) - j11;
            if (j12 < 0) {
                j12 = 0;
            }
            float f14 = j12 / f13;
            long j13 = j12;
            int i33 = 0;
            while (true) {
                f9 = f14;
                str = "fixedSpace ";
                j8 = j12;
                if (i33 >= i22) {
                    break;
                }
                int i34 = i33;
                float c6 = c(b((p1.e0) list2.get(i33)));
                float f15 = f9 * c6;
                try {
                    j13 -= Math.round(f15);
                    i33 = i34 + 1;
                    list2 = list;
                    f14 = f9;
                    j12 = j8;
                } catch (IllegalArgumentException e10) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i9 + "mainAxisMin " + i7 + "targetSpace " + i32 + "arrangementSpacingPx " + j9 + "weightChildrenCount " + i24 + "fixedSpace " + i25 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j8 + "totalWeight " + f13 + "weightUnitSpace " + f9 + "itemWeight " + c6 + "weightedSize " + f15).initCause(e10);
                }
            }
            int i35 = i31;
            int i36 = 0;
            int i37 = 0;
            while (true) {
                long j14 = j8;
                if (i37 >= i22) {
                    i13 = i25;
                    i14 = 0;
                    i31 = i35;
                    e9 = v1.g.e((int) (i36 + j11), 0, i9 - i13);
                    break;
                }
                if (n0VarArr[i37] == null) {
                    i15 = i37;
                    p1.e0 e0Var2 = (p1.e0) list.get(i37);
                    k0 b9 = b(e0Var2);
                    i16 = i25;
                    float c9 = c(b9);
                    if (c9 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    int signum = Long.signum(j13);
                    str2 = str;
                    int i38 = i24;
                    j13 -= signum;
                    float f16 = f9 * c9;
                    int max = Math.max(0, Math.round(f16) + signum);
                    if (b9 != null) {
                        try {
                            z8 = b9.f7298b;
                        } catch (IllegalArgumentException e11) {
                            e = e11;
                            f10 = f16;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i9 + "mainAxisMin " + i7 + "targetSpace " + i32 + "arrangementSpacingPx " + j9 + "weightChildrenCount " + i38 + str2 + i16 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j14 + "totalWeight " + f13 + "weightUnitSpace " + f9 + "weight " + c9 + "weightedSize " + f10 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                        }
                    } else {
                        z8 = true;
                    }
                    try {
                        if (z8 && max != Integer.MAX_VALUE) {
                            i19 = max;
                            f10 = f16;
                            p1.n0 b10 = e0Var2.b(j0Var.d(i19, max, i10, true));
                            int j15 = j0Var.j(b10);
                            int i39 = j0Var.i(b10);
                            iArr[i15] = j15;
                            i18 = i36 + j15;
                            int max2 = Math.max(i35, i39);
                            n0VarArr[i15] = b10;
                            i35 = max2;
                            i17 = i38;
                        }
                        p1.n0 b102 = e0Var2.b(j0Var.d(i19, max, i10, true));
                        int j152 = j0Var.j(b102);
                        int i392 = j0Var.i(b102);
                        iArr[i15] = j152;
                        i18 = i36 + j152;
                        int max22 = Math.max(i35, i392);
                        n0VarArr[i15] = b102;
                        i35 = max22;
                        i17 = i38;
                    } catch (IllegalArgumentException e12) {
                        e = e12;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i9 + "mainAxisMin " + i7 + "targetSpace " + i32 + "arrangementSpacingPx " + j9 + "weightChildrenCount " + i38 + str2 + i16 + "arrangementSpacingTotal " + j11 + "remainingToTarget " + j14 + "totalWeight " + f13 + "weightUnitSpace " + f9 + "weight " + c9 + "weightedSize " + f10 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max).initCause(e);
                    }
                    i19 = 0;
                    f10 = f16;
                } else {
                    i15 = i37;
                    str2 = str;
                    i16 = i25;
                    i17 = i24;
                    i18 = i36;
                }
                j8 = j14;
                i37 = i15 + 1;
                i36 = i18;
                i24 = i17;
                i25 = i16;
                str = str2;
                i22 = i12;
            }
        } else {
            iArr = iArr2;
            i13 = i25 - i26;
            i14 = 0;
            e9 = 0;
        }
        int i40 = i13 + e9;
        if (i40 < 0) {
            i40 = i14;
        }
        int max3 = Math.max(i40, i7);
        int max4 = Math.max(i31, Math.max(i8, i14));
        int[] iArr3 = new int[i12];
        for (int i41 = i14; i41 < i12; i41++) {
            iArr3[i41] = i14;
        }
        j0Var.h(max3, h0Var, iArr, iArr3);
        return j0Var.f(n0VarArr, h0Var, iArr3, max3, max4);
    }

    public static final c0 e(v2.c cVar) {
        return new c0(cVar.f9102a, cVar.f9103b, cVar.f9104c, cVar.f9105d);
    }

    public static final void f(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
