package w1;

import java.util.ArrayList;
import java.util.HashSet;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class c extends y0.l implements v, m, s1, p1, v1.e, v1.f, n1, u, n, l1, c1.a, k {

    /* renamed from: r, reason: collision with root package name */
    public y0.k f7604r;

    /* renamed from: s, reason: collision with root package name */
    public v1.a f7605s;

    /* renamed from: t, reason: collision with root package name */
    public HashSet f7606t;

    @Override // w1.m
    public final void A(h0 h0Var) {
        y0.k kVar = this.f7604r;
        q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.draw.DrawModifier");
        a0.q.q(kVar);
        throw null;
    }

    @Override // w1.p1
    public final void C(q1.f fVar, q1.g gVar, long j7) {
        q6.i.c(this.f7604r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // w1.p1
    public final boolean N() {
        q6.i.c(this.f7604r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // w1.p1
    public final void S() {
        q6.i.c(this.f7604r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // w1.n1
    public final Object W(Object obj) {
        y0.k kVar = this.f7604r;
        q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.ParentDataModifier");
        return (q.l) kVar;
    }

    @Override // w1.m
    public final void X() {
        f.l(this);
    }

    @Override // w1.p1
    public final boolean Z() {
        q6.i.c(this.f7604r, "null cannot be cast to non-null type androidx.compose.ui.input.pointer.PointerInputModifier");
        throw new ClassCastException();
    }

    @Override // c1.a
    public final r2.c b() {
        return f.u(this).f7659y;
    }

    @Override // c1.a
    public final long c() {
        return m.a.R(f.s(this, 128).f7232f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    @Override // v1.e, v1.f
    public final Object d(v1.g gVar) {
        b1 b1Var;
        this.f7606t.add(gVar);
        if (!this.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar = this.f8706d.f8710h;
        f0 u7 = f.u(this);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 32) != 0) {
                while (lVar != null) {
                    if ((lVar.f8708f & 32) != 0) {
                        l lVar2 = lVar;
                        ?? r42 = 0;
                        while (lVar2 != 0) {
                            if (lVar2 instanceof v1.e) {
                                v1.e eVar = (v1.e) lVar2;
                                if (eVar.g().q(gVar)) {
                                    return eVar.g().w(gVar);
                                }
                            } else if ((lVar2.f8708f & 32) != 0 && (lVar2 instanceof l)) {
                                y0.l lVar3 = lVar2.f7707s;
                                int i = 0;
                                lVar2 = lVar2;
                                r42 = r42;
                                while (lVar3 != null) {
                                    if ((lVar3.f8708f & 32) != 0) {
                                        i++;
                                        r42 = r42;
                                        if (i == 1) {
                                            lVar2 = lVar3;
                                        } else {
                                            if (r42 == 0) {
                                                r42 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar2 != 0) {
                                                r42.b(lVar2);
                                                lVar2 = 0;
                                            }
                                            r42.b(lVar3);
                                        }
                                    }
                                    lVar3 = lVar3.i;
                                    lVar2 = lVar2;
                                    r42 = r42;
                                }
                                if (i == 1) {
                                }
                            }
                            lVar2 = f.f(r42);
                        }
                    }
                    lVar = lVar.f8710h;
                }
            }
            u7 = u7.s();
            lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
        return gVar.f7456a.b();
    }

    @Override // w1.v
    public final u1.f0 e(n0 n0Var, u1.d0 d0Var, long j7) {
        y0.k kVar = this.f7604r;
        q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.LayoutModifier");
        m0.h1 h1Var = ((x.a0) kVar).f8195b;
        int b8 = ((x.r0) h1Var.getValue()).b(n0Var, n0Var.getLayoutDirection());
        int d8 = ((x.r0) h1Var.getValue()).d(n0Var);
        int c8 = ((x.r0) h1Var.getValue()).c(n0Var, n0Var.getLayoutDirection()) + b8;
        int a8 = ((x.r0) h1Var.getValue()).a(n0Var) + d8;
        u1.l0 e8 = d0Var.e(r2.b.h(-c8, -a8, j7));
        return n0Var.e0(r2.b.f(e8.f7230d + c8, j7), r2.b.e(e8.f7231e + a8, j7), d6.v.f2327d, new j0.a1(e8, b8, d8, 1));
    }

    @Override // v1.e
    public final r2.r g() {
        v1.a aVar = this.f7605s;
        return aVar != null ? aVar : v1.b.f7449a;
    }

    @Override // c1.a
    public final r2.l getLayoutDirection() {
        return f.u(this).f7660z;
    }

    @Override // y0.l
    public final void j0() {
        r0(true);
    }

    @Override // w1.n
    public final void k(d1 d1Var) {
        y0.k kVar = this.f7604r;
        q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.layout.OnGloballyPositionedModifier");
        a0.f fVar = (a0.f) kVar;
        ArrayList arrayList = fVar.f73b;
        if (fVar.f72a) {
            return;
        }
        fVar.f72a = true;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((g6.c) arrayList.get(i)).k(c6.m.f1757a);
        }
        arrayList.clear();
    }

    @Override // y0.l
    public final void k0() {
        t0();
    }

    @Override // w1.s1
    public final void q(d2.j jVar) {
        int i;
        y0.k kVar = this.f7604r;
        q6.i.c(kVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsModifier");
        d2.j e8 = ((d2.k) kVar).e();
        q6.i.c(jVar, "null cannot be cast to non-null type androidx.compose.ui.semantics.SemanticsConfiguration");
        o.j0 j0Var = jVar.f2150d;
        if (e8.f2152f) {
            jVar.f2152f = true;
        }
        if (e8.f2153g) {
            jVar.f2153g = true;
        }
        o.j0 j0Var2 = e8.f2150d;
        Object[] objArr = j0Var2.f5483b;
        Object[] objArr2 = j0Var2.f5484c;
        long[] jArr = j0Var2.f5482a;
        int length = jArr.length - 2;
        if (length < 0) {
            return;
        }
        int i8 = 0;
        while (true) {
            long j7 = jArr[i8];
            if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                int i9 = 8;
                int i10 = 8 - ((~(i8 - length)) >>> 31);
                int i11 = 0;
                while (i11 < i10) {
                    if ((255 & j7) < 128) {
                        int i12 = (i8 << 3) + i11;
                        Object obj = objArr[i12];
                        Object obj2 = objArr2[i12];
                        d2.v vVar = (d2.v) obj;
                        if (!j0Var.b(vVar)) {
                            j0Var.m(vVar, obj2);
                        } else if (obj2 instanceof d2.a) {
                            Object g3 = j0Var.g(vVar);
                            q6.i.c(g3, "null cannot be cast to non-null type androidx.compose.ui.semantics.AccessibilityAction<*>");
                            d2.a aVar = (d2.a) g3;
                            i = i9;
                            String str = aVar.f2108a;
                            if (str == null) {
                                str = ((d2.a) obj2).f2108a;
                            }
                            c6.c cVar = aVar.f2109b;
                            if (cVar == null) {
                                cVar = ((d2.a) obj2).f2109b;
                            }
                            j0Var.m(vVar, new d2.a(str, cVar));
                            j7 >>= i;
                            i11++;
                            i9 = i;
                        }
                    }
                    i = i9;
                    j7 >>= i;
                    i11++;
                    i9 = i;
                }
                if (i10 != i9) {
                    return;
                }
            }
            if (i8 == length) {
                return;
            } else {
                i8++;
            }
        }
    }

    public final void r0(boolean z3) {
        if (!this.f8718q) {
            t1.a.b("initializeModifier called on unattached node");
        }
        y0.k kVar = this.f7604r;
        if ((this.f8708f & 32) != 0) {
            if (kVar instanceof v1.c) {
                b bVar = new b(this, 0);
                o.e0 e0Var = ((x1.t) f.v(this)).f8582w0;
                if (e0Var.f(bVar) < 0) {
                    e0Var.a(bVar);
                }
            }
            if (kVar instanceof x.a0) {
                x.a0 a0Var = (x.a0) kVar;
                v1.a aVar = this.f7605s;
                v1.g gVar = x.v0.f8303a;
                if (aVar == null || !aVar.q(gVar)) {
                    v1.a aVar2 = new v1.a();
                    aVar2.f7448a = a0Var;
                    this.f7605s = aVar2;
                    if (f.d(this)) {
                        v1.d modifierLocalManager = ((x1.t) f.v(this)).getModifierLocalManager();
                        modifierLocalManager.f7451b.b(this);
                        modifierLocalManager.f7452c.b(gVar);
                        modifierLocalManager.a();
                    }
                } else {
                    aVar.f7448a = a0Var;
                    v1.d modifierLocalManager2 = ((x1.t) f.v(this)).getModifierLocalManager();
                    modifierLocalManager2.f7451b.b(this);
                    modifierLocalManager2.f7452c.b(gVar);
                    modifierLocalManager2.a();
                }
            }
        }
        if ((this.f8708f & 4) != 0 && !z3) {
            f.s(this, 2).L0();
        }
        if ((this.f8708f & 2) != 0) {
            if (f.d(this)) {
                d1 d1Var = this.f8712k;
                q6.i.b(d1Var);
                ((x) d1Var).e1(this);
                j1 j1Var = d1Var.L;
                if (j1Var != null) {
                    ((x1.j1) j1Var).invalidate();
                }
            }
            if (!z3) {
                f.s(this, 2).L0();
                f.u(this).C();
            }
        }
        if (kVar instanceof z.n) {
            ((z.n) kVar).f9071a.f9086k = f.u(this);
        }
        if ((this.f8708f & 256) != 0 && (kVar instanceof a0.f) && f.d(this)) {
            f.u(this).C();
        }
        if ((this.f8708f & 8) != 0) {
            ((x1.t) f.v(this)).z();
        }
    }

    public final void s0() {
        y0.k kVar = this.f7604r;
        t1.a.b("onFocusEvent called on wrong node");
        kVar.getClass();
        throw new ClassCastException();
    }

    public final void t0() {
        if (!this.f8718q) {
            t1.a.b("unInitializeModifier called on unattached node");
        }
        y0.k kVar = this.f7604r;
        if ((this.f8708f & 32) != 0) {
            if (kVar instanceof x.a0) {
                v1.d modifierLocalManager = ((x1.t) f.v(this)).getModifierLocalManager();
                modifierLocalManager.f7453d.b(f.u(this));
                modifierLocalManager.f7454e.b(x.v0.f8303a);
                modifierLocalManager.a();
            }
            if (kVar instanceof v1.c) {
                ((v1.c) kVar).c(f.f7637a);
            }
        }
        if ((this.f8708f & 8) != 0) {
            ((x1.t) f.v(this)).z();
        }
    }

    public final String toString() {
        return this.f7604r.toString();
    }

    public final void u0() {
        if (this.f8718q) {
            this.f7606t.clear();
            ((x1.t) f.v(this)).getSnapshotObserver().a(this, e.f7623f, new b(this, 1));
        }
    }

    @Override // w1.l1
    public final boolean v() {
        return this.f8718q;
    }

    @Override // w1.k
    public final void a() {
    }

    @Override // w1.u
    public final void P(u1.p pVar) {
    }

    @Override // w1.u
    public final void o(long j7) {
    }
}
