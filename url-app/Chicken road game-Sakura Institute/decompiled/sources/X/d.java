package X;

import A.V;
import D.C0129f;
import G.C0199g0;
import G.C0223t;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import java.util.Arrays;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import l.AbstractC0784j;
import l0.C0810h;
import p0.AbstractC0960V;
import p0.AbstractC0970f;
import q0.C1055h;
import r0.AbstractC1065f;
import r0.AbstractC1073n;
import r0.E;
import r0.a0;
import r0.o0;
import s.C1104h;
import s.C1106j;
import s.C1107k;
import s0.C1166s;
import y2.C1338m;
import z2.C1403G;

/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f4313a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [I.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [I.d] */
    public static final void A(t tVar) {
        C0223t c0223t;
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        E v4 = AbstractC1065f.v(tVar);
        S.n nVar2 = nVar;
        while (v4 != null) {
            if ((((S.n) v4.B.f2912f).f3981j & 5120) != 0) {
                while (nVar2 != null) {
                    int i2 = nVar2.f3980i;
                    if ((i2 & 5120) != 0) {
                        if (nVar2 != nVar && (i2 & 1024) != 0) {
                            return;
                        }
                        if ((i2 & 4096) != 0) {
                            AbstractC1073n abstractC1073n = nVar2;
                            ?? r4 = 0;
                            while (abstractC1073n != 0) {
                                if (abstractC1073n instanceof c) {
                                    c cVar = (c) abstractC1073n;
                                    cVar.Q(o(cVar));
                                } else if ((abstractC1073n.f3980i & 4096) != 0 && (abstractC1073n instanceof AbstractC1073n)) {
                                    S.n nVar3 = abstractC1073n.f9826u;
                                    int i4 = 0;
                                    abstractC1073n = abstractC1073n;
                                    r4 = r4;
                                    while (nVar3 != null) {
                                        if ((nVar3.f3980i & 4096) != 0) {
                                            i4++;
                                            r4 = r4;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC1073n = AbstractC1065f.f(r4);
                            }
                        }
                    }
                    nVar2 = nVar2.f3982k;
                }
            }
            v4 = v4.s();
            nVar2 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
    }

    public static final boolean B(t tVar) {
        Boolean C3 = C(tVar, 7);
        if (C3 != null) {
            return C3.booleanValue();
        }
        return false;
    }

    public static final Boolean C(t tVar, int i2) {
        Boolean valueOf;
        V F3 = F(tVar);
        u uVar = new u(tVar, 1);
        try {
            if (F3.f61b) {
                V.a(F3);
            }
            F3.f61b = true;
            ((I.d) F3.f63d).b(uVar);
            int d4 = AbstractC0784j.d(w(tVar, i2));
            if (d4 != 0) {
                if (d4 != 1) {
                    if (d4 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (d4 != 3) {
                        throw new C1338m();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(tVar));
            }
            return valueOf;
        } finally {
            V.b(F3);
        }
    }

    public static final boolean D(t tVar, t tVar2) {
        S.n nVar;
        S.n nVar2;
        C0223t c0223t;
        C0223t c0223t2;
        S.n nVar3 = tVar2.f3978d;
        if (!nVar3.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar4 = nVar3.f3982k;
        E v4 = AbstractC1065f.v(tVar2);
        loop0: while (true) {
            if (v4 == null) {
                nVar = null;
                break;
            }
            if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                while (nVar4 != null) {
                    if ((nVar4.f3980i & 1024) != 0) {
                        nVar = nVar4;
                        I.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof t) {
                                break loop0;
                            }
                            if ((nVar.f3980i & 1024) != 0 && (nVar instanceof AbstractC1073n)) {
                                int i2 = 0;
                                for (S.n nVar5 = ((AbstractC1073n) nVar).f9826u; nVar5 != null; nVar5 = nVar5.f3983l) {
                                    if ((nVar5.f3980i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar = nVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new I.d(new S.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar5);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar = AbstractC1065f.f(dVar);
                        }
                    }
                    nVar4 = nVar4.f3982k;
                }
            }
            v4 = v4.s();
            nVar4 = (v4 == null || (c0223t2 = v4.B) == null) ? null : (o0) c0223t2.f2911e;
        }
        if (!Intrinsics.a(nVar, tVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = tVar.C0().ordinal();
        s sVar = s.f4349e;
        if (ordinal == 0) {
            p(tVar2);
            tVar.G0(sVar);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new C1338m();
            }
            S.n nVar6 = tVar.f3978d;
            if (!nVar6.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            S.n nVar7 = nVar6.f3982k;
            E v5 = AbstractC1065f.v(tVar);
            loop4: while (true) {
                if (v5 == null) {
                    nVar2 = null;
                    break;
                }
                if ((((S.n) v5.B.f2912f).f3981j & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f3980i & 1024) != 0) {
                            nVar2 = nVar7;
                            I.d dVar2 = null;
                            while (nVar2 != null) {
                                if (nVar2 instanceof t) {
                                    break loop4;
                                }
                                if ((nVar2.f3980i & 1024) != 0 && (nVar2 instanceof AbstractC1073n)) {
                                    int i4 = 0;
                                    for (S.n nVar8 = ((AbstractC1073n) nVar2).f9826u; nVar8 != null; nVar8 = nVar8.f3983l) {
                                        if ((nVar8.f3980i & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                nVar2 = nVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new I.d(new S.n[16]);
                                                }
                                                if (nVar2 != null) {
                                                    dVar2.b(nVar2);
                                                    nVar2 = null;
                                                }
                                                dVar2.b(nVar8);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                nVar2 = AbstractC1065f.f(dVar2);
                            }
                        }
                        nVar7 = nVar7.f3982k;
                    }
                }
                v5 = v5.s();
                nVar7 = (v5 == null || (c0223t = v5.B) == null) ? null : (o0) c0223t.f2911e;
            }
            t tVar3 = (t) nVar2;
            if (tVar3 != null || !((Boolean) ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(tVar)).getFocusOwner()).f5174a.h(null, null)).booleanValue()) {
                if (tVar3 == null || !D(tVar3, tVar)) {
                    return false;
                }
                boolean D3 = D(tVar, tVar2);
                if (tVar.C0() != sVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!D3) {
                    return D3;
                }
                A(tVar3);
                return D3;
            }
            p(tVar2);
            tVar.G0(sVar);
        } else {
            if (n(tVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            t n2 = n(tVar);
            if (!(n2 != null ? e(n2, false, true) : true)) {
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
        if ((!viewGroup.isFocusable() || view.hasFocus()) && !(view instanceof C1166s)) {
            if (rect != null) {
                View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
                return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
            }
            View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
            return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
        }
        return view.requestFocus(num.intValue(), rect);
    }

    public static final V F(t tVar) {
        return ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(tVar)).getFocusOwner()).f5181h;
    }

    /* JADX WARN: Type inference failed for: r2v8, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, java.util.Collection] */
    public static final Object G(t tVar, int i2, Function1 function1) {
        Object obj;
        S.n nVar;
        C0223t c0223t;
        S.n nVar2 = tVar.f3978d;
        if (!nVar2.f3990s) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        S.n nVar3 = nVar2.f3982k;
        E v4 = AbstractC1065f.v(tVar);
        loop0: while (true) {
            obj = null;
            if (v4 == null) {
                nVar = null;
                break;
            }
            if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f3980i & 1024) != 0) {
                        nVar = nVar3;
                        I.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof t) {
                                break loop0;
                            }
                            if ((nVar.f3980i & 1024) != 0 && (nVar instanceof AbstractC1073n)) {
                                int i4 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new I.d(new S.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar = AbstractC1065f.f(dVar);
                        }
                    }
                    nVar3 = nVar3.f3982k;
                }
            }
            v4 = v4.s();
            nVar3 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
        }
        t tVar2 = (t) nVar;
        if (tVar2 != null) {
            C1055h c1055h = AbstractC0970f.f9039a;
            if (Intrinsics.a((C1107k) tVar2.g(c1055h), (C1107k) tVar.g(c1055h))) {
                return null;
            }
        }
        C1107k c1107k = (C1107k) tVar.g(AbstractC0970f.f9039a);
        if (c1107k == null) {
            return null;
        }
        int i5 = 5;
        if (!b.a(i2, 5)) {
            i5 = 6;
            if (!b.a(i2, 6)) {
                i5 = 3;
                if (!b.a(i2, 3)) {
                    i5 = 4;
                    if (!b.a(i2, 4)) {
                        if (b.a(i2, 1)) {
                            i5 = 2;
                        } else {
                            if (!b.a(i2, 2)) {
                                throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                            }
                            i5 = 1;
                        }
                    }
                }
            }
        }
        r.e eVar = c1107k.f9939a;
        if (eVar.f9451a.g().f9514m > 0) {
            r.v vVar = eVar.f9451a;
            if (!vVar.g().f9511j.isEmpty()) {
                boolean m4 = c1107k.m(i5);
                int i6 = eVar.f9452b;
                int min = m4 ? Math.min(vVar.g().f9514m - 1, ((r.o) C1403G.x(vVar.g().f9511j)).f9519a + i6) : Math.max(0, ((C0199g0) vVar.f9554d.f1052b).d() - i6);
                M2.E e4 = new M2.E();
                C0810h c0810h = c1107k.f9940b;
                c0810h.getClass();
                C1104h c1104h = new C1104h(min, min);
                I.d dVar2 = c0810h.f7906a;
                dVar2.b(c1104h);
                e4.f3580d = c1104h;
                while (obj == null && c1107k.l((C1104h) e4.f3580d, i5)) {
                    C1104h c1104h2 = (C1104h) e4.f3580d;
                    int i7 = c1104h2.f9933a;
                    boolean m5 = c1107k.m(i5);
                    int i8 = c1104h2.f9934b;
                    if (m5) {
                        i8++;
                    } else {
                        i7--;
                    }
                    C1104h c1104h3 = new C1104h(i7, i8);
                    dVar2.b(c1104h3);
                    dVar2.m((C1104h) e4.f3580d);
                    e4.f3580d = c1104h3;
                    E e5 = vVar.f9560j;
                    if (e5 != null) {
                        e5.k();
                    }
                    obj = function1.invoke(new C1106j(c1107k, e4, i5));
                }
                dVar2.m((C1104h) e4.f3580d);
                E e6 = vVar.f9560j;
                if (e6 == null) {
                    return obj;
                }
                e6.k();
                return obj;
            }
        }
        return function1.invoke(C1107k.f9938f);
    }

    public static final boolean H(int i2, P.h hVar, t tVar, Y.d dVar) {
        t h4;
        I.d dVar2 = new I.d(new t[16]);
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar3 = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar3, nVar);
        } else {
            dVar3.b(nVar2);
        }
        while (dVar3.l()) {
            S.n nVar3 = (S.n) dVar3.n(dVar3.f3332i - 1);
            if ((nVar3.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar3, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f3980i & 1024) != 0) {
                        I.d dVar4 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                if (tVar2.f3990s) {
                                    dVar2.b(tVar2);
                                }
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i4 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar4.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar4.b(nVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar4);
                        }
                    } else {
                        nVar3 = nVar3.f3983l;
                    }
                }
            }
        }
        while (dVar2.l() && (h4 = h(dVar2, dVar, i2)) != null) {
            if (h4.B0().f4332a) {
                return ((Boolean) hVar.invoke(h4)).booleanValue();
            }
            if (l(i2, hVar, h4, dVar)) {
                return true;
            }
            dVar2.m(h4);
        }
        return false;
    }

    public static final boolean I(t tVar, t tVar2, int i2, P.h hVar) {
        S.n nVar;
        C0223t c0223t;
        if (tVar.C0() != s.f4349e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new t[16];
        S.n nVar2 = tVar.f3978d;
        if (!nVar2.f3990s) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar3 = nVar2.f3983l;
        if (nVar3 == null) {
            AbstractC1065f.b(dVar, nVar2);
        } else {
            dVar.b(nVar3);
        }
        int i4 = 0;
        while (dVar.l()) {
            S.n nVar4 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar4.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar, nVar4);
            } else {
                while (true) {
                    if (nVar4 == null) {
                        break;
                    }
                    if ((nVar4.f3980i & 1024) != 0) {
                        I.d dVar2 = null;
                        while (nVar4 != null) {
                            if (nVar4 instanceof t) {
                                t tVar3 = (t) nVar4;
                                int i5 = i4 + 1;
                                if (objArr.length < i5) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i4] = tVar3;
                                i4 = i5;
                            } else if ((nVar4.f3980i & 1024) != 0 && (nVar4 instanceof AbstractC1073n)) {
                                int i6 = 0;
                                for (S.n nVar5 = ((AbstractC1073n) nVar4).f9826u; nVar5 != null; nVar5 = nVar5.f3983l) {
                                    if ((nVar5.f3980i & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            nVar4 = nVar5;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar4 != null) {
                                                dVar2.b(nVar4);
                                                nVar4 = null;
                                            }
                                            dVar2.b(nVar5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            nVar4 = AbstractC1065f.f(dVar2);
                        }
                    } else {
                        nVar4 = nVar4.f3983l;
                    }
                }
            }
        }
        v comparator = v.f4357a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i4, comparator);
        if (b.a(i2, 1)) {
            int i7 = new IntRange(0, i4 - 1, 1).f7506e;
            if (i7 >= 0) {
                boolean z4 = false;
                int i8 = 0;
                while (true) {
                    if (z4) {
                        t tVar4 = (t) objArr[i8];
                        if (t(tVar4) && k(tVar4, hVar)) {
                            return true;
                        }
                    }
                    if (Intrinsics.a(objArr[i8], tVar2)) {
                        z4 = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8++;
                }
            }
        } else {
            if (!b.a(i2, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i9 = new IntRange(0, i4 - 1, 1).f7506e;
            if (i9 >= 0) {
                boolean z5 = false;
                while (true) {
                    if (z5) {
                        t tVar5 = (t) objArr[i9];
                        if (t(tVar5) && a(tVar5, hVar)) {
                            return true;
                        }
                    }
                    if (Intrinsics.a(objArr[i9], tVar2)) {
                        z5 = true;
                    }
                    if (i9 == 0) {
                        break;
                    }
                    i9--;
                }
            }
        }
        if (!b.a(i2, 1) && tVar.B0().f4332a) {
            S.n nVar6 = tVar.f3978d;
            if (!nVar6.f3990s) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            S.n nVar7 = nVar6.f3982k;
            E v4 = AbstractC1065f.v(tVar);
            loop5: while (true) {
                if (v4 == null) {
                    nVar = null;
                    break;
                }
                if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f3980i & 1024) != 0) {
                            S.n nVar8 = nVar7;
                            I.d dVar3 = null;
                            while (nVar8 != null) {
                                if (nVar8 instanceof t) {
                                    nVar = nVar8;
                                    break loop5;
                                }
                                if ((nVar8.f3980i & 1024) != 0 && (nVar8 instanceof AbstractC1073n)) {
                                    int i10 = 0;
                                    for (S.n nVar9 = ((AbstractC1073n) nVar8).f9826u; nVar9 != null; nVar9 = nVar9.f3983l) {
                                        if ((nVar9.f3980i & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                nVar8 = nVar9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new I.d(new S.n[16]);
                                                }
                                                if (nVar8 != null) {
                                                    dVar3.b(nVar8);
                                                    nVar8 = null;
                                                }
                                                dVar3.b(nVar9);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                nVar8 = AbstractC1065f.f(dVar3);
                            }
                        }
                        nVar7 = nVar7.f3982k;
                    }
                }
                v4 = v4.s();
                nVar7 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
            }
            if (nVar != null) {
                return ((Boolean) hVar.invoke(tVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer J(int i2) {
        if (b.a(i2, 5)) {
            return 33;
        }
        if (b.a(i2, 6)) {
            return 130;
        }
        if (b.a(i2, 3)) {
            return 17;
        }
        if (b.a(i2, 4)) {
            return 66;
        }
        if (b.a(i2, 1)) {
            return 2;
        }
        return b.a(i2, 2) ? 1 : null;
    }

    public static final b K(int i2) {
        if (i2 == 1) {
            return new b(2);
        }
        if (i2 == 2) {
            return new b(1);
        }
        if (i2 == 17) {
            return new b(3);
        }
        if (i2 == 33) {
            return new b(5);
        }
        if (i2 == 66) {
            return new b(4);
        }
        if (i2 != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean L(int i2, P.h hVar, t tVar, Y.d dVar) {
        int ordinal = tVar.C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n2 = n(tVar);
                if (n2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n2.C0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean L3 = L(i2, hVar, n2, dVar);
                        if (!Intrinsics.a(L3, Boolean.FALSE)) {
                            return L3;
                        }
                        if (dVar == null) {
                            if (n2.C0() != s.f4349e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            t g4 = g(n2);
                            if (g4 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(g4);
                        }
                        return Boolean.valueOf(l(i2, hVar, tVar, dVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new C1338m();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(n2);
                }
                return Boolean.valueOf(l(i2, hVar, tVar, dVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.B0().f4332a ? (Boolean) hVar.invoke(tVar) : dVar == null ? Boolean.valueOf(i(tVar, i2, hVar)) : Boolean.valueOf(H(i2, hVar, tVar, dVar));
                }
                throw new C1338m();
            }
        }
        return Boolean.valueOf(i(tVar, i2, hVar));
    }

    public static final boolean a(t tVar, P.h hVar) {
        int ordinal = tVar.C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n2 = n(tVar);
                if (n2 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n2.C0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new C1338m();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(n2, hVar) && !m(tVar, n2, 2, hVar) && (!n2.B0().f4332a || !((Boolean) hVar.invoke(n2)).booleanValue())) {
                        return false;
                    }
                }
                return m(tVar, n2, 2, hVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1338m();
                }
                if (!y(tVar, hVar)) {
                    if (!(tVar.B0().f4332a ? ((Boolean) hVar.invoke(tVar)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return y(tVar, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (X.b.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (X.b.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (X.b.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f4376c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (X.b.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (X.b.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (X.b.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (X.b.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (X.b.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f4374a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (X.b.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f4377d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (X.b.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f4375b - r15;
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
    public static final boolean b(Y.d dVar, Y.d dVar2, Y.d dVar3, int i2) {
        if (!c(i2, dVar3, dVar) && c(i2, dVar2, dVar)) {
            boolean a4 = b.a(i2, 3);
            float f4 = dVar3.f4375b;
            float f5 = dVar3.f4377d;
            float f6 = dVar3.f4374a;
            float f7 = dVar3.f4376c;
            float f8 = dVar.f4377d;
            float f9 = dVar.f4375b;
            float f10 = dVar.f4376c;
            float f11 = dVar.f4374a;
            if (!a4) {
                if (!b.a(i2, 4)) {
                    if (!b.a(i2, 5)) {
                        if (!b.a(i2, 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i2, Y.d dVar, Y.d dVar2) {
        if (b.a(i2, 3) ? true : b.a(i2, 4)) {
            if (dVar.f4377d > dVar2.f4375b && dVar.f4375b < dVar2.f4377d) {
                return true;
            }
        } else {
            if (!(b.a(i2, 5) ? true : b.a(i2, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (dVar.f4376c > dVar2.f4374a && dVar.f4374a < dVar2.f4376c) {
                return true;
            }
        }
        return false;
    }

    public static final Y.d d(View view) {
        int[] iArr = f4313a;
        view.getLocationInWindow(iArr);
        float f4 = iArr[0];
        return new Y.d(f4, iArr[1], view.getWidth() + f4, iArr[1] + view.getHeight());
    }

    public static final boolean e(t tVar, boolean z4, boolean z5) {
        int ordinal = tVar.C0().ordinal();
        s sVar = s.f4350i;
        if (ordinal == 0) {
            tVar.G0(sVar);
            if (z5) {
                A(tVar);
            }
        } else if (ordinal == 1) {
            t n2 = n(tVar);
            if (!(n2 != null ? e(n2, z4, z5) : true)) {
                return false;
            }
            tVar.G0(sVar);
            if (z5) {
                A(tVar);
            }
        } else {
            if (ordinal == 2) {
                if (!z4) {
                    return z4;
                }
                tVar.G0(sVar);
                if (!z5) {
                    return z4;
                }
                A(tVar);
                return z4;
            }
            if (ordinal != 3) {
                throw new C1338m();
            }
        }
        return true;
    }

    public static final void f(t tVar, I.d dVar) {
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar2 = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar2, nVar);
        } else {
            dVar2.b(nVar2);
        }
        while (dVar2.l()) {
            S.n nVar3 = (S.n) dVar2.n(dVar2.f3332i - 1);
            if ((nVar3.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar2, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f3980i & 1024) != 0) {
                        I.d dVar3 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                if (tVar2.f3990s && !AbstractC1065f.v(tVar2).f9591J) {
                                    if (tVar2.B0().f4332a) {
                                        dVar.b(tVar2);
                                    } else {
                                        f(tVar2, dVar);
                                    }
                                }
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i2 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar3.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar3.b(nVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar3);
                        }
                    } else {
                        nVar3 = nVar3.f3983l;
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
        int ordinal = tVar.C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                S.n nVar = tVar.f3978d;
                if (!nVar.f3990s) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                I.d dVar = new I.d(new S.n[16]);
                S.n nVar2 = nVar.f3983l;
                if (nVar2 == null) {
                    AbstractC1065f.b(dVar, nVar);
                } else {
                    dVar.b(nVar2);
                }
                while (dVar.l()) {
                    S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
                    if ((nVar3.f3981j & 1024) == 0) {
                        AbstractC1065f.b(dVar, nVar3);
                    } else {
                        while (true) {
                            if (nVar3 == null) {
                                break;
                            }
                            if ((nVar3.f3980i & 1024) != 0) {
                                I.d dVar2 = null;
                                while (nVar3 != null) {
                                    if (nVar3 instanceof t) {
                                        t g4 = g((t) nVar3);
                                        if (g4 != null) {
                                            return g4;
                                        }
                                    } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                        int i2 = 0;
                                        for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                            if ((nVar4.f3980i & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar3 = nVar4;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new I.d(new S.n[16]);
                                                    }
                                                    if (nVar3 != null) {
                                                        dVar2.b(nVar3);
                                                        nVar3 = null;
                                                    }
                                                    dVar2.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar3 = AbstractC1065f.f(dVar2);
                                }
                            } else {
                                nVar3 = nVar3.f3983l;
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
                throw new C1338m();
            }
        }
        return tVar;
    }

    public static final t h(I.d dVar, Y.d dVar2, int i2) {
        Y.d g4;
        if (b.a(i2, 3)) {
            g4 = dVar2.g(dVar2.c() + 1, 0.0f);
        } else if (b.a(i2, 4)) {
            g4 = dVar2.g(-(dVar2.c() + 1), 0.0f);
        } else if (b.a(i2, 5)) {
            g4 = dVar2.g(0.0f, dVar2.b() + 1);
        } else {
            if (!b.a(i2, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            g4 = dVar2.g(0.0f, -(dVar2.b() + 1));
        }
        int i4 = dVar.f3332i;
        t tVar = null;
        if (i4 > 0) {
            Object[] objArr = dVar.f3330d;
            int i5 = 0;
            do {
                t tVar2 = (t) objArr[i5];
                if (t(tVar2)) {
                    Y.d j4 = j(tVar2);
                    if (r(i2, j4, dVar2) && (!r(i2, g4, dVar2) || b(dVar2, j4, g4, i2) || (!b(dVar2, g4, j4, i2) && s(i2, dVar2, j4) < s(i2, dVar2, g4)))) {
                        tVar = tVar2;
                        g4 = j4;
                    }
                }
                i5++;
            } while (i5 < i4);
        }
        return tVar;
    }

    public static final boolean i(t tVar, int i2, Function1 function1) {
        Y.d dVar;
        I.d dVar2 = new I.d(new t[16]);
        f(tVar, dVar2);
        if (dVar2.f3332i <= 1) {
            t tVar2 = (t) (dVar2.k() ? null : dVar2.f3330d[0]);
            if (tVar2 != null) {
                return ((Boolean) function1.invoke(tVar2)).booleanValue();
            }
            return false;
        }
        if (b.a(i2, 7)) {
            i2 = 4;
        }
        if (b.a(i2, 4) ? true : b.a(i2, 6)) {
            Y.d j4 = j(tVar);
            float f4 = j4.f4375b;
            float f5 = j4.f4374a;
            dVar = new Y.d(f5, f4, f5, f4);
        } else {
            if (!(b.a(i2, 3) ? true : b.a(i2, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            Y.d j5 = j(tVar);
            float f6 = j5.f4377d;
            float f7 = j5.f4376c;
            dVar = new Y.d(f7, f6, f7, f6);
        }
        t h4 = h(dVar2, dVar, i2);
        if (h4 != null) {
            return ((Boolean) function1.invoke(h4)).booleanValue();
        }
        return false;
    }

    public static final Y.d j(t tVar) {
        a0 a0Var = tVar.f3985n;
        return a0Var != null ? AbstractC0960V.g(a0Var).n(a0Var, false) : Y.d.f4373e;
    }

    public static final boolean k(t tVar, P.h hVar) {
        int ordinal = tVar.C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n2 = n(tVar);
                if (n2 != null) {
                    return k(n2, hVar) || m(tVar, n2, 1, hVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return tVar.B0().f4332a ? ((Boolean) hVar.invoke(tVar)).booleanValue() : z(tVar, hVar);
                }
                throw new C1338m();
            }
        }
        return z(tVar, hVar);
    }

    public static final boolean l(int i2, P.h hVar, t tVar, Y.d dVar) {
        if (H(i2, hVar, tVar, dVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i2, new C0129f(tVar, dVar, i2, hVar, 3));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(t tVar, t tVar2, int i2, P.h hVar) {
        if (I(tVar, tVar2, i2, hVar)) {
            return true;
        }
        Boolean bool = (Boolean) G(tVar, i2, new C0129f(tVar, tVar2, i2, hVar, 2));
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
        S.n nVar = tVar.f3978d;
        boolean z4 = nVar.f3990s;
        if (!z4) {
            return null;
        }
        if (!z4) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (dVar.l()) {
            S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar3.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f3980i & 1024) != 0) {
                        I.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                if (tVar2.f3978d.f3990s && ((ordinal = tVar2.C0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                    return tVar2;
                                }
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i2 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i2++;
                                        if (i2 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i2 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f3983l;
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
        s C02;
        S.n nVar = (S.n) cVar;
        S.n nVar2 = nVar.f3978d;
        I.d dVar = null;
        while (true) {
            int i2 = 0;
            if (nVar2 == null) {
                S.n nVar3 = nVar.f3978d;
                if (!nVar3.f3990s) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                I.d dVar2 = new I.d(new S.n[16]);
                S.n nVar4 = nVar3.f3983l;
                if (nVar4 == null) {
                    AbstractC1065f.b(dVar2, nVar3);
                } else {
                    dVar2.b(nVar4);
                }
                while (dVar2.l()) {
                    S.n nVar5 = (S.n) dVar2.n(dVar2.f3332i - 1);
                    if ((nVar5.f3981j & 1024) == 0) {
                        AbstractC1065f.b(dVar2, nVar5);
                    } else {
                        while (true) {
                            if (nVar5 == null) {
                                break;
                            }
                            if ((nVar5.f3980i & 1024) != 0) {
                                I.d dVar3 = null;
                                while (nVar5 != null) {
                                    if (nVar5 instanceof t) {
                                        s C03 = ((t) nVar5).C0();
                                        int ordinal = C03.ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return C03;
                                        }
                                    } else if ((nVar5.f3980i & 1024) != 0 && (nVar5 instanceof AbstractC1073n)) {
                                        int i4 = 0;
                                        for (S.n nVar6 = ((AbstractC1073n) nVar5).f9826u; nVar6 != null; nVar6 = nVar6.f3983l) {
                                            if ((nVar6.f3980i & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nVar5 = nVar6;
                                                } else {
                                                    if (dVar3 == null) {
                                                        dVar3 = new I.d(new S.n[16]);
                                                    }
                                                    if (nVar5 != null) {
                                                        dVar3.b(nVar5);
                                                        nVar5 = null;
                                                    }
                                                    dVar3.b(nVar6);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    nVar5 = AbstractC1065f.f(dVar3);
                                }
                            } else {
                                nVar5 = nVar5.f3983l;
                            }
                        }
                    }
                }
                return s.f4350i;
            }
            if (nVar2 instanceof t) {
                C02 = ((t) nVar2).C0();
                int ordinal2 = C02.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    break;
                }
            } else if ((nVar2.f3980i & 1024) != 0 && (nVar2 instanceof AbstractC1073n)) {
                for (S.n nVar7 = ((AbstractC1073n) nVar2).f9826u; nVar7 != null; nVar7 = nVar7.f3983l) {
                    if ((nVar7.f3980i & 1024) != 0) {
                        i2++;
                        if (i2 == 1) {
                            nVar2 = nVar7;
                        } else {
                            if (dVar == null) {
                                dVar = new I.d(new S.n[16]);
                            }
                            if (nVar2 != null) {
                                dVar.b(nVar2);
                                nVar2 = null;
                            }
                            dVar.b(nVar7);
                        }
                    }
                }
                if (i2 == 1) {
                }
            }
            nVar2 = AbstractC1065f.f(dVar);
        }
        return C02;
    }

    public static final void p(t tVar) {
        AbstractC1065f.s(tVar, new u(tVar, 0));
        int ordinal = tVar.C0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            tVar.G0(s.f4348d);
        }
    }

    public static final void q(t tVar) {
        f fVar = ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(tVar)).getFocusOwner()).f5180g;
        fVar.b(fVar.f4317c, tVar);
    }

    public static final boolean r(int i2, Y.d dVar, Y.d dVar2) {
        boolean a4 = b.a(i2, 3);
        float f4 = dVar.f4374a;
        float f5 = dVar.f4376c;
        if (a4) {
            float f6 = dVar2.f4376c;
            float f7 = dVar2.f4374a;
            if ((f6 <= f5 && f7 < f5) || f7 <= f4) {
                return false;
            }
        } else if (b.a(i2, 4)) {
            float f8 = dVar2.f4374a;
            float f9 = dVar2.f4376c;
            if ((f8 >= f4 && f9 > f4) || f9 >= f5) {
                return false;
            }
        } else {
            boolean a5 = b.a(i2, 5);
            float f10 = dVar.f4375b;
            float f11 = dVar.f4377d;
            if (a5) {
                float f12 = dVar2.f4377d;
                float f13 = dVar2.f4375b;
                if ((f12 <= f11 && f13 < f11) || f13 <= f10) {
                    return false;
                }
            } else {
                if (!b.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f14 = dVar2.f4375b;
                float f15 = dVar2.f4377d;
                if ((f14 >= f10 && f15 > f10) || f15 >= f11) {
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
    public static final long s(int i2, Y.d dVar, Y.d dVar2) {
        float f4;
        float f5;
        float f6;
        float c4;
        float c5;
        boolean a4 = b.a(i2, 3);
        float f7 = dVar2.f4375b;
        float f8 = dVar2.f4374a;
        if (!a4) {
            if (b.a(i2, 4)) {
                f4 = f8 - dVar.f4376c;
            } else if (b.a(i2, 5)) {
                f5 = dVar.f4375b;
                f6 = dVar2.f4377d;
            } else {
                if (!b.a(i2, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f4 = f7 - dVar.f4377d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f4));
            if (!b.a(i2, 3) ? true : b.a(i2, 4)) {
                if (!(b.a(i2, 5) ? true : b.a(i2, 6))) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f9 = 2;
                c4 = (dVar.c() / f9) + dVar.f4374a;
                c5 = (dVar2.c() / f9) + f8;
            } else {
                float f10 = 2;
                c4 = (dVar.b() / f10) + dVar.f4375b;
                c5 = (dVar2.b() / f10) + f7;
            }
            long abs2 = (long) Math.abs(c4 - c5);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f5 = dVar.f4374a;
        f6 = dVar2.f4376c;
        f4 = f5 - f6;
        long abs3 = (long) Math.abs(Math.max(0.0f, f4));
        if (!b.a(i2, 3) ? true : b.a(i2, 4)) {
        }
        long abs22 = (long) Math.abs(c4 - c5);
        return (abs22 * abs22) + (13 * abs3 * abs3);
    }

    public static final boolean t(t tVar) {
        E e4;
        a0 a0Var;
        E e5;
        a0 a0Var2 = tVar.f3985n;
        return (a0Var2 == null || (e4 = a0Var2.f9762r) == null || !e4.E() || (a0Var = tVar.f3985n) == null || (e5 = a0Var.f9762r) == null || !e5.D()) ? false : true;
    }

    public static final int u(t tVar, int i2) {
        int ordinal = tVar.C0().ordinal();
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
            throw new C1338m();
        }
        t n2 = n(tVar);
        if (n2 == null) {
            throw new IllegalArgumentException("ActiveParent with no focused child");
        }
        int u4 = u(n2, i2);
        if (u4 == 1) {
            u4 = 0;
        }
        if (u4 != 0) {
            return u4;
        }
        if (tVar.f4352t) {
            return 1;
        }
        tVar.f4352t = true;
        try {
            tVar.B0().f4342k.getClass();
            p pVar = p.f4344b;
            return 1;
        } finally {
            tVar.f4352t = false;
        }
    }

    public static final void v(t tVar) {
        if (tVar.f4353u) {
            return;
        }
        tVar.f4353u = true;
        try {
            tVar.B0().f4341j.getClass();
            p pVar = p.f4344b;
        } finally {
            tVar.f4353u = false;
        }
    }

    public static final int w(t tVar, int i2) {
        S.n nVar;
        C0223t c0223t;
        int ordinal = tVar.C0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n2 = n(tVar);
                if (n2 != null) {
                    return u(n2, i2);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1338m();
                }
                S.n nVar2 = tVar.f3978d;
                if (!nVar2.f3990s) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                S.n nVar3 = nVar2.f3982k;
                E v4 = AbstractC1065f.v(tVar);
                loop0: while (true) {
                    nVar = null;
                    if (v4 == null) {
                        break;
                    }
                    if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f3980i & 1024) != 0) {
                                S.n nVar4 = nVar3;
                                I.d dVar = null;
                                while (nVar4 != null) {
                                    if (nVar4 instanceof t) {
                                        nVar = nVar4;
                                        break loop0;
                                    }
                                    if ((nVar4.f3980i & 1024) != 0 && (nVar4 instanceof AbstractC1073n)) {
                                        int i4 = 0;
                                        for (S.n nVar5 = ((AbstractC1073n) nVar4).f9826u; nVar5 != null; nVar5 = nVar5.f3983l) {
                                            if ((nVar5.f3980i & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    nVar4 = nVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new I.d(new S.n[16]);
                                                    }
                                                    if (nVar4 != null) {
                                                        dVar.b(nVar4);
                                                        nVar4 = null;
                                                    }
                                                    dVar.b(nVar5);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    nVar4 = AbstractC1065f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f3982k;
                        }
                    }
                    v4 = v4.s();
                    nVar3 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
                }
                t tVar2 = (t) nVar;
                if (tVar2 == null) {
                    return 1;
                }
                int ordinal2 = tVar2.C0().ordinal();
                if (ordinal2 == 0) {
                    v(tVar2);
                    return 1;
                }
                if (ordinal2 == 1) {
                    return w(tVar2, i2);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new C1338m();
                }
                int w4 = w(tVar2, i2);
                int i5 = w4 != 1 ? w4 : 0;
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
        S.n nVar;
        C0223t c0223t;
        int ordinal = tVar.C0().ordinal();
        boolean z4 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                t n2 = n(tVar);
                if (n2 != null ? e(n2, false, true) : true) {
                    p(tVar);
                }
                z4 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new C1338m();
                }
                S.n nVar2 = tVar.f3978d;
                if (!nVar2.f3990s) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                S.n nVar3 = nVar2.f3982k;
                E v4 = AbstractC1065f.v(tVar);
                loop0: while (true) {
                    if (v4 == null) {
                        nVar = null;
                        break;
                    }
                    if ((((S.n) v4.B.f2912f).f3981j & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f3980i & 1024) != 0) {
                                nVar = nVar3;
                                I.d dVar = null;
                                while (nVar != null) {
                                    if (nVar instanceof t) {
                                        break loop0;
                                    }
                                    if ((nVar.f3980i & 1024) != 0 && (nVar instanceof AbstractC1073n)) {
                                        int i2 = 0;
                                        for (S.n nVar4 = ((AbstractC1073n) nVar).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                            if ((nVar4.f3980i & 1024) != 0) {
                                                i2++;
                                                if (i2 == 1) {
                                                    nVar = nVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new I.d(new S.n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        dVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    dVar.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i2 == 1) {
                                        }
                                    }
                                    nVar = AbstractC1065f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f3982k;
                        }
                    }
                    v4 = v4.s();
                    nVar3 = (v4 == null || (c0223t = v4.B) == null) ? null : (o0) c0223t.f2911e;
                }
                t tVar2 = (t) nVar;
                if (tVar2 != null) {
                    s C02 = tVar2.C0();
                    z4 = D(tVar2, tVar);
                    if (z4 && C02 != tVar2.C0()) {
                        A(tVar2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(tVar)).getFocusOwner()).f5174a.h(null, null)).booleanValue()) {
                        p(tVar);
                    }
                    z4 = false;
                }
            }
        }
        if (z4) {
            A(tVar);
        }
        return z4;
    }

    public static final boolean y(t tVar, P.h hVar) {
        Object[] objArr = new t[16];
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i2 = 0;
        while (dVar.l()) {
            S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar3.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f3980i & 1024) != 0) {
                        I.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = tVar2;
                                i2 = i4;
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i5 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f3983l;
                    }
                }
            }
        }
        v comparator = v.f4357a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i2, comparator);
        if (i2 > 0) {
            int i6 = i2 - 1;
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

    public static final boolean z(t tVar, P.h hVar) {
        Object[] objArr = new t[16];
        S.n nVar = tVar.f3978d;
        if (!nVar.f3990s) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        I.d dVar = new I.d(new S.n[16]);
        S.n nVar2 = nVar.f3983l;
        if (nVar2 == null) {
            AbstractC1065f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i2 = 0;
        while (dVar.l()) {
            S.n nVar3 = (S.n) dVar.n(dVar.f3332i - 1);
            if ((nVar3.f3981j & 1024) == 0) {
                AbstractC1065f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f3980i & 1024) != 0) {
                        I.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof t) {
                                t tVar2 = (t) nVar3;
                                int i4 = i2 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    Intrinsics.checkNotNullExpressionValue(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i2] = tVar2;
                                i2 = i4;
                            } else if ((nVar3.f3980i & 1024) != 0 && (nVar3 instanceof AbstractC1073n)) {
                                int i5 = 0;
                                for (S.n nVar4 = ((AbstractC1073n) nVar3).f9826u; nVar4 != null; nVar4 = nVar4.f3983l) {
                                    if ((nVar4.f3980i & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new I.d(new S.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            nVar3 = AbstractC1065f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f3983l;
                    }
                }
            }
        }
        v comparator = v.f4357a;
        Intrinsics.checkNotNullParameter(objArr, "<this>");
        Intrinsics.checkNotNullParameter(comparator, "comparator");
        Arrays.sort(objArr, 0, i2, comparator);
        if (i2 <= 0) {
            return false;
        }
        int i6 = 0;
        do {
            t tVar3 = (t) objArr[i6];
            if (t(tVar3) && k(tVar3, hVar)) {
                return true;
            }
            i6++;
        } while (i6 < i2);
        return false;
    }
}
