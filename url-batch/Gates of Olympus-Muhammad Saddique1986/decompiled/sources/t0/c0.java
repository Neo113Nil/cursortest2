package t0;

import j.AbstractC0520B;
import j.C0547u;
import l.C0583i;
import n.z0;
import p0.C0800a;
import r0.InterfaceC0921r;
import s0.InterfaceC0957c;
import s0.InterfaceC0959e;
import s0.InterfaceC0960f;
import t.C0976d;
import u0.C1123s;

/* loaded from: classes.dex */
public abstract class c0 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0547u f8726a;

    static {
        C0547u c0547u = AbstractC0520B.f6252a;
        f8726a = new C0547u();
    }

    public static final void a(U.p pVar) {
        if (pVar.f4501p) {
            b(pVar, -1, 1);
        } else {
            z0.o("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(U.p pVar, int i3, int i4) {
        if (!(pVar instanceof AbstractC1000m)) {
            c(pVar, i3 & pVar.f4491f, i4);
            return;
        }
        AbstractC1000m abstractC1000m = (AbstractC1000m) pVar;
        c(pVar, abstractC1000m.f8770q & i3, i4);
        int i5 = (~abstractC1000m.f8770q) & i3;
        for (U.p pVar2 = abstractC1000m.f8771r; pVar2 != null; pVar2 = pVar2.f4494i) {
            b(pVar2, i5, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(U.p pVar, int i3, int i4) {
        if (i4 != 0 || pVar.n0()) {
            if ((i3 & 2) != 0 && (pVar instanceof InterfaceC1009w)) {
                AbstractC0993f.n((InterfaceC1009w) pVar);
                if (i4 == 2) {
                    b0 r3 = AbstractC0993f.r(pVar, 2);
                    r3.f8714r = true;
                    r3.f8708E.b();
                    if (r3.f8710G != null) {
                        r3.f1(null, false);
                        r3.f8711o.S(false);
                    }
                }
            }
            if ((i3 & 128) != 0 && (pVar instanceof InterfaceC1008v) && i4 != 2) {
                AbstractC0993f.t(pVar).A();
            }
            if ((i3 & 256) != 0 && (pVar instanceof InterfaceC1003p) && i4 != 2) {
                E t3 = AbstractC0993f.t(pVar);
                M m3 = t3.f8562z;
                if (!m3.f8629e && !m3.f8628d && !t3.f8536F) {
                    C1123s c1123s = (C1123s) H.a(t3);
                    ((K.d) c1123s.f9460J.f8671e.f10466e).b(t3);
                    t3.f8536F = true;
                    c1123s.D(null);
                }
            }
            if ((i3 & 4) != 0 && (pVar instanceof InterfaceC1002o)) {
                AbstractC0993f.m((InterfaceC1002o) pVar);
            }
            if ((i3 & 8) != 0 && (pVar instanceof o0)) {
                AbstractC0993f.o((o0) pVar);
            }
            if ((i3 & 64) != 0 && (pVar instanceof k0)) {
                M m4 = AbstractC0993f.t((k0) pVar).f8562z;
                m4.f8642r.f8615s = true;
                J j3 = m4.f8643s;
                if (j3 != null) {
                    j3.f8595x = true;
                }
            }
            if ((i3 & 1024) != 0 && (pVar instanceof Z.t) && i4 != 2) {
                Z.d.q((Z.t) pVar);
            }
            if ((i3 & 2048) != 0 && (pVar instanceof Z.n)) {
                Z.n nVar = (Z.n) pVar;
                C0994g.f8747b = null;
                nVar.f0(C0994g.f8746a);
                if (C0994g.f8747b != null) {
                    if (i4 == 2) {
                        U.p pVar2 = ((U.p) nVar).f4489d;
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
                                            if (pVar4 instanceof Z.t) {
                                                Z.d.q((Z.t) pVar4);
                                            } else if ((pVar4.f4491f & 1024) != 0 && (pVar4 instanceof AbstractC1000m)) {
                                                int i5 = 0;
                                                for (U.p pVar5 = ((AbstractC1000m) pVar4).f8771r; pVar5 != null; pVar5 = pVar5.f4494i) {
                                                    if ((pVar5.f4491f & 1024) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
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
                                                if (i5 == 1) {
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
                    } else {
                        Z.f fVar = ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(nVar)).getFocusOwner()).f4905g;
                        fVar.b(fVar.f4673e, nVar);
                    }
                }
            }
            if ((i3 & 4096) == 0 || !(pVar instanceof Z.c)) {
                return;
            }
            Z.c cVar = (Z.c) pVar;
            Z.f fVar2 = ((androidx.compose.ui.focus.b) ((C1123s) AbstractC0993f.u(cVar)).getFocusOwner()).f4905g;
            fVar2.b(fVar2.f4672d, cVar);
        }
    }

    public static final void d(U.p pVar) {
        if (pVar.f4501p) {
            b(pVar, -1, 0);
        } else {
            z0.o("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(U.o oVar) {
        int i3 = oVar instanceof InterfaceC0921r ? 3 : 1;
        if (oVar instanceof Y.e) {
            i3 |= 4;
        }
        if (oVar instanceof A0.j) {
            i3 |= 8;
        }
        if ((oVar instanceof InterfaceC0957c) || (oVar instanceof InterfaceC0960f)) {
            i3 |= 32;
        }
        if (oVar instanceof C0976d) {
            i3 |= 256;
        }
        return oVar instanceof C0583i ? i3 | 64 : i3;
    }

    public static final int f(U.p pVar) {
        int i3 = pVar.f4491f;
        if (i3 != 0) {
            return i3;
        }
        Class<?> cls = pVar.getClass();
        C0547u c0547u = f8726a;
        int c2 = c0547u.c(cls);
        if (c2 >= 0) {
            return c0547u.f6332c[c2];
        }
        int i4 = pVar instanceof InterfaceC1009w ? 3 : 1;
        if (pVar instanceof InterfaceC1002o) {
            i4 |= 4;
        }
        if (pVar instanceof o0) {
            i4 |= 8;
        }
        if (pVar instanceof m0) {
            i4 |= 16;
        }
        if (pVar instanceof InterfaceC0959e) {
            i4 |= 32;
        }
        if (pVar instanceof k0) {
            i4 |= 64;
        }
        if (pVar instanceof InterfaceC1008v) {
            i4 |= 128;
        }
        if (pVar instanceof InterfaceC1003p) {
            i4 |= 256;
        }
        if (pVar instanceof Z.t) {
            i4 |= 1024;
        }
        if (pVar instanceof Z.n) {
            i4 |= 2048;
        }
        if (pVar instanceof Z.c) {
            i4 |= 4096;
        }
        if (pVar instanceof l0.d) {
            i4 |= 8192;
        }
        if (pVar instanceof C0800a) {
            i4 |= 16384;
        }
        if (pVar instanceof InterfaceC0998k) {
            i4 |= 32768;
        }
        int i5 = pVar instanceof r0 ? 262144 | i4 : i4;
        c0547u.f(i5, cls);
        return i5;
    }

    public static final int g(U.p pVar) {
        if (!(pVar instanceof AbstractC1000m)) {
            return f(pVar);
        }
        AbstractC1000m abstractC1000m = (AbstractC1000m) pVar;
        int i3 = abstractC1000m.f8770q;
        for (U.p pVar2 = abstractC1000m.f8771r; pVar2 != null; pVar2 = pVar2.f4494i) {
            i3 |= g(pVar2);
        }
        return i3;
    }

    public static final boolean h(int i3) {
        return (i3 & 128) != 0;
    }
}
