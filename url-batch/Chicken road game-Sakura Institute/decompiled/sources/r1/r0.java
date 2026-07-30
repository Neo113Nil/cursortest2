package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r0 {

    /* renamed from: a, reason: collision with root package name */
    public final d0 f7891a;

    /* renamed from: c, reason: collision with root package name */
    public boolean f7893c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f7894d;

    /* renamed from: i, reason: collision with root package name */
    public m2.a f7899i;

    /* renamed from: b, reason: collision with root package name */
    public final q5.g f7892b = new q5.g(3);

    /* renamed from: e, reason: collision with root package name */
    public final q5.g f7895e = new q5.g(6);

    /* renamed from: f, reason: collision with root package name */
    public final i0.d f7896f = new i0.d(new d0[16]);

    /* renamed from: g, reason: collision with root package name */
    public final long f7897g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final i0.d f7898h = new i0.d(new q0[16]);

    public r0(d0 d0Var) {
        this.f7891a = d0Var;
    }

    public static boolean b(d0 d0Var, m2.a aVar) {
        boolean v02;
        d0 d0Var2 = d0Var.f7721h;
        l0 l0Var = d0Var.B;
        if (d0Var2 == null) {
            return false;
        }
        if (aVar != null) {
            if (d0Var2 != null) {
                i0 i0Var = l0Var.f7849s;
                r6.k.c(i0Var);
                v02 = i0Var.v0(aVar.f6306a);
            }
            v02 = false;
        } else {
            i0 i0Var2 = l0Var.f7849s;
            m2.a aVar2 = i0Var2 != null ? i0Var2.f7793r : null;
            if (aVar2 != null && d0Var2 != null) {
                r6.k.c(i0Var2);
                v02 = i0Var2.v0(aVar2.f6306a);
            }
            v02 = false;
        }
        d0 s5 = d0Var.s();
        if (v02 && s5 != null) {
            if (s5.f7721h == null) {
                d0.T(s5, false, 3);
                return v02;
            }
            if (d0Var.q() == 1) {
                d0.R(s5, false, 3);
                return v02;
            }
            if (d0Var.q() == 2) {
                s5.Q(false);
            }
        }
        return v02;
    }

    public static boolean c(d0 d0Var, m2.a aVar) {
        boolean L = aVar != null ? d0Var.L(aVar) : d0.M(d0Var);
        d0 s5 = d0Var.s();
        if (L && s5 != null) {
            int i7 = d0Var.B.f7848r.f7816p;
            if (i7 == 1) {
                d0.T(s5, false, 3);
                return L;
            }
            if (i7 == 2) {
                s5.S(false);
            }
        }
        return L;
    }

    public static boolean h(d0 d0Var) {
        j0 j0Var = d0Var.B.f7848r;
        return j0Var.f7816p == 1 || j0Var.f7825y.e();
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0025, code lost:
    
        if (r4 < r2) goto L9;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void a(boolean z8) {
        Object[] objArr;
        q5.g gVar = this.f7895e;
        if (z8) {
            i0.d dVar = (i0.d) gVar.f7527g;
            dVar.h();
            d0 d0Var = this.f7891a;
            dVar.b(d0Var);
            d0Var.H = true;
        }
        i0.d dVar2 = (i0.d) gVar.f7527g;
        dVar2.q(e1.f7764b);
        int i7 = dVar2.f4842h;
        d0[] d0VarArr = (d0[]) gVar.f7528h;
        if (d0VarArr != null) {
            int length = d0VarArr.length;
            objArr = d0VarArr;
        }
        objArr = new d0[Math.max(16, i7)];
        gVar.f7528h = null;
        for (int i8 = 0; i8 < i7; i8++) {
            objArr[i8] = dVar2.f4840f[i8];
        }
        dVar2.h();
        for (int i9 = i7 - 1; -1 < i9; i9--) {
            d0 d0Var2 = objArr[i9];
            r6.k.c(d0Var2);
            if (d0Var2.H) {
                q5.g.i(d0Var2);
            }
        }
        gVar.f7528h = objArr;
    }

    public final void d() {
        i0.d dVar = this.f7898h;
        if (dVar.m()) {
            int i7 = dVar.f4842h;
            if (i7 > 0) {
                Object[] objArr = dVar.f4840f;
                int i8 = 0;
                do {
                    q0 q0Var = (q0) objArr[i8];
                    d0 d0Var = q0Var.f7883a;
                    boolean z8 = q0Var.f7885c;
                    d0 d0Var2 = q0Var.f7883a;
                    if (d0Var.E()) {
                        if (q0Var.f7884b) {
                            d0.R(d0Var2, z8, 2);
                        } else {
                            d0.T(d0Var2, z8, 2);
                        }
                    }
                    i8++;
                } while (i8 < i7);
            }
            dVar.h();
        }
    }

    public final void e(d0 d0Var) {
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (r6.k.a(d0Var2.G(), Boolean.TRUE) && !d0Var2.I) {
                    if (this.f7892b.g(d0Var2, true)) {
                        d0Var2.H();
                    }
                    e(d0Var2);
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void f(d0 d0Var, boolean z8) {
        q5.g gVar = this.f7892b;
        if (((r1) ((q5.g) (z8 ? gVar.f7527g : gVar.f7528h)).f7528h).isEmpty()) {
            return;
        }
        if (!this.f7893c) {
            a.a.M("forceMeasureTheSubtree should be executed during the measureAndLayout pass");
            throw null;
        }
        l0 l0Var = d0Var.B;
        if (z8 ? l0Var.f7837g : l0Var.f7834d) {
            a.a.L("node not yet measured");
            throw null;
        }
        g(d0Var, z8);
    }

    public final void g(d0 d0Var, boolean z8) {
        i0 i0Var;
        e0 e0Var;
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        q5.g gVar = this.f7892b;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if ((!z8 && h(d0Var2)) || (z8 && (d0Var2.q() == 1 || ((i0Var = d0Var2.B.f7849s) != null && (e0Var = i0Var.f7797v) != null && e0Var.e())))) {
                    boolean p6 = f.p(d0Var2);
                    l0 l0Var = d0Var2.B;
                    if (p6 && !z8) {
                        if (l0Var.f7837g && gVar.g(d0Var2, true)) {
                            l(d0Var2, true, false);
                        } else {
                            f(d0Var2, true);
                        }
                    }
                    if ((z8 ? l0Var.f7837g : l0Var.f7834d) && gVar.g(d0Var2, z8)) {
                        l(d0Var2, z8, false);
                    }
                    if (!(z8 ? l0Var.f7837g : l0Var.f7834d)) {
                        g(d0Var2, z8);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
        l0 l0Var2 = d0Var.B;
        if ((z8 ? l0Var2.f7837g : l0Var2.f7834d) && gVar.g(d0Var, z8)) {
            l(d0Var, z8, false);
        }
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r13v1 s0.n, still in use, count: 2, list:
          (r13v1 s0.n) from 0x009d: IF  (r13v1 s0.n) == (null s0.n)  -> B:90:0x009f A[HIDDEN] (LINE:158)
          (r13v1 s0.n) from 0x00a3: PHI (r13v2 s0.n) = (r13v1 s0.n) binds: [B:93:0x009d] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r12v6, types: [s0.n] */
    public final boolean i(s1.p r18) {
        /*
            Method dump skipped, instructions count: 309
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.r0.i(s1.p):boolean");
    }

    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r12v1 s0.n, still in use, count: 2, list:
          (r12v1 s0.n) from 0x00b2: IF  (r12v1 s0.n) == (null s0.n)  -> B:96:0x00b4 A[HIDDEN] (LINE:179)
          (r12v1 s0.n) from 0x00b8: PHI (r12v2 s0.n) = (r12v1 s0.n) binds: [B:99:0x00b2] A[DONT_GENERATE, DONT_INLINE]
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
    /* JADX WARN: Type inference failed for: r11v10, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12 */
    /* JADX WARN: Type inference failed for: r11v13 */
    /* JADX WARN: Type inference failed for: r11v14 */
    /* JADX WARN: Type inference failed for: r11v15 */
    /* JADX WARN: Type inference failed for: r11v16 */
    /* JADX WARN: Type inference failed for: r11v5 */
    /* JADX WARN: Type inference failed for: r11v6, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r11v8 */
    /* JADX WARN: Type inference failed for: r11v9, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r13v1 */
    /* JADX WARN: Type inference failed for: r13v10 */
    /* JADX WARN: Type inference failed for: r13v11 */
    /* JADX WARN: Type inference failed for: r13v12 */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v3 */
    /* JADX WARN: Type inference failed for: r13v4, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r13v5 */
    /* JADX WARN: Type inference failed for: r13v6 */
    /* JADX WARN: Type inference failed for: r13v7, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r13v9 */
    /* JADX WARN: Type inference failed for: r18v0, types: [java.lang.Object, r1.d0] */
    public final void j(r1.d0 r18, long r19) {
        /*
            Method dump skipped, instructions count: 333
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: r1.r0.j(r1.d0, long):void");
    }

    public final void k() {
        q5.g gVar = this.f7892b;
        if (gVar.m()) {
            d0 d0Var = this.f7891a;
            if (!d0Var.E()) {
                a.a.L("performMeasureAndLayout called with unattached root");
                throw null;
            }
            if (!d0Var.F()) {
                a.a.L("performMeasureAndLayout called with unplaced root");
                throw null;
            }
            if (this.f7893c) {
                a.a.L("performMeasureAndLayout called during measure layout");
                throw null;
            }
            if (this.f7899i != null) {
                this.f7893c = true;
                this.f7894d = false;
                try {
                    if (!((r1) ((q5.g) gVar.f7527g).f7528h).isEmpty()) {
                        if (d0Var.f7721h != null) {
                            n(d0Var, true);
                        } else {
                            m(d0Var);
                        }
                    }
                    n(d0Var, false);
                    this.f7893c = false;
                    this.f7894d = false;
                } catch (Throwable th) {
                    this.f7893c = false;
                    this.f7894d = false;
                    throw th;
                }
            }
        }
    }

    public final boolean l(d0 d0Var, boolean z8, boolean z9) {
        m2.a aVar;
        boolean z10;
        p1.m0 placementScope;
        t tVar;
        d0 s5;
        i0 i0Var;
        e0 e0Var;
        i0 i0Var2;
        e0 e0Var2;
        boolean z11 = d0Var.I;
        l0 l0Var = d0Var.B;
        if (z11 || (!d0Var.F() && !l0Var.f7848r.f7824x && ((!l0Var.f7834d || !h(d0Var)) && !r6.k.a(d0Var.G(), Boolean.TRUE) && ((!l0Var.f7837g || (d0Var.q() != 1 && ((i0Var2 = l0Var.f7849s) == null || (e0Var2 = i0Var2.f7797v) == null || !e0Var2.e()))) && !l0Var.f7848r.f7825y.e() && ((i0Var = l0Var.f7849s) == null || (e0Var = i0Var.f7797v) == null || !e0Var.e()))))) {
            return false;
        }
        d0 d0Var2 = this.f7891a;
        if (d0Var == d0Var2) {
            aVar = this.f7899i;
            r6.k.c(aVar);
        } else {
            aVar = null;
        }
        if (z8) {
            z10 = l0Var.f7837g ? b(d0Var, aVar) : false;
            if (z9 && ((z10 || l0Var.f7838h) && r6.k.a(d0Var.G(), Boolean.TRUE))) {
                d0Var.H();
            }
        } else {
            boolean c4 = l0Var.f7834d ? c(d0Var, aVar) : false;
            if (z9 && l0Var.f7835e && (d0Var == d0Var2 || ((s5 = d0Var.s()) != null && s5.F() && l0Var.f7848r.f7824x))) {
                if (d0Var == d0Var2) {
                    if (d0Var.J == 3) {
                        d0Var.g();
                    }
                    d0 s8 = d0Var.s();
                    if (s8 == null || (tVar = (t) s8.A.f3892c) == null || (placementScope = tVar.f7866n) == null) {
                        placementScope = ((s1.r) g0.a(d0Var)).getPlacementScope();
                    }
                    p1.m0.f(placementScope, l0Var.f7848r, 0, 0);
                } else {
                    d0Var.P();
                }
                ((i0.d) this.f7895e.f7527g).b(d0Var);
                d0Var.H = true;
            }
            z10 = c4;
        }
        d();
        return z10;
    }

    public final void m(d0 d0Var) {
        i0.d v5 = d0Var.v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            Object[] objArr = v5.f4840f;
            int i8 = 0;
            do {
                d0 d0Var2 = (d0) objArr[i8];
                if (h(d0Var2)) {
                    if (f.p(d0Var2)) {
                        n(d0Var2, true);
                    } else {
                        m(d0Var2);
                    }
                }
                i8++;
            } while (i8 < i7);
        }
    }

    public final void n(d0 d0Var, boolean z8) {
        m2.a aVar;
        if (d0Var.I) {
            return;
        }
        if (d0Var == this.f7891a) {
            aVar = this.f7899i;
            r6.k.c(aVar);
        } else {
            aVar = null;
        }
        if (z8) {
            b(d0Var, aVar);
        } else {
            c(d0Var, aVar);
        }
    }

    public final boolean o(d0 d0Var, boolean z8) {
        l0 l0Var = d0Var.B;
        l0 l0Var2 = d0Var.B;
        int d8 = l.h.d(l0Var.f7833c);
        if (d8 != 0 && d8 != 1) {
            if (d8 == 2 || d8 == 3) {
                this.f7898h.b(new q0(d0Var, false, z8));
            } else {
                if (d8 != 4) {
                    throw new b4.c();
                }
                if (!l0Var2.f7834d || z8) {
                    l0Var2.f7834d = true;
                    if (d0Var.I || (!d0Var.F() && (!l0Var2.f7834d || !h(d0Var)))) {
                        return false;
                    }
                    d0 s5 = d0Var.s();
                    if (s5 == null || !s5.B.f7834d) {
                        this.f7892b.f(d0Var, false);
                    }
                    if (!this.f7894d) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void p(long j8) {
        m2.a aVar = this.f7899i;
        if (aVar == null ? false : m2.a.b(aVar.f6306a, j8)) {
            return;
        }
        if (this.f7893c) {
            a.a.L("updateRootConstraints called while measuring");
            throw null;
        }
        this.f7899i = new m2.a(j8);
        d0 d0Var = this.f7891a;
        d0 d0Var2 = d0Var.f7721h;
        l0 l0Var = d0Var.B;
        if (d0Var2 != null) {
            l0Var.f7837g = true;
        }
        l0Var.f7834d = true;
        this.f7892b.f(d0Var, d0Var2 != null);
    }
}
