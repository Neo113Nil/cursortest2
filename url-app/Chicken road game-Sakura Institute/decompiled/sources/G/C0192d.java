package G;

import A.AbstractC0017m;
import B1.C0097d;
import D.x1;
import H.C0244a;
import W2.C0299v;
import W2.InterfaceC0280c0;
import i.AbstractC0665F;
import i.C0661B;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import z2.C1405I;
import z2.C1436t;

/* renamed from: G.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0192d {

    /* renamed from: a, reason: collision with root package name */
    public static final C0193d0 f2792a = new C0193d0("provider");

    /* renamed from: b, reason: collision with root package name */
    public static final C0193d0 f2793b = new C0193d0("provider");

    /* renamed from: c, reason: collision with root package name */
    public static final C0193d0 f2794c = new C0193d0("compositionLocalMap");

    /* renamed from: d, reason: collision with root package name */
    public static final C0193d0 f2795d = new C0193d0("providers");

    /* renamed from: e, reason: collision with root package name */
    public static final C0193d0 f2796e = new C0193d0("reference");

    /* renamed from: f, reason: collision with root package name */
    public static final B0.t f2797f = new B0.t(1);

    /* renamed from: g, reason: collision with root package name */
    public static final Object f2798g = new Object();

    /* renamed from: h, reason: collision with root package name */
    public static final I f2799h = new I();

    public static final long A() {
        return Thread.currentThread().getId();
    }

    public static final void B(H0 h02, C0223t c0223t) {
        int i2;
        int i4;
        int i5;
        int i6 = h02.f2704t;
        int i7 = h02.f2705u;
        while (i6 < i7) {
            Object w4 = h02.w(i6);
            if (w4 instanceof InterfaceC0204j) {
                c0223t.h((InterfaceC0204j) w4, h02.o() - h02.E(h02.f2686b, h02.p(i6)), -1, -1);
            }
            int E3 = h02.E(h02.f2686b, h02.p(i6));
            int i8 = i6 + 1;
            int f4 = h02.f(h02.f2686b, h02.p(i8));
            int i9 = E3;
            while (i9 < f4) {
                int i10 = i9 - E3;
                Object obj = h02.f2687c[h02.g(i9)];
                boolean z4 = obj instanceof B0;
                W w5 = C0208l.f2826a;
                if (z4) {
                    B0 b02 = (B0) obj;
                    A0 a02 = b02.f2637a;
                    if (a02 instanceof C0210m) {
                        i2 = i7;
                    } else {
                        int g4 = h02.g(h02.F(i6, i10));
                        Object[] objArr = h02.f2687c;
                        i2 = i7;
                        Object obj2 = objArr[g4];
                        objArr[g4] = w5;
                        if (obj != obj2) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        int o4 = h02.o() - i10;
                        C0190c c0190c = b02.f2638b;
                        if (c0190c == null || !c0190c.a()) {
                            i4 = -1;
                            i5 = -1;
                        } else {
                            i4 = h02.c(c0190c);
                            i5 = h02.o() - h02.f(h02.f2686b, h02.p(h02.q(i4) + i4));
                        }
                        c0223t.h(a02, o4, i4, i5);
                    }
                } else {
                    i2 = i7;
                    if (obj instanceof C0222s0) {
                        int g5 = h02.g(h02.F(i6, i10));
                        Object[] objArr2 = h02.f2687c;
                        Object obj3 = objArr2[g5];
                        objArr2[g5] = w5;
                        if (obj != obj3) {
                            w("Slot table is out of sync");
                            throw null;
                        }
                        ((C0222s0) obj).d();
                    } else {
                        continue;
                    }
                }
                i9++;
                i7 = i2;
            }
            i6 = i8;
        }
    }

    public static final I.d C() {
        C0097d c0097d = N0.f2726b;
        I.d dVar = (I.d) c0097d.j();
        if (dVar != null) {
            return dVar;
        }
        I.d dVar2 = new I.d(new C0214o[0]);
        c0097d.B(dVar2);
        return dVar2;
    }

    public static final F D(Function0 function0) {
        C0097d c0097d = N0.f2725a;
        return new F(null, function0);
    }

    public static final int E(int i2, ArrayList arrayList) {
        int size = arrayList.size() - 1;
        int i4 = 0;
        while (i4 <= size) {
            int i5 = (i4 + size) >>> 1;
            int e4 = Intrinsics.e(((O) arrayList.get(i5)).f2728b, i2);
            if (e4 < 0) {
                i4 = i5 + 1;
            } else {
                if (e4 <= 0) {
                    return i5;
                }
                size = i5 - 1;
            }
        }
        return -(i4 + 1);
    }

    public static final X F(CoroutineContext coroutineContext) {
        X x2 = (X) coroutineContext.k(W.f2775e);
        if (x2 != null) {
            return x2;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    public static final void G(C0216p c0216p, Function2 function2) {
        Intrinsics.d(function2, "null cannot be cast to non-null type kotlin.Function2<androidx.compose.runtime.Composer, kotlin.Int, kotlin.Unit>");
        M2.J.d(2, function2);
        function2.h(c0216p, 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List H(H0 h02, int i2, H0 h03, boolean z4, boolean z5, boolean z6) {
        C1405I c1405i;
        boolean B;
        int i4;
        int i5;
        int i6;
        int q2 = h02.q(i2);
        int i7 = i2 + q2;
        int f4 = h02.f(h02.f2686b, h02.p(i2));
        int f5 = h02.f(h02.f2686b, h02.p(i7));
        int i8 = f5 - f4;
        boolean z7 = i2 >= 0 && (h02.f2686b[(h02.p(i2) * 5) + 1] & 201326592) != 0;
        h03.r(q2);
        h03.s(i8, h03.f2704t);
        if (h02.f2691g < i7) {
            h02.u(i7);
        }
        if (h02.f2695k < f5) {
            h02.v(f5, i7);
        }
        int[] iArr = h03.f2686b;
        int i9 = h03.f2704t;
        int i10 = i9 * 5;
        C1436t.e(h02.f2686b, iArr, i10, i2 * 5, i7 * 5);
        Object[] objArr = h03.f2687c;
        int i11 = h03.f2693i;
        C1436t.f(h02.f2687c, objArr, i11, f4, f5);
        int i12 = h03.f2706v;
        iArr[i10 + 2] = i12;
        int i13 = i9 - i2;
        int i14 = i9 + q2;
        int f6 = i11 - h03.f(iArr, i9);
        int i15 = h03.f2697m;
        int i16 = h03.f2696l;
        int length = objArr.length;
        boolean z8 = z7;
        int i17 = i15;
        int i18 = i9;
        while (i18 < i14) {
            if (i18 != i9) {
                int i19 = (i18 * 5) + 2;
                iArr[i19] = iArr[i19] + i13;
            }
            int i20 = i14;
            int f7 = h03.f(iArr, i18) + f6;
            if (i17 < i18) {
                i5 = i9;
                i6 = 0;
            } else {
                i5 = i9;
                i6 = h03.f2695k;
            }
            iArr[(i18 * 5) + 4] = H0.h(f7, i6, i16, length);
            if (i18 == i17) {
                i17++;
            }
            i18++;
            i9 = i5;
            i14 = i20;
        }
        int i21 = i9;
        int i22 = i14;
        h03.f2697m = i17;
        int n2 = n(h02.f2688d, i2, h02.n());
        int n4 = n(h02.f2688d, i7, h02.n());
        if (n2 < n4) {
            ArrayList arrayList = h02.f2688d;
            ArrayList arrayList2 = new ArrayList(n4 - n2);
            for (int i23 = n2; i23 < n4; i23++) {
                C0190c c0190c = (C0190c) arrayList.get(i23);
                c0190c.f2791a += i13;
                arrayList2.add(c0190c);
            }
            h03.f2688d.addAll(n(h03.f2688d, h03.f2704t, h03.n()), arrayList2);
            arrayList.subList(n2, n4).clear();
            c1405i = arrayList2;
        } else {
            c1405i = C1405I.f11931d;
        }
        if (!c1405i.isEmpty()) {
            HashMap hashMap = h02.f2689e;
            HashMap hashMap2 = h03.f2689e;
            if (hashMap != null && hashMap2 != null) {
                int size = c1405i.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = h03.f2706v;
        h03.G(i12);
        int x2 = h02.x(h02.f2686b, i2);
        if (!z6) {
            i4 = 1;
            B = false;
        } else if (z4) {
            boolean z9 = x2 >= 0;
            if (z9) {
                h02.H();
                h02.a(x2 - h02.f2704t);
                h02.H();
            }
            h02.a(i2 - h02.f2704t);
            boolean A4 = h02.A();
            if (z9) {
                h02.D();
                h02.i();
                h02.D();
                h02.i();
            }
            B = A4;
            i4 = 1;
        } else {
            B = h02.B(i2, q2);
            i4 = 1;
            h02.C(f4, i8, i2 - 1);
        }
        if (B) {
            w("Unexpectedly removed anchors");
            throw null;
        }
        h03.f2699o += m(iArr, i21) ? i4 : o(iArr, i21);
        if (z5) {
            h03.f2704t = i22;
            h03.f2693i = i11 + i8;
        }
        if (z8) {
            h03.L(i12);
        }
        return c1405i;
    }

    public static final C0197f0 I(float f4) {
        int i2 = AbstractC0188b.f2789b;
        return new C0197f0(f4);
    }

    public static final C0199g0 J(int i2) {
        int i4 = AbstractC0188b.f2789b;
        return new C0199g0(i2);
    }

    public static final C0205j0 K(Object obj, M0 m02) {
        int i2 = AbstractC0188b.f2789b;
        return new C0205j0(obj, m02);
    }

    public static final Object L(InterfaceC0213n0 interfaceC0213n0, AbstractC0217p0 abstractC0217p0) {
        Intrinsics.d(abstractC0217p0, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        O.d dVar = (O.d) interfaceC0213n0;
        Object obj = dVar.get(abstractC0217p0);
        if (obj == null) {
            obj = abstractC0217p0.b();
        }
        return ((a1) obj).a(dVar);
    }

    public static final C0212n M(C0216p c0216p) {
        c0216p.Q(206, f2796e);
        if (c0216p.f2860O) {
            H0 h02 = c0216p.f2853H;
            int i2 = h02.f2706v;
            int p4 = h02.p(i2);
            int[] iArr = h02.f2686b;
            int i4 = (p4 * 5) + 1;
            int i5 = iArr[i4];
            if ((i5 & 134217728) == 0) {
                iArr[i4] = i5 | 134217728;
                if (!h(iArr, p4)) {
                    h02.L(h02.x(h02.f2686b, i2));
                }
            }
        }
        Object B = c0216p.B();
        C0210m c0210m = B instanceof C0210m ? (C0210m) B : null;
        if (c0210m == null) {
            c0210m = new C0210m(new C0212n(c0216p, c0216p.f2861P, c0216p.f2877p, c0216p.B, c0216p.f2868g.f2938v));
            c0216p.d0(c0210m);
        }
        InterfaceC0213n0 m4 = c0216p.m();
        C0212n c0212n = c0210m.f2829d;
        c0212n.f2841f.setValue(m4);
        c0216p.q(false);
        return c0212n;
    }

    public static final InterfaceC0191c0 N(Object obj, C0216p c0216p) {
        Object I3 = c0216p.I();
        if (I3 == C0208l.f2826a) {
            I3 = K(obj, W.f2779l);
            c0216p.c0(I3);
        }
        InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I3;
        interfaceC0191c0.setValue(obj);
        return interfaceC0191c0;
    }

    public static final void O(H0 h02, C0223t c0223t) {
        int i2;
        int[] iArr = h02.f2686b;
        int i4 = h02.f2704t;
        int f4 = h02.f(iArr, h02.p(h02.q(i4) + i4));
        for (int f5 = h02.f(h02.f2686b, h02.p(h02.f2704t)); f5 < f4; f5++) {
            Object obj = h02.f2687c[h02.g(f5)];
            int i5 = -1;
            if (obj instanceof InterfaceC0204j) {
                int o4 = h02.o() - f5;
                InterfaceC0204j interfaceC0204j = (InterfaceC0204j) obj;
                C0661B c0661b = (C0661B) c0223t.f2913g;
                if (c0661b == null) {
                    int i6 = AbstractC0665F.f6892a;
                    c0661b = new C0661B();
                    c0223t.f2913g = c0661b;
                }
                c0661b.f6885b[c0661b.d(interfaceC0204j)] = interfaceC0204j;
                c0223t.h(interfaceC0204j, o4, -1, -1);
            }
            if (obj instanceof B0) {
                int o5 = h02.o() - f5;
                B0 b02 = (B0) obj;
                C0190c c0190c = b02.f2638b;
                if (c0190c == null || !c0190c.a()) {
                    i2 = -1;
                } else {
                    i5 = h02.c(c0190c);
                    i2 = h02.o() - h02.f(h02.f2686b, h02.p(h02.q(i5) + i5));
                }
                c0223t.h(b02.f2637a, o5, i5, i2);
            }
            if (obj instanceof C0222s0) {
                ((C0222s0) obj).d();
            }
        }
        h02.A();
    }

    public static final void P(boolean z4) {
        if (z4) {
            return;
        }
        w("Check failed");
        throw null;
    }

    public static final int Q(ArrayList arrayList, int i2, int i4) {
        int size = arrayList.size() - 1;
        int i5 = 0;
        while (i5 <= size) {
            int i6 = (i5 + size) >>> 1;
            int i7 = ((C0190c) arrayList.get(i6)).f2791a;
            if (i7 < 0) {
                i7 += i4;
            }
            int e4 = Intrinsics.e(i7, i2);
            if (e4 < 0) {
                i5 = i6 + 1;
            } else {
                if (e4 <= 0) {
                    return i6;
                }
                size = i6 - 1;
            }
        }
        return -(i5 + 1);
    }

    public static final void R(C0216p c0216p, Object obj, Function2 function2) {
        if (c0216p.f2860O || !Intrinsics.a(c0216p.I(), obj)) {
            c0216p.c0(obj);
            c0216p.b(obj, function2);
        }
    }

    public static final void S(String str) {
        throw new IllegalArgumentException(str);
    }

    public static final void T(String str) {
        throw new IllegalStateException(str);
    }

    public static final int U(int i2) {
        int i4 = 306783378 & i2;
        int i5 = 613566756 & i2;
        return (i2 & (-920350135)) | (i5 >> 1) | i4 | ((i4 << 1) & i5);
    }

    public static final O.d V(C0219q0[] c0219q0Arr, InterfaceC0213n0 interfaceC0213n0, InterfaceC0213n0 interfaceC0213n02) {
        O.d dVar = O.d.f3626m;
        O.c cVar = new O.c(dVar);
        cVar.f3625m = dVar;
        for (C0219q0 c0219q0 : c0219q0Arr) {
            AbstractC0217p0 abstractC0217p0 = c0219q0.f2889a;
            if (c0219q0.f2894f || !((O.d) interfaceC0213n0).containsKey(abstractC0217p0)) {
                cVar.put(abstractC0217p0, abstractC0217p0.c(c0219q0, (a1) ((O.d) interfaceC0213n02).get(abstractC0217p0)));
            }
        }
        return cVar.j();
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
    public static final void a(C0219q0 c0219q0, Function2 function2, C0216p c0216p, int i2) {
        a1 a1Var;
        InterfaceC0213n0 dVar;
        boolean z4;
        InterfaceC0213n0 interfaceC0213n0;
        C0222s0 s4;
        InterfaceC0213n0 interfaceC0213n02;
        InterfaceC0213n0 dVar2;
        c0216p.U(-1350970552);
        InterfaceC0213n0 m4 = c0216p.m();
        c0216p.Q(201, f2793b);
        Object I3 = c0216p.I();
        if (Intrinsics.a(I3, C0208l.f2826a)) {
            a1Var = null;
        } else {
            Intrinsics.d(I3, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            a1Var = (a1) I3;
        }
        AbstractC0217p0 abstractC0217p0 = c0219q0.f2889a;
        Object c4 = abstractC0217p0.c(c0219q0, a1Var);
        boolean equals = c4.equals(a1Var);
        if (!equals) {
            c0216p.c0(c4);
        }
        if (c0216p.f2860O) {
            if (!c0219q0.f2894f) {
                boolean containsKey = ((O.d) m4).containsKey(abstractC0217p0);
                dVar2 = m4;
            }
            O.d dVar3 = (O.d) m4;
            dVar3.getClass();
            G1.y u4 = dVar3.f3460j.u(abstractC0217p0.hashCode(), 0, abstractC0217p0, c4);
            dVar2 = dVar3;
            if (u4 != null) {
                dVar2 = new O.d((L.m) u4.f3165b, dVar3.f3461k + u4.f3164a);
            }
            c0216p.f2854I = true;
            interfaceC0213n02 = dVar2;
        } else {
            E0 e02 = c0216p.f2851F;
            Object b4 = e02.b(e02.f2654b, e02.f2659g);
            Intrinsics.d(b4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0213n0 interfaceC0213n03 = (InterfaceC0213n0) b4;
            if (!(c0216p.z() && equals) && (c0219q0.f2894f || !((O.d) m4).containsKey(abstractC0217p0))) {
                O.d dVar4 = (O.d) m4;
                dVar4.getClass();
                G1.y u5 = dVar4.f3460j.u(abstractC0217p0.hashCode(), 0, abstractC0217p0, c4);
                dVar = dVar4;
                if (u5 != null) {
                    dVar = new O.d((L.m) u5.f3165b, dVar4.f3461k + u5.f3164a);
                }
            } else {
                dVar = interfaceC0213n03;
            }
            interfaceC0213n02 = dVar;
            if (c0216p.f2885x || interfaceC0213n03 != dVar) {
                z4 = true;
                interfaceC0213n0 = dVar;
                if (z4 && !c0216p.f2860O) {
                    c0216p.G(interfaceC0213n0);
                }
                boolean z5 = c0216p.f2883v;
                N n2 = c0216p.f2884w;
                n2.b(z5 ? 1 : 0);
                c0216p.f2883v = z4;
                c0216p.f2855J = interfaceC0213n0;
                c0216p.O(202, 0, f2794c, interfaceC0213n0);
                function2.h(c0216p, Integer.valueOf((i2 >> 3) & 14));
                c0216p.q(false);
                c0216p.q(false);
                c0216p.f2883v = n2.a() != 0;
                c0216p.f2855J = null;
                s4 = c0216p.s();
                if (s4 == null) {
                    s4.f2903d = new x1(i2, 3, c0219q0, function2);
                    return;
                }
                return;
            }
        }
        z4 = false;
        interfaceC0213n0 = interfaceC0213n02;
        if (z4) {
            c0216p.G(interfaceC0213n0);
        }
        boolean z52 = c0216p.f2883v;
        N n22 = c0216p.f2884w;
        n22.b(z52 ? 1 : 0);
        c0216p.f2883v = z4;
        c0216p.f2855J = interfaceC0213n0;
        c0216p.O(202, 0, f2794c, interfaceC0213n0);
        function2.h(c0216p, Integer.valueOf((i2 >> 3) & 14));
        c0216p.q(false);
        c0216p.q(false);
        c0216p.f2883v = n22.a() != 0;
        c0216p.f2855J = null;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v4, types: [G.n0, java.lang.Object] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(C0219q0[] c0219q0Arr, Function2 function2, C0216p c0216p, int i2) {
        O.d b02;
        boolean z4;
        C0222s0 s4;
        c0216p.U(-1390796515);
        InterfaceC0213n0 m4 = c0216p.m();
        c0216p.Q(201, f2793b);
        if (c0216p.f2860O) {
            b02 = c0216p.b0(m4, V(c0219q0Arr, m4, O.d.f3626m));
            c0216p.f2854I = true;
        } else {
            E0 e02 = c0216p.f2851F;
            Object g4 = e02.g(e02.f2659g, 0);
            Intrinsics.d(g4, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r12 = (InterfaceC0213n0) g4;
            E0 e03 = c0216p.f2851F;
            Object g5 = e03.g(e03.f2659g, 1);
            Intrinsics.d(g5, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            InterfaceC0213n0 interfaceC0213n0 = (InterfaceC0213n0) g5;
            O.d V3 = V(c0219q0Arr, m4, interfaceC0213n0);
            if (c0216p.z() && !c0216p.f2885x && interfaceC0213n0.equals(V3)) {
                c0216p.f2872k = c0216p.f2851F.l() + c0216p.f2872k;
                b02 = r12;
            } else {
                b02 = c0216p.b0(m4, V3);
                if (c0216p.f2885x || !Intrinsics.a(b02, r12)) {
                    z4 = true;
                    if (z4 && !c0216p.f2860O) {
                        c0216p.G(b02);
                    }
                    boolean z5 = c0216p.f2883v;
                    N n2 = c0216p.f2884w;
                    n2.b(z5 ? 1 : 0);
                    c0216p.f2883v = z4;
                    c0216p.f2855J = b02;
                    c0216p.O(202, 0, f2794c, b02);
                    function2.h(c0216p, Integer.valueOf((i2 >> 3) & 14));
                    c0216p.q(false);
                    c0216p.q(false);
                    c0216p.f2883v = n2.a() != 0;
                    c0216p.f2855J = null;
                    s4 = c0216p.s();
                    if (s4 == null) {
                        s4.f2903d = new x1(i2, 2, c0219q0Arr, function2);
                        return;
                    }
                    return;
                }
            }
        }
        z4 = false;
        if (z4) {
            c0216p.G(b02);
        }
        boolean z52 = c0216p.f2883v;
        N n22 = c0216p.f2884w;
        n22.b(z52 ? 1 : 0);
        c0216p.f2883v = z4;
        c0216p.f2855J = b02;
        c0216p.O(202, 0, f2794c, b02);
        function2.h(c0216p, Integer.valueOf((i2 >> 3) & 14));
        c0216p.q(false);
        c0216p.q(false);
        c0216p.f2883v = n22.a() != 0;
        c0216p.f2855J = null;
        s4 = c0216p.s();
        if (s4 == null) {
        }
    }

    public static final void c(Object obj, Object obj2, Function1 function1, C0216p c0216p) {
        boolean f4 = c0216p.f(obj) | c0216p.f(obj2);
        Object I3 = c0216p.I();
        if (f4 || I3 == C0208l.f2826a) {
            I3 = new G(function1);
            c0216p.c0(I3);
        }
    }

    public static final void d(Object obj, Function1 function1, C0216p c0216p) {
        boolean f4 = c0216p.f(obj);
        Object I3 = c0216p.I();
        if (f4 || I3 == C0208l.f2826a) {
            I3 = new G(function1);
            c0216p.c0(I3);
        }
    }

    public static final void e(C0216p c0216p, Object obj, Function2 function2) {
        CoroutineContext h4 = c0216p.f2863b.h();
        boolean f4 = c0216p.f(obj);
        Object I3 = c0216p.I();
        if (f4 || I3 == C0208l.f2826a) {
            I3 = new T(h4, function2);
            c0216p.c0(I3);
        }
    }

    public static final void f(Object obj, Object obj2, Function2 function2, C0216p c0216p) {
        CoroutineContext h4 = c0216p.f2863b.h();
        boolean f4 = c0216p.f(obj) | c0216p.f(obj2);
        Object I3 = c0216p.I();
        if (f4 || I3 == C0208l.f2826a) {
            I3 = new T(h4, function2);
            c0216p.c0(I3);
        }
    }

    public static final void g(Function0 function0, C0216p c0216p) {
        C0244a c0244a = c0216p.f2857L.f3184b;
        c0244a.getClass();
        H.v vVar = H.v.f3219c;
        H.D d4 = c0244a.f3182h;
        d4.d0(vVar);
        j0.c.Q(d4, 0, function0);
        int i2 = d4.f3180n;
        int i4 = vVar.f3172a;
        int W3 = H.D.W(d4, i4);
        int i5 = vVar.f3173b;
        if (i2 == W3 && d4.f3181o == H.D.W(d4, i5)) {
            return;
        }
        StringBuilder sb = new StringBuilder();
        int i6 = 0;
        for (int i7 = 0; i7 < i4; i7++) {
            if (((1 << i7) & d4.f3180n) != 0) {
                if (i6 > 0) {
                    sb.append(", ");
                }
                sb.append(vVar.b(i7));
                i6++;
            }
        }
        String sb2 = sb.toString();
        StringBuilder p4 = AbstractC0017m.p(sb2, "StringBuilder().apply(builderAction).toString()");
        int i8 = 0;
        for (int i9 = 0; i9 < i5; i9++) {
            if (((1 << i9) & d4.f3181o) != 0) {
                if (i6 > 0) {
                    p4.append(", ");
                }
                p4.append(vVar.c(i9));
                i8++;
            }
        }
        String sb3 = p4.toString();
        Intrinsics.checkNotNullExpressionValue(sb3, "StringBuilder().apply(builderAction).toString()");
        StringBuilder sb4 = new StringBuilder("Error while pushing ");
        sb4.append(vVar);
        sb4.append(". Not all arguments were provided. Missing ");
        AbstractC0017m.t(sb4, i6, " int arguments (", sb2, ") and ");
        AbstractC0017m.u(sb4, i8, " object arguments (", sb3, ").");
        throw null;
    }

    public static final boolean h(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 67108864) != 0;
    }

    public static final int i(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 4];
    }

    public static final int j(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 3];
    }

    public static final boolean k(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 268435456) != 0;
    }

    public static final boolean l(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 536870912) != 0;
    }

    public static final boolean m(int[] iArr, int i2) {
        return (iArr[(i2 * 5) + 1] & 1073741824) != 0;
    }

    public static final int n(ArrayList arrayList, int i2, int i4) {
        int Q3 = Q(arrayList, i2, i4);
        return Q3 >= 0 ? Q3 : -(Q3 + 1);
    }

    public static final int o(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 1] & 67108863;
    }

    public static final int p(int[] iArr, int i2) {
        return iArr[(i2 * 5) + 2];
    }

    public static final void q(ArrayList arrayList, int i2, int i4) {
        int E3 = E(i2, arrayList);
        if (E3 < 0) {
            E3 = -(E3 + 1);
        }
        while (E3 < arrayList.size() && ((O) arrayList.get(E3)).f2728b < i4) {
            arrayList.remove(E3);
        }
    }

    public static final int r(int[] iArr, int i2) {
        int i4 = i2 * 5;
        return y(iArr[i4 + 1] >> 28) + iArr[i4 + 4];
    }

    public static final void s(int[] iArr, int i2, int i4) {
        P(i4 >= 0);
        iArr[(i2 * 5) + 3] = i4;
    }

    public static final void t(int[] iArr, int i2, int i4) {
        P(i4 >= 0 && i4 < 67108863);
        int i5 = (i2 * 5) + 1;
        iArr[i5] = i4 | (iArr[i5] & (-67108864));
    }

    public static final InterfaceC0191c0 u(Z2.B b4, C0216p c0216p) {
        return v(b4, b4.getValue(), kotlin.coroutines.i.f7498d, c0216p, 0, 0);
    }

    public static final InterfaceC0191c0 v(Z2.D d4, Object obj, CoroutineContext coroutineContext, C0216p c0216p, int i2, int i4) {
        if ((i4 & 2) != 0) {
            coroutineContext = kotlin.coroutines.i.f7498d;
        }
        boolean h4 = c0216p.h(coroutineContext) | c0216p.h(d4);
        Object I3 = c0216p.I();
        Object obj2 = C0208l.f2826a;
        if (h4 || I3 == obj2) {
            I3 = new S0(coroutineContext, d4, null);
            c0216p.c0(I3);
        }
        Function2 function2 = (Function2) I3;
        Object I4 = c0216p.I();
        if (I4 == obj2) {
            I4 = K(obj, W.f2779l);
            c0216p.c0(I4);
        }
        InterfaceC0191c0 interfaceC0191c0 = (InterfaceC0191c0) I4;
        boolean h5 = c0216p.h(function2);
        Object I5 = c0216p.I();
        if (h5 || I5 == obj2) {
            I5 = new P0(function2, interfaceC0191c0, null);
            c0216p.c0(I5);
        }
        f(d4, coroutineContext, (Function2) I5, c0216p);
        return interfaceC0191c0;
    }

    public static final void w(String str) {
        throw new C0206k(AbstractC0017m.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final void x(String str) {
        throw new C0206k(AbstractC0017m.j("Compose Runtime internal error. Unexpected or incorrect use of the Compose internal runtime API (", str, "). Please report to Google or use https://goo.gle/compose-feedback"));
    }

    public static final int y(int i2) {
        switch (i2) {
            case 0:
                return 0;
            case 1:
            case 2:
            case 4:
                return 1;
            case 3:
            case 5:
            case 6:
                return 2;
            default:
                return 3;
        }
    }

    public static final b3.c z(kotlin.coroutines.i iVar, C0216p c0216p) {
        C0299v key = C0299v.f4296e;
        iVar.getClass();
        Intrinsics.checkNotNullParameter(key, "key");
        CoroutineContext h4 = c0216p.f2863b.h();
        return W2.B.a(h4.s(new W2.e0((InterfaceC0280c0) h4.k(key))).s(iVar));
    }
}
