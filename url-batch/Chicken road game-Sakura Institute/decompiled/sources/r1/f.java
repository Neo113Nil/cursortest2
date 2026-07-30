package r1;

import android.view.View;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7766a = new d(0);

    public static final long a(float f9, boolean z8) {
        return ((z8 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f9) << 32);
    }

    public static final void b(i0.d dVar, s0.n nVar) {
        i0.d v5 = t(nVar).v();
        int i7 = v5.f4842h;
        if (i7 > 0) {
            int i8 = i7 - 1;
            Object[] objArr = v5.f4840f;
            do {
                dVar.b((s0.n) ((d0) objArr[i8]).A.f3895f);
                i8--;
            } while (i8 >= 0);
        }
    }

    public static final int c(o0 o0Var, p1.l lVar) {
        o0 r02 = o0Var.r0();
        if (r02 == null) {
            a.a.M("Child of " + o0Var + " cannot be null when calculating alignment line");
            throw null;
        }
        if (o0Var.v0().o().containsKey(lVar)) {
            Integer num = (Integer) o0Var.v0().o().get(lVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int f02 = r02.f0(lVar);
            if (f02 != Integer.MIN_VALUE) {
                r02.f7864l = true;
                o0Var.f7865m = true;
                o0Var.z0();
                r02.f7864l = false;
                o0Var.f7865m = false;
                return f02 + ((int) (lVar instanceof p1.l ? r02.x0() & 4294967295L : r02.x0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        o1 o1Var = (o1) t(cVar).A.f3894e;
        r6.k.d(o1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return o1Var.f7869s;
    }

    public static final s0.n e(l lVar, int i7) {
        s0.n nVar = ((s0.n) lVar).f8104f.f8109k;
        if (nVar == null || (nVar.f8107i & i7) == 0) {
            return null;
        }
        while (nVar != null) {
            int i8 = nVar.f8106h;
            if ((i8 & 2) != 0) {
                return null;
            }
            if ((i8 & i7) != 0) {
                return nVar;
            }
            nVar = nVar.f8109k;
        }
        return null;
    }

    public static final s0.n f(i0.d dVar) {
        if (dVar == null || dVar.l()) {
            return null;
        }
        return (s0.n) dVar.o(dVar.f4842h - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final w g(s0.n nVar) {
        if ((nVar.f8106h & 2) != 0) {
            if (nVar instanceof w) {
                return (w) nVar;
            }
            if (nVar instanceof m) {
                s0.n nVar2 = ((m) nVar).f7853t;
                while (nVar2 != 0) {
                    if (nVar2 instanceof w) {
                        return (w) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof m) || (nVar2.f8106h & 2) == 0) ? nVar2.f8109k : ((m) nVar2).f7853t;
                }
            }
        }
        return null;
    }

    public static final int h(long j8, long j9) {
        boolean z8 = ((int) (j8 & 4294967295L)) != 0;
        return z8 != (((int) (4294967295L & j9)) != 0) ? z8 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j8 >> 32)) - Float.intBitsToFloat((int) (j9 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(k kVar, g0.m1 m1Var) {
        if (!((s0.n) kVar).f8104f.f8116r) {
            a.a.M("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        o0.d dVar = (o0.d) t(kVar).f7738y;
        dVar.getClass();
        return g0.d.K(dVar, m1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
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
    public static final q1 j(l lVar, Object obj) {
        g0.t tVar;
        s0.n nVar = ((s0.n) lVar).f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar2 = nVar.f8108j;
        d0 t2 = t(lVar);
        while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 262144) != 0) {
                        m mVar = nVar2;
                        ?? r42 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof q1) {
                                q1 q1Var = (q1) mVar;
                                if (obj.equals(q1Var.o())) {
                                    return q1Var;
                                }
                            } else if ((mVar.f8106h & 262144) != 0 && (mVar instanceof m)) {
                                s0.n nVar3 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r42 = r42;
                                while (nVar3 != null) {
                                    if ((nVar3.f8106h & 262144) != 0) {
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
                            mVar = f(r42);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, r1.l, r1.q1] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final q1 k(q1 q1Var) {
        g0.t tVar;
        s0.n nVar = ((s0.n) q1Var).f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar2 = nVar.f8108j;
        d0 t2 = t(q1Var);
        while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 262144) != 0) {
                        m mVar = nVar2;
                        ?? r52 = 0;
                        while (mVar != 0) {
                            if (mVar instanceof q1) {
                                q1 q1Var2 = (q1) mVar;
                                if (r6.k.a(q1Var.o(), q1Var2.o()) && q1Var.getClass() == q1Var2.getClass()) {
                                    return q1Var2;
                                }
                            } else if ((mVar.f8106h & 262144) != 0 && (mVar instanceof m)) {
                                s0.n nVar3 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r52 = r52;
                                while (nVar3 != null) {
                                    if ((nVar3.f8106h & 262144) != 0) {
                                        i7++;
                                        r52 = r52;
                                        if (i7 == 1) {
                                            mVar = nVar3;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new i0.d(new s0.n[16]);
                                            }
                                            if (mVar != 0) {
                                                r52.b(mVar);
                                                mVar = 0;
                                            }
                                            r52.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f8109k;
                                    mVar = mVar;
                                    r52 = r52;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar = f(r52);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return null;
    }

    public static final int l(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(o oVar) {
        if (((s0.n) oVar).f8104f.f8116r) {
            r(oVar, 1).S0();
        }
    }

    public static final void n(w wVar) {
        t(wVar).B();
    }

    public static final void o(n1 n1Var) {
        t(n1Var).C();
    }

    public static final boolean p(d0 d0Var) {
        if (d0Var.f7721h == null) {
            return false;
        }
        d0 s5 = d0Var.s();
        return (s5 != null ? s5.f7721h : null) == null || d0Var.B.f7832b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(s0.n nVar, q6.a aVar) {
        d1 d1Var = nVar.f8110l;
        if (d1Var == null) {
            d1Var = new d1((c1) nVar);
            nVar.f8110l = d1Var;
        }
        ((s1.r) u(nVar)).getSnapshotObserver().a(d1Var, e.f7745l, aVar);
    }

    public static final a1 r(l lVar, int i7) {
        a1 a1Var = ((s0.n) lVar).f8104f.f8111m;
        r6.k.c(a1Var);
        if (a1Var.M0() != lVar || !b1.h(i7)) {
            return a1Var;
        }
        a1 a1Var2 = a1Var.f7701r;
        r6.k.c(a1Var2);
        return a1Var2;
    }

    public static final a1 s(l lVar) {
        if (!((s0.n) lVar).f8104f.f8116r) {
            a.a.M("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        a1 r8 = r(lVar, 2);
        if (r8.M0().f8116r) {
            return r8;
        }
        a.a.M("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final d0 t(l lVar) {
        a1 a1Var = ((s0.n) lVar).f8104f.f8111m;
        if (a1Var != null) {
            return a1Var.f7700q;
        }
        a.a.N("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final g1 u(l lVar) {
        g1 g1Var = t(lVar).f7727n;
        if (g1Var != null) {
            return g1Var;
        }
        a.a.N("This node does not have an owner.");
        throw null;
    }

    public static final View v(l lVar) {
        if (((s0.n) lVar).f8104f.f8116r) {
            return (View) g0.a(t(lVar));
        }
        a.a.M("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [q6.c] */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v14, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r1v15, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9, types: [s0.n] */
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
    public static final void w(l1.p pVar, q6.c cVar) {
        g0.t tVar;
        s0.n nVar = pVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar2 = nVar.f8108j;
        d0 t2 = t(pVar);
        while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 262144) != 0) {
                        m mVar = nVar2;
                        ?? r42 = 0;
                        while (mVar != 0) {
                            boolean z8 = true;
                            if (mVar instanceof q1) {
                                q1 q1Var = (q1) mVar;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(q1Var.o()) && l1.p.class == q1Var.getClass()) {
                                    z8 = ((Boolean) cVar.f(q1Var)).booleanValue();
                                }
                                if (!z8) {
                                    return;
                                }
                            } else {
                                if (((mVar.f8106h & 262144) != 0) && (mVar instanceof m)) {
                                    s0.n nVar3 = mVar.f7853t;
                                    int i7 = 0;
                                    mVar = mVar;
                                    r42 = r42;
                                    while (nVar3 != null) {
                                        if ((nVar3.f8106h & 262144) != 0) {
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
                            }
                            mVar = f(r42);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, r1.q1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [q6.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void x(q1 q1Var, q6.c cVar) {
        s0.n nVar = ((s0.n) q1Var).f8104f;
        if (!nVar.f8116r) {
            a.a.M("visitSubtreeIf called on an unattached node");
            throw null;
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.m()) {
            s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar3.f8107i & 262144) != 0) {
                for (s0.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f8109k) {
                    if ((nVar4.f8106h & 262144) != 0) {
                        ?? r8 = 0;
                        m mVar = nVar4;
                        while (mVar != 0) {
                            if (mVar instanceof q1) {
                                q1 q1Var2 = (q1) mVar;
                                p1 p1Var = (r6.k.a(q1Var.o(), q1Var2.o()) && q1Var.getClass() == q1Var2.getClass()) ? (p1) cVar.f(q1Var2) : p1.f7876f;
                                if (p1Var == p1.f7878h) {
                                    return;
                                }
                                if (p1Var == p1.f7877g) {
                                    break;
                                }
                            } else if ((mVar.f8106h & 262144) != 0 && (mVar instanceof m)) {
                                s0.n nVar5 = mVar.f7853t;
                                int i7 = 0;
                                mVar = mVar;
                                r8 = r8;
                                while (nVar5 != null) {
                                    if ((nVar5.f8106h & 262144) != 0) {
                                        i7++;
                                        r8 = r8;
                                        if (i7 == 1) {
                                            mVar = nVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new i0.d(new s0.n[16]);
                                            }
                                            if (mVar != 0) {
                                                r8.b(mVar);
                                                mVar = 0;
                                            }
                                            r8.b(nVar5);
                                        }
                                    }
                                    nVar5 = nVar5.f8109k;
                                    mVar = mVar;
                                    r8 = r8;
                                }
                                if (i7 == 1) {
                                }
                            }
                            mVar = f(r8);
                        }
                    }
                }
            }
            b(dVar, nVar3);
        }
    }
}
