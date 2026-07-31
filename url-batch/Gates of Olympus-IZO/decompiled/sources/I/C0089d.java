package I;

import D1.C0014b;
import H2.AbstractC0080b;
import J.C0134a;
import h1.C0438i;
import j.AbstractC0479E;
import j.C0475A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import k2.AbstractC0552y;
import k2.C0547t;
import n2.C0676A;
import n2.InterfaceC0678C;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0089d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0090d0 f2238a = new C0090d0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0090d0 f2239b = new C0090d0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0090d0 f2240c = new C0090d0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0090d0 f2241d = new C0090d0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0090d0 f2242e = new C0090d0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final C0.q f2243f = new C0.q(1);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2244g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final J f2245h = new J();

    public static final long A() {
        return Thread.currentThread().getId();
    }

    public static final void B(I0 i02, C0120t c0120t) {
        int i3;
        int i4;
        int i5;
        int i6 = i02.f2151t;
        int i7 = i02.f2152u;
        while (i6 < i7) {
            Object w3 = i02.w(i6);
            if (w3 instanceof InterfaceC0101j) {
                c0120t.h((InterfaceC0101j) w3, i02.o() - i02.E(i02.f2134b, i02.p(i6)), -1, -1);
            }
            int E3 = i02.E(i02.f2134b, i02.p(i6));
            int i8 = i6 + 1;
            int f3 = i02.f(i02.f2134b, i02.p(i8));
            int i9 = E3;
            while (i9 < f3) {
                int i10 = i9 - E3;
                Object obj = i02.f2135c[i02.g(i9)];
                boolean z3 = obj instanceof C0;
                X x3 = C0105l.f2272a;
                if (z3) {
                    C0 c02 = (C0) obj;
                    B0 b02 = c02.f2083a;
                    if (b02 instanceof C0107m) {
                        i3 = i7;
                    } else {
                        int g3 = i02.g(i02.F(i6, i10));
                        Object[] objArr = i02.f2135c;
                        i3 = i7;
                        Object obj2 = objArr[g3];
                        objArr[g3] = x3;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int o3 = i02.o() - i10;
                        C0087c c0087c = c02.f2084b;
                        if (c0087c == null || !c0087c.a()) {
                            i4 = -1;
                            i5 = -1;
                        } else {
                            i4 = i02.c(c0087c);
                            i5 = i02.o() - i02.f(i02.f2134b, i02.p(i02.q(i4) + i4));
                        }
                        c0120t.h(b02, o3, i4, i5);
                    }
                } else {
                    i3 = i7;
                    if (obj instanceof C0119s0) {
                        int g4 = i02.g(i02.F(i6, i10));
                        Object[] objArr2 = i02.f2135c;
                        Object obj3 = objArr2[g4];
                        objArr2[g4] = x3;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((C0119s0) obj).d();
                    } else {
                        continue;
                    }
                }
                i9++;
                i7 = i3;
            }
            i6 = i8;
        }
    }

    public static final K.d C() {
        C0014b c0014b = O0.f2173b;
        K.d dVar = (K.d) c0014b.g();
        if (dVar != null) {
            return dVar;
        }
        K.d dVar2 = new K.d(new C0111o[0]);
        c0014b.t(dVar2);
        return dVar2;
    }

    public static final G D(Y1.a aVar) {
        C0014b c0014b = O0.f2172a;
        return new G(aVar, null);
    }

    public static final int E(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int g3 = Z1.i.g(((P) arrayList.get(i5)).f2175b, i3);
            if (g3 < 0) {
                i4 = i5 + 1;
            } else {
                if (g3 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final Y F(P1.i iVar) {
        Y y3 = (Y) iVar.k(X.f2224e);
        if (y3 != null) {
            return y3;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void G(C0113p c0113p, Y1.e eVar) {
        Z1.i.d(eVar, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        Z1.w.d(2, eVar);
        eVar.g(c0113p, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(I0 i02, int i3, I0 i03, boolean z3, boolean z4, boolean z5) {
        M1.u uVar;
        boolean B;
        int i4;
        int i5;
        int i6;
        int q2 = i02.q(i3);
        int i7 = i3 + q2;
        int f3 = i02.f(i02.f2134b, i02.p(i3));
        int f4 = i02.f(i02.f2134b, i02.p(i7));
        int i8 = f4 - f3;
        boolean z6 = i3 >= 0 && (i02.f2134b[(i02.p(i3) * 5) + 1] & 201326592) != 0;
        i03.r(q2);
        i03.s(i8, i03.f2151t);
        if (i02.f2139g < i7) {
            i02.u(i7);
        }
        if (i02.f2143k < f4) {
            i02.v(f4, i7);
        }
        int[] iArr = i03.f2134b;
        int i9 = i03.f2151t;
        int i10 = i9 * 5;
        M1.k.W(i02.f2134b, iArr, i10, i3 * 5, i7 * 5);
        Object[] objArr = i03.f2135c;
        int i11 = i03.f2141i;
        M1.k.X(i02.f2135c, objArr, i11, f3, f4);
        int i12 = i03.f2153v;
        iArr[i10 + 2] = i12;
        int i13 = i9 - i3;
        int i14 = i9 + q2;
        int f5 = i11 - i03.f(iArr, i9);
        int i15 = i03.f2145m;
        int i16 = i03.f2144l;
        int length = objArr.length;
        boolean z7 = z6;
        int i17 = i15;
        int i18 = i9;
        while (i18 < i14) {
            if (i18 != i9) {
                int i19 = (i18 * 5) + 2;
                iArr[i19] = iArr[i19] + i13;
            }
            int i20 = i14;
            int f6 = i03.f(iArr, i18) + f5;
            if (i17 < i18) {
                i5 = i9;
                i6 = 0;
            } else {
                i5 = i9;
                i6 = i03.f2143k;
            }
            iArr[(i18 * 5) + 4] = I0.h(f6, i6, i16, length);
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i9 = i5;
            i14 = i20;
        }
        int i21 = i9;
        int i22 = i14;
        i03.f2145m = i17;
        int n3 = n(i02.f2136d, i3, i02.n());
        int n4 = n(i02.f2136d, i7, i02.n());
        if (n3 < n4) {
            ArrayList arrayList = i02.f2136d;
            ArrayList arrayList2 = new ArrayList(n4 - n3);
            for (int i23 = n3; i23 < n4; i23++) {
                C0087c c0087c = (C0087c) arrayList.get(i23);
                c0087c.f2237a += i13;
                arrayList2.add(c0087c);
            }
            i03.f2136d.addAll(n(i03.f2136d, i03.f2151t, i03.n()), arrayList2);
            arrayList.subList(n3, n4).clear();
            uVar = arrayList2;
        } else {
            uVar = M1.u.f2803d;
        }
        if (!uVar.isEmpty()) {
            HashMap hashMap = i02.f2137e;
            HashMap hashMap2 = i03.f2137e;
            if (hashMap != null && hashMap2 != null) {
                int size = uVar.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = i03.f2153v;
        i03.G(i12);
        int x3 = i02.x(i02.f2134b, i3);
        if (!z5) {
            i4 = 1;
            B = false;
        } else if (z3) {
            boolean z8 = x3 >= 0;
            if (z8) {
                i02.H();
                i02.a(x3 - i02.f2151t);
                i02.H();
            }
            i02.a(i3 - i02.f2151t);
            boolean A3 = i02.A();
            if (z8) {
                i02.D();
                i02.i();
                i02.D();
                i02.i();
            }
            B = A3;
            i4 = 1;
        } else {
            B = i02.B(i3, q2);
            i4 = 1;
            i02.C(f3, i8, i3 - 1);
        }
        if (B) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        i03.f2147o += m(iArr, i21) ? i4 : o(iArr, i21);
        if (z4) {
            i03.f2151t = i22;
            i03.f2141i = i11 + i8;
        }
        if (z7) {
            i03.L(i12);
        }
        return uVar;
    }

    public static final C0096g0 I(int i3) {
        int i4 = AbstractC0085b.f2235b;
        return new C0096g0(i3);
    }

    public static final C0102j0 J(Object obj, N0 n02) {
        int i3 = AbstractC0085b.f2235b;
        return new C0102j0(obj, n02);
    }

    public static final Object K(InterfaceC0110n0 interfaceC0110n0, AbstractC0114p0 abstractC0114p0) {
        Z1.i.d(abstractC0114p0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Q.d dVar = (Q.d) interfaceC0110n0;
        Object obj = dVar.get(abstractC0114p0);
        if (obj == null) {
            obj = abstractC0114p0.b();
        }
        return ((a1) obj).a(dVar);
    }

    public static final C0109n L(C0113p c0113p) {
        c0113p.O(206, f2242e);
        if (c0113p.f2305O) {
            I0 i02 = c0113p.f2298H;
            int i3 = i02.f2153v;
            int p = i02.p(i3);
            int[] iArr = i02.f2134b;
            int i4 = (p * 5) + 1;
            int i5 = iArr[i4];
            if ((i5 & 134217728) == 0) {
                iArr[i4] = i5 | 134217728;
                if (!h(iArr, p)) {
                    i02.L(i02.x(i02.f2134b, i3));
                }
            }
        }
        Object z3 = c0113p.z();
        C0107m c0107m = z3 instanceof C0107m ? (C0107m) z3 : null;
        if (c0107m == null) {
            c0107m = new C0107m(new C0109n(c0113p, c0113p.f2306P, c0113p.p, c0113p.B, c0113p.f2313g.f2381s));
            c0113p.b0(c0107m);
        }
        InterfaceC0110n0 m3 = c0113p.m();
        C0109n c0109n = c0107m.f2276d;
        c0109n.f2288f.setValue(m3);
        c0113p.p(false);
        return c0109n;
    }

    public static final InterfaceC0088c0 M(Object obj, C0113p c0113p) {
        Object G3 = c0113p.G();
        if (G3 == C0105l.f2272a) {
            G3 = J(obj, X.f2228i);
            c0113p.a0(G3);
        }
        InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G3;
        interfaceC0088c0.setValue(obj);
        return interfaceC0088c0;
    }

    public static final void N(I0 i02, C0120t c0120t) {
        int i3;
        int[] iArr = i02.f2134b;
        int i4 = i02.f2151t;
        int f3 = i02.f(iArr, i02.p(i02.q(i4) + i4));
        for (int f4 = i02.f(i02.f2134b, i02.p(i02.f2151t)); f4 < f3; f4++) {
            Object obj = i02.f2135c[i02.g(f4)];
            int i5 = -1;
            if (obj instanceof InterfaceC0101j) {
                int o3 = i02.o() - f4;
                InterfaceC0101j interfaceC0101j = (InterfaceC0101j) obj;
                C0475A c0475a = (C0475A) c0120t.f2357g;
                if (c0475a == null) {
                    int i6 = AbstractC0479E.f5137a;
                    c0475a = new C0475A();
                    c0120t.f2357g = c0475a;
                }
                c0475a.f5130b[c0475a.d(interfaceC0101j)] = interfaceC0101j;
                c0120t.h(interfaceC0101j, o3, -1, -1);
            }
            if (obj instanceof C0) {
                int o4 = i02.o() - f4;
                C0 c02 = (C0) obj;
                C0087c c0087c = c02.f2084b;
                if (c0087c == null || !c0087c.a()) {
                    i3 = -1;
                } else {
                    i5 = i02.c(c0087c);
                    i3 = i02.o() - i02.f(i02.f2134b, i02.p(i02.q(i5) + i5));
                }
                c0120t.h(c02.f2083a, o4, i5, i3);
            }
            if (obj instanceof C0119s0) {
                ((C0119s0) obj).d();
            }
        }
        i02.A();
    }

    public static final void O(boolean z3) {
        if (z3) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int P(ArrayList arrayList, int i3, int i4) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int i7 = ((C0087c) arrayList.get(i6)).f2237a;
            if (i7 < 0) {
                i7 += i4;
            }
            int g3 = Z1.i.g(i7, i3);
            if (g3 < 0) {
                i5 = i6 + 1;
            } else {
                if (g3 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final void Q(C0113p c0113p, Y1.e eVar, Object obj) {
        if (c0113p.f2305O || !Z1.i.a(c0113p.G(), obj)) {
            c0113p.a0(obj);
            c0113p.b(obj, eVar);
        }
    }

    public static final void R(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void S(String str) {
        throw new IllegalStateException(str);
    }

    public static final int T(int i3) {
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        return (i3 & (-920350135)) | (i5 >> 1) | i4 | ((i4 << 1) & i5);
    }

    public static final Q.d U(C0116q0[] c0116q0Arr, InterfaceC0110n0 interfaceC0110n0, InterfaceC0110n0 interfaceC0110n02) {
        Q.c cVar = new Q.c(Q.d.f3088g);
        for (C0116q0 c0116q0 : c0116q0Arr) {
            AbstractC0114p0 abstractC0114p0 = c0116q0.f2333a;
            if (c0116q0.f2338f || !((Q.d) interfaceC0110n0).containsKey(abstractC0114p0)) {
                cVar.put(abstractC0114p0, abstractC0114p0.c(c0116q0, (a1) ((Q.d) interfaceC0110n02).get(abstractC0114p0)));
            }
        }
        return cVar.a();
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0047, code lost:
    
        if (r1 == false) goto L15;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(C0116q0 c0116q0, Y1.e eVar, C0113p c0113p, int i3) {
        a1 a1Var;
        InterfaceC0110n0 dVar;
        boolean z3;
        InterfaceC0110n0 interfaceC0110n0;
        C0119s0 r3;
        InterfaceC0110n0 interfaceC0110n02;
        InterfaceC0110n0 dVar2;
        c0113p.S(-1350970552);
        InterfaceC0110n0 m3 = c0113p.m();
        c0113p.O(201, f2239b);
        Object G3 = c0113p.G();
        if (Z1.i.a(G3, C0105l.f2272a)) {
            a1Var = null;
        } else {
            Z1.i.d(G3, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            a1Var = (a1) G3;
        }
        AbstractC0114p0 abstractC0114p0 = c0116q0.f2333a;
        Object c3 = abstractC0114p0.c(c0116q0, a1Var);
        boolean equals = c3.equals(a1Var);
        if (!equals) {
            c0113p.a0(c3);
        }
        if (c0113p.f2305O) {
            if (!c0116q0.f2338f) {
                boolean containsKey = ((Q.d) m3).containsKey(abstractC0114p0);
                dVar2 = m3;
            }
            Q.d dVar3 = (Q.d) m3;
            dVar3.getClass();
            E2.n u3 = dVar3.f2821d.u(abstractC0114p0.hashCode(), 0, abstractC0114p0, c3);
            dVar2 = dVar3;
            if (u3 != null) {
                dVar2 = new Q.d((N.m) u3.f844c, dVar3.f2822e + u3.f843b);
            }
            c0113p.f2299I = true;
            interfaceC0110n02 = dVar2;
        } else {
            F0 f02 = c0113p.f2296F;
            Object b2 = f02.b(f02.f2102b, f02.f2107g);
            Z1.i.d(b2, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0110n0 interfaceC0110n03 = (InterfaceC0110n0) b2;
            if (!(c0113p.x() && equals) && (c0116q0.f2338f || !((Q.d) m3).containsKey(abstractC0114p0))) {
                Q.d dVar4 = (Q.d) m3;
                dVar4.getClass();
                E2.n u4 = dVar4.f2821d.u(abstractC0114p0.hashCode(), 0, abstractC0114p0, c3);
                dVar = dVar4;
                if (u4 != null) {
                    dVar = new Q.d((N.m) u4.f844c, dVar4.f2822e + u4.f843b);
                }
            } else {
                dVar = interfaceC0110n03;
            }
            interfaceC0110n02 = dVar;
            if (c0113p.f2329x || interfaceC0110n03 != dVar) {
                z3 = true;
                interfaceC0110n0 = dVar;
                if (z3 && !c0113p.f2305O) {
                    c0113p.E(interfaceC0110n0);
                }
                boolean z4 = c0113p.f2327v;
                O o3 = c0113p.f2328w;
                o3.b(z4 ? 1 : 0);
                c0113p.f2327v = z3;
                c0113p.f2300J = interfaceC0110n0;
                c0113p.M(202, 0, f2240c, interfaceC0110n0);
                eVar.g(c0113p, Integer.valueOf((i3 >> 3) & 14));
                c0113p.p(false);
                c0113p.p(false);
                c0113p.f2327v = o3.a() != 0;
                c0113p.f2300J = null;
                r3 = c0113p.r();
                if (r3 == null) {
                    r3.f2347d = new F.V0(i3, 2, c0116q0, eVar);
                    return;
                }
                return;
            }
        }
        z3 = false;
        interfaceC0110n0 = interfaceC0110n02;
        if (z3) {
            c0113p.E(interfaceC0110n0);
        }
        boolean z42 = c0113p.f2327v;
        O o32 = c0113p.f2328w;
        o32.b(z42 ? 1 : 0);
        c0113p.f2327v = z3;
        c0113p.f2300J = interfaceC0110n0;
        c0113p.M(202, 0, f2240c, interfaceC0110n0);
        eVar.g(c0113p, Integer.valueOf((i3 >> 3) & 14));
        c0113p.p(false);
        c0113p.p(false);
        c0113p.f2327v = o32.a() != 0;
        c0113p.f2300J = null;
        r3 = c0113p.r();
        if (r3 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [I.n0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0116q0[] c0116q0Arr, Y1.e eVar, C0113p c0113p, int i3) {
        Q.d Z2;
        boolean z3;
        C0119s0 r3;
        c0113p.S(-1390796515);
        InterfaceC0110n0 m3 = c0113p.m();
        c0113p.O(201, f2239b);
        if (c0113p.f2305O) {
            Z2 = c0113p.Z(m3, U(c0116q0Arr, m3, Q.d.f3088g));
            c0113p.f2299I = true;
        } else {
            F0 f02 = c0113p.f2296F;
            Object g3 = f02.g(f02.f2107g, 0);
            Z1.i.d(g3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r12 = (InterfaceC0110n0) g3;
            F0 f03 = c0113p.f2296F;
            Object g4 = f03.g(f03.f2107g, 1);
            Z1.i.d(g4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0110n0 interfaceC0110n0 = (InterfaceC0110n0) g4;
            Q.d U2 = U(c0116q0Arr, m3, interfaceC0110n0);
            if (c0113p.x() && !c0113p.f2329x && interfaceC0110n0.equals(U2)) {
                c0113p.f2317k = c0113p.f2296F.l() + c0113p.f2317k;
                Z2 = r12;
            } else {
                Z2 = c0113p.Z(m3, U2);
                if (c0113p.f2329x || !Z1.i.a(Z2, r12)) {
                    z3 = true;
                    if (z3 && !c0113p.f2305O) {
                        c0113p.E(Z2);
                    }
                    boolean z4 = c0113p.f2327v;
                    O o3 = c0113p.f2328w;
                    o3.b(z4 ? 1 : 0);
                    c0113p.f2327v = z3;
                    c0113p.f2300J = Z2;
                    c0113p.M(202, 0, f2240c, Z2);
                    eVar.g(c0113p, Integer.valueOf((i3 >> 3) & 14));
                    c0113p.p(false);
                    c0113p.p(false);
                    c0113p.f2327v = o3.a() != 0;
                    c0113p.f2300J = null;
                    r3 = c0113p.r();
                    if (r3 == null) {
                        r3.f2347d = new F.V0(i3, 1, c0116q0Arr, eVar);
                        return;
                    }
                    return;
                }
            }
        }
        z3 = false;
        if (z3) {
            c0113p.E(Z2);
        }
        boolean z42 = c0113p.f2327v;
        O o32 = c0113p.f2328w;
        o32.b(z42 ? 1 : 0);
        c0113p.f2327v = z3;
        c0113p.f2300J = Z2;
        c0113p.M(202, 0, f2240c, Z2);
        eVar.g(c0113p, Integer.valueOf((i3 >> 3) & 14));
        c0113p.p(false);
        c0113p.p(false);
        c0113p.f2327v = o32.a() != 0;
        c0113p.f2300J = null;
        r3 = c0113p.r();
        if (r3 == null) {
        }
    }

    public static final void c(Object obj, Y1.c cVar, C0113p c0113p) {
        boolean f3 = c0113p.f(obj);
        Object G3 = c0113p.G();
        if (f3 || G3 == C0105l.f2272a) {
            G3 = new H(cVar);
            c0113p.a0(G3);
        }
    }

    public static final void d(Object obj, Object obj2, Y1.c cVar, C0113p c0113p) {
        boolean f3 = c0113p.f(obj) | c0113p.f(obj2);
        Object G3 = c0113p.G();
        if (f3 || G3 == C0105l.f2272a) {
            G3 = new H(cVar);
            c0113p.a0(G3);
        }
    }

    public static final void e(C0113p c0113p, Y1.e eVar, Object obj) {
        P1.i h3 = c0113p.f2308b.h();
        boolean f3 = c0113p.f(obj);
        Object G3 = c0113p.G();
        if (f3 || G3 == C0105l.f2272a) {
            G3 = new U(h3, eVar);
            c0113p.a0(G3);
        }
    }

    public static final void f(Object obj, Object obj2, Y1.e eVar, C0113p c0113p) {
        P1.i h3 = c0113p.f2308b.h();
        boolean f3 = c0113p.f(obj) | c0113p.f(obj2);
        Object G3 = c0113p.G();
        if (f3 || G3 == C0105l.f2272a) {
            G3 = new U(h3, eVar);
            c0113p.a0(G3);
        }
    }

    public static final void g(Y1.a aVar, C0113p c0113p) {
        C0134a c0134a = c0113p.f2302L.f2539b;
        c0134a.getClass();
        J.v vVar = J.v.f2574c;
        J.E e3 = c0134a.f2537f;
        e3.a0(vVar);
        I2.d.L(e3, 0, aVar);
        int i3 = e3.f2535l;
        int i4 = vVar.f2523a;
        int T2 = J.E.T(e3, i4);
        int i5 = vVar.f2524b;
        if (i3 == T2 && e3.f2536m == J.E.T(e3, i5)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            if (((1 << i7) & e3.f2535l) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder m3 = AbstractC0080b.m(sb2, "StringBuilder().apply(builderAction).toString()");
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            if (((1 << i9) & e3.f2536m) != 0) {
                if (i6 > 0) {
                    m3.append(", ");
                }
                m3.append(vVar.c(i9));
                i8++;
            }
        }
        String sb3 = m3.toString();
        Z1.i.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        AbstractC0080b.t(sb4, i6, " int arguments (", sb2, ") and ");
        AbstractC0080b.u(sb4, i8, " object arguments (", sb3, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 4];
    }

    public static final int j(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i3) {
        return (iArr[(i3 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i3, int i4) {
        int P2 = P(arrayList, i3, i4);
        return P2 >= 0 ? P2 : -(P2 + 1);
    }

    public static final int o(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i3) {
        return iArr[(i3 * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i3, int i4) {
        int E3 = E(i3, arrayList);
        if (E3 < 0) {
            E3 = -(E3 + 1);
        }
        while (E3 < arrayList.size() && ((P) arrayList.get(E3)).f2175b < i4) {
            arrayList.remove(E3);
        }
    }

    public static final int r(int[] iArr, int i3) {
        int i4 = i3 * 5;
        return y(iArr[i4 + 1] >> 28) + iArr[i4 + 4];
    }

    public static final void s(int[] iArr, int i3, int i4) {
        O(i4 >= 0);
        iArr[(i3 * 5) + 3] = i4;
    }

    public static final void t(int[] iArr, int i3, int i4) {
        O(i4 >= 0 && i4 < 67108863);
        int i5 = (i3 * 5) + 1;
        iArr[i5] = i4 | (iArr[i5] & (-67108864));
    }

    public static final InterfaceC0088c0 u(C0676A c0676a, C0113p c0113p) {
        return v(c0676a, c0676a.getValue(), P1.j.f3073d, c0113p, 0, 0);
    }

    public static final InterfaceC0088c0 v(InterfaceC0678C interfaceC0678C, Object obj, P1.i iVar, C0113p c0113p, int i3, int i4) {
        if ((i4 & 2) != 0) {
            iVar = P1.j.f3073d;
        }
        boolean h3 = c0113p.h(iVar) | c0113p.h(interfaceC0678C);
        Object G3 = c0113p.G();
        Object obj2 = C0105l.f2272a;
        if (h3 || G3 == obj2) {
            G3 = new U0(iVar, interfaceC0678C, null);
            c0113p.a0(G3);
        }
        Y1.e eVar = (Y1.e) G3;
        Object G4 = c0113p.G();
        if (G4 == obj2) {
            G4 = J(obj, X.f2228i);
            c0113p.a0(G4);
        }
        InterfaceC0088c0 interfaceC0088c0 = (InterfaceC0088c0) G4;
        boolean h4 = c0113p.h(eVar);
        Object G5 = c0113p.G();
        if (h4 || G5 == obj2) {
            G5 = new Q0(eVar, interfaceC0088c0, null);
            c0113p.a0(G5);
        }
        f(interfaceC0678C, iVar, (Y1.e) G5, c0113p);
        return interfaceC0088c0;
    }

    public static final void w(String str) {
        throw new C0103k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void x(String str) {
        throw new C0103k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int y(int i3) {
        switch (i3) {
            case 0:
                return 0;
            case 1:
            case C0438i.FLOAT_FIELD_NUMBER /* 2 */:
            case C0438i.LONG_FIELD_NUMBER /* 4 */:
                return 1;
            case C0438i.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final p2.c z(C0113p c0113p) {
        P1.j jVar = P1.j.f3073d;
        C0547t c0547t = C0547t.f5390e;
        P1.i h3 = c0113p.f2308b.h();
        return AbstractC0552y.a(h3.o(new k2.Z((k2.X) h3.k(c0547t))).o(jVar));
    }
}
