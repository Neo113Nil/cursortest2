package I;

import F.v1;
import J.C0196a;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import e2.InterfaceC0426e;
import j.AbstractC0523E;
import j.C0519A;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import q2.AbstractC0837y;
import q2.C0832t;
import t2.C1030A;
import t2.InterfaceC1031B;

/* renamed from: I.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0143d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0144d0 f2795a = new C0144d0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0144d0 f2796b = new C0144d0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0144d0 f2797c = new C0144d0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0144d0 f2798d = new C0144d0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0144d0 f2799e = new C0144d0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final D0.u f2800f = new D0.u(1);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2801g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final I f2802h = new I();

    public static final long A() {
        return Thread.currentThread().getId();
    }

    public static final void B(H0 h02, C0174t c0174t) {
        int i3;
        int i4;
        int i5;
        int i6 = h02.f2706t;
        int i7 = h02.f2707u;
        while (i6 < i7) {
            Object w2 = h02.w(i6);
            if (w2 instanceof InterfaceC0155j) {
                c0174t.h((InterfaceC0155j) w2, h02.o() - h02.E(h02.f2688b, h02.p(i6)), -1, -1);
            }
            int E3 = h02.E(h02.f2688b, h02.p(i6));
            int i8 = i6 + 1;
            int f3 = h02.f(h02.f2688b, h02.p(i8));
            int i9 = E3;
            while (i9 < f3) {
                int i10 = i9 - E3;
                Object obj = h02.f2689c[h02.g(i9)];
                boolean z3 = obj instanceof B0;
                W w3 = C0159l.f2829a;
                if (z3) {
                    B0 b02 = (B0) obj;
                    A0 a02 = b02.f2639a;
                    if (a02 instanceof C0161m) {
                        i3 = i7;
                    } else {
                        int g3 = h02.g(h02.F(i6, i10));
                        Object[] objArr = h02.f2689c;
                        i3 = i7;
                        Object obj2 = objArr[g3];
                        objArr[g3] = w3;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int o3 = h02.o() - i10;
                        C0141c c0141c = b02.f2640b;
                        if (c0141c == null || !c0141c.a()) {
                            i4 = -1;
                            i5 = -1;
                        } else {
                            i4 = h02.c(c0141c);
                            i5 = h02.o() - h02.f(h02.f2688b, h02.p(h02.q(i4) + i4));
                        }
                        c0174t.h(a02, o3, i4, i5);
                    }
                } else {
                    i3 = i7;
                    if (obj instanceof C0173s0) {
                        int g4 = h02.g(h02.F(i6, i10));
                        Object[] objArr2 = h02.f2689c;
                        Object obj3 = objArr2[g4];
                        objArr2[g4] = w3;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((C0173s0) obj).d();
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
        G1.m mVar = N0.f2728b;
        K.d dVar = (K.d) mVar.g();
        if (dVar != null) {
            return dVar;
        }
        K.d dVar2 = new K.d(new C0165o[0]);
        mVar.u(dVar2);
        return dVar2;
    }

    public static final F D(InterfaceC0422a interfaceC0422a) {
        G1.m mVar = N0.f2727a;
        return new F(null, interfaceC0422a);
    }

    public static final int E(int i3, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int g3 = f2.j.g(((O) arrayList.get(i5)).f2730b, i3);
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

    public static final X F(V1.i iVar) {
        X x3 = (X) iVar.v(W.f2779e);
        if (x3 != null) {
            return x3;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void G(C0167p c0167p, InterfaceC0426e interfaceC0426e) {
        f2.j.d(interfaceC0426e, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        f2.x.d(2, interfaceC0426e);
        interfaceC0426e.h(c0167p, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(H0 h02, int i3, H0 h03, boolean z3, boolean z4, boolean z5) {
        S1.u uVar;
        boolean B3;
        int i4;
        int i5;
        int i6;
        int q3 = h02.q(i3);
        int i7 = i3 + q3;
        int f3 = h02.f(h02.f2688b, h02.p(i3));
        int f4 = h02.f(h02.f2688b, h02.p(i7));
        int i8 = f4 - f3;
        boolean z6 = i3 >= 0 && (h02.f2688b[(h02.p(i3) * 5) + 1] & 201326592) != 0;
        h03.r(q3);
        h03.s(i8, h03.f2706t);
        if (h02.f2693g < i7) {
            h02.u(i7);
        }
        if (h02.f2697k < f4) {
            h02.v(f4, i7);
        }
        int[] iArr = h03.f2688b;
        int i9 = h03.f2706t;
        int i10 = i9 * 5;
        S1.k.l0(h02.f2688b, iArr, i10, i3 * 5, i7 * 5);
        Object[] objArr = h03.f2689c;
        int i11 = h03.f2695i;
        S1.k.m0(h02.f2689c, objArr, i11, f3, f4);
        int i12 = h03.f2708v;
        iArr[i10 + 2] = i12;
        int i13 = i9 - i3;
        int i14 = i9 + q3;
        int f5 = i11 - h03.f(iArr, i9);
        int i15 = h03.f2699m;
        int i16 = h03.f2698l;
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
            int f6 = h03.f(iArr, i18) + f5;
            if (i17 < i18) {
                i5 = i9;
                i6 = 0;
            } else {
                i5 = i9;
                i6 = h03.f2697k;
            }
            iArr[(i18 * 5) + 4] = H0.h(f6, i6, i16, length);
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i9 = i5;
            i14 = i20;
        }
        int i21 = i9;
        int i22 = i14;
        h03.f2699m = i17;
        int n3 = n(h02.f2690d, i3, h02.n());
        int n4 = n(h02.f2690d, i7, h02.n());
        if (n3 < n4) {
            ArrayList arrayList = h02.f2690d;
            ArrayList arrayList2 = new ArrayList(n4 - n3);
            for (int i23 = n3; i23 < n4; i23++) {
                C0141c c0141c = (C0141c) arrayList.get(i23);
                c0141c.f2794a += i13;
                arrayList2.add(c0141c);
            }
            h03.f2690d.addAll(n(h03.f2690d, h03.f2706t, h03.n()), arrayList2);
            arrayList.subList(n3, n4).clear();
            uVar = arrayList2;
        } else {
            uVar = S1.u.f4320d;
        }
        if (!uVar.isEmpty()) {
            HashMap hashMap = h02.f2691e;
            HashMap hashMap2 = h03.f2691e;
            if (hashMap != null && hashMap2 != null) {
                int size = uVar.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = h03.f2708v;
        h03.G(i12);
        int x3 = h02.x(h02.f2688b, i3);
        if (!z5) {
            i4 = 1;
            B3 = false;
        } else if (z3) {
            boolean z8 = x3 >= 0;
            if (z8) {
                h02.H();
                h02.a(x3 - h02.f2706t);
                h02.H();
            }
            h02.a(i3 - h02.f2706t);
            boolean A3 = h02.A();
            if (z8) {
                h02.D();
                h02.i();
                h02.D();
                h02.i();
            }
            B3 = A3;
            i4 = 1;
        } else {
            B3 = h02.B(i3, q3);
            i4 = 1;
            h02.C(f3, i8, i3 - 1);
        }
        if (B3) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        h03.f2701o += m(iArr, i21) ? i4 : o(iArr, i21);
        if (z4) {
            h03.f2706t = i22;
            h03.f2695i = i11 + i8;
        }
        if (z7) {
            h03.L(i12);
        }
        return uVar;
    }

    public static final C0148f0 I(float f3) {
        int i3 = AbstractC0139b.f2792b;
        return new C0148f0(f3);
    }

    public static final C0150g0 J(int i3) {
        int i4 = AbstractC0139b.f2792b;
        return new C0150g0(i3);
    }

    public static final C0156j0 K(Object obj, M0 m02) {
        int i3 = AbstractC0139b.f2792b;
        return new C0156j0(obj, m02);
    }

    public static final Object L(InterfaceC0164n0 interfaceC0164n0, AbstractC0168p0 abstractC0168p0) {
        f2.j.d(abstractC0168p0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        Q.d dVar = (Q.d) interfaceC0164n0;
        Object obj = dVar.get(abstractC0168p0);
        if (obj == null) {
            obj = abstractC0168p0.b();
        }
        return ((Z0) obj).a(dVar);
    }

    public static final C0163n M(C0167p c0167p) {
        c0167p.O(206, f2799e);
        if (c0167p.f2863O) {
            H0 h02 = c0167p.f2856H;
            int i3 = h02.f2708v;
            int p3 = h02.p(i3);
            int[] iArr = h02.f2688b;
            int i4 = (p3 * 5) + 1;
            int i5 = iArr[i4];
            if ((i5 & 134217728) == 0) {
                iArr[i4] = i5 | 134217728;
                if (!h(iArr, p3)) {
                    h02.L(h02.x(h02.f2688b, i3));
                }
            }
        }
        Object z3 = c0167p.z();
        C0161m c0161m = z3 instanceof C0161m ? (C0161m) z3 : null;
        if (c0161m == null) {
            c0161m = new C0161m(new C0163n(c0167p, c0167p.f2864P, c0167p.f2880p, c0167p.f2852B, c0167p.f2871g.f2941s));
            c0167p.b0(c0161m);
        }
        InterfaceC0164n0 m3 = c0167p.m();
        C0163n c0163n = c0161m.f2833d;
        c0163n.f2845f.setValue(m3);
        c0167p.p(false);
        return c0163n;
    }

    public static final InterfaceC0142c0 N(Object obj, C0167p c0167p) {
        Object G3 = c0167p.G();
        if (G3 == C0159l.f2829a) {
            G3 = K(obj, W.f2783i);
            c0167p.a0(G3);
        }
        InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G3;
        interfaceC0142c0.setValue(obj);
        return interfaceC0142c0;
    }

    public static final void O(H0 h02, C0174t c0174t) {
        int i3;
        int[] iArr = h02.f2688b;
        int i4 = h02.f2706t;
        int f3 = h02.f(iArr, h02.p(h02.q(i4) + i4));
        for (int f4 = h02.f(h02.f2688b, h02.p(h02.f2706t)); f4 < f3; f4++) {
            Object obj = h02.f2689c[h02.g(f4)];
            int i5 = -1;
            if (obj instanceof InterfaceC0155j) {
                int o3 = h02.o() - f4;
                InterfaceC0155j interfaceC0155j = (InterfaceC0155j) obj;
                C0519A c0519a = (C0519A) c0174t.f2916g;
                if (c0519a == null) {
                    int i6 = AbstractC0523E.f6255a;
                    c0519a = new C0519A();
                    c0174t.f2916g = c0519a;
                }
                c0519a.f6248b[c0519a.d(interfaceC0155j)] = interfaceC0155j;
                c0174t.h(interfaceC0155j, o3, -1, -1);
            }
            if (obj instanceof B0) {
                int o4 = h02.o() - f4;
                B0 b02 = (B0) obj;
                C0141c c0141c = b02.f2640b;
                if (c0141c == null || !c0141c.a()) {
                    i3 = -1;
                } else {
                    i5 = h02.c(c0141c);
                    i3 = h02.o() - h02.f(h02.f2688b, h02.p(h02.q(i5) + i5));
                }
                c0174t.h(b02.f2639a, o4, i5, i3);
            }
            if (obj instanceof C0173s0) {
                ((C0173s0) obj).d();
            }
        }
        h02.A();
    }

    public static final void P(boolean z3) {
        if (z3) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int Q(ArrayList arrayList, int i3, int i4) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int i7 = ((C0141c) arrayList.get(i6)).f2794a;
            if (i7 < 0) {
                i7 += i4;
            }
            int g3 = f2.j.g(i7, i3);
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

    public static final void R(C0167p c0167p, InterfaceC0426e interfaceC0426e, Object obj) {
        if (c0167p.f2863O || !f2.j.a(c0167p.G(), obj)) {
            c0167p.a0(obj);
            c0167p.b(obj, interfaceC0426e);
        }
    }

    public static final void S(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void T(String str) {
        throw new IllegalStateException(str);
    }

    public static final int U(int i3) {
        int i4 = 306783378 & i3;
        int i5 = 613566756 & i3;
        return (i3 & (-920350135)) | (i5 >> 1) | i4 | ((i4 << 1) & i5);
    }

    public static final Q.d V(C0170q0[] c0170q0Arr, InterfaceC0164n0 interfaceC0164n0, InterfaceC0164n0 interfaceC0164n02) {
        Q.c cVar = new Q.c(Q.d.f3954g);
        for (C0170q0 c0170q0 : c0170q0Arr) {
            AbstractC0168p0 abstractC0168p0 = c0170q0.f2892a;
            if (c0170q0.f2897f || !((Q.d) interfaceC0164n0).containsKey(abstractC0168p0)) {
                cVar.put(abstractC0168p0, abstractC0168p0.c(c0170q0, (Z0) ((Q.d) interfaceC0164n02).get(abstractC0168p0)));
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
    public static final void a(C0170q0 c0170q0, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        Z0 z02;
        InterfaceC0164n0 dVar;
        boolean z3;
        InterfaceC0164n0 interfaceC0164n0;
        C0173s0 r3;
        InterfaceC0164n0 interfaceC0164n02;
        InterfaceC0164n0 dVar2;
        c0167p.S(-1350970552);
        InterfaceC0164n0 m3 = c0167p.m();
        c0167p.O(201, f2796b);
        Object G3 = c0167p.G();
        if (f2.j.a(G3, C0159l.f2829a)) {
            z02 = null;
        } else {
            f2.j.d(G3, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            z02 = (Z0) G3;
        }
        AbstractC0168p0 abstractC0168p0 = c0170q0.f2892a;
        Object c2 = abstractC0168p0.c(c0170q0, z02);
        boolean equals = c2.equals(z02);
        if (!equals) {
            c0167p.a0(c2);
        }
        if (c0167p.f2863O) {
            if (!c0170q0.f2897f) {
                boolean containsKey = ((Q.d) m3).containsKey(abstractC0168p0);
                dVar2 = m3;
            }
            Q.d dVar3 = (Q.d) m3;
            dVar3.getClass();
            K2.m u3 = dVar3.f3503d.u(abstractC0168p0.hashCode(), 0, abstractC0168p0, c2);
            dVar2 = dVar3;
            if (u3 != null) {
                dVar2 = new Q.d((N.m) u3.f3331c, dVar3.f3504e + u3.f3330b);
            }
            c0167p.f2857I = true;
            interfaceC0164n02 = dVar2;
        } else {
            E0 e02 = c0167p.f2854F;
            Object b3 = e02.b(e02.f2656b, e02.f2661g);
            f2.j.d(b3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0164n0 interfaceC0164n03 = (InterfaceC0164n0) b3;
            if (!(c0167p.x() && equals) && (c0170q0.f2897f || !((Q.d) m3).containsKey(abstractC0168p0))) {
                Q.d dVar4 = (Q.d) m3;
                dVar4.getClass();
                K2.m u4 = dVar4.f3503d.u(abstractC0168p0.hashCode(), 0, abstractC0168p0, c2);
                dVar = dVar4;
                if (u4 != null) {
                    dVar = new Q.d((N.m) u4.f3331c, dVar4.f3504e + u4.f3330b);
                }
            } else {
                dVar = interfaceC0164n03;
            }
            interfaceC0164n02 = dVar;
            if (c0167p.f2888x || interfaceC0164n03 != dVar) {
                z3 = true;
                interfaceC0164n0 = dVar;
                if (z3 && !c0167p.f2863O) {
                    c0167p.E(interfaceC0164n0);
                }
                boolean z4 = c0167p.f2886v;
                N n3 = c0167p.f2887w;
                n3.b(z4 ? 1 : 0);
                c0167p.f2886v = z3;
                c0167p.f2858J = interfaceC0164n0;
                c0167p.M(202, 0, f2797c, interfaceC0164n0);
                interfaceC0426e.h(c0167p, Integer.valueOf((i3 >> 3) & 14));
                c0167p.p(false);
                c0167p.p(false);
                c0167p.f2886v = n3.a() != 0;
                c0167p.f2858J = null;
                r3 = c0167p.r();
                if (r3 == null) {
                    r3.f2906d = new v1(i3, 2, c0170q0, interfaceC0426e);
                    return;
                }
                return;
            }
        }
        z3 = false;
        interfaceC0164n0 = interfaceC0164n02;
        if (z3) {
            c0167p.E(interfaceC0164n0);
        }
        boolean z42 = c0167p.f2886v;
        N n32 = c0167p.f2887w;
        n32.b(z42 ? 1 : 0);
        c0167p.f2886v = z3;
        c0167p.f2858J = interfaceC0164n0;
        c0167p.M(202, 0, f2797c, interfaceC0164n0);
        interfaceC0426e.h(c0167p, Integer.valueOf((i3 >> 3) & 14));
        c0167p.p(false);
        c0167p.p(false);
        c0167p.f2886v = n32.a() != 0;
        c0167p.f2858J = null;
        r3 = c0167p.r();
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
    public static final void b(C0170q0[] c0170q0Arr, InterfaceC0426e interfaceC0426e, C0167p c0167p, int i3) {
        Q.d Z2;
        boolean z3;
        C0173s0 r3;
        c0167p.S(-1390796515);
        InterfaceC0164n0 m3 = c0167p.m();
        c0167p.O(201, f2796b);
        if (c0167p.f2863O) {
            Z2 = c0167p.Z(m3, V(c0170q0Arr, m3, Q.d.f3954g));
            c0167p.f2857I = true;
        } else {
            E0 e02 = c0167p.f2854F;
            Object g3 = e02.g(e02.f2661g, 0);
            f2.j.d(g3, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r12 = (InterfaceC0164n0) g3;
            E0 e03 = c0167p.f2854F;
            Object g4 = e03.g(e03.f2661g, 1);
            f2.j.d(g4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0164n0 interfaceC0164n0 = (InterfaceC0164n0) g4;
            Q.d V2 = V(c0170q0Arr, m3, interfaceC0164n0);
            if (c0167p.x() && !c0167p.f2888x && interfaceC0164n0.equals(V2)) {
                c0167p.f2875k = c0167p.f2854F.l() + c0167p.f2875k;
                Z2 = r12;
            } else {
                Z2 = c0167p.Z(m3, V2);
                if (c0167p.f2888x || !f2.j.a(Z2, r12)) {
                    z3 = true;
                    if (z3 && !c0167p.f2863O) {
                        c0167p.E(Z2);
                    }
                    boolean z4 = c0167p.f2886v;
                    N n3 = c0167p.f2887w;
                    n3.b(z4 ? 1 : 0);
                    c0167p.f2886v = z3;
                    c0167p.f2858J = Z2;
                    c0167p.M(202, 0, f2797c, Z2);
                    interfaceC0426e.h(c0167p, Integer.valueOf((i3 >> 3) & 14));
                    c0167p.p(false);
                    c0167p.p(false);
                    c0167p.f2886v = n3.a() != 0;
                    c0167p.f2858J = null;
                    r3 = c0167p.r();
                    if (r3 == null) {
                        r3.f2906d = new v1(i3, 1, c0170q0Arr, interfaceC0426e);
                        return;
                    }
                    return;
                }
            }
        }
        z3 = false;
        if (z3) {
            c0167p.E(Z2);
        }
        boolean z42 = c0167p.f2886v;
        N n32 = c0167p.f2887w;
        n32.b(z42 ? 1 : 0);
        c0167p.f2886v = z3;
        c0167p.f2858J = Z2;
        c0167p.M(202, 0, f2797c, Z2);
        interfaceC0426e.h(c0167p, Integer.valueOf((i3 >> 3) & 14));
        c0167p.p(false);
        c0167p.p(false);
        c0167p.f2886v = n32.a() != 0;
        c0167p.f2858J = null;
        r3 = c0167p.r();
        if (r3 == null) {
        }
    }

    public static final void c(Object obj, InterfaceC0424c interfaceC0424c, C0167p c0167p) {
        boolean f3 = c0167p.f(obj);
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            G3 = new G(interfaceC0424c);
            c0167p.a0(G3);
        }
    }

    public static final void d(Object obj, Object obj2, InterfaceC0424c interfaceC0424c, C0167p c0167p) {
        boolean f3 = c0167p.f(obj) | c0167p.f(obj2);
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            G3 = new G(interfaceC0424c);
            c0167p.a0(G3);
        }
    }

    public static final void e(C0167p c0167p, InterfaceC0426e interfaceC0426e, Object obj) {
        V1.i h3 = c0167p.f2866b.h();
        boolean f3 = c0167p.f(obj);
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            G3 = new T(h3, interfaceC0426e);
            c0167p.a0(G3);
        }
    }

    public static final void f(Object obj, Object obj2, InterfaceC0426e interfaceC0426e, C0167p c0167p) {
        V1.i h3 = c0167p.f2866b.h();
        boolean f3 = c0167p.f(obj) | c0167p.f(obj2);
        Object G3 = c0167p.G();
        if (f3 || G3 == C0159l.f2829a) {
            G3 = new T(h3, interfaceC0426e);
            c0167p.a0(G3);
        }
    }

    public static final void g(InterfaceC0422a interfaceC0422a, C0167p c0167p) {
        C0196a c0196a = c0167p.f2860L.f3114b;
        c0196a.getClass();
        J.v vVar = J.v.f3149c;
        J.D d3 = c0196a.f3112b;
        d3.o0(vVar);
        l0.c.O(d3, 0, interfaceC0422a);
        int i3 = d3.f3110h;
        int i4 = vVar.f3102a;
        int h02 = J.D.h0(d3, i4);
        int i5 = vVar.f3103b;
        if (i3 == h02 && d3.f3111i == J.D.h0(d3, i5)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            if (((1 << i7) & d3.f3110h) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder l3 = A.k.l(sb2, "StringBuilder().apply(builderAction).toString()");
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            if (((1 << i9) & d3.f3111i) != 0) {
                if (i6 > 0) {
                    l3.append(", ");
                }
                l3.append(vVar.c(i9));
                i8++;
            }
        }
        String sb3 = l3.toString();
        f2.j.e(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        A.k.t(sb4, i6, " int arguments (", sb2, ") and ");
        A.k.u(sb4, i8, " object arguments (", sb3, ").");
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
        int Q3 = Q(arrayList, i3, i4);
        return Q3 >= 0 ? Q3 : -(Q3 + 1);
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
        while (E3 < arrayList.size() && ((O) arrayList.get(E3)).f2730b < i4) {
            arrayList.remove(E3);
        }
    }

    public static final int r(int[] iArr, int i3) {
        int i4 = i3 * 5;
        return y(iArr[i4 + 1] >> 28) + iArr[i4 + 4];
    }

    public static final void s(int[] iArr, int i3, int i4) {
        P(i4 >= 0);
        iArr[(i3 * 5) + 3] = i4;
    }

    public static final void t(int[] iArr, int i3, int i4) {
        P(i4 >= 0 && i4 < 67108863);
        int i5 = (i3 * 5) + 1;
        iArr[i5] = i4 | (iArr[i5] & (-67108864));
    }

    public static final InterfaceC0142c0 u(C1030A c1030a, C0167p c0167p) {
        return v(c1030a, c1030a.getValue(), V1.j.f4558d, c0167p, 0, 0);
    }

    public static final InterfaceC0142c0 v(InterfaceC1031B interfaceC1031B, Object obj, V1.i iVar, C0167p c0167p, int i3, int i4) {
        if ((i4 & 2) != 0) {
            iVar = V1.j.f4558d;
        }
        boolean h3 = c0167p.h(iVar) | c0167p.h(interfaceC1031B);
        Object G3 = c0167p.G();
        Object obj2 = C0159l.f2829a;
        if (h3 || G3 == obj2) {
            G3 = new T0(iVar, interfaceC1031B, null);
            c0167p.a0(G3);
        }
        InterfaceC0426e interfaceC0426e = (InterfaceC0426e) G3;
        Object G4 = c0167p.G();
        if (G4 == obj2) {
            G4 = K(obj, W.f2783i);
            c0167p.a0(G4);
        }
        InterfaceC0142c0 interfaceC0142c0 = (InterfaceC0142c0) G4;
        boolean h4 = c0167p.h(interfaceC0426e);
        Object G5 = c0167p.G();
        if (h4 || G5 == obj2) {
            G5 = new P0(interfaceC0426e, interfaceC0142c0, null);
            c0167p.a0(G5);
        }
        f(interfaceC1031B, iVar, (InterfaceC0426e) G5, c0167p);
        return interfaceC0142c0;
    }

    public static final void w(String str) {
        throw new C0157k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final void x(String str) {
        throw new C0157k("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (" + str + "). Please report to Google or use https://goo.gle/compose-feedback");
    }

    public static final int y(int i3) {
        switch (i3) {
            case 0:
                return 0;
            case 1:
            case k1.i.FLOAT_FIELD_NUMBER /* 2 */:
            case k1.i.LONG_FIELD_NUMBER /* 4 */:
                return 1;
            case k1.i.INTEGER_FIELD_NUMBER /* 3 */:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final v2.c z(C0167p c0167p) {
        V1.j jVar = V1.j.f4558d;
        C0832t c0832t = C0832t.f7929e;
        V1.i h3 = c0167p.f2866b.h();
        return AbstractC0837y.a(h3.d(new q2.Z((q2.X) h3.v(c0832t))).d(jVar));
    }
}
