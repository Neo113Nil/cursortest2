package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final o.d0 f7636a;

    static {
        o.d0 d0Var = o.o0.f5516a;
        f7636a = new o.d0();
    }

    public static final void a(y0.l lVar, int i, int i8) {
        if (!(lVar instanceof l)) {
            b(lVar, i & lVar.f8708f, i8);
            return;
        }
        l lVar2 = (l) lVar;
        int i9 = lVar2.f7706r;
        b(lVar, i9 & i, i8);
        int i10 = (~i9) & i;
        for (y0.l lVar3 = lVar2.f7707s; lVar3 != null; lVar3 = lVar3.i) {
            a(lVar3, i10, i8);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void b(y0.l lVar, int i, int i8) {
        if (i8 != 0 || lVar.g0()) {
            if ((i & 2) != 0 && (lVar instanceof v)) {
                f.m((v) lVar);
                if (i8 == 2) {
                    f.s(lVar, 2).S0();
                }
            }
            if ((i & 128) != 0 && (lVar instanceof u) && i8 != 2) {
                f.u(lVar).C();
            }
            if ((i & 256) != 0 && (lVar instanceof n)) {
                if (i8 == 1) {
                    f0 u7 = f.u(lVar);
                    u7.Z(u7.N + 1);
                } else if (i8 == 2) {
                    f.u(lVar).Z(r0.N - 1);
                }
                if (i8 != 2) {
                    f0 u8 = f.u(lVar);
                    if (u8.N != 0 && !u8.o() && !u8.p() && !u8.M) {
                        x1.t tVar = (x1.t) i0.a(u8);
                        a0.a0 a0Var = tVar.Q.f7790e;
                        a0Var.getClass();
                        if (u8.N > 0) {
                            ((o0.e) a0Var.f11e).b(u8);
                            u8.M = true;
                        }
                        tVar.D(null);
                    }
                }
            }
            if ((i & 4) != 0 && (lVar instanceof m)) {
                f.l((m) lVar);
            }
            if ((i & 8) != 0 && (lVar instanceof s1)) {
                f.u(lVar).f7653s = true;
            }
            if ((i & 64) != 0 && (lVar instanceof n1)) {
                j0 j0Var = f.u((n1) lVar).G;
                j0Var.f7700p.f7809s = true;
                s0 s0Var = j0Var.f7701q;
                if (s0Var != null) {
                    s0Var.f7776x = true;
                }
            }
            if ((i & 2048) != 0 && (lVar instanceof c)) {
                y0.k kVar = ((c) lVar).f7604r;
                t1.a.b("applyFocusProperties called on wrong node");
                a0.q.q(kVar);
                throw null;
            }
            if ((i & 4096) == 0 || !(lVar instanceof c)) {
                return;
            }
            c cVar = (c) lVar;
            d1.f fVar = ((d1.i) ((x1.t) f.v(cVar)).getFocusOwner()).f2069d;
            if (fVar.f2063d.a(cVar)) {
                fVar.a();
            }
        }
    }

    public static final void c(y0.l lVar) {
        if (!lVar.f8718q) {
            t1.a.b("autoInvalidateUpdatedNode called on unattached node");
        }
        a(lVar, -1, 0);
    }

    public static final int d(y0.k kVar) {
        int i = kVar instanceof x.a0 ? 3 : 1;
        if (kVar instanceof c1.e) {
            i |= 4;
        }
        if (kVar instanceof d2.k) {
            i |= 8;
        }
        if ((kVar instanceof v1.c) || (kVar instanceof x.a0)) {
            i |= 32;
        }
        if (kVar instanceof a0.f) {
            i |= 256;
        }
        if (kVar instanceof q.l) {
            i |= 64;
        }
        return kVar instanceof a2.a ? 524288 | i : i;
    }

    public static final int e(y0.l lVar) {
        int i = lVar.f8708f;
        if (i != 0) {
            return i;
        }
        Class<?> cls = lVar.getClass();
        o.d0 d0Var = f7636a;
        int d8 = d0Var.d(cls);
        if (d8 >= 0) {
            return d0Var.f5436c[d8];
        }
        int i8 = lVar instanceof v ? 3 : 1;
        if (lVar instanceof m) {
            i8 |= 4;
        }
        if (lVar instanceof s1) {
            i8 |= 8;
        }
        if (lVar instanceof p1) {
            i8 |= 16;
        }
        if (lVar instanceof v1.e) {
            i8 |= 32;
        }
        if (lVar instanceof n1) {
            i8 |= 64;
        }
        if (lVar instanceof u) {
            i8 |= 128;
        }
        if (lVar instanceof n) {
            i8 |= 256;
        }
        if (lVar instanceof d1.n) {
            i8 |= 1024;
        }
        if (lVar instanceof c) {
            i8 |= 2048;
        }
        if (lVar instanceof c) {
            i8 |= 4096;
        }
        if (lVar instanceof o1.c) {
            i8 |= 8192;
        }
        if (lVar instanceof s1.a) {
            i8 |= 16384;
        }
        if (lVar instanceof j) {
            i8 |= 32768;
        }
        if (lVar instanceof x1) {
            i8 |= 262144;
        }
        if (lVar instanceof a2.a) {
            i8 |= 524288;
        }
        d0Var.h(i8, cls);
        return i8;
    }

    public static final int f(y0.l lVar) {
        if (!(lVar instanceof l)) {
            return e(lVar);
        }
        l lVar2 = (l) lVar;
        int i = lVar2.f7706r;
        for (y0.l lVar3 = lVar2.f7707s; lVar3 != null; lVar3 = lVar3.i) {
            i |= f(lVar3);
        }
        return i;
    }

    public static final boolean g(int i) {
        return (i & 128) != 0;
    }
}
