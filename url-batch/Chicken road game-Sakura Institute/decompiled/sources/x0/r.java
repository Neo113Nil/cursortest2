package x0;

import a0.b1;
import a0.s0;
import i.x;
import r1.a1;
import r1.c1;
import r1.d0;
import r1.g1;
import r1.o1;
import r6.v;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class r extends s0.n implements r1.k, c1, q1.e {

    /* renamed from: s, reason: collision with root package name */
    public boolean f9632s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9633t;

    /* renamed from: u, reason: collision with root package name */
    public q f9634u;

    public static final boolean C0(r rVar) {
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            a.a.M("visitSubtreeIf called on an unattached node");
            throw null;
        }
        i0.d dVar = new i0.d(new s0.n[16]);
        s0.n nVar2 = nVar.f8109k;
        if (nVar2 == null) {
            r1.f.b(dVar, nVar);
        } else {
            dVar.b(nVar2);
        }
        while (true) {
            if (!dVar.m()) {
                break;
            }
            s0.n nVar3 = (s0.n) dVar.o(dVar.f4842h - 1);
            if ((nVar3.f8107i & 1024) != 0) {
                for (s0.n nVar4 = nVar3; nVar4 != null; nVar4 = nVar4.f8109k) {
                    if ((nVar4.f8106h & 1024) != 0) {
                        i0.d dVar2 = null;
                        s0.n nVar5 = nVar4;
                        while (nVar5 != null) {
                            if (nVar5 instanceof r) {
                                r rVar2 = (r) nVar5;
                                if (rVar2.f9634u != null) {
                                    int ordinal = rVar2.B0().ordinal();
                                    if (ordinal == 0 || ordinal == 1 || ordinal == 2) {
                                        return true;
                                    }
                                    if (ordinal != 3) {
                                        throw new b4.c();
                                    }
                                }
                            } else if ((nVar5.f8106h & 1024) != 0 && (nVar5 instanceof r1.m)) {
                                int i7 = 0;
                                for (s0.n nVar6 = ((r1.m) nVar5).f7853t; nVar6 != null; nVar6 = nVar6.f8109k) {
                                    if ((nVar6.f8106h & 1024) != 0) {
                                        i7++;
                                        if (i7 == 1) {
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
                                if (i7 == 1) {
                                }
                            }
                            nVar5 = r1.f.f(dVar2);
                        }
                    }
                }
            }
            r1.f.b(dVar, nVar3);
        }
        return false;
    }

    public static final boolean D0(r rVar) {
        g0.t tVar;
        s0.n nVar = rVar.f8104f;
        if (!nVar.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        s0.n nVar2 = nVar.f8108j;
        d0 t2 = r1.f.t(rVar);
        while (true) {
            if (t2 == null) {
                break;
            }
            if ((((s0.n) t2.A.f3895f).f8107i & 1024) != 0) {
                while (nVar2 != null) {
                    if ((nVar2.f8106h & 1024) != 0) {
                        s0.n nVar3 = nVar2;
                        i0.d dVar = null;
                        while (nVar3 != null) {
                            if (nVar3 instanceof r) {
                                r rVar2 = (r) nVar3;
                                if (rVar2.f9634u != null) {
                                    int ordinal = rVar2.B0().ordinal();
                                    if (ordinal != 0) {
                                        if (ordinal == 1) {
                                            return true;
                                        }
                                        if (ordinal != 2 && ordinal != 3) {
                                            throw new b4.c();
                                        }
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
                                            if (dVar == null) {
                                                dVar = new i0.d(new s0.n[16]);
                                            }
                                            if (nVar3 != null) {
                                                dVar.b(nVar3);
                                                nVar3 = null;
                                            }
                                            dVar.b(nVar4);
                                        }
                                    }
                                }
                                if (i7 == 1) {
                                }
                            }
                            nVar3 = r1.f.f(dVar);
                        }
                    }
                    nVar2 = nVar2.f8108j;
                }
            }
            t2 = t2.s();
            nVar2 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r5v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r5v13 */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v15 */
    /* JADX WARN: Type inference failed for: r5v16 */
    /* JADX WARN: Type inference failed for: r5v17 */
    /* JADX WARN: Type inference failed for: r5v18 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r5v8, types: [s0.n] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v13 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v4, types: [i0.d] */
    /* JADX WARN: Type inference failed for: r7v5 */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX WARN: Type inference failed for: r7v7, types: [i0.d] */
    public final j A0() {
        g0.t tVar;
        j jVar = new j();
        jVar.f9612a = true;
        n nVar = n.f9624b;
        jVar.f9613b = nVar;
        jVar.f9614c = nVar;
        jVar.f9615d = nVar;
        jVar.f9616e = nVar;
        jVar.f9617f = nVar;
        jVar.f9618g = nVar;
        jVar.f9619h = nVar;
        jVar.f9620i = nVar;
        jVar.f9621j = h.f9607i;
        jVar.f9622k = h.f9608j;
        s0.n nVar2 = this.f8104f;
        if (!nVar2.f8116r) {
            throw new IllegalStateException("visitAncestors called on an unattached node");
        }
        d0 t2 = r1.f.t(this);
        s0.n nVar3 = nVar2;
        loop0: while (t2 != null) {
            if ((((s0.n) t2.A.f3895f).f8107i & 3072) != 0) {
                while (nVar3 != null) {
                    int i7 = nVar3.f8106h;
                    if ((i7 & 3072) != 0) {
                        if (nVar3 != nVar2 && (i7 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i7 & 2048) != 0) {
                            r1.m mVar = nVar3;
                            ?? r72 = 0;
                            while (mVar != 0) {
                                if (mVar instanceof l) {
                                    ((l) mVar).E(jVar);
                                } else if ((mVar.f8106h & 2048) != 0 && (mVar instanceof r1.m)) {
                                    s0.n nVar4 = mVar.f7853t;
                                    int i8 = 0;
                                    mVar = mVar;
                                    r72 = r72;
                                    while (nVar4 != null) {
                                        if ((nVar4.f8106h & 2048) != 0) {
                                            i8++;
                                            r72 = r72;
                                            if (i8 == 1) {
                                                mVar = nVar4;
                                            } else {
                                                if (r72 == 0) {
                                                    r72 = new i0.d(new s0.n[16]);
                                                }
                                                if (mVar != 0) {
                                                    r72.b(mVar);
                                                    mVar = 0;
                                                }
                                                r72.b(nVar4);
                                            }
                                        }
                                        nVar4 = nVar4.f8109k;
                                        mVar = mVar;
                                        r72 = r72;
                                    }
                                    if (i8 == 1) {
                                    }
                                }
                                mVar = r1.f.f(r72);
                            }
                        }
                    }
                    nVar3 = nVar3.f8108j;
                }
            }
            t2 = t2.s();
            nVar3 = (t2 == null || (tVar = t2.A) == null) ? null : (o1) tVar.f3894e;
        }
        return jVar;
    }

    public final q B0() {
        q qVar;
        d0 d0Var;
        g1 g1Var;
        g focusOwner;
        a1 a1Var = this.f8104f.f8111m;
        s0 s0Var = (a1Var == null || (d0Var = a1Var.f7700q) == null || (g1Var = d0Var.f7727n) == null || (focusOwner = ((s1.r) g1Var).getFocusOwner()) == null) ? null : ((androidx.compose.ui.focus.b) focusOwner).f718h;
        if (s0Var != null && (qVar = (q) ((x) s0Var.f137c).e(this)) != null) {
            return qVar;
        }
        q qVar2 = this.f9634u;
        return qVar2 == null ? q.f9630h : qVar2;
    }

    public final void E0() {
        q qVar = this.f9634u;
        if (qVar == null) {
            if (qVar != null) {
                throw new IllegalStateException("Re-initializing focus target node.");
            }
            s0 E = d.E(this);
            try {
                if (E.f136b) {
                    s0.a(E);
                }
                E.f136b = true;
                F0((D0(this) && C0(this)) ? q.f9629g : q.f9630h);
                s0.b(E);
            } catch (Throwable th) {
                s0.b(E);
                throw th;
            }
        }
        int ordinal = B0().ordinal();
        if (ordinal == 0 || ordinal == 2) {
            v vVar = new v();
            r1.f.q(this, new b1(vVar, 16, this));
            Object obj = vVar.f7968f;
            if (obj == null) {
                r6.k.j("focusProperties");
                throw null;
            }
            if (((i) obj).a()) {
                return;
            }
            ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(this)).getFocusOwner()).a(8, true, true);
        }
    }

    public final void F0(q qVar) {
        ((x) d.E(this).f137c).i(this, qVar);
    }

    @Override // r1.c1
    public final void I() {
        q B0 = B0();
        E0();
        if (B0 != B0()) {
            d.A(this);
        }
    }

    @Override // s0.n
    public final boolean p0() {
        return false;
    }

    /* JADX WARN: Code restructure failed: missing block: B:5:0x000e, code lost:
    
        if (r0 != 2) goto L19;
     */
    @Override // s0.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void t0() {
        int ordinal = B0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                s0 E = d.E(this);
                try {
                    if (E.f136b) {
                        s0.a(E);
                    }
                    E.f136b = true;
                    F0(q.f9630h);
                    s0.b(E);
                } catch (Throwable th) {
                    s0.b(E);
                    throw th;
                }
            }
            this.f9634u = null;
        }
        ((androidx.compose.ui.focus.b) ((s1.r) r1.f.u(this)).getFocusOwner()).a(8, true, false);
        d.q(this);
        this.f9634u = null;
    }
}
