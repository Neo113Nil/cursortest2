package t0;

import e2.AbstractC0381e;
import j.AbstractC0476B;
import j.C0503u;
import l.C0565j;
import l0.InterfaceC0573c;
import p0.C0760a;
import r0.InterfaceC0840m;
import s0.InterfaceC0886c;
import u.C0936d;
import u0.C0997t;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0503u f7890a;

    static {
        C0503u c0503u = AbstractC0476B.f5134a;
        f7890a = new C0503u();
    }

    public static final void a(U.k kVar) {
        if (kVar.p) {
            b(kVar, -1, 1);
        } else {
            AbstractC0381e.N("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(U.k kVar, int i3, int i4) {
        if (!(kVar instanceof AbstractC0905m)) {
            c(kVar, i3 & kVar.f3305f, i4);
            return;
        }
        AbstractC0905m abstractC0905m = (AbstractC0905m) kVar;
        c(kVar, abstractC0905m.f7936q & i3, i4);
        int i5 = (~abstractC0905m.f7936q) & i3;
        for (U.k kVar2 = abstractC0905m.f7937r; kVar2 != null; kVar2 = kVar2.f3308i) {
            b(kVar2, i5, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(U.k kVar, int i3, int i4) {
        if (i4 != 0 || kVar.k0()) {
            if ((i3 & 2) != 0 && (kVar instanceof InterfaceC0914w)) {
                AbstractC0898f.n((InterfaceC0914w) kVar);
                if (i4 == 2) {
                    a0 r3 = AbstractC0898f.r(kVar, 2);
                    r3.f7879r = true;
                    r3.f7874E.b();
                    if (r3.f7876G != null) {
                        r3.U0(null, false);
                        r3.f7877o.Q(false);
                    }
                }
            }
            if ((i3 & 128) != 0 && (kVar instanceof InterfaceC0913v) && i4 != 2) {
                AbstractC0898f.t(kVar).y();
            }
            if ((i3 & 256) != 0 && (kVar instanceof InterfaceC0908p) && i4 != 2) {
                D t3 = AbstractC0898f.t(kVar);
                L l3 = t3.f7736y;
                if (!l3.f7801e && !l3.f7800d && !t3.f7712E) {
                    C0997t c0997t = (C0997t) G.a(t3);
                    ((K.d) c0997t.f8416J.f7841e.f484e).b(t3);
                    t3.f7712E = true;
                    c0997t.D(null);
                }
            }
            if ((i3 & 4) != 0 && (kVar instanceof InterfaceC0907o)) {
                AbstractC0898f.m((InterfaceC0907o) kVar);
            }
            if ((i3 & 8) != 0 && (kVar instanceof n0)) {
                AbstractC0898f.o((n0) kVar);
            }
            if ((i3 & 64) != 0 && (kVar instanceof j0)) {
                L l4 = AbstractC0898f.t((j0) kVar).f7736y;
                l4.f7813r.f7787s = true;
                I i5 = l4.f7814s;
                if (i5 != null) {
                    i5.f7769x = true;
                }
            }
            if ((i3 & 1024) != 0 && (kVar instanceof Z.q) && i4 != 2) {
                Z.c.q((Z.q) kVar);
            }
            if ((i3 & 2048) != 0 && (kVar instanceof Z.l)) {
                Z.l lVar = (Z.l) kVar;
                C0899g.f7913b = null;
                lVar.e0(C0899g.f7912a);
                if (C0899g.f7913b != null) {
                    if (i4 == 2) {
                        U.k kVar2 = ((U.k) lVar).f3303d;
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
                                            if (kVar4 instanceof Z.q) {
                                                Z.c.q((Z.q) kVar4);
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
                    } else {
                        Z.e eVar = ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(lVar)).getFocusOwner()).f3709e;
                        eVar.b(eVar.f3421e, lVar);
                    }
                }
            }
            if ((i3 & 4096) == 0 || !(kVar instanceof Z.b)) {
                return;
            }
            Z.b bVar = (Z.b) kVar;
            Z.e eVar2 = ((androidx.compose.ui.focus.a) ((C0997t) AbstractC0898f.u(bVar)).getFocusOwner()).f3709e;
            eVar2.b(eVar2.f3420d, bVar);
        }
    }

    public static final void d(U.k kVar) {
        if (kVar.p) {
            b(kVar, -1, 0);
        } else {
            AbstractC0381e.N("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(U.j jVar) {
        int i3 = jVar instanceof InterfaceC0840m ? 3 : 1;
        if (jVar instanceof Y.e) {
            i3 |= 4;
        }
        if (jVar instanceof z0.j) {
            i3 |= 8;
        }
        if ((jVar instanceof InterfaceC0886c) || (jVar instanceof s0.f)) {
            i3 |= 32;
        }
        if (jVar instanceof C0936d) {
            i3 |= 256;
        }
        return jVar instanceof C0565j ? i3 | 64 : i3;
    }

    public static final int f(U.k kVar) {
        int i3 = kVar.f3305f;
        if (i3 != 0) {
            return i3;
        }
        Class<?> cls = kVar.getClass();
        C0503u c0503u = f7890a;
        int c3 = c0503u.c(cls);
        if (c3 >= 0) {
            return c0503u.f5214c[c3];
        }
        int i4 = kVar instanceof InterfaceC0914w ? 3 : 1;
        if (kVar instanceof InterfaceC0907o) {
            i4 |= 4;
        }
        if (kVar instanceof n0) {
            i4 |= 8;
        }
        if (kVar instanceof l0) {
            i4 |= 16;
        }
        if (kVar instanceof s0.e) {
            i4 |= 32;
        }
        if (kVar instanceof j0) {
            i4 |= 64;
        }
        if (kVar instanceof InterfaceC0913v) {
            i4 |= 128;
        }
        if (kVar instanceof InterfaceC0908p) {
            i4 |= 256;
        }
        if (kVar instanceof Z.q) {
            i4 |= 1024;
        }
        if (kVar instanceof Z.l) {
            i4 |= 2048;
        }
        if (kVar instanceof Z.b) {
            i4 |= 4096;
        }
        if (kVar instanceof InterfaceC0573c) {
            i4 |= 8192;
        }
        if (kVar instanceof C0760a) {
            i4 |= 16384;
        }
        if (kVar instanceof InterfaceC0903k) {
            i4 |= 32768;
        }
        int i5 = kVar instanceof q0 ? 262144 | i4 : i4;
        c0503u.f(i5, cls);
        return i5;
    }

    public static final int g(U.k kVar) {
        if (!(kVar instanceof AbstractC0905m)) {
            return f(kVar);
        }
        AbstractC0905m abstractC0905m = (AbstractC0905m) kVar;
        int i3 = abstractC0905m.f7936q;
        for (U.k kVar2 = abstractC0905m.f7937r; kVar2 != null; kVar2 = kVar2.f3308i) {
            i3 |= g(kVar2);
        }
        return i3;
    }

    public static final boolean h(int i3) {
        return (i3 & 128) != 0;
    }
}
