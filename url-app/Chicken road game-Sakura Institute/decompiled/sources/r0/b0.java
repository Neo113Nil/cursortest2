package r0;

import i.AbstractC0662C;
import k.C0743i;
import n.AbstractC0864b;
import n0.C0865a;
import p0.InterfaceC0982r;
import q0.InterfaceC1050c;
import q0.InterfaceC1052e;
import q0.InterfaceC1053f;
import s.C1099c;
import s0.C1166s;

/* loaded from: classes.dex */
public abstract class b0 {

    /* renamed from: a, reason: collision with root package name */
    public static final i.v f9773a;

    static {
        i.v vVar = AbstractC0662C.f6889a;
        f9773a = new i.v();
    }

    public static final void a(S.n nVar) {
        if (nVar.f3990s) {
            b(nVar, -1, 1);
        } else {
            AbstractC0864b.D("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(S.n nVar, int i2, int i4) {
        if (!(nVar instanceof AbstractC1073n)) {
            c(nVar, i2 & nVar.f3980i, i4);
            return;
        }
        AbstractC1073n abstractC1073n = (AbstractC1073n) nVar;
        c(nVar, abstractC1073n.f9825t & i2, i4);
        int i5 = (~abstractC1073n.f9825t) & i2;
        for (S.n nVar2 = abstractC1073n.f9826u; nVar2 != null; nVar2 = nVar2.f3983l) {
            b(nVar2, i5, i4);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(S.n nVar, int i2, int i4) {
        if (i4 != 0 || nVar.q0()) {
            if ((i2 & 2) != 0 && (nVar instanceof InterfaceC1081w)) {
                AbstractC1065f.o((InterfaceC1081w) nVar);
                if (i4 == 2) {
                    a0 t4 = AbstractC1065f.t(nVar, 2);
                    t4.f9765u = true;
                    t4.f9759H.invoke();
                    if (t4.f9761J != null) {
                        t4.j1(null, false);
                        t4.f9762r.S(false);
                    }
                }
            }
            if ((i2 & 128) != 0 && (nVar instanceof InterfaceC1080v) && i4 != 2) {
                AbstractC1065f.v(nVar).A();
            }
            if ((i2 & 256) != 0 && (nVar instanceof InterfaceC1075p) && i4 != 2) {
                E v4 = AbstractC1065f.v(nVar);
                L l4 = v4.f9584C;
                if (!l4.f9678e && !l4.f9677d && !v4.f9590I) {
                    C1166s c1166s = (C1166s) H.a(v4);
                    ((I.d) c1166s.f10330M.f9720e.f7976b).b(v4);
                    v4.f9590I = true;
                    c1166s.C(null);
                }
            }
            if ((i2 & 4) != 0 && (nVar instanceof InterfaceC1074o)) {
                AbstractC1065f.n((InterfaceC1074o) nVar);
            }
            if ((i2 & 8) != 0 && (nVar instanceof n0)) {
                AbstractC1065f.p((n0) nVar);
            }
            if ((i2 & 64) != 0 && (nVar instanceof j0)) {
                L l5 = AbstractC1065f.v((j0) nVar).f9584C;
                l5.f9691r.f9669v = true;
                J j4 = l5.f9692s;
                if (j4 != null) {
                    j4.f9630A = true;
                }
            }
            if ((i2 & 1024) != 0 && (nVar instanceof X.t) && i4 != 2) {
                X.d.q((X.t) nVar);
            }
            if ((i2 & 2048) != 0 && (nVar instanceof X.n)) {
                X.n nVar2 = (X.n) nVar;
                C1066g.f9797b = null;
                nVar2.n0(C1066g.f9796a);
                if (C1066g.f9797b != null) {
                    if (i4 == 2) {
                        S.n nVar3 = ((S.n) nVar2).f3978d;
                        if (!nVar3.f3990s) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        I.d dVar = new I.d(new S.n[16]);
                        S.n nVar4 = nVar3.f3983l;
                        if (nVar4 == null) {
                            AbstractC1065f.b(dVar, nVar3);
                        } else {
                            dVar.b(nVar4);
                        }
                        while (dVar.l()) {
                            S.n nVar5 = (S.n) dVar.n(dVar.f3332i - 1);
                            if ((nVar5.f3981j & 1024) == 0) {
                                AbstractC1065f.b(dVar, nVar5);
                            } else {
                                while (true) {
                                    if (nVar5 == null) {
                                        break;
                                    }
                                    if ((nVar5.f3980i & 1024) != 0) {
                                        I.d dVar2 = null;
                                        while (nVar5 != null) {
                                            if (nVar5 instanceof X.t) {
                                                X.d.q((X.t) nVar5);
                                            } else if ((nVar5.f3980i & 1024) != 0 && (nVar5 instanceof AbstractC1073n)) {
                                                int i5 = 0;
                                                for (S.n nVar6 = ((AbstractC1073n) nVar5).f9826u; nVar6 != null; nVar6 = nVar6.f3983l) {
                                                    if ((nVar6.f3980i & 1024) != 0) {
                                                        i5++;
                                                        if (i5 == 1) {
                                                            nVar5 = nVar6;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new I.d(new S.n[16]);
                                                            }
                                                            if (nVar5 != null) {
                                                                dVar2.b(nVar5);
                                                                nVar5 = null;
                                                            }
                                                            dVar2.b(nVar6);
                                                        }
                                                    }
                                                }
                                                if (i5 == 1) {
                                                }
                                            }
                                            nVar5 = AbstractC1065f.f(dVar2);
                                        }
                                    } else {
                                        nVar5 = nVar5.f3983l;
                                    }
                                }
                            }
                        }
                    } else {
                        X.f fVar = ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(nVar2)).getFocusOwner()).f5180g;
                        fVar.b(fVar.f4319e, nVar2);
                    }
                }
            }
            if ((i2 & 4096) == 0 || !(nVar instanceof X.c)) {
                return;
            }
            X.c cVar = (X.c) nVar;
            X.f fVar2 = ((androidx.compose.ui.focus.b) ((C1166s) AbstractC1065f.w(cVar)).getFocusOwner()).f5180g;
            fVar2.b(fVar2.f4318d, cVar);
        }
    }

    public static final void d(S.n nVar) {
        if (nVar.f3990s) {
            b(nVar, -1, 0);
        } else {
            AbstractC0864b.D("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(S.m mVar) {
        int i2 = mVar instanceof InterfaceC0982r ? 3 : 1;
        if (mVar instanceof W.e) {
            i2 |= 4;
        }
        if (mVar instanceof y0.j) {
            i2 |= 8;
        }
        if ((mVar instanceof InterfaceC1050c) || (mVar instanceof InterfaceC1053f)) {
            i2 |= 32;
        }
        if (mVar instanceof C1099c) {
            i2 |= 256;
        }
        return mVar instanceof C0743i ? i2 | 64 : i2;
    }

    public static final int f(S.n nVar) {
        int i2 = nVar.f3980i;
        if (i2 != 0) {
            return i2;
        }
        Class<?> cls = nVar.getClass();
        i.v vVar = f9773a;
        int c4 = vVar.c(cls);
        if (c4 >= 0) {
            return vVar.f6970c[c4];
        }
        int i4 = nVar instanceof InterfaceC1081w ? 3 : 1;
        if (nVar instanceof InterfaceC1074o) {
            i4 |= 4;
        }
        if (nVar instanceof n0) {
            i4 |= 8;
        }
        if (nVar instanceof l0) {
            i4 |= 16;
        }
        if (nVar instanceof InterfaceC1052e) {
            i4 |= 32;
        }
        if (nVar instanceof j0) {
            i4 |= 64;
        }
        if (nVar instanceof InterfaceC1080v) {
            i4 |= 128;
        }
        if (nVar instanceof InterfaceC1075p) {
            i4 |= 256;
        }
        if (nVar instanceof X.t) {
            i4 |= 1024;
        }
        if (nVar instanceof X.n) {
            i4 |= 2048;
        }
        if (nVar instanceof X.c) {
            i4 |= 4096;
        }
        if (nVar instanceof j0.d) {
            i4 |= 8192;
        }
        if (nVar instanceof C0865a) {
            i4 |= 16384;
        }
        if (nVar instanceof InterfaceC1071l) {
            i4 |= 32768;
        }
        int i5 = nVar instanceof q0 ? 262144 | i4 : i4;
        vVar.f(i5, cls);
        return i5;
    }

    public static final int g(S.n nVar) {
        if (!(nVar instanceof AbstractC1073n)) {
            return f(nVar);
        }
        AbstractC1073n abstractC1073n = (AbstractC1073n) nVar;
        int i2 = abstractC1073n.f9825t;
        for (S.n nVar2 = abstractC1073n.f9826u; nVar2 != null; nVar2 = nVar2.f3983l) {
            i2 |= g(nVar2);
        }
        return i2;
    }

    public static final boolean h(int i2) {
        return (i2 & 128) != 0;
    }
}
