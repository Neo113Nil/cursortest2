package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public abstract class j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final s.c0 f1591a;

    static {
        s.c0 c0Var = s.m0.f8346a;
        f1591a = new s.c0();
    }

    public static final void a(d1.k kVar, int i3, int i10) {
        if (!(kVar instanceof j)) {
            b(kVar, i3 & kVar.f3307i, i10);
            return;
        }
        j jVar = (j) kVar;
        int i11 = jVar.C;
        b(kVar, i11 & i3, i10);
        int i12 = (~i11) & i3;
        for (d1.k kVar2 = jVar.D; kVar2 != null; kVar2 = kVar2.f3310t) {
            a(kVar2, i12, i10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(d1.k kVar, int i3, int i10) {
        if (i10 != 0 || kVar.x()) {
            if ((i3 & 2) != 0 && (kVar instanceof v)) {
                k.m((v) kVar);
                if (i10 == 2) {
                    k.s(kVar, 2).P0();
                }
            }
            if ((i3 & 128) != 0 && i10 != 2) {
                k.u(kVar).B();
            }
            if ((4194304 & i3) != 0 && i10 != 2) {
                k.u(kVar).Q(false);
            }
            if ((i3 & 256) != 0 && (kVar instanceof m)) {
                if (i10 == 1) {
                    g0 u2 = k.u(kVar);
                    u2.W(u2.f1547c0 + 1);
                } else if (i10 == 2) {
                    k.u(kVar).W(r0.f1547c0 - 1);
                }
                if (i10 != 2) {
                    g0 u10 = k.u(kVar);
                    if (u10.f1547c0 != 0 && !u10.n() && !u10.p() && !u10.f1546b0) {
                        d2.v a9 = j0.a(u10);
                        c6.s sVar = a9.f3563m0.f1681e;
                        sVar.getClass();
                        if (u10.f1547c0 > 0) {
                            ((o0.e) sVar.f1868d).b(u10);
                            u10.f1546b0 = true;
                        }
                        a9.G(null);
                    }
                }
            }
            if ((i3 & 4) != 0 && (kVar instanceof l)) {
                k.l((l) kVar);
            }
            if ((i3 & 8) != 0 && (kVar instanceof x1)) {
                k.u(kVar).F = true;
            }
            if ((i3 & 64) != 0 && (kVar instanceof r1)) {
                k0 k0Var = k.u((r1) kVar).T;
                k0Var.f1606p.D = true;
                s0 s0Var = k0Var.f1607q;
                if (s0Var != null) {
                    s0Var.J = true;
                }
            }
            if ((i3 & 2048) != 0 && (kVar instanceof i1.p)) {
                i1.p pVar = (i1.p) kVar;
                c.f1504b = null;
                pVar.l(c.f1503a);
                if (c.f1504b != null) {
                    d1.k kVar2 = (d1.k) pVar;
                    if (!kVar2.f3305d.B) {
                        z1.a.b("visitChildren called on an unattached node");
                    }
                    o0.e eVar = new o0.e(new d1.k[16]);
                    d1.k kVar3 = kVar2.f3305d;
                    d1.k kVar4 = kVar3.f3310t;
                    if (kVar4 == null) {
                        k.b(eVar, kVar3);
                    } else {
                        eVar.b(kVar4);
                    }
                    while (true) {
                        int i11 = eVar.f7319i;
                        if (i11 == 0) {
                            break;
                        }
                        d1.k kVar5 = (d1.k) eVar.l(i11 - 1);
                        if ((kVar5.f3308r & 1024) == 0) {
                            k.b(eVar, kVar5);
                        } else {
                            while (true) {
                                if (kVar5 == null) {
                                    break;
                                }
                                if ((kVar5.f3307i & 1024) != 0) {
                                    o0.e eVar2 = null;
                                    while (kVar5 != null) {
                                        if (kVar5 instanceof i1.t) {
                                            i1.t tVar = (i1.t) kVar5;
                                            i1.e eVar3 = ((i1.k) k.v(tVar).getFocusOwner()).f4604d;
                                            if (eVar3.f4594c.a(tVar)) {
                                                eVar3.a();
                                            }
                                        } else if ((kVar5.f3307i & 1024) != 0 && (kVar5 instanceof j)) {
                                            int i12 = 0;
                                            for (d1.k kVar6 = ((j) kVar5).D; kVar6 != null; kVar6 = kVar6.f3310t) {
                                                if ((kVar6.f3307i & 1024) != 0) {
                                                    i12++;
                                                    if (i12 == 1) {
                                                        kVar5 = kVar6;
                                                    } else {
                                                        if (eVar2 == null) {
                                                            eVar2 = new o0.e(new d1.k[16]);
                                                        }
                                                        if (kVar5 != null) {
                                                            eVar2.b(kVar5);
                                                            kVar5 = null;
                                                        }
                                                        eVar2.b(kVar6);
                                                    }
                                                }
                                            }
                                            if (i12 == 1) {
                                            }
                                        }
                                        kVar5 = k.e(eVar2);
                                    }
                                } else {
                                    kVar5 = kVar5.f3310t;
                                }
                            }
                        }
                    }
                }
            }
            if ((i3 & 4096) != 0 && (kVar instanceof b)) {
                b bVar = (b) kVar;
                i1.e eVar4 = ((i1.k) k.v(bVar).getFocusOwner()).f4604d;
                if (eVar4.f4595d.a(bVar)) {
                    eVar4.a();
                }
            }
            if ((i3 & 2097152) != 0 && (kVar instanceof x.l) && i10 == 2) {
                ((x.l) kVar).L(true);
            }
        }
    }

    public static final void c(d1.k kVar) {
        if (!kVar.B) {
            z1.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(kVar, -1, 0);
    }

    public static final int d(d1.j jVar) {
        int i3 = jVar instanceof h1.c ? 5 : 1;
        if (jVar instanceof j2.b) {
            i3 |= 8;
        }
        if (jVar instanceof x1.q) {
            i3 |= 16;
        }
        if (jVar instanceof u.j) {
            i3 |= 64;
        }
        return jVar instanceof d2.l ? 524288 | i3 : i3;
    }

    public static final int e(d1.k kVar) {
        int i3 = kVar.f3307i;
        if (i3 != 0) {
            return i3;
        }
        Class<?> cls = kVar.getClass();
        s.c0 c0Var = f1591a;
        int c10 = c0Var.c(cls);
        if (c10 >= 0) {
            return c0Var.f8279c[c10];
        }
        int i10 = kVar instanceof v ? 3 : 1;
        if (kVar instanceof l) {
            i10 |= 4;
        }
        if (kVar instanceof x1) {
            i10 |= 8;
        }
        if (kVar instanceof t1) {
            i10 |= 16;
        }
        if (kVar instanceof b2.c) {
            i10 |= 32;
        }
        if (kVar instanceof r1) {
            i10 |= 64;
        }
        boolean z10 = kVar instanceof u;
        if (z10) {
            i10 |= 4194432;
        } else if (z10) {
            i10 |= 128;
        }
        if (kVar instanceof m) {
            i10 |= 256;
        }
        if (kVar instanceof i1.t) {
            i10 |= 1024;
        }
        if (kVar instanceof i1.p) {
            i10 |= 2048;
        }
        if (kVar instanceof b) {
            i10 |= 4096;
        }
        if (kVar instanceof v1.b) {
            i10 |= 8192;
        }
        boolean z11 = kVar instanceof d2.l;
        if (z11) {
            i10 |= 16384;
        }
        if (kVar instanceof h) {
            i10 |= 32768;
        }
        if (kVar instanceof c2) {
            i10 |= 262144;
        }
        if (z11) {
            i10 |= 524288;
        }
        if (kVar instanceof x.l) {
            i10 |= 2097152;
        }
        c0Var.f(i10, cls);
        return i10;
    }

    public static final int f(d1.k kVar) {
        if (!(kVar instanceof j)) {
            return e(kVar);
        }
        j jVar = (j) kVar;
        int i3 = jVar.C;
        for (d1.k kVar2 = jVar.D; kVar2 != null; kVar2 = kVar2.f3310t) {
            i3 |= f(kVar2);
        }
        return i3;
    }

    public static final boolean g(int i3) {
        return ((i3 & 128) != 0) | ((i3 & 4194304) != 0);
    }
}
