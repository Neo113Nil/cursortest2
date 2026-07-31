package t0;

import e2.AbstractC0381e;
import m.AbstractC0600j;
import u0.C0997t;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final D f7837a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7839c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7840d;

    /* renamed from: i, reason: collision with root package name */
    public M0.a f7845i;

    /* renamed from: b, reason: collision with root package name */
    public final C2.c f7838b = new C2.c(10);

    /* renamed from: e, reason: collision with root package name */
    public final C2.c f7841e = new C2.c(12);

    /* renamed from: f, reason: collision with root package name */
    public final K.d f7842f = new K.d(new D[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f7843g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final K.d f7844h = new K.d(new Q[16]);

    public S(D d3) {
        this.f7837a = d3;
    }

    public static boolean b(D d3, M0.a aVar) {
        boolean j02;
        D d4 = d3.f7718f;
        if (d4 == null) {
            return false;
        }
        L l3 = d3.f7736y;
        if (aVar != null) {
            if (d4 != null) {
                I i3 = l3.f7814s;
                Z1.i.c(i3);
                j02 = i3.j0(aVar.f2760a);
            }
            j02 = false;
        } else {
            I i4 = l3.f7814s;
            M0.a aVar2 = i4 != null ? i4.p : null;
            if (aVar2 != null && d4 != null) {
                Z1.i.c(i4);
                j02 = i4.j0(aVar2.f2760a);
            }
            j02 = false;
        }
        D q2 = d3.q();
        if (j02 && q2 != null) {
            if (q2.f7718f == null) {
                D.R(q2, false, 3);
            } else if (d3.p() == 1) {
                D.P(q2, false, 3);
            } else if (d3.p() == 2) {
                q2.O(false);
            }
        }
        return j02;
    }

    public static boolean c(D d3, M0.a aVar) {
        boolean J3 = aVar != null ? d3.J(aVar) : D.K(d3);
        D q2 = d3.q();
        if (J3 && q2 != null) {
            int i3 = d3.f7736y.f7813r.f7783n;
            if (i3 == 1) {
                D.R(q2, false, 3);
            } else if (i3 == 2) {
                q2.Q(false);
            }
        }
        return J3;
    }

    public static boolean h(D d3) {
        return d3.f7736y.f7800d && i(d3);
    }

    public static boolean i(D d3) {
        J j3 = d3.f7736y.f7813r;
        return j3.f7783n == 1 || j3.f7791w.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z3) {
        Object[] objArr;
        C2.c cVar = this.f7841e;
        if (z3) {
            K.d dVar = (K.d) cVar.f484e;
            dVar.h();
            D d3 = this.f7837a;
            dVar.b(d3);
            d3.f7712E = true;
        }
        e0 e0Var = e0.f7909b;
        K.d dVar2 = (K.d) cVar.f484e;
        dVar2.q(e0Var);
        int i3 = dVar2.f2642f;
        D[] dArr = (D[]) cVar.f485f;
        if (dArr != null) {
            int length = dArr.length;
            objArr = dArr;
        }
        objArr = new D[Math.max(16, i3)];
        cVar.f485f = null;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = dVar2.f2640d[i4];
        }
        dVar2.h();
        for (int i5 = i3 - 1; -1 < i5; i5--) {
            D d4 = objArr[i5];
            Z1.i.c(d4);
            if (d4.f7712E) {
                C2.c.m(d4);
            }
        }
        cVar.f485f = objArr;
    }

    public final void d() {
        K.d dVar = this.f7844h;
        if (dVar.m()) {
            int i3 = dVar.f2642f;
            if (i3 > 0) {
                Object[] objArr = dVar.f2640d;
                int i4 = 0;
                do {
                    Q q2 = (Q) objArr[i4];
                    if (q2.f7834a.B()) {
                        boolean z3 = q2.f7835b;
                        boolean z4 = q2.f7836c;
                        D d3 = q2.f7834a;
                        if (z3) {
                            D.P(d3, z4, 2);
                        } else {
                            D.R(d3, z4, 2);
                        }
                    }
                    i4++;
                } while (i4 < i3);
            }
            dVar.h();
        }
    }

    public final void e(D d3) {
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (Z1.i.a(d4.D(), Boolean.TRUE) && !d4.f7713F) {
                    if (this.f7838b.k(d4, true)) {
                        d4.E();
                    }
                    e(d4);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void f(D d3, boolean z3) {
        C2.c cVar = this.f7838b;
        if (((r0) ((C2.c) (z3 ? cVar.f484e : cVar.f485f)).f485f).isEmpty()) {
            return;
        }
        if (!this.f7839c) {
            AbstractC0381e.N("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z3 ? d3.f7736y.f7803g : d3.f7736y.f7800d) {
            AbstractC0381e.M("node not yet measured");
            throw null;
        }
        g(d3, z3);
    }

    public final void g(D d3, boolean z3) {
        I i3;
        E e3;
        K.d t3 = d3.t();
        int i4 = t3.f2642f;
        C2.c cVar = this.f7838b;
        if (i4 > 0) {
            Object[] objArr = t3.f2640d;
            int i5 = 0;
            do {
                D d4 = (D) objArr[i5];
                if ((!z3 && i(d4)) || (z3 && (d4.p() == 1 || ((i3 = d4.f7736y.f7814s) != null && (e3 = i3.f7765t) != null && e3.e())))) {
                    boolean p = AbstractC0898f.p(d4);
                    L l3 = d4.f7736y;
                    if (p && !z3) {
                        if (l3.f7803g && cVar.k(d4, true)) {
                            m(d4, true, false);
                        } else {
                            f(d4, true);
                        }
                    }
                    if ((z3 ? l3.f7803g : l3.f7800d) && cVar.k(d4, z3)) {
                        m(d4, z3, false);
                    }
                    if (!(z3 ? l3.f7803g : l3.f7800d)) {
                        g(d4, z3);
                    }
                }
                i5++;
            } while (i5 < i4);
        }
        L l4 = d3.f7736y;
        if ((z3 ? l4.f7803g : l4.f7800d) && cVar.k(d3, z3)) {
            m(d3, z3, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 U.k, still in use, count: 2, list:
          (r13v1 U.k) from 0x009d: IF  (r13v1 U.k) == (null U.k)  -> B:83:0x0105 A[HIDDEN] (LINE:158)
          (r13v1 U.k) from 0x00a1: PHI (r13v2 U.k) = (r13v1 U.k) binds: [B:90:0x009d] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v15 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r12v6, types: [U.k] */
    public final boolean j(u0.C0995s r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.S.j(u0.s):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 U.k, still in use, count: 2, list:
          (r12v1 U.k) from 0x00b3: IF  (r12v1 U.k) == (null U.k)  -> B:84:0x011d A[HIDDEN] (LINE:180)
          (r12v1 U.k) from 0x00b7: PHI (r12v2 U.k) = (r12v1 U.k) binds: [B:91:0x00b3] A[DONT_GENERATE, DONT_INLINE]
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:125)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:62)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:45)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:67)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1117)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.lambda$traverseInternal$0(DepthRegionTraversal.java:68)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:68)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:19)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:35)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:34)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [U.k] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, t0.D] */
    public final void k(t0.D r17, long r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.S.k(t0.D, long):void");
    }

    public final void l() {
        C2.c cVar = this.f7838b;
        if (cVar.n()) {
            D d3 = this.f7837a;
            if (!d3.B()) {
                AbstractC0381e.M("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!d3.C()) {
                AbstractC0381e.M("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f7839c) {
                AbstractC0381e.M("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f7845i != null) {
                this.f7839c = true;
                this.f7840d = false;
                try {
                    if (!((r0) ((C2.c) cVar.f484e).f485f).isEmpty()) {
                        if (d3.f7718f != null) {
                            o(d3, true);
                        } else {
                            n(d3);
                        }
                    }
                    o(d3, false);
                    this.f7839c = false;
                    this.f7840d = false;
                } catch (Throwable th) {
                    this.f7839c = false;
                    this.f7840d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(D d3, boolean z3, boolean z4) {
        M0.a aVar;
        r0.G placementScope;
        C0911t c0911t;
        D q2;
        I i3;
        E e3;
        I i4;
        E e4;
        if (d3.f7713F) {
            return false;
        }
        boolean C = d3.C();
        L l3 = d3.f7736y;
        if (C || l3.f7813r.f7790v || h(d3) || Z1.i.a(d3.D(), Boolean.TRUE) || ((l3.f7803g && (d3.p() == 1 || ((i4 = l3.f7814s) != null && (e4 = i4.f7765t) != null && e4.e()))) || l3.f7813r.f7791w.e() || ((i3 = l3.f7814s) != null && (e3 = i3.f7765t) != null && e3.e()))) {
            D d4 = this.f7837a;
            if (d3 == d4) {
                aVar = this.f7845i;
                Z1.i.c(aVar);
            } else {
                aVar = null;
            }
            if (z3) {
                r1 = l3.f7803g ? b(d3, aVar) : false;
                if (z4 && ((r1 || l3.f7804h) && Z1.i.a(d3.D(), Boolean.TRUE))) {
                    d3.E();
                }
            } else {
                boolean c3 = l3.f7800d ? c(d3, aVar) : false;
                if (z4 && l3.f7801e && (d3 == d4 || ((q2 = d3.q()) != null && q2.C() && l3.f7813r.f7790v))) {
                    if (d3 == d4) {
                        if (d3.f7714G == 3) {
                            d3.g();
                        }
                        D q3 = d3.q();
                        if (q3 == null || (c0911t = (C0911t) q3.f7735x.f2353c) == null || (placementScope = c0911t.f7826l) == null) {
                            placementScope = ((C0997t) G.a(d3)).getPlacementScope();
                        }
                        r0.G.f(placementScope, l3.f7813r, 0, 0);
                    } else {
                        d3.N();
                    }
                    ((K.d) this.f7841e.f484e).b(d3);
                    d3.f7712E = true;
                }
                r1 = c3;
            }
            d();
        }
        return r1;
    }

    public final void n(D d3) {
        K.d t3 = d3.t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            Object[] objArr = t3.f2640d;
            int i4 = 0;
            do {
                D d4 = (D) objArr[i4];
                if (i(d4)) {
                    if (AbstractC0898f.p(d4)) {
                        o(d4, true);
                    } else {
                        n(d4);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void o(D d3, boolean z3) {
        M0.a aVar;
        if (d3.f7713F) {
            return;
        }
        if (d3 == this.f7837a) {
            aVar = this.f7845i;
            Z1.i.c(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(d3, aVar);
        } else {
            c(d3, aVar);
        }
    }

    public final boolean p(D d3, boolean z3) {
        int a3 = AbstractC0600j.a(d3.f7736y.f7799c);
        if (a3 == 0 || a3 == 1) {
            return false;
        }
        if (a3 == 2 || a3 == 3) {
            this.f7844h.b(new Q(d3, false, z3));
            return false;
        }
        if (a3 != 4) {
            throw new L1.f();
        }
        L l3 = d3.f7736y;
        if (l3.f7800d && !z3) {
            return false;
        }
        l3.f7800d = true;
        if (d3.f7713F) {
            return false;
        }
        if (!d3.C() && !h(d3)) {
            return false;
        }
        D q2 = d3.q();
        if (q2 == null || !q2.f7736y.f7800d) {
            this.f7838b.j(d3, false);
        }
        return !this.f7840d;
    }

    public final void q(long j3) {
        M0.a aVar = this.f7845i;
        if (aVar == null ? false : M0.a.b(aVar.f2760a, j3)) {
            return;
        }
        if (this.f7839c) {
            AbstractC0381e.M("updateRootConstraints called while measuring");
            throw null;
        }
        this.f7845i = new M0.a(j3);
        D d3 = this.f7837a;
        D d4 = d3.f7718f;
        L l3 = d3.f7736y;
        if (d4 != null) {
            l3.f7803g = true;
        }
        l3.f7800d = true;
        this.f7838b.j(d3, d4 != null);
    }
}
