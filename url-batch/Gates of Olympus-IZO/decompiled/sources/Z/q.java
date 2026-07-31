package Z;

import I.C0120t;
import I.C0125v0;
import e2.AbstractC0381e;
import j.C0506x;
import t0.AbstractC0898f;
import t0.AbstractC0905m;
import t0.D;
import t0.InterfaceC0903k;
import t0.a0;
import t0.c0;
import t0.o0;
import u0.C0997t;

/* loaded from: classes.dex */
public final class q extends U.k implements InterfaceC0903k, c0, s0.e {

    /* renamed from: q, reason: collision with root package name */
    public boolean f3450q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3451r;

    /* renamed from: s, reason: collision with root package name */
    public p f3452s;

    public static final boolean x0(q qVar) {
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            AbstractC0381e.N("visitSubtreeIf called on an unattached node");
            throw null;
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
            if ((kVar3.f3306g & 1024) != 0) {
                for (U.k kVar4 = kVar3; kVar4 != null; kVar4 = kVar4.f3308i) {
                    if ((kVar4.f3305f & 1024) != 0) {
                        K.d dVar2 = null;
                        U.k kVar5 = kVar4;
                        while (kVar5 != null) {
                            if (kVar5 instanceof q) {
                                q qVar2 = (q) kVar5;
                                if (qVar2.f3452s != null) {
                                    int ordinal = qVar2.w0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal == 3) {
                                        return false;
                                    }
                                    throw new L1.f();
                                }
                            } else if ((kVar5.f3305f & 1024) != 0 && (kVar5 instanceof AbstractC0905m)) {
                                int i3 = 0;
                                for (U.k kVar6 = ((AbstractC0905m) kVar5).f7937r; kVar6 != null; kVar6 = kVar6.f3308i) {
                                    if ((kVar6.f3305f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar5 = kVar6;
                                        } else {
                                            if (dVar2 == null) {
                                                dVar2 = new K.d(new U.k[16]);
                                            }
                                            if (kVar5 != null) {
                                                dVar2.b(kVar5);
                                                kVar5 = null;
                                            }
                                            dVar2.b(kVar6);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar5 = AbstractC0898f.f(dVar2);
                        }
                    }
                }
            }
            AbstractC0898f.b(dVar, kVar3);
        }
        return false;
    }

    public static final boolean y0(q qVar) {
        C0120t c0120t;
        U.k kVar = qVar.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        U.k kVar2 = kVar.f3307h;
        D t3 = AbstractC0898f.t(qVar);
        while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 1024) != 0) {
                while (kVar2 != null) {
                    if ((kVar2.f3305f & 1024) != 0) {
                        U.k kVar3 = kVar2;
                        K.d dVar = null;
                        while (kVar3 != null) {
                            if (kVar3 instanceof q) {
                                q qVar2 = (q) kVar3;
                                if (qVar2.f3452s != null) {
                                    int ordinal = qVar2.w0().ordinal();
                                    if (ordinal == 0) {
                                        return false;
                                    }
                                    if (ordinal == 1) {
                                        return true;
                                    }
                                    if (ordinal == 2 || ordinal == 3) {
                                        return false;
                                    }
                                    throw new L1.f();
                                }
                            } else if ((kVar3.f3305f & 1024) != 0 && (kVar3 instanceof AbstractC0905m)) {
                                int i3 = 0;
                                for (U.k kVar4 = ((AbstractC0905m) kVar3).f7937r; kVar4 != null; kVar4 = kVar4.f3308i) {
                                    if ((kVar4.f3305f & 1024) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar3 = kVar4;
                                        } else {
                                            if (dVar == null) {
                                                dVar = new K.d(new U.k[16]);
                                            }
                                            if (kVar3 != null) {
                                                dVar.b(kVar3);
                                                kVar3 = null;
                                            }
                                            dVar.b(kVar4);
                                        }
                                    }
                                }
                                if (i3 == 1) {
                                }
                            }
                            kVar3 = AbstractC0898f.f(dVar);
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return false;
    }

    public final void A0(p pVar) {
        ((C0506x) c.E(this).f3454b).i(this, pVar);
    }

    @Override // t0.c0
    public final void d0() {
        p w02 = w0();
        z0();
        if (w02 != w0()) {
            c.A(this);
        }
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // U.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void o0() {
        int ordinal = w0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                r E3 = c.E(this);
                try {
                    if (E3.f3453a) {
                        r.a(E3);
                    }
                    E3.f3453a = true;
                    A0(p.f3448f);
                    r.b(E3);
                } catch (Throwable th) {
                    r.b(E3);
                    throw th;
                }
            }
            this.f3452s = null;
        }
        ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(this)).getFocusOwner()).a(8, true, false);
        c.q(this);
        this.f3452s = null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [U.k] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [U.k] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [K.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [K.d] */
    public final j v0() {
        C0120t c0120t;
        j jVar = new j();
        jVar.f3431a = true;
        n nVar = n.f3443b;
        jVar.f3432b = nVar;
        jVar.f3433c = nVar;
        jVar.f3434d = nVar;
        jVar.f3435e = nVar;
        jVar.f3436f = nVar;
        jVar.f3437g = nVar;
        jVar.f3438h = nVar;
        jVar.f3439i = nVar;
        jVar.f3440j = h.f3427g;
        jVar.f3441k = h.f3428h;
        U.k kVar = this.f3303d;
        if (!kVar.p) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        D t3 = AbstractC0898f.t(this);
        U.k kVar2 = kVar;
        loop0: while (t3 != null) {
            if ((((U.k) t3.f7735x.f2356f).f3306g & 3072) != 0) {
                while (kVar2 != null) {
                    int i3 = kVar2.f3305f;
                    if ((i3 & 3072) != 0) {
                        if (kVar2 != kVar && (i3 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i3 & 2048) != 0) {
                            AbstractC0905m abstractC0905m = kVar2;
                            ?? r7 = 0;
                            while (abstractC0905m != 0) {
                                if (abstractC0905m instanceof l) {
                                    ((l) abstractC0905m).e0(jVar);
                                } else if ((abstractC0905m.f3305f & 2048) != 0 && (abstractC0905m instanceof AbstractC0905m)) {
                                    U.k kVar3 = abstractC0905m.f7937r;
                                    int i4 = 0;
                                    abstractC0905m = abstractC0905m;
                                    r7 = r7;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3305f & 2048) != 0) {
                                            i4++;
                                            r7 = r7;
                                            if (i4 == 1) {
                                                abstractC0905m = kVar3;
                                            } else {
                                                if (r7 == 0) {
                                                    r7 = new K.d(new U.k[16]);
                                                }
                                                if (abstractC0905m != 0) {
                                                    r7.b(abstractC0905m);
                                                    abstractC0905m = 0;
                                                }
                                                r7.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f3308i;
                                        abstractC0905m = abstractC0905m;
                                        r7 = r7;
                                    }
                                    if (i4 == 1) {
                                    }
                                }
                                abstractC0905m = AbstractC0898f.f(r7);
                            }
                        }
                    }
                    kVar2 = kVar2.f3307h;
                }
            }
            t3 = t3.q();
            kVar2 = (t3 == null || (c0120t = t3.f7735x) == null) ? null : (o0) c0120t.f2355e;
        }
        return jVar;
    }

