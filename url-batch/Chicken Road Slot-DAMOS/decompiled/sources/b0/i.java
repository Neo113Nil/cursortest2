package b0;

import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import n0.s1;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class i {

    /* renamed from: a, reason: collision with root package name */
    public static final e0 f854a = new e0();

    /* renamed from: b, reason: collision with root package name */
    public static final a1.f f855b = new a1.f(9);

    public static final void a(final d1.l lVar, d1.d dVar, final x0.d dVar2, n0.i0 i0Var, final int i3, final int i10) {
        int i11;
        i0Var.X(380139498);
        if ((i3 & 6) == 0) {
            i11 = (i0Var.f(lVar) ? 4 : 2) | i3;
        } else {
            i11 = i3;
        }
        int i12 = i10 & 2;
        if (i12 != 0) {
            i11 |= 48;
        } else if ((i3 & 48) == 0) {
            i11 |= i0Var.f(dVar) ? 32 : 16;
        }
        int i13 = i11 | 384;
        if ((i3 & 3072) == 0) {
            i13 |= i0Var.h(dVar2) ? 2048 : 1024;
        }
        if (i0Var.O(i13 & 1, (i13 & 1171) != 1170)) {
            if (i12 != 0) {
                dVar = d1.a.f3282d;
            }
            a2.g0 d10 = p.d(dVar);
            boolean f3 = i0Var.f(d10) | ((i13 & 7168) == 2048);
            Object L = i0Var.L();
            if (f3 || L == n0.k.f6729a) {
                L = new u(0, d10, dVar2);
                i0Var.g0(L);
            }
            a2.q.b(lVar, (Function2) L, i0Var, i13 & 14);
        } else {
            i0Var.R();
        }
        final d1.d dVar3 = dVar;
        s1 r9 = i0Var.r();
        if (r9 != null) {
            r9.f6812d = new Function2() { // from class: b0.v
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    i.a(d1.l.this, dVar3, dVar2, (n0.i0) obj, n0.h.z(i3 | 1), i10);
                    return Unit.f5554a;
                }
            };
        }
    }

    public static final void b(d1.l lVar, n0.i0 i0Var) {
        o oVar = o.f874c;
        int hashCode = Long.hashCode(i0Var.T);
        d1.l C = z4.w.C(lVar, i0Var);
        x0.h l10 = i0Var.l();
        c2.g.f1541a.getClass();
        c2.z zVar = c2.f.f1533b;
        a1.n nVar = i0Var.f6698a;
        i0Var.Z();
        if (i0Var.S) {
            i0Var.k(zVar);
        } else {
            i0Var.j0();
        }
        n0.h.y(oVar, c2.f.f1536e, i0Var);
        n0.h.y(l10, c2.f.f1535d, i0Var);
        n0.h.t(i0Var, c2.f.g);
        n0.h.y(C, c2.f.f1534c, i0Var);
        n0.h.y(Integer.valueOf(hashCode), c2.f.f1537f, i0Var);
        i0Var.p(true);
    }

    public static d1.l c(d1.l lVar, float f3) {
        return lVar.c(new h(f3));
    }

    public static final d1.l d(d1.l lVar) {
        return lVar.c(new y0());
    }

    public static final boolean e(int i3, int i10, long j) {
        int j3 = x2.a.j(j);
        if (i3 > x2.a.h(j) || j3 > i3) {
            return false;
        }
        return i10 <= x2.a.g(j) && x2.a.i(j) <= i10;
    }

    public static a2.h0 f(p0 p0Var, int i3, int i10, int i11, int i12, int i13, a2.i0 i0Var, List list, a2.o0[] o0VarArr, int i14) {
        int i15;
        float f3;
        int i16;
        int i17;
        int i18;
        List list2 = list;
        long j = i13;
        int[] iArr = new int[i14];
        int i19 = 0;
        int i20 = 0;
        int i21 = 0;
        int i22 = 0;
        int i23 = 0;
        float f10 = 0.0f;
        while (true) {
            if (i20 >= i14) {
                break;
            }
            a2.f0 f0Var = (a2.f0) list2.get(i20);
            long j3 = j;
            Object h10 = f0Var.h();
            q0 q0Var = h10 instanceof q0 ? (q0) h10 : null;
            float f11 = q0Var != null ? q0Var.f884a : 0.0f;
            if (f11 > 0.0f) {
                f10 += f11;
                i21++;
            } else {
                int i24 = i11 - i22;
                a2.o0 o0Var = o0VarArr[i20];
                if (o0Var == null) {
                    if (i11 == Integer.MAX_VALUE) {
                        i17 = i24;
                        i18 = Integer.MAX_VALUE;
                    } else if (i24 < 0) {
                        i17 = i24;
                        i18 = 0;
                    } else {
                        i18 = i24;
                        i17 = i18;
                    }
                    o0Var = f0Var.c(p0Var.d(0, i18, i12, false));
                } else {
                    i17 = i24;
                }
                int c10 = p0Var.c(o0Var);
                int e2 = p0Var.e(o0Var);
                iArr[i20] = c10;
                int i25 = i17 - c10;
                if (i25 < 0) {
                    i25 = 0;
                }
                i23 = Math.min(i13, i25);
                i22 += c10 + i23;
                i19 = Math.max(i19, e2);
                o0VarArr[i20] = o0Var;
            }
            i20++;
            j = j3;
        }
        long j10 = j;
        if (i21 == 0) {
            i22 -= i23;
            i15 = 0;
        } else {
            long j11 = (i21 - 1) * j10;
            long j12 = ((i11 != Integer.MAX_VALUE ? i11 : i3) - i22) - j11;
            if (j12 < 0) {
                j12 = 0;
            }
            float f12 = j12 / f10;
            for (int i26 = 0; i26 < i14; i26++) {
                Object h11 = ((a2.f0) list2.get(i26)).h();
                j12 -= Math.round(((h11 instanceof q0 ? (q0) h11 : null) != null ? r14.f884a : 0.0f) * f12);
            }
            int i27 = 0;
            int i28 = 0;
            while (i28 < i14) {
                if (o0VarArr[i28] == null) {
                    a2.f0 f0Var2 = (a2.f0) list2.get(i28);
                    Object h12 = f0Var2.h();
                    f3 = f12;
                    q0 q0Var2 = h12 instanceof q0 ? (q0) h12 : null;
                    float f13 = q0Var2 != null ? q0Var2.f884a : 0.0f;
                    if (f13 <= 0.0f) {
                        c0.a.b("All weights <= 0 should have placeables");
                    }
                    float f14 = f13;
                    int signum = Long.signum(j12);
                    j12 -= signum;
                    int max = Math.max(0, Math.round(f14 * f3) + signum);
                    if ((q0Var2 != null ? q0Var2.f885b : true) && max != Integer.MAX_VALUE) {
                        i16 = max;
                        a2.o0 c11 = f0Var2.c(p0Var.d(i16, max, i12, true));
                        int c12 = p0Var.c(c11);
                        int e9 = p0Var.e(c11);
                        iArr[i28] = c12;
                        i27 += c12;
                        int max2 = Math.max(i19, e9);
                        o0VarArr[i28] = c11;
                        i19 = max2;
                    }
                    i16 = 0;
                    a2.o0 c112 = f0Var2.c(p0Var.d(i16, max, i12, true));
                    int c122 = p0Var.c(c112);
                    int e92 = p0Var.e(c112);
                    iArr[i28] = c122;
                    i27 += c122;
                    int max22 = Math.max(i19, e92);
                    o0VarArr[i28] = c112;
                    i19 = max22;
                } else {
                    f3 = f12;
                }
                i28++;
                list2 = list;
                f12 = f3;
            }
            i15 = (int) (i27 + j11);
            int i29 = i11 - i22;
            if (i15 < 0) {
                i15 = 0;
            }
            if (i15 > i29) {
                i15 = i29;
            }
        }
        int i30 = i15 + i22;
        if (i30 < 0) {
            i30 = 0;
        }
        int max3 = Math.max(i30, i3);
        int max4 = Math.max(i19, Math.max(i10, 0));
        int[] iArr2 = new int[i14];
        p0Var.f(max3, i0Var, iArr, iArr2);
        return p0Var.b(o0VarArr, i0Var, iArr2, max3, max4);
    }

    public static final d1.l g(d1.l lVar, float f3, float f10) {
        return lVar.c(new k0(f3, f10, new a1.f(5)));
    }

    public static d1.l h(float f3, float f10, int i3, d1.l lVar) {
        if ((i3 & 1) != 0) {
            f3 = 0;
        }
        if ((i3 & 2) != 0) {
            f10 = 0;
        }
        return g(lVar, f3, f10);
    }

    public static final d1.l i(d1.l lVar, float f3, float f10) {
        return lVar.c(new n0(f3, f10, f3, f10, new a1.f(6)));
    }

    public static d1.l j(float f3) {
        return new n0(f3, 0, 0, 0, new a1.f(7));
    }

    public static final h0 k(h3.b bVar) {
        return new h0(bVar.f4443a, bVar.f4444b, bVar.f4445c, bVar.f4446d);
    }
}
