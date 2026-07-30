package r1;

import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class c extends s0.n implements w, o, n1, l1, q1.e, q1.g, j1, v, p, x0.c, x0.l, x0.o, h1, w0.a {

    /* renamed from: s, reason: collision with root package name */
    public s0.m f7714s;

    /* renamed from: t, reason: collision with root package name */
    public q1.a f7715t;

    /* renamed from: u, reason: collision with root package name */
    public HashSet f7716u;

    @Override // r1.l1
    public final void A(l1.j jVar, l1.k kVar, long j8) {
        r6.k.d(this.f7714s, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    public final void A0(boolean z8) {
        if (!this.f8116r) {
            a.a.M("initializeModifier called on unattached node");
            throw null;
        }
        s0.m mVar = this.f7714s;
        if ((this.f8106h & 32) != 0) {
            if (mVar instanceof q1.c) {
                b bVar = new b(this, 0);
                i0.d dVar = ((s1.r) f.u(this)).f8394u0;
                if (!dVar.i(bVar)) {
                    dVar.b(bVar);
                }
            }
            if (mVar instanceof q1.f) {
                q1.f fVar = (q1.f) mVar;
                q1.a aVar = this.f7715t;
                if (aVar == null || !aVar.p(fVar.getKey())) {
                    q1.a aVar2 = new q1.a();
                    aVar2.f7480b = fVar;
                    this.f7715t = aVar2;
                    if (f.d(this)) {
                        q1.d modifierLocalManager = ((s1.r) f.u(this)).getModifierLocalManager();
                        q1.h key = fVar.getKey();
                        modifierLocalManager.f7483b.b(this);
                        modifierLocalManager.f7484c.b(key);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f7480b = fVar;
                    q1.d modifierLocalManager2 = ((s1.r) f.u(this)).getModifierLocalManager();
                    q1.h key2 = fVar.getKey();
                    modifierLocalManager2.f7483b.b(this);
                    modifierLocalManager2.f7484c.b(key2);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f8106h & 4) != 0 && !z8) {
            f.r(this, 2).S0();
        }
        if ((this.f8106h & 2) != 0) {
            if (f.d(this)) {
                a1 a1Var = this.f8111m;
                r6.k.c(a1Var);
                ((y) a1Var).k1(this);
                f1 f1Var = a1Var.I;
                if (f1Var != null) {
                    f1Var.invalidate();
                }
            }
            if (!z8) {
                f.r(this, 2).S0();
                f.t(this).B();
            }
        }
        if (mVar instanceof r.p) {
            ((r.p) mVar).f7663a.f7683j = f.t(this);
        }
        if ((this.f8106h & 256) != 0 && (mVar instanceof s.c) && f.d(this)) {
            f.t(this).B();
        }
        if ((this.f8106h & 8) != 0) {
            ((s1.r) f.u(this)).z();
        }
    }

    public final void B0() {
        if (!this.f8116r) {
            a.a.M("unInitializeModifier called on unattached node");
            throw null;
        }
        s0.m mVar = this.f7714s;
        if ((this.f8106h & 32) != 0) {
            if (mVar instanceof q1.f) {
                q1.d modifierLocalManager = ((s1.r) f.u(this)).getModifierLocalManager();
                q1.h key = ((q1.f) mVar).getKey();
                modifierLocalManager.f7485d.b(f.t(this));
                modifierLocalManager.f7486e.b(key);
                modifierLocalManager.a();
            }
            if (mVar instanceof q1.c) {
                ((q1.c) mVar).g(f.f7766a);
            }
        }
        if ((this.f8106h & 8) != 0) {
            ((s1.r) f.u(this)).z();
        }
    }

    public final void C0() {
        if (this.f8116r) {
            this.f7716u.clear();
            ((s1.r) f.u(this)).getSnapshotObserver().a(this, e.f7741h, new b(this, 1));
        }
    }

    @Override // x0.l
    public final void E(x0.i iVar) {
        a.a.M("applyFocusProperties called on wrong node");
        throw null;
    }

    @Override // r1.l1
    public final boolean R() {
        r6.k.d(this.f7714s, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // r1.n1
    public final void S(y1.i iVar) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        y1.i k8 = ((y1.j) mVar).k();
        r6.k.d(iVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        LinkedHashMap linkedHashMap = iVar.f9832f;
        if (k8.f9833g) {
            iVar.f9833g = true;
        }
        if (k8.f9834h) {
            iVar.f9834h = true;
        }
        for (Map.Entry entry : k8.f9832f.entrySet()) {
            y1.s sVar = (y1.s) entry.getKey();
            Object value = entry.getValue();
            if (!linkedHashMap.containsKey(sVar)) {
                linkedHashMap.put(sVar, value);
            } else if (value instanceof y1.a) {
                Object obj = linkedHashMap.get(sVar);
                r6.k.d(obj, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                y1.a aVar = (y1.a) obj;
                String str = aVar.f9793a;
                if (str == null) {
                    str = ((y1.a) value).f9793a;
                }
                d6.e eVar = aVar.f9794b;
                if (eVar == null) {
                    eVar = ((y1.a) value).f9794b;
                }
                linkedHashMap.put(sVar, new y1.a(str, eVar));
            }
        }
    }

    @Override // r1.p
    public final void V(a1 a1Var) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        s.c cVar = (s.c) mVar;
        if (cVar.f7986a) {
            return;
        }
        cVar.f7986a = true;
        h6.k kVar = cVar.f7987b;
        if (kVar != null) {
            kVar.resumeWith(d6.z.f2639a);
        }
        cVar.f7987b = null;
    }

    @Override // w0.a
    public final m2.b a() {
        return f.t(this).f7735v;
    }

    @Override // r1.l1
    public final void a0() {
        r6.k.d(this.f7714s, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // r1.w
    public final int b(o0 o0Var, p1.e0 e0Var, int i7) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((p1.r) mVar).b(o0Var, e0Var, i7);
    }

    @Override // r1.o
    public final void c(f0 f0Var) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        ((w0.e) mVar).c(f0Var);
    }

    @Override // w0.a
    public final long d() {
        return j1.c.o0(f.r(this, 128).f7065h);
    }

    @Override // r1.w
    public final int e(o0 o0Var, p1.e0 e0Var, int i7) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((p1.r) mVar).e(o0Var, e0Var, i7);
    }

    @Override // r1.w
    public final p1.g0 f(p1.h0 h0Var, p1.e0 e0Var, long j8) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((p1.r) mVar).f(h0Var, e0Var, j8);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [q6.a, r6.l] */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // q1.e, q1.g
    public final Object g(q1.h hVar) {
        g0.t tVar;
        this.f7716u.add(hVar);
        s0.n nVar = this.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar2 = nVar.f8108j;
        d0 t2 = f.t(this);
        while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 32) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 32) != 0) {
                        m mVar = nVar2;
                        ?? r42 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof q1.e) {
                                q1.e eVar = (q1.e) mVar;
                                if (eVar.j().p(hVar)) {
                                    return eVar.j().v(hVar);
                                }
                            } else if ((mVar.f8106h & 32) != 0 && (mVar instanceof m)) {
                                s0.n nVar3 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r42 = r42;
                                while (nVar3 != null) {
                                    if ((nVar3.f8106h & 32) != 0) {
                                        i7++;
                                        r42 = r42;
                                        if (i7 == 1) {
                                            mVar = nVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new i0.d(new s0.n[16]);
                                            }
                                            if (mVar != 0) {
                                                r42.b(mVar);
                                                mVar = 0;
                                            }
                                            r42.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f8109k;
                                    mVar = mVar;
                                    r42 = r42;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar = f.f(r42);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return hVar.f7488a.a();
    }

    @Override // w0.a
    public final m2.k getLayoutDirection() {
        return f.t(this).f7736w;
    }

    @Override // r1.w
    public final int h(o0 o0Var, p1.e0 e0Var, int i7) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((p1.r) mVar).h(o0Var, e0Var, i7);
    }

    @Override // r1.j1
    public final Object h0(Object obj) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (k.j) mVar;
    }

    @Override // r1.w
    public final int i(o0 o0Var, p1.e0 e0Var, int i7) {
        s0.m mVar = this.f7714s;
        r6.k.d(mVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        return ((p1.r) mVar).i(o0Var, e0Var, i7);
    }

    @Override // r1.o
    public final void i0() {
        f.m(this);
    }

    @Override // q1.e
    public final a.a j() {
        q1.a aVar = this.f7715t;
        return aVar != null ? aVar : q1.b.f7481b;
    }

    @Override // r1.l1
    public final boolean j0() {
        r6.k.d(this.f7714s, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // x0.c
    public final void m0(x0.q qVar) {
        a.a.M("onFocusEvent called on wrong node");
        throw null;
    }

    @Override // s0.n
    public final void s0() {
        A0(true);
    }

    @Override // s0.n
    public final void t0() {
        B0();
    }

    public final String toString() {
        return this.f7714s.toString();
    }

    @Override // r1.h1
    public final boolean z() {
        return this.f8116r;
    }

    @Override // r1.v
    public final void M(p1.p pVar) {
    }

    @Override // r1.v
    public final void u(long j8) {
    }
}
