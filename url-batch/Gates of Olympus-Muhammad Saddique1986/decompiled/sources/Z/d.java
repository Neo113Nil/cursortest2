package Z;

import B.U;
import F.C0093f;
import I.C0150g0;
import I.C0174t;
import a0.C0239d;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import e2.InterfaceC0424c;
import java.util.Arrays;
import k2.C0572d;
import m.AbstractC0625j;
import n0.C0710h;
import r0.AbstractC0898U;
import r0.AbstractC0909f;
import s.C0936e;
import s.C0944m;
import s.C0951t;
import s0.C0962h;
import t.C0981i;
import t.C0983k;
import t.C0984l;
import t0.AbstractC0993f;
import t0.AbstractC1000m;
import t0.E;
import t0.b0;
import t0.p0;
import u0.C1123s;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4667a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [K.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [K.d] */
    public static final void A(t tVar) {
        C0174t c0174t;
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        E t3 = AbstractC0993f.t(tVar);
        U.p pVar2 = pVar;
        while (t3 != null) {
            if ((((U.p) t3.f8561y.f2915f).f4492g & 5120) != 0) {
                while (pVar2 != null) {
                    int i3 = pVar2.f4491f;
                    if ((i3 & 5120) != 0) {
                        if (pVar2 != pVar && (i3 & 1024) != 0) {
                            return;
                        }
                        if ((i3 & 4096) != 0) {
                            AbstractC1000m abstractC1000m = pVar2;
                            ?? r4 = 0;
                            while (abstractC1000m != 0) {
                                if (abstractC1000m instanceof c) {
                                    c cVar = (c) abstractC1000m;
                                    cVar.u(o(cVar));
                                } else if ((abstractC1000m.f4491f & 4096) != 0 && (abstractC1000m instanceof AbstractC1000m)) {
                                    U.p pVar3 = abstractC1000m.f8771r;
                                    int i4 = 0;
                                    abstractC1000m = abstractC1000m;
                                    r4 = r4;
                                    while (pVar3 != null) {
                                        if ((pVar3.f4491f & 4096) != 0) {
                                            i4++;
                                            r4 = r4;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC1000m = AbstractC0993f.f(r4);
                            }
                        }
                    }
                    pVar2 = pVar2.f4493h;
                }
            }
            t3 = t3.s();
            pVar2 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
    }

    public static final boolean B(t tVar) {
        Boolean C = C(tVar, 7);
        if (C != null) {
            return C.booleanValue();
        }
        return false;
    }

    public static final Boolean C(t tVar, int i3) {
        Boolean valueOf;
        U F3 = F(tVar);
        u uVar = new u(tVar, 1);
        try {
            if (F3.f318b) {
                U.a(F3);
            }
            F3.f318b = true;
            ((K.d) F3.f320d).b(uVar);
            int b3 = AbstractC0625j.b(w(tVar, i3));
            if (b3 != 0) {
                if (b3 != 1) {
                    if (b3 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (b3 != 3) {
                        throw new C1.c();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(tVar));
            }
            return valueOf;
        } finally {
            U.b(F3);
        }
    }

    public static final boolean D(t tVar, t tVar2) {
        U.p pVar;
        U.p pVar2;
        C0174t c0174t;
        C0174t c0174t2;
        U.p pVar3 = tVar2.f4489d;
        if (!pVar3.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar4 = pVar3.f4493h;
        E t3 = AbstractC0993f.t(tVar2);
        loop0: while (true) {
            if (t3 == null) {
                pVar = null;
                break;
            }
            if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                while (pVar4 != null) {
                    if ((pVar4.f4491f & 1024) != 0) {
                        pVar = pVar4;
                        K.d dVar = null;
                        while (pVar != null) {
                            if (pVar instanceof t) {
                                break loop0;
                            }
                            if ((pVar.f4491f & 1024) != 0 && (pVar instanceof AbstractC1000m)) {
                                int i3 = 0;
                                for (U.p pVar5 = ((AbstractC1000m) pVar).f8771r; pVar5 != null; pVar5 = pVar5.f4494i) {
                                    if ((pVar5.f4491f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pVar = pVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.p[16]);
                                            }
                                            if (pVar != null) {
                                                dVar.b(pVar);
                                                pVar = null;
                                            }
                                            dVar.b(pVar5);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pVar = AbstractC0993f.f(dVar);
                        }
                    }
                    pVar4 = pVar4.f4493h;
                }
            }
            t3 = t3.s();
            pVar4 = (t3 == null || (c0174t2 = t3.f8561y) == null) ? null : (p0) c0174t2.f2914e;
        }
        if (!f2.j.a(pVar, tVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = tVar.z0().ordinal();
        s sVar = s.f4703e;
        if (ordinal == 0) {
            p(tVar2);
            tVar.D0(sVar);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new C1.c();
            }
            U.p pVar6 = tVar.f4489d;
            if (!pVar6.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.p pVar7 = pVar6.f4493h;
            E t4 = AbstractC0993f.t(tVar);
            loop4: while (true) {
                if (t4 == null) {
                    pVar2 = null;
                    break;
                }
                if ((((U.p) t4.f8561y.f2915f).f4492g & 1024) != 0) {
                    while (pVar7 != null) {
                        if ((pVar7.f4491f & 1024) != 0) {
                            pVar2 = pVar7;
                            K.d dVar2 = null;
                            while (pVar2 != null) {
                                if (pVar2 instanceof t) {
                                    break loop4;
                                }
                                if ((pVar2.f4491f & 1024) != 0 && (pVar2 instanceof AbstractC1000m)) {
                                    int i4 = 0;
                                    for (U.p pVar8 = ((AbstractC1000m) pVar2).f8771r; pVar8 != null; pVar8 = pVar8.f4494i) {
                                        if ((pVar8.f4491f & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                pVar2 = pVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new K.d(new U.p[16]);
                                                }
                                                if (pVar2 != null) {
                                                    dVar2.b(pVar2);
                                                    pVar2 = null;
                                                }
                                                dVar2.b(pVar8);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                pVar2 = AbstractC0993f.f(dVar2);
                            }
                        }
                        pVar7 = pVar7.f4493h;
                    }
                }
                t4 = t4.s();
                pVar7 = (t4 == null || (c0174t = t4.f8561y) == null) ? null : (p0) c0174t.f2914e;
            }
            t tVar3 = (t) pVar2;
            if (tVar3 != null || !((Boolean) ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(tVar)).getFocusOwner()).f4899a.h(null, null)).booleanValue()) {
                if (tVar3 == null || !D(tVar3, tVar)) {
                    return false;
                }
                boolean D = D(tVar, tVar2);
                if (tVar.z0() != sVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!D) {
                    return D;
                }
                A(tVar3);
                return D;
            }
            p(tVar2);
            tVar.D0(sVar);
        } else {
            if (n(tVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            t n3 = n(tVar);
            if (!(n3 != null ? e(n3, false, true) : true)) {
                return false;
            }
            p(tVar2);
        }
        return true;
    }

    public static final boolean E(View view, Integer num, Rect rect) {
        if (!(view instanceof ViewGroup)) {
            return view.requestFocus(num.intValue(), rect);
        }
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.isFocused()) {
            return true;
        }
        if (viewGroup.isFocusable() && !view.hasFocus()) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (view instanceof C1123s) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final U F(t tVar) {
        return ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(tVar)).getFocusOwner()).f4906h;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection] */
    public static final Object G(t tVar, int i3, InterfaceC0424c interfaceC0424c) {
        Object obj;
        U.p pVar;
        C0174t c0174t;
        U.p pVar2 = tVar.f4489d;
        if (!pVar2.f4501p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.p pVar3 = pVar2.f4493h;
        E t3 = AbstractC0993f.t(tVar);
        loop0: while (true) {
            obj = null;
            if (t3 == null) {
                pVar = null;
                break;
            }
            if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                while (pVar3 != null) {
                    if ((pVar3.f4491f & 1024) != 0) {
                        pVar = pVar3;
                        K.d dVar = null;
                        while (pVar != null) {
                            if (pVar instanceof t) {
                                break loop0;
                            }
                            if ((pVar.f4491f & 1024) != 0 && (pVar instanceof AbstractC1000m)) {
                                int i4 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            pVar = pVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.p[16]);
                                            }
                                            if (pVar != null) {
                                                dVar.b(pVar);
                                                pVar = null;
                                            }
                                            dVar.b(pVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            pVar = AbstractC0993f.f(dVar);
                        }
                    }
                    pVar3 = pVar3.f4493h;
                }
            }
            t3 = t3.s();
            pVar3 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
        }
        t tVar2 = (t) pVar;
        if (tVar2 != null) {
            C0962h c0962h = AbstractC0909f.f8155a;
            if (f2.j.a((C0984l) tVar2.i(c0962h), (C0984l) tVar.i(c0962h))) {
                return null;
            }
        }
        C0984l c0984l = (C0984l) tVar.i(AbstractC0909f.f8155a);
        if (c0984l == null) {
            return null;
        }
        int i5 = 5;
        if (!b.a(i3, 5)) {
            i5 = 6;
            if (!b.a(i3, 6)) {
                i5 = 3;
                if (!b.a(i3, 3)) {
                    i5 = 4;
                    if (!b.a(i3, 4)) {
                        if (b.a(i3, 1)) {
                            i5 = 2;
                        } else {
                            if (!b.a(i3, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i5 = 1;
                        }
                    }
                }
            }
        }
        C0936e c0936e = c0984l.f8487a;
        if (c0936e.f8227a.g().f8280m > 0) {
            C0951t c0951t = c0936e.f8227a;
            if (!c0951t.g().f8277j.isEmpty()) {
                boolean m3 = c0984l.m(i5);
                int i6 = c0936e.f8228b;
                int min = m3 ? Math.min(c0951t.g().f8280m - 1, ((C0944m) S1.l.Q0(c0951t.g().f8277j)).f8285a + i6) : Math.max(0, ((C0150g0) c0951t.f8320d.f923b).g() - i6);
                f2.u uVar = new f2.u();
                C0710h c0710h = c0984l.f8488b;
                c0710h.getClass();
                C0981i c0981i = new C0981i(min, min);
                K.d dVar2 = c0710h.f7291a;
                dVar2.b(c0981i);
                uVar.f5832d = c0981i;
                while (obj == null && c0984l.l((C0981i) uVar.f5832d, i5)) {
                    C0981i c0981i2 = (C0981i) uVar.f5832d;
                    int i7 = c0981i2.f8481a;
                    boolean m4 = c0984l.m(i5);
                    int i8 = c0981i2.f8482b;
                    if (m4) {
                        i8++;
                    } else {
                        i7--;
                    }
                    C0981i c0981i3 = new C0981i(i7, i8);
                    dVar2.b(c0981i3);
                    dVar2.n((C0981i) uVar.f5832d);
                    uVar.f5832d = c0981i3;
                    E e3 = c0951t.f8326j;
                    if (e3 != null) {
                        e3.k();
                    }
                    obj = interfaceC0424c.n(new C0983k(c0984l, uVar, i5));
                }
                dVar2.n((C0981i) uVar.f5832d);
                E e4 = c0951t.f8326j;
                if (e4 == null) {
                    return obj;
                }
                e4.k();
                return obj;
            }
        }
        return interfaceC0424c.n(C0984l.f8486f);
    }

    public static final boolean H(int i3, R.h hVar, t tVar, C0239d c0239d) {
        t h3;
        K.d dVar = new K.d(new t[16]);
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar2 = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar2, pVar);
        } else {
            dVar2.b(pVar2);
        }
        while (dVar2.m()) {
            U.p pVar3 = (U.p) dVar2.o(dVar2.f3216f - 1);
            if ((pVar3.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar2, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f4491f & 1024) != 0) {
                        K.d dVar3 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                if (tVar2.f4501p) {
                                    dVar.b(tVar2);
                                }
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i4 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar3.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar3.b(pVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar3);
                        }
                    } else {
                        pVar3 = pVar3.f4494i;
                    }
                }
            }
        }
        while (dVar.m() && (h3 = h(dVar, c0239d, i3)) != null) {
            if (h3.y0().f4686a) {
                return ((Boolean) hVar.n(h3)).booleanValue();
            }
            if (l(i3, hVar, h3, c0239d)) {
                return true;
            }
            dVar.n(h3);
        }
        return false;
    }

    public static final boolean I(t tVar, t tVar2, int i3, R.h hVar) {
        U.p pVar;
        C0174t c0174t;
        if (tVar.z0() != s.f4703e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new t[16];
        U.p pVar2 = tVar.f4489d;
        if (!pVar2.f4501p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar3 = pVar2.f4494i;
        if (pVar3 == null) {
            AbstractC0993f.b(dVar, pVar2);
        } else {
            dVar.b(pVar3);
        }
        int i4 = 0;
        while (dVar.m()) {
            U.p pVar4 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar4.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar, pVar4);
            } else {
                while (true) {
                    if (pVar4 == null) {
                        break;
                    }
                    if ((pVar4.f4491f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (pVar4 != null) {
                            if (pVar4 instanceof t) {
                                t tVar3 = (t) pVar4;
                                int i5 = i4 + 1;
                                if (objArr.length < i5) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                                    f2.j.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i4] = tVar3;
                                i4 = i5;
                            } else if ((pVar4.f4491f & 1024) != 0 && (pVar4 instanceof AbstractC1000m)) {
                                int i6 = 0;
                                for (U.p pVar5 = ((AbstractC1000m) pVar4).f8771r; pVar5 != null; pVar5 = pVar5.f4494i) {
                                    if ((pVar5.f4491f & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            pVar4 = pVar5;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar4 != null) {
                                                dVar2.b(pVar4);
                                                pVar4 = null;
                                            }
                                            dVar2.b(pVar5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            pVar4 = AbstractC0993f.f(dVar2);
                        }
                    } else {
                        pVar4 = pVar4.f4494i;
                    }
                }
            }
        }
        v vVar = v.f4711a;
        f2.j.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i4, vVar);
        if (b.a(i3, 1)) {
            int i7 = new C0572d(0, i4 - 1, 1).f6420e;
            if (i7 >= 0) {
                boolean z3 = false;
                int i8 = 0;
                while (true) {
                    if (z3) {
                        t tVar4 = (t) objArr[i8];
                        if (t(tVar4) && k(tVar4, hVar)) {
                            return true;
                        }
                    }
                    if (f2.j.a(objArr[i8], tVar2)) {
                        z3 = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8++;
                }
            }
        } else {
            if (!b.a(i3, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i9 = new C0572d(0, i4 - 1, 1).f6420e;
            if (i9 >= 0) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        t tVar5 = (t) objArr[i9];
                        if (t(tVar5) && a(tVar5, hVar)) {
                            return true;
                        }
                    }
                    if (f2.j.a(objArr[i9], tVar2)) {
                        z4 = true;
                    }
                    if (i9 == 0) {
                        break;
                    }
                    i9--;
                }
            }
        }
        if (!b.a(i3, 1) && tVar.y0().f4686a) {
            U.p pVar6 = tVar.f4489d;
            if (!pVar6.f4501p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.p pVar7 = pVar6.f4493h;
            E t3 = AbstractC0993f.t(tVar);
            loop5: while (true) {
                if (t3 == null) {
                    pVar = null;
                    break;
                }
                if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                    while (pVar7 != null) {
                        if ((pVar7.f4491f & 1024) != 0) {
                            U.p pVar8 = pVar7;
                            K.d dVar3 = null;
                            while (pVar8 != null) {
                                if (pVar8 instanceof t) {
                                    pVar = pVar8;
                                    break loop5;
                                }
                                if ((pVar8.f4491f & 1024) != 0 && (pVar8 instanceof AbstractC1000m)) {
                                    int i10 = 0;
                                    for (U.p pVar9 = ((AbstractC1000m) pVar8).f8771r; pVar9 != null; pVar9 = pVar9.f4494i) {
                                        if ((pVar9.f4491f & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                pVar8 = pVar9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new K.d(new U.p[16]);
                                                }
                                                if (pVar8 != null) {
                                                    dVar3.b(pVar8);
                                                    pVar8 = null;
                                                }
                                                dVar3.b(pVar9);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                pVar8 = AbstractC0993f.f(dVar3);
                            }
                        }
                        pVar7 = pVar7.f4493h;
                    }
                }
                t3 = t3.s();
                pVar7 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
            }
            if (pVar != null) {
                return ((Boolean) hVar.n(tVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer J(int i3) {
        if (b.a(i3, 5)) {
            return 33;
        }
        if (b.a(i3, 6)) {
            return 130;
        }
        if (b.a(i3, 3)) {
            return 17;
        }
        if (b.a(i3, 4)) {
            return 66;
        }
        if (b.a(i3, 1)) {
            return 2;
        }
        return b.a(i3, 2) ? 1 : null;
    }

    public static final b K(int i3) {
        if (i3 == 1) {
            return new b(2);
        }
        if (i3 == 2) {
            return new b(1);
        }
        if (i3 == 17) {
            return new b(3);
        }
        if (i3 == 33) {
            return new b(5);
        }
        if (i3 == 66) {
            return new b(4);
        }
        if (i3 != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean L(int i3, R.h hVar, t tVar, C0239d c0239d) {
        int ordinal = tVar.z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n3 = n(tVar);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n3.z0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean L3 = L(i3, hVar, n3, c0239d);
                        if (!f2.j.a(L3, Boolean.FALSE)) {
                            return L3;
                        }
                        if (c0239d == null) {
                            if (n3.z0() != s.f4703e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            t g3 = g(n3);
                            if (g3 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            c0239d = j(g3);
                        }
                        return Boolean.valueOf(l(i3, hVar, tVar, c0239d));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new C1.c();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (c0239d == null) {
                    c0239d = j(n3);
                }
                return Boolean.valueOf(l(i3, hVar, tVar, c0239d));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.y0().f4686a ? (Boolean) hVar.n(tVar) : c0239d == null ? Boolean.valueOf(i(tVar, i3, hVar)) : Boolean.valueOf(H(i3, hVar, tVar, c0239d));
                }
                throw new C1.c();
            }
        }
        return Boolean.valueOf(i(tVar, i3, hVar));
    }

    public static final boolean a(t tVar, R.h hVar) {
        int ordinal = tVar.z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n3 = n(tVar);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n3.z0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new C1.c();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(n3, hVar) && !m(tVar, n3, 2, hVar) && (!n3.y0().f4686a || !((Boolean) hVar.n(n3)).booleanValue())) {
                        return false;
                    }
                }
                return m(tVar, n3, 2, hVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1.c();
                }
                if (!y(tVar, hVar)) {
                    if (!(tVar.y0().f4686a ? ((Boolean) hVar.n(tVar)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return y(tVar, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (Z.b.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (Z.b.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (Z.b.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f4726c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (Z.b.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (Z.b.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (Z.b.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (Z.b.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (Z.b.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f4724a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (Z.b.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f4727d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (Z.b.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f4725b - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00cd, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x003f, code lost:
    
        if (r7 <= r14) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x004a, code lost:
    
        if (r5 >= r13) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0055, code lost:
    
        if (r15 <= r12) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0034, code lost:
    
        if (r0 >= r2) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x00be, code lost:
    
        return true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean b(C0239d c0239d, C0239d c0239d2, C0239d c0239d3, int i3) {
        if (!c(i3, c0239d3, c0239d) && c(i3, c0239d2, c0239d)) {
            boolean a3 = b.a(i3, 3);
            float f3 = c0239d3.f4725b;
            float f4 = c0239d3.f4727d;
            float f5 = c0239d3.f4724a;
            float f6 = c0239d3.f4726c;
            float f7 = c0239d.f4727d;
            float f8 = c0239d.f4725b;
            float f9 = c0239d.f4726c;
            float f10 = c0239d.f4724a;
            if (!a3) {
                if (!b.a(i3, 4)) {
                    if (!b.a(i3, 5)) {
                        if (!b.a(i3, 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i3, C0239d c0239d, C0239d c0239d2) {
        if (b.a(i3, 3) ? true : b.a(i3, 4)) {
            if (c0239d.f4727d > c0239d2.f4725b && c0239d.f4725b < c0239d2.f4727d) {
                return true;
            }
        } else {
            if (!(b.a(i3, 5) ? true : b.a(i3, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (c0239d.f4726c > c0239d2.f4724a && c0239d.f4724a < c0239d2.f4726c) {
                return true;
            }
        }
        return false;
    }

    public static final C0239d d(View view) {
        int[] iArr = f4667a;
        view.getLocationInWindow(iArr);
        float f3 = iArr[0];
        return new C0239d(f3, iArr[1], view.getWidth() + f3, iArr[1] + view.getHeight());
    }

    public static final boolean e(t tVar, boolean z3, boolean z4) {
        int ordinal = tVar.z0().ordinal();
        s sVar = s.f4704f;
        if (ordinal == 0) {
            tVar.D0(sVar);
            if (z4) {
                A(tVar);
            }
        } else if (ordinal == 1) {
            t n3 = n(tVar);
            if (!(n3 != null ? e(n3, z3, z4) : true)) {
                return false;
            }
            tVar.D0(sVar);
            if (z4) {
                A(tVar);
            }
        } else {
            if (ordinal == 2) {
                if (!z3) {
                    return z3;
                }
                tVar.D0(sVar);
                if (!z4) {
                    return z3;
                }
                A(tVar);
                return z3;
            }
            if (ordinal != 3) {
                throw new C1.c();
            }
        }
        return true;
    }

    public static final void f(t tVar, K.d dVar) {
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar2 = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar2, pVar);
        } else {
            dVar2.b(pVar2);
        }
        while (dVar2.m()) {
            U.p pVar3 = (U.p) dVar2.o(dVar2.f3216f - 1);
            if ((pVar3.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar2, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f4491f & 1024) != 0) {
                        K.d dVar3 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                if (tVar2.f4501p && !AbstractC0993f.t(tVar2).f8537G) {
                                    if (tVar2.y0().f4686a) {
                                        dVar.b(tVar2);
                                    } else {
                                        f(tVar2, dVar);
                                    }
                                }
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i3 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar3.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar3.b(pVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar3);
                        }
                    } else {
                        pVar3 = pVar3.f4494i;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0035, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t g(t tVar) {
        int ordinal = tVar.z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                U.p pVar = tVar.f4489d;
                if (!pVar.f4501p) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                K.d dVar = new K.d(new U.p[16]);
                U.p pVar2 = pVar.f4494i;
                if (pVar2 == null) {
                    AbstractC0993f.b(dVar, pVar);
                } else {
                    dVar.b(pVar2);
                }
                while (dVar.m()) {
                    U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
                    if ((pVar3.f4492g & 1024) == 0) {
                        AbstractC0993f.b(dVar, pVar3);
                    } else {
                        while (true) {
                            if (pVar3 == null) {
                                break;
                            }
                            if ((pVar3.f4491f & 1024) != 0) {
                                K.d dVar2 = null;
                                while (pVar3 != null) {
                                    if (pVar3 instanceof t) {
                                        t g3 = g((t) pVar3);
                                        if (g3 != null) {
                                            return g3;
                                        }
                                    } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                        int i3 = 0;
                                        for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                            if ((pVar4.f4491f & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    pVar3 = pVar4;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new K.d(new U.p[16]);
                                                    }
                                                    if (pVar3 != null) {
                                                        dVar2.b(pVar3);
                                                        pVar3 = null;
                                                    }
                                                    dVar2.b(pVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    pVar3 = AbstractC0993f.f(dVar2);
                                }
                            } else {
                                pVar3 = pVar3.f4494i;
                            }
                        }
                    }
                }
                return null;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return null;
                }
                throw new C1.c();
            }
        }
        return tVar;
    }

    public static final t h(K.d dVar, C0239d c0239d, int i3) {
        C0239d g3;
        if (b.a(i3, 3)) {
            g3 = c0239d.g(c0239d.c() + 1, 0.0f);
        } else if (b.a(i3, 4)) {
            g3 = c0239d.g(-(c0239d.c() + 1), 0.0f);
        } else if (b.a(i3, 5)) {
            g3 = c0239d.g(0.0f, c0239d.b() + 1);
        } else {
            if (!b.a(i3, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            g3 = c0239d.g(0.0f, -(c0239d.b() + 1));
        }
        int i4 = dVar.f3216f;
        t tVar = null;
        if (i4 > 0) {
            Object[] objArr = dVar.f3214d;
            int i5 = 0;
            do {
                t tVar2 = (t) objArr[i5];
                if (t(tVar2)) {
                    C0239d j3 = j(tVar2);
                    if (r(i3, j3, c0239d) && (!r(i3, g3, c0239d) || b(c0239d, j3, g3, i3) || (!b(c0239d, g3, j3, i3) && s(i3, c0239d, j3) < s(i3, c0239d, g3)))) {
                        tVar = tVar2;
                        g3 = j3;
                    }
                }
                i5++;
            } while (i5 < i4);
        }
        return tVar;
    }

    public static final boolean i(t tVar, int i3, InterfaceC0424c interfaceC0424c) {
        C0239d c0239d;
        K.d dVar = new K.d(new t[16]);
        f(tVar, dVar);
        if (dVar.f3216f <= 1) {
            t tVar2 = (t) (dVar.l() ? null : dVar.f3214d[0]);
            if (tVar2 != null) {
                return ((Boolean) interfaceC0424c.n(tVar2)).booleanValue();
            }
            return false;
        }
        if (b.a(i3, 7)) {
            i3 = 4;
        }
        if (b.a(i3, 4) ? true : b.a(i3, 6)) {
            C0239d j3 = j(tVar);
            float f3 = j3.f4725b;
            float f4 = j3.f4724a;
            c0239d = new C0239d(f4, f3, f4, f3);
        } else {
            if (!(b.a(i3, 3) ? true : b.a(i3, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            C0239d j4 = j(tVar);
            float f5 = j4.f4727d;
            float f6 = j4.f4726c;
            c0239d = new C0239d(f6, f5, f6, f5);
        }
        t h3 = h(dVar, c0239d, i3);
        if (h3 != null) {
            return ((Boolean) interfaceC0424c.n(h3)).booleanValue();
        }
        return false;
    }

    public static final C0239d j(t tVar) {
        b0 b0Var = tVar.f4496k;
        return b0Var != null ? AbstractC0898U.g(b0Var).B(b0Var, false) : C0239d.f4723e;
    }

    public static final boolean k(t tVar, R.h hVar) {
        int ordinal = tVar.z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n3 = n(tVar);
                if (n3 != null) {
                    return k(n3, hVar) || m(tVar, n3, 1, hVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.y0().f4686a ? ((Boolean) hVar.n(tVar)).booleanValue() : z(tVar, hVar);
                }
                throw new C1.c();
            }
        }
        return z(tVar, hVar);
    }

    public static final boolean l(int i3, R.h hVar, t tVar, C0239d c0239d) {
        if (H(i3, hVar, tVar, c0239d)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i3, new C0093f(tVar, c0239d, i3, hVar, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(t tVar, t tVar2, int i3, R.h hVar) {
        if (I(tVar, tVar2, i3, hVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i3, new C0093f(tVar, tVar2, i3, hVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:67:0x001e, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final t n(t tVar) {
        int ordinal;
        U.p pVar = tVar.f4489d;
        boolean z3 = pVar.f4501p;
        if (!z3) {
            return null;
        }
        if (!z3) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        while (dVar.m()) {
            U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar3.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f4491f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                if (tVar2.f4489d.f4501p && ((ordinal = tVar2.z0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                    return tVar2;
                                }
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i3 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar2);
                        }
                    } else {
                        pVar3 = pVar3.f4494i;
                    }
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:106:0x0075, code lost:
    
        continue;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final s o(c cVar) {
        s z02;
        U.p pVar = (U.p) cVar;
        U.p pVar2 = pVar.f4489d;
        K.d dVar = null;
        while (true) {
            int i3 = 0;
            if (pVar2 == null) {
                U.p pVar3 = pVar.f4489d;
                if (!pVar3.f4501p) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                K.d dVar2 = new K.d(new U.p[16]);
                U.p pVar4 = pVar3.f4494i;
                if (pVar4 == null) {
                    AbstractC0993f.b(dVar2, pVar3);
                } else {
                    dVar2.b(pVar4);
                }
                while (dVar2.m()) {
                    U.p pVar5 = (U.p) dVar2.o(dVar2.f3216f - 1);
                    if ((pVar5.f4492g & 1024) == 0) {
                        AbstractC0993f.b(dVar2, pVar5);
                    } else {
                        while (true) {
                            if (pVar5 == null) {
                                break;
                            }
                            if ((pVar5.f4491f & 1024) != 0) {
                                K.d dVar3 = null;
                                while (pVar5 != null) {
                                    if (pVar5 instanceof t) {
                                        s z03 = ((t) pVar5).z0();
                                        int ordinal = z03.ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return z03;
                                        }
                                    } else if ((pVar5.f4491f & 1024) != 0 && (pVar5 instanceof AbstractC1000m)) {
                                        int i4 = 0;
                                        for (U.p pVar6 = ((AbstractC1000m) pVar5).f8771r; pVar6 != null; pVar6 = pVar6.f4494i) {
                                            if ((pVar6.f4491f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    pVar5 = pVar6;
                                                } else {
                                                    if (dVar3 == null) {
                                                        dVar3 = new K.d(new U.p[16]);
                                                    }
                                                    if (pVar5 != null) {
                                                        dVar3.b(pVar5);
                                                        pVar5 = null;
                                                    }
                                                    dVar3.b(pVar6);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    pVar5 = AbstractC0993f.f(dVar3);
                                }
                            } else {
                                pVar5 = pVar5.f4494i;
                            }
                        }
                    }
                }
                return s.f4704f;
            }
            if (pVar2 instanceof t) {
                z02 = ((t) pVar2).z0();
                int ordinal2 = z02.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    break;
                }
            } else if ((pVar2.f4491f & 1024) != 0 && (pVar2 instanceof AbstractC1000m)) {
                for (U.p pVar7 = ((AbstractC1000m) pVar2).f8771r; pVar7 != null; pVar7 = pVar7.f4494i) {
                    if ((pVar7.f4491f & 1024) != 0) {
                        i3++;
                        if (i3 == 1) {
                            pVar2 = pVar7;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.p[16]);
                            }
                            if (pVar2 != null) {
                                dVar.b(pVar2);
                                pVar2 = null;
                            }
                            dVar.b(pVar7);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            pVar2 = AbstractC0993f.f(dVar);
        }
        return z02;
    }

    public static final void p(t tVar) {
        AbstractC0993f.q(tVar, new u(tVar, 0));
        int ordinal = tVar.z0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            tVar.D0(s.f4702d);
        }
    }

    public static final void q(t tVar) {
        f fVar = ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(tVar)).getFocusOwner()).f4905g;
        fVar.b(fVar.f4671c, tVar);
    }

    public static final boolean r(int i3, C0239d c0239d, C0239d c0239d2) {
        boolean a3 = b.a(i3, 3);
        float f3 = c0239d.f4724a;
        float f4 = c0239d.f4726c;
        if (a3) {
            float f5 = c0239d2.f4726c;
            float f6 = c0239d2.f4724a;
            if ((f5 <= f4 && f6 < f4) || f6 <= f3) {
                return false;
            }
        } else if (b.a(i3, 4)) {
            float f7 = c0239d2.f4724a;
            float f8 = c0239d2.f4726c;
            if ((f7 >= f3 && f8 > f3) || f8 >= f4) {
                return false;
            }
        } else {
            boolean a4 = b.a(i3, 5);
            float f9 = c0239d.f4725b;
            float f10 = c0239d.f4727d;
            if (a4) {
                float f11 = c0239d2.f4727d;
                float f12 = c0239d2.f4725b;
                if ((f11 <= f10 && f12 < f10) || f12 <= f9) {
                    return false;
                }
            } else {
                if (!b.a(i3, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f13 = c0239d2.f4725b;
                float f14 = c0239d2.f4727d;
                if ((f13 >= f9 && f14 > f9) || f14 >= f10) {
                    return false;
                }
            }
        }
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0047  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final long s(int i3, C0239d c0239d, C0239d c0239d2) {
        float f3;
        float f4;
        float f5;
        float c2;
        float c3;
        boolean a3 = b.a(i3, 3);
        float f6 = c0239d2.f4725b;
        float f7 = c0239d2.f4724a;
        if (!a3) {
            if (b.a(i3, 4)) {
                f3 = f7 - c0239d.f4726c;
            } else if (b.a(i3, 5)) {
                f4 = c0239d.f4725b;
                f5 = c0239d2.f4727d;
            } else {
                if (!b.a(i3, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f3 = f6 - c0239d.f4727d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f3));
            if (!b.a(i3, 3) ? true : b.a(i3, 4)) {
                if (!(b.a(i3, 5) ? true : b.a(i3, 6))) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f8 = 2;
                c2 = (c0239d.c() / f8) + c0239d.f4724a;
                c3 = (c0239d2.c() / f8) + f7;
            } else {
                float f9 = 2;
                c2 = (c0239d.b() / f9) + c0239d.f4725b;
                c3 = (c0239d2.b() / f9) + f6;
            }
            long abs2 = (long) Math.abs(c2 - c3);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f4 = c0239d.f4724a;
        f5 = c0239d2.f4726c;
        f3 = f4 - f5;
        long abs3 = (long) Math.abs(Math.max(0.0f, f3));
        if (!b.a(i3, 3) ? true : b.a(i3, 4)) {
        }
        long abs22 = (long) Math.abs(c2 - c3);
        return (abs22 * abs22) + (13 * abs3 * abs3);
    }

    public static final boolean t(t tVar) {
        E e3;
        b0 b0Var;
        E e4;
        b0 b0Var2 = tVar.f4496k;
        return (b0Var2 == null || (e3 = b0Var2.f8711o) == null || !e3.E() || (b0Var = tVar.f4496k) == null || (e4 = b0Var.f8711o) == null || !e4.D()) ? false : true;
    }

    public static final int u(t tVar, int i3) {
        int ordinal = tVar.z0().ordinal();
        if (ordinal == 0) {
            return 1;
        }
        if (ordinal != 1) {
            if (ordinal == 2) {
                return 2;
            }
            if (ordinal == 3) {
                return 1;
            }
            throw new C1.c();
        }
        t n3 = n(tVar);
        if (n3 == null) {
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        int u3 = u(n3, i3);
        if (u3 == 1) {
            u3 = 0;
        }
        if (u3 != 0) {
            return u3;
        }
        if (tVar.f4706q) {
            return 1;
        }
        tVar.f4706q = true;
        try {
            tVar.y0().f4696k.getClass();
            p pVar = p.f4698b;
            return 1;
        } finally {
            tVar.f4706q = false;
        }
    }

    public static final void v(t tVar) {
        if (tVar.f4707r) {
            return;
        }
        tVar.f4707r = true;
        try {
            tVar.y0().f4695j.getClass();
            p pVar = p.f4698b;
        } finally {
            tVar.f4707r = false;
        }
    }

    public static final int w(t tVar, int i3) {
        U.p pVar;
        C0174t c0174t;
        int ordinal = tVar.z0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n3 = n(tVar);
                if (n3 != null) {
                    return u(n3, i3);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1.c();
                }
                U.p pVar2 = tVar.f4489d;
                if (!pVar2.f4501p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                U.p pVar3 = pVar2.f4493h;
                E t3 = AbstractC0993f.t(tVar);
                loop0: while (true) {
                    pVar = null;
                    if (t3 == null) {
                        break;
                    }
                    if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f4491f & 1024) != 0) {
                                U.p pVar4 = pVar3;
                                K.d dVar = null;
                                while (pVar4 != null) {
                                    if (pVar4 instanceof t) {
                                        pVar = pVar4;
                                        break loop0;
                                    }
                                    if ((pVar4.f4491f & 1024) != 0 && (pVar4 instanceof AbstractC1000m)) {
                                        int i4 = 0;
                                        for (U.p pVar5 = ((AbstractC1000m) pVar4).f8771r; pVar5 != null; pVar5 = pVar5.f4494i) {
                                            if ((pVar5.f4491f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    pVar4 = pVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.p[16]);
                                                    }
                                                    if (pVar4 != null) {
                                                        dVar.b(pVar4);
                                                        pVar4 = null;
                                                    }
                                                    dVar.b(pVar5);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    pVar4 = AbstractC0993f.f(dVar);
                                }
                            }
                            pVar3 = pVar3.f4493h;
                        }
                    }
                    t3 = t3.s();
                    pVar3 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
                }
                t tVar2 = (t) pVar;
                if (tVar2 == null) {
                    return 1;
                }
                int ordinal2 = tVar2.z0().ordinal();
                if (ordinal2 == 0) {
                    v(tVar2);
                    return 1;
                }
                if (ordinal2 == 1) {
                    return w(tVar2, i3);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new C1.c();
                }
                int w2 = w(tVar2, i3);
                int i5 = w2 != 1 ? w2 : 0;
                if (i5 != 0) {
                    return i5;
                }
                v(tVar2);
                return 1;
            }
        }
        return 1;
    }

    public static final boolean x(t tVar) {
        U.p pVar;
        C0174t c0174t;
        int ordinal = tVar.z0().ordinal();
        boolean z3 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n3 = n(tVar);
                if (n3 != null ? e(n3, false, true) : true) {
                    p(tVar);
                }
                z3 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1.c();
                }
                U.p pVar2 = tVar.f4489d;
                if (!pVar2.f4501p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                U.p pVar3 = pVar2.f4493h;
                E t3 = AbstractC0993f.t(tVar);
                loop0: while (true) {
                    if (t3 == null) {
                        pVar = null;
                        break;
                    }
                    if ((((U.p) t3.f8561y.f2915f).f4492g & 1024) != 0) {
                        while (pVar3 != null) {
                            if ((pVar3.f4491f & 1024) != 0) {
                                pVar = pVar3;
                                K.d dVar = null;
                                while (pVar != null) {
                                    if (pVar instanceof t) {
                                        break loop0;
                                    }
                                    if ((pVar.f4491f & 1024) != 0 && (pVar instanceof AbstractC1000m)) {
                                        int i3 = 0;
                                        for (U.p pVar4 = ((AbstractC1000m) pVar).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                            if ((pVar4.f4491f & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    pVar = pVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.p[16]);
                                                    }
                                                    if (pVar != null) {
                                                        dVar.b(pVar);
                                                        pVar = null;
                                                    }
                                                    dVar.b(pVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    pVar = AbstractC0993f.f(dVar);
                                }
                            }
                            pVar3 = pVar3.f4493h;
                        }
                    }
                    t3 = t3.s();
                    pVar3 = (t3 == null || (c0174t = t3.f8561y) == null) ? null : (p0) c0174t.f2914e;
                }
                t tVar2 = (t) pVar;
                if (tVar2 != null) {
                    s z02 = tVar2.z0();
                    z3 = D(tVar2, tVar);
                    if (z3 && z02 != tVar2.z0()) {
                        A(tVar2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(tVar)).getFocusOwner()).f4899a.h(null, null)).booleanValue()) {
                        p(tVar);
                    }
                    z3 = false;
                }
            }
        }
        if (z3) {
            A(tVar);
        }
        return z3;
    }

    public static final boolean y(t tVar, R.h hVar) {
        Object[] objArr = new t[16];
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        int i3 = 0;
        while (dVar.m()) {
            U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar3.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f4491f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    f2.j.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = tVar2;
                                i3 = i4;
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i5 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar2);
                        }
                    } else {
                        pVar3 = pVar3.f4494i;
                    }
                }
            }
        }
        v vVar = v.f4711a;
        f2.j.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, vVar);
        if (i3 > 0) {
            int i6 = i3 - 1;
            do {
                t tVar3 = (t) objArr[i6];
                if (t(tVar3) && a(tVar3, hVar)) {
                    return true;
                }
                i6--;
            } while (i6 >= 0);
        }
        return false;
    }

    public static final boolean z(t tVar, R.h hVar) {
        Object[] objArr = new t[16];
        U.p pVar = tVar.f4489d;
        if (!pVar.f4501p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.p[16]);
        U.p pVar2 = pVar.f4494i;
        if (pVar2 == null) {
            AbstractC0993f.b(dVar, pVar);
        } else {
            dVar.b(pVar2);
        }
        int i3 = 0;
        while (dVar.m()) {
            U.p pVar3 = (U.p) dVar.o(dVar.f3216f - 1);
            if ((pVar3.f4492g & 1024) == 0) {
                AbstractC0993f.b(dVar, pVar3);
            } else {
                while (true) {
                    if (pVar3 == null) {
                        break;
                    }
                    if ((pVar3.f4491f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (pVar3 != null) {
                            if (pVar3 instanceof t) {
                                t tVar2 = (t) pVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    f2.j.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = tVar2;
                                i3 = i4;
                            } else if ((pVar3.f4491f & 1024) != 0 && (pVar3 instanceof AbstractC1000m)) {
                                int i5 = 0;
                                for (U.p pVar4 = ((AbstractC1000m) pVar3).f8771r; pVar4 != null; pVar4 = pVar4.f4494i) {
                                    if ((pVar4.f4491f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            pVar3 = pVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.p[16]);
                                            }
                                            if (pVar3 != null) {
                                                dVar2.b(pVar3);
                                                pVar3 = null;
                                            }
                                            dVar2.b(pVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            pVar3 = AbstractC0993f.f(dVar2);
                        }
                    } else {
                        pVar3 = pVar3.f4494i;
                    }
                }
            }
        }
        v vVar = v.f4711a;
        f2.j.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, vVar);
        if (i3 <= 0) {
            return false;
        }
        int i6 = 0;
        do {
            t tVar3 = (t) objArr[i6];
            if (t(tVar3) && k(tVar3, hVar)) {
                return true;
            }
            i6++;
        } while (i6 < i3);
        return false;
    }
}
