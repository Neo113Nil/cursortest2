package d1;

import android.view.View;
import m0.e1;
import q6.s;
import u.j0;
import u1.s0;
import w1.b1;
import w1.d1;
import w1.f0;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f2058a = new int[2];

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:133:0x019a  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0197 A[EDGE_INSN: B:151:0x0197->B:132:0x0197 BREAK  A[LOOP:5: B:91:0x012c->B:146:0x012c], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x012e  */
    /* JADX WARN: Type inference failed for: r11v2, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean A(n nVar, n nVar2, int i, b1.f fVar) {
        y0.l lVar;
        f0 u7;
        b1 b1Var;
        if (nVar.t0() != m.f2092e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        n[] nVarArr = new n[16];
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar2 = nVar.f8706d;
        y0.l lVar3 = lVar2.i;
        if (lVar3 == null) {
            w1.f.b(eVar, lVar2);
        } else {
            eVar.b(lVar3);
        }
        int i8 = 0;
        while (true) {
            int i9 = eVar.f5580f;
            lVar = null;
            if (i9 == 0) {
                break;
            }
            y0.l lVar4 = (y0.l) eVar.k(i9 - 1);
            if ((lVar4.f8709g & 1024) == 0) {
                w1.f.b(eVar, lVar4);
            } else {
                while (true) {
                    if (lVar4 == null) {
                        break;
                    }
                    if ((lVar4.f8708f & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (lVar4 != null) {
                            if (lVar4 instanceof n) {
                                n nVar3 = (n) lVar4;
                                int i10 = i8 + 1;
                                if (nVarArr.length < i10) {
                                    int length = nVarArr.length;
                                    ?? r11 = new Object[Math.max(i10, length * 2)];
                                    System.arraycopy(nVarArr, 0, r11, 0, length);
                                    nVarArr = r11;
                                }
                                nVarArr[i8] = nVar3;
                                i8 = i10;
                            } else if ((lVar4.f8708f & 1024) != 0 && (lVar4 instanceof w1.l)) {
                                int i11 = 0;
                                for (y0.l lVar5 = ((w1.l) lVar4).f7707s; lVar5 != null; lVar5 = lVar5.i) {
                                    if ((lVar5.f8708f & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVar4 = lVar5;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar4 != null) {
                                                eVar2.b(lVar4);
                                                lVar4 = null;
                                            }
                                            eVar2.b(lVar5);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVar4 = w1.f.f(eVar2);
                        }
                    } else {
                        lVar4 = lVar4.i;
                    }
                }
            }
        }
        d6.l.Q(nVarArr, p.f2102a, 0, i8);
        if (i != 1) {
            if (i != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            v6.d u02 = r2.o.u0(0, i8);
            int i12 = u02.f7492d;
            int i13 = u02.f7493e;
            if (i12 <= i13) {
                boolean z3 = false;
                while (true) {
                    if (z3) {
                        n nVar4 = nVarArr[i13];
                        if (r(nVar4) && a(nVar4, fVar)) {
                            break;
                        }
                    }
                    if (q6.i.a(nVarArr[i13], nVar2)) {
                        z3 = true;
                    }
                    if (i13 == i12) {
                        break;
                    }
                    i13--;
                }
                return true;
            }
            if (i != 1) {
                if (!nVar.f8706d.f8718q) {
                }
                y0.l lVar6 = nVar.f8706d.f8710h;
                u7 = w1.f.u(nVar);
                loop5: while (true) {
                    if (u7 == null) {
                    }
                }
                if (lVar != null) {
                }
            }
            return false;
        }
        v6.d u03 = r2.o.u0(0, i8);
        int i14 = u03.f7492d;
        int i15 = u03.f7493e;
        if (i14 <= i15) {
            boolean z7 = false;
            while (true) {
                if (z7) {
                    n nVar5 = nVarArr[i14];
                    if (r(nVar5) && k(nVar5, fVar)) {
                        break;
                    }
                }
                if (q6.i.a(nVarArr[i14], nVar2)) {
                    z7 = true;
                }
                if (i14 == i15) {
                    break;
                }
                i14++;
            }
            return true;
        }
        if (i != 1 && nVar.s0().f2077a) {
            if (!nVar.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar62 = nVar.f8706d.f8710h;
            u7 = w1.f.u(nVar);
            loop5: while (true) {
                if (u7 == null) {
                    break;
                }
                if ((u7.F.f7600f.f8709g & 1024) != 0) {
                    while (lVar62 != null) {
                        if ((lVar62.f8708f & 1024) != 0) {
                            y0.l lVar7 = lVar62;
                            o0.e eVar3 = null;
                            while (lVar7 != null) {
                                if (lVar7 instanceof n) {
                                    lVar = lVar7;
                                    break loop5;
                                }
                                if ((lVar7.f8708f & 1024) != 0 && (lVar7 instanceof w1.l)) {
                                    int i16 = 0;
                                    for (y0.l lVar8 = ((w1.l) lVar7).f7707s; lVar8 != null; lVar8 = lVar8.i) {
                                        if ((lVar8.f8708f & 1024) != 0) {
                                            i16++;
                                            if (i16 == 1) {
                                                lVar7 = lVar8;
                                            } else {
                                                if (eVar3 == null) {
                                                    eVar3 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar7 != null) {
                                                    eVar3.b(lVar7);
                                                    lVar7 = null;
                                                }
                                                eVar3.b(lVar8);
                                            }
                                        }
                                    }
                                    if (i16 == 1) {
                                    }
                                }
                                lVar7 = w1.f.f(eVar3);
                            }
                        }
                        lVar62 = lVar62.f8710h;
                    }
                }
                u7 = u7.s();
                lVar62 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
            if (lVar != null) {
                return ((Boolean) fVar.i(nVar)).booleanValue();
            }
        }
        return false;
    }

    public static final b B(int i) {
        if (i == 1) {
            return new b(2);
        }
        if (i == 2) {
            return new b(1);
        }
        if (i == 17) {
            return new b(3);
        }
        if (i == 33) {
            return new b(5);
        }
        if (i == 66) {
            return new b(4);
        }
        if (i != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean C(int i, b1.f fVar, n nVar, e1.c cVar) {
        int ordinal = nVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                n n6 = n(nVar);
                if (n6 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n6.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean C = C(i, fVar, n6, cVar);
                        if (!q6.i.a(C, Boolean.FALSE)) {
                            return C;
                        }
                        if (cVar == null) {
                            if (n6.t0() != m.f2092e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            n g3 = g(n6);
                            if (g3 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            cVar = j(g3);
                        }
                        return Boolean.valueOf(l(i, fVar, nVar, cVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new a5.c();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (cVar == null) {
                    cVar = j(n6);
                }
                return Boolean.valueOf(l(i, fVar, nVar, cVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return nVar.s0().f2077a ? (Boolean) fVar.i(nVar) : cVar == null ? Boolean.valueOf(i(nVar, i, fVar)) : Boolean.valueOf(z(i, fVar, nVar, cVar));
                }
                throw new a5.c();
            }
        }
        return Boolean.valueOf(i(nVar, i, fVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(n nVar, b1.f fVar) {
        int ordinal = nVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                n n6 = n(nVar);
                if (n6 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n6.t0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new a5.c();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (a(n6, fVar) || m(nVar, n6, 2, fVar) || (n6.s0().f2077a && ((Boolean) fVar.i(n6)).booleanValue())) {
                        return true;
                    }
                }
                return m(nVar, n6, 2, fVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new a5.c();
                }
                if (!w(nVar, fVar)) {
                    if (!(nVar.s0().f2077a ? ((Boolean) fVar.i(nVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return w(nVar, fVar);
    }

    public static final boolean b(e1.c cVar, e1.c cVar2, e1.c cVar3, int i) {
        float f6;
        float f8;
        boolean c8 = c(i, cVar3, cVar);
        float f9 = cVar3.f2458b;
        float f10 = cVar3.f2460d;
        float f11 = cVar3.f2457a;
        float f12 = cVar3.f2459c;
        float f13 = cVar.f2460d;
        float f14 = cVar.f2458b;
        float f15 = cVar.f2459c;
        float f16 = cVar.f2457a;
        if (c8 || !c(i, cVar2, cVar)) {
            return false;
        }
        if (i == 3) {
            if (f16 < f12) {
                return true;
            }
        } else if (i == 4) {
            if (f15 > f11) {
                return true;
            }
        } else if (i == 5) {
            if (f14 < f10) {
                return true;
            }
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f13 > f9) {
                return true;
            }
        }
        if (i == 3 || i == 4) {
            return true;
        }
        if (i == 3) {
            f6 = f16 - cVar2.f2459c;
        } else if (i == 4) {
            f6 = cVar2.f2457a - f15;
        } else if (i == 5) {
            f6 = f14 - cVar2.f2460d;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = cVar2.f2458b - f13;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        if (i == 3) {
            f8 = f16 - f11;
        } else if (i == 4) {
            f8 = f12 - f15;
        } else if (i == 5) {
            f8 = f14 - f9;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f8 = f10 - f13;
        }
        if (f8 < 1.0f) {
            f8 = 1.0f;
        }
        return f6 < f8;
    }

    public static final boolean c(int i, e1.c cVar, e1.c cVar2) {
        if (i == 3 || i == 4) {
            return cVar.f2460d > cVar2.f2458b && cVar.f2458b < cVar2.f2460d;
        }
        if (i == 5 || i == 6) {
            return cVar.f2459c > cVar2.f2457a && cVar.f2457a < cVar2.f2459c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final e1.c d(View view, t tVar) {
        int[] iArr = f2058a;
        view.getLocationInWindow(iArr);
        int i = iArr[0];
        int i8 = iArr[1];
        tVar.getLocationInWindow(iArr);
        float f6 = i - iArr[0];
        float f8 = i8 - iArr[1];
        return new e1.c(f6, f8, view.getWidth() + f6, view.getHeight() + f8);
    }

    public static final boolean e(n nVar, boolean z3) {
        int ordinal = nVar.t0().ordinal();
        m mVar = m.f2094g;
        if (ordinal == 0) {
            ((i) ((t) w1.f.v(nVar)).getFocusOwner()).f(null);
            nVar.r0(m.f2091d, mVar);
            return true;
        }
        if (ordinal == 1) {
            n n6 = n(nVar);
            if (!(n6 != null ? e(n6, z3) : true)) {
                return false;
            }
            nVar.r0(m.f2092e, mVar);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new a5.c();
        }
        if (z3) {
            ((i) ((t) w1.f.v(nVar)).getFocusOwner()).f(null);
            nVar.r0(m.f2093f, mVar);
        }
        return z3;
    }

    public static final void f(n nVar, o0.e eVar) {
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new y0.l[16]);
        y0.l lVar = nVar.f8706d;
        y0.l lVar2 = lVar.i;
        if (lVar2 == null) {
            w1.f.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i = eVar2.f5580f;
            if (i == 0) {
                return;
            }
            y0.l lVar3 = (y0.l) eVar2.k(i - 1);
            if ((lVar3.f8709g & 1024) == 0) {
                w1.f.b(eVar2, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f8708f & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof n) {
                                n nVar2 = (n) lVar3;
                                if (nVar2.f8718q && !w1.f.u(nVar2).O) {
                                    if (nVar2.s0().f2077a) {
                                        eVar.b(nVar2);
                                    } else {
                                        f(nVar2, eVar);
                                    }
                                }
                            } else if ((lVar3.f8708f & 1024) != 0 && (lVar3 instanceof w1.l)) {
                                int i8 = 0;
                                for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                    if ((lVar4.f8708f & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar3.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar3.b(lVar4);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            lVar3 = w1.f.f(eVar3);
                        }
                    } else {
                        lVar3 = lVar3.i;
                    }
                }
            }
        }
    }

    public static final n g(n nVar) {
        n nVar2 = ((i) ((t) w1.f.v(nVar)).getFocusOwner()).f2073h;
        if (nVar2 == null || !nVar2.f8718q) {
            return null;
        }
        return nVar2;
    }

    public static final n h(o0.e eVar, e1.c cVar, int i) {
        e1.c d8;
        if (i == 3) {
            d8 = cVar.d((cVar.f2459c - cVar.f2457a) + 1, 0.0f);
        } else if (i == 4) {
            d8 = cVar.d(-((cVar.f2459c - cVar.f2457a) + 1), 0.0f);
        } else if (i == 5) {
            d8 = cVar.d(0.0f, (cVar.f2460d - cVar.f2458b) + 1);
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d8 = cVar.d(0.0f, -((cVar.f2460d - cVar.f2458b) + 1));
        }
        Object[] objArr = eVar.f5578d;
        int i8 = eVar.f5580f;
        n nVar = null;
        for (int i9 = 0; i9 < i8; i9++) {
            n nVar2 = (n) objArr[i9];
            if (r(nVar2)) {
                e1.c j7 = j(nVar2);
                if (o(j7, d8, cVar, i)) {
                    nVar = nVar2;
                    d8 = j7;
                }
            }
        }
        return nVar;
    }

    public static final boolean i(n nVar, int i, p6.c cVar) {
        e1.c cVar2;
        o0.e eVar = new o0.e(new n[16]);
        f(nVar, eVar);
        int i8 = eVar.f5580f;
        if (i8 <= 1) {
            n nVar2 = (n) (i8 == 0 ? null : eVar.f5578d[0]);
            if (nVar2 != null) {
                return ((Boolean) cVar.i(nVar2)).booleanValue();
            }
        } else {
            if (i == 7) {
                i = 4;
            }
            if (i == 4 || i == 6) {
                e1.c j7 = j(nVar);
                float f6 = j7.f2457a;
                float f8 = j7.f2458b;
                cVar2 = new e1.c(f6, f8, f6, f8);
            } else {
                if (i != 3 && i != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                e1.c j8 = j(nVar);
                float f9 = j8.f2459c;
                float f10 = j8.f2460d;
                cVar2 = new e1.c(f9, f10, f9, f10);
            }
            n h8 = h(eVar, cVar2, i);
            if (h8 != null) {
                return ((Boolean) cVar.i(h8)).booleanValue();
            }
        }
        return false;
    }

    public static final e1.c j(n nVar) {
        d1 d1Var = nVar.f8712k;
        return d1Var != null ? s0.g(d1Var).K(d1Var, false) : e1.c.f2456e;
    }

    public static final boolean k(n nVar, b1.f fVar) {
        int ordinal = nVar.t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                n n6 = n(nVar);
                if (n6 != null) {
                    return k(n6, fVar) || m(nVar, n6, 1, fVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return nVar.s0().f2077a ? ((Boolean) fVar.i(nVar)).booleanValue() : x(nVar, fVar);
                }
                throw new a5.c();
            }
        }
        return x(nVar, fVar);
    }

    public static final boolean l(int i, b1.f fVar, n nVar, e1.c cVar) {
        if (z(i, fVar, nVar, cVar)) {
            return true;
        }
        Boolean bool = (Boolean) y(nVar, i, new q(((i) ((t) w1.f.v(nVar)).getFocusOwner()).f2073h, nVar, cVar, i, fVar, 1));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(n nVar, n nVar2, int i, b1.f fVar) {
        if (A(nVar, nVar2, i, fVar)) {
            return true;
        }
        Boolean bool = (Boolean) y(nVar, i, new q(((i) ((t) w1.f.v(nVar)).getFocusOwner()).f2073h, nVar, nVar2, i, fVar, 0));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:72:0x0026, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final n n(n nVar) {
        boolean z3 = nVar.f8706d.f8718q;
        if (z3) {
            if (!z3) {
                t1.a.b("visitChildren called on an unattached node");
            }
            o0.e eVar = new o0.e(new y0.l[16]);
            y0.l lVar = nVar.f8706d;
            y0.l lVar2 = lVar.i;
            if (lVar2 == null) {
                w1.f.b(eVar, lVar);
            } else {
                eVar.b(lVar2);
            }
            loop0: while (true) {
                int i = eVar.f5580f;
                if (i == 0) {
                    break;
                }
                y0.l lVar3 = (y0.l) eVar.k(i - 1);
                if ((lVar3.f8709g & 1024) == 0) {
                    w1.f.b(eVar, lVar3);
                } else {
                    while (true) {
                        if (lVar3 == null) {
                            break;
                        }
                        if ((lVar3.f8708f & 1024) != 0) {
                            o0.e eVar2 = null;
                            while (lVar3 != null) {
                                if (lVar3 instanceof n) {
                                    n nVar2 = (n) lVar3;
                                    if (nVar2.f8706d.f8718q) {
                                        int ordinal = nVar2.t0().ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            break loop0;
                                        }
                                        if (ordinal != 3) {
                                            throw new a5.c();
                                        }
                                    }
                                } else if ((lVar3.f8708f & 1024) != 0 && (lVar3 instanceof w1.l)) {
                                    int i8 = 0;
                                    for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                        if ((lVar4.f8708f & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                lVar3 = lVar4;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar3 != null) {
                                                    eVar2.b(lVar3);
                                                    lVar3 = null;
                                                }
                                                eVar2.b(lVar4);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                lVar3 = w1.f.f(eVar2);
                            }
                        } else {
                            lVar3 = lVar3.i;
                        }
                    }
                }
            }
        }
        return null;
    }

    public static final boolean o(e1.c cVar, e1.c cVar2, e1.c cVar3, int i) {
        if (!p(i, cVar, cVar3)) {
            return false;
        }
        if (p(i, cVar2, cVar3) && !b(cVar3, cVar, cVar2, i)) {
            return !b(cVar3, cVar2, cVar, i) && q(i, cVar3, cVar) < q(i, cVar3, cVar2);
        }
        return true;
    }

    public static final boolean p(int i, e1.c cVar, e1.c cVar2) {
        float f6 = cVar.f2458b;
        float f8 = cVar.f2460d;
        float f9 = cVar.f2457a;
        float f10 = cVar.f2459c;
        if (i == 3) {
            float f11 = cVar2.f2459c;
            float f12 = cVar2.f2457a;
            return (f11 > f10 || f12 >= f10) && f12 > f9;
        }
        if (i == 4) {
            float f13 = cVar2.f2457a;
            float f14 = cVar2.f2459c;
            return (f13 < f9 || f14 <= f9) && f14 < f10;
        }
        if (i == 5) {
            float f15 = cVar2.f2460d;
            float f16 = cVar2.f2458b;
            return (f15 > f8 || f16 >= f8) && f16 > f6;
        }
        if (i != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f17 = cVar2.f2458b;
        float f18 = cVar2.f2460d;
        return (f17 < f6 || f18 <= f6) && f18 < f8;
    }

    public static final long q(int i, e1.c cVar, e1.c cVar2) {
        float f6;
        float f8;
        float f9 = cVar2.f2458b;
        float f10 = cVar2.f2460d;
        float f11 = cVar2.f2457a;
        float f12 = cVar2.f2459c;
        if (i == 3) {
            f6 = cVar.f2457a - f12;
        } else if (i == 4) {
            f6 = f11 - cVar.f2459c;
        } else if (i == 5) {
            f6 = cVar.f2458b - f10;
        } else {
            if (i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f6 = f9 - cVar.f2460d;
        }
        if (f6 < 0.0f) {
            f6 = 0.0f;
        }
        long j7 = (long) f6;
        if (i == 3 || i == 4) {
            float f13 = cVar.f2458b;
            float f14 = 2;
            f8 = (((cVar.f2460d - f13) / f14) + f13) - (((f10 - f9) / f14) + f9);
        } else {
            if (i != 5 && i != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f15 = cVar.f2457a;
            float f16 = 2;
            f8 = (((cVar.f2459c - f15) / f16) + f15) - (((f12 - f11) / f16) + f11);
        }
        long j8 = (long) f8;
        return (j8 * j8) + (13 * j7 * j7);
    }

    public static final boolean r(n nVar) {
        f0 f0Var;
        d1 d1Var;
        f0 f0Var2;
        d1 d1Var2 = nVar.f8712k;
        return (d1Var2 == null || (f0Var = d1Var2.f7614r) == null || !f0Var.H() || (d1Var = nVar.f8712k) == null || (f0Var2 = d1Var.f7614r) == null || !f0Var2.G()) ? false : true;
    }

    public static final a s(n nVar) {
        int ordinal = nVar.t0().ordinal();
        a aVar = a.f2053d;
        if (ordinal != 0) {
            a aVar2 = a.f2054e;
            if (ordinal == 1) {
                n n6 = n(nVar);
                if (n6 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                a s5 = s(n6);
                if (s5 == aVar) {
                    s5 = null;
                }
                if (s5 != null) {
                    return s5;
                }
                if (nVar.f2097s) {
                    return aVar;
                }
                nVar.f2097s = true;
                try {
                    k s02 = nVar.s0();
                    h focusOwner = ((t) w1.f.v(nVar)).getFocusOwner();
                    n nVar2 = ((i) focusOwner).f2073h;
                    s02.f2086k.getClass();
                    n nVar3 = ((i) focusOwner).f2073h;
                    return (nVar2 == nVar3 || nVar3 == null) ? aVar : l.f2089d == l.f2088c ? aVar2 : a.f2055f;
                } finally {
                    nVar.f2097s = false;
                }
            }
            if (ordinal == 2) {
                return aVar2;
            }
            if (ordinal != 3) {
                throw new a5.c();
            }
        }
        return aVar;
    }

    public static final a t(n nVar) {
        if (!nVar.f2098t) {
            nVar.f2098t = true;
            try {
                k s02 = nVar.s0();
                h focusOwner = ((t) w1.f.v(nVar)).getFocusOwner();
                n nVar2 = ((i) focusOwner).f2073h;
                s02.f2085j.getClass();
                n nVar3 = ((i) focusOwner).f2073h;
                if (nVar2 != nVar3 && nVar3 != null) {
                    return l.f2089d == l.f2088c ? a.f2054e : a.f2055f;
                }
            } finally {
                nVar.f2098t = false;
            }
        }
        return a.f2053d;
    }

    public static final a u(n nVar) {
        y0.l lVar;
        b1 b1Var;
        int ordinal = nVar.t0().ordinal();
        a aVar = a.f2053d;
        if (ordinal != 0) {
            if (ordinal == 1) {
                n n6 = n(nVar);
                if (n6 != null) {
                    return s(n6);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new a5.c();
                }
                if (!nVar.f8706d.f8718q) {
                    t1.a.b("visitAncestors called on an unattached node");
                }
                y0.l lVar2 = nVar.f8706d.f8710h;
                f0 u7 = w1.f.u(nVar);
                loop0: while (true) {
                    if (u7 == null) {
                        lVar = null;
                        break;
                    }
                    if ((u7.F.f7600f.f8709g & 1024) != 0) {
                        while (lVar2 != null) {
                            if ((lVar2.f8708f & 1024) != 0) {
                                lVar = lVar2;
                                o0.e eVar = null;
                                while (lVar != null) {
                                    if (lVar instanceof n) {
                                        break loop0;
                                    }
                                    if ((lVar.f8708f & 1024) != 0 && (lVar instanceof w1.l)) {
                                        int i = 0;
                                        for (y0.l lVar3 = ((w1.l) lVar).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                            if ((lVar3.f8708f & 1024) != 0) {
                                                i++;
                                                if (i == 1) {
                                                    lVar = lVar3;
                                                } else {
                                                    if (eVar == null) {
                                                        eVar = new o0.e(new y0.l[16]);
                                                    }
                                                    if (lVar != null) {
                                                        eVar.b(lVar);
                                                        lVar = null;
                                                    }
                                                    eVar.b(lVar3);
                                                }
                                            }
                                        }
                                        if (i == 1) {
                                        }
                                    }
                                    lVar = w1.f.f(eVar);
                                }
                            }
                            lVar2 = lVar2.f8710h;
                        }
                    }
                    u7 = u7.s();
                    lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
                }
                n nVar2 = (n) lVar;
                if (nVar2 == null) {
                    return aVar;
                }
                int ordinal2 = nVar2.t0().ordinal();
                if (ordinal2 == 0) {
                    return t(nVar2);
                }
                if (ordinal2 == 1) {
                    return u(nVar2);
                }
                if (ordinal2 == 2) {
                    return a.f2054e;
                }
                if (ordinal2 != 3) {
                    throw new a5.c();
                }
                a u8 = u(nVar2);
                a aVar2 = u8 != aVar ? u8 : null;
                return aVar2 == null ? t(nVar2) : aVar2;
            }
        }
        return aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v26, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean v(n nVar) {
        o0.e eVar;
        b1 b1Var;
        char c8;
        b1 b1Var2;
        i iVar = (i) ((t) w1.f.v(nVar)).getFocusOwner();
        n nVar2 = iVar.f2073h;
        m t02 = nVar.t0();
        if (nVar2 == nVar) {
            nVar.r0(t02, t02);
            return true;
        }
        int i = 0;
        if (nVar2 == null && !((i) ((t) w1.f.v(nVar)).getFocusOwner()).f2066a.C()) {
            return false;
        }
        char c9 = 16;
        if (nVar2 != null) {
            eVar = new o0.e(new n[16]);
            if (!nVar2.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar = nVar2.f8706d.f8710h;
            f0 u7 = w1.f.u(nVar2);
            while (u7 != null) {
                if ((u7.F.f7600f.f8709g & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.f8708f & 1024) != 0) {
                            y0.l lVar2 = lVar;
                            o0.e eVar2 = null;
                            while (lVar2 != null) {
                                if (lVar2 instanceof n) {
                                    eVar.b((n) lVar2);
                                } else if ((lVar2.f8708f & 1024) != 0 && (lVar2 instanceof w1.l)) {
                                    int i8 = 0;
                                    for (y0.l lVar3 = ((w1.l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                        if ((lVar3.f8708f & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (eVar2 == null) {
                                                    eVar2 = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar2 != null) {
                                                    eVar2.b(lVar2);
                                                    lVar2 = null;
                                                }
                                                eVar2.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                lVar2 = w1.f.f(eVar2);
                            }
                        }
                        lVar = lVar.f8710h;
                    }
                }
                u7 = u7.s();
                lVar = (u7 == null || (b1Var2 = u7.F) == null) ? null : b1Var2.f7599e;
            }
        } else {
            eVar = null;
        }
        n[] nVarArr = new n[16];
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar4 = nVar.f8706d.f8710h;
        f0 u8 = w1.f.u(nVar);
        int i9 = 1;
        int i10 = 0;
        while (u8 != null) {
            if ((u8.F.f7600f.f8709g & 1024) != 0) {
                while (lVar4 != null) {
                    if ((lVar4.f8708f & 1024) != 0) {
                        y0.l lVar5 = lVar4;
                        o0.e eVar3 = null;
                        while (lVar5 != null) {
                            if (lVar5 instanceof n) {
                                n nVar3 = (n) lVar5;
                                Boolean valueOf = eVar != null ? Boolean.valueOf(eVar.j(nVar3)) : null;
                                if (valueOf == null || !valueOf.booleanValue()) {
                                    int i11 = i10 + 1;
                                    if (nVarArr.length < i11) {
                                        int length = nVarArr.length;
                                        ?? r42 = new Object[Math.max(i11, length * 2)];
                                        System.arraycopy(nVarArr, i, r42, i, length);
                                        nVarArr = r42;
                                    }
                                    nVarArr[i10] = nVar3;
                                    i10 = i11;
                                }
                                if (nVar3 == nVar2) {
                                    i9 = i;
                                }
                            } else if ((lVar5.f8708f & 1024) != 0 && (lVar5 instanceof w1.l)) {
                                int i12 = i;
                                for (y0.l lVar6 = ((w1.l) lVar5).f7707s; lVar6 != null; lVar6 = lVar6.i) {
                                    if ((lVar6.f8708f & 1024) != 0) {
                                        i12++;
                                        if (i12 == 1) {
                                            lVar5 = lVar6;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar5 != null) {
                                                eVar3.b(lVar5);
                                                lVar5 = null;
                                            }
                                            eVar3.b(lVar6);
                                        }
                                    }
                                }
                                c8 = 16;
                                if (i12 == 1) {
                                    c9 = 16;
                                    i = 0;
                                }
                                lVar5 = w1.f.f(eVar3);
                                c9 = c8;
                                i = 0;
                            }
                            c8 = 16;
                            lVar5 = w1.f.f(eVar3);
                            c9 = c8;
                            i = 0;
                        }
                    }
                    lVar4 = lVar4.f8710h;
                    c9 = c9;
                    i = 0;
                }
            }
            char c10 = c9;
            u8 = u8.s();
            lVar4 = (u8 == null || (b1Var = u8.F) == null) ? null : b1Var.f7599e;
            c9 = c10;
            i = 0;
        }
        if (i9 == 0 || nVar2 == null || e(nVar2, false)) {
            w1.f.r(nVar, new o(0, nVar));
            int ordinal = nVar.t0().ordinal();
            if (ordinal != 0) {
                if (ordinal != 1) {
                    if (ordinal != 2) {
                        if (ordinal != 3) {
                            throw new a5.c();
                        }
                    }
                }
                ((i) ((t) w1.f.v(nVar)).getFocusOwner()).f(nVar);
            }
            m mVar = m.f2094g;
            m mVar2 = m.f2092e;
            if (eVar != null) {
                int i13 = eVar.f5580f - 1;
                Object[] objArr = eVar.f5578d;
                if (i13 < objArr.length) {
                    while (i13 >= 0) {
                        n nVar4 = (n) objArr[i13];
                        if (iVar.f2073h != nVar) {
                            break;
                        }
                        nVar4.r0(mVar2, mVar);
                        i13--;
                    }
                }
            }
            int i14 = i10 - 1;
            int length2 = nVarArr.length;
            m mVar3 = m.f2091d;
            if (i14 < length2) {
                while (i14 >= 0) {
                    n nVar5 = nVarArr[i14];
                    if (iVar.f2073h != nVar) {
                        break;
                    }
                    nVar5.r0(nVar5 == nVar2 ? mVar3 : mVar, mVar2);
                    i14--;
                }
            }
            if (iVar.f2073h == nVar) {
                nVar.r0(t02, mVar3);
                if (iVar.f2073h != nVar) {
                    break;
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean w(n nVar, b1.f fVar) {
        n[] nVarArr = new n[16];
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar = nVar.f8706d;
        y0.l lVar2 = lVar.i;
        if (lVar2 == null) {
            w1.f.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i = 0;
        while (true) {
            int i8 = eVar.f5580f;
            if (i8 == 0) {
                break;
            }
            y0.l lVar3 = (y0.l) eVar.k(i8 - 1);
            if ((lVar3.f8709g & 1024) == 0) {
                w1.f.b(eVar, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f8708f & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof n) {
                                n nVar2 = (n) lVar3;
                                int i9 = i + 1;
                                if (nVarArr.length < i9) {
                                    int length = nVarArr.length;
                                    ?? r10 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(nVarArr, 0, r10, 0, length);
                                    nVarArr = r10;
                                }
                                nVarArr[i] = nVar2;
                                i = i9;
                            } else if ((lVar3.f8708f & 1024) != 0 && (lVar3 instanceof w1.l)) {
                                int i10 = 0;
                                for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                    if ((lVar4.f8708f & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar2.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar2.b(lVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            lVar3 = w1.f.f(eVar2);
                        }
                    } else {
                        lVar3 = lVar3.i;
                    }
                }
            }
        }
        d6.l.Q(nVarArr, p.f2102a, 0, i);
        int i11 = i - 1;
        if (i11 < nVarArr.length) {
            while (i11 >= 0) {
                n nVar3 = nVarArr[i11];
                if (r(nVar3) && a(nVar3, fVar)) {
                    return true;
                }
                i11--;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.lang.Object, java.lang.Object[]] */
    public static final boolean x(n nVar, b1.f fVar) {
        n[] nVarArr = new n[16];
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar = new o0.e(new y0.l[16]);
        y0.l lVar = nVar.f8706d;
        y0.l lVar2 = lVar.i;
        if (lVar2 == null) {
            w1.f.b(eVar, lVar);
        } else {
            eVar.b(lVar2);
        }
        int i = 0;
        while (true) {
            int i8 = eVar.f5580f;
            if (i8 == 0) {
                break;
            }
            y0.l lVar3 = (y0.l) eVar.k(i8 - 1);
            if ((lVar3.f8709g & 1024) == 0) {
                w1.f.b(eVar, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f8708f & 1024) != 0) {
                        o0.e eVar2 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof n) {
                                n nVar2 = (n) lVar3;
                                int i9 = i + 1;
                                if (nVarArr.length < i9) {
                                    int length = nVarArr.length;
                                    ?? r10 = new Object[Math.max(i9, length * 2)];
                                    System.arraycopy(nVarArr, 0, r10, 0, length);
                                    nVarArr = r10;
                                }
                                nVarArr[i] = nVar2;
                                i = i9;
                            } else if ((lVar3.f8708f & 1024) != 0 && (lVar3 instanceof w1.l)) {
                                int i10 = 0;
                                for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                    if ((lVar4.f8708f & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar2 == null) {
                                                eVar2 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar2.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar2.b(lVar4);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            lVar3 = w1.f.f(eVar2);
                        }
                    } else {
                        lVar3 = lVar3.i;
                    }
                }
            }
        }
        d6.l.Q(nVarArr, p.f2102a, 0, i);
        for (int i11 = 0; i11 < i; i11++) {
            n nVar3 = nVarArr[i11];
            if (r(nVar3) && k(nVar3, fVar)) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:49:0x0099, code lost:
    
        if (q6.i.a((a0.p) r5.d(r0), (a0.p) r12.d(r0)) != false) goto L116;
     */
    /* JADX WARN: Type inference failed for: r13v47, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r13v8, types: [java.lang.Object, java.util.Collection] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r7v2, types: [java.lang.Object, java.util.Collection, java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object y(n nVar, int i, p6.c cVar) {
        int i8;
        int i9;
        Object obj;
        y0.l lVar;
        int max;
        int i10;
        b1 b1Var;
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar2 = nVar.f8706d.f8710h;
        f0 u7 = w1.f.u(nVar);
        loop0: while (true) {
            i8 = 0;
            i9 = 1;
            obj = null;
            if (u7 == null) {
                lVar = null;
                break;
            }
            if ((u7.F.f7600f.f8709g & 1024) != 0) {
                while (lVar2 != null) {
                    if ((lVar2.f8708f & 1024) != 0) {
                        lVar = lVar2;
                        o0.e eVar = null;
                        while (lVar != null) {
                            if (lVar instanceof n) {
                                break loop0;
                            }
                            if ((lVar.f8708f & 1024) != 0 && (lVar instanceof w1.l)) {
                                int i11 = 0;
                                for (y0.l lVar3 = ((w1.l) lVar).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                    if ((lVar3.f8708f & 1024) != 0) {
                                        i11++;
                                        if (i11 == 1) {
                                            lVar = lVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar != null) {
                                                eVar.b(lVar);
                                                lVar = null;
                                            }
                                            eVar.b(lVar3);
                                        }
                                    }
                                }
                                if (i11 == 1) {
                                }
                            }
                            lVar = w1.f.f(eVar);
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
        n nVar2 = (n) lVar;
        if (nVar2 != null) {
            v1.g gVar = u1.g.f7218a;
        }
        a0.p pVar = (a0.p) nVar.d(u1.g.f7218a);
        if (pVar != null) {
            int i12 = 5;
            if (i != 5) {
                i12 = 6;
                if (i != 6) {
                    i12 = 3;
                    if (i != 3) {
                        i12 = 4;
                        if (i != 4) {
                            if (i == 1) {
                                i12 = 2;
                            } else {
                                if (i != 2) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                }
                                i12 = 1;
                            }
                        }
                    }
                }
            }
            if (pVar.f128r.f9014a.g().f9052n <= 0 || pVar.f128r.f9014a.g().f9049k.isEmpty() || !pVar.f8718q) {
                return cVar.i(a0.p.f127u);
            }
            if (pVar.s0(i12)) {
                z.e eVar2 = pVar.f128r;
                max = Math.min(eVar2.f9014a.g().f9052n - 1, ((z.l) d6.m.X(eVar2.f9014a.g().f9049k)).f9056a);
            } else {
                max = Math.max(0, ((e1) pVar.f128r.f9014a.f9081e.f3283b).g());
            }
            s sVar = new s();
            a0.l lVar4 = pVar.f129s;
            lVar4.getClass();
            a0.k kVar = new a0.k(max, max);
            lVar4.f112a.b(kVar);
            sVar.f6205d = kVar;
            z.p pVar2 = pVar.f128r.f9014a;
            if (pVar2.g().f9049k.isEmpty()) {
                i9 = 0;
            } else {
                z.k g3 = pVar2.g();
                int g7 = (int) (g3.f9053o == j0.f7027d ? g3.g() & 4294967295L : g3.g() >> 32);
                z.k g8 = pVar2.g();
                ?? r7 = g8.f9049k;
                int size = r7.size();
                int i13 = 0;
                for (int i14 = 0; i14 < size; i14++) {
                    i13 += ((z.l) r7.get(i14)).f9064j;
                }
                int size2 = (i13 / r7.size()) + g8.f9055q;
                if (size2 != 0 && (i10 = g7 / size2) >= 1) {
                    i9 = i10;
                }
            }
            int i15 = i9 * 2;
            int i16 = pVar.f128r.f9014a.g().f9052n;
            if (i15 > i16) {
                i15 = i16;
            }
            while (obj == null && pVar.r0((a0.k) sVar.f6205d, i12) && i8 < i15) {
                a0.k kVar2 = (a0.k) sVar.f6205d;
                int i17 = kVar2.f107a;
                int i18 = kVar2.f108b;
                if (pVar.s0(i12)) {
                    i18++;
                } else {
                    i17--;
                }
                a0.l lVar5 = pVar.f129s;
                lVar5.getClass();
                a0.k kVar3 = new a0.k(i17, i18);
                lVar5.f112a.b(kVar3);
                pVar.f129s.f112a.j((a0.k) sVar.f6205d);
                sVar.f6205d = kVar3;
                i8++;
                w1.f.u(pVar).k();
                obj = cVar.i(new a0.o(pVar, sVar, i12));
            }
            pVar.f129s.f112a.j((a0.k) sVar.f6205d);
            w1.f.u(pVar).k();
            return obj;
        }
        return null;
    }

    public static final boolean z(int i, b1.f fVar, n nVar, e1.c cVar) {
        n h8;
        o0.e eVar = new o0.e(new n[16]);
        if (!nVar.f8706d.f8718q) {
            t1.a.b("visitChildren called on an unattached node");
        }
        o0.e eVar2 = new o0.e(new y0.l[16]);
        y0.l lVar = nVar.f8706d;
        y0.l lVar2 = lVar.i;
        if (lVar2 == null) {
            w1.f.b(eVar2, lVar);
        } else {
            eVar2.b(lVar2);
        }
        while (true) {
            int i8 = eVar2.f5580f;
            if (i8 == 0) {
                break;
            }
            y0.l lVar3 = (y0.l) eVar2.k(i8 - 1);
            if ((lVar3.f8709g & 1024) == 0) {
                w1.f.b(eVar2, lVar3);
            } else {
                while (true) {
                    if (lVar3 == null) {
                        break;
                    }
                    if ((lVar3.f8708f & 1024) != 0) {
                        o0.e eVar3 = null;
                        while (lVar3 != null) {
                            if (lVar3 instanceof n) {
                                n nVar2 = (n) lVar3;
                                if (nVar2.f8718q) {
                                    eVar.b(nVar2);
                                }
                            } else if ((lVar3.f8708f & 1024) != 0 && (lVar3 instanceof w1.l)) {
                                int i9 = 0;
                                for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                    if ((lVar4.f8708f & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            lVar3 = lVar4;
                                        } else {
                                            if (eVar3 == null) {
                                                eVar3 = new o0.e(new y0.l[16]);
                                            }
                                            if (lVar3 != null) {
                                                eVar3.b(lVar3);
                                                lVar3 = null;
                                            }
                                            eVar3.b(lVar4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            lVar3 = w1.f.f(eVar3);
                        }
                    } else {
                        lVar3 = lVar3.i;
                    }
                }
            }
        }
        while (eVar.f5580f != 0 && (h8 = h(eVar, cVar, i)) != null) {
            if (h8.s0().f2077a) {
                return ((Boolean) fVar.i(h8)).booleanValue();
            }
            if (l(i, fVar, h8, cVar)) {
                return true;
            }
            eVar.j(h8);
        }
        return false;
    }
}
