package t0;

import I.AbstractC0114p0;
import I.C0089d;
import I.C0120t;
import e2.AbstractC0381e;
import r0.C0837j;
import u0.C0997t;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0898f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0896d f7911a = new C0896d(0);

    public static final long a(float f3, boolean z3) {
        return ((z3 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
    }

    public static final void b(K.d dVar, U.k kVar) {
        K.d t3 = t(kVar).t();
        int i3 = t3.f2642f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = t3.f2640d;
            do {
                dVar.b((U.k) ((D) objArr[i4]).f7735x.f2356f);
                i4--;
            } while (i4 >= 0);
        }
    }

    public static final int c(O o3, C0837j c0837j) {
        O d02 = o3.d0();
        if (d02 == null) {
            AbstractC0381e.N("Child of " + o3 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (o3.k0().i().containsKey(c0837j)) {
            Integer num = (Integer) o3.k0().i().get(c0837j);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int L2 = d02.L(c0837j);
        if (L2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        d02.f7824j = true;
        o3.f7825k = true;
        o3.o0();
        d02.f7824j = false;
        o3.f7825k = false;
        return L2 + ((int) (c0837j instanceof C0837j ? d02.m0() & 4294967295L : d02.m0() >> 32));
    }

    public static final boolean d(C0895c c0895c) {
        o0 o0Var = (o0) t(c0895c).f7735x.f2355e;
        Z1.i.d(o0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return o0Var.f7941q;
    }

    public static final U.k e(InterfaceC0904l interfaceC0904l, int i3) {
        U.k kVar = ((U.k) interfaceC0904l).f3303d.f3308i;
        if (kVar == null || (kVar.f3306g & i3) == 0) {
            return null;
        }
        while (kVar != null) {
            int i4 = kVar.f3305f;
            if ((i4 & 2) != 0) {
                return null;
            }
            if ((i4 & i3) != 0) {
                return kVar;
            }
            kVar = kVar.f3308i;
        }
        return null;
    }

    public static final U.k f(K.d dVar) {
        if (dVar == null || dVar.l()) {
            return null;
        }
        return (U.k) dVar.o(dVar.f2642f - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC0914w g(U.k kVar) {
        if ((kVar.f3305f & 2) != 0) {
            if (kVar instanceof InterfaceC0914w) {
                return (InterfaceC0914w) kVar;
            }
            if (kVar instanceof AbstractC0905m) {
                U.k kVar2 = ((AbstractC0905m) kVar).f7937r;
                while (kVar2 != 0) {
                    if (kVar2 instanceof InterfaceC0914w) {
                        return (InterfaceC0914w) kVar2;
                    }
                    kVar2 = (!(kVar2 instanceof AbstractC0905m) || (kVar2.f3305f & 2) == 0) ? kVar2.f3308i : ((AbstractC0905m) kVar2).f7937r;
                }
            }
        }
        return null;
    }

    public static final int h(long j3, long j4) {
        boolean z3 = ((int) (j3 & 4294967295L)) != 0;
        return z3 != (((int) (4294967295L & j4)) != 0) ? z3 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j3 >> 32)) - Float.intBitsToFloat((int) (j4 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC0903k interfaceC0903k, AbstractC0114p0 abstractC0114p0) {
        if (!((U.k) interfaceC0903k).f3303d.p) {
            AbstractC0381e.N("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        Q.d dVar = (Q.d) t(interfaceC0903k).f7733v;
        dVar.getClass();
        return C0089d.K(dVar, abstractC0114p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final q0 j(InterfaceC0904l interfaceC0904l, Object obj) {
        C0120t c0120t;
        U.k kVar = ((U.k) interfaceC0904l).f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar2 = kVar.f3307h;
        D t3 = t(interfaceC0904l);
        while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 262144) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3305f & 262144) != 0) {
                        AbstractC0905m abstractC0905m = kVar2;
                        ?? r4 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof q0) {
                                q0 q0Var = (q0) abstractC0905m;
                                if (obj.equals(q0Var.v())) {
                                    return q0Var;
                                }
                            } else if ((abstractC0905m.f3305f & 262144) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar3 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r4 = r4;
                                while (kVar3 != null) {
                                    if ((kVar3.f3305f & 262144) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r4.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r4.b(kVar3);
                                        }
                                    }
                                    kVar3 = kVar3.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = f(r4);
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t0.l, t0.q0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final q0 k(q0 q0Var) {
        C0120t c0120t;
        U.k kVar = ((U.k) q0Var).f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar2 = kVar.f3307h;
        D t3 = t(q0Var);
        while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 262144) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3305f & 262144) != 0) {
                        AbstractC0905m abstractC0905m = kVar2;
                        ?? r5 = 0;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof q0) {
                                q0 q0Var2 = (q0) abstractC0905m;
                                if (Z1.i.a(q0Var.v(), q0Var2.v()) && U.m.a(q0Var, q0Var2)) {
                                    return q0Var2;
                                }
                            } else if ((abstractC0905m.f3305f & 262144) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar3 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r5 = r5;
                                while (kVar3 != null) {
                                    if ((kVar3.f3305f & 262144) != 0) {
                                        i3++;
                                        r5 = r5;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r5.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r5.b(kVar3);
                                        }
                                    }
                                    kVar3 = kVar3.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r5 = r5;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = f(r5);
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return null;
    }

    public static final int l(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(InterfaceC0907o interfaceC0907o) {
        if (((U.k) interfaceC0907o).f3303d.p) {
            r(interfaceC0907o, 1).H0();
        }
    }

    public static final void n(InterfaceC0914w interfaceC0914w) {
        t(interfaceC0914w).y();
    }

    public static final void o(n0 n0Var) {
        t(n0Var).z();
    }

    public static final boolean p(D d3) {
        if (d3.f7718f != null) {
            D q2 = d3.q();
            if ((q2 != null ? q2.f7718f : null) == null || d3.f7736y.f7798b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(U.k kVar, Y1.a aVar) {
        d0 d0Var = kVar.f3309j;
        if (d0Var == null) {
            d0Var = new d0((c0) kVar);
            kVar.f3309j = d0Var;
        }
        ((C0997t) u(kVar)).getSnapshotObserver().a(d0Var, C0897e.f7900j, aVar);
    }

    public static final a0 r(InterfaceC0904l interfaceC0904l, int i3) {
        a0 a0Var = ((U.k) interfaceC0904l).f3303d.f3310k;
        Z1.i.c(a0Var);
        if (a0Var.B0() != interfaceC0904l || !b0.h(i3)) {
            return a0Var;
        }
        a0 a0Var2 = a0Var.p;
        Z1.i.c(a0Var2);
        return a0Var2;
    }

    public static final a0 s(InterfaceC0904l interfaceC0904l) {
        if (!((U.k) interfaceC0904l).f3303d.p) {
            AbstractC0381e.N("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        a0 r3 = r(interfaceC0904l, 2);
        if (r3.B0().p) {
            return r3;
        }
        AbstractC0381e.N("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final D t(InterfaceC0904l interfaceC0904l) {
        a0 a0Var = ((U.k) interfaceC0904l).f3303d.f3310k;
        if (a0Var != null) {
            return a0Var.f7877o;
        }
        AbstractC0381e.O("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final g0 u(InterfaceC0904l interfaceC0904l) {
        C0997t c0997t = t(interfaceC0904l).f7724l;
        if (c0997t != null) {
            return c0997t;
        }
        AbstractC0381e.O("This node does not have an owner.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, t0.q0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [Y1.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [K.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void v(q0 q0Var, Y1.c cVar) {
        U.k kVar = ((U.k) q0Var).f3303d;
        if (!kVar.p) {
            AbstractC0381e.N("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        while (dVar.m()) {
            U.k kVar3 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar3.f3306g & 262144) != 0) {
                for (U.k kVar4 = kVar3; kVar4 != null; kVar4 = kVar4.f3308i) {
                    if ((kVar4.f3305f & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC0905m abstractC0905m = kVar4;
                        while (abstractC0905m != 0) {
                            if (abstractC0905m instanceof q0) {
                                q0 q0Var2 = (q0) abstractC0905m;
                                p0 p0Var = (Z1.i.a(q0Var.v(), q0Var2.v()) && U.m.a(q0Var, q0Var2)) ? (p0) cVar.j(q0Var2) : p0.f7942d;
                                if (p0Var == p0.f7944f) {
                                    return;
                                }
                                if (p0Var == p0.f7943e) {
                                    break;
                                }
                            } else if ((abstractC0905m.f3305f & 262144) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                U.k kVar5 = abstractC0905m.f7937r;
                                int i3 = 0;
                                abstractC0905m = abstractC0905m;
                                r8 = r8;
                                while (kVar5 != null) {
                                    if ((kVar5.f3305f & 262144) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            abstractC0905m = kVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new K.d(new U.k[16]);
                                            }
                                            if (abstractC0905m != 0) {
                                                r8.b(abstractC0905m);
                                                abstractC0905m = 0;
                                            }
                                            r8.b(kVar5);
                                        }
                                    }
                                    kVar5 = kVar5.f3308i;
                                    abstractC0905m = abstractC0905m;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC0905m = f(r8);
                        }
                    }
                }
            }
            b(dVar, kVar3);
        }
    }
}
