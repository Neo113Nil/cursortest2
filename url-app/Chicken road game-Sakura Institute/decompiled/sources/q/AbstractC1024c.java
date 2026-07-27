package q;

import A.AbstractC0017m;
import B1.C0097d;
import G.C0192d;
import G.C0216p;
import G.InterfaceC0213n0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import p0.AbstractC0954O;
import p0.InterfaceC0944E;
import p0.InterfaceC0946G;
import p0.InterfaceC0947H;
import r0.C1067h;
import r0.C1068i;
import r0.C1069j;
import r0.InterfaceC1070k;

/* renamed from: q.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1024c {

    /* renamed from: a, reason: collision with root package name */
    public static final C1023b f9240a = new C1023b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C1023b f9241b = new C1023b(1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f9242c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f9243d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f9244e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f9245f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f9246g = 15;

    public static final void a(C0216p c0216p, S.o oVar) {
        C1034m c1034m = C1034m.f9283c;
        int i2 = c0216p.f2861P;
        S.o d4 = S.a.d(c0216p, oVar);
        InterfaceC0213n0 m4 = c0216p.m();
        InterfaceC1070k.f9822h.getClass();
        C1068i c1068i = C1069j.f9816b;
        C0097d c0097d = c0216p.f2862a;
        c0216p.W();
        if (c0216p.f2860O) {
            c0216p.l(c1068i);
        } else {
            c0216p.f0();
        }
        C0192d.R(c0216p, c1034m, C1069j.f9820f);
        C0192d.R(c0216p, m4, C1069j.f9819e);
        C0192d.R(c0216p, d4, C1069j.f9818d);
        C1067h c1067h = C1069j.f9821g;
        if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), Integer.valueOf(i2))) {
            AbstractC0017m.r(i2, c0216p, i2, c1067h);
        }
        c0216p.q(true);
    }

    public static long c(long j4, int i2) {
        return u3.d.a(i2 == 1 ? M0.a.k(j4) : M0.a.j(j4), i2 == 1 ? M0.a.i(j4) : M0.a.h(j4), i2 == 1 ? M0.a.j(j4) : M0.a.k(j4), i2 == 1 ? M0.a.h(j4) : M0.a.i(j4));
    }

    public static long d(long j4, int i2) {
        return u3.d.a(0, M0.a.i(j4), (i2 & 4) != 0 ? M0.a.j(j4) : 0, M0.a.h(j4));
    }

    public static final d0 e(InterfaceC0944E interfaceC0944E) {
        Object r2 = interfaceC0944E.r();
        if (r2 instanceof d0) {
            return (d0) r2;
        }
        return null;
    }

    public static final float f(d0 d0Var) {
        if (d0Var != null) {
            return d0Var.f9248a;
        }
        return 0.0f;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v46 */
    /* JADX WARN: Type inference failed for: r1v47, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v48 */
    public static final InterfaceC0946G g(c0 c0Var, int i2, int i4, int i5, int i6, int i7, InterfaceC0947H interfaceC0947H, List list, AbstractC0954O[] abstractC0954OArr, int i8, int i9, int[] iArr, int i10) {
        int[] iArr2;
        String str;
        float f4;
        String str2;
        long j4;
        String str3;
        int i11;
        c0 c0Var2;
        int i12;
        int e4;
        int i13;
        int i14;
        String str4;
        String str5;
        long j5;
        String str6;
        long j6;
        float f5;
        String str7;
        String str8;
        String str9;
        float f6;
        String str10;
        int i15;
        long j7;
        float f7;
        float f8;
        String str11;
        float f9;
        boolean z4;
        int i16;
        long j8;
        int i17;
        int i18;
        ?? r12;
        List list2 = list;
        int i19 = i9;
        long j9 = i7;
        int i20 = i19 - i8;
        int[] iArr3 = new int[i20];
        int i21 = i8;
        float f10 = 0.0f;
        int i22 = 0;
        int i23 = 0;
        int i24 = 0;
        int i25 = 0;
        while (i21 < i19) {
            InterfaceC0944E interfaceC0944E = (InterfaceC0944E) list2.get(i21);
            float f11 = f(e(interfaceC0944E));
            if (f11 > 0.0f) {
                f10 += f11;
                i22++;
                j8 = j9;
                i17 = i20;
            } else {
                int i26 = i5 - i23;
                AbstractC0954O abstractC0954O = abstractC0954OArr[i21];
                if (abstractC0954O == null) {
                    i17 = i20;
                    if (i5 == Integer.MAX_VALUE) {
                        j8 = j9;
                        r12 = 0;
                        i18 = Integer.MAX_VALUE;
                    } else {
                        i18 = i26 < 0 ? 0 : i26;
                        j8 = j9;
                        r12 = 0;
                    }
                    abstractC0954O = interfaceC0944E.a(c0Var.i(r12, i18, i6, r12));
                } else {
                    j8 = j9;
                    i17 = i20;
                }
                AbstractC0954O abstractC0954O2 = abstractC0954O;
                int d4 = c0Var.d(abstractC0954O2);
                int j10 = c0Var.j(abstractC0954O2);
                iArr3[i21 - i8] = d4;
                int i27 = i26 - d4;
                if (i27 < 0) {
                    i27 = 0;
                }
                i24 = Math.min(i7, i27);
                i23 += d4 + i24;
                int max = Math.max(i25, j10);
                abstractC0954OArr[i21] = abstractC0954O2;
                i25 = max;
            }
            i21++;
            list2 = list;
            i20 = i17;
            j9 = j8;
        }
        long j11 = j9;
        int i28 = i20;
        int i29 = i25;
        if (i22 == 0) {
            i13 = i23 - i24;
            i11 = i2;
            iArr2 = iArr3;
            e4 = 0;
            i12 = 0;
            c0Var2 = c0Var;
        } else {
            int i30 = i5 != Integer.MAX_VALUE ? i5 : i2;
            long j12 = (i22 - 1) * j11;
            long j13 = (i30 - i23) - j12;
            if (j13 < 0) {
                j13 = 0;
            }
            float f12 = j13 / f10;
            int i31 = i8;
            long j14 = j13;
            while (true) {
                iArr2 = iArr3;
                str = "weightedSize ";
                f4 = f10;
                str2 = "weightChildrenCount ";
                j4 = j13;
                str3 = "remainingToTarget ";
                if (i31 >= i19) {
                    break;
                }
                float f13 = f(e((InterfaceC0944E) list.get(i31)));
                long j15 = j12;
                float f14 = f12 * f13;
                try {
                    j14 -= Math.round(f14);
                    i31++;
                    i19 = i9;
                    iArr3 = iArr2;
                    f10 = f4;
                    j13 = j4;
                    j12 = j15;
                } catch (IllegalArgumentException e5) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i5 + "mainAxisMin " + i2 + "targetSpace " + i30 + "arrangementSpacingPx " + j11 + "weightChildrenCount " + i22 + "fixedSpace " + i23 + "arrangementSpacingTotal " + j15 + str3 + j4 + "totalWeight " + f4 + "weightUnitSpace " + f12 + "itemWeight " + f13 + str + f14).initCause(e5);
                }
            }
            List list3 = list;
            long j16 = j12;
            long j17 = j4;
            i11 = i2;
            String str12 = "arrangementSpacingTotal ";
            long j18 = j11;
            String str13 = "totalWeight ";
            String str14 = "weightUnitSpace ";
            int i32 = i29;
            String str15 = "fixedSpace ";
            int i33 = i23;
            int i34 = 0;
            int i35 = i8;
            int i36 = i9;
            while (i35 < i36) {
                if (abstractC0954OArr[i35] == null) {
                    InterfaceC0944E interfaceC0944E2 = (InterfaceC0944E) list3.get(i35);
                    d0 e6 = e(interfaceC0944E2);
                    int i37 = i22;
                    float f15 = f(e6);
                    if (f15 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    String str16 = str2;
                    int signum = Long.signum(j14);
                    long j19 = j18;
                    j14 -= signum;
                    float f16 = f12 * f15;
                    int max2 = Math.max(0, Math.round(f16) + signum);
                    if (e6 != null) {
                        try {
                            z4 = e6.f9249b;
                        } catch (IllegalArgumentException e7) {
                            e = e7;
                            f7 = f12;
                            f8 = f15;
                            str11 = str13;
                            f9 = f16;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i11 + "targetSpace " + i30 + "arrangementSpacingPx " + j19 + str16 + i37 + str15 + i33 + str12 + j16 + str3 + j17 + str11 + f4 + str14 + f7 + "weight " + f8 + str + f9 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                        }
                    } else {
                        z4 = true;
                    }
                    try {
                        if (z4 && max2 != Integer.MAX_VALUE) {
                            i16 = max2;
                            f7 = f12;
                            f8 = f15;
                            str11 = str13;
                            f9 = f16;
                            AbstractC0954O a4 = interfaceC0944E2.a(c0Var.i(i16, max2, i6, true));
                            int d5 = c0Var.d(a4);
                            int j20 = c0Var.j(a4);
                            iArr2[i35 - i8] = d5;
                            i34 += d5;
                            int max3 = Math.max(i32, j20);
                            abstractC0954OArr[i35] = a4;
                            i32 = max3;
                            f5 = f4;
                            i15 = i33;
                            i14 = i37;
                            str10 = str16;
                            j7 = j16;
                            j5 = j17;
                            str7 = str15;
                            str8 = str12;
                            str9 = str;
                            f6 = f7;
                            String str17 = str3;
                            str6 = str14;
                            j6 = j19;
                            str4 = str11;
                            str5 = str17;
                        }
                        AbstractC0954O a42 = interfaceC0944E2.a(c0Var.i(i16, max2, i6, true));
                        int d52 = c0Var.d(a42);
                        int j202 = c0Var.j(a42);
                        iArr2[i35 - i8] = d52;
                        i34 += d52;
                        int max32 = Math.max(i32, j202);
                        abstractC0954OArr[i35] = a42;
                        i32 = max32;
                        f5 = f4;
                        i15 = i33;
                        i14 = i37;
                        str10 = str16;
                        j7 = j16;
                        j5 = j17;
                        str7 = str15;
                        str8 = str12;
                        str9 = str;
                        f6 = f7;
                        String str172 = str3;
                        str6 = str14;
                        j6 = j19;
                        str4 = str11;
                        str5 = str172;
                    } catch (IllegalArgumentException e8) {
                        e = e8;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i11 + "targetSpace " + i30 + "arrangementSpacingPx " + j19 + str16 + i37 + str15 + i33 + str12 + j16 + str3 + j17 + str11 + f4 + str14 + f7 + "weight " + f8 + str + f9 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                    }
                    f7 = f12;
                    f8 = f15;
                    str11 = str13;
                    i16 = 0;
                    f9 = f16;
                } else {
                    i14 = i22;
                    str4 = str13;
                    str5 = str3;
                    j5 = j17;
                    str6 = str14;
                    j6 = j18;
                    f5 = f4;
                    long j21 = j16;
                    str7 = str15;
                    str8 = str12;
                    str9 = str;
                    f6 = f12;
                    str10 = str2;
                    i15 = i33;
                    j7 = j21;
                }
                i35++;
                list3 = list;
                i22 = i14;
                j17 = j5;
                str15 = str7;
                i36 = i9;
                long j22 = j7;
                i33 = i15;
                f4 = f5;
                str2 = str10;
                f12 = f6;
                str = str9;
                j18 = j6;
                str14 = str6;
                str13 = str4;
                str3 = str5;
                str12 = str8;
                j16 = j22;
            }
            c0Var2 = c0Var;
            int i38 = i33;
            i12 = 0;
            e4 = kotlin.ranges.b.e((int) (i34 + j16), 0, i5 - i38);
            i13 = i38;
            i29 = i32;
        }
        int i39 = e4 + i13;
        if (i39 < 0) {
            i39 = i12;
        }
        int max4 = Math.max(i39, i11);
        int max5 = Math.max(i29, Math.max(i4, i12));
        int[] iArr4 = new int[i28];
        for (int i40 = i12; i40 < i28; i40++) {
            iArr4[i40] = i12;
        }
        c0Var2.c(max4, interfaceC0947H, iArr2, iArr4);
        return c0Var.b(abstractC0954OArr, interfaceC0947H, iArr4, max4, max5, iArr, i10, i8, i9);
    }

    public static final long h(long j4) {
        return u3.d.a(M0.a.k(j4), M0.a.i(j4), M0.a.j(j4), M0.a.h(j4));
    }

    public static final C1015T i(V0.c cVar) {
        return new C1015T(cVar.f4143a, cVar.f4144b, cVar.f4145c, cVar.f4146d);
    }

    public static final void j(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public abstract int b(int i2, M0.k kVar);
}
