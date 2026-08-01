package c2;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 implements m1.d {

    /* renamed from: d, reason: collision with root package name */
    public final m1.b f1585d = new m1.b();

    /* renamed from: e, reason: collision with root package name */
    public l f1586e;

    @Override // m1.d
    public final void D(k1.g gVar, k1.v vVar, float f3, m1.c cVar) {
        this.f1585d.D(gVar, vVar, f3, cVar);
    }

    @Override // m1.d
    public final long E() {
        return this.f1585d.E();
    }

    @Override // x2.c
    public final long H(long j) {
        return this.f1585d.H(j);
    }

    @Override // x2.c
    public final float I(long j) {
        return this.f1585d.I(j);
    }

    @Override // m1.d
    public final void M(k1.e eVar, long j, long j3, long j10, float f3, k1.j jVar, int i3) {
        this.f1585d.M(eVar, j, j3, j10, f3, jVar, i3);
    }

    @Override // x2.c
    public final long N(float f3) {
        return this.f1585d.N(f3);
    }

    @Override // m1.d
    public final void R(long j, float f3, long j3, m1.g gVar) {
        this.f1585d.R(j, f3, j3, gVar);
    }

    @Override // x2.c
    public final float S(int i3) {
        return this.f1585d.S(i3);
    }

    @Override // x2.c
    public final float T(float f3) {
        return f3 / this.f1585d.g();
    }

    public final void a() {
        m1.b bVar = this.f1585d;
        k1.n p4 = bVar.f6406e.p();
        i iVar = this.f1586e;
        if (iVar == null) {
            throw v4.a.h("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        d1.k kVar = (d1.k) iVar;
        d1.k kVar2 = kVar.f3305d.f3310t;
        if (kVar2 != null && (kVar2.f3308r & 4) != 0) {
            while (kVar2 != null) {
                int i3 = kVar2.f3307i;
                if ((i3 & 2) != 0) {
                    break;
                } else if ((i3 & 4) != 0) {
                    break;
                } else {
                    kVar2 = kVar2.f3310t;
                }
            }
        }
        kVar2 = null;
        if (kVar2 == null) {
            i1 s3 = k.s(iVar, 4);
            if (s3.D0() == kVar.f3305d) {
                s3 = s3.C;
                s3.getClass();
            }
            s3.S0(p4, (n1.b) bVar.f6406e.f40e);
            return;
        }
        o0.e eVar = null;
        while (kVar2 != null) {
            if (kVar2 instanceof l) {
                l lVar = (l) kVar2;
                n1.b bVar2 = (n1.b) bVar.f6406e.f40e;
                i1 s10 = k.s(lVar, 4);
                long b10 = z4.m.b(s10.f133i);
                g0 g0Var = s10.B;
                g0Var.getClass();
                j0.a(g0Var).getSharedDrawScope().b(p4, b10, s10, lVar, bVar2);
            } else if ((kVar2.f3307i & 4) != 0 && (kVar2 instanceof j)) {
                int i10 = 0;
                for (d1.k kVar3 = ((j) kVar2).D; kVar3 != null; kVar3 = kVar3.f3310t) {
                    if ((kVar3.f3307i & 4) != 0) {
                        i10++;
                        if (i10 == 1) {
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
                if (i10 == 1) {
                }
            }
            kVar2 = k.e(eVar);
        }
    }

    public final void b(k1.n nVar, long j, i1 i1Var, l lVar, n1.b bVar) {
        l lVar2 = this.f1586e;
        this.f1586e = lVar;
        x2.l lVar3 = i1Var.B.M;
        m1.b bVar2 = this.f1585d;
        a1.n nVar2 = bVar2.f6406e;
        m1.a aVar = ((m1.b) nVar2.f42r).f6405d;
        x2.c cVar = aVar.f6401a;
        x2.l lVar4 = aVar.f6402b;
        k1.n p4 = nVar2.p();
        a1.n nVar3 = bVar2.f6406e;
        long u2 = nVar3.u();
        n1.b bVar3 = (n1.b) nVar3.f40e;
        nVar3.I(i1Var);
        nVar3.J(lVar3);
        nVar3.H(nVar);
        nVar3.K(j);
        nVar3.f40e = bVar;
        nVar.h();
        try {
            lVar.f(this);
            nVar.f();
            nVar3.I(cVar);
            nVar3.J(lVar4);
            nVar3.H(p4);
            nVar3.K(u2);
            nVar3.f40e = bVar3;
            this.f1586e = lVar2;
        } catch (Throwable th) {
            nVar.f();
            nVar3.I(cVar);
            nVar3.J(lVar4);
            nVar3.H(p4);
            nVar3.K(u2);
            nVar3.f40e = bVar3;
            throw th;
        }
    }

    public final void c(k1.g gVar, long j, m1.c cVar) {
        m1.b bVar = this.f1585d;
        bVar.f6405d.f6403c.p(gVar, m1.b.a(bVar, j, cVar, 3));
    }

    @Override // x2.c
    public final float d() {
        return this.f1585d.d();
    }

    @Override // x2.c
    public final float g() {
        return this.f1585d.g();
    }

    @Override // m1.d
    public final x2.l getLayoutDirection() {
        return this.f1585d.f6405d.f6402b;
    }

    @Override // m1.d
    public final void i(long j, long j3, long j10, m1.c cVar, int i3) {
        this.f1585d.i(j, j3, j10, cVar, i3);
    }

    @Override // x2.c
    public final long l(float f3) {
        return this.f1585d.l(f3);
    }

    @Override // x2.c
    public final long m(long j) {
        return this.f1585d.m(j);
    }

    @Override // x2.c
    public final float n(float f3) {
        return this.f1585d.g() * f3;
    }

    @Override // m1.d
    public final a1.n s() {
        return this.f1585d.f6406e;
    }

    @Override // m1.d
    public final long u() {
        return this.f1585d.u();
    }

    @Override // x2.c
    public final float w(long j) {
        return this.f1585d.w(j);
    }

    @Override // x2.c
    public final int y(float f3) {
        return this.f1585d.y(f3);
    }
}
