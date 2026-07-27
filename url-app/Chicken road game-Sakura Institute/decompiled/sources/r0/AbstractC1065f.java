package r0;

import G.AbstractC0217p0;
import G.C0192d;
import G.C0223t;
import android.view.View;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l.AbstractC0784j;
import l0.C0815m;
import n.AbstractC0864b;
import p0.C0976l;
import p0.InterfaceC0977m;
import s0.C1166s;
import y2.C1338m;

/* renamed from: r0.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1065f {

    /* renamed from: a, reason: collision with root package name */
    public static final C1063d f9795a = new C1063d(0);

    public static final long a(float f4, boolean z4) {
        return ((z4 ? 1L : 0L) & 4294967295L) | (Float.floatToIntBits(f4) << 32);
    }

    public static final void b(I.d dVar, S.n nVar) {
        I.d v4 = v(nVar).v();
        int i2 = v4.f3332i;
        if (i2 > 0) {
            int i4 = i2 - 1;
            Object[] objArr = v4.f3330d;
            do {
                dVar.b((S.n) ((E) objArr[i4]).B.f2912f);
                i4--;
            } while (i4 >= 0);
        }
    }

    public static final int c(O o4, C0976l c0976l) {
        O t0 = o4.t0();
        if (t0 == null) {
            AbstractC0864b.D("Child of " + o4 + " cannot be null when calculating alignment line");
            throw null;
        }
        if (o4.x0().k().containsKey(c0976l)) {
            Integer num = (Integer) o4.x0().k().get(c0976l);
            if (num != null) {
                return num.intValue();
            }
            return Integer.MIN_VALUE;
        }
        int e02 = t0.e0(c0976l);
        if (e02 == Integer.MIN_VALUE) {
            return Integer.MIN_VALUE;
        }
        t0.f9702m = true;
        o4.f9703n = true;
        o4.B0();
        t0.f9702m = false;
        o4.f9703n = false;
        return e02 + ((int) (c0976l instanceof C0976l ? t0.z0() & 4294967295L : t0.z0() >> 32));
    }

    public static final boolean d(C1062c c1062c) {
        o0 o0Var = (o0) v(c1062c).B.f2911e;
        Intrinsics.d(o0Var, "null cannot be cast to non-null type androidx.compose.ui.node.TailModifierNode");
        return o0Var.f9827t;
    }

    public static final S.n e(InterfaceC1072m interfaceC1072m, int i2) {
        S.n nVar = ((S.n) interfaceC1072m).f3978d.f3983l;
        if (nVar == null || (nVar.f3981j & i2) == 0) {
            return null;
        }
        while (nVar != null) {
            int i4 = nVar.f3980i;
            if ((i4 & 2) != 0) {
                return null;
            }
            if ((i4 & i2) != 0) {
                return nVar;
            }
            nVar = nVar.f3983l;
        }
        return null;
    }

    public static final S.n f(I.d dVar) {
        if (dVar == null || dVar.k()) {
            return null;
        }
        return (S.n) dVar.n(dVar.f3332i - 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final InterfaceC1081w g(S.n nVar) {
        if ((nVar.f3980i & 2) != 0) {
            if (nVar instanceof InterfaceC1081w) {
                return (InterfaceC1081w) nVar;
            }
            if (nVar instanceof AbstractC1073n) {
                S.n nVar2 = ((AbstractC1073n) nVar).f9826u;
                while (nVar2 != 0) {
                    if (nVar2 instanceof InterfaceC1081w) {
                        return (InterfaceC1081w) nVar2;
                    }
                    nVar2 = (!(nVar2 instanceof AbstractC1073n) || (nVar2.f3980i & 2) == 0) ? nVar2.f3983l : ((AbstractC1073n) nVar2).f9826u;
                }
            }
        }
        return null;
    }

    public static final int h(long j4, long j5) {
        boolean z4 = ((int) (j4 & 4294967295L)) != 0;
        return z4 != (((int) (4294967295L & j5)) != 0) ? z4 ? -1 : 1 : (int) Math.signum(Float.intBitsToFloat((int) (j4 >> 32)) - Float.intBitsToFloat((int) (j5 >> 32)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final Object i(InterfaceC1071l interfaceC1071l, AbstractC0217p0 abstractC0217p0) {
        if (!((S.n) interfaceC1071l).f3978d.f3990s) {
            AbstractC0864b.D("Cannot read CompositionLocal because the Modifier node is not currently attached.");
            throw null;
        }
        O.d dVar = (O.d) v(interfaceC1071l).f9613z;
        dVar.getClass();
        return C0192d.L(dVar, abstractC0217p0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v10 */
    /* JADX WARN: Type inference failed for: r2v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v4 */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v8 */
    /* JADX WARN: Type inference failed for: r4v9 */
    public static final q0 j(InterfaceC1072m interfaceC1072m, Object obj) {
        C0223t c0223t;
        S.n nVar = ((S.n) interfaceC1072m).f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar2 = nVar.f3982k;
        E v4 = v(interfaceC1072m);
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 262144) != 0) {
                        AbstractC1073n abstractC1073n = nVar2;
                        ?? r4 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof q0) {
                                q0 q0Var = (q0) abstractC1073n;
                                if (obj.equals(q0Var.u())) {
                                    return q0Var;
                                }
                            } else if ((abstractC1073n.f3980i & 262144) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar3 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r4 = r4;
                                while (nVar3 != null) {
                                    if ((nVar3.f3980i & 262144) != 0) {
                                        i2++;
                                        r4 = r4;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar3;
                                        } else {
                                            if (r4 == 0) {
                                                r4 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r4.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r4.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r4 = r4;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = f(r4);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v0, types: [java.lang.Object, r0.m, r0.q0] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v11, types: [S.n] */
    /* JADX WARN: Type inference failed for: r3v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v17 */
    /* JADX WARN: Type inference failed for: r3v18 */
    /* JADX WARN: Type inference failed for: r3v7 */
    /* JADX WARN: Type inference failed for: r3v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final q0 k(q0 q0Var) {
        C0223t c0223t;
        S.n nVar = ((S.n) q0Var).f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar2 = nVar.f3982k;
        E v4 = v(q0Var);
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 262144) != 0) {
                        AbstractC1073n abstractC1073n = nVar2;
                        ?? r5 = 0;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof q0) {
                                q0 q0Var2 = (q0) abstractC1073n;
                                if (Intrinsics.a(q0Var.u(), q0Var2.u()) && S.a.a(q0Var, q0Var2)) {
                                    return q0Var2;
                                }
                            } else if ((abstractC1073n.f3980i & 262144) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar3 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r5 = r5;
                                while (nVar3 != null) {
                                    if ((nVar3.f3980i & 262144) != 0) {
                                        i2++;
                                        r5 = r5;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar3;
                                        } else {
                                            if (r5 == 0) {
                                                r5 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r5.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r5.b(nVar3);
                                        }
                                    }
                                    nVar3 = nVar3.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r5 = r5;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = f(r5);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        return null;
    }

    public static final ArrayList l(InterfaceC0977m interfaceC0977m) {
        Intrinsics.d(interfaceC0977m, "null cannot be cast to non-null type androidx.compose.ui.node.MeasureScopeWithLayoutNode");
        E w02 = ((O) interfaceC0977m).w0();
        boolean q2 = q(w02);
        I.a aVar = (I.a) w02.p();
        I.d dVar = aVar.f3324d;
        ArrayList arrayList = new ArrayList(dVar.f3332i);
        int i2 = dVar.f3332i;
        for (int i4 = 0; i4 < i2; i4++) {
            E e4 = (E) aVar.get(i4);
            arrayList.add(q2 ? e4.l() : e4.m());
        }
        return arrayList;
    }

    public static final int m(int[] iArr) {
        return Math.min(iArr[2] - iArr[0], iArr[3] - iArr[1]);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void n(InterfaceC1074o interfaceC1074o) {
        if (((S.n) interfaceC1074o).f3978d.f3990s) {
            t(interfaceC1074o, 1).U0();
        }
    }

    public static final void o(InterfaceC1081w interfaceC1081w) {
        v(interfaceC1081w).A();
    }

    public static final void p(n0 n0Var) {
        v(n0Var).B();
    }

    public static final boolean q(E e4) {
        int d4 = AbstractC0784j.d(e4.f9584C.f9676c);
        if (d4 != 0) {
            if (d4 == 1) {
                return true;
            }
            if (d4 != 2) {
                if (d4 == 3) {
                    return true;
                }
                if (d4 != 4) {
                    throw new C1338m();
                }
                E s4 = e4.s();
                if (s4 != null) {
                    return q(s4);
                }
                throw new IllegalArgumentException("no parent for idle node");
            }
        }
        return false;
    }

    public static final boolean r(E e4) {
        if (e4.f9596i != null) {
            E s4 = e4.s();
            if ((s4 != null ? s4.f9596i : null) == null || e4.f9584C.f9675b) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void s(S.n nVar, Function0 function0) {
        d0 d0Var = nVar.f3984m;
        if (d0Var == null) {
            d0Var = new d0((c0) nVar);
            nVar.f3984m = d0Var;
        }
        ((C1166s) w(nVar)).getSnapshotObserver().a(d0Var, C1064e.f9783l, function0);
    }

    public static final a0 t(InterfaceC1072m interfaceC1072m, int i2) {
        a0 a0Var = ((S.n) interfaceC1072m).f3978d.f3985n;
        Intrinsics.c(a0Var);
        if (a0Var.O0() != interfaceC1072m || !b0.h(i2)) {
            return a0Var;
        }
        a0 a0Var2 = a0Var.f9763s;
        Intrinsics.c(a0Var2);
        return a0Var2;
    }

    public static final a0 u(InterfaceC1072m interfaceC1072m) {
        if (!((S.n) interfaceC1072m).f3978d.f3990s) {
            AbstractC0864b.D("Cannot get LayoutCoordinates, Modifier.Node is not attached.");
            throw null;
        }
        a0 t4 = t(interfaceC1072m, 2);
        if (t4.O0().f3990s) {
            return t4;
        }
        AbstractC0864b.D("LayoutCoordinates is not attached.");
        throw null;
    }

    public static final E v(InterfaceC1072m interfaceC1072m) {
        a0 a0Var = ((S.n) interfaceC1072m).f3978d.f3985n;
        if (a0Var != null) {
            return a0Var.f9762r;
        }
        AbstractC0864b.E("Cannot obtain node coordinator. Is the Modifier.Node attached?");
        throw null;
    }

    public static final g0 w(InterfaceC1072m interfaceC1072m) {
        C1166s c1166s = v(interfaceC1072m).f9602o;
        if (c1166s != null) {
            return c1166s;
        }
        AbstractC0864b.E("This node does not have an owner.");
        throw null;
    }

    public static final View x(InterfaceC1072m interfaceC1072m) {
        if (((S.n) interfaceC1072m).f3978d.f3990s) {
            return (View) H.a(v(interfaceC1072m));
        }
        AbstractC0864b.D("Cannot get View because the Modifier node is not currently attached.");
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13, types: [S.n] */
    /* JADX WARN: Type inference failed for: r2v14, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8, types: [S.n] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final void y(C0815m c0815m, Function1 function1) {
        C0223t c0223t;
        S.n nVar = c0815m.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar2 = nVar.f3982k;
        E v4 = v(c0815m);
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 262144) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f3980i & 262144) != 0) {
                        AbstractC1073n abstractC1073n = nVar2;
                        ?? r5 = 0;
                        while (abstractC1073n != 0) {
                            boolean z4 = true;
                            if (abstractC1073n instanceof q0) {
                                q0 q0Var = (q0) abstractC1073n;
                                if ("androidx.compose.ui.input.pointer.PointerHoverIcon".equals(q0Var.u()) && S.a.a(c0815m, q0Var)) {
                                    z4 = ((Boolean) function1.invoke(q0Var)).booleanValue();
                                }
                                if (!z4) {
                                    return;
                                }
                            } else {
                                if (((abstractC1073n.f3980i & 262144) != 0) && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar3 = abstractC1073n.f9826u;
                                    int i2 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r5 = r5;
                                    while (nVar3 != null) {
                                        if ((nVar3.f3980i & 262144) != 0) {
                                            i2++;
                                            r5 = r5;
                                            if (i2 == 1) {
                                                abstractC1073n = nVar3;
                                            } else {
                                                if (r5 == 0) {
                                                    r5 = new I.d(new S.n[16]);
                                                }
                                                if (abstractC1073n != 0) {
                                                    r5.b(abstractC1073n);
                                                    abstractC1073n = 0;
                                                }
                                                r5.b(nVar3);
                                            }
                                        }
                                        nVar3 = nVar3.f3983l;
                                        abstractC1073n = abstractC1073n;
                                        r5 = r5;
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                            }
                            abstractC1073n = f(r5);
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, r0.q0] */
    /* JADX WARN: Type inference failed for: r13v0, types: [kotlin.jvm.functions.Function1] */
    /* JADX WARN: Type inference failed for: r7v10, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v11, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15 */
    /* JADX WARN: Type inference failed for: r7v16 */
    /* JADX WARN: Type inference failed for: r7v17 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3, types: [S.n] */
    /* JADX WARN: Type inference failed for: r7v9 */
    /* JADX WARN: Type inference failed for: r8v0 */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [I.d] */
    /* JADX WARN: Type inference failed for: r8v8 */
    /* JADX WARN: Type inference failed for: r8v9 */
    public static final void z(q0 q0Var, Function1 function1) {
        S.n nVar = ((S.n) q0Var).f3978d;
        if (!nVar.f3990s) {
            AbstractC0864b.D("visitSubtreeIf called on an unattached node");
            throw null;
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.l()) {
            S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar3.f3981j & 262144) != 0) {
                for (S.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f3983l) {
                    if ((nVar4.f3980i & 262144) != 0) {
                        ?? r8 = 0;
                        AbstractC1073n abstractC1073n = nVar4;
                        while (abstractC1073n != 0) {
                            if (abstractC1073n instanceof q0) {
                                q0 q0Var2 = (q0) abstractC1073n;
                                p0 p0Var = (Intrinsics.a(q0Var.u(), q0Var2.u()) && S.a.a(q0Var, q0Var2)) ? (p0) function1.invoke(q0Var2) : p0.f9828d;
                                if (p0Var == p0.f9830i) {
                                    return;
                                }
                                if (p0Var == p0.f9829e) {
                                    break;
                                }
                            } else if ((abstractC1073n.f3980i & 262144) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                S.n nVar5 = abstractC1073n.f9826u;
                                int i2 = 0;
                                abstractC1073n = abstractC1073n;
                                r8 = r8;
                                while (nVar5 != null) {
                                    if ((nVar5.f3980i & 262144) != 0) {
                                        i2++;
                                        r8 = r8;
                                        if (i2 == 1) {
                                            abstractC1073n = nVar5;
                                        } else {
                                            if (r8 == 0) {
                                                r8 = new I.d(new S.n[16]);
                                            }
                                            if (abstractC1073n != 0) {
                                                r8.b(abstractC1073n);
                                                abstractC1073n = 0;
                                            }
                                            r8.b(nVar5);
                                        }
                                    }
                                    nVar5 = nVar5.f3983l;
                                    abstractC1073n = abstractC1073n;
                                    r8 = r8;
                                }
                                if (i2 == 1) {
                                }
                            }
                            abstractC1073n = f(r8);
                        }
                    }
                }
            }
            b(dVar, nVar3);
        }
    }
}
