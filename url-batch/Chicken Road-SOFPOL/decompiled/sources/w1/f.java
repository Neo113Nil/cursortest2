package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class f {

    /* renamed from: a, reason: collision with root package name */
    public static final d f7637a = new d(0);

    /* renamed from: b, reason: collision with root package name */
    public static final h1 f7638b = new h1(1);

    public static final long a(float f6, boolean z3, boolean z7) {
        return (((z3 ? 1L : 0L) | (z7 ? 2L : 0L)) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
    }

    public static final void b(o0.e eVar, y0.l lVar) {
        o0.e x7 = u(lVar).x();
        int i = x7.f5580f - 1;
        Object[] objArr = x7.f5578d;
        if (i < objArr.length) {
            while (i >= 0) {
                eVar.b(((f0) objArr[i]).F.f7600f);
                i--;
            }
        }
    }

    public static final int c(n0 n0Var, u1.a aVar) {
        n0 i02 = n0Var.i0();
        if (i02 == null) {
            t1.a.b("Child of " + n0Var + " cannot be null when calculating alignment line");
        }
        if (n0Var.m0().a().containsKey(aVar)) {
            Integer num = (Integer) n0Var.m0().a().get(aVar);
            if (num != null) {
                return num.intValue();
            }
        } else {
            int h02 = i02.h0(aVar);
            if (h02 != Integer.MIN_VALUE) {
                i02.f7729m = true;
                n0Var.f7730n = true;
                n0Var.s0();
                i02.f7729m = false;
                n0Var.f7730n = false;
                return h02 + ((int) (aVar instanceof u1.k ? i02.o0() & 4294967295L : i02.o0() >> 32));
            }
        }
        return Integer.MIN_VALUE;
    }

    public static final boolean d(c cVar) {
        u1 u1Var = u(cVar).F.f7599e;
        q6.i.c(u1Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return u1Var.f7794r;
    }

    public static final y0.l e(k kVar, int i) {
        y0.l lVar = ((y0.l) kVar).f8706d.i;
        if (lVar == null || (lVar.f8709g & i) == 0) {
            return null;
        }
        while (lVar != null) {
            int i8 = lVar.f8708f;
            if ((i8 & 2) != 0) {
                return null;
            }
            if ((i8 & i) != 0) {
                return lVar;
            }
            lVar = lVar.i;
        }
        return null;
    }

    public static final y0.l f(o0.e eVar) {
        int i;
        if (eVar == null || (i = eVar.f5580f) == 0) {
            return null;
        }
        return (y0.l) eVar.k(i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final v g(y0.l lVar) {
        if ((lVar.f8708f & 2) != 0) {
            if (lVar instanceof v) {
                return (v) lVar;
            }
            if (lVar instanceof l) {
                y0.l lVar2 = ((l) lVar).f7707s;
                while (lVar2 != 0) {
                    if (lVar2 instanceof v) {
                        return (v) lVar2;
                    }
                    lVar2 = (!(lVar2 instanceof l) || (lVar2.f8708f & 2) == 0) ? lVar2.i : ((l) lVar2).f7707s;
                }
            }
        }
        return null;
    }

    public static final int h(long j7, long j8) {
        boolean p7 = p(j7);
        if (p7 != p(j8)) {
            return p7 ? -1 : 1;
        }
        return (Math.min(k(j7), k(j8)) >= 0.0f && o(j7) != o(j8)) ? o(j7) ? -1 : 1 : (int) Math.signum(k(j7) - k(j8));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(j jVar, m0.r1 r1Var) {
        if (!((y0.l) jVar).f8706d.f8718q) {
            t1.a.b("Cannot read CompositionLocal because the Modifier node is not currently attached.");
        }
        u0.g gVar = (u0.g) u(jVar).B;
        gVar.getClass();
        return m0.b.r(gVar, r1Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, w1.k, w1.x1] */
    /* JADX WARN: Type inference failed for: r3v10, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r3v9 */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final x1 j(x1 x1Var) {
        b1 b1Var;
        y0.l lVar = (y0.l) x1Var;
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar2 = lVar.f8706d.f8710h;
        f0 u7 = u(x1Var);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 262144) != 0) {
                        l lVar3 = lVar2;
                        ?? r52 = 0;
                        while (lVar3 != 0) {
                            if (lVar3 instanceof x1) {
                                x1 x1Var2 = (x1) lVar3;
                                if (q6.i.a(x1Var.m(), x1Var2.m()) && x1Var.getClass() == x1Var2.getClass()) {
                                    return x1Var2;
                                }
                            } else if ((lVar3.f8708f & 262144) != 0 && (lVar3 instanceof l)) {
                                y0.l lVar4 = lVar3.f7707s;
                                int i = 0;
                                lVar3 = lVar3;
                                r52 = r52;
                                while (lVar4 != null) {
                                    if ((lVar4.f8708f & 262144) != 0) {
                                        i++;
                                        r52 = r52;
                                        if (i == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (r52 == 0) {
                                                r52 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar3 != 0) {
                                                r52.b(lVar3);
                                                lVar3 = 0;
                                            }
                                            r52.b(lVar4);
                                        }
                                    }
                                    lVar4 = lVar4.i;
                                    lVar3 = lVar3;
                                    r52 = r52;
                                }
                                if (i == 1) {
                                }
                            }
                            lVar3 = f(r52);
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
        return null;
    }

    public static final float k(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void l(m mVar) {
        if (((y0.l) mVar).f8706d.f8718q) {
            s(mVar, 1).L0();
        }
    }

    public static final void m(v vVar) {
        u(vVar).C();
    }

    public static final void n(s1 s1Var) {
        u(s1Var).E();
    }

    public static final boolean o(long j7) {
        return (j7 & 2) != 0;
    }

    public static final boolean p(long j7) {
        return (j7 & 1) != 0;
    }

    public static final boolean q(f0 f0Var) {
        if (f0Var.f7644j == null) {
            return false;
        }
        f0 s5 = f0Var.s();
        return (s5 != null ? s5.f7644j : null) == null || f0Var.G.f7687b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void r(y0.l lVar, p6.a aVar) {
        g1 g1Var = lVar.f8711j;
        if (g1Var == null) {
            g1Var = new g1((f1) lVar);
            lVar.f8711j = g1Var;
        }
        ((x1.t) v(lVar)).getSnapshotObserver().a(g1Var, e.f7626j, aVar);
    }

    public static final d1 s(k kVar, int i) {
        d1 d1Var = ((y0.l) kVar).f8706d.f8712k;
        q6.i.b(d1Var);
        if (d1Var.E0() != kVar || !e1.g(i)) {
            return d1Var;
        }
        d1 d1Var2 = d1Var.f7615s;
        q6.i.b(d1Var2);
        return d1Var2;
    }

    public static final d1 t(k kVar) {
        if (!((y0.l) kVar).f8706d.f8718q) {
            t1.a.b("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
        }
        d1 s5 = s(kVar, 2);
        if (!s5.E0().f8718q) {
            t1.a.b("LayoutCoordinates is not attached.");
        }
        return s5;
    }

    public static final f0 u(k kVar) {
        d1 d1Var = ((y0.l) kVar).f8706d.f8712k;
        if (d1Var != null) {
            return d1Var.f7614r;
        }
        throw a0.q.f("Cannot obtain node coordinator. Is the Modifier.Node attached?");
    }

    public static final k1 v(k kVar) {
        k1 k1Var = u(kVar).f7650p;
        if (k1Var != null) {
            return k1Var;
        }
        throw a0.q.f("This node does not have an owner.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [java.lang.Object, w1.k, w1.x1] */
    /* JADX WARN: Type inference failed for: r12v0, types: [p6.c] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r2v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void w(x1 x1Var, p6.c cVar) {
        b1 b1Var;
        y0.l lVar = (y0.l) x1Var;
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar2 = lVar.f8706d.f8710h;
        f0 u7 = u(x1Var);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 262144) != 0) {
                        l lVar3 = lVar2;
                        ?? r52 = 0;
                        while (lVar3 != 0) {
                            boolean z3 = true;
                            if (lVar3 instanceof x1) {
                                x1 x1Var2 = (x1) lVar3;
                                if (q6.i.a(x1Var.m(), x1Var2.m()) && x1Var.getClass() == x1Var2.getClass()) {
                                    z3 = ((Boolean) cVar.i(x1Var2)).booleanValue();
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                if (((lVar3.f8708f & 262144) != 0) && (lVar3 instanceof l)) {
                                    y0.l lVar4 = lVar3.f7707s;
                                    int i = 0;
                                    lVar3 = lVar3;
                                    r52 = r52;
                                    while (lVar4 != null) {
                                        if ((lVar4.f8708f & 262144) != 0) {
                                            i++;
                                            r52 = r52;
                                            if (i == 1) {
                                                lVar3 = lVar4;
                                            } else {
                                                if (r52 == 0) {
                                                    r52 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar3 != 0) {
                                                    r52.b(lVar3);
                                                    lVar3 = 0;
                                                }
                                                r52.b(lVar4);
                                            }
                                        }
                                        lVar4 = lVar4.i;
                                        lVar3 = lVar3;
                                        r52 = r52;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            lVar3 = f(r52);
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [p6.c] */
    /* JADX WARN: Type inference failed for: r1v11 */
    /* JADX WARN: Type inference failed for: r1v12, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v16 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v18 */
    /* JADX WARN: Type inference failed for: r1v19 */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [y0.l] */
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
    public static final void x(y0.l lVar, Object obj, p6.c cVar) {
        b1 b1Var;
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar2 = lVar.f8706d.f8710h;
        f0 u7 = u(lVar);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 262144) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 262144) != 0) {
                        l lVar3 = lVar2;
                        ?? r42 = 0;
                        while (lVar3 != 0) {
                            if (lVar3 instanceof x1) {
                                x1 x1Var = (x1) lVar3;
                                if (!(obj.equals(x1Var.m()) ? ((Boolean) cVar.i(x1Var)).booleanValue() : true)) {
                                    return;
                                }
                            } else {
                                if (((lVar3.f8708f & 262144) != 0) && (lVar3 instanceof l)) {
                                    y0.l lVar4 = lVar3.f7707s;
                                    int i = 0;
                                    lVar3 = lVar3;
                                    r42 = r42;
                                    while (lVar4 != null) {
                                        if ((lVar4.f8708f & 262144) != 0) {
                                            i++;
                                            r42 = r42;
                                            if (i == 1) {
                                                lVar3 = lVar4;
                                            } else {
                                                if (r42 == 0) {
                                                    r42 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar3 != 0) {
                                                    r42.b(lVar3);
                                                    lVar3 = 0;
                                                }
                                                r42.b(lVar4);
                                            }
                                        }
                                        lVar4 = lVar4.i;
                                        lVar3 = lVar3;
                                        r42 = r42;
                                    }
                                    if (i == 1) {
                                    }
                                }
                            }
                            lVar3 = f(r42);
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, w1.x1] */
    /* JADX WARN: Type inference failed for: r13v0, types: [p6.c] */
    /* JADX WARN: Type inference failed for: r6v0 */
    /* JADX WARN: Type inference failed for: r6v1, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [y0.l] */
    /* JADX WARN: Type inference failed for: r6v9, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v4 */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r7v8 */
    /* JADX WARN: Type inference failed for: r7v9 */
    public static final void y(x1 x1Var, p6.c cVar) {
        y0.l lVar = (y0.l) x1Var;
        if (!lVar.f8706d.f8718q) {
            t1.a.b("visitSubtreeIf called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar2 = lVar.f8706d;
        y0.l lVar3 = lVar2.i;
        if (lVar3 == null) {
            b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        while (true) {
            int i = eVar.f5580f;
            if (i == 0) {
                return;
            }
            y0.l lVar4 = (y0.l) eVar.k(i - 1);
            if ((lVar4.f8709g & 262144) != 0) {
                for (y0.l lVar5 = lVar4; lVar5 != null; lVar5 = lVar5.i) {
                    if ((lVar5.f8708f & 262144) != 0) {
                        l lVar6 = lVar5;
                        ?? r7 = 0;
                        while (lVar6 != 0) {
                            if (lVar6 instanceof x1) {
                                x1 x1Var2 = (x1) lVar6;
                                w1 w1Var = (q6.i.a(x1Var.m(), x1Var2.m()) && x1Var.getClass() == x1Var2.getClass()) ? (w1) cVar.i(x1Var2) : w1.f7817d;
                                if (w1Var == w1.f7819f) {
                                    return;
                                }
                                if (w1Var == w1.f7818e) {
                                    break;
                                }
                            } else if ((lVar6.f8708f & 262144) != 0 && (lVar6 instanceof l)) {
                                y0.l lVar7 = lVar6.f7707s;
                                int i8 = 0;
                                lVar6 = lVar6;
                                r7 = r7;
                                while (lVar7 != null) {
                                    if ((lVar7.f8708f & 262144) != 0) {
                                        i8++;
                                        r7 = r7;
                                        if (i8 == 1) {
                                            lVar6 = lVar7;
                                        } else {
                                            if (r7 == 0) {
                                                r7 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar6 != 0) {
                                                r7.b(lVar6);
                                                lVar6 = 0;
                                            }
                                            r7.b(lVar7);
                                        }
                                    }
                                    lVar7 = lVar7.i;
                                    lVar6 = lVar6;
                                    r7 = r7;
                                }
                                if (i8 == 1) {
                                }
                            }
                            lVar6 = f(r7);
                        }
                    }
                }
            }
            b(eVar, lVar4);
        }
    }
}
