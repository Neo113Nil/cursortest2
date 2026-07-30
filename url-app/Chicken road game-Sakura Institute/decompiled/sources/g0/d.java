package g0;

import com.android.installreferrer.api.InstallReferrerClient;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public static final a1 f3700a = new a1("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final a1 f3701b = new a1("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final a1 f3702c = new a1("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final a1 f3703d = new a1("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final a1 f3704e = new a1("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final b2.s f3705f = new b2.s(1);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f3706g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final h0 f3707h = new h0();

    public static final void A(a2 a2Var, t tVar) {
        int i7;
        int i8;
        int i9;
        int i10 = a2Var.f3683t;
        int i11 = a2Var.f3684u;
        while (i10 < i11) {
            Object w4 = a2Var.w(i10);
            if (w4 instanceof j) {
                tVar.h((j) w4, a2Var.o() - a2Var.E(a2Var.f3665b, a2Var.p(i10)), -1, -1);
            }
            int E = a2Var.E(a2Var.f3665b, a2Var.p(i10));
            int i12 = i10 + 1;
            int f9 = a2Var.f(a2Var.f3665b, a2Var.p(i12));
            int i13 = E;
            while (i13 < f9) {
                int i14 = i13 - E;
                Object obj = a2Var.f3666c[a2Var.g(i13)];
                boolean z8 = obj instanceof v1;
                t0 t0Var = l.f3784a;
                if (z8) {
                    v1 v1Var = (v1) obj;
                    u1 u1Var = v1Var.f3952a;
                    if (u1Var instanceof m) {
                        i7 = i11;
                    } else {
                        int g9 = a2Var.g(a2Var.F(i10, i14));
                        Object[] objArr = a2Var.f3666c;
                        i7 = i11;
                        Object obj2 = objArr[g9];
                        objArr[g9] = t0Var;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int o2 = a2Var.o() - i14;
                        c cVar = v1Var.f3953b;
                        if (cVar == null || !cVar.a()) {
                            i8 = -1;
                            i9 = -1;
                        } else {
                            i8 = a2Var.c(cVar);
                            i9 = a2Var.o() - a2Var.f(a2Var.f3665b, a2Var.p(a2Var.q(i8) + i8));
                        }
                        tVar.h(u1Var, o2, i8, i9);
                    }
                } else {
                    i7 = i11;
                    if (obj instanceof p1) {
                        int g10 = a2Var.g(a2Var.F(i10, i14));
                        Object[] objArr2 = a2Var.f3666c;
                        Object obj3 = objArr2[g10];
                        objArr2[g10] = t0Var;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((p1) obj).d();
                    } else {
                        continue;
                    }
                }
                i13++;
                i11 = i7;
            }
            i10 = i12;
        }
    }

    public static final i0.d B() {
        b1.b bVar = g2.f3734b;
        i0.d dVar = (i0.d) bVar.j();
        if (dVar != null) {
            return dVar;
        }
        i0.d dVar2 = new i0.d(new o[0]);
        bVar.y(dVar2);
        return dVar2;
    }

    public static final e0 C(q6.a aVar) {
        b1.b bVar = g2.f3733a;
        return new e0(aVar, null);
    }

    public static final int D(int i7, List list) {
        int size = list.size() - 1;
        int i8 = 0;
        while (i8 <= size) {
            int i9 = (i8 + size) >>> 1;
            int g9 = r6.k.g(((n0) list.get(i9)).f3803b, i7);
            if (g9 < 0) {
                i8 = i9 + 1;
            } else {
                if (g9 <= 0) {
                    return i9;
                }
                size = i9 - 1;
            }
        }
        return -(i8 + 1);
    }

    public static final u0 E(h6.i iVar) {
        u0 u0Var = (u0) iVar.u(t0.f3899g);
        if (u0Var != null) {
            return u0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void F(p pVar, q6.e eVar) {
        r6.k.d(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        r6.y.d(2, eVar);
        eVar.d(pVar, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List G(a2 a2Var, int i7, a2 a2Var2, boolean z8, boolean z9, boolean z10) {
        e6.u uVar;
        boolean z11;
        c I;
        int i8;
        int i9;
        int q8 = a2Var.q(i7);
        int i10 = i7 + q8;
        int f9 = a2Var.f(a2Var.f3665b, a2Var.p(i7));
        int f10 = a2Var.f(a2Var.f3665b, a2Var.p(i10));
        int i11 = f10 - f9;
        boolean z12 = i7 >= 0 && (a2Var.f3665b[(a2Var.p(i7) * 5) + 1] & 201326592) != 0;
        a2Var2.r(q8);
        a2Var2.s(i11, a2Var2.f3683t);
        if (a2Var.f3670g < i10) {
            a2Var.u(i10);
        }
        if (a2Var.f3674k < f10) {
            a2Var.v(f10, i10);
        }
        int[] iArr = a2Var2.f3665b;
        int i12 = a2Var2.f3683t;
        int i13 = i12 * 5;
        e6.k.W(a2Var.f3665b, iArr, i13, i7 * 5, i10 * 5);
        Object[] objArr = a2Var2.f3666c;
        int i14 = a2Var2.f3672i;
        e6.k.X(a2Var.f3666c, objArr, i14, f9, f10);
        int i15 = a2Var2.f3685v;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i7;
        int i17 = i12 + q8;
        int f11 = i14 - a2Var2.f(iArr, i12);
        int i18 = a2Var2.f3676m;
        int i19 = a2Var2.f3675l;
        int length = objArr.length;
        boolean z13 = z12;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int i23 = i16;
            int f12 = a2Var2.f(iArr, i21) + f11;
            if (i20 < i21) {
                i8 = i17;
                i9 = 0;
            } else {
                i8 = i17;
                i9 = a2Var2.f3674k;
            }
            iArr[(i21 * 5) + 4] = a2.h(f12, i9, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i17 = i8;
            i16 = i23;
        }
        int i24 = i16;
        int i25 = i17;
        a2Var2.f3676m = i20;
        int n8 = n(a2Var.f3667d, i7, a2Var.n());
        int n9 = n(a2Var.f3667d, i10, a2Var.n());
        if (n8 < n9) {
            ArrayList arrayList = a2Var.f3667d;
            ArrayList arrayList2 = new ArrayList(n9 - n8);
            for (int i26 = n8; i26 < n9; i26++) {
                c cVar = (c) arrayList.get(i26);
                cVar.f3695a += i24;
                arrayList2.add(cVar);
            }
            a2Var2.f3667d.addAll(n(a2Var2.f3667d, a2Var2.f3683t, a2Var2.n()), arrayList2);
            arrayList.subList(n8, n9).clear();
            uVar = arrayList2;
        } else {
            uVar = e6.u.f2826f;
        }
        if (!uVar.isEmpty()) {
            HashMap hashMap = a2Var.f3668e;
            HashMap hashMap2 = a2Var2.f3668e;
            if (hashMap != null && hashMap2 != null) {
                int size = uVar.size();
                for (int i27 = 0; i27 < size; i27++) {
                }
            }
        }
        int i28 = a2Var2.f3685v;
        HashMap hashMap3 = a2Var2.f3668e;
        if (hashMap3 != null && (I = a2Var2.I(i15)) != null) {
        }
        int x8 = a2Var.x(a2Var.f3665b, i7);
        if (!z10) {
            z11 = false;
        } else if (z8) {
            boolean z14 = x8 >= 0;
            if (z14) {
                a2Var.G();
                a2Var.a(x8 - a2Var.f3683t);
                a2Var.G();
            }
            a2Var.a(i7 - a2Var.f3683t);
            boolean A = a2Var.A();
            if (z14) {
                a2Var.D();
                a2Var.i();
                a2Var.D();
                a2Var.i();
            }
            z11 = A;
        } else {
            boolean B = a2Var.B(i7, q8);
            a2Var.C(f9, i11, i7 - 1);
            z11 = B;
        }
        if (z11) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        a2Var2.f3678o += m(iArr, i12) ? 1 : o(iArr, i12);
        if (z9) {
            a2Var2.f3683t = i25;
            a2Var2.f3672i = i14 + i11;
        }
        if (z13) {
            a2Var2.K(i15);
        }
        return uVar;
    }

    public static final c1 H(float f9) {
        int i7 = b.f3689b;
        return new c1(f9);
    }

    public static final d1 I(int i7) {
        int i8 = b.f3689b;
        return new d1(i7);
    }

    public static final g1 J(Object obj, f2 f2Var) {
        int i7 = b.f3689b;
        return new g1(obj, f2Var);
    }

    public static final Object K(k1 k1Var, m1 m1Var) {
        r6.k.d(m1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        o0.d dVar = (o0.d) k1Var;
        Object obj = dVar.get(m1Var);
        if (obj == null) {
            obj = m1Var.b();
        }
        return ((p2) obj).a(dVar);
    }

    public static final n L(p pVar) {
        p pVar2;
        pVar.O(206, f3704e);
        if (pVar.O) {
            a2 a2Var = pVar.H;
            int i7 = a2Var.f3685v;
            int p6 = a2Var.p(i7);
            int[] iArr = a2Var.f3665b;
            int i8 = (p6 * 5) + 1;
            int i9 = iArr[i8];
            if ((i9 & 134217728) == 0) {
                iArr[i8] = i9 | 134217728;
                if (!h(iArr, p6)) {
                    a2Var.K(a2Var.x(a2Var.f3665b, i7));
                }
            }
        }
        Object z8 = pVar.z();
        m mVar = z8 instanceof m ? (m) z8 : null;
        if (mVar == null) {
            pVar2 = pVar;
            mVar = new m(new n(pVar2, pVar.P, pVar.f3835p, pVar.B, pVar.f3826g.f3943u));
            pVar2.b0(mVar);
        } else {
            pVar2 = pVar;
        }
        n nVar = mVar.f3791f;
        nVar.f3800f.setValue(pVar2.m());
        pVar2.p(false);
        return nVar;
    }

    public static final z0 M(Object obj, p pVar) {
        Object G = pVar.G();
        if (G == l.f3784a) {
            G = J(obj, t0.f3903k);
            pVar.a0(G);
        }
        z0 z0Var = (z0) G;
        z0Var.setValue(obj);
        return z0Var;
    }

    public static final void N(a2 a2Var, t tVar) {
        int i7;
        int[] iArr = a2Var.f3665b;
        int i8 = a2Var.f3683t;
        int f9 = a2Var.f(iArr, a2Var.p(a2Var.q(i8) + i8));
        for (int f10 = a2Var.f(a2Var.f3665b, a2Var.p(a2Var.f3683t)); f10 < f9; f10++) {
            Object obj = a2Var.f3666c[a2Var.g(f10)];
            int i9 = -1;
            if (obj instanceof j) {
                int o2 = a2Var.o() - f10;
                j jVar = (j) obj;
                i.b0 b0Var = (i.b0) tVar.f3896g;
                if (b0Var == null) {
                    int i10 = i.f0.f4740a;
                    b0Var = new i.b0();
                    tVar.f3896g = b0Var;
                }
                b0Var.f4722b[b0Var.d(jVar)] = jVar;
                tVar.h(jVar, o2, -1, -1);
            }
            if (obj instanceof v1) {
                int o6 = a2Var.o() - f10;
                v1 v1Var = (v1) obj;
                c cVar = v1Var.f3953b;
                if (cVar == null || !cVar.a()) {
                    i7 = -1;
                } else {
                    i9 = a2Var.c(cVar);
                    i7 = a2Var.o() - a2Var.f(a2Var.f3665b, a2Var.p(a2Var.q(i9) + i9));
                }
                tVar.h(v1Var.f3952a, o6, i9, i7);
            }
            if (obj instanceof p1) {
                ((p1) obj).d();
            }
        }
        a2Var.A();
    }

    public static final void O(boolean z8) {
        if (z8) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int P(ArrayList arrayList, int i7, int i8) {
        int size = arrayList.size() - 1;
        int i9 = 0;
        while (i9 <= size) {
            int i10 = (i9 + size) >>> 1;
            int i11 = ((c) arrayList.get(i10)).f3695a;
            if (i11 < 0) {
                i11 += i8;
            }
            int g9 = r6.k.g(i11, i7);
            if (g9 < 0) {
                i9 = i10 + 1;
            } else {
                if (g9 <= 0) {
                    return i10;
                }
                size = i10 - 1;
            }
        }
        return -(i9 + 1);
    }

    public static final void Q(p pVar, Object obj, q6.e eVar) {
        if (pVar.O || !r6.k.a(pVar.G(), obj)) {
            pVar.a0(obj);
            pVar.b(obj, eVar);
        }
    }

    public static final void R(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void S(String str) {
        throw new IllegalStateException(str);
    }

    public static final int T(int i7) {
        int i8 = 306783378 & i7;
        int i9 = 613566756 & i7;
        return (i7 & (-920350135)) | (i9 >> 1) | i8 | ((i8 << 1) & i9);
    }

    public static final o0.d U(n1[] n1VarArr, k1 k1Var, k1 k1Var2) {
        o0.c cVar = new o0.c(o0.d.f6822i);
        for (n1 n1Var : n1VarArr) {
            m1 m1Var = n1Var.f3805a;
            if (n1Var.f3810f || !((o0.d) k1Var).containsKey(m1Var)) {
                cVar.put(m1Var, m1Var.c(n1Var, (p2) ((o0.d) k1Var2).get(m1Var)));
            }
        }
        return cVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0049, code lost:
    
        if (r2 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(n1 n1Var, q6.e eVar, p pVar, int i7) {
        p2 p2Var;
        k1 dVar;
        boolean z8;
        k1 k1Var;
        p1 r8;
        k1 k1Var2;
        k1 dVar2;
        pVar.S(-1350970552);
        m0 m0Var = pVar.f3842w;
        k1 m8 = pVar.m();
        pVar.O(201, f3701b);
        Object G = pVar.G();
        if (r6.k.a(G, l.f3784a)) {
            p2Var = null;
        } else {
            r6.k.d(G, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            p2Var = (p2) G;
        }
        m1 m1Var = n1Var.f3805a;
        Object c4 = m1Var.c(n1Var, p2Var);
        boolean equals = c4.equals(p2Var);
        if (!equals) {
            pVar.a0(c4);
        }
        if (pVar.O) {
            if (!n1Var.f3810f) {
                boolean containsKey = ((o0.d) m8).containsKey(m1Var);
                dVar2 = m8;
            }
            o0.d dVar3 = (o0.d) m8;
            l.i u8 = dVar3.f5747f.u(m1Var.hashCode(), 0, m1Var, c4);
            dVar2 = dVar3;
            if (u8 != null) {
                dVar2 = new o0.d((l0.k) u8.f5526c, dVar3.f5748g + u8.f5525b);
            }
            pVar.I = true;
            k1Var2 = dVar2;
        } else {
            x1 x1Var = pVar.F;
            Object b9 = x1Var.b(x1Var.f3959b, x1Var.f3964g);
            r6.k.d(b9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            k1 k1Var3 = (k1) b9;
            if (!(pVar.x() && equals) && (n1Var.f3810f || !((o0.d) m8).containsKey(m1Var))) {
                o0.d dVar4 = (o0.d) m8;
                l.i u9 = dVar4.f5747f.u(m1Var.hashCode(), 0, m1Var, c4);
                dVar = dVar4;
                if (u9 != null) {
                    dVar = new o0.d((l0.k) u9.f5526c, dVar4.f5748g + u9.f5525b);
                }
            } else {
                dVar = k1Var3;
            }
            k1Var2 = dVar;
            if (pVar.f3843x || k1Var3 != dVar) {
                z8 = true;
                k1Var = dVar;
                if (z8 && !pVar.O) {
                    pVar.E(k1Var);
                }
                m0Var.b(pVar.f3841v ? 1 : 0);
                pVar.f3841v = z8;
                pVar.J = k1Var;
                pVar.M(202, 0, f3702c, k1Var);
                eVar.d(pVar, Integer.valueOf((i7 >> 3) & 14));
                pVar.p(false);
                pVar.p(false);
                pVar.f3841v = m0Var.a() != 0;
                pVar.J = null;
                r8 = pVar.r();
                if (r8 == null) {
                    r8.f3853d = new v(i7, 1, n1Var, eVar);
                    return;
                }
                return;
            }
        }
        z8 = false;
        k1Var = k1Var2;
        if (z8) {
            pVar.E(k1Var);
        }
        m0Var.b(pVar.f3841v ? 1 : 0);
        pVar.f3841v = z8;
        pVar.J = k1Var;
        pVar.M(202, 0, f3702c, k1Var);
        eVar.d(pVar, Integer.valueOf((i7 >> 3) & 14));
        pVar.p(false);
        pVar.p(false);
        pVar.f3841v = m0Var.a() != 0;
        pVar.J = null;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [g0.k1, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(n1[] n1VarArr, q6.e eVar, p pVar, int i7) {
        o0.d Z;
        boolean z8;
        p1 r8;
        pVar.S(-1390796515);
        m0 m0Var = pVar.f3842w;
        k1 m8 = pVar.m();
        pVar.O(201, f3701b);
        if (pVar.O) {
            Z = pVar.Z(m8, U(n1VarArr, m8, o0.d.f6822i));
            pVar.I = true;
        } else {
            x1 x1Var = pVar.F;
            Object g9 = x1Var.g(x1Var.f3964g, 0);
            r6.k.d(g9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r22 = (k1) g9;
            x1 x1Var2 = pVar.F;
            Object g10 = x1Var2.g(x1Var2.f3964g, 1);
            r6.k.d(g10, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            k1 k1Var = (k1) g10;
            o0.d U = U(n1VarArr, m8, k1Var);
            if (pVar.x() && !pVar.f3843x && k1Var.equals(U)) {
                pVar.f3830k = pVar.F.l() + pVar.f3830k;
                Z = r22;
            } else {
                Z = pVar.Z(m8, U);
                if (pVar.f3843x || !r6.k.a(Z, r22)) {
                    z8 = true;
                    if (z8 && !pVar.O) {
                        pVar.E(Z);
                    }
                    m0Var.b(pVar.f3841v ? 1 : 0);
                    pVar.f3841v = z8;
                    pVar.J = Z;
                    pVar.M(202, 0, f3702c, Z);
                    eVar.d(pVar, Integer.valueOf((i7 >> 3) & 14));
                    pVar.p(false);
                    pVar.p(false);
                    pVar.f3841v = m0Var.a() != 0;
                    pVar.J = null;
                    r8 = pVar.r();
                    if (r8 == null) {
                        r8.f3853d = new v(i7, 0, n1VarArr, eVar);
                        return;
                    }
                    return;
                }
            }
        }
        z8 = false;
        if (z8) {
            pVar.E(Z);
        }
        m0Var.b(pVar.f3841v ? 1 : 0);
        pVar.f3841v = z8;
        pVar.J = Z;
        pVar.M(202, 0, f3702c, Z);
        eVar.d(pVar, Integer.valueOf((i7 >> 3) & 14));
        pVar.p(false);
        pVar.p(false);
        pVar.f3841v = m0Var.a() != 0;
        pVar.J = null;
        r8 = pVar.r();
        if (r8 == null) {
        }
    }

    public static final void c(Object obj, Object obj2, q6.c cVar, p pVar) {
        boolean f9 = pVar.f(obj) | pVar.f(obj2);
        Object G = pVar.G();
        if (f9 || G == l.f3784a) {
            G = new f0(cVar);
            pVar.a0(G);
        }
    }

    public static final void d(Object obj, q6.c cVar, p pVar) {
        boolean f9 = pVar.f(obj);
        Object G = pVar.G();
        if (f9 || G == l.f3784a) {
            G = new f0(cVar);
            pVar.a0(G);
        }
    }

    public static final void e(p pVar, Object obj, q6.e eVar) {
        h6.i h3 = pVar.f3821b.h();
        boolean f9 = pVar.f(obj);
        Object G = pVar.G();
        if (f9 || G == l.f3784a) {
            G = new q0(h3, eVar);
            pVar.a0(G);
        }
    }

    public static final void f(Object obj, Object obj2, q6.e eVar, p pVar) {
        h6.i h3 = pVar.f3821b.h();
        boolean f9 = pVar.f(obj) | pVar.f(obj2);
        Object G = pVar.G();
        if (f9 || G == l.f3784a) {
            G = new q0(h3, eVar);
            pVar.a0(G);
        }
    }

    public static final void g(q6.a aVar, p pVar) {
        h0.d0 d0Var = pVar.L.f4590b.f4587g;
        h0.v vVar = h0.v.f4636c;
        int i7 = vVar.f4605b;
        d0Var.a0(vVar);
        j1.c.l0(d0Var, 0, aVar);
        int i8 = d0Var.f4613m;
        int i9 = vVar.f4604a;
        if (i8 == h0.d0.T(d0Var, i9) && d0Var.f4614n == h0.d0.T(d0Var, i7)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        for (int i11 = 0; i11 < i9; i11++) {
            if (((1 << i11) & d0Var.f4613m) != 0) {
                if (i10 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i11));
                i10++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder o2 = a0.m.o(sb2, "StringBuilder().apply(builderAction).toString()");
        int i12 = 0;
        for (int i13 = 0; i13 < i7; i13++) {
            if (((1 << i13) & d0Var.f4614n) != 0) {
                if (i10 > 0) {
                    o2.append(", ");
                }
                o2.append(vVar.c(i13));
                i12++;
            }
        }
        String sb3 = o2.toString();
        r6.k.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        a0.m.t(sb4, i10, " int arguments (", sb2, ") and ");
        a0.m.u(sb4, i12, " object arguments (", sb3, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 4];
    }

    public static final int j(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i7) {
        return (iArr[(i7 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i7, int i8) {
        int P = P(arrayList, i7, i8);
        return P >= 0 ? P : -(P + 1);
    }

    public static final int o(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i7) {
        return iArr[(i7 * 5) + 2];
    }

    public static final void q(List list, int i7, int i8) {
        int D = D(i7, list);
        if (D < 0) {
            D = -(D + 1);
        }
        while (D < list.size() && ((n0) list.get(D)).f3803b < i8) {
            list.remove(D);
        }
    }

    public static final int r(int[] iArr, int i7) {
        int i8 = i7 * 5;
        int i9 = iArr[i8 + 4];
        int i10 = 1;
        switch (iArr[i8 + 1] >> 28) {
            case InstallReferrerClient.InstallReferrerResponse.OK /* 0 */:
                i10 = 0;
                break;
            case 1:
            case 2:
            case 4:
                break;
            case 3:
            case 5:
            case 6:
                i10 = 2;
                break;
            default:
                i10 = 3;
                break;
        }
        return i10 + i9;
    }

    public static final void s(int[] iArr, int i7, int i8) {
        O(i8 >= 0);
        iArr[(i7 * 5) + 3] = i8;
    }

    public static final void t(int[] iArr, int i7, int i8) {
        O(i8 >= 0 && i8 < 67108863);
        int i9 = (i7 * 5) + 1;
        iArr[i9] = i8 | (iArr[i9] & (-67108864));
    }

    public static final z0 u(f7.b0 b0Var, Object obj, h6.i iVar, p pVar, int i7, int i8) {
        if ((i8 & 2) != 0) {
            iVar = h6.j.f4661f;
        }
        boolean h3 = pVar.h(iVar) | pVar.h(b0Var);
        Object G = pVar.G();
        h6.d dVar = null;
        Object obj2 = l.f3784a;
        if (h3 || G == obj2) {
            G = new a0.a0(iVar, b0Var, dVar, 7);
            pVar.a0(G);
        }
        q6.e eVar = (q6.e) G;
        Object G2 = pVar.G();
        if (G2 == obj2) {
            G2 = J(obj, t0.f3903k);
            pVar.a0(G2);
        }
        z0 z0Var = (z0) G2;
        boolean h8 = pVar.h(eVar);
        Object G3 = pVar.G();
        if (h8 || G3 == obj2) {
            G3 = new h2(eVar, z0Var, dVar, 1);
            pVar.a0(G3);
        }
        f(b0Var, iVar, (q6.e) G3, pVar);
        return z0Var;
    }

    public static final z0 v(f7.o0 o0Var, p pVar) {
        return u(o0Var, o0Var.getValue(), h6.j.f4661f, pVar, 0, 0);
    }

    public static final void w(String str) {
        throw new k(a0.m.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void x(String str) {
        throw new k(a0.m.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final h7.c y(p pVar) {
        c7.u uVar = c7.u.f1748g;
        h6.i h3 = pVar.f3821b.h();
        return c7.a0.a(h3.z(new c7.z0((c7.x0) h3.u(uVar))).z(h6.j.f4661f));
    }

    public static final long z() {
        return Thread.currentThread().getId();
    }
}
