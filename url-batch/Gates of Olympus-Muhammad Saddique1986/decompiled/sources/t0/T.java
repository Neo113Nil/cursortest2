package t0;

import m.AbstractC0625j;
import n.z0;
import r0.AbstractC0892N;
import u0.C1123s;
import z.C1256t;

/* loaded from: classes.dex */
public final class T {

    /* renamed from: a, reason: collision with root package name */
    public final E f8667a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f8669c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f8670d;

    /* renamed from: i, reason: collision with root package name */
    public O0.a f8675i;

    /* renamed from: b, reason: collision with root package name */
    public final C1256t f8668b = new C1256t(14);

    /* renamed from: e, reason: collision with root package name */
    public final C1256t f8671e = new C1256t(17);

    /* renamed from: f, reason: collision with root package name */
    public final K.d f8672f = new K.d(new E[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f8673g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final K.d f8674h = new K.d(new S[16]);

    public T(E e3) {
        this.f8667a = e3;
    }

    public static boolean b(E e3, O0.a aVar) {
        boolean t02;
        E e4 = e3.f8542f;
        if (e4 == null) {
            return false;
        }
        M m3 = e3.f8562z;
        if (aVar != null) {
            if (e4 != null) {
                J j3 = m3.f8643s;
                f2.j.c(j3);
                t02 = j3.t0(aVar.f3725a);
            }
            t02 = false;
        } else {
            J j4 = m3.f8643s;
            O0.a aVar2 = j4 != null ? j4.f8587p : null;
            if (aVar2 != null && e4 != null) {
                f2.j.c(j4);
                t02 = j4.t0(aVar2.f3725a);
            }
            t02 = false;
        }
        E s3 = e3.s();
        if (t02 && s3 != null) {
            if (s3.f8542f == null) {
                E.T(s3, false, 3);
            } else if (e3.q() == 1) {
                E.R(s3, false, 3);
            } else if (e3.q() == 2) {
                s3.Q(false);
            }
        }
        return t02;
    }

    public static boolean c(E e3, O0.a aVar) {
        boolean K3 = aVar != null ? e3.K(aVar) : E.M(e3);
        E s3 = e3.s();
        if (K3 && s3 != null) {
            int i3 = e3.f8562z.f8642r.f8610n;
            if (i3 == 1) {
                E.T(s3, false, 3);
            } else if (i3 == 2) {
                s3.S(false);
            }
        }
        return K3;
    }

    public static boolean h(E e3) {
        return e3.f8562z.f8628d && i(e3);
    }

    public static boolean i(E e3) {
        K k3 = e3.f8562z.f8642r;
        return k3.f8610n == 1 || k3.f8619w.e();
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
        C1256t c1256t = this.f8671e;
        if (z3) {
            K.d dVar = (K.d) c1256t.f10466e;
            dVar.h();
            E e3 = this.f8667a;
            dVar.b(e3);
            e3.f8536F = true;
        }
        f0 f0Var = f0.f8744b;
        K.d dVar2 = (K.d) c1256t.f10466e;
        dVar2.q(f0Var);
        int i3 = dVar2.f3216f;
        E[] eArr = (E[]) c1256t.f10467f;
        if (eArr != null) {
            int length = eArr.length;
            objArr = eArr;
        }
        objArr = new E[Math.max(16, i3)];
        c1256t.f10467f = null;
        for (int i4 = 0; i4 < i3; i4++) {
            objArr[i4] = dVar2.f3214d[i4];
        }
        dVar2.h();
        for (int i5 = i3 - 1; -1 < i5; i5--) {
            E e4 = objArr[i5];
            f2.j.c(e4);
            if (e4.f8536F) {
                C1256t.l(e4);
            }
        }
        c1256t.f10467f = objArr;
    }

    public final void d() {
        K.d dVar = this.f8674h;
        if (dVar.m()) {
            int i3 = dVar.f3216f;
            if (i3 > 0) {
                Object[] objArr = dVar.f3214d;
                int i4 = 0;
                do {
                    S s3 = (S) objArr[i4];
                    if (s3.f8664a.D()) {
                        boolean z3 = s3.f8665b;
                        boolean z4 = s3.f8666c;
                        E e3 = s3.f8664a;
                        if (z3) {
                            E.R(e3, z4, 2);
                        } else {
                            E.T(e3, z4, 2);
                        }
                    }
                    i4++;
                } while (i4 < i3);
            }
            dVar.h();
        }
    }

    public final void e(E e3) {
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (f2.j.a(e4.F(), Boolean.TRUE) && !e4.f8537G) {
                    if (this.f8668b.j(e4, true)) {
                        e4.G();
                    }
                    e(e4);
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void f(E e3, boolean z3) {
        C1256t c1256t = this.f8668b;
        if (((s0) ((C1256t) (z3 ? c1256t.f10466e : c1256t.f10467f)).f10466e).isEmpty()) {
            return;
        }
        if (!this.f8669c) {
            z0.o("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z3 ? e3.f8562z.f8631g : e3.f8562z.f8628d) {
            z0.n("node not yet measured");
            throw null;
        }
        g(e3, z3);
    }

    public final void g(E e3, boolean z3) {
        J j3;
        F f3;
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        C1256t c1256t = this.f8668b;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if ((!z3 && i(e4)) || (z3 && (e4.q() == 1 || ((j3 = e4.f8562z.f8643s) != null && (f3 = j3.f8591t) != null && f3.e())))) {
                    boolean p3 = AbstractC0993f.p(e4);
                    M m3 = e4.f8562z;
                    if (p3 && !z3) {
                        if (m3.f8631g && c1256t.j(e4, true)) {
                            m(e4, true, false);
                        } else {
                            f(e4, true);
                        }
                    }
                    if ((z3 ? m3.f8631g : m3.f8628d) && c1256t.j(e4, z3)) {
                        m(e4, z3, false);
                    }
                    if (!(z3 ? m3.f8631g : m3.f8628d)) {
                        g(e4, z3);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
        M m4 = e3.f8562z;
        if ((z3 ? m4.f8631g : m4.f8628d) && c1256t.j(e3, z3)) {
            m(e3, z3, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 U.p, still in use, count: 2, list:
          (r13v1 U.p) from 0x009d: IF  (r13v1 U.p) == (null U.p)  -> B:83:0x0105 A[HIDDEN] (LINE:158)
          (r13v1 U.p) from 0x00a1: PHI (r13v2 U.p) = (r13v1 U.p) binds: [B:90:0x009d] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r12v6, types: [U.p] */
    public final boolean j(u0.C1120q r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.T.j(u0.q):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 U.p, still in use, count: 2, list:
          (r12v1 U.p) from 0x00b3: IF  (r12v1 U.p) == (null U.p)  -> B:84:0x011d A[HIDDEN] (LINE:180)
          (r12v1 U.p) from 0x00b7: PHI (r12v2 U.p) = (r12v1 U.p) binds: [B:91:0x00b3] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r11v6, types: [U.p] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, t0.E] */
    public final void k(t0.E r17, long r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: t0.T.k(t0.E, long):void");
    }

    public final void l() {
        C1256t c1256t = this.f8668b;
        if (c1256t.p()) {
            E e3 = this.f8667a;
            if (!e3.D()) {
                z0.n("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!e3.E()) {
                z0.n("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f8669c) {
                z0.n("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f8675i != null) {
                this.f8669c = true;
                this.f8670d = false;
                try {
                    if (!((s0) ((C1256t) c1256t.f10466e).f10466e).isEmpty()) {
                        if (e3.f8542f != null) {
                            o(e3, true);
                        } else {
                            n(e3);
                        }
                    }
                    o(e3, false);
                    this.f8669c = false;
                    this.f8670d = false;
                } catch (Throwable th) {
                    this.f8669c = false;
                    this.f8670d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(E e3, boolean z3, boolean z4) {
        O0.a aVar;
        AbstractC0892N placementScope;
        C1006t c1006t;
        E s3;
        J j3;
        F f3;
        J j4;
        F f4;
        if (e3.f8537G) {
            return false;
        }
        boolean E3 = e3.E();
        M m3 = e3.f8562z;
        if (E3 || m3.f8642r.f8618v || h(e3) || f2.j.a(e3.F(), Boolean.TRUE) || ((m3.f8631g && (e3.q() == 1 || ((j4 = m3.f8643s) != null && (f4 = j4.f8591t) != null && f4.e()))) || m3.f8642r.f8619w.e() || ((j3 = m3.f8643s) != null && (f3 = j3.f8591t) != null && f3.e()))) {
            E e4 = this.f8667a;
            if (e3 == e4) {
                aVar = this.f8675i;
                f2.j.c(aVar);
            } else {
                aVar = null;
            }
            if (z3) {
                r1 = m3.f8631g ? b(e3, aVar) : false;
                if (z4 && ((r1 || m3.f8632h) && f2.j.a(e3.F(), Boolean.TRUE))) {
                    e3.G();
                }
            } else {
                boolean c2 = m3.f8628d ? c(e3, aVar) : false;
                if (z4 && m3.f8629e && (e3 == e4 || ((s3 = e3.s()) != null && s3.E() && m3.f8642r.f8618v))) {
                    if (e3 == e4) {
                        if (e3.f8538H == 3) {
                            e3.g();
                        }
                        E s4 = e3.s();
                        if (s4 == null || (c1006t = (C1006t) s4.f8561y.f2912c) == null || (placementScope = c1006t.f8655l) == null) {
                            placementScope = ((C1123s) H.a(e3)).getPlacementScope();
                        }
                        AbstractC0892N.f(placementScope, m3.f8642r, 0, 0);
                    } else {
                        e3.P();
                    }
                    ((K.d) this.f8671e.f10466e).b(e3);
                    e3.f8536F = true;
                }
                r1 = c2;
            }
            d();
        }
        return r1;
    }

    public final void n(E e3) {
        K.d v3 = e3.v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            Object[] objArr = v3.f3214d;
            int i4 = 0;
            do {
                E e4 = (E) objArr[i4];
                if (i(e4)) {
                    if (AbstractC0993f.p(e4)) {
                        o(e4, true);
                    } else {
                        n(e4);
                    }
                }
                i4++;
            } while (i4 < i3);
        }
    }

    public final void o(E e3, boolean z3) {
        O0.a aVar;
        if (e3.f8537G) {
            return;
        }
        if (e3 == this.f8667a) {
            aVar = this.f8675i;
            f2.j.c(aVar);
        } else {
            aVar = null;
        }
        if (z3) {
            b(e3, aVar);
        } else {
            c(e3, aVar);
        }
    }

    public final boolean p(E e3, boolean z3) {
        int b3 = AbstractC0625j.b(e3.f8562z.f8627c);
        if (b3 == 0 || b3 == 1) {
            return false;
        }
        if (b3 == 2 || b3 == 3) {
            this.f8674h.b(new S(e3, false, z3));
            return false;
        }
        if (b3 != 4) {
            throw new C1.c();
        }
        M m3 = e3.f8562z;
        if (m3.f8628d && !z3) {
            return false;
        }
        m3.f8628d = true;
        if (e3.f8537G) {
            return false;
        }
        if (!e3.E() && !h(e3)) {
            return false;
        }
        E s3 = e3.s();
        if (s3 == null || !s3.f8562z.f8628d) {
            this.f8668b.h(e3, false);
        }
        return !this.f8670d;
    }

    public final void q(long j3) {
        O0.a aVar = this.f8675i;
        if (aVar == null ? false : O0.a.b(aVar.f3725a, j3)) {
            return;
        }
        if (this.f8669c) {
            z0.n("updateRootConstraints called while measuring");
            throw null;
        }
        this.f8675i = new O0.a(j3);
        E e3 = this.f8667a;
        E e4 = e3.f8542f;
        M m3 = e3.f8562z;
        if (e4 != null) {
            m3.f8631g = true;
        }
        m3.f8628d = true;
        this.f8668b.h(e3, e4 != null);
    }
}
