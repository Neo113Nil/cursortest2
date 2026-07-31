package w1;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class h0 implements h1.d {

    /* renamed from: d, reason: collision with root package name */
    public final h1.b f7680d = new h1.b();

    /* renamed from: e, reason: collision with root package name */
    public m f7681e;

    @Override // h1.d
    public final void D(f1.g gVar, long j7, long j8, float f6, f1.m mVar) {
        this.f7680d.D(gVar, j7, j8, f6, mVar);
    }

    @Override // r2.c
    public final float E(long j7) {
        return this.f7680d.E(j7);
    }

    @Override // r2.c
    public final int H(float f6) {
        return this.f7680d.H(f6);
    }

    @Override // h1.d
    public final void I(f1.j jVar, f1.p pVar, float f6, h1.c cVar, int i) {
        this.f7680d.I(jVar, pVar, f6, cVar, i);
    }

    @Override // h1.d
    public final void L(long j7, long j8, long j9, float f6, int i) {
        this.f7680d.L(j7, j8, j9, f6, i);
    }

    @Override // h1.d
    public final long M() {
        return this.f7680d.M();
    }

    @Override // r2.c
    public final long O(long j7) {
        return this.f7680d.O(j7);
    }

    @Override // r2.c
    public final float R(long j7) {
        return this.f7680d.R(j7);
    }

    @Override // r2.c
    public final long V(float f6) {
        return this.f7680d.V(f6);
    }

    @Override // h1.d
    public final void Y(long j7, long j8, long j9, h1.c cVar, int i) {
        this.f7680d.Y(j7, j8, j9, cVar, i);
    }

    public final void a() {
        h1.b bVar = this.f7680d;
        f1.q m7 = bVar.f3075e.m();
        k kVar = this.f7681e;
        if (kVar == null) {
            throw a0.q.f("Attempting to drawContent for a `null` node. This usually means that a call to ContentDrawScope#drawContent() has been captured inside a lambda, and is being invoked outside of the draw pass. Capturing the scope this way is unsupported - if you are trying to record drawContent with graphicsLayer.record(), make sure you are using the GraphicsLayer#record function within DrawScope, instead of the member function on GraphicsLayer.");
        }
        y0.l lVar = (y0.l) kVar;
        y0.l lVar2 = lVar.f8706d.i;
        if (lVar2 != null && (lVar2.f8709g & 4) != 0) {
            while (lVar2 != null) {
                int i = lVar2.f8708f;
                if ((i & 2) != 0) {
                    break;
                } else if ((i & 4) != 0) {
                    break;
                } else {
                    lVar2 = lVar2.i;
                }
            }
        }
        lVar2 = null;
        if (lVar2 == null) {
            d1 s5 = f.s(kVar, 4);
            if (s5.E0() == lVar.f8706d) {
                s5 = s5.f7615s;
                q6.i.b(s5);
            }
            s5.U0(m7, (i1.b) bVar.f3075e.f85c);
            return;
        }
        o0.e eVar = null;
        while (lVar2 != null) {
            if (lVar2 instanceof m) {
                m mVar = (m) lVar2;
                i1.b bVar2 = (i1.b) bVar.f3075e.f85c;
                d1 s7 = f.s(mVar, 4);
                long R = m.a.R(s7.f7232f);
                f0 f0Var = s7.f7614r;
                f0Var.getClass();
                ((x1.t) i0.a(f0Var)).getSharedDrawScope().d(m7, R, s7, mVar, bVar2);
            } else if ((lVar2.f8708f & 4) != 0 && (lVar2 instanceof l)) {
                int i8 = 0;
                for (y0.l lVar3 = ((l) lVar2).f7707s; lVar3 != null; lVar3 = lVar3.i) {
                    if ((lVar3.f8708f & 4) != 0) {
                        i8++;
                        if (i8 == 1) {
                            lVar2 = lVar3;
                        } else {
                            if (eVar == null) {
                                eVar = new o0.e(new y0.l[16]);
                            }
                            if (lVar2 != null) {
                                eVar.b(lVar2);
                                lVar2 = null;
                            }
                            eVar.b(lVar3);
                        }
                    }
                }
                if (i8 == 1) {
                }
            }
            lVar2 = f.f(eVar);
        }
    }

    @Override // r2.c
    public final float a0(int i) {
        return this.f7680d.a0(i);
    }

    @Override // r2.c
    public final float b() {
        return this.f7680d.b();
    }

    @Override // h1.d
    public final long c() {
        return this.f7680d.c();
    }

    @Override // r2.c
    public final float c0(float f6) {
        return f6 / this.f7680d.b();
    }

    public final void d(f1.q qVar, long j7, d1 d1Var, m mVar, i1.b bVar) {
        m mVar2 = this.f7681e;
        this.f7681e = mVar;
        r2.l lVar = d1Var.f7614r.f7660z;
        h1.b bVar2 = this.f7680d;
        a0.g1 g1Var = bVar2.f3075e;
        h1.a aVar = ((h1.b) g1Var.f86d).f3074d;
        r2.c cVar = aVar.f3070a;
        r2.l lVar2 = aVar.f3071b;
        f1.q m7 = g1Var.m();
        a0.g1 g1Var2 = bVar2.f3075e;
        long u7 = g1Var2.u();
        i1.b bVar3 = (i1.b) g1Var2.f85c;
        g1Var2.K(d1Var);
        g1Var2.L(lVar);
        g1Var2.J(qVar);
        g1Var2.M(j7);
        g1Var2.f85c = bVar;
        qVar.h();
        try {
            mVar.A(this);
            qVar.f();
            g1Var2.K(cVar);
            g1Var2.L(lVar2);
            g1Var2.J(m7);
            g1Var2.M(u7);
            g1Var2.f85c = bVar3;
            this.f7681e = mVar2;
        } catch (Throwable th) {
            qVar.f();
            g1Var2.K(cVar);
            g1Var2.L(lVar2);
            g1Var2.J(m7);
            g1Var2.M(u7);
            g1Var2.f85c = bVar3;
            throw th;
        }
    }

    public final void e(f1.j jVar, long j7, h1.c cVar) {
        h1.b bVar = this.f7680d;
        bVar.f3074d.f3072c.n(jVar, h1.b.a(bVar, j7, cVar, 3));
    }

    public final void f(f1.p pVar, long j7, long j8, float f6, h1.c cVar) {
        h1.b bVar = this.f7680d;
        int i = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        bVar.f3074d.f3072c.o(Float.intBitsToFloat(i), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat(i8) + Float.intBitsToFloat((int) (j8 & 4294967295L)), bVar.d(pVar, cVar, f6, null, 3));
    }

    public final void g(f1.p pVar, long j7, long j8, long j9, float f6, h1.c cVar) {
        h1.b bVar = this.f7680d;
        int i = (int) (j7 >> 32);
        int i8 = (int) (j7 & 4294967295L);
        bVar.f3074d.f3072c.j(Float.intBitsToFloat(i), Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j8 >> 32)) + Float.intBitsToFloat(i), Float.intBitsToFloat((int) (j8 & 4294967295L)) + Float.intBitsToFloat(i8), Float.intBitsToFloat((int) (j9 >> 32)), Float.intBitsToFloat((int) (j9 & 4294967295L)), bVar.d(pVar, cVar, f6, null, 3));
    }

    @Override // h1.d
    public final r2.l getLayoutDirection() {
        return this.f7680d.f3074d.f3071b;
    }

    @Override // r2.c
    public final float i() {
        return this.f7680d.i();
    }

    @Override // h1.d
    public final void n(float f6, long j7, long j8) {
        this.f7680d.n(f6, j7, j8);
    }

    @Override // r2.c
    public final long s(float f6) {
        return this.f7680d.s(f6);
    }

    @Override // r2.c
    public final float u(float f6) {
        return this.f7680d.b() * f6;
    }

    @Override // h1.d
    public final a0.g1 y() {
        return this.f7680d.f3075e;
    }
}
