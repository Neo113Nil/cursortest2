package m0;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public static final Object f4876a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public static final h0 f4877b = new h0();

    /* JADX WARN: Removed duplicated region for block: B:21:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(l.q qVar, u0.c cVar, s sVar, int i) {
        w2 w2Var;
        boolean z3;
        t1 r7;
        sVar.W(-149765515);
        n0 n0Var = sVar.f5095x;
        o1 l3 = sVar.l();
        sVar.T(201, t.f5109b);
        Object K = sVar.K();
        if (q6.i.a(K, n.f5019a)) {
            w2Var = null;
        } else {
            q6.i.c(K, "null cannot be cast to non-null type androidx.compose.runtime.ValueHolder<kotlin.Any?>");
            w2Var = (w2) K;
        }
        r1 r1Var = (r1) qVar.f4382d;
        w2 c8 = r1Var.c(qVar, w2Var);
        boolean equals = c8.equals(w2Var);
        if (!equals) {
            sVar.f0(c8);
        }
        if (sVar.S) {
            if (qVar.f4381c || !((u0.g) l3).containsKey(r1Var)) {
                l3 = ((u0.g) l3).b(r1Var, c8);
            }
            sVar.J = true;
        } else {
            e2 e2Var = sVar.G;
            Object b8 = e2Var.b(e2Var.f4908b, e2Var.f4913g);
            q6.i.c(b8, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            o1 o1Var = (o1) b8;
            if (!(sVar.z() && equals) && (qVar.f4381c || !((u0.g) l3).containsKey(r1Var))) {
                l3 = ((u0.g) l3).b(r1Var, c8);
            } else if ((equals && !sVar.f5094w) || !sVar.f5094w) {
                l3 = o1Var;
            }
            if (sVar.f5096y || o1Var != l3) {
                z3 = true;
                if (z3 && !sVar.S) {
                    sVar.I(l3);
                }
                n0Var.c(sVar.f5094w ? 1 : 0);
                sVar.f5094w = z3;
                sVar.K = l3;
                sVar.R(202, 0, t.f5110c, l3);
                cVar.g(sVar, Integer.valueOf((i >> 3) & 14));
                sVar.p(false);
                sVar.p(false);
                sVar.f5094w = n0Var.b() != 0;
                sVar.K = null;
                r7 = sVar.r();
                if (r7 == null) {
                    r7.f5121d = new b6.i0(i, 3, qVar, cVar);
                    return;
                }
                return;
            }
        }
        z3 = false;
        if (z3) {
            sVar.I(l3);
        }
        n0Var.c(sVar.f5094w ? 1 : 0);
        sVar.f5094w = z3;
        sVar.K = l3;
        sVar.R(202, 0, t.f5110c, l3);
        cVar.g(sVar, Integer.valueOf((i >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f5094w = n0Var.b() != 0;
        sVar.K = null;
        r7 = sVar.r();
        if (r7 == null) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x00a5  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:17:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object, m0.o1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void b(l.q[] qVarArr, p6.e eVar, s sVar, int i) {
        u0.g e02;
        boolean z3;
        t1 r7;
        sVar.W(415205898);
        n0 n0Var = sVar.f5095x;
        o1 l3 = sVar.l();
        sVar.T(201, t.f5109b);
        if (sVar.S) {
            e02 = sVar.e0(l3, x(qVarArr, l3, u0.g.f7151g));
            sVar.J = true;
        } else {
            e2 e2Var = sVar.G;
            Object h8 = e2Var.h(e2Var.f4913g, 0);
            q6.i.c(h8, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            ?? r22 = (o1) h8;
            e2 e2Var2 = sVar.G;
            Object h9 = e2Var2.h(e2Var2.f4913g, 1);
            q6.i.c(h9, "null cannot be cast to non-null type androidx.compose.runtime.PersistentCompositionLocalMap");
            o1 o1Var = (o1) h9;
            u0.g x7 = x(qVarArr, l3, o1Var);
            if (sVar.z() && !sVar.f5096y && o1Var.equals(x7)) {
                sVar.f5083l = sVar.G.s() + sVar.f5083l;
                e02 = r22;
            } else {
                e02 = sVar.e0(l3, x7);
                if (sVar.f5096y || !q6.i.a(e02, r22)) {
                    z3 = true;
                    if (z3 && !sVar.S) {
                        sVar.I(e02);
                    }
                    n0Var.c(sVar.f5094w ? 1 : 0);
                    sVar.f5094w = z3;
                    sVar.K = e02;
                    sVar.R(202, 0, t.f5110c, e02);
                    eVar.g(sVar, Integer.valueOf((i >> 3) & 14));
                    sVar.p(false);
                    sVar.p(false);
                    sVar.f5094w = n0Var.b() != 0;
                    sVar.K = null;
                    r7 = sVar.r();
                    if (r7 == null) {
                        r7.f5121d = new b6.i0(i, 4, qVarArr, eVar);
                        return;
                    }
                    return;
                }
            }
        }
        z3 = false;
        if (z3) {
            sVar.I(e02);
        }
        n0Var.c(sVar.f5094w ? 1 : 0);
        sVar.f5094w = z3;
        sVar.K = e02;
        sVar.R(202, 0, t.f5110c, e02);
        eVar.g(sVar, Integer.valueOf((i >> 3) & 14));
        sVar.p(false);
        sVar.p(false);
        sVar.f5094w = n0Var.b() != 0;
        sVar.K = null;
        r7 = sVar.r();
        if (r7 == null) {
        }
    }

    public static final void c(Object obj, Object obj2, p6.c cVar, s sVar) {
        boolean f6 = sVar.f(obj) | sVar.f(obj2);
        Object K = sVar.K();
        if (f6 || K == n.f5019a) {
            K = new f0(cVar);
            sVar.f0(K);
        }
    }

    public static final void d(Object obj, p6.c cVar, s sVar) {
        boolean f6 = sVar.f(obj);
        Object K = sVar.K();
        if (f6 || K == n.f5019a) {
            K = new f0(cVar);
            sVar.f0(K);
        }
    }

    public static final void e(Object obj, Object obj2, p6.e eVar, s sVar) {
        g6.h hVar = sVar.R;
        boolean f6 = sVar.f(obj) | sVar.f(obj2);
        Object K = sVar.K();
        if (f6 || K == n.f5019a) {
            K = new t0(hVar, eVar);
            sVar.f0(K);
        }
    }

    public static final void f(Object obj, s sVar, p6.e eVar) {
        g6.h hVar = sVar.R;
        boolean f6 = sVar.f(obj);
        Object K = sVar.K();
        if (f6 || K == n.f5019a) {
            K = new t0(hVar, eVar);
            sVar.f0(K);
        }
    }

    public static final void g(p6.a aVar, s sVar) {
        n0.l0 l0Var = sVar.M.f5248b.f5245b;
        l0Var.b0(n0.b0.f5258c);
        m.a.O(l0Var, 0, aVar);
    }

    public static final void h(o.w wVar, int i) {
        if (wVar.f5560b == 0 || !(wVar.b(0) == i || wVar.b(wVar.f5560b - 1) == i)) {
            int i8 = wVar.f5560b;
            wVar.a(i);
            while (i8 > 0) {
                int i9 = ((i8 + 1) >>> 1) - 1;
                int b8 = wVar.b(i9);
                if (i <= b8) {
                    break;
                }
                wVar.d(i8, b8);
                i8 = i9;
            }
            wVar.d(i8, i);
        }
    }

    public static void i(i2 i2Var, List list, y yVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int c8 = i2Var.c((a) list.get(i));
            int M = i2Var.M(i2Var.f4953b, i2Var.r(c8));
            Object obj = M < i2Var.g(i2Var.f4953b, i2Var.r(c8 + 1)) ? i2Var.f4954c[i2Var.h(M)] : n.f5019a;
            t1 t1Var = obj instanceof t1 ? (t1) obj : null;
            if (t1Var != null) {
                t1Var.f5118a = yVar;
            }
        }
    }

    public static final z0 j(d7.f fVar, Object obj, g6.h hVar, s sVar, int i, int i8) {
        if ((i8 & 2) != 0) {
            hVar = g6.i.f3046d;
        }
        boolean h8 = sVar.h(hVar) | sVar.h(fVar);
        Object K = sVar.K();
        g6.c cVar = null;
        Object obj2 = n.f5019a;
        if (h8 || K == obj2) {
            K = new b0.c(hVar, fVar, cVar, 6);
            sVar.f0(K);
        }
        p6.e eVar = (p6.e) K;
        Object K2 = sVar.K();
        if (K2 == obj2) {
            K2 = q(obj);
            sVar.f0(K2);
        }
        z0 z0Var = (z0) K2;
        boolean h9 = sVar.h(eVar);
        Object K3 = sVar.K();
        if (h9 || K3 == obj2) {
            K3 = new p2(eVar, z0Var, cVar, 1);
            sVar.f0(K3);
        }
        e(fVar, hVar, (p6.e) K3, sVar);
        return z0Var;
    }

    public static final z0 k(d7.l0 l0Var, s sVar) {
        return j(l0Var, l0Var.getValue(), g6.i.f3046d, sVar, 0, 0);
    }

    public static final a7.u l(s sVar) {
        return new d2(sVar.R);
    }

    public static final o0.e m() {
        a0.g1 g1Var = o2.f5034b;
        o0.e eVar = (o0.e) g1Var.l();
        if (eVar != null) {
            return eVar;
        }
        o0.e eVar2 = new o0.e(new r[0]);
        g1Var.I(eVar2);
        return eVar2;
    }

    public static final e0 n(p6.a aVar) {
        a0.g1 g1Var = o2.f5033a;
        return new e0(aVar, null);
    }

    public static final w0 o(g6.h hVar) {
        w0 w0Var = (w0) hVar.l(v0.f5132e);
        if (w0Var != null) {
            return w0Var;
        }
        throw new IllegalStateException("A MonotonicFrameClock is not available in this CoroutineContext. Callers should supply an appropriate MonotonicFrameClock using withContext.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static List p(i2 i2Var, int i, i2 i2Var2, boolean z3, boolean z7, boolean z8) {
        d6.u uVar;
        boolean z9;
        int i8;
        int i9;
        int t3 = i2Var.t(i);
        int i10 = i + t3;
        int f6 = i2Var.f(i);
        int f8 = i2Var.f(i10);
        int i11 = f8 - f6;
        boolean z10 = i >= 0 && (i2Var.f4953b[(i2Var.r(i) * 5) + 1] & 201326592) != 0;
        i2Var2.v(t3);
        i2Var2.w(i11, i2Var2.f4970t);
        if (i2Var.f4958g < i10) {
            i2Var.A(i10);
        }
        if (i2Var.f4961k < f8) {
            i2Var.B(f8, i10);
        }
        int[] iArr = i2Var2.f4953b;
        int i12 = i2Var2.f4970t;
        int i13 = i12 * 5;
        d6.l.F(i13, i * 5, i10 * 5, i2Var.f4953b, iArr);
        Object[] objArr = i2Var2.f4954c;
        int i14 = i2Var2.i;
        System.arraycopy(i2Var.f4954c, f6, objArr, i14, i11);
        int i15 = i2Var2.f4972v;
        iArr[i13 + 2] = i15;
        int i16 = i12 - i;
        int i17 = i12 + t3;
        int g3 = i14 - i2Var2.g(iArr, i12);
        int i18 = i2Var2.f4963m;
        int i19 = i2Var2.f4962l;
        int length = objArr.length;
        boolean z11 = z10;
        int i20 = i18;
        int i21 = i12;
        while (i21 < i17) {
            if (i21 != i12) {
                int i22 = (i21 * 5) + 2;
                iArr[i22] = iArr[i22] + i16;
            }
            int[] iArr2 = iArr;
            int g7 = i2Var2.g(iArr, i21) + g3;
            if (i20 < i21) {
                i8 = i12;
                i9 = 0;
            } else {
                i8 = i12;
                i9 = i2Var2.f4961k;
            }
            iArr2[(i21 * 5) + 4] = i2.i(g7, i9, i19, length);
            if (i21 == i20) {
                i20++;
            }
            i21++;
            i12 = i8;
            iArr = iArr2;
        }
        int[] iArr3 = iArr;
        i2Var2.f4963m = i20;
        int b8 = h2.b(i2Var.f4955d, i, i2Var.p());
        int b9 = h2.b(i2Var.f4955d, i10, i2Var.p());
        if (b8 < b9) {
            ArrayList arrayList = i2Var.f4955d;
            ArrayList arrayList2 = new ArrayList(b9 - b8);
            for (int i23 = b8; i23 < b9; i23++) {
                a aVar = (a) arrayList.get(i23);
                aVar.f4874a += i16;
                arrayList2.add(aVar);
            }
            i2Var2.f4955d.addAll(h2.b(i2Var2.f4955d, i2Var2.f4970t, i2Var2.p()), arrayList2);
            arrayList.subList(b8, b9).clear();
            uVar = arrayList2;
        } else {
            uVar = d6.u.f2326d;
        }
        if (!uVar.isEmpty()) {
            HashMap hashMap = i2Var.f4956e;
            HashMap hashMap2 = i2Var2.f4956e;
            if (hashMap != null && hashMap2 != null) {
                int size = uVar.size();
                for (int i24 = 0; i24 < size; i24++) {
                }
            }
        }
        int i25 = i2Var2.f4972v;
        i2Var2.N(i15);
        int D = i2Var.D(i2Var.f4953b, i);
        if (!z8) {
            z9 = false;
        } else if (z3) {
            boolean z12 = D >= 0;
            if (z12) {
                i2Var.O();
                i2Var.a(D - i2Var.f4970t);
                i2Var.O();
            }
            i2Var.a(i - i2Var.f4970t);
            boolean G = i2Var.G();
            if (z12) {
                i2Var.L();
                i2Var.j();
                i2Var.L();
                i2Var.j();
            }
            z9 = G;
        } else {
            boolean H = i2Var.H(i, t3);
            i2Var.I(f6, i11, i - 1);
            z9 = H;
        }
        if (z9) {
            t.c("Unexpectedly removed anchors");
        }
        int i26 = i2Var2.f4965o;
        int i27 = iArr3[i13 + 1];
        i2Var2.f4965o = i26 + ((1073741824 & i27) != 0 ? 1 : i27 & 67108863);
        if (z7) {
            i2Var2.f4970t = i17;
            i2Var2.i = i14 + i11;
        }
        if (z11) {
            i2Var2.S(i15);
        }
        return uVar;
    }

    public static h1 q(Object obj) {
        return new h1(obj, v0.i);
    }

    public static final Object r(o1 o1Var, r1 r1Var) {
        q6.i.c(r1Var, "null cannot be cast to non-null type androidx.compose.runtime.CompositionLocal<kotlin.Any?>");
        u0.g gVar = (u0.g) o1Var;
        Object obj = gVar.get(r1Var);
        if (obj == null) {
            obj = r1Var.b();
        }
        return ((w2) obj).a(gVar);
    }

    public static final q s(s sVar) {
        s sVar2;
        sVar.T(206, t.f5112e);
        if (sVar.S) {
            i2.y(sVar.I);
        }
        Object C = sVar.C();
        p pVar = C instanceof p ? (p) C : null;
        if (pVar == null) {
            sVar2 = sVar;
            pVar = new p(new q(sVar2, sVar.T, sVar.f5088q, sVar.C, sVar.f5080h.f5182w));
            sVar2.g0(pVar);
        } else {
            sVar2 = sVar;
        }
        q qVar = pVar.f5035d;
        qVar.f5050f.setValue(sVar2.l());
        sVar2.p(false);
        return qVar;
    }

    public static final z0 t(Object obj, s sVar) {
        Object K = sVar.K();
        if (K == n.f5019a) {
            K = q(obj);
            sVar.f0(K);
        }
        z0 z0Var = (z0) K;
        z0Var.setValue(obj);
        return z0Var;
    }

    public static final void u(Object obj, s sVar, p6.e eVar) {
        if (sVar.S || !q6.i.a(sVar.K(), obj)) {
            sVar.f0(obj);
            sVar.b(obj, eVar);
        }
    }

    public static final int v(o.w wVar) {
        int b8;
        int i = wVar.f5560b;
        int b9 = wVar.b(0);
        while (wVar.f5560b != 0 && wVar.b(0) == b9) {
            int i8 = wVar.f5560b;
            if (i8 == 0) {
                p.a.e("IntList is empty.");
                throw null;
            }
            wVar.d(0, wVar.f5559a[i8 - 1]);
            wVar.c(wVar.f5560b - 1);
            int i9 = wVar.f5560b;
            int i10 = i9 >>> 1;
            int i11 = 0;
            while (i11 < i10) {
                int b10 = wVar.b(i11);
                int i12 = (i11 + 1) * 2;
                int i13 = i12 - 1;
                int b11 = wVar.b(i13);
                if (i12 >= i9 || (b8 = wVar.b(i12)) <= b11) {
                    if (b11 > b10) {
                        wVar.d(i11, b11);
                        wVar.d(i13, b10);
                        i11 = i13;
                    }
                } else if (b8 > b10) {
                    wVar.d(i11, b8);
                    wVar.d(i12, b10);
                    i11 = i12;
                }
            }
        }
        return b9;
    }

    public static final int w(int i) {
        int i8 = 306783378 & i;
        int i9 = 613566756 & i;
        return (i & (-920350135)) | (i9 >> 1) | i8 | ((i8 << 1) & i9);
    }

    public static final u0.g x(l.q[] qVarArr, o1 o1Var, o1 o1Var2) {
        u0.f fVar = new u0.f(u0.g.f7151g);
        for (l.q qVar : qVarArr) {
            r1 r1Var = (r1) qVar.f4382d;
            if (qVar.f4381c || !((u0.g) o1Var).containsKey(r1Var)) {
                fVar.put(r1Var, r1Var.c(qVar, (w2) ((u0.g) o1Var2).get(r1Var)));
            }
        }
        return fVar.a();
    }
}
