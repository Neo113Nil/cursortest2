package r0;

import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import n.AbstractC0864b;
import p0.AbstractC0953N;
import s0.C1166s;
import y2.C1338m;

/* loaded from: classes.dex */
public final class S {

    /* renamed from: a, reason: collision with root package name */
    public final E f9716a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f9718c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f9719d;

    /* renamed from: i, reason: collision with root package name */
    public M0.a f9724i;

    /* renamed from: b, reason: collision with root package name */
    public final l2.g f9717b = new l2.g(8);

    /* renamed from: e, reason: collision with root package name */
    public final l2.g f9720e = new l2.g(11);

    /* renamed from: f, reason: collision with root package name */
    public final I.d f9721f = new I.d(new E[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f9722g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final I.d f9723h = new I.d(new Q[16]);

    public S(E e4) {
        this.f9716a = e4;
    }

    public static boolean b(E e4, M0.a aVar) {
        boolean x02;
        E e5 = e4.f9596i;
        if (e5 == null) {
            return false;
        }
        L l4 = e4.f9584C;
        if (aVar != null) {
            if (e5 != null) {
                J j4 = l4.f9692s;
                Intrinsics.c(j4);
                x02 = j4.x0(aVar.f3539a);
            }
            x02 = false;
        } else {
            J j5 = l4.f9692s;
            M0.a aVar2 = j5 != null ? j5.f9640s : null;
            if (aVar2 != null && e5 != null) {
                Intrinsics.c(j5);
                x02 = j5.x0(aVar2.f3539a);
            }
            x02 = false;
        }
        E s4 = e4.s();
        if (x02 && s4 != null) {
            if (s4.f9596i == null) {
                E.T(s4, false, 3);
            } else if (e4.q() == 1) {
                E.R(s4, false, 3);
            } else if (e4.q() == 2) {
                s4.Q(false);
            }
        }
        return x02;
    }

    public static boolean c(E e4, M0.a aVar) {
        boolean K3 = aVar != null ? e4.K(aVar) : E.L(e4);
        E s4 = e4.s();
        if (K3 && s4 != null) {
            int i2 = e4.f9584C.f9691r.f9664q;
            if (i2 == 1) {
                E.T(s4, false, 3);
            } else if (i2 == 2) {
                s4.S(false);
            }
        }
        return K3;
    }

    public static boolean h(E e4) {
        return e4.f9584C.f9677d && i(e4);
    }

    public static boolean i(E e4) {
        K k4 = e4.f9584C.f9691r;
        return k4.f9664q == 1 || k4.f9673z.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r7) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z4) {
        Object[] objArr;
        l2.g gVar = this.f9720e;
        if (z4) {
            I.d dVar = (I.d) gVar.f7976b;
            dVar.g();
            E e4 = this.f9716a;
            dVar.b(e4);
            e4.f9590I = true;
        }
        e0 e0Var = e0.f9793b;
        I.d dVar2 = (I.d) gVar.f7976b;
        dVar2.p(e0Var);
        int i2 = dVar2.f3332i;
        E[] eArr = (E[]) gVar.f7977c;
        if (eArr != null) {
            int length = eArr.length;
            objArr = eArr;
        }
        objArr = new E[Math.max(16, i2)];
        gVar.f7977c = null;
        for (int i4 = 0; i4 < i2; i4++) {
            objArr[i4] = dVar2.f3330d[i4];
        }
        dVar2.g();
        for (int i5 = i2 - 1; -1 < i5; i5--) {
            E e5 = objArr[i5];
            Intrinsics.c(e5);
            if (e5.f9590I) {
                l2.g.g(e5);
            }
        }
        gVar.f7977c = objArr;
    }

    public final void d() {
        I.d dVar = this.f9723h;
        if (dVar.l()) {
            int i2 = dVar.f3332i;
            if (i2 > 0) {
                Object[] objArr = dVar.f3330d;
                int i4 = 0;
                do {
                    Q q2 = (Q) objArr[i4];
                    if (q2.f9713a.D()) {
                        boolean z4 = q2.f9714b;
                        boolean z5 = q2.f9715c;
                        E e4 = q2.f9713a;
                        if (z4) {
                            E.R(e4, z5, 2);
                        } else {
                            E.T(e4, z5, 2);
                        }
                    }
                    i4++;
                } while (i4 < i2);
            }
            dVar.g();
        }
    }

    public final void e(E e4) {
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (Intrinsics.a(e5.F(), Boolean.TRUE) && !e5.f9591J) {
                    if (this.f9717b.e(e5, true)) {
                        e5.G();
                    }
                    e(e5);
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final void f(E e4, boolean z4) {
        l2.g gVar = this.f9717b;
        if (((r0) ((l2.g) (z4 ? gVar.f7976b : gVar.f7977c)).f7977c).isEmpty()) {
            return;
        }
        if (!this.f9718c) {
            AbstractC0864b.D("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        if (z4 ? e4.f9584C.f9680g : e4.f9584C.f9677d) {
            AbstractC0864b.C("node not yet measured");
            throw null;
        }
        g(e4, z4);
    }

    public final void g(E e4, boolean z4) {
        J j4;
        F f4;
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        l2.g gVar = this.f9717b;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if ((!z4 && i(e5)) || (z4 && (e5.q() == 1 || ((j4 = e5.f9584C.f9692s) != null && (f4 = j4.f9644w) != null && f4.e())))) {
                    boolean r2 = AbstractC1065f.r(e5);
                    L l4 = e5.f9584C;
                    if (r2 && !z4) {
                        if (l4.f9680g && gVar.e(e5, true)) {
                            m(e5, true, false);
                        } else {
                            f(e5, true);
                        }
                    }
                    if ((z4 ? l4.f9680g : l4.f9677d) && gVar.e(e5, z4)) {
                        m(e5, z4, false);
                    }
                    if (!(z4 ? l4.f9680g : l4.f9677d)) {
                        g(e5, z4);
                    }
                }
                i4++;
            } while (i4 < i2);
        }
        L l5 = e4.f9584C;
        if ((z4 ? l5.f9680g : l5.f9677d) && gVar.e(e4, z4)) {
            m(e4, z4, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 S.n, still in use, count: 2, list:
          (r13v1 S.n) from 0x009d: IF  (r13v1 S.n) == (null S.n)  -> B:83:0x0105 A[HIDDEN]
          (r13v1 S.n) from 0x00a1: PHI (r13v2 S.n) = (r13v1 S.n) binds: [B:90:0x009d] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r12v6, types: [S.n] */
    public final boolean j(s0.C1163q r17) {
        /*
            Method dump skipped, instructions count: 293
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.S.j(s0.q):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 S.n, still in use, count: 2, list:
          (r12v1 S.n) from 0x00b3: IF  (r12v1 S.n) == (null S.n)  -> B:84:0x011d A[HIDDEN]
          (r12v1 S.n) from 0x00b7: PHI (r12v2 S.n) = (r12v1 S.n) binds: [B:91:0x00b3] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r11v6, types: [S.n] */
    /* JADX WARN: Type inference failed for: r17v0, types: [java.lang.Object, r0.E] */
    public final void k(r0.E r17, long r18) {
        /*
            Method dump skipped, instructions count: 320
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r0.S.k(r0.E, long):void");
    }

    public final void l() {
        l2.g gVar = this.f9717b;
        if (gVar.k()) {
            E e4 = this.f9716a;
            if (!e4.D()) {
                AbstractC0864b.C("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!e4.E()) {
                AbstractC0864b.C("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f9718c) {
                AbstractC0864b.C("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f9724i != null) {
                this.f9718c = true;
                this.f9719d = false;
                try {
                    if (!((r0) ((l2.g) gVar.f7976b).f7977c).isEmpty()) {
                        if (e4.f9596i != null) {
                            o(e4, true);
                        } else {
                            n(e4);
                        }
                    }
                    o(e4, false);
                    this.f9718c = false;
                    this.f9719d = false;
                } catch (Throwable th) {
                    this.f9718c = false;
                    this.f9719d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean m(E e4, boolean z4, boolean z5) {
        M0.a aVar;
        AbstractC0953N placementScope;
        C1078t c1078t;
        E s4;
        J j4;
        F f4;
        J j5;
        F f5;
        if (e4.f9591J) {
            return false;
        }
        boolean E3 = e4.E();
        L l4 = e4.f9584C;
        if (E3 || l4.f9691r.f9672y || h(e4) || Intrinsics.a(e4.F(), Boolean.TRUE) || ((l4.f9680g && (e4.q() == 1 || ((j5 = l4.f9692s) != null && (f5 = j5.f9644w) != null && f5.e()))) || l4.f9691r.f9673z.e() || ((j4 = l4.f9692s) != null && (f4 = j4.f9644w) != null && f4.e()))) {
            E e5 = this.f9716a;
            if (e4 == e5) {
                aVar = this.f9724i;
                Intrinsics.c(aVar);
            } else {
                aVar = null;
            }
            if (z4) {
                r1 = l4.f9680g ? b(e4, aVar) : false;
                if (z5 && ((r1 || l4.f9681h) && Intrinsics.a(e4.F(), Boolean.TRUE))) {
                    e4.G();
                }
            } else {
                boolean c4 = l4.f9677d ? c(e4, aVar) : false;
                if (z5 && l4.f9678e && (e4 == e5 || ((s4 = e4.s()) != null && s4.E() && l4.f9691r.f9672y))) {
                    if (e4 == e5) {
                        if (e4.f9592K == 3) {
                            e4.g();
                        }
                        E s5 = e4.s();
                        if (s5 == null || (c1078t = (C1078t) s5.B.f2909c) == null || (placementScope = c1078t.f9704o) == null) {
                            placementScope = ((C1166s) H.a(e4)).getPlacementScope();
                        }
                        AbstractC0953N.f(placementScope, l4.f9691r, 0, 0);
                    } else {
                        e4.P();
                    }
                    ((I.d) this.f9720e.f7976b).b(e4);
                    e4.f9590I = true;
                }
                r1 = c4;
            }
            d();
        }
        return r1;
    }

    public final void n(E e4) {
        I.d v4 = e4.v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            Object[] objArr = v4.f3330d;
            int i4 = 0;
            do {
                E e5 = (E) objArr[i4];
                if (i(e5)) {
                    if (AbstractC1065f.r(e5)) {
                        o(e5, true);
                    } else {
                        n(e5);
                    }
                }
                i4++;
            } while (i4 < i2);
        }
    }

    public final void o(E e4, boolean z4) {
        M0.a aVar;
        if (e4.f9591J) {
            return;
        }
        if (e4 == this.f9716a) {
            aVar = this.f9724i;
            Intrinsics.c(aVar);
        } else {
            aVar = null;
        }
        if (z4) {
            b(e4, aVar);
        } else {
            c(e4, aVar);
        }
    }

    public final boolean p(E e4, boolean z4) {
        int d4 = AbstractC0784j.d(e4.f9584C.f9676c);
        if (d4 == 0 || d4 == 1) {
            return false;
        }
        if (d4 == 2 || d4 == 3) {
            this.f9723h.b(new Q(e4, false, z4));
            return false;
        }
        if (d4 != 4) {
            throw new C1338m();
        }
        L l4 = e4.f9584C;
        if (l4.f9677d && !z4) {
            return false;
        }
        l4.f9677d = true;
        if (e4.f9591J) {
            return false;
        }
        if (!e4.E() && !h(e4)) {
            return false;
        }
        E s4 = e4.s();
        if (s4 == null || !s4.f9584C.f9677d) {
            this.f9717b.d(e4, false);
        }
        return !this.f9719d;
    }

    public final void q(long j4) {
        M0.a aVar = this.f9724i;
        if (aVar == null ? false : M0.a.c(aVar.f3539a, j4)) {
            return;
        }
        if (this.f9718c) {
            AbstractC0864b.C("updateRootConstraints called while measuring");
            throw null;
        }
        this.f9724i = new M0.a(j4);
        E e4 = this.f9716a;
        E e5 = e4.f9596i;
        L l4 = e4.f9584C;
        if (e5 != null) {
            l4.f9680g = true;
        }
        l4.f9677d = true;
        this.f9717b.d(e4, e5 != null);
    }
}
