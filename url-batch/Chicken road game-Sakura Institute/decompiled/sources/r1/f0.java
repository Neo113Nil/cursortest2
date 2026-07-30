package r1;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class f0 implements b1.e {

    /* renamed from: f, reason: collision with root package name */
    public final b1.c f7767f = new b1.c();

    /* renamed from: g, reason: collision with root package name */
    public o f7768g;

    @Override // b1.e
    public final b1.b B() {
        return this.f7767f.f1234g;
    }

    @Override // m2.b
    public final float G(long j8) {
        return this.f7767f.G(j8);
    }

    @Override // b1.e
    public final void H(long j8, long j9, long j10, long j11, b1.f fVar) {
        this.f7767f.H(j8, j9, j10, j11, fVar);
    }

    @Override // b1.e
    public final void J(long j8, long j9, long j10, int i7) {
        this.f7767f.J(j8, j9, j10, i7);
    }

    @Override // m2.b
    public final int K(float f9) {
        return this.f7767f.K(f9);
    }

    @Override // b1.e
    public final void L(z0.h hVar, long j8, long j9, long j10, float f9, z0.m mVar, int i7) {
        this.f7767f.L(hVar, j8, j9, j10, f9, mVar, i7);
    }

    @Override // b1.e
    public final void P(long j8, long j9, long j10, float f9, int i7) {
        this.f7767f.P(j8, j9, j10, f9, i7);
    }

    @Override // b1.e
    public final long Q() {
        return this.f7767f.Q();
    }

    @Override // b1.e
    public final void T(long j8, float f9, float f10, long j9, long j10, b1.f fVar) {
        this.f7767f.T(j8, f9, f10, j9, j10, fVar);
    }

    @Override // m2.b
    public final long U(long j8) {
        return this.f7767f.U(j8);
    }

    @Override // m2.b
    public final float X(long j8) {
        return this.f7767f.X(j8);
    }

    @Override // b1.e
    public final void Y(z0.k0 k0Var, long j8, b1.f fVar) {
        this.f7767f.Y(k0Var, j8, fVar);
    }

    @Override // b1.e
    public final void Z(z0.k0 k0Var, z0.p pVar, float f9, b1.f fVar, int i7) {
        this.f7767f.Z(k0Var, pVar, f9, fVar, i7);
    }

    @Override // m2.b
    public final float a() {
        return this.f7767f.a();
    }

    public final void b() {
        b1.c cVar = this.f7767f;
        z0.r k8 = cVar.f1234g.k();
        l lVar = this.f7768g;
        r6.k.c(lVar);
        s0.n nVar = (s0.n) lVar;
        s0.n nVar2 = nVar.f8104f.f8109k;
        if (nVar2 != null && (nVar2.f8107i & 4) != 0) {
            while (nVar2 != null) {
                int i7 = nVar2.f8106h;
                if ((i7 & 2) != 0) {
                    break;
                } else if ((i7 & 4) != 0) {
                    break;
                } else {
                    nVar2 = nVar2.f8109k;
                }
            }
        }
        nVar2 = null;
        if (nVar2 == null) {
            a1 r8 = f.r(lVar, 4);
            if (r8.M0() == nVar.f8104f) {
                r8 = r8.f7701r;
                r6.k.c(r8);
            }
            r8.Y0(k8, (c1.c) cVar.f1234g.f1231h);
            return;
        }
        i0.d dVar = null;
        while (nVar2 != null) {
            if (nVar2 instanceof o) {
                o oVar = (o) nVar2;
                c1.c cVar2 = (c1.c) cVar.f1234g.f1231h;
                a1 r9 = f.r(oVar, 4);
                long o02 = j1.c.o0(r9.f7065h);
                d0 d0Var = r9.f7700q;
                d0Var.getClass();
                ((s1.r) g0.a(d0Var)).getSharedDrawScope().c(k8, o02, r9, oVar, cVar2);
            } else if ((nVar2.f8106h & 4) != 0 && (nVar2 instanceof m)) {
                int i8 = 0;
                for (s0.n nVar3 = ((m) nVar2).f7853t; nVar3 != null; nVar3 = nVar3.f8109k) {
                    if ((nVar3.f8106h & 4) != 0) {
                        i8++;
                        if (i8 == 1) {
                            nVar2 = nVar3;
                        } else {
                            if (dVar == null) {
                                dVar = new i0.d(new s0.n[16]);
                            }
                            if (nVar2 != null) {
                                dVar.b(nVar2);
                                nVar2 = null;
                            }
                            dVar.b(nVar3);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            nVar2 = f.f(dVar);
        }
    }

    public final void c(z0.r rVar, long j8, a1 a1Var, o oVar, c1.c cVar) {
        o oVar2 = this.f7768g;
        this.f7768g = oVar;
        m2.k kVar = a1Var.f7700q.f7736w;
        b1.c cVar2 = this.f7767f;
        b1.b bVar = cVar2.f1234g;
        b1.a aVar = ((b1.c) bVar.f1232i).f1233f;
        m2.b bVar2 = aVar.f1225a;
        m2.k kVar2 = aVar.f1226b;
        z0.r k8 = bVar.k();
        b1.b bVar3 = cVar2.f1234g;
        long p6 = bVar3.p();
        c1.c cVar3 = (c1.c) bVar3.f1231h;
        bVar3.A(a1Var);
        bVar3.B(kVar);
        bVar3.z(rVar);
        bVar3.C(j8);
        bVar3.f1231h = cVar;
        rVar.o();
        try {
            oVar.c(this);
            rVar.n();
            bVar3.A(bVar2);
            bVar3.B(kVar2);
            bVar3.z(k8);
            bVar3.C(p6);
            bVar3.f1231h = cVar3;
            this.f7768g = oVar2;
        } catch (Throwable th) {
            rVar.n();
            bVar3.A(bVar2);
            bVar3.B(kVar2);
            bVar3.z(k8);
            bVar3.C(p6);
            bVar3.f1231h = cVar3;
            throw th;
        }
    }

    @Override // b1.e
    public final long d() {
        return this.f7767f.d();
    }

    @Override // m2.b
    public final long g0(float f9) {
        return this.f7767f.g0(f9);
    }

    @Override // b1.e
    public final m2.k getLayoutDirection() {
        return this.f7767f.f1233f.f1226b;
    }

    @Override // m2.b
    public final float k0(int i7) {
        return this.f7767f.k0(i7);
    }

    @Override // m2.b
    public final float l0(float f9) {
        return f9 / this.f7767f.a();
    }

    @Override // m2.b
    public final float m() {
        return this.f7767f.m();
    }

    @Override // b1.e
    public final void r(float f9, long j8, long j9) {
        this.f7767f.r(f9, j8, j9);
    }

    @Override // m2.b
    public final long w(float f9) {
        return this.f7767f.w(f9);
    }

    @Override // m2.b
    public final long x(long j8) {
        return this.f7767f.x(j8);
    }

    @Override // m2.b
    public final float y(float f9) {
        return this.f7767f.a() * f9;
    }
}
