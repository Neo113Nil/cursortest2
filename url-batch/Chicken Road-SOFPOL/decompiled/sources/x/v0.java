package x;

import java.util.List;
import m0.o1;
import w1.y1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final v1.g f8303a = new v1.g(new t0(0));

    /* renamed from: b, reason: collision with root package name */
    public static final int f8304b = 9;

    /* renamed from: c, reason: collision with root package name */
    public static final int f8305c = 6;

    /* renamed from: d, reason: collision with root package name */
    public static final int f8306d = 10;

    /* renamed from: e, reason: collision with root package name */
    public static final int f8307e = 5;

    /* renamed from: f, reason: collision with root package name */
    public static final int f8308f = 15;

    public static final void a(m0.s sVar, y0.m mVar) {
        j jVar = j.f8227c;
        int hashCode = Long.hashCode(sVar.T);
        y0.m a02 = r2.o.a0(sVar, mVar);
        o1 l3 = sVar.l();
        w1.i.f7684c.getClass();
        w1.y yVar = w1.h.f7675b;
        y1 y1Var = sVar.f5073a;
        sVar.Y();
        if (sVar.S) {
            sVar.k(yVar);
        } else {
            sVar.i0();
        }
        m0.b.u(jVar, sVar, w1.h.f7678e);
        m0.b.u(l3, sVar, w1.h.f7677d);
        m0.b.u(a02, sVar, w1.h.f7676c);
        w1.g gVar = w1.h.f7679f;
        if (sVar.S || !q6.i.a(sVar.K(), Integer.valueOf(hashCode))) {
            a0.q.n(hashCode, sVar, hashCode, gVar);
        }
        sVar.p(true);
    }

    public static u1.f0 b(i0 i0Var, int i, int i8, int i9, int i10, int i11, w1.n0 n0Var, List list, u1.l0[] l0VarArr, int i12) {
        int i13;
        float f6;
        int i14;
        int i15;
        int i16;
        List list2 = list;
        long j7 = i11;
        int[] iArr = new int[i12];
        int i17 = 0;
        int i18 = 0;
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        float f8 = 0.0f;
        while (true) {
            if (i18 >= i12) {
                break;
            }
            u1.d0 d0Var = (u1.d0) list2.get(i18);
            long j8 = j7;
            Object g3 = d0Var.g();
            j0 j0Var = g3 instanceof j0 ? (j0) g3 : null;
            float f9 = j0Var != null ? j0Var.f8229a : 0.0f;
            if (f9 > 0.0f) {
                f8 += f9;
                i19++;
            } else {
                int i22 = i9 - i20;
                u1.l0 l0Var = l0VarArr[i18];
                if (l0Var == null) {
                    if (i9 == Integer.MAX_VALUE) {
                        i15 = i22;
                        i16 = Integer.MAX_VALUE;
                    } else if (i22 < 0) {
                        i15 = i22;
                        i16 = 0;
                    } else {
                        i16 = i22;
                        i15 = i16;
                    }
                    l0Var = d0Var.e(i0Var.d(0, i16, i10, false));
                } else {
                    i15 = i22;
                }
                int a8 = i0Var.a(l0Var);
                int c8 = i0Var.c(l0Var);
                iArr[i18] = a8;
                int i23 = i15 - a8;
                if (i23 < 0) {
                    i23 = 0;
                }
                i21 = Math.min(i11, i23);
                i20 += a8 + i21;
                i17 = Math.max(i17, c8);
                l0VarArr[i18] = l0Var;
            }
            i18++;
            j7 = j8;
        }
        long j9 = j7;
        if (i19 == 0) {
            i20 -= i21;
            i13 = 0;
        } else {
            long j10 = (i19 - 1) * j9;
            long j11 = ((i9 != Integer.MAX_VALUE ? i9 : i) - i20) - j10;
            if (j11 < 0) {
                j11 = 0;
            }
            float f10 = j11 / f8;
            for (int i24 = 0; i24 < i12; i24++) {
                Object g7 = ((u1.d0) list2.get(i24)).g();
                j11 -= Math.round(((g7 instanceof j0 ? (j0) g7 : null) != null ? r14.f8229a : 0.0f) * f10);
            }
            int i25 = 0;
            int i26 = 0;
            while (i26 < i12) {
                if (l0VarArr[i26] == null) {
                    u1.d0 d0Var2 = (u1.d0) list2.get(i26);
                    Object g8 = d0Var2.g();
                    f6 = f10;
                    j0 j0Var2 = g8 instanceof j0 ? (j0) g8 : null;
                    float f11 = j0Var2 != null ? j0Var2.f8229a : 0.0f;
                    if (f11 <= 0.0f) {
                        y.a.b("All weights <= 0 should have placeables");
                    }
                    float f12 = f11;
                    int signum = Long.signum(j11);
                    j11 -= signum;
                    int max = Math.max(0, Math.round(f12 * f6) + signum);
                    if ((j0Var2 != null ? j0Var2.f8230b : true) && max != Integer.MAX_VALUE) {
                        i14 = max;
                        u1.l0 e8 = d0Var2.e(i0Var.d(i14, max, i10, true));
                        int a9 = i0Var.a(e8);
                        int c9 = i0Var.c(e8);
                        iArr[i26] = a9;
                        i25 += a9;
                        int max2 = Math.max(i17, c9);
                        l0VarArr[i26] = e8;
                        i17 = max2;
                    }
                    i14 = 0;
                    u1.l0 e82 = d0Var2.e(i0Var.d(i14, max, i10, true));
                    int a92 = i0Var.a(e82);
                    int c92 = i0Var.c(e82);
                    iArr[i26] = a92;
                    i25 += a92;
                    int max22 = Math.max(i17, c92);
                    l0VarArr[i26] = e82;
                    i17 = max22;
                } else {
                    f6 = f10;
                }
                i26++;
                list2 = list;
                f10 = f6;
            }
            i13 = (int) (i25 + j10);
            int i27 = i9 - i20;
            if (i13 < 0) {
                i13 = 0;
            }
            if (i13 > i27) {
                i13 = i27;
            }
        }
        int i28 = i13 + i20;
        if (i28 < 0) {
            i28 = 0;
        }
        int max3 = Math.max(i28, i);
        int max4 = Math.max(i17, Math.max(i8, 0));
        int[] iArr2 = new int[i12];
        i0Var.b(max3, iArr, iArr2, n0Var);
        return i0Var.f(l0VarArr, n0Var, iArr2, max3, max4);
    }

    public static final b0 c(i3.c cVar) {
        return new b0(cVar.f3421a, cVar.f3422b, cVar.f3423c, cVar.f3424d);
    }

    public static final void d(StringBuilder sb, String str) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }
}