    public final p w0() {
        p pVar;
        D d3;
        C0997t c0997t;
        g focusOwner;
        a0 a0Var = this.f3303d.f3310k;
        r rVar = (a0Var == null || (d3 = a0Var.f7877o) == null || (c0997t = d3.f7724l) == null || (focusOwner = c0997t.getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.a) focusOwner).f3710f;
        if (rVar != null && (pVar = (p) ((C0506x) rVar.f3454b).e(this)) != null) {
            return pVar;
        }
        p pVar2 = this.f3452s;
        return pVar2 == null ? p.f3448f : pVar2;
    }

    public final void z0() {
        p pVar = this.f3452s;
        if (pVar == null) {
            if (pVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            r E3 = c.E(this);
            try {
                if (E3.f3453a) {
                    r.a(E3);
                }
                E3.f3453a = true;
                A0((y0(this) && x0(this)) ? p.f3447e : p.f3448f);
                r.b(E3);
            } catch (Throwable th) {
                r.b(E3);
                throw th;
            }
        }
        int ordinal = w0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            Z1.t tVar = new Z1.t();
            AbstractC0898f.q(this, new C0125v0(tVar, 2, this));
            Object obj = tVar.f3480d;
            if (obj == null) {
                Z1.i.j("focusProperties");
                throw null;
            }
            if (((i) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(this)).getFocusOwner()).a(8, true, true);
        }
    }
}
