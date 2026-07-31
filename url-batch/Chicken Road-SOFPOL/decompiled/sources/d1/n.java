package d1;

import android.os.Trace;
import q6.s;
import w1.b1;
import w1.f0;
import w1.f1;
import x1.t;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class n extends y0.l implements w1.j, f1, v1.e, w1.k {

    /* renamed from: r, reason: collision with root package name */
    public final p6.e f2096r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f2097s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f2098t;

    /* renamed from: u, reason: collision with root package name */
    public final int f2099u;

    public n(int i, p6.e eVar, int i8) {
        this.f2096r = (i8 & 2) != 0 ? null : eVar;
        this.f2099u = i;
    }

    @Override // w1.f1
    public final void F() {
        u0();
    }

    @Override // y0.l
    public final boolean g0() {
        return false;
    }

    @Override // y0.l
    public final void k0() {
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new a5.c();
                }
                return;
            }
        }
        i iVar = (i) ((t) w1.f.v(this)).getFocusOwner();
        iVar.b(8, true, false);
        iVar.f2069d.a();
    }

    @Override // y0.l
    public final void l0() {
        if (t0().a()) {
            ((i) ((t) w1.f.v(this)).getFocusOwner()).b(8, true, true);
        }
    }

    public final void r0(m mVar, m mVar2) {
        b1 b1Var;
        p6.e eVar;
        i iVar = (i) ((t) w1.f.v(this)).getFocusOwner();
        n nVar = iVar.f2073h;
        if (!mVar.equals(mVar2) && (eVar = this.f2096r) != null) {
            eVar.g(mVar, mVar2);
        }
        y0.l lVar = this.f8706d;
        if (!lVar.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar2 = this.f8706d;
        f0 u7 = w1.f.u(this);
        while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 5120) != 0) {
                while (lVar2 != null) {
                    int i = lVar2.f8708f;
                    if ((i & 5120) != 0) {
                        if (lVar2 != lVar && (i & 1024) != 0) {
                            return;
                        }
                        if ((i & 4096) != 0) {
                            y0.l lVar3 = lVar2;
                            o0.e eVar2 = null;
                            while (lVar3 != null) {
                                if (lVar3 instanceof w1.c) {
                                    w1.c cVar = (w1.c) lVar3;
                                    if (nVar == iVar.f2073h) {
                                        cVar.s0();
                                        throw null;
                                    }
                                } else if ((lVar3.f8708f & 4096) != 0 && (lVar3 instanceof w1.l)) {
                                    int i8 = 0;
                                    for (y0.l lVar4 = ((w1.l) lVar3).f7707s; lVar4 != null; lVar4 = lVar4.i) {
                                        if ((lVar4.f8708f & 4096) != 0) {
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
                            continue;
                        }
                    }
                    lVar2 = lVar2.f8710h;
                }
            }
            u7 = u7.s();
            lVar2 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
    }

    public final k s0() {
        boolean z3;
        b1 b1Var;
        k kVar = new k();
        kVar.f2077a = true;
        l lVar = l.f2087b;
        kVar.f2078b = lVar;
        kVar.f2079c = lVar;
        kVar.f2080d = lVar;
        kVar.f2081e = lVar;
        kVar.f2082f = lVar;
        kVar.f2083g = lVar;
        kVar.f2084h = lVar;
        kVar.i = lVar;
        kVar.f2085j = j.f2074f;
        kVar.f2086k = j.f2075g;
        int i = this.f2099u;
        if (i == 1) {
            z3 = true;
        } else if (i == 0) {
            z3 = !(((n1.a) ((n1.c) ((n1.b) w1.f.i(this, x1.b1.f8374m))).f5304a.getValue()).f5303a == 1);
        } else {
            if (i != 2) {
                throw new IllegalStateException("Unknown Focusability");
            }
            z3 = false;
        }
        kVar.f2077a = z3;
        y0.l lVar2 = this.f8706d;
        if (!lVar2.f8718q) {
            t1.a.b("visitAncestors called on an unattached node");
        }
        y0.l lVar3 = this.f8706d;
        f0 u7 = w1.f.u(this);
        loop0: while (u7 != null) {
            if ((u7.F.f7600f.f8709g & 3072) != 0) {
                while (lVar3 != null) {
                    int i8 = lVar3.f8708f;
                    if ((i8 & 3072) != 0) {
                        if (lVar3 != lVar2 && (i8 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i8 & 2048) != 0) {
                            y0.l lVar4 = lVar3;
                            o0.e eVar = null;
                            while (lVar4 != null) {
                                if (lVar4 instanceof w1.c) {
                                    y0.k kVar2 = ((w1.c) lVar4).f7604r;
                                    t1.a.b("applyFocusProperties called on wrong node");
                                    a0.q.q(kVar2);
                                    throw null;
                                }
                                if ((lVar4.f8708f & 2048) != 0 && (lVar4 instanceof w1.l)) {
                                    int i9 = 0;
                                    for (y0.l lVar5 = ((w1.l) lVar4).f7707s; lVar5 != null; lVar5 = lVar5.i) {
                                        if ((lVar5.f8708f & 2048) != 0) {
                                            i9++;
                                            if (i9 == 1) {
                                                lVar4 = lVar5;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar4 != null) {
                                                    eVar.b(lVar4);
                                                    lVar4 = null;
                                                }
                                                eVar.b(lVar5);
                                            }
                                        }
                                    }
                                    if (i9 == 1) {
                                    }
                                }
                                lVar4 = w1.f.f(eVar);
                            }
                        } else {
                            continue;
                        }
                    }
                    lVar3 = lVar3.f8710h;
                }
            }
            u7 = u7.s();
            lVar3 = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
        }
        return kVar;
    }

    public final m t0() {
        b1 b1Var;
        boolean z3 = this.f8718q;
        m mVar = m.f2094g;
        if (!z3) {
            return mVar;
        }
        i iVar = (i) ((t) w1.f.v(this)).getFocusOwner();
        n nVar = iVar.f2073h;
        if (nVar == null) {
            return mVar;
        }
        if (this == nVar) {
            iVar.getClass();
            return m.f2091d;
        }
        if (nVar.f8718q) {
            if (!nVar.f8706d.f8718q) {
                t1.a.b("visitAncestors called on an unattached node");
            }
            y0.l lVar = nVar.f8706d.f8710h;
            f0 u7 = w1.f.u(nVar);
            while (u7 != null) {
                if ((u7.F.f7600f.f8709g & 1024) != 0) {
                    while (lVar != null) {
                        if ((lVar.f8708f & 1024) != 0) {
                            y0.l lVar2 = lVar;
                            o0.e eVar = null;
                            while (lVar2 != null) {
                                if (lVar2 instanceof n) {
                                    if (this == ((n) lVar2)) {
                                        return m.f2092e;
                                    }
                                } else if ((lVar2.f8708f & 1024) != 0 && (lVar2 instanceof w1.l)) {
                                    int i = 0;
                                    for (y0.l lVar3 = ((w1.l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                                        if ((lVar3.f8708f & 1024) != 0) {
                                            i++;
                                            if (i == 1) {
                                                lVar2 = lVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new y0.l[16]);
                                                }
                                                if (lVar2 != null) {
                                                    eVar.b(lVar2);
                                                    lVar2 = null;
                                                }
                                                eVar.b(lVar3);
                                            }
                                        }
                                    }
                                    if (i == 1) {
                                    }
                                }
                                lVar2 = w1.f.f(eVar);
                            }
                        }
                        lVar = lVar.f8710h;
                    }
                }
                u7 = u7.s();
                lVar = (u7 == null || (b1Var = u7.F) == null) ? null : b1Var.f7599e;
            }
        }
        return mVar;
    }

    public final void u0() {
        int ordinal = t0().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal != 3) {
                    throw new a5.c();
                }
                return;
            }
        }
        s sVar = new s();
        w1.f.r(this, new a2.b(2, sVar, this));
        Object obj = sVar.f6205d;
        if (obj == null) {
            q6.i.j("focusProperties");
            throw null;
        }
        if (((k) obj).f2077a) {
            return;
        }
        ((i) ((t) w1.f.v(this)).getFocusOwner()).b(8, true, true);
    }

    public final boolean v0(int i) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            boolean z3 = false;
            if (!s0().f2077a) {
                Trace.endSection();
                return false;
            }
            int ordinal = d.u(this).ordinal();
            if (ordinal == 0) {
                z3 = d.v(this);
            } else if (ordinal != 1) {
                if (ordinal == 2) {
                    z3 = true;
                } else if (ordinal != 3) {
                    throw new a5.c();
                }
            }
            return z3;
        } finally {
            Trace.endSection();
        }
    }
}
