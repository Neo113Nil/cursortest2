package t0;

import I.AbstractC0168p0;
import I.C0143d;
import I.C0174t;
import android.view.View;
import e2.InterfaceC0422a;
import e2.InterfaceC0424c;
import n.z0;
import n0.C0715m;
import r0.C0915l;
import u0.C1123s;

/* renamed from: t0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0993f {

    /* renamed from: a, reason: collision with root package name */
    public static final C0991d f8743a = new C0991d(0);

    public static final long a(float f3, boolean z3) {
        return ((z3 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f3) << 32);
    }

    public static final void b(K.d dVar, U.p pVar) {
        K.d v3 = t(pVar).v();
        int i3 = v3.f3216f;
        if (i3 > 0) {
            int i4 = i3 - 1;
            Object[] objArr = v3.f3214d;
            do {
                dVar.b((U.p) ((E) objArr[i4]).f8561y.f2915f);
                i4--;
            } while (i4 >= 0);
        }
    }

    public static final int c(P p3, C0915l c0915l) {
        P p02 = p3.p0();
        if (p02 == null) {
            z0.o("Child of " + p3 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (p3.t0().i().containsKey(c0915l)) {
            Integer num = (Integer) p3.t0().i().get(c0915l);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int W2 = p02.W(c0915l);
        if (W2 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        p02.f8653j = true;
        p3.f8654k = true;
        p3.x0();
        p02.f8653j = false;
        p3.f8654k = false;
        return W2 + ((int) (c0915l instanceof C0915l ? p02.v0() & 4294967295L : p02.v0() >> 32));
    }

    public static final boolean d(C0990c c0990c) {
        p0 p0Var = (p0) t(c0990c).f8561y.f2914e;
        f2.j.d(p0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return p0Var.f8775q;
    }

    public static final U.p e(InterfaceC0999l interfaceC0999l, int i3) {
        U.p pVar = ((U.p) interfaceC0999l).f4489d.f4494i;
        if (pVar == null || (pVar.f4492g & i3) == 0) {
            return null;
        }
        while (pVar != null) {
            int i4 = pVar.f4491f;
            if ((i4 & 2) != 0) {
                return null;
            }
            if ((i4 & i3) != 0) {
                return pVar;
            }
            pVar = pVar.f4494i;
        }
        return null;
    }

    public static final U.p f(K.d dVar) {
        if (dVar == null || dVar.l()) {
            return null;
        }
        return (U.p) dVar.o(dVar.f3216f - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1009w g(U.p pVar) {
        if ((pVar.f4491f & 2) != 0) {
            if (pVar instanceof InterfaceC1009w) {
                return (InterfaceC1009w) pVar;
            }
            if (pVar instanceof AbstractC1000m) {
                U.p pVar2 = ((AbstractC1000m) pVar).f8771r;
                while (pVar2 != 0) {
                    if (pVar2 instanceof InterfaceC1009w) {
                        return (InterfaceC1009w) pVar2;
                    }
                    pVar2 = (!(pVar2 instanceof AbstractC1000m) || (pVar2.f4491f & 2) == 0) ? pVar2.f4494i : ((AbstractC1000m) pVar2).f8771r;
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
    public static final Object i(InterfaceC0998k interfaceC0998k, AbstractC0168p0 abstractC0168p0) {
        if (!((U.p) interfaceC0998k).f4489d.f4501p) {
            z0.o("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        Q.d dVar = (Q.d) t(interfaceC0998k).f8559w;
        dVar.getClass();
        return C0143d.L(dVar, abstractC0168p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [U.p] */
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
    public static final r0 j(InterfaceC0999l interfaceC0999l, Object obj) {
        C0174t c0174t;
        U.p pVar = ((U.p) interfaceC0999l).f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar2 = pVar.f4493h;
        E t3 = t(interfaceC0999l);
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 262144) != 0) {
                        AbstractC1000m abstractC1000m = pVar2;
                        ?? r4 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof r0) {
                                r0 r0Var = (r0) abstractC1000m;
                                if (obj.equals(r0Var.w())) {
                                    return r0Var;
                                }
                            } else if ((abstractC1000m.f4491f & 262144) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar3 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r4 = r4;
                                while (pVar3 != null) {
                                    if ((pVar3.f4491f & 262144) != 0) {
                                        i3++;
                                        r4 = r4;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r4.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r4.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r4 = r4;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = f(r4);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, t0.l, t0.r0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [U.p] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [U.p] */
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
    public static final r0 k(r0 r0Var) {
        C0174t c0174t;
        U.p pVar = ((U.p) r0Var).f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar2 = pVar.f4493h;
        E t3 = t(r0Var);
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 262144) != 0) {
                        AbstractC1000m abstractC1000m = pVar2;
                        ?? r5 = 0;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof r0) {
                                r0 r0Var2 = (r0) abstractC1000m;
                                if (f2.j.a(r0Var.w(), r0Var2.w()) && U.a.a(r0Var, r0Var2)) {
                                    return r0Var2;
                                }
                            } else if ((abstractC1000m.f4491f & 262144) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar3 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r5 = r5;
                                while (pVar3 != null) {
                                    if ((pVar3.f4491f & 262144) != 0) {
                                        i3++;
                                        r5 = r5;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r5.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r5.b(pVar3);
                                        }
                                    }
                                    pVar3 = pVar3.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r5 = r5;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = f(r5);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        return null;
    }

    public static final int l(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void m(InterfaceC1002o interfaceC1002o) {
        if (((U.p) interfaceC1002o).f4489d.f4501p) {
            r(interfaceC1002o, 1).Q0();
        }
    }

    public static final void n(InterfaceC1009w interfaceC1009w) {
        t(interfaceC1009w).A();
    }

    public static final void o(o0 o0Var) {
        t(o0Var).B();
    }

    public static final boolean p(E e3) {
        if (e3.f8542f != null) {
            E s3 = e3.s();
            if ((s3 != null ? s3.f8542f : null) == null || e3.f8562z.f8626b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void q(U.p pVar, InterfaceC0422a interfaceC0422a) {
        e0 e0Var = pVar.f4495j;
        if (e0Var == null) {
            e0Var = new e0((d0) pVar);
            pVar.f4495j = e0Var;
        }
        ((C1123s) u(pVar)).getSnapshotObserver().a(e0Var, C0992e.f8732j, interfaceC0422a);
    }

    public static final b0 r(InterfaceC0999l interfaceC0999l, int i3) {
        b0 b0Var = ((U.p) interfaceC0999l).f4489d.f4496k;
        f2.j.c(b0Var);
        if (b0Var.K0() != interfaceC0999l || !c0.h(i3)) {
            return b0Var;
        }
        b0 b0Var2 = b0Var.f8712p;
        f2.j.c(b0Var2);
        return b0Var2;
    }

    public static final b0 s(InterfaceC0999l interfaceC0999l) {
        if (!((U.p) interfaceC0999l).f4489d.f4501p) {
            z0.o("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        b0 r3 = r(interfaceC0999l, 2);
        if (r3.K0().f4501p) {
            return r3;
        }
        z0.o("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final E t(InterfaceC0999l interfaceC0999l) {
        b0 b0Var = ((U.p) interfaceC0999l).f4489d.f4496k;
        if (b0Var != null) {
            return b0Var.f8711o;
        }
        z0.p("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final h0 u(InterfaceC0999l interfaceC0999l) {
        C1123s c1123s = t(interfaceC0999l).f8548l;
        if (c1123s != null) {
            return c1123s;
        }
        z0.p("This node does not have an owner.");
        throw null;
    }

    public static final View v(InterfaceC0999l interfaceC0999l) {
        if (((U.p) interfaceC0999l).f4489d.f4501p) {
            return (View) H.a(t(interfaceC0999l));
        }
        z0.o("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [e2.c] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [U.p] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [U.p] */
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
    public static final void w(C0715m c0715m, InterfaceC0424c interfaceC0424c) {
        C0174t c0174t;
        U.p pVar = c0715m.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar2 = pVar.f4493h;
        E t3 = t(c0715m);
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 262144) != 0) {
                while (pVar2 != null) {
                    if ((pVar2.f4491f & 262144) != 0) {
                        AbstractC1000m abstractC1000m = pVar2;
                        ?? r5 = 0;
                        while (abstractC1000m != 0) {
                            boolean z3 = true;
                            if (abstractC1000m instanceof r0) {
                                r0 r0Var = (r0) abstractC1000m;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(r0Var.w()) && U.a.a(c0715m, r0Var)) {
                                    z3 = ((Boolean) interfaceC0424c.n(r0Var)).booleanValue();
                                }
                                if (!z3) {
                                    return;
                                }
                            } else {
                                if (((abstractC1000m.f4491f & 262144) != 0) && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar3 = abstractC1000m.f8771r;
                                    int i3 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r5 = r5;
                                    while (pVar3 != null) {
                                        if ((pVar3.f4491f & 262144) != 0) {
                                            i3++;
                                            r5 = r5;
                                            if (i3 == 1) {
                                                abstractC1000m = pVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new K.d(new U.p[16]);
                                                }
                                                if (abstractC1000m != 0) {
                                                    r5.b(abstractC1000m);
                                                    abstractC1000m = 0;
                                                }
                                                r5.b(pVar3);
                                            }
                                        }
                                        pVar3 = pVar3.f4494i;
                                        abstractC1000m = abstractC1000m;
                                        r5 = r5;
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                            }
                            abstractC1000m = f(r5);
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, t0.r0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [e2.c] */
    /* JADX WARN: Type inference failed for: r7v10, types: [U.p] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [U.p] */
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
    public static final void x(r0 r0Var, InterfaceC0424c interfaceC0424c) {
        U.p pVar = ((U.p) r0Var).f4489d;
        if (!pVar.f4501p) {
            z0.o("visitSubtreeIf called on an unattached node");
            throw null;
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        while (dVar.m()) {
            U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar3.f4492g & 262144) != 0) {
                for (U.p pVar4 = pVar3; pVar4 != null; pVar4 = pVar4.f4494i) {
                    if ((pVar4.f4491f & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1000m abstractC1000m = pVar4;
                        while (abstractC1000m != 0) {
                            if (abstractC1000m instanceof r0) {
                                r0 r0Var2 = (r0) abstractC1000m;
                                q0 q0Var = (f2.j.a(r0Var.w(), r0Var2.w()) && U.a.a(r0Var, r0Var2)) ? (q0) interfaceC0424c.n(r0Var2) : q0.f8779d;
                                if (q0Var == q0.f8781f) {
                                    return;
                                }
                                if (q0Var == q0.f8780e) {
                                    break;
                                }
                            } else if ((abstractC1000m.f4491f & 262144) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                U.p pVar5 = abstractC1000m.f8771r;
                                int i3 = 0;
                                abstractC1000m = abstractC1000m;
                                r8 = r8;
                                while (pVar5 != null) {
                                    if ((pVar5.f4491f & 262144) != 0) {
                                        i3++;
                                        r8 = r8;
                                        if (i3 == 1) {
                                            abstractC1000m = pVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new K.d(new U.p[16]);
                                            }
                                            if (abstractC1000m != 0) {
                                                r8.b(abstractC1000m);
                                                abstractC1000m = 0;
                                            }
                                            r8.b(pVar5);
                                        }
                                    }
                                    pVar5 = pVar5.f4494i;
                                    abstractC1000m = abstractC1000m;
                                    r8 = r8;
                                }
                                if (i3 == 1) {
                                }
                            }
                            abstractC1000m = f(r8);
                        }
                    }
                }
            }
            b(dVar, pVar3);
        }
    }
}
