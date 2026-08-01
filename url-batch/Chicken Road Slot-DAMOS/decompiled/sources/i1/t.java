package i1;

import a3.a0;
import android.os.Trace;
import c2.b1;
import c2.g0;
import c2.k1;
import c2.z1;
import d2.d1;
import kotlin.collections.i0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import wd.b0;
import z4.w;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class t extends d1.k implements c2.h, c2.u, k1, b2.c, c2.i {
    public final boolean C;
    public final Function2 D;
    public boolean E;
    public boolean F;
    public final int G;

    public t(int i3, Function2 function2, int i10) {
        i3 = (i10 & 1) != 0 ? 1 : i3;
        boolean z10 = (i10 & 2) == 0;
        function2 = (i10 & 4) != 0 ? null : function2;
        this.C = z10;
        this.D = function2;
        this.G = i3;
    }

    @Override // d1.k
    public final void B() {
        int ordinal = M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                h focusOwner = c2.k.v(this).getFocusOwner();
                t n10 = w.n(this);
                if (n10 == null || !n10.C) {
                    return;
                }
                k kVar = (k) focusOwner;
                kVar.f4601a.F();
                kVar.f4604d.a();
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                a2.r.p();
                return;
            }
        }
        k kVar2 = (k) c2.k.v(this).getFocusOwner();
        kVar2.b(8, true, false);
        if (this.C) {
            kVar2.f4601a.F();
        }
        kVar2.f4604d.a();
    }

    @Override // d1.k
    public final void C() {
        if (M().a()) {
            ((k) c2.k.v(this).getFocusOwner()).b(8, true, true);
        }
    }

    public final boolean I(int i3) {
        int ordinal = k7.e.E(this, i3).ordinal();
        if (ordinal == 0) {
            return k7.e.F(this);
        }
        if (ordinal == 1) {
            return false;
        }
        if (ordinal == 2) {
            return true;
        }
        if (ordinal == 3) {
            return false;
        }
        a2.r.p();
        return false;
    }

    public final void J(r rVar, r rVar2) {
        b1 b1Var;
        Function2 function2;
        k kVar = (k) c2.k.v(this).getFocusOwner();
        t f3 = kVar.f();
        if (!rVar.equals(rVar2) && (function2 = this.D) != null) {
            function2.invoke(rVar, rVar2);
        }
        d1.k kVar2 = this.f3305d;
        if (!kVar2.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar3 = this.f3305d;
        g0 u2 = c2.k.u(this);
        while (u2 != null) {
            if ((((d1.k) u2.S.g).f3308r & 5120) != 0) {
                while (kVar3 != null) {
                    int i3 = kVar3.f3307i;
                    if ((i3 & 5120) != 0) {
                        if (kVar3 != kVar2 && (i3 & 1024) != 0) {
                            return;
                        }
                        if ((i3 & 4096) != 0) {
                            d1.k kVar4 = kVar3;
                            o0.e eVar = null;
                            while (kVar4 != null) {
                                if (kVar4 instanceof c2.b) {
                                    c2.b bVar = (c2.b) kVar4;
                                    if (f3 == kVar.f()) {
                                        bVar.J();
                                        throw null;
                                    }
                                } else if ((kVar4.f3307i & 4096) != 0 && (kVar4 instanceof c2.j)) {
                                    int i10 = 0;
                                    for (d1.k kVar5 = ((c2.j) kVar4).D; kVar5 != null; kVar5 = kVar5.f3310t) {
                                        if ((kVar5.f3307i & 4096) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                kVar4 = kVar5;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar4 != null) {
                                                    eVar.b(kVar4);
                                                    kVar4 = null;
                                                }
                                                eVar.b(kVar5);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                kVar4 = c2.k.e(eVar);
                            }
                        } else {
                            continue;
                        }
                    }
                    kVar3 = kVar3.f3309s;
                }
            }
            u2 = u2.s();
            kVar3 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r6v12, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v18 */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8, types: [d1.k] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v10 */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v12 */
    /* JADX WARN: Type inference failed for: r8v13 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r8v4, types: [o0.e] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [o0.e] */
    public final o K() {
        boolean z10;
        b1 b1Var;
        o oVar = new o();
        oVar.f4612a = true;
        q qVar = q.f4622b;
        oVar.f4613b = qVar;
        oVar.f4614c = qVar;
        oVar.f4615d = qVar;
        oVar.f4616e = qVar;
        oVar.f4617f = qVar;
        oVar.g = qVar;
        oVar.f4618h = qVar;
        oVar.f4619i = qVar;
        oVar.j = n.f4609e;
        oVar.f4620k = n.f4610i;
        oVar.f4621l = l.f4608a;
        int i3 = this.G;
        if (i3 == 1) {
            z10 = true;
        } else if (i3 == 0) {
            z10 = !(((t1.a) ((t1.c) ((t1.b) c2.k.h(this, d1.f3388m))).f9224a.getValue()).f9223a == 1);
        } else {
            if (i3 != 2) {
                i0.l("Unknown Focusability");
                return null;
            }
            z10 = false;
        }
        oVar.f4612a = z10;
        d1.k kVar = this.f3305d;
        if (!kVar.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar2 = this.f3305d;
        g0 u2 = c2.k.u(this);
        loop0: while (u2 != null) {
            if ((((d1.k) u2.S.g).f3308r & 3072) != 0) {
                while (kVar2 != null) {
                    int i10 = kVar2.f3307i;
                    if ((i10 & 3072) != 0) {
                        if (kVar2 != kVar && (i10 & 1024) != 0) {
                            break loop0;
                        }
                        if ((i10 & 2048) != 0) {
                            c2.j jVar = kVar2;
                            ?? r82 = 0;
                            while (jVar != 0) {
                                if (jVar instanceof p) {
                                    ((p) jVar).l(oVar);
                                } else if ((jVar.f3307i & 2048) != 0 && (jVar instanceof c2.j)) {
                                    d1.k kVar3 = jVar.D;
                                    int i11 = 0;
                                    jVar = jVar;
                                    r82 = r82;
                                    while (kVar3 != null) {
                                        if ((kVar3.f3307i & 2048) != 0) {
                                            i11++;
                                            r82 = r82;
                                            if (i11 == 1) {
                                                jVar = kVar3;
                                            } else {
                                                if (r82 == 0) {
                                                    r82 = new o0.e(new d1.k[16]);
                                                }
                                                if (jVar != 0) {
                                                    r82.b(jVar);
                                                    jVar = 0;
                                                }
                                                r82.b(kVar3);
                                            }
                                        }
                                        kVar3 = kVar3.f3310t;
                                        jVar = jVar;
                                        r82 = r82;
                                    }
                                    if (i11 == 1) {
                                    }
                                }
                                jVar = c2.k.e(r82);
                            }
                        }
                    }
                    kVar2 = kVar2.f3309s;
                }
            }
            u2 = u2.s();
            kVar2 = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
        return oVar;
    }

    public final void L() {
        b1 b1Var;
        Object obj;
        if (!this.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        d1.k kVar = this.f3305d.f3309s;
        g0 u2 = c2.k.u(this);
        while (u2 != null) {
            if ((((d1.k) u2.S.g).f3308r & 8388640) != 0) {
                while (kVar != null) {
                    int i3 = kVar.f3307i;
                    if ((i3 & 8388640) != 0) {
                        if ((8388608 & i3) != 0) {
                            if (kVar instanceof c2.j) {
                                for (d1.k kVar2 = ((c2.j) kVar).D; kVar2 != null; kVar2 = kVar2.f3310t) {
                                }
                                return;
                            }
                            return;
                        }
                        if ((i3 & 32) != 0) {
                            if (kVar instanceof b2.c) {
                                obj = kVar;
                            } else if (kVar instanceof c2.j) {
                                obj = null;
                                for (d1.k kVar3 = ((c2.j) kVar).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                    if (kVar3 instanceof b2.c) {
                                        obj = kVar3;
                                    }
                                }
                            } else {
                                obj = null;
                            }
                            b2.c cVar = (b2.c) obj;
                            if (cVar != null) {
                                cVar.c().getClass();
                            }
                        }
                    }
                    kVar = kVar.f3309s;
                }
            }
            u2 = u2.s();
            kVar = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
        }
    }

    public final r M() {
        b1 b1Var;
        if (!this.B) {
            return r.f4628i;
        }
        t f3 = ((k) c2.k.v(this).getFocusOwner()).f();
        if (f3 == null) {
            return r.f4628i;
        }
        if (this == f3) {
            return r.f4626d;
        }
        if (f3.B) {
            if (!f3.f3305d.B) {
                z1.a.b("visitAncestors called on an unattached node");
            }
            d1.k kVar = f3.f3305d.f3309s;
            g0 u2 = c2.k.u(f3);
            while (u2 != null) {
                if ((((d1.k) u2.S.g).f3308r & 1024) != 0) {
                    while (kVar != null) {
                        if ((kVar.f3307i & 1024) != 0) {
                            d1.k kVar2 = kVar;
                            o0.e eVar = null;
                            while (kVar2 != null) {
                                if (kVar2 instanceof t) {
                                    if (this == ((t) kVar2)) {
                                        return r.f4627e;
                                    }
                                } else if ((kVar2.f3307i & 1024) != 0 && (kVar2 instanceof c2.j)) {
                                    int i3 = 0;
                                    for (d1.k kVar3 = ((c2.j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                        if ((kVar3.f3307i & 1024) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                kVar2 = kVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new d1.k[16]);
                                                }
                                                if (kVar2 != null) {
                                                    eVar.b(kVar2);
                                                    kVar2 = null;
                                                }
                                                eVar.b(kVar3);
                                            }
                                        }
                                    }
                                    if (i3 == 1) {
                                    }
                                }
                                kVar2 = c2.k.e(eVar);
                            }
                        }
                        kVar = kVar.f3309s;
                    }
                }
                u2 = u2.s();
                kVar = (u2 == null || (b1Var = u2.S) == null) ? null : (z1) b1Var.f1495f;
            }
        }
        return r.f4628i;
    }

    public final void N() {
        int ordinal = M().ordinal();
        if (ordinal != 0) {
            if (ordinal == 1) {
                return;
            }
            if (ordinal != 2) {
                if (ordinal == 3) {
                    return;
                }
                a2.r.p();
                return;
            }
        }
        b0 b0Var = new b0();
        c2.k.r(this, new a0(6, b0Var, this));
        Object obj = b0Var.f10141d;
        if (obj == null) {
            Intrinsics.f("focusProperties");
            throw null;
        }
        if (((m) obj).c()) {
            return;
        }
        ((k) c2.k.v(this).getFocusOwner()).b(8, true, true);
    }

    public final boolean O(int i3) {
        Trace.beginSection("FocusTransactions:requestFocus");
        try {
            return K().f4612a ? I(i3) : c6.f.D(this, i3, new d2.t(i3, 3));
        } finally {
            Trace.endSection();
        }
    }

    @Override // c2.k1
    public final void h() {
        N();
    }

    @Override // d1.k
    public final boolean x() {
        return false;
    }

    @Override // c2.u
    public final void g(a2.n nVar) {
    }
}
