package r;

import I.C0143d;
import I.C0167p;
import I.InterfaceC0164n0;
import java.util.List;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.C0995h;
import t0.C0996i;
import t0.C1001n;
import t0.InterfaceC0997j;

/* renamed from: r.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0856c {

    /* renamed from: a, reason: collision with root package name */
    public static final C0855b f8035a = new C0855b(0);

    /* renamed from: b, reason: collision with root package name */
    public static final C0855b f8036b = new C0855b(1);

    /* renamed from: c, reason: collision with root package name */
    public static final int f8037c = 9;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8038d = 6;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8039e = 10;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8040f = 5;

    /* renamed from: g, reason: collision with root package name */
    public static final int f8041g = 15;

    public static final void a(C0167p c0167p, U.q qVar) {
        C0867n c0867n = C0867n.f8064c;
        int i3 = c0167p.f2864P;
        U.q d3 = U.a.d(c0167p, qVar);
        InterfaceC0164n0 m3 = c0167p.m();
        InterfaceC0997j.f8759c.getClass();
        C1001n c1001n = C0996i.f8754b;
        G1.m mVar = c0167p.f2865a;
        c0167p.U();
        if (c0167p.f2863O) {
            c0167p.l(c1001n);
        } else {
            c0167p.d0();
        }
        C0143d.R(c0167p, C0996i.f8757e, c0867n);
        C0143d.R(c0167p, C0996i.f8756d, m3);
        C0143d.R(c0167p, C0996i.f8755c, d3);
        C0995h c0995h = C0996i.f8758f;
        if (c0167p.f2863O || !f2.j.a(c0167p.G(), Integer.valueOf(i3))) {
            A.k.o(i3, c0167p, i3, c0995h);
        }
        c0167p.p(true);
    }

    public static final C0853O b(InterfaceC0884F interfaceC0884F) {
        Object t3 = interfaceC0884F.t();
        if (t3 instanceof C0853O) {
            return (C0853O) t3;
        }
        return null;
    }

    public static final float c(C0853O c0853o) {
        if (c0853o != null) {
            return c0853o.f7984a;
        }
        return 0.0f;
    }

    public static InterfaceC0886H d(InterfaceC0852N interfaceC0852N, int i3, int i4, int i5, int i6, int i7, InterfaceC0887I interfaceC0887I, List list, AbstractC0893O[] abstractC0893OArr, int i8) {
        int i9;
        int[] iArr;
        String str;
        float f3;
        String str2;
        String str3;
        String str4;
        long j3;
        int i10;
        int i11;
        InterfaceC0852N interfaceC0852N2;
        int i12;
        int i13;
        int y3;
        String str5;
        int i14;
        String str6;
        int i15;
        String str7;
        String str8;
        long j4;
        String str9;
        float f4;
        String str10;
        long j5;
        float f5;
        long j6;
        float f6;
        String str11;
        float f7;
        float f8;
        boolean z3;
        int i16;
        long j7;
        int i17;
        List list2 = list;
        int i18 = i8;
        long j8 = i7;
        int[] iArr2 = new int[i18];
        float f9 = 0.0f;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        while (i19 < i18) {
            InterfaceC0884F interfaceC0884F = (InterfaceC0884F) list2.get(i19);
            float c2 = c(b(interfaceC0884F));
            if (c2 > 0.0f) {
                f9 += c2;
                i20++;
                j7 = j8;
            } else {
                int i24 = i5 - i21;
                AbstractC0893O abstractC0893O = abstractC0893OArr[i19];
                if (abstractC0893O == null) {
                    if (i5 == Integer.MAX_VALUE) {
                        j7 = j8;
                        i17 = Integer.MAX_VALUE;
                    } else {
                        i17 = i24 < 0 ? 0 : i24;
                        j7 = j8;
                    }
                    abstractC0893O = interfaceC0884F.b(interfaceC0852N.j(0, i17, i6, false));
                } else {
                    j7 = j8;
                }
                AbstractC0893O abstractC0893O2 = abstractC0893O;
                int c3 = interfaceC0852N.c(abstractC0893O2);
                int g3 = interfaceC0852N.g(abstractC0893O2);
                iArr2[i19] = c3;
                int i25 = i24 - c3;
                if (i25 < 0) {
                    i25 = 0;
                }
                i22 = Math.min(i7, i25);
                i21 += c3 + i22;
                int max = Math.max(i23, g3);
                abstractC0893OArr[i19] = abstractC0893O2;
                i23 = max;
            }
            i19++;
            list2 = list;
            i18 = i8;
            j8 = j7;
        }
        long j9 = j8;
        int i26 = i23;
        if (i20 == 0) {
            i13 = i21 - i22;
            i10 = i3;
            interfaceC0852N2 = interfaceC0852N;
            i11 = i26;
            iArr = iArr2;
            i12 = 0;
            y3 = 0;
        } else {
            int i27 = i5 != Integer.MAX_VALUE ? i5 : i3;
            long j10 = j9 * (i20 - 1);
            long j11 = (i27 - i21) - j10;
            if (j11 < 0) {
                j11 = 0;
            }
            float f10 = j11 / f9;
            long j12 = j11;
            int i28 = 0;
            while (true) {
                i9 = i26;
                iArr = iArr2;
                str = "weightedSize ";
                f3 = f9;
                str2 = "weightChildrenCount ";
                str3 = "totalWeight ";
                str4 = "arrangementSpacingPx ";
                j3 = j11;
                if (i28 >= i8) {
                    break;
                }
                float c4 = c(b((InterfaceC0884F) list.get(i28)));
                long j13 = j10;
                float f11 = f10 * c4;
                try {
                    j12 -= Math.round(f11);
                    i28++;
                    i26 = i9;
                    iArr2 = iArr;
                    f9 = f3;
                    j11 = j3;
                    j10 = j13;
                } catch (IllegalArgumentException e3) {
                    throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/297974033 mainAxisMax " + i5 + "mainAxisMin " + i3 + "targetSpace " + i27 + "arrangementSpacingPx " + j9 + "weightChildrenCount " + i20 + "fixedSpace " + i21 + "arrangementSpacingTotal " + j13 + "remainingToTarget " + j3 + str3 + f3 + "weightUnitSpace " + f10 + "itemWeight " + c4 + str + f11).initCause(e3);
                }
            }
            i10 = i3;
            long j14 = j10;
            long j15 = j9;
            String str12 = "weightUnitSpace ";
            long j16 = j3;
            String str13 = "remainingToTarget ";
            String str14 = "fixedSpace ";
            int i29 = i21;
            int i30 = 0;
            int i31 = 0;
            List list3 = list;
            int i32 = i8;
            String str15 = "arrangementSpacingTotal ";
            i11 = i9;
            while (i30 < i32) {
                if (abstractC0893OArr[i30] == null) {
                    InterfaceC0884F interfaceC0884F2 = (InterfaceC0884F) list3.get(i30);
                    C0853O b3 = b(interfaceC0884F2);
                    int i33 = i20;
                    float c5 = c(b3);
                    if (c5 <= 0.0f) {
                        throw new IllegalStateException("All weights <= 0 should have placeables");
                    }
                    String str16 = str2;
                    int signum = Long.signum(j12);
                    long j17 = j15;
                    j12 -= signum;
                    float f12 = f10 * c5;
                    int max2 = Math.max(0, Math.round(f12) + signum);
                    if (b3 != null) {
                        try {
                            z3 = b3.f7985b;
                        } catch (IllegalArgumentException e4) {
                            e = e4;
                            f6 = f10;
                            str11 = str4;
                            f7 = c5;
                            str10 = str13;
                            f8 = f12;
                            throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i10 + "targetSpace " + i27 + str11 + j17 + str16 + i33 + str14 + i29 + str15 + j14 + str10 + j16 + str3 + f3 + str12 + f6 + "weight " + f7 + str + f8 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                        }
                    } else {
                        z3 = true;
                    }
                    try {
                        if (z3 && max2 != Integer.MAX_VALUE) {
                            f6 = f10;
                            i16 = max2;
                            str11 = str4;
                            f7 = c5;
                            str10 = str13;
                            f8 = f12;
                            AbstractC0893O b4 = interfaceC0884F2.b(interfaceC0852N.j(i16, max2, i6, true));
                            int c6 = interfaceC0852N.c(b4);
                            int g4 = interfaceC0852N.g(b4);
                            iArr[i30] = c6;
                            i31 += c6;
                            int max3 = Math.max(i11, g4);
                            abstractC0893OArr[i30] = b4;
                            i11 = max3;
                            str6 = str15;
                            i15 = i29;
                            str7 = str14;
                            f5 = f3;
                            i14 = i33;
                            str2 = str16;
                            j5 = j17;
                            j6 = j14;
                            str9 = str12;
                            f4 = f6;
                            str4 = str11;
                            str5 = str;
                            str8 = str3;
                            j4 = j16;
                        }
                        AbstractC0893O b42 = interfaceC0884F2.b(interfaceC0852N.j(i16, max2, i6, true));
                        int c62 = interfaceC0852N.c(b42);
                        int g42 = interfaceC0852N.g(b42);
                        iArr[i30] = c62;
                        i31 += c62;
                        int max32 = Math.max(i11, g42);
                        abstractC0893OArr[i30] = b42;
                        i11 = max32;
                        str6 = str15;
                        i15 = i29;
                        str7 = str14;
                        f5 = f3;
                        i14 = i33;
                        str2 = str16;
                        j5 = j17;
                        j6 = j14;
                        str9 = str12;
                        f4 = f6;
                        str4 = str11;
                        str5 = str;
                        str8 = str3;
                        j4 = j16;
                    } catch (IllegalArgumentException e5) {
                        e = e5;
                        throw new IllegalArgumentException("This log indicates a hard-to-reproduce Compose issue, modified with additional debugging details. Please help us by adding your experiences to the bug link provided. Thank you for helping us improve Compose. https://issuetracker.google.com/issues/300280216 mainAxisMax " + i5 + "mainAxisMin " + i10 + "targetSpace " + i27 + str11 + j17 + str16 + i33 + str14 + i29 + str15 + j14 + str10 + j16 + str3 + f3 + str12 + f6 + "weight " + f7 + str + f8 + "crossAxisDesiredSize nullremainderUnit " + signum + "childMainAxisSize " + max2).initCause(e);
                    }
                    f6 = f10;
                    str11 = str4;
                    f7 = c5;
                    str10 = str13;
                    i16 = 0;
                    f8 = f12;
                } else {
                    str5 = str;
                    i14 = i20;
                    str6 = str15;
                    i15 = i29;
                    str7 = str14;
                    str8 = str3;
                    j4 = j16;
                    str9 = str12;
                    f4 = f10;
                    str10 = str13;
                    j5 = j15;
                    f5 = f3;
                    j6 = j14;
                }
                i30++;
                i20 = i14;
                j14 = j6;
                j16 = j4;
                str = str5;
                str12 = str9;
                str3 = str8;
                str14 = str7;
                list3 = list;
                f3 = f5;
                j15 = j5;
                str13 = str10;
                i29 = i15;
                f10 = f4;
                str15 = str6;
                i32 = i8;
            }
            interfaceC0852N2 = interfaceC0852N;
            int i34 = i29;
            i12 = 0;
            i13 = i34;
            y3 = O2.d.y((int) (i31 + j14), 0, i5 - i34);
        }
        int i35 = y3 + i13;
        if (i35 < 0) {
            i35 = i12;
        }
        int max4 = Math.max(i35, i10);
        int max5 = Math.max(i11, Math.max(i4, i12));
        int[] iArr3 = new int[i8];
        for (int i36 = i12; i36 < i8; i36++) {
            iArr3[i36] = i12;
        }
        interfaceC0852N2.d(max4, interfaceC0887I, iArr, iArr3);
        return interfaceC0852N.i(abstractC0893OArr, interfaceC0887I, iArr3, max4, max5);
    }

    public static final C0844F e(X0.c cVar) {
        return new C0844F(cVar.f4623a, cVar.f4624b, cVar.f4625c, cVar.f4626d);
    }

    public static final void f(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
