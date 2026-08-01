package w1;

import a2.a0;
import c2.b1;
import c2.c2;
import c2.g0;
import c2.j;
import c2.z1;
import d1.k;
import d2.q;
import ge.c1;
import ge.u;
import ge.x;
import kotlin.collections.i0;
import kotlin.jvm.internal.Intrinsics;
import wd.b0;
import x2.p;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class h extends k implements c2 {
    public c C;
    public h D;
    public final String E = "androidx.compose.ui.input.nestedscroll.NestedScrollNode";

    public h(c cVar) {
        this.C = cVar;
    }

    @Override // d1.k
    public final void A() {
        c cVar = this.C;
        cVar.f10009a = this;
        cVar.f10010b = null;
        this.D = null;
        cVar.f10011c = new a0(14, this);
        cVar.f10012d = w();
    }

    @Override // d1.k
    public final void B() {
        b1 b1Var;
        boolean z10;
        b0 b0Var = new b0();
        q qVar = new q(b0Var, 1);
        h hVar = this;
        if (!hVar.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        k kVar = hVar.f3305d.f3309s;
        g0 u2 = c2.k.u(this);
        loop0: while (u2 != null) {
            if ((((k) u2.S.g).f3308r & 262144) != 0) {
                while (kVar != null) {
                    if ((kVar.f3307i & 262144) != 0) {
                        k kVar2 = kVar;
                        o0.e eVar = null;
                        while (kVar2 != null) {
                            if (kVar2 instanceof c2) {
                                c2 c2Var = (c2) kVar2;
                                if (!((Intrinsics.a(d(), c2Var.d()) && getClass() == c2Var.getClass()) ? ((Boolean) qVar.invoke(c2Var)).booleanValue() : true)) {
                                    break loop0;
                                } else {
                                    z10 = false;
                                }
                            } else {
                                z10 = true;
                            }
                            if (z10) {
                                if (((kVar2.f3307i & 262144) != 0) && (kVar2 instanceof j)) {
                                    int i3 = 0;
                                    for (k kVar3 = ((j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                        if ((kVar3.f3307i & 262144) != 0) {
                                            i3++;
                                            if (i3 == 1) {
                                                kVar2 = kVar3;
                                            } else {
                                                if (eVar == null) {
                                                    eVar = new o0.e(new k[16]);
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
        h hVar2 = (h) ((c2) b0Var.f10141d);
        this.D = hVar2;
        c cVar = this.C;
        cVar.f10010b = hVar2;
        if (cVar.f10009a == this) {
            cVar.f10009a = null;
        }
    }

    public final x I() {
        h J = J();
        x I = J != null ? J.I() : null;
        if (I != null) {
            c1 c1Var = (c1) I.h().m(u.f4403e);
            if (c1Var != null ? c1Var.d() : true) {
                return I;
            }
        }
        x xVar = this.C.f10012d;
        if (xVar != null) {
            return xVar;
        }
        i0.l("in order to access nested coroutine scope you need to attach dispatcher to the `Modifier.nestedScroll` first.");
        return null;
    }

    public final h J() {
        b1 b1Var;
        c2 c2Var = null;
        if (!this.B) {
            return null;
        }
        if (!this.f3305d.B) {
            z1.a.b("visitAncestors called on an unattached node");
        }
        k kVar = this.f3305d.f3309s;
        g0 u2 = c2.k.u(this);
        loop0: while (true) {
            if (u2 == null) {
                break;
            }
            if ((((k) u2.S.g).f3308r & 262144) != 0) {
                while (kVar != null) {
                    if ((kVar.f3307i & 262144) != 0) {
                        k kVar2 = kVar;
                        o0.e eVar = null;
                        while (kVar2 != null) {
                            if (kVar2 instanceof c2) {
                                c2 c2Var2 = (c2) kVar2;
                                if (Intrinsics.a(this.E, c2Var2.d()) && h.class == c2Var2.getClass()) {
                                    c2Var = c2Var2;
                                    break loop0;
                                }
                            }
                            if ((kVar2.f3307i & 262144) != 0 && (kVar2 instanceof j)) {
                                int i3 = 0;
                                for (k kVar3 = ((j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                                    if ((kVar3.f3307i & 262144) != 0) {
                                        i3++;
                                        if (i3 == 1) {
                                            kVar2 = kVar3;
                                        } else {
                                            if (eVar == null) {
                                                eVar = new o0.e(new k[16]);
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
        return (h) c2Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x004f, code lost:
    
        if (r14 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object K(long j, long j3, ld.a aVar) {
        f fVar;
        int i3;
        long j10;
        h J;
        long j11;
        if (aVar instanceof f) {
            fVar = (f) aVar;
            int i10 = fVar.f10018s;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f10018s = i10 - Integer.MIN_VALUE;
                f fVar2 = fVar;
                Object obj = fVar2.f10016i;
                md.a aVar2 = md.a.f6622d;
                i3 = fVar2.f10018s;
                long j12 = 0;
                if (i3 != 0) {
                    cf.c.M(obj);
                    fVar2.f10014d = j;
                    fVar2.f10015e = j3;
                    fVar2.f10018s = 1;
                    obj = new p(0L);
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j11 = fVar2.f10014d;
                        cf.c.M(obj);
                        j12 = ((p) obj).f10338a;
                        j10 = j11;
                        return new p(p.b(j10, j12));
                    }
                    j3 = fVar2.f10015e;
                    j = fVar2.f10014d;
                    cf.c.M(obj);
                }
                j10 = ((p) obj).f10338a;
                boolean z10 = this.B;
                J = !z10 ? z10 ? J() : null : this.D;
                if (J != null) {
                    long b10 = p.b(j, j10);
                    long a9 = p.a(j3, j10);
                    fVar2.f10014d = j10;
                    fVar2.f10018s = 2;
                    obj = J.K(b10, a9, fVar2);
                    if (obj != aVar2) {
                        j11 = j10;
                        j12 = ((p) obj).f10338a;
                        j10 = j11;
                    }
                    return aVar2;
                }
                return new p(p.b(j10, j12));
            }
        }
        fVar = new f(this, (nd.c) aVar);
        f fVar22 = fVar;
        Object obj2 = fVar22.f10016i;
        md.a aVar22 = md.a.f6622d;
        i3 = fVar22.f10018s;
        long j122 = 0;
        if (i3 != 0) {
        }
        j10 = ((p) obj2).f10338a;
        boolean z102 = this.B;
        J = !z102 ? z102 ? J() : null : this.D;
        if (J != null) {
        }
        return new p(p.b(j10, j122));
    }

    public final long L(int i3, long j, long j3) {
        h J = this.B ? J() : null;
        return j1.b.d(0L, J != null ? J.L(i3, j1.b.d(j, 0L), j1.b.c(j3, 0L)) : 0L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r13 == r1) goto L28;
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object M(long j, ld.a aVar) {
        g gVar;
        int i3;
        long j3;
        long j10;
        if (aVar instanceof g) {
            gVar = (g) aVar;
            int i10 = gVar.f10022r;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f10022r = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f10020e;
                md.a aVar2 = md.a.f6622d;
                i3 = gVar.f10022r;
                if (i3 != 0) {
                    cf.c.M(obj);
                    h J = this.B ? J() : null;
                    if (J != null) {
                        gVar.f10019d = j;
                        gVar.f10022r = 1;
                        obj = J.M(j, gVar);
                    } else {
                        j3 = j;
                        j10 = 0;
                        p.a(j3, j10);
                        gVar.f10019d = j10;
                        gVar.f10022r = 2;
                        obj = new p(0L);
                    }
                } else {
                    if (i3 != 1) {
                        if (i3 != 2) {
                            i0.l("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j10 = gVar.f10019d;
                        cf.c.M(obj);
                        return new p(p.b(j10, ((p) obj).f10338a));
                    }
                    j = gVar.f10019d;
                    cf.c.M(obj);
                }
                j3 = j;
                j10 = ((p) obj).f10338a;
                p.a(j3, j10);
                gVar.f10019d = j10;
                gVar.f10022r = 2;
                obj = new p(0L);
            }
        }
        gVar = new g(this, (nd.c) aVar);
        Object obj2 = gVar.f10020e;
        md.a aVar22 = md.a.f6622d;
        i3 = gVar.f10022r;
        if (i3 != 0) {
        }
        j3 = j;
        j10 = ((p) obj2).f10338a;
        p.a(j3, j10);
        gVar.f10019d = j10;
        gVar.f10022r = 2;
        obj2 = new p(0L);
    }

    public final long N(int i3, long j) {
        h J = this.B ? J() : null;
        long N = J != null ? J.N(i3, j) : 0L;
        j1.b.c(j, N);
        return j1.b.d(N, 0L);
    }

    @Override // c2.c2
    public final Object d() {
        return this.E;
    }
}
