package Z;

import I.C0120t;
import I.F;
import android.view.View;
import e2.C0380d;
import java.util.Arrays;
import m.AbstractC0600j;
import r0.AbstractC0833f;
import r0.M;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.D;
import t0.a0;
import t0.o0;
import u.C0941i;
import u.C0943k;
import u.C0944l;
import u.InterfaceC0945m;
import u0.C0997t;

/* loaded from: classes.dex */
public abstract class c {

    /* renamed from: a, reason: collision with root package name */
    public static final int[] f3415a = new int[2];

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
    public static final void A(q qVar) {
        C0120t c0120t;
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        D t3 = AbstractC0898f.t(qVar);
        U.k kVar2 = kVar;
        while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 5120) != 0) {
                while (kVar2 != null) {
                    int i3 = kVar2.f3305f;
                    if ((i3 & 5120) != 0) {
                        if (kVar2 != kVar && (i3 & 1024) != 0) {
                            return;
                        }
                        if ((i3 & 4096) != 0) {
                            AbstractC0905m abstractC0905m = kVar2;
                            ?? r4 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof b) {
                                    b bVar = (b) abstractC0905m;
                                    bVar.t(o(bVar));
                                } else if ((abstractC0905m.f3305f & 4096) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar3 = abstractC0905m.f7937r;
                                    int i4 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r4 = r4;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3305f & 4096) != 0) {
                                            i4++;
                                            r4 = r4;
                                            if (i4 == 1) {
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
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r4);
                            }
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
    }

    public static final boolean B(q qVar) {
        Boolean C = C(qVar, 7);
        if (C != null) {
            return C.booleanValue();
        }
        return false;
    }

    public static final Boolean C(q qVar, int i3) {
        Boolean valueOf;
        r E3 = E(qVar);
        s sVar = new s(qVar, 1);
        try {
            if (E3.f3453a) {
                r.a(E3);
            }
            E3.f3453a = true;
            ((K.d) E3.f3455c).b(sVar);
            int a3 = AbstractC0600j.a(w(qVar, i3));
            if (a3 != 0) {
                if (a3 != 1) {
                    if (a3 == 2) {
                        valueOf = Boolean.TRUE;
                    } else if (a3 != 3) {
                        throw new L1.f();
                    }
                }
                valueOf = null;
            } else {
                valueOf = Boolean.valueOf(x(qVar));
            }
            return valueOf;
        } finally {
            r.b(E3);
        }
    }

    public static final boolean D(q qVar, q qVar2) {
        U.k kVar;
        U.k kVar2;
        C0120t c0120t;
        C0120t c0120t2;
        U.k kVar3 = qVar2.f3303d;
        if (!kVar3.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar4 = kVar3.f3307h;
        D t3 = AbstractC0898f.t(qVar2);
        loop0: while (true) {
            if (t3 == null) {
                kVar = null;
                break;
            }
            if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                while (kVar4 != null) {
                    if ((kVar4.f3305f & 1024) != 0) {
                        kVar = kVar4;
                        K.d dVar = null;
                        while (kVar != null) {
                            if (kVar instanceof q) {
                                break loop0;
                            }
                            if ((kVar.f3305f & 1024) != 0 && (kVar instanceof AbstractC0905m)) {
                                int i3 = 0;
                                for (U.k kVar5 = ((AbstractC0905m) kVar).f7937r; kVar5 != null; kVar5 = kVar5.f3308i) {
                                    if ((kVar5.f3305f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar = kVar5;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.k[16]);
                                            }
                                            if (kVar != null) {
                                                dVar.b(kVar);
                                                kVar = null;
                                            }
                                            dVar.b(kVar5);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar = AbstractC0898f.f(dVar);
                        }
                    }
                    kVar4 = kVar4.f3307h;
                }
            }
            t3 = t3.q();
            kVar4 = (t3 == null || (c0120t2 = t3.f7735x) == null) ? null : (o0) c0120t2.f2355e;
        }
        if (!Z1.i.a(kVar, qVar)) {
            throw new IllegalStateException("Non child node cannot request focus.");
        }
        int ordinal = qVar.w0().ordinal();
        p pVar = p.f3447e;
        if (ordinal == 0) {
            p(qVar2);
            qVar.A0(pVar);
        } else if (ordinal != 1) {
            if (ordinal == 2) {
                return false;
            }
            if (ordinal != 3) {
                throw new L1.f();
            }
            U.k kVar6 = qVar.f3303d;
            if (!kVar6.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.k kVar7 = kVar6.f3307h;
            D t4 = AbstractC0898f.t(qVar);
            loop4: while (true) {
                if (t4 == null) {
                    kVar2 = null;
                    break;
                }
                if ((((U.k) t4.f7735x.f2356f).f3306g & 1024) != 0) {
                    while (kVar7 != null) {
                        if ((kVar7.f3305f & 1024) != 0) {
                            kVar2 = kVar7;
                            K.d dVar2 = null;
                            while (kVar2 != null) {
                                if (kVar2 instanceof q) {
                                    break loop4;
                                }
                                if ((kVar2.f3305f & 1024) != 0 && (kVar2 instanceof AbstractC0905m)) {
                                    int i4 = 0;
                                    for (U.k kVar8 = ((AbstractC0905m) kVar2).f7937r; kVar8 != null; kVar8 = kVar8.f3308i) {
                                        if ((kVar8.f3305f & 1024) != 0) {
                                            i4++;
                                            if (i4 == 1) {
                                                kVar2 = kVar8;
                                            } else {
                                                if (dVar2 == null) {
                                                    dVar2 = new K.d(new U.k[16]);
                                                }
                                                if (kVar2 != null) {
                                                    dVar2.b(kVar2);
                                                    kVar2 = null;
                                                }
                                                dVar2.b(kVar8);
                                            }
                                        }
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                kVar2 = AbstractC0898f.f(dVar2);
                            }
                        }
                        kVar7 = kVar7.f3307h;
                    }
                }
                t4 = t4.q();
                kVar7 = (t4 == null || (c0120t = t4.f7735x) == null) ? null : (o0) c0120t.f2355e;
            }
            q qVar3 = (q) kVar2;
            if (qVar3 != null || !((Boolean) ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(qVar)).getFocusOwner()).f3705a.g(null, null)).booleanValue()) {
                if (qVar3 == null || !D(qVar3, qVar)) {
                    return false;
                }
                boolean D = D(qVar, qVar2);
                if (qVar.w0() != pVar) {
                    throw new IllegalStateException("Deactivated node is focused");
                }
                if (!D) {
                    return D;
                }
                A(qVar3);
                return D;
            }
            p(qVar2);
            qVar.A0(pVar);
        } else {
            if (n(qVar) == null) {
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            q n3 = n(qVar);
            if (!(n3 != null ? e(n3, false, true) : true)) {
                return false;
            }
            p(qVar2);
        }
        return true;
    }

    public static final r E(q qVar) {
        return ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(qVar)).getFocusOwner()).f3710f;
    }

    public static final Object F(q qVar, int i3, Y1.c cVar) {
        int i4;
        Object obj;
        U.k kVar;
        InterfaceC0945m interfaceC0945m;
        C0120t c0120t;
        U.k kVar2 = qVar.f3303d;
        if (!kVar2.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar3 = kVar2.f3307h;
        D t3 = AbstractC0898f.t(qVar);
        loop0: while (true) {
            i4 = 1;
            obj = null;
            if (t3 == null) {
                kVar = null;
                break;
            }
            if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                while (kVar3 != null) {
                    if ((kVar3.f3305f & 1024) != 0) {
                        kVar = kVar3;
                        K.d dVar = null;
                        while (kVar != null) {
                            if (kVar instanceof q) {
                                break loop0;
                            }
                            if ((kVar.f3305f & 1024) != 0 && (kVar instanceof AbstractC0905m)) {
                                int i5 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar = kVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.k[16]);
                                            }
                                            if (kVar != null) {
                                                dVar.b(kVar);
                                                kVar = null;
                                            }
                                            dVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar = AbstractC0898f.f(dVar);
                        }
                    }
                    kVar3 = kVar3.f3307h;
                }
            }
            t3 = t3.q();
            kVar3 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        q qVar2 = (q) kVar;
        if (qVar2 != null) {
            s0.h hVar = AbstractC0833f.f7143a;
            if (Z1.i.a((C0944l) qVar2.e(hVar), (C0944l) qVar.e(hVar))) {
                return null;
            }
        }
        C0944l c0944l = (C0944l) qVar.e(AbstractC0833f.f7143a);
        if (c0944l == null) {
            return null;
        }
        int i6 = 5;
        if (!a.a(i3, 5)) {
            i6 = 6;
            if (!a.a(i3, 6)) {
                i6 = 3;
                if (!a.a(i3, 3)) {
                    i6 = 4;
                    if (!a.a(i3, 4)) {
                        if (a.a(i3, 1)) {
                            i4 = 2;
                        } else if (!a.a(i3, 2)) {
                            throw new IllegalStateException("Unsupported direction for beyond bounds layout");
                        }
                        interfaceC0945m = c0944l.f8075a;
                        if (interfaceC0945m.a() > 0 || !interfaceC0945m.d()) {
                            return cVar.j(C0944l.f8074f);
                        }
                        int b2 = c0944l.i(i4) ? interfaceC0945m.b() : interfaceC0945m.c();
                        Z1.t tVar = new Z1.t();
                        n0.f fVar = c0944l.f8076b;
                        fVar.getClass();
                        C0941i c0941i = new C0941i(b2, b2);
                        K.d dVar2 = fVar.f6213a;
                        dVar2.b(c0941i);
                        tVar.f3480d = c0941i;
                        while (obj == null && c0944l.h((C0941i) tVar.f3480d, i4)) {
                            C0941i c0941i2 = (C0941i) tVar.f3480d;
                            int i7 = c0941i2.f8069a;
                            boolean i8 = c0944l.i(i4);
                            int i9 = c0941i2.f8070b;
                            if (i8) {
                                i9++;
                            } else {
                                i7--;
                            }
                            C0941i c0941i3 = new C0941i(i7, i9);
                            dVar2.b(c0941i3);
                            dVar2.n((C0941i) tVar.f3480d);
                            tVar.f3480d = c0941i3;
                            interfaceC0945m.e();
                            obj = cVar.j(new C0943k(c0944l, tVar, i4));
                        }
                        dVar2.n((C0941i) tVar.f3480d);
                        interfaceC0945m.e();
                        return obj;
                    }
                }
            }
        }
        i4 = i6;
        interfaceC0945m = c0944l.f8075a;
        if (interfaceC0945m.a() > 0) {
        }
        return cVar.j(C0944l.f8074f);
    }

    public static final boolean G(int i3, R.h hVar, q qVar, a0.d dVar) {
        q h3;
        K.d dVar2 = new K.d(new q[16]);
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar3 = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            AbstractC0898f.b(dVar3, kVar);
        } else {
            dVar3.b(kVar2);
        }
        while (dVar3.m()) {
            U.k kVar3 = (U.k) dVar3.o(dVar3.f2642f - 1);
            if ((kVar3.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar3, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3305f & 1024) != 0) {
                        K.d dVar4 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.p) {
                                    dVar2.b(qVar2);
                                }
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i4 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i4++;
                                        if (i4 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar4 == null) {
                                                dVar4 = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar4.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar4.b(kVar4);
                                        }
                                    }
                                }
                                if (i4 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar4);
                        }
                    } else {
                        kVar3 = kVar3.f3308i;
                    }
                }
            }
        }
        while (dVar2.m() && (h3 = h(dVar2, dVar, i3)) != null) {
            if (h3.v0().f3431a) {
                return ((Boolean) hVar.j(h3)).booleanValue();
            }
            if (l(i3, hVar, h3, dVar)) {
                return true;
            }
            dVar2.n(h3);
        }
        return false;
    }

    public static final boolean H(q qVar, q qVar2, int i3, R.h hVar) {
        U.k kVar;
        C0120t c0120t;
        if (qVar.w0() != p.f3447e) {
            throw new IllegalStateException("This function should only be used within a parent that has focus.");
        }
        Object[] objArr = new q[16];
        U.k kVar2 = qVar.f3303d;
        if (!kVar2.p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar3 = kVar2.f3308i;
        if (kVar3 == null) {
            AbstractC0898f.b(dVar, kVar2);
        } else {
            dVar.b(kVar3);
        }
        int i4 = 0;
        while (dVar.m()) {
            U.k kVar4 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar4.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar, kVar4);
            } else {
                while (true) {
                    if (kVar4 == null) {
                        break;
                    }
                    if ((kVar4.f3305f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (kVar4 != null) {
                            if (kVar4 instanceof q) {
                                q qVar3 = (q) kVar4;
                                int i5 = i4 + 1;
                                if (objArr.length < i5) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i5, objArr.length * 2));
                                    Z1.i.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i4] = qVar3;
                                i4 = i5;
                            } else if ((kVar4.f3305f & 1024) != 0 && (kVar4 instanceof AbstractC0905m)) {
                                int i6 = 0;
                                for (U.k kVar5 = ((AbstractC0905m) kVar4).f7937r; kVar5 != null; kVar5 = kVar5.f3308i) {
                                    if ((kVar5.f3305f & 1024) != 0) {
                                        i6++;
                                        if (i6 == 1) {
                                            kVar4 = kVar5;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar4 != null) {
                                                dVar2.b(kVar4);
                                                kVar4 = null;
                                            }
                                            dVar2.b(kVar5);
                                        }
                                    }
                                }
                                if (i6 == 1) {
                                }
                            }
                            kVar4 = AbstractC0898f.f(dVar2);
                        }
                    } else {
                        kVar4 = kVar4.f3308i;
                    }
                }
            }
        }
        t tVar = t.f3458a;
        Z1.i.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i4, tVar);
        if (a.a(i3, 1)) {
            int i7 = new C0380d(0, i4 - 1, 1).f4769e;
            if (i7 >= 0) {
                boolean z3 = false;
                int i8 = 0;
                while (true) {
                    if (z3) {
                        q qVar4 = (q) objArr[i8];
                        if (t(qVar4) && k(qVar4, hVar)) {
                            return true;
                        }
                    }
                    if (Z1.i.a(objArr[i8], qVar2)) {
                        z3 = true;
                    }
                    if (i8 == i7) {
                        break;
                    }
                    i8++;
                }
            }
        } else {
            if (!a.a(i3, 2)) {
                throw new IllegalStateException("This function should only be used for 1-D focus search");
            }
            int i9 = new C0380d(0, i4 - 1, 1).f4769e;
            if (i9 >= 0) {
                boolean z4 = false;
                while (true) {
                    if (z4) {
                        q qVar5 = (q) objArr[i9];
                        if (t(qVar5) && a(qVar5, hVar)) {
                            return true;
                        }
                    }
                    if (Z1.i.a(objArr[i9], qVar2)) {
                        z4 = true;
                    }
                    if (i9 == 0) {
                        break;
                    }
                    i9--;
                }
            }
        }
        if (!a.a(i3, 1) && qVar.v0().f3431a) {
            U.k kVar6 = qVar.f3303d;
            if (!kVar6.p) {
                throw new IllegalStateException("visitAncestors called on an unattached node");
            }
            U.k kVar7 = kVar6.f3307h;
            D t3 = AbstractC0898f.t(qVar);
            loop5: while (true) {
                if (t3 == null) {
                    kVar = null;
                    break;
                }
                if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                    while (kVar7 != null) {
                        if ((kVar7.f3305f & 1024) != 0) {
                            U.k kVar8 = kVar7;
                            K.d dVar3 = null;
                            while (kVar8 != null) {
                                if (kVar8 instanceof q) {
                                    kVar = kVar8;
                                    break loop5;
                                }
                                if ((kVar8.f3305f & 1024) != 0 && (kVar8 instanceof AbstractC0905m)) {
                                    int i10 = 0;
                                    for (U.k kVar9 = ((AbstractC0905m) kVar8).f7937r; kVar9 != null; kVar9 = kVar9.f3308i) {
                                        if ((kVar9.f3305f & 1024) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                kVar8 = kVar9;
                                            } else {
                                                if (dVar3 == null) {
                                                    dVar3 = new K.d(new U.k[16]);
                                                }
                                                if (kVar8 != null) {
                                                    dVar3.b(kVar8);
                                                    kVar8 = null;
                                                }
                                                dVar3.b(kVar9);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar8 = AbstractC0898f.f(dVar3);
                            }
                        }
                        kVar7 = kVar7.f3307h;
                    }
                }
                t3 = t3.q();
                kVar7 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
            }
            if (kVar != null) {
                return ((Boolean) hVar.j(qVar)).booleanValue();
            }
        }
        return false;
    }

    public static final Integer I(int i3) {
        if (a.a(i3, 5)) {
            return 33;
        }
        if (a.a(i3, 6)) {
            return 130;
        }
        if (a.a(i3, 3)) {
            return 17;
        }
        if (a.a(i3, 4)) {
            return 66;
        }
        if (a.a(i3, 1)) {
            return 2;
        }
        return a.a(i3, 2) ? 1 : null;
    }

    public static final a J(int i3) {
        if (i3 == 1) {
            return new a(2);
        }
        if (i3 == 2) {
            return new a(1);
        }
        if (i3 == 17) {
            return new a(3);
        }
        if (i3 == 33) {
            return new a(5);
        }
        if (i3 == 66) {
            return new a(4);
        }
        if (i3 != 130) {
            return null;
        }
        return new a(6);
    }

    public static final Boolean K(int i3, R.h hVar, q qVar, a0.d dVar) {
        int ordinal = qVar.w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n3 = n(qVar);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n3.w0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 == 1) {
                        Boolean K3 = K(i3, hVar, n3, dVar);
                        if (!Z1.i.a(K3, Boolean.FALSE)) {
                            return K3;
                        }
                        if (dVar == null) {
                            if (n3.w0() != p.f3447e) {
                                throw new IllegalStateException("Searching for active node in inactive hierarchy");
                            }
                            q g3 = g(n3);
                            if (g3 == null) {
                                throw new IllegalStateException("ActiveParent must have a focusedChild");
                            }
                            dVar = j(g3);
                        }
                        return Boolean.valueOf(l(i3, hVar, qVar, dVar));
                    }
                    if (ordinal2 != 2) {
                        if (ordinal2 != 3) {
                            throw new L1.f();
                        }
                        throw new IllegalStateException("ActiveParent must have a focusedChild");
                    }
                }
                if (dVar == null) {
                    dVar = j(n3);
                }
                return Boolean.valueOf(l(i3, hVar, qVar, dVar));
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return qVar.v0().f3431a ? (Boolean) hVar.j(qVar) : dVar == null ? Boolean.valueOf(i(qVar, i3, hVar)) : Boolean.valueOf(G(i3, hVar, qVar, dVar));
                }
                throw new L1.f();
            }
        }
        return Boolean.valueOf(i(qVar, i3, hVar));
    }

    public static final boolean a(q qVar, R.h hVar) {
        int ordinal = qVar.w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n3 = n(qVar);
                if (n3 == null) {
                    throw new IllegalStateException("ActiveParent must have a focusedChild");
                }
                int ordinal2 = n3.w0().ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 != 2) {
                            if (ordinal2 != 3) {
                                throw new L1.f();
                            }
                            throw new IllegalStateException("ActiveParent must have a focusedChild");
                        }
                    } else if (!a(n3, hVar) && !m(qVar, n3, 2, hVar) && (!n3.v0().f3431a || !((Boolean) hVar.j(n3)).booleanValue())) {
                        return false;
                    }
                }
                return m(qVar, n3, 2, hVar);
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new L1.f();
                }
                if (!y(qVar, hVar)) {
                    if (!(qVar.v0().f3431a ? ((Boolean) hVar.j(qVar)).booleanValue() : false)) {
                        return false;
                    }
                }
            }
            return true;
        }
        return y(qVar, hVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x005b, code lost:
    
        if (Z.a.a(r19, 3) != false) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0061, code lost:
    
        if (Z.a.a(r19, 4) == false) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (Z.a.a(r19, 3) == false) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x006a, code lost:
    
        r1 = r0 - r17.f3493c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008d, code lost:
    
        r1 = java.lang.Math.max(0.0f, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0096, code lost:
    
        if (Z.a.a(r19, 3) == false) goto L46;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0098, code lost:
    
        r0 = r0 - r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00bc, code lost:
    
        if (r1 >= java.lang.Math.max(1.0f, r0)) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009e, code lost:
    
        if (Z.a.a(r19, 4) == false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a0, code lost:
    
        r0 = r2 - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x00a7, code lost:
    
        if (Z.a.a(r19, 5) == false) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
    
        r0 = r5 - r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        if (Z.a.a(r19, 6) == false) goto L59;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00b2, code lost:
    
        r0 = r13 - r15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00c7, code lost:
    
        throw new java.lang.IllegalStateException("This function should only be used for 2-D focus search");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x0073, code lost:
    
        if (Z.a.a(r19, 4) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0075, code lost:
    
        r1 = r17.f3491a - r7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x007d, code lost:
    
        if (Z.a.a(r19, 5) == false) goto L40;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x007f, code lost:
    
        r1 = r5 - r17.f3494d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0088, code lost:
    
        if (Z.a.a(r19, 6) == false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x008a, code lost:
    
        r1 = r17.f3492b - r15;
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
    public static final boolean b(a0.d dVar, a0.d dVar2, a0.d dVar3, int i3) {
        if (!c(i3, dVar3, dVar) && c(i3, dVar2, dVar)) {
            boolean a3 = a.a(i3, 3);
            float f3 = dVar3.f3492b;
            float f4 = dVar3.f3494d;
            float f5 = dVar3.f3491a;
            float f6 = dVar3.f3493c;
            float f7 = dVar.f3494d;
            float f8 = dVar.f3492b;
            float f9 = dVar.f3493c;
            float f10 = dVar.f3491a;
            if (!a3) {
                if (!a.a(i3, 4)) {
                    if (!a.a(i3, 5)) {
                        if (!a.a(i3, 6)) {
                            throw new IllegalStateException("This function should only be used for 2-D focus search");
                        }
                    }
                }
            }
        }
        return false;
    }

    public static final boolean c(int i3, a0.d dVar, a0.d dVar2) {
        if (a.a(i3, 3) ? true : a.a(i3, 4)) {
            if (dVar.f3494d > dVar2.f3492b && dVar.f3492b < dVar2.f3494d) {
                return true;
            }
        } else {
            if (!(a.a(i3, 5) ? true : a.a(i3, 6))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            if (dVar.f3493c > dVar2.f3491a && dVar.f3491a < dVar2.f3493c) {
                return true;
            }
        }
        return false;
    }

    public static final a0.d d(View view) {
        int[] iArr = f3415a;
        view.getLocationInWindow(iArr);
        float f3 = iArr[0];
        return new a0.d(f3, iArr[1], view.getWidth() + f3, iArr[1] + view.getHeight());
    }

    public static final boolean e(q qVar, boolean z3, boolean z4) {
        int ordinal = qVar.w0().ordinal();
        p pVar = p.f3448f;
        if (ordinal == 0) {
            qVar.A0(pVar);
            if (z4) {
                A(qVar);
            }
        } else if (ordinal == 1) {
            q n3 = n(qVar);
            if (!(n3 != null ? e(n3, z3, z4) : true)) {
                return false;
            }
            qVar.A0(pVar);
            if (z4) {
                A(qVar);
            }
        } else {
            if (ordinal == 2) {
                if (!z3) {
                    return z3;
                }
                qVar.A0(pVar);
                if (!z4) {
                    return z3;
                }
                A(qVar);
                return z3;
            }
            if (ordinal != 3) {
                throw new L1.f();
            }
        }
        return true;
    }

    public static final void f(q qVar, K.d dVar) {
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar2 = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            AbstractC0898f.b(dVar2, kVar);
        } else {
            dVar2.b(kVar2);
        }
        while (dVar2.m()) {
            U.k kVar3 = (U.k) dVar2.o(dVar2.f2642f - 1);
            if ((kVar3.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar2, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3305f & 1024) != 0) {
                        K.d dVar3 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.p && !AbstractC0898f.t(qVar2).f7713F) {
                                    if (qVar2.v0().f3431a) {
                                        dVar.b(qVar2);
                                    } else {
                                        f(qVar2, dVar);
                                    }
                                }
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i3 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar3 == null) {
                                                dVar3 = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar3.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar3.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar3);
                        }
                    } else {
                        kVar3 = kVar3.f3308i;
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
    public static final q g(q qVar) {
        int ordinal = qVar.w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                U.k kVar = qVar.f3303d;
                if (!kVar.p) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                K.d dVar = new K.d(new U.k[16]);
                U.k kVar2 = kVar.f3308i;
                if (kVar2 == null) {
                    AbstractC0898f.b(dVar, kVar);
                } else {
                    dVar.b(kVar2);
                }
                while (dVar.m()) {
                    U.k kVar3 = (U.k) dVar.o(dVar.f2642f - 1);
                    if ((kVar3.f3306g & 1024) == 0) {
                        AbstractC0898f.b(dVar, kVar3);
                    } else {
                        while (true) {
                            if (kVar3 == null) {
                                break;
                            }
                            if ((kVar3.f3305f & 1024) != 0) {
                                K.d dVar2 = null;
                                while (kVar3 != null) {
                                    if (kVar3 instanceof q) {
                                        q g3 = g((q) kVar3);
                                        if (g3 != null) {
                                            return g3;
                                        }
                                    } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                        int i3 = 0;
                                        for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                            if ((kVar4.f3305f & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar3 = kVar4;
                                                } else {
                                                    if (dVar2 == null) {
                                                        dVar2 = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar3 != null) {
                                                        dVar2.b(kVar3);
                                                        kVar3 = null;
                                                    }
                                                    dVar2.b(kVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar3 = AbstractC0898f.f(dVar2);
                                }
                            } else {
                                kVar3 = kVar3.f3308i;
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
                throw new L1.f();
            }
        }
        return qVar;
    }

    public static final q h(K.d dVar, a0.d dVar2, int i3) {
        a0.d d3;
        if (a.a(i3, 3)) {
            d3 = dVar2.d(dVar2.c() + 1, 0.0f);
        } else if (a.a(i3, 4)) {
            d3 = dVar2.d(-(dVar2.c() + 1), 0.0f);
        } else if (a.a(i3, 5)) {
            d3 = dVar2.d(0.0f, dVar2.b() + 1);
        } else {
            if (!a.a(i3, 6)) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            d3 = dVar2.d(0.0f, -(dVar2.b() + 1));
        }
        int i4 = dVar.f2642f;
        q qVar = null;
        if (i4 > 0) {
            Object[] objArr = dVar.f2640d;
            int i5 = 0;
            do {
                q qVar2 = (q) objArr[i5];
                if (t(qVar2)) {
                    a0.d j3 = j(qVar2);
                    if (r(i3, j3, dVar2) && (!r(i3, d3, dVar2) || b(dVar2, j3, d3, i3) || (!b(dVar2, d3, j3, i3) && s(i3, dVar2, j3) < s(i3, dVar2, d3)))) {
                        qVar = qVar2;
                        d3 = j3;
                    }
                }
                i5++;
            } while (i5 < i4);
        }
        return qVar;
    }

    public static final boolean i(q qVar, int i3, Y1.c cVar) {
        a0.d dVar;
        K.d dVar2 = new K.d(new q[16]);
        f(qVar, dVar2);
        if (dVar2.f2642f <= 1) {
            q qVar2 = (q) (dVar2.l() ? null : dVar2.f2640d[0]);
            if (qVar2 != null) {
                return ((Boolean) cVar.j(qVar2)).booleanValue();
            }
            return false;
        }
        if (a.a(i3, 7)) {
            i3 = 4;
        }
        if (a.a(i3, 4) ? true : a.a(i3, 6)) {
            a0.d j3 = j(qVar);
            float f3 = j3.f3492b;
            float f4 = j3.f3491a;
            dVar = new a0.d(f4, f3, f4, f3);
        } else {
            if (!(a.a(i3, 3) ? true : a.a(i3, 5))) {
                throw new IllegalStateException("This function should only be used for 2-D focus search");
            }
            a0.d j4 = j(qVar);
            float f5 = j4.f3494d;
            float f6 = j4.f3493c;
            dVar = new a0.d(f6, f5, f6, f5);
        }
        q h3 = h(dVar2, dVar, i3);
        if (h3 != null) {
            return ((Boolean) cVar.j(h3)).booleanValue();
        }
        return false;
    }

    public static final a0.d j(q qVar) {
        a0 a0Var = qVar.f3310k;
        return a0Var != null ? M.g(a0Var).u(a0Var, false) : a0.d.f3490e;
    }

    public static final boolean k(q qVar, R.h hVar) {
        int ordinal = qVar.w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n3 = n(qVar);
                if (n3 != null) {
                    return k(n3, hVar) || m(qVar, n3, 1, hVar);
                }
                throw new IllegalStateException("ActiveParent must have a focusedChild");
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return qVar.v0().f3431a ? ((Boolean) hVar.j(qVar)).booleanValue() : z(qVar, hVar);
                }
                throw new L1.f();
            }
        }
        return z(qVar, hVar);
    }

    public static final boolean l(int i3, R.h hVar, q qVar, a0.d dVar) {
        if (G(i3, hVar, qVar, dVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(qVar, i3, new F(qVar, dVar, i3, hVar, 2));
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final boolean m(q qVar, q qVar2, int i3, R.h hVar) {
        if (H(qVar, qVar2, i3, hVar)) {
            return true;
        }
        Boolean bool = (Boolean) F(qVar, i3, new F(qVar, qVar2, i3, hVar, 1));
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
    public static final q n(q qVar) {
        int ordinal;
        U.k kVar = qVar.f3303d;
        boolean z3 = kVar.p;
        if (!z3) {
            return null;
        }
        if (!z3) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            AbstractC0898f.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        while (dVar.m()) {
            U.k kVar3 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar3.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3305f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.f3303d.p && ((ordinal = qVar2.w0().ordinal()) == 0 || ordinal == 1 || ordinal == 2)) {
                                    return qVar2;
                                }
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i3 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar2);
                        }
                    } else {
                        kVar3 = kVar3.f3308i;
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
    public static final p o(b bVar) {
        p w02;
        U.k kVar = (U.k) bVar;
        U.k kVar2 = kVar.f3303d;
        K.d dVar = null;
        while (true) {
            int i3 = 0;
            if (kVar2 == null) {
                U.k kVar3 = kVar.f3303d;
                if (!kVar3.p) {
                    throw new IllegalStateException("visitChildren called on an unattached node");
                }
                K.d dVar2 = new K.d(new U.k[16]);
                U.k kVar4 = kVar3.f3308i;
                if (kVar4 == null) {
                    AbstractC0898f.b(dVar2, kVar3);
                } else {
                    dVar2.b(kVar4);
                }
                while (dVar2.m()) {
                    U.k kVar5 = (U.k) dVar2.o(dVar2.f2642f - 1);
                    if ((kVar5.f3306g & 1024) == 0) {
                        AbstractC0898f.b(dVar2, kVar5);
                    } else {
                        while (true) {
                            if (kVar5 == null) {
                                break;
                            }
                            if ((kVar5.f3305f & 1024) != 0) {
                                K.d dVar3 = null;
                                while (kVar5 != null) {
                                    if (kVar5 instanceof q) {
                                        p w03 = ((q) kVar5).w0();
                                        int ordinal = w03.ordinal();
                                        if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                            return w03;
                                        }
                                    } else if ((kVar5.f3305f & 1024) != 0 && (kVar5 instanceof AbstractC0905m)) {
                                        int i4 = 0;
                                        for (U.k kVar6 = ((AbstractC0905m) kVar5).f7937r; kVar6 != null; kVar6 = kVar6.f3308i) {
                                            if ((kVar6.f3305f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    kVar5 = kVar6;
                                                } else {
                                                    if (dVar3 == null) {
                                                        dVar3 = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar5 != null) {
                                                        dVar3.b(kVar5);
                                                        kVar5 = null;
                                                    }
                                                    dVar3.b(kVar6);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    kVar5 = AbstractC0898f.f(dVar3);
                                }
                            } else {
                                kVar5 = kVar5.f3308i;
                            }
                        }
                    }
                }
                return p.f3448f;
            }
            if (kVar2 instanceof q) {
                w02 = ((q) kVar2).w0();
                int ordinal2 = w02.ordinal();
                if (ordinal2 == 0 || ordinal2 == 1 || ordinal2 == 2) {
                    break;
                }
            } else if ((kVar2.f3305f & 1024) != 0 && (kVar2 instanceof AbstractC0905m)) {
                for (U.k kVar7 = ((AbstractC0905m) kVar2).f7937r; kVar7 != null; kVar7 = kVar7.f3308i) {
                    if ((kVar7.f3305f & 1024) != 0) {
                        i3++;
                        if (i3 == 1) {
                            kVar2 = kVar7;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.k[16]);
                            }
                            if (kVar2 != null) {
                                dVar.b(kVar2);
                                kVar2 = null;
                            }
                            dVar.b(kVar7);
                        }
                    }
                }
                if (i3 == 1) {
                }
            }
            kVar2 = AbstractC0898f.f(dVar);
        }
        return w02;
    }

    public static final void p(q qVar) {
        AbstractC0898f.q(qVar, new s(qVar, 0));
        int ordinal = qVar.w0().ordinal();
        if (ordinal == 1 || ordinal == 3) {
            qVar.A0(p.f3446d);
        }
    }

    public static final void q(q qVar) {
        e eVar = ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(qVar)).getFocusOwner()).f3709e;
        eVar.b(eVar.f3419c, qVar);
    }

    public static final boolean r(int i3, a0.d dVar, a0.d dVar2) {
        boolean a3 = a.a(i3, 3);
        float f3 = dVar.f3491a;
        float f4 = dVar.f3493c;
        if (a3) {
            float f5 = dVar2.f3493c;
            float f6 = dVar2.f3491a;
            if ((f5 <= f4 && f6 < f4) || f6 <= f3) {
                return false;
            }
        } else if (a.a(i3, 4)) {
            float f7 = dVar2.f3491a;
            float f8 = dVar2.f3493c;
            if ((f7 >= f3 && f8 > f3) || f8 >= f4) {
                return false;
            }
        } else {
            boolean a4 = a.a(i3, 5);
            float f9 = dVar.f3492b;
            float f10 = dVar.f3494d;
            if (a4) {
                float f11 = dVar2.f3494d;
                float f12 = dVar2.f3492b;
                if ((f11 <= f10 && f12 < f10) || f12 <= f9) {
                    return false;
                }
            } else {
                if (!a.a(i3, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f13 = dVar2.f3492b;
                float f14 = dVar2.f3494d;
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
    public static final long s(int i3, a0.d dVar, a0.d dVar2) {
        float f3;
        float f4;
        float f5;
        float c3;
        float c4;
        boolean a3 = a.a(i3, 3);
        float f6 = dVar2.f3492b;
        float f7 = dVar2.f3491a;
        if (!a3) {
            if (a.a(i3, 4)) {
                f3 = f7 - dVar.f3493c;
            } else if (a.a(i3, 5)) {
                f4 = dVar.f3492b;
                f5 = dVar2.f3494d;
            } else {
                if (!a.a(i3, 6)) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                f3 = f6 - dVar.f3494d;
            }
            long abs = (long) Math.abs(Math.max(0.0f, f3));
            if (!a.a(i3, 3) ? true : a.a(i3, 4)) {
                if (!(a.a(i3, 5) ? true : a.a(i3, 6))) {
                    throw new IllegalStateException("This function should only be used for 2-D focus search");
                }
                float f8 = 2;
                c3 = (dVar.c() / f8) + dVar.f3491a;
                c4 = (dVar2.c() / f8) + f7;
            } else {
                float f9 = 2;
                c3 = (dVar.b() / f9) + dVar.f3492b;
                c4 = (dVar2.b() / f9) + f6;
            }
            long abs2 = (long) Math.abs(c3 - c4);
            return (abs2 * abs2) + (13 * abs * abs);
        }
        f4 = dVar.f3491a;
        f5 = dVar2.f3493c;
        f3 = f4 - f5;
        long abs3 = (long) Math.abs(Math.max(0.0f, f3));
        if (!a.a(i3, 3) ? true : a.a(i3, 4)) {
        }
        long abs22 = (long) Math.abs(c3 - c4);
        return (abs22 * abs22) + (13 * abs3 * abs3);
    }

    public static final boolean t(q qVar) {
        D d3;
        a0 a0Var;
        D d4;
        a0 a0Var2 = qVar.f3310k;
        return (a0Var2 == null || (d3 = a0Var2.f7877o) == null || !d3.C() || (a0Var = qVar.f3310k) == null || (d4 = a0Var.f7877o) == null || !d4.B()) ? false : true;
    }

    public static final int u(q qVar, int i3) {
        int ordinal = qVar.w0().ordinal();
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
            throw new L1.f();
        }
        q n3 = n(qVar);
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
        if (qVar.f3450q) {
            return 1;
        }
        qVar.f3450q = true;
        try {
            qVar.v0().f3441k.getClass();
            n nVar = n.f3443b;
            return 1;
        } finally {
            qVar.f3450q = false;
        }
    }

    public static final void v(q qVar) {
        if (qVar.f3451r) {
            return;
        }
        qVar.f3451r = true;
        try {
            qVar.v0().f3440j.getClass();
            n nVar = n.f3443b;
        } finally {
            qVar.f3451r = false;
        }
    }

    public static final int w(q qVar, int i3) {
        U.k kVar;
        C0120t c0120t;
        int ordinal = qVar.w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n3 = n(qVar);
                if (n3 != null) {
                    return u(n3, i3);
                }
                throw new IllegalArgumentException("ActiveParent with no focused child");
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new L1.f();
                }
                U.k kVar2 = qVar.f3303d;
                if (!kVar2.p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                U.k kVar3 = kVar2.f3307h;
                D t3 = AbstractC0898f.t(qVar);
                loop0: while (true) {
                    kVar = null;
                    if (t3 == null) {
                        break;
                    }
                    if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f3305f & 1024) != 0) {
                                U.k kVar4 = kVar3;
                                K.d dVar = null;
                                while (kVar4 != null) {
                                    if (kVar4 instanceof q) {
                                        kVar = kVar4;
                                        break loop0;
                                    }
                                    if ((kVar4.f3305f & 1024) != 0 && (kVar4 instanceof AbstractC0905m)) {
                                        int i4 = 0;
                                        for (U.k kVar5 = ((AbstractC0905m) kVar4).f7937r; kVar5 != null; kVar5 = kVar5.f3308i) {
                                            if ((kVar5.f3305f & 1024) != 0) {
                                                i4++;
                                                if (i4 == 1) {
                                                    kVar4 = kVar5;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar4 != null) {
                                                        dVar.b(kVar4);
                                                        kVar4 = null;
                                                    }
                                                    dVar.b(kVar5);
                                                }
                                            }
                                        }
                                        if (i4 == 1) {
                                        }
                                    }
                                    kVar4 = AbstractC0898f.f(dVar);
                                }
                            }
                            kVar3 = kVar3.f3307h;
                        }
                    }
                    t3 = t3.q();
                    kVar3 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
                }
                q qVar2 = (q) kVar;
                if (qVar2 == null) {
                    return 1;
                }
                int ordinal2 = qVar2.w0().ordinal();
                if (ordinal2 == 0) {
                    v(qVar2);
                    return 1;
                }
                if (ordinal2 == 1) {
                    return w(qVar2, i3);
                }
                if (ordinal2 == 2) {
                    return 2;
                }
                if (ordinal2 != 3) {
                    throw new L1.f();
                }
                int w3 = w(qVar2, i3);
                int i5 = w3 != 1 ? w3 : 0;
                if (i5 != 0) {
                    return i5;
                }
                v(qVar2);
                return 1;
            }
        }
        return 1;
    }

    public static final boolean x(q qVar) {
        U.k kVar;
        C0120t c0120t;
        int ordinal = qVar.w0().ordinal();
        boolean z3 = true;
        if (ordinal != 0) {
            if (ordinal == 1) {
                q n3 = n(qVar);
                if (n3 != null ? e(n3, false, true) : true) {
                    p(qVar);
                }
                z3 = false;
            } else if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new L1.f();
                }
                U.k kVar2 = qVar.f3303d;
                if (!kVar2.p) {
                    throw new IllegalStateException("visitAncestors called on an unattached node");
                }
                U.k kVar3 = kVar2.f3307h;
                D t3 = AbstractC0898f.t(qVar);
                loop0: while (true) {
                    if (t3 == null) {
                        kVar = null;
                        break;
                    }
                    if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                        while (kVar3 != null) {
                            if ((kVar3.f3305f & 1024) != 0) {
                                kVar = kVar3;
                                K.d dVar = null;
                                while (kVar != null) {
                                    if (kVar instanceof q) {
                                        break loop0;
                                    }
                                    if ((kVar.f3305f & 1024) != 0 && (kVar instanceof AbstractC0905m)) {
                                        int i3 = 0;
                                        for (U.k kVar4 = ((AbstractC0905m) kVar).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                            if ((kVar4.f3305f & 1024) != 0) {
                                                i3++;
                                                if (i3 == 1) {
                                                    kVar = kVar4;
                                                } else {
                                                    if (dVar == null) {
                                                        dVar = new K.d(new U.k[16]);
                                                    }
                                                    if (kVar != null) {
                                                        dVar.b(kVar);
                                                        kVar = null;
                                                    }
                                                    dVar.b(kVar4);
                                                }
                                            }
                                        }
                                        if (i3 == 1) {
                                        }
                                    }
                                    kVar = AbstractC0898f.f(dVar);
                                }
                            }
                            kVar3 = kVar3.f3307h;
                        }
                    }
                    t3 = t3.q();
                    kVar3 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
                }
                q qVar2 = (q) kVar;
                if (qVar2 != null) {
                    p w02 = qVar2.w0();
                    z3 = D(qVar2, qVar);
                    if (z3 && w02 != qVar2.w0()) {
                        A(qVar2);
                    }
                } else {
                    if (((Boolean) ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(qVar)).getFocusOwner()).f3705a.g(null, null)).booleanValue()) {
                        p(qVar);
                    }
                    z3 = false;
                }
            }
        }
        if (z3) {
            A(qVar);
        }
        return z3;
    }

    public static final boolean y(q qVar, R.h hVar) {
        Object[] objArr = new q[16];
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            AbstractC0898f.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        int i3 = 0;
        while (dVar.m()) {
            U.k kVar3 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar3.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3305f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    Z1.i.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = qVar2;
                                i3 = i4;
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i5 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar2);
                        }
                    } else {
                        kVar3 = kVar3.f3308i;
                    }
                }
            }
        }
        t tVar = t.f3458a;
        Z1.i.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, tVar);
        if (i3 > 0) {
            int i6 = i3 - 1;
            do {
                q qVar3 = (q) objArr[i6];
                if (t(qVar3) && a(qVar3, hVar)) {
                    return true;
                }
                i6--;
            } while (i6 >= 0);
        }
        return false;
    }

    public static final boolean z(q qVar, R.h hVar) {
        Object[] objArr = new q[16];
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitChildren called on an unattached node");
        }
        K.d dVar = new K.d(new U.k[16]);
        U.k kVar2 = kVar.f3308i;
        if (kVar2 == null) {
            AbstractC0898f.b(dVar, kVar);
        } else {
            dVar.b(kVar2);
        }
        int i3 = 0;
        while (dVar.m()) {
            U.k kVar3 = (U.k) dVar.o(dVar.f2642f - 1);
            if ((kVar3.f3306g & 1024) == 0) {
                AbstractC0898f.b(dVar, kVar3);
            } else {
                while (true) {
                    if (kVar3 == null) {
                        break;
                    }
                    if ((kVar3.f3305f & 1024) != 0) {
                        K.d dVar2 = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                int i4 = i3 + 1;
                                if (objArr.length < i4) {
                                    objArr = Arrays.copyOf(objArr, Math.max(i4, objArr.length * 2));
                                    Z1.i.e(objArr, "copyOf(this, newSize)");
                                }
                                objArr[i3] = qVar2;
                                i3 = i4;
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i5 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i5++;
                                        if (i5 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar2.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar2.b(kVar4);
                                        }
                                    }
                                }
                                if (i5 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar2);
                        }
                    } else {
                        kVar3 = kVar3.f3308i;
                    }
                }
            }
        }
        t tVar = t.f3458a;
        Z1.i.f(objArr, "<this>");
        Arrays.sort(objArr, 0, i3, tVar);
        if (i3 <= 0) {
            return false;
        }
        int i6 = 0;
        do {
            q qVar3 = (q) objArr[i6];
            if (t(qVar3) && k(qVar3, hVar)) {
                return true;
            }
            i6++;
        } while (i6 < i3);
        return false;
    }
}
