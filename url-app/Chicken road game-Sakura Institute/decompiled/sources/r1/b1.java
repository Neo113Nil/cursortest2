package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public abstract class b1 {

    /* renamed from: a, reason: collision with root package name */
    public static final i.u f7713a;

    static {
        i.u uVar = i.c0.f4730a;
        f7713a = new i.u();
    }

    public static final void a(s0.n nVar) {
        if (nVar.f8116r) {
            b(nVar, -1, 1);
        } else {
            a.a.M("autoInvalidateInsertedNode called on unattached node");
            throw null;
        }
    }

    public static final void b(s0.n nVar, int i7, int i8) {
        if (!(nVar instanceof m)) {
            c(nVar, i7 & nVar.f8106h, i8);
            return;
        }
        m mVar = (m) nVar;
        int i9 = mVar.f7852s;
        c(nVar, i9 & i7, i8);
        int i10 = (~i9) & i7;
        for (s0.n nVar2 = mVar.f7853t; nVar2 != null; nVar2 = nVar2.f8109k) {
            b(nVar2, i10, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(s0.n nVar, int i7, int i8) {
        if (i8 != 0 || nVar.p0()) {
            if ((i7 & 2) != 0 && (nVar instanceof w)) {
                f.n((w) nVar);
                if (i8 == 2) {
                    a1 r8 = f.r(nVar, 2);
                    r8.f7703t = true;
                    r8.G.a();
                    if (r8.I != null) {
                        r8.h1(null, false);
                        r8.f7700q.S(false);
                    }
                }
            }
            if ((i7 & 128) != 0 && (nVar instanceof v) && i8 != 2) {
                f.t(nVar).B();
            }
            if ((i7 & 256) != 0 && (nVar instanceof p) && i8 != 2) {
                d0 t2 = f.t(nVar);
                l0 l0Var = t2.B;
                if (!l0Var.f7835e && !l0Var.f7834d && !t2.H) {
                    s1.r rVar = (s1.r) g0.a(t2);
                    ((i0.d) rVar.L.f7895e.f7527g).b(t2);
                    t2.H = true;
                    rVar.C(null);
                }
            }
            if ((i7 & 4) != 0 && (nVar instanceof o)) {
                f.m((o) nVar);
            }
            if ((i7 & 8) != 0 && (nVar instanceof n1)) {
                f.o((n1) nVar);
            }
            if ((i7 & 64) != 0 && (nVar instanceof j1)) {
                l0 l0Var2 = f.t((j1) nVar).B;
                l0Var2.f7848r.f7821u = true;
                i0 i0Var = l0Var2.f7849s;
                if (i0Var != null) {
                    i0Var.f7801z = true;
                }
            }
            if ((i7 & 1024) != 0 && (nVar instanceof x0.r) && i8 != 2) {
                x0.d.q((x0.r) nVar);
            }
            if ((i7 & 2048) != 0 && (nVar instanceof x0.l)) {
                x0.l lVar = (x0.l) nVar;
                g.f7770b = null;
                lVar.E(g.f7769a);
                if (g.f7770b != null) {
                    if (i8 == 2) {
                        s0.n nVar2 = ((s0.n) lVar).f8104f;
                        if (!nVar2.f8116r) {
                            throw new IllegalStateException("visitChildren called on an unattached node");
                        }
                        i0.d dVar = new i0.d(new s0.n[16]);
                        s0.n nVar3 = nVar2.f8109k;
                        if (nVar3 == null) {
                            f.b(dVar, nVar2);
                        } else {
                            dVar.b(nVar3);
                        }
                        while (dVar.m()) {
                            s0.n nVar4 = (s0.n) dVar.o(dVar.f4842h - 1);
                            if ((nVar4.f8107i & 1024) == 0) {
                                f.b(dVar, nVar4);
                            } else {
                                while (true) {
                                    if (nVar4 == null) {
                                        break;
                                    }
                                    if ((nVar4.f8106h & 1024) != 0) {
                                        i0.d dVar2 = null;
                                        while (nVar4 != null) {
                                            if (nVar4 instanceof x0.r) {
                                                x0.d.q((x0.r) nVar4);
                                            } else if ((nVar4.f8106h & 1024) != 0 && (nVar4 instanceof m)) {
                                                int i9 = 0;
                                                for (s0.n nVar5 = ((m) nVar4).f7853t; nVar5 != null; nVar5 = nVar5.f8109k) {
                                                    if ((nVar5.f8106h & 1024) != 0) {
                                                        i9++;
                                                        if (i9 == 1) {
                                                            nVar4 = nVar5;
                                                        } else {
                                                            if (dVar2 == null) {
                                                                dVar2 = new i0.d(new s0.n[16]);
                                                            }
                                                            if (nVar4 != null) {
                                                                dVar2.b(nVar4);
                                                                nVar4 = null;
                                                            }
                                                            dVar2.b(nVar5);
                                                        }
                                                    }
                                                }
                                                if (i9 == 1) {
                                                }
                                            }
                                            nVar4 = f.f(dVar2);
                                        }
                                    } else {
                                        nVar4 = nVar4.f8109k;
                                    }
                                }
                            }
                        }
                    } else {
                        x0.e eVar = ((androidx.compose.ui.focus.b) ((s1.r) f.u(lVar)).getFocusOwner()).f717g;
                        eVar.b(eVar.f9601e, lVar);
                    }
                }
            }
            if ((i7 & 4096) == 0 || !(nVar instanceof x0.c)) {
                return;
            }
            x0.c cVar = (x0.c) nVar;
            x0.e eVar2 = ((androidx.compose.ui.focus.b) ((s1.r) f.u(cVar)).getFocusOwner()).f717g;
            eVar2.b(eVar2.f9600d, cVar);
        }
    }

    public static final void d(s0.n nVar) {
        if (nVar.f8116r) {
            b(nVar, -1, 0);
        } else {
            a.a.M("autoInvalidateUpdatedNode called on unattached node");
            throw null;
        }
    }

    public static final int e(s0.m mVar) {
        int i7 = mVar instanceof p1.r ? 3 : 1;
        if (mVar instanceof w0.e) {
            i7 |= 4;
        }
        if (mVar instanceof y1.j) {
            i7 |= 8;
        }
        if ((mVar instanceof q1.c) || (mVar instanceof q1.f)) {
            i7 |= 32;
        }
        if (mVar instanceof s.c) {
            i7 |= 256;
        }
        return mVar instanceof k.j ? i7 | 64 : i7;
    }

    public static final int f(s0.n nVar) {
        int i7 = nVar.f8106h;
        if (i7 != 0) {
            return i7;
        }
        Class<?> cls = nVar.getClass();
        i.u uVar = f7713a;
        int c4 = uVar.c(cls);
        if (c4 >= 0) {
            return uVar.f4800c[c4];
        }
        int i8 = nVar instanceof w ? 3 : 1;
        if (nVar instanceof o) {
            i8 |= 4;
        }
        if (nVar instanceof n1) {
            i8 |= 8;
        }
        if (nVar instanceof l1) {
            i8 |= 16;
        }
        if (nVar instanceof q1.e) {
            i8 |= 32;
        }
        if (nVar instanceof j1) {
            i8 |= 64;
        }
        if (nVar instanceof v) {
            i8 |= 128;
        }
        if (nVar instanceof p) {
            i8 |= 256;
        }
        if (nVar instanceof x0.r) {
            i8 |= 1024;
        }
        if (nVar instanceof x0.l) {
            i8 |= 2048;
        }
        if (nVar instanceof x0.c) {
            i8 |= 4096;
        }
        if (nVar instanceof j1.d) {
            i8 |= 8192;
        }
        if (nVar instanceof n1.a) {
            i8 |= 16384;
        }
        if (nVar instanceof k) {
            i8 |= 32768;
        }
        if (nVar instanceof q1) {
            i8 |= 262144;
        }
        uVar.f(i8, cls);
        return i8;
    }

    public static final int g(s0.n nVar) {
        if (!(nVar instanceof m)) {
            return f(nVar);
        }
        m mVar = (m) nVar;
        int i7 = mVar.f7852s;
        for (s0.n nVar2 = mVar.f7853t; nVar2 != null; nVar2 = nVar2.f8109k) {
            i7 |= g(nVar2);
        }
        return i7;
    }

    public static final boolean h(int i7) {
        return (i7 & 128) != 0;
    }
}
