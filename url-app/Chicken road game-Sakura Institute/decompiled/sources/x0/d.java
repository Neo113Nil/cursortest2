package x0;

import a0.s0;
import android.graphics.Rect;
import android.view.FocusFinder;
import android.view.View;
import android.view.ViewGroup;
import g0.d1;
import java.util.Arrays;
import r1.a1;
import r1.d0;
import r1.o1;
import r6.v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class d {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f9596a = new int[2];

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
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v11 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v13 */
    /* JADX WARN: Type inference failed for: r4v2 */
    /* JADX WARN: Type inference failed for: r4v3 */
    /* JADX WARN: Type inference failed for: r4v4, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r4v5 */
    /* JADX WARN: Type inference failed for: r4v6 */
    /* JADX WARN: Type inference failed for: r4v7, types: [i0.d] */
    public static final void A(r rVar) {
        g0.t tVar;
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        d0 t2 = r1.f.t(rVar);
        s0.n nVar2 = nVar;
        while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 5120) != 0) {
                while (nVar2 != null) {
                    int i7 = nVar2.f8106h;
                    if ((i7 & 5120) != 0) {
                        if (nVar2 != nVar && (i7 & 1024) != 0) {
                            return;
                        }
                        if ((i7 & 4096) != 0) {
                            r1.m mVar = nVar2;
                            ?? r42 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof c) {
                                    c cVar = (c) mVar;
                                    cVar.m0(o(cVar));
                                } else if ((mVar.f8106h & 4096) != 0 && (mVar instanceof r1.m)) {
                                    s0.n nVar3 = mVar.f7853t;
                                    int i8 = 0;
                                    mVar = mVar;
                                    r42 = r42;
                                    while (nVar3 != null) {
                                        if ((nVar3.f8106h & 4096) != 0) {
                                            i8++;
                                            r42 = r42;
                                            if (i8 == 1) {
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
                                    if (i8 == 1) {
                                    }
                                }
                                mVar = r1.f.f(r42);
                            }
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
    }

    public static final Boolean B(r rVar) {
        Boolean valueOf;
        s0 E = E(rVar);
        s sVar = new s(rVar, 1);
        try {
            if (E.f136b) {
                s0.a(E);
            }
            E.f136b = true;
            ((i0.d) E.f138d).b(sVar);
            int d8 = l.h.d(w(rVar));
            if (d8 != 0) {
                if (d8 != 1) {
                    if (d8 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (d8 != 3) {
                        throw new b4.c();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(rVar));
            }
            return valueOf;
        } finally {
            s0.b(E);
        }
    }

    public static final boolean C(r rVar, r rVar2) {
        s0.n nVar;
        s0.n nVar2;
        g0.t tVar;
        g0.t tVar2;
        s0.n nVar3 = rVar2.f8104f;
        if (!nVar3.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar4 = nVar3.f8108j;
        d0 t2 = r1.f.t(rVar2);
        loop0: while (true) {
            if (t2 == null) {
                nVar = null;
                break;
            }
            if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                while (nVar4 != null) {
                    if ((nVar4.f8106h & 1024) != 0) {
                        nVar = nVar4;
                        i0.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof r) {
                                break loop0;
                            }
                            if ((nVar.f8106h & 1024) != 0 && (nVar instanceof r1.m)) {
                                int i7 = 0;
                                for (s0.n nVar5 = ((r1.m) nVar).f7853t; nVar5 != null; nVar5 = nVar5.f8109k) {
                                    if ((nVar5.f8106h & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            nVar = nVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar5);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            nVar = r1.f.f(dVar);
                        }
                    }
                    nVar4 = nVar4.f8108j;
                }
            }
            t2 = t2.s();
            nVar4 = (t2 == null || (tVar2 = t2.A) == null) ? null : (o1) tVar2.f3894e;
        }
        if (!r6.k.a(nVar, rVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = rVar.B0().ordinal();
        q qVar = q.f9629g;
        if (ordinal == 0) {
            p(rVar2);
            rVar.F0(qVar);
            return true;
        }
        if (ordinal == 1) {
            if (n(rVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            r n8 = n(rVar);
            if (n8 != null ? e(n8, false) : true) {
                p(rVar2);
                return true;
            }
        } else if (ordinal != 2) {
            if (ordinal != 3) {
                throw new b4.c();
            }
            s0.n nVar6 = rVar.f8104f;
            if (!nVar6.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            s0.n nVar7 = nVar6.f8108j;
            d0 t8 = r1.f.t(rVar);
            loop4: while (true) {
                if (t8 == null) {
                    nVar2 = null;
                    break;
                }
                if ((((s0.n) t8.A.f3895f).f8107i & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f8106h & 1024) != 0) {
                            nVar2 = nVar7;
                            i0.d dVar2 = null;
                            while (nVar2 != null) {
                                if (nVar2 instanceof r) {
                                    break loop4;
                                }
                                if ((nVar2.f8106h & 1024) != 0 && (nVar2 instanceof r1.m)) {
                                    int i8 = 0;
                                    for (s0.n nVar8 = ((r1.m) nVar2).f7853t; nVar8 != null; nVar8 = nVar8.f8109k) {
                                        if ((nVar8.f8106h & 1024) != 0) {
                                            i8++;
                                            if (i8 == 1) {
                                                nVar2 = nVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar2 != null) {
                                                    dVar2.b(nVar2);
                                                    nVar2 = null;
                                                }
                                                dVar2.b(nVar8);
                                            }
                                        }
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                nVar2 = r1.f.f(dVar2);
                            }
                        }
                        nVar7 = nVar7.f8108j;
                    }
                }
                t8 = t8.s();
                nVar7 = (t8 == null || (tVar = t8.A) == null) ? null : (o1) tVar.f3894e;
            }
            r rVar3 = (r) nVar2;
            if (rVar3 == null && ((Boolean) ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(rVar)).getFocusOwner()).f711a.d(null, null)).booleanValue()) {
                p(rVar2);
                rVar.F0(qVar);
                return true;
            }
            if (rVar3 != null && C(rVar3, rVar)) {
                boolean C = C(rVar, rVar2);
                if (rVar.B0() != qVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (C) {
                    A(rVar3);
                }
                return C;
            }
        }
        return false;
    }

    public static final boolean D(View view, Integer num, Rect rect) {
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
        if (view instanceof s1.r) {
            return view.requestFocus(num.intValue(), rect);
        }
        if (rect != null) {
            View findNextFocusFromRect = FocusFinder.getInstance().findNextFocusFromRect(viewGroup, rect, num.intValue());
            return findNextFocusFromRect != null ? findNextFocusFromRect.requestFocus(num.intValue(), rect) : view.requestFocus(num.intValue(), rect);
        }
        View findNextFocus = FocusFinder.getInstance().findNextFocus(viewGroup, view.hasFocus() ? view.findFocus() : null, num.intValue());
        return findNextFocus != null ? findNextFocus.requestFocus(num.intValue()) : view.requestFocus(num.intValue());
    }

    public static final s0 E(r rVar) {
        return ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(rVar)).getFocusOwner()).f718h;
    }

    /* JADX WARN: Code restructure failed: missing block: B:48:0x0096, code lost:
    
        if (r6.k.a((s.k) r5.g(r0), (s.k) r10.g(r0)) != false) goto L98;
     */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, java.util.List] */
    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, java.util.Collection] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object F(r rVar, int i7, q6.c cVar) {
        Object obj;
        s0.n nVar;
        g0.t tVar;
        s0.n nVar2 = rVar.f8104f;
        if (!nVar2.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar3 = nVar2.f8108j;
        d0 t2 = r1.f.t(rVar);
        loop0: while (true) {
            obj = null;
            if (t2 == null) {
                nVar = null;
                break;
            }
            if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                while (nVar3 != null) {
                    if ((nVar3.f8106h & 1024) != 0) {
                        nVar = nVar3;
                        i0.d dVar = null;
                        while (nVar != null) {
                            if (nVar instanceof r) {
                                break loop0;
                            }
                            if ((nVar.f8106h & 1024) != 0 && (nVar instanceof r1.m)) {
                                int i8 = 0;
                                for (s0.n nVar4 = ((r1.m) nVar).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nVar = nVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar != null) {
                                                dVar.b(nVar);
                                                nVar = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            nVar = r1.f.f(dVar);
                        }
                    }
                    nVar3 = nVar3.f8108j;
                }
            }
            t2 = t2.s();
            nVar3 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        r rVar2 = (r) nVar;
        if (rVar2 != null) {
            q1.h hVar = p1.f.f7042a;
        }
        s.k kVar = (s.k) rVar.g(p1.f.f7042a);
        if (kVar != null) {
            int i9 = 5;
            if (i7 != 5) {
                i9 = 6;
                if (i7 != 6) {
                    i9 = 3;
                    if (i7 != 3) {
                        i9 = 4;
                        if (i7 != 4) {
                            i9 = 2;
                            if (i7 != 1) {
                                if (i7 != 2) {
                                    throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                                }
                                i9 = 1;
                            }
                        }
                    }
                }
            }
            l1.i iVar = kVar.f8031b;
            r.d dVar2 = kVar.f8030a;
            r.s sVar = dVar2.f7596a;
            r.s sVar2 = dVar2.f7596a;
            if (sVar.g().f7641m <= 0 || sVar2.g().f7638j.isEmpty()) {
                return cVar.f(s.k.f8029e);
            }
            int min = kVar.m(i9) ? Math.min(sVar2.g().f7641m - 1, ((r.m) e6.l.n0(sVar2.g().f7638j)).f7646a) : Math.max(0, ((d1) sVar2.f7677d.f1514b).e());
            v vVar = new v();
            iVar.getClass();
            i0.d dVar3 = iVar.f5811a;
            s.h hVar2 = new s.h(min, min);
            dVar3.b(hVar2);
            vVar.f7968f = hVar2;
            while (obj == null && kVar.l((s.h) vVar.f7968f, i9)) {
                s.h hVar3 = (s.h) vVar.f7968f;
                int i10 = hVar3.f8010a;
                int i11 = hVar3.f8011b;
                if (kVar.m(i9)) {
                    i11++;
                } else {
                    i10--;
                }
                s.h hVar4 = new s.h(i10, i11);
                dVar3.b(hVar4);
                dVar3.n((s.h) vVar.f7968f);
                vVar.f7968f = hVar4;
                d0 d0Var = sVar2.f7683j;
                if (d0Var != null) {
                    d0Var.k();
                }
                obj = cVar.f(new s.j(kVar, vVar, i9));
            }
            dVar3.n((s.h) vVar.f7968f);
            d0 d0Var2 = sVar2.f7683j;
            if (d0Var2 != null) {
                d0Var2.k();
            }
            return obj;
        }
        return null;
    }

    public static final boolean G(int i7, c.h hVar, r rVar, y0.d dVar) {
        r h3;
        i0.d dVar2 = new i0.d(new r[16]);
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        i0.d dVar3 = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            r1.f.b(dVar3, nVar);
        } else {
            dVar3.b(nVar2);
        }
        while (dVar3.m()) {
            s0.n nVar3 = (s0.n) dVar3.o(dVar3.f4842h - 1);
            if ((nVar3.f8107i & 1024) == 0) {
                r1.f.b(dVar3, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f8106h & 1024) != 0) {
                        i0.d dVar4 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof r) {
                                r rVar2 = (r) nVar3;
                                if (rVar2.f8116r) {
                                    dVar2.b(rVar2);
                                }
                            } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                int i8 = 0;
                                for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i8++;
                                        if (i8 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar4.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar4.b(nVar4);
                                        }
                                    }
                                }
                                if (i8 == 1) {
                                }
                            }
                            nVar3 = r1.f.f(dVar4);
                        }
                    } else {
                        nVar3 = nVar3.f8109k;
                    }
                }
            }
        }
        while (dVar2.m() && (h3 = h(dVar2, dVar, i7)) != null) {
            if (h3.A0().f9612a) {
                return ((Boolean) hVar.f(h3)).booleanValue();
            }
            if (l(i7, hVar, h3, dVar)) {
                return true;
            }
            dVar2.n(h3);
        }
        return false;
    }

    /* JADX WARN: Removed duplicated region for block: B:151:0x01ae  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x012a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean H(r rVar, r rVar2, int i7, c.h hVar) {
        s0.n nVar;
        s0.n nVar2;
        g0.t tVar;
        if (rVar.B0() != q.f9629g) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new r[16];
        s0.n nVar3 = rVar.f8104f;
        if (!nVar3.f8116r) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar4 = nVar3.f8109k;
        if (nVar4 == null) {
            r1.f.b(dVar, nVar3);
        } else {
            dVar.b(nVar4);
        }
        int i8 = 0;
        while (dVar.m()) {
            s0.n nVar5 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar5.f8107i & 1024) == 0) {
                r1.f.b(dVar, nVar5);
            } else {
                while (true) {
                    if (nVar5 == null) {
                        break;
                    }
                    if ((nVar5.f8106h & 1024) != 0) {
                        i0.d dVar2 = null;
                        while (nVar5 != null) {
                            if (nVar5 instanceof r) {
                                r rVar3 = (r) nVar5;
                                int i9 = i8 + 1;
                                if (objArr.length < i9) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i9, objArr.length * 2));
                                    r6.k.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i8] = rVar3;
                                i8 = i9;
                            } else if ((nVar5.f8106h & 1024) != 0 && (nVar5 instanceof r1.m)) {
                                int i10 = 0;
                                for (s0.n nVar6 = ((r1.m) nVar5).f7853t; nVar6 != null; nVar6 = nVar6.f8109k) {
                                    if ((nVar6.f8106h & 1024) != 0) {
                                        i10++;
                                        if (i10 == 1) {
                                            nVar5 = nVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar5 != null) {
                                                dVar2.b(nVar5);
                                                nVar5 = null;
                                            }
                                            dVar2.b(nVar6);
                                        }
                                    }
                                }
                                if (i10 == 1) {
                                }
                            }
                            nVar5 = r1.f.f(dVar2);
                        }
                    } else {
                        nVar5 = nVar5.f8109k;
                    }
                }
            }
        }
        r6.k.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i8, t.f9637a);
        if (i7 != 1) {
            if (i7 != 2) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i11 = new w6.d(0, i8 - 1, 1).f9522g;
            if (i11 >= 0) {
                boolean z8 = false;
                while (true) {
                    if (z8) {
                        r rVar4 = (r) objArr[i11];
                        if (t(rVar4) && a(rVar4, hVar)) {
                            break;
                        }
                    }
                    if (r6.k.a(objArr[i11], rVar2)) {
                        z8 = true;
                    }
                    if (i11 == 0) {
                        break;
                    }
                    i11--;
                }
                return true;
            }
            if (i7 != 1) {
                nVar = rVar.f8104f;
                if (nVar.f8116r) {
                }
            }
            return false;
        }
        int i12 = new w6.d(0, i8 - 1, 1).f9522g;
        if (i12 >= 0) {
            boolean z9 = false;
            int i13 = 0;
            while (true) {
                if (z9) {
                    r rVar5 = (r) objArr[i13];
                    if (t(rVar5) && k(rVar5, hVar)) {
                        break;
                    }
                }
                if (r6.k.a(objArr[i13], rVar2)) {
                    z9 = true;
                }
                if (i13 == i12) {
                    break;
                }
                i13++;
            }
            return true;
        }
        if (i7 != 1 && rVar.A0().f9612a) {
            nVar = rVar.f8104f;
            if (nVar.f8116r) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            s0.n nVar7 = nVar.f8108j;
            d0 t2 = r1.f.t(rVar);
            loop5: while (true) {
                if (t2 == null) {
                    nVar2 = null;
                    break;
                }
                if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                    while (nVar7 != null) {
                        if ((nVar7.f8106h & 1024) != 0) {
                            s0.n nVar8 = nVar7;
                            i0.d dVar3 = null;
                            while (nVar8 != null) {
                                if (nVar8 instanceof r) {
                                    nVar2 = nVar8;
                                    break loop5;
                                }
                                if ((nVar8.f8106h & 1024) != 0 && (nVar8 instanceof r1.m)) {
                                    int i14 = 0;
                                    for (s0.n nVar9 = ((r1.m) nVar8).f7853t; nVar9 != null; nVar9 = nVar9.f8109k) {
                                        if ((nVar9.f8106h & 1024) != 0) {
                                            i14++;
                                            if (i14 == 1) {
                                                nVar8 = nVar9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar8 != null) {
                                                    dVar3.b(nVar8);
                                                    nVar8 = null;
                                                }
                                                dVar3.b(nVar9);
                                            }
                                        }
                                    }
                                    if (i14 == 1) {
                                    }
                                }
                                nVar8 = r1.f.f(dVar3);
                            }
                        }
                        nVar7 = nVar7.f8108j;
                    }
                }
                t2 = t2.s();
                nVar7 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
            }
            if (nVar2 != null) {
                return ((Boolean) hVar.f(rVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer I(int i7) {
        if (i7 == 5) {
            return 33;
        }
        if (i7 == 6) {
            return 130;
        }
        if (i7 == 3) {
            return 17;
        }
        if (i7 == 4) {
            return 66;
        }
        if (i7 == 1) {
            return 2;
        }
        return i7 == 2 ? 1 : null;
    }

    public static final b J(int i7) {
        if (i7 == 1) {
            return new b(2);
        }
        if (i7 == 2) {
            return new b(1);
        }
        if (i7 == 17) {
            return new b(3);
        }
        if (i7 == 33) {
            return new b(5);
        }
        if (i7 == 66) {
            return new b(4);
        }
        if (i7 != 130) {
            return null;
        }
        return new b(6);
    }

    public static final Boolean K(int i7, c.h hVar, r rVar, y0.d dVar) {
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n8.B0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean K = K(i7, hVar, n8, dVar);
                        if (!r6.k.a(K, Boolean.FALSE)) {
                            return K;
                        }
                        if (dVar == null) {
                            if (n8.B0() != q.f9629g) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            r g9 = g(n8);
                            if (g9 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(g9);
                        }
                        return Boolean.valueOf(l(i7, hVar, rVar, dVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new b4.c();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(n8);
                }
                return Boolean.valueOf(l(i7, hVar, rVar, dVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rVar.A0().f9612a ? (Boolean) hVar.f(rVar) : dVar == null ? Boolean.valueOf(i(rVar, i7, hVar)) : Boolean.valueOf(G(i7, hVar, rVar, dVar));
                }
                throw new b4.c();
            }
        }
        return Boolean.valueOf(i(rVar, i7, hVar));
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x007c A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(r rVar, c.h hVar) {
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n8.B0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new b4.c();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (a(n8, hVar) || m(rVar, n8, 2, hVar) || (n8.A0().f9612a && ((Boolean) hVar.f(n8)).booleanValue())) {
                        return true;
                    }
                }
                return m(rVar, n8, 2, hVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new b4.c();
                }
                if (!y(rVar, hVar)) {
                    if (!(rVar.A0().f9612a ? ((Boolean) hVar.f(rVar)).booleanValue() : false)) {
                        return false;
                    }
                }
                return true;
            }
        }
        return y(rVar, hVar);
    }

    public static final boolean b(y0.d dVar, y0.d dVar2, y0.d dVar3, int i7) {
        float f9;
        float f10;
        boolean c4 = c(i7, dVar3, dVar);
        float f11 = dVar3.f9781b;
        float f12 = dVar3.f9783d;
        float f13 = dVar3.f9780a;
        float f14 = dVar3.f9782c;
        float f15 = dVar.f9783d;
        float f16 = dVar.f9781b;
        float f17 = dVar.f9782c;
        float f18 = dVar.f9780a;
        if (c4 || !c(i7, dVar2, dVar)) {
            return false;
        }
        if (i7 == 3) {
            if (f18 < f14) {
                return true;
            }
        } else if (i7 == 4) {
            if (f17 > f13) {
                return true;
            }
        } else if (i7 == 5) {
            if (f16 < f12) {
                return true;
            }
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (f15 > f11) {
                return true;
            }
        }
        if (i7 == 3 || i7 == 4) {
            return true;
        }
        if (i7 == 3) {
            f9 = f18 - dVar2.f9782c;
        } else if (i7 == 4) {
            f9 = dVar2.f9780a - f17;
        } else if (i7 == 5) {
            f9 = f16 - dVar2.f9783d;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f9 = dVar2.f9781b - f15;
        }
        float max = Math.max(0.0f, f9);
        if (i7 == 3) {
            f10 = f18 - f13;
        } else if (i7 == 4) {
            f10 = f14 - f17;
        } else if (i7 == 5) {
            f10 = f16 - f11;
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            f10 = f12 - f15;
        }
        return max < Math.max(1.0f, f10);
    }

    public static final boolean c(int i7, y0.d dVar, y0.d dVar2) {
        if (i7 == 3 || i7 == 4) {
            return dVar.f9783d > dVar2.f9781b && dVar.f9781b < dVar2.f9783d;
        }
        if (i7 == 5 || i7 == 6) {
            return dVar.f9782c > dVar2.f9780a && dVar.f9780a < dVar2.f9782c;
        }
        throw new IllegalStateException("This function should only be used for 2-D focus search");
    }

    public static final y0.d d(View view) {
        int[] iArr = f9596a;
        view.getLocationInWindow(iArr);
        float f9 = iArr[0];
        return new y0.d(f9, iArr[1], view.getWidth() + f9, iArr[1] + view.getHeight());
    }

    public static final boolean e(r rVar, boolean z8) {
        int ordinal = rVar.B0().ordinal();
        q qVar = q.f9630h;
        if (ordinal == 0) {
            rVar.F0(qVar);
            A(rVar);
            return true;
        }
        if (ordinal == 1) {
            r n8 = n(rVar);
            if (!(n8 != null ? e(n8, z8) : true)) {
                return false;
            }
            rVar.F0(qVar);
            A(rVar);
            return true;
        }
        if (ordinal != 2) {
            if (ordinal == 3) {
                return true;
            }
            throw new b4.c();
        }
        if (z8) {
            rVar.F0(qVar);
            A(rVar);
        }
        return z8;
    }

    public static final void f(r rVar, i0.d dVar) {
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        i0.d dVar2 = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            r1.f.b(dVar2, nVar);
        } else {
            dVar2.b(nVar2);
        }
        while (dVar2.m()) {
            s0.n nVar3 = (s0.n) dVar2.o(dVar2.f4842h - 1);
            if ((nVar3.f8107i & 1024) == 0) {
                r1.f.b(dVar2, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f8106h & 1024) != 0) {
                        i0.d dVar3 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof r) {
                                r rVar2 = (r) nVar3;
                                if (rVar2.f8116r && !r1.f.t(rVar2).I) {
                                    if (rVar2.A0().f9612a) {
                                        dVar.b(rVar2);
                                    } else {
                                        f(rVar2, dVar);
                                    }
                                }
                            } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                int i7 = 0;
                                for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar3.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar3.b(nVar4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            nVar3 = r1.f.f(dVar3);
                        }
                    } else {
                        nVar3 = nVar3.f8109k;
                    }
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:69:0x0036, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r g(r rVar) {
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s0.n nVar = rVar.f8104f;
                if (!nVar.f8116r) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                i0.d dVar = new i0.d(new s0.n[16]);
                s0.n nVar2 = nVar.f8109k;
                if (nVar2 == null) {
                    r1.f.b(dVar, nVar);
                } else {
                    dVar.b(nVar2);
                }
                while (dVar.m()) {
                    s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
                    if ((nVar3.f8107i & 1024) == 0) {
                        r1.f.b(dVar, nVar3);
                    } else {
                        while (true) {
                            if (nVar3 == null) {
                                break;
                            }
                            if ((nVar3.f8106h & 1024) != 0) {
                                i0.d dVar2 = null;
                                while (nVar3 != null) {
                                    if (nVar3 instanceof r) {
                                        r g9 = g((r) nVar3);
                                        if (g9 != null) {
                                            return g9;
                                        }
                                    } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                        int i7 = 0;
                                        for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                            if ((nVar4.f8106h & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    nVar3 = nVar4;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new i0.d(new s0.n[16]);
                                                    }
                                                    if (nVar3 != null) {
                                                        dVar2.b(nVar3);
                                                        nVar3 = null;
                                                    }
                                                    dVar2.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    nVar3 = r1.f.f(dVar2);
                                }
                            } else {
                                nVar3 = nVar3.f8109k;
                            }
                        }
                    }
                }
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new b4.c();
                }
            }
            return null;
        }
        return rVar;
    }

    public static final r h(i0.d dVar, y0.d dVar2, int i7) {
        y0.d g9;
        if (i7 == 3) {
            g9 = dVar2.g(dVar2.c() + 1, 0.0f);
        } else if (i7 == 4) {
            g9 = dVar2.g(-(dVar2.c() + 1), 0.0f);
        } else if (i7 == 5) {
            g9 = dVar2.g(0.0f, dVar2.b() + 1);
        } else {
            if (i7 != 6) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            g9 = dVar2.g(0.0f, -(dVar2.b() + 1));
        }
        int i8 = dVar.f4842h;
        r rVar = null;
        if (i8 > 0) {
            Object[] objArr = dVar.f4840f;
            int i9 = 0;
            do {
                r rVar2 = (r) objArr[i9];
                if (t(rVar2)) {
                    y0.d j8 = j(rVar2);
                    if (r(i7, j8, dVar2) && (!r(i7, g9, dVar2) || b(dVar2, j8, g9, i7) || (!b(dVar2, g9, j8, i7) && s(i7, dVar2, j8) < s(i7, dVar2, g9)))) {
                        rVar = rVar2;
                        g9 = j8;
                    }
                }
                i9++;
            } while (i9 < i8);
        }
        return rVar;
    }

    public static final boolean i(r rVar, int i7, q6.c cVar) {
        y0.d dVar;
        i0.d dVar2 = new i0.d(new r[16]);
        f(rVar, dVar2);
        if (dVar2.f4842h <= 1) {
            r rVar2 = (r) (dVar2.l() ? null : dVar2.f4840f[0]);
            if (rVar2 != null) {
                return ((Boolean) cVar.f(rVar2)).booleanValue();
            }
        } else {
            if (i7 == 7) {
                i7 = 4;
            }
            if (i7 == 4 || i7 == 6) {
                y0.d j8 = j(rVar);
                float f9 = j8.f9780a;
                float f10 = j8.f9781b;
                dVar = new y0.d(f9, f10, f9, f10);
            } else {
                if (i7 != 3 && i7 != 5) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                y0.d j9 = j(rVar);
                float f11 = j9.f9782c;
                float f12 = j9.f9783d;
                dVar = new y0.d(f11, f12, f11, f12);
            }
            r h3 = h(dVar2, dVar, i7);
            if (h3 != null) {
                return ((Boolean) cVar.f(h3)).booleanValue();
            }
        }
        return false;
    }

    public static final y0.d j(r rVar) {
        a1 a1Var = rVar.f8111m;
        return a1Var != null ? p1.s0.f(a1Var).h(a1Var, false) : y0.d.f9779e;
    }

    public static final boolean k(r rVar, c.h hVar) {
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 != null) {
                    return k(n8, hVar) || m(rVar, n8, 1, hVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return rVar.A0().f9612a ? ((Boolean) hVar.f(rVar)).booleanValue() : z(rVar, hVar);
                }
                throw new b4.c();
            }
        }
        return z(rVar, hVar);
    }

    public static final boolean l(int i7, c.h hVar, r rVar, y0.d dVar) {
        if (G(i7, hVar, rVar, dVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(rVar, i7, new d0.e(rVar, dVar, i7, hVar, 6));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(r rVar, r rVar2, int i7, c.h hVar) {
        if (H(rVar, rVar2, i7, hVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(rVar, i7, new d0.e(rVar, rVar2, i7, hVar, 5));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:66:0x001f, code lost:
    
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final r n(r rVar) {
        int ordinal;
        s0.n nVar = rVar.f8104f;
        boolean z8 = nVar.f8116r;
        if (z8) {
            if (!z8) {
                throw new IllegalStateException("visitChildren called on an unattached node");
            }
            i0.d dVar = new i0.d(new s0.n[16]);
            s0.n nVar2 = nVar.f8109k;
            if (nVar2 == null) {
                r1.f.b(dVar, nVar);
            } else {
                dVar.b(nVar2);
            }
            while (dVar.m()) {
                s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
                if ((nVar3.f8107i & 1024) == 0) {
                    r1.f.b(dVar, nVar3);
                } else {
                    while (true) {
                        if (nVar3 == null) {
                            break;
                        }
                        if ((nVar3.f8106h & 1024) != 0) {
                            i0.d dVar2 = null;
                            while (nVar3 != null) {
                                if (nVar3 instanceof r) {
                                    r rVar2 = (r) nVar3;
                                    if (rVar2.f8104f.f8116r && ((ordinal = rVar2.B0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                        return rVar2;
                                    }
                                } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                    int i7 = 0;
                                    for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                        if ((nVar4.f8106h & 1024) != 0) {
                                            i7++;
                                            if (i7 == 1) {
                                                nVar3 = nVar4;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new i0.d(new s0.n[16]);
                                                }
                                                if (nVar3 != null) {
                                                    dVar2.b(nVar3);
                                                    nVar3 = null;
                                                }
                                                dVar2.b(nVar4);
                                            }
                                        }
                                    }
                                    if (i7 == 1) {
                                    }
                                }
                                nVar3 = r1.f.f(dVar2);
                            }
                        } else {
                            nVar3 = nVar3.f8109k;
                        }
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
    public static final q o(c cVar) {
        q B0;
        s0.n nVar = (s0.n) cVar;
        s0.n nVar2 = nVar.f8104f;
        i0.d dVar = null;
        while (true) {
            int i7 = 0;
            if (nVar2 == null) {
                s0.n nVar3 = nVar.f8104f;
                if (!nVar3.f8116r) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                i0.d dVar2 = new i0.d(new s0.n[16]);
                s0.n nVar4 = nVar3.f8109k;
                if (nVar4 == null) {
                    r1.f.b(dVar2, nVar3);
                } else {
                    dVar2.b(nVar4);
                }
                while (dVar2.m()) {
                    s0.n nVar5 = (s0.n) dVar2.o(dVar2.f4842h - 1);
                    if ((nVar5.f8107i & 1024) == 0) {
                        r1.f.b(dVar2, nVar5);
                    } else {
                        while (true) {
                            if (nVar5 == null) {
                                break;
                            }
                            if ((nVar5.f8106h & 1024) != 0) {
                                i0.d dVar3 = null;
                                while (nVar5 != null) {
                                    if (nVar5 instanceof r) {
                                        q B02 = ((r) nVar5).B0();
                                        int ordinal = B02.ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return B02;
                                        }
                                    } else if ((nVar5.f8106h & 1024) != 0 && (nVar5 instanceof r1.m)) {
                                        int i8 = 0;
                                        for (s0.n nVar6 = ((r1.m) nVar5).f7853t; nVar6 != null; nVar6 = nVar6.f8109k) {
                                            if ((nVar6.f8106h & 1024) != 0) {
                                                i8++;
                                                if (i8 == 1) {
                                                    nVar5 = nVar6;
                                                } else {
                                                    if (dVar3 == null) {
                                                        dVar3 = new i0.d(new s0.n[16]);
                                                    }
                                                    if (nVar5 != null) {
                                                        dVar3.b(nVar5);
                                                        nVar5 = null;
                                                    }
                                                    dVar3.b(nVar6);
                                                }
                                            }
                                        }
                                        if (i8 == 1) {
                                        }
                                    }
                                    nVar5 = r1.f.f(dVar3);
                                }
                            } else {
                                nVar5 = nVar5.f8109k;
                            }
                        }
                    }
                }
                return q.f9630h;
            }
            if (nVar2 instanceof r) {
                B0 = ((r) nVar2).B0();
                int ordinal2 = B0.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    break;
                }
            } else if ((nVar2.f8106h & 1024) != 0 && (nVar2 instanceof r1.m)) {
                for (s0.n nVar7 = ((r1.m) nVar2).f7853t; nVar7 != null; nVar7 = nVar7.f8109k) {
                    if ((nVar7.f8106h & 1024) != 0) {
                        i7++;
                        if (i7 == 1) {
                            nVar2 = nVar7;
                        } else {
                            if (dVar == null) {
                                dVar = new i0.d(new s0.n[16]);
                            }
                            if (nVar2 != null) {
                                dVar.b(nVar2);
                                nVar2 = null;
                            }
                            dVar.b(nVar7);
                        }
                    }
                }
                if (i7 == 1) {
                }
            }
            nVar2 = r1.f.f(dVar);
        }
        return B0;
    }

    public static final void p(r rVar) {
        r1.f.q(rVar, new s(rVar, 0));
        int ordinal = rVar.B0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            rVar.F0(q.f9628f);
        }
    }

    public static final void q(r rVar) {
        e eVar = ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(rVar)).getFocusOwner()).f717g;
        eVar.b(eVar.f9599c, rVar);
    }

    public static final boolean r(int i7, y0.d dVar, y0.d dVar2) {
        float f9 = dVar.f9781b;
        float f10 = dVar.f9783d;
        float f11 = dVar.f9780a;
        float f12 = dVar.f9782c;
        if (i7 == 3) {
            float f13 = dVar2.f9782c;
            float f14 = dVar2.f9780a;
            return (f13 > f12 || f14 >= f12) && f14 > f11;
        }
        if (i7 == 4) {
            float f15 = dVar2.f9780a;
            float f16 = dVar2.f9782c;
            return (f15 < f11 || f16 <= f11) && f16 < f12;
        }
        if (i7 == 5) {
            float f17 = dVar2.f9783d;
            float f18 = dVar2.f9781b;
            return (f17 > f10 || f18 >= f10) && f18 > f9;
        }
        if (i7 != 6) {
            throw new IllegalStateException("This function should only be used for 2-D focus search");
        }
        float f19 = dVar2.f9781b;
        float f20 = dVar2.f9783d;
        return (f19 < f9 || f20 <= f9) && f20 < f10;
    }

    public static final long s(int i7, y0.d dVar, y0.d dVar2) {
        float f9;
        float f10;
        float f11;
        float b9;
        float b10;
        float f12 = dVar2.f9781b;
        float f13 = dVar2.f9780a;
        if (i7 != 3) {
            if (i7 == 4) {
                f9 = f13 - dVar.f9782c;
            } else if (i7 == 5) {
                f10 = dVar.f9781b;
                f11 = dVar2.f9783d;
            } else {
                if (i7 != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f9 = f12 - dVar.f9783d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f9));
            if (i7 == 3 || i7 == 4) {
                float f14 = 2;
                b9 = (dVar.b() / f14) + dVar.f9781b;
                b10 = (dVar2.b() / f14) + f12;
            } else {
                if (i7 != 5 && i7 != 6) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f15 = 2;
                b9 = (dVar.c() / f15) + dVar.f9780a;
                b10 = (dVar2.c() / f15) + f13;
            }
            long abs2 = (long) Math.abs(b9 - b10);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f10 = dVar.f9780a;
        f11 = dVar2.f9782c;
        f9 = f10 - f11;
        long abs3 = (long) Math.abs(Math.max(0.0f, f9));
        if (i7 == 3) {
            if (i7 != 5) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            float f152 = 2;
            b9 = (dVar.c() / f152) + dVar.f9780a;
            b10 = (dVar2.c() / f152) + f13;
            long abs22 = (long) Math.abs(b9 - b10);
            return (abs22 * abs22) + (13 * abs3 * abs3);
        }
        float f142 = 2;
        b9 = (dVar.b() / f142) + dVar.f9781b;
        b10 = (dVar2.b() / f142) + f12;
        long abs222 = (long) Math.abs(b9 - b10);
        return (abs222 * abs222) + (13 * abs3 * abs3);
    }

    public static final boolean t(r rVar) {
        d0 d0Var;
        a1 a1Var;
        d0 d0Var2;
        a1 a1Var2 = rVar.f8111m;
        return (a1Var2 == null || (d0Var = a1Var2.f7700q) == null || !d0Var.F() || (a1Var = rVar.f8111m) == null || (d0Var2 = a1Var.f7700q) == null || !d0Var2.E()) ? false : true;
    }

    public static final int u(r rVar) {
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 == null) {
                    throw new IllegalArgumentException("ActiveParent with no focused child");
                }
                int u8 = u(n8);
                if (u8 == 1) {
                    u8 = 0;
                }
                if (u8 != 0) {
                    return u8;
                }
                if (!rVar.f9632s) {
                    rVar.f9632s = true;
                    try {
                        rVar.A0().f9622k.getClass();
                        n nVar = n.f9624b;
                        return 1;
                    } finally {
                        rVar.f9632s = false;
                    }
                }
            } else {
                if (ordinal == 2) {
                    return 2;
                }
                if (ordinal != 3) {
                    throw new b4.c();
                }
            }
        }
        return 1;
    }

    public static final void v(r rVar) {
        if (rVar.f9633t) {
            return;
        }
        rVar.f9633t = true;
        try {
            rVar.A0().f9621j.getClass();
            n nVar = n.f9624b;
        } finally {
            rVar.f9633t = false;
        }
    }

    public static final int w(r rVar) {
        s0.n nVar;
        g0.t tVar;
        int ordinal = rVar.B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 != null) {
                    return u(n8);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new b4.c();
                }
                s0.n nVar2 = rVar.f8104f;
                if (!nVar2.f8116r) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                s0.n nVar3 = nVar2.f8108j;
                d0 t2 = r1.f.t(rVar);
                loop0: while (true) {
                    nVar = null;
                    if (t2 == null) {
                        break;
                    }
                    if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f8106h & 1024) != 0) {
                                s0.n nVar4 = nVar3;
                                i0.d dVar = null;
                                while (nVar4 != null) {
                                    if (nVar4 instanceof r) {
                                        nVar = nVar4;
                                        break loop0;
                                    }
                                    if ((nVar4.f8106h & 1024) != 0 && (nVar4 instanceof r1.m)) {
                                        int i7 = 0;
                                        for (s0.n nVar5 = ((r1.m) nVar4).f7853t; nVar5 != null; nVar5 = nVar5.f8109k) {
                                            if ((nVar5.f8106h & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    nVar4 = nVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new i0.d(new s0.n[16]);
                                                    }
                                                    if (nVar4 != null) {
                                                        dVar.b(nVar4);
                                                        nVar4 = null;
                                                    }
                                                    dVar.b(nVar5);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    nVar4 = r1.f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f8108j;
                        }
                    }
                    t2 = t2.s();
                    nVar3 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
                }
                r rVar2 = (r) nVar;
                if (rVar2 != null) {
                    int ordinal2 = rVar2.B0().ordinal();
                    if (ordinal2 == 0) {
                        v(rVar2);
                        return 1;
                    }
                    if (ordinal2 == 1) {
                        return w(rVar2);
                    }
                    if (ordinal2 == 2) {
                        return 2;
                    }
                    if (ordinal2 != 3) {
                        throw new b4.c();
                    }
                    int w4 = w(rVar2);
                    int i8 = w4 != 1 ? w4 : 0;
                    if (i8 != 0) {
                        return i8;
                    }
                    v(rVar2);
                    return 1;
                }
            }
        }
        return 1;
    }

    public static final boolean x(r rVar) {
        s0.n nVar;
        g0.t tVar;
        int ordinal = rVar.B0().ordinal();
        boolean z8 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                r n8 = n(rVar);
                if (n8 != null ? e(n8, false) : true) {
                    p(rVar);
                }
                z8 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new b4.c();
                }
                s0.n nVar2 = rVar.f8104f;
                if (!nVar2.f8116r) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                s0.n nVar3 = nVar2.f8108j;
                d0 t2 = r1.f.t(rVar);
                loop0: while (true) {
                    if (t2 == null) {
                        nVar = null;
                        break;
                    }
                    if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                        while (nVar3 != null) {
                            if ((nVar3.f8106h & 1024) != 0) {
                                nVar = nVar3;
                                i0.d dVar = null;
                                while (nVar != null) {
                                    if (nVar instanceof r) {
                                        break loop0;
                                    }
                                    if ((nVar.f8106h & 1024) != 0 && (nVar instanceof r1.m)) {
                                        int i7 = 0;
                                        for (s0.n nVar4 = ((r1.m) nVar).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                            if ((nVar4.f8106h & 1024) != 0) {
                                                i7++;
                                                if (i7 == 1) {
                                                    nVar = nVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new i0.d(new s0.n[16]);
                                                    }
                                                    if (nVar != null) {
                                                        dVar.b(nVar);
                                                        nVar = null;
                                                    }
                                                    dVar.b(nVar4);
                                                }
                                            }
                                        }
                                        if (i7 == 1) {
                                        }
                                    }
                                    nVar = r1.f.f(dVar);
                                }
                            }
                            nVar3 = nVar3.f8108j;
                        }
                    }
                    t2 = t2.s();
                    nVar3 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
                }
                r rVar2 = (r) nVar;
                if (rVar2 != null) {
                    q B0 = rVar2.B0();
                    z8 = C(rVar2, rVar);
                    if (z8 && B0 != rVar2.B0()) {
                        A(rVar2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(rVar)).getFocusOwner()).f711a.d(null, null)).booleanValue()) {
                        p(rVar);
                    }
                    z8 = false;
                }
            }
        }
        if (z8) {
            A(rVar);
        }
        return z8;
    }

    public static final boolean y(r rVar, c.h hVar) {
        Object[] objArr = new r[16];
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            r1.f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i7 = 0;
        while (dVar.m()) {
            s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar3.f8107i & 1024) == 0) {
                r1.f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f8106h & 1024) != 0) {
                        i0.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof r) {
                                r rVar2 = (r) nVar3;
                                int i8 = i7 + 1;
                                if (objArr.length < i8) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i8, objArr.length * 2));
                                    r6.k.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i7] = rVar2;
                                i7 = i8;
                            } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                int i9 = 0;
                                for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            nVar3 = r1.f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f8109k;
                    }
                }
            }
        }
        r6.k.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i7, t.f9637a);
        if (i7 > 0) {
            int i10 = i7 - 1;
            do {
                r rVar3 = (r) objArr[i10];
                if (t(rVar3) && a(rVar3, hVar)) {
                    return true;
                }
                i10--;
            } while (i10 >= 0);
        }
        return false;
    }

    public static final boolean z(r rVar, c.h hVar) {
        Object[] objArr = new r[16];
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            r1.f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        int i7 = 0;
        while (dVar.m()) {
            s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar3.f8107i & 1024) == 0) {
                r1.f.b(dVar, nVar3);
            } else {
                while (true) {
                    if (nVar3 == null) {
                        break;
                    }
                    if ((nVar3.f8106h & 1024) != 0) {
                        i0.d dVar2 = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof r) {
                                r rVar2 = (r) nVar3;
                                int i8 = i7 + 1;
                                if (objArr.length < i8) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i8, objArr.length * 2));
                                    r6.k.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i7] = rVar2;
                                i7 = i8;
                            } else if ((nVar3.f8106h & 1024) != 0 && (nVar3 instanceof r1.m)) {
                                int i9 = 0;
                                for (s0.n nVar4 = ((r1.m) nVar3).f7853t; nVar4 != null; nVar4 = nVar4.f8109k) {
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i9++;
                                        if (i9 == 1) {
                                            nVar3 = nVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar2.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar2.b(nVar4);
                                        }
                                    }
                                }
                                if (i9 == 1) {
                                }
                            }
                            nVar3 = r1.f.f(dVar2);
                        }
                    } else {
                        nVar3 = nVar3.f8109k;
                    }
                }
            }
        }
        r6.k.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i7, t.f9637a);
        if (i7 > 0) {
            int i10 = 0;
            do {
                r rVar3 = (r) objArr[i10];
                if (t(rVar3) && k(rVar3, hVar)) {
                    return true;
                }
                i10++;
            } while (i10 < i7);
        }
        return false;
    }
}
