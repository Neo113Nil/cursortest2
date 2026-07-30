package s1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class n1 implements r1.f1 {

    /* renamed from: f, reason: collision with root package name */
    public c1.c f8292f;

    /* renamed from: g, reason: collision with root package name */
    public final z0.c0 f8293g;

    /* renamed from: h, reason: collision with root package name */
    public final r f8294h;

    /* renamed from: i, reason: collision with root package name */
    public q6.e f8295i;

    /* renamed from: j, reason: collision with root package name */
    public q6.a f8296j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8298l;

    /* renamed from: n, reason: collision with root package name */
    public float[] f8300n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f8301o;

    /* renamed from: s, reason: collision with root package name */
    public int f8305s;

    /* renamed from: u, reason: collision with root package name */
    public z0.j0 f8307u;

    /* renamed from: v, reason: collision with root package name */
    public z0.j f8308v;

    /* renamed from: w, reason: collision with root package name */
    public f7.i0 f8309w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8310x;

    /* renamed from: k, reason: collision with root package name */
    public long f8297k = j1.c.G(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: m, reason: collision with root package name */
    public final float[] f8299m = z0.f0.a();

    /* renamed from: p, reason: collision with root package name */
    public m2.b f8302p = t6.a.b();

    /* renamed from: q, reason: collision with root package name */
    public m2.k f8303q = m2.k.f6322f;

    /* renamed from: r, reason: collision with root package name */
    public final b1.c f8304r = new b1.c();

    /* renamed from: t, reason: collision with root package name */
    public long f8306t = z0.s0.f10047b;

    /* renamed from: y, reason: collision with root package name */
    public final l0 f8311y = new l0(2, this);

    public n1(c1.c cVar, z0.c0 c0Var, r rVar, q6.e eVar, q6.a aVar) {
        this.f8292f = cVar;
        this.f8293g = c0Var;
        this.f8294h = rVar;
        this.f8295i = eVar;
        this.f8296j = aVar;
    }

    @Override // r1.f1
    public final void a(q6.e eVar, q6.a aVar) {
        z0.c0 c0Var = this.f8293g;
        if (c0Var == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f8292f.f1545r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f8292f = c0Var.b();
        this.f8298l = false;
        this.f8295i = eVar;
        this.f8296j = aVar;
        this.f8306t = z0.s0.f10047b;
        this.f8310x = false;
        this.f8297k = j1.c.G(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f8307u = null;
        this.f8305s = 0;
    }

    @Override // r1.f1
    public final long b(long j8, boolean z8) {
        if (!z8) {
            return z0.f0.b(j8, m());
        }
        float[] l8 = l();
        if (l8 != null) {
            return z0.f0.b(j8, l8);
        }
        return 9187343241974906880L;
    }

    @Override // r1.f1
    public final void c(z0.n0 n0Var) {
        q6.a aVar;
        q6.a aVar2;
        int i7 = n0Var.f10014f | this.f8305s;
        this.f8303q = n0Var.f10027s;
        this.f8302p = n0Var.f10026r;
        int i8 = i7 & 4096;
        if (i8 != 0) {
            this.f8306t = n0Var.f10022n;
        }
        if ((i7 & 1) != 0) {
            c1.c cVar = this.f8292f;
            float f9 = n0Var.f10015g;
            c1.e eVar = cVar.f1528a;
            if (eVar.q() != f9) {
                eVar.h(f9);
            }
        }
        if ((i7 & 2) != 0) {
            c1.c cVar2 = this.f8292f;
            float f10 = n0Var.f10016h;
            c1.e eVar2 = cVar2.f1528a;
            if (eVar2.I() != f10) {
                eVar2.l(f10);
            }
        }
        if ((i7 & 4) != 0) {
            c1.c cVar3 = this.f8292f;
            float f11 = n0Var.f10017i;
            c1.e eVar3 = cVar3.f1528a;
            if (eVar3.a() != f11) {
                eVar3.c(f11);
            }
        }
        if ((i7 & 8) != 0) {
            c1.e eVar4 = this.f8292f.f1528a;
            if (eVar4.x() != 0.0f) {
                eVar4.j();
            }
        }
        if ((i7 & 16) != 0) {
            c1.e eVar5 = this.f8292f.f1528a;
            if (eVar5.s() != 0.0f) {
                eVar5.e();
            }
        }
        boolean z8 = true;
        if ((i7 & 32) != 0) {
            c1.c cVar4 = this.f8292f;
            float f12 = n0Var.f10018j;
            c1.e eVar6 = cVar4.f1528a;
            if (eVar6.H() != f12) {
                eVar6.r(f12);
                cVar4.f1534g = true;
                cVar4.a();
            }
            if (n0Var.f10018j > 0.0f && !this.f8310x && (aVar2 = this.f8296j) != null) {
                aVar2.a();
            }
        }
        if ((i7 & 64) != 0) {
            c1.c cVar5 = this.f8292f;
            long j8 = n0Var.f10019k;
            c1.e eVar7 = cVar5.f1528a;
            if (!z0.u.c(j8, eVar7.N())) {
                eVar7.u(j8);
            }
        }
        if ((i7 & 128) != 0) {
            c1.c cVar6 = this.f8292f;
            long j9 = n0Var.f10020l;
            c1.e eVar8 = cVar6.f1528a;
            if (!z0.u.c(j9, eVar8.t())) {
                eVar8.C(j9);
            }
        }
        if ((i7 & 1024) != 0) {
            c1.e eVar9 = this.f8292f.f1528a;
            if (eVar9.K() != 0.0f) {
                eVar9.k();
            }
        }
        if ((i7 & 256) != 0) {
            c1.e eVar10 = this.f8292f.f1528a;
            if (eVar10.A() != 0.0f) {
                eVar10.b();
            }
        }
        if ((i7 & 512) != 0) {
            c1.e eVar11 = this.f8292f.f1528a;
            if (eVar11.G() != 0.0f) {
                eVar11.g();
            }
        }
        if ((i7 & 2048) != 0) {
            c1.c cVar7 = this.f8292f;
            float f13 = n0Var.f10021m;
            c1.e eVar12 = cVar7.f1528a;
            if (eVar12.w() != f13) {
                eVar12.o(f13);
            }
        }
        if (i8 != 0) {
            if (z0.s0.a(this.f8306t, z0.s0.f10047b)) {
                c1.c cVar8 = this.f8292f;
                if (!y0.c.b(cVar8.f1548u, 9205357640488583168L)) {
                    cVar8.f1548u = 9205357640488583168L;
                    cVar8.f1528a.M(9205357640488583168L);
                }
            } else {
                c1.c cVar9 = this.f8292f;
                long a3 = u3.r.a(z0.s0.b(this.f8306t) * ((int) (this.f8297k >> 32)), z0.s0.c(this.f8306t) * ((int) (this.f8297k & 4294967295L)));
                if (!y0.c.b(cVar9.f1548u, a3)) {
                    cVar9.f1548u = a3;
                    cVar9.f1528a.M(a3);
                }
            }
        }
        if ((i7 & 16384) != 0) {
            c1.c cVar10 = this.f8292f;
            boolean z9 = n0Var.f10024p;
            if (cVar10.f1549v != z9) {
                cVar10.f1549v = z9;
                cVar10.f1534g = true;
                cVar10.a();
            }
        }
        if ((131072 & i7) != 0) {
            c1.e eVar13 = this.f8292f.f1528a;
        }
        if ((32768 & i7) != 0) {
            c1.e eVar14 = this.f8292f.f1528a;
            if (eVar14.z() != 0) {
                eVar14.B(0);
            }
        }
        if (r6.k.a(this.f8307u, n0Var.f10028t)) {
            z8 = false;
        } else {
            z0.j0 j0Var = n0Var.f10028t;
            this.f8307u = j0Var;
            if (j0Var != null) {
                c1.c cVar11 = this.f8292f;
                if (j0Var instanceof z0.h0) {
                    y0.d dVar = ((z0.h0) j0Var).f9997a;
                    cVar11.f(0.0f, u3.r.a(dVar.f9780a, dVar.f9781b), v0.d.a(dVar.c(), dVar.b()));
                } else if (j0Var instanceof z0.g0) {
                    z0.k0 k0Var = ((z0.g0) j0Var).f9995a;
                    cVar11.f1538k = null;
                    cVar11.f1536i = 9205357640488583168L;
                    cVar11.f1535h = 0L;
                    cVar11.f1537j = 0.0f;
                    cVar11.f1534g = true;
                    cVar11.f1541n = false;
                    cVar11.f1539l = k0Var;
                    cVar11.a();
                } else if (j0Var instanceof z0.i0) {
                    z0.i0 i0Var = (z0.i0) j0Var;
                    z0.j jVar = i0Var.f10001b;
                    if (jVar != null) {
                        cVar11.f1538k = null;
                        cVar11.f1536i = 9205357640488583168L;
                        cVar11.f1535h = 0L;
                        cVar11.f1537j = 0.0f;
                        cVar11.f1534g = true;
                        cVar11.f1541n = false;
                        cVar11.f1539l = jVar;
                        cVar11.a();
                    } else {
                        y0.e eVar15 = i0Var.f10000a;
                        cVar11.f(y0.a.b(eVar15.f9791h), u3.r.a(eVar15.f9784a, eVar15.f9785b), v0.d.a(eVar15.b(), eVar15.a()));
                    }
                }
                if ((j0Var instanceof z0.g0) && Build.VERSION.SDK_INT < 33 && (aVar = this.f8296j) != null) {
                    aVar.a();
                }
            }
        }
        this.f8305s = n0Var.f10014f;
        if (i7 != 0 || z8) {
            int i9 = Build.VERSION.SDK_INT;
            r rVar = this.f8294h;
            if (i9 >= 26) {
                d3.f8199a.a(rVar);
            } else {
                rVar.invalidate();
            }
        }
    }

    @Override // r1.f1
    public final void d(long j8) {
        if (m2.j.a(j8, this.f8297k)) {
            return;
        }
        this.f8297k = j8;
        if (this.f8301o || this.f8298l) {
            return;
        }
        r rVar = this.f8294h;
        rVar.invalidate();
        if (true != this.f8301o) {
            this.f8301o = true;
            rVar.s(this, true);
        }
    }

    @Override // r1.f1
    public final void destroy() {
        this.f8295i = null;
        this.f8296j = null;
        this.f8298l = true;
        boolean z8 = this.f8301o;
        r rVar = this.f8294h;
        if (z8) {
            this.f8301o = false;
            rVar.s(this, false);
        }
        z0.c0 c0Var = this.f8293g;
        if (c0Var != null) {
            c0Var.a(this.f8292f);
            rVar.B(this);
        }
    }

    @Override // r1.f1
    public final void e(float[] fArr) {
        z0.f0.g(fArr, m());
    }

    @Override // r1.f1
    public final void f(float[] fArr) {
        float[] l8 = l();
        if (l8 != null) {
            z0.f0.g(fArr, l8);
        }
    }

    @Override // r1.f1
    public final void g(y0.b bVar, boolean z8) {
        if (!z8) {
            z0.f0.c(m(), bVar);
            return;
        }
        float[] l8 = l();
        if (l8 != null) {
            z0.f0.c(l8, bVar);
            return;
        }
        bVar.f9774a = 0.0f;
        bVar.f9775b = 0.0f;
        bVar.f9776c = 0.0f;
        bVar.f9777d = 0.0f;
    }

    @Override // r1.f1
    public final void h(long j8) {
        c1.c cVar = this.f8292f;
        if (!m2.h.a(cVar.f1546s, j8)) {
            cVar.f1546s = j8;
            cVar.f1528a.F((int) (j8 >> 32), (int) (j8 & 4294967295L), cVar.f1547t);
        }
        int i7 = Build.VERSION.SDK_INT;
        r rVar = this.f8294h;
        if (i7 >= 26) {
            d3.f8199a.a(rVar);
        } else {
            rVar.invalidate();
        }
    }

    @Override // r1.f1
    public final void i() {
        if (this.f8301o) {
            if (!z0.s0.a(this.f8306t, z0.s0.f10047b) && !m2.j.a(this.f8292f.f1547t, this.f8297k)) {
                c1.c cVar = this.f8292f;
                long a3 = u3.r.a(z0.s0.b(this.f8306t) * ((int) (this.f8297k >> 32)), z0.s0.c(this.f8306t) * ((int) (this.f8297k & 4294967295L)));
                if (!y0.c.b(cVar.f1548u, a3)) {
                    cVar.f1548u = a3;
                    cVar.f1528a.M(a3);
                }
            }
            c1.c cVar2 = this.f8292f;
            m2.b bVar = this.f8302p;
            m2.k kVar = this.f8303q;
            long j8 = this.f8297k;
            if (!m2.j.a(cVar2.f1547t, j8)) {
                cVar2.f1547t = j8;
                long j9 = cVar2.f1546s;
                cVar2.f1528a.F((int) (j9 >> 32), (int) (4294967295L & j9), j8);
                if (cVar2.f1536i == 9205357640488583168L) {
                    cVar2.f1534g = true;
                    cVar2.a();
                }
            }
            cVar2.f1529b = bVar;
            cVar2.f1530c = kVar;
            cVar2.f1531d = this.f8311y;
            cVar2.e();
            if (this.f8301o) {
                this.f8301o = false;
                this.f8294h.s(this, false);
            }
        }
    }

    @Override // r1.f1
    public final void invalidate() {
        if (this.f8301o || this.f8298l) {
            return;
        }
        r rVar = this.f8294h;
        rVar.invalidate();
        if (true != this.f8301o) {
            this.f8301o = true;
            rVar.s(this, true);
        }
    }

    @Override // r1.f1
    public final void j(z0.r rVar, c1.c cVar) {
        float f9;
        z0.r rVar2;
        z0.r rVar3;
        boolean z8;
        float f10;
        Canvas a3 = z0.e.a(rVar);
        if (!a3.isHardwareAccelerated()) {
            c1.c cVar2 = this.f8292f;
            long j8 = cVar2.f1546s;
            float f11 = (int) (j8 >> 32);
            float f12 = (int) (j8 & 4294967295L);
            long j9 = this.f8297k;
            float f13 = ((int) (j9 >> 32)) + f11;
            float f14 = ((int) (j9 & 4294967295L)) + f12;
            if (cVar2.f1528a.a() < 1.0f) {
                f7.i0 i0Var = this.f8309w;
                if (i0Var == null) {
                    i0Var = z0.l0.g();
                    this.f8309w = i0Var;
                }
                i0Var.c(this.f8292f.f1528a.a());
                Paint paint = (Paint) i0Var.f3488b;
                f9 = f11;
                a3.saveLayer(f9, f12, f13, f14, paint);
            } else {
                f9 = f11;
                rVar.o();
            }
            rVar.k(f9, f12);
            rVar.r(m());
            c1.c cVar3 = this.f8292f;
            boolean z9 = cVar3.f1549v;
            if (z9 && z9) {
                z0.j0 c4 = cVar3.c();
                if (c4 instanceof z0.h0) {
                    z0.r.h(rVar, ((z0.h0) c4).f9997a);
                } else if (c4 instanceof z0.i0) {
                    z0.j jVar = this.f8308v;
                    if (jVar == null) {
                        jVar = z0.l0.h();
                        this.f8308v = jVar;
                    }
                    jVar.d();
                    z0.k0.a(jVar, ((z0.i0) c4).f10000a);
                    rVar.i(jVar);
                } else if (c4 instanceof z0.g0) {
                    rVar.i(((z0.g0) c4).f9995a);
                }
            }
            q6.e eVar = this.f8295i;
            if (eVar != null) {
                eVar.d(rVar, null);
            }
            rVar.n();
            return;
        }
        i();
        this.f8310x = this.f8292f.f1528a.H() > 0.0f;
        b1.c cVar4 = this.f8304r;
        b1.b bVar = cVar4.f1234g;
        bVar.z(rVar);
        bVar.f1231h = cVar;
        c1.c cVar5 = this.f8292f;
        z0.r k8 = cVar4.B().k();
        c1.c cVar6 = (c1.c) cVar4.B().f1231h;
        c1.e eVar2 = cVar5.f1528a;
        if (cVar5.f1545r) {
            return;
        }
        cVar5.a();
        if (!eVar2.p()) {
            try {
                cVar5.e();
            } catch (Throwable unused) {
            }
        }
        boolean z10 = eVar2.H() > 0.0f;
        if (z10) {
            k8.s();
        }
        Canvas a9 = z0.e.a(k8);
        boolean isHardwareAccelerated = a9.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            rVar2 = k8;
        } else {
            a9.save();
            long j10 = cVar5.f1546s;
            float f15 = (int) (j10 >> 32);
            float f16 = (int) (j10 & 4294967295L);
            long j11 = cVar5.f1547t;
            rVar2 = k8;
            float f17 = ((int) (j11 >> 32)) + f15;
            float f18 = f16 + ((int) (j11 & 4294967295L));
            float a10 = eVar2.a();
            int L = eVar2.L();
            if (a10 < 1.0f || L != 3 || eVar2.z() == 1) {
                f7.i0 i0Var2 = cVar5.f1542o;
                if (i0Var2 == null) {
                    i0Var2 = z0.l0.g();
                    cVar5.f1542o = i0Var2;
                }
                i0Var2.c(a10);
                i0Var2.d(L);
                i0Var2.f(null);
                f10 = f15;
                a9.saveLayer(f10, f16, f17, f18, (Paint) i0Var2.f3488b);
            } else {
                a9.save();
                f10 = f15;
            }
            a9.translate(f10, f16);
            a9.concat(eVar2.D());
        }
        boolean z11 = !isHardwareAccelerated && cVar5.f1549v;
        if (z11) {
            rVar2.o();
            z0.j0 c6 = cVar5.c();
            if (c6 instanceof z0.h0) {
                rVar3 = rVar2;
                z0.r.h(rVar3, ((z0.h0) c6).f9997a);
            } else {
                rVar3 = rVar2;
                if (c6 instanceof z0.i0) {
                    z0.j jVar2 = cVar5.f1540m;
                    if (jVar2 != null) {
                        jVar2.f10002a.rewind();
                    } else {
                        jVar2 = z0.l0.h();
                        cVar5.f1540m = jVar2;
                    }
                    z0.k0.a(jVar2, ((z0.i0) c6).f10000a);
                    rVar3.i(jVar2);
                } else if (c6 instanceof z0.g0) {
                    rVar3.i(((z0.g0) c6).f9995a);
                }
            }
        } else {
            rVar3 = rVar2;
        }
        if (cVar6 != null) {
            c0.w wVar = cVar6.f1544q;
            if (!wVar.f1513a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            i.b0 b0Var = (i.b0) wVar.f1516d;
            if (b0Var != null) {
                b0Var.a(cVar5);
            } else if (((c1.c) wVar.f1514b) != null) {
                int i7 = i.f0.f4740a;
                i.b0 b0Var2 = new i.b0();
                c1.c cVar7 = (c1.c) wVar.f1514b;
                r6.k.c(cVar7);
                b0Var2.a(cVar7);
                b0Var2.a(cVar5);
                wVar.f1516d = b0Var2;
                wVar.f1514b = null;
            } else {
                wVar.f1514b = cVar5;
            }
            i.b0 b0Var3 = (i.b0) wVar.f1517e;
            if (b0Var3 != null) {
                z8 = !b0Var3.j(cVar5);
            } else if (((c1.c) wVar.f1515c) != cVar5) {
                z8 = true;
            } else {
                wVar.f1515c = null;
                z8 = false;
            }
            if (z8) {
                cVar5.f1543p++;
            }
        }
        eVar2.J(rVar3);
        if (z11) {
            rVar3.n();
        }
        if (z10) {
            rVar3.p();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a9.restore();
    }

    @Override // r1.f1
    public final boolean k(long j8) {
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        c1.c cVar = this.f8292f;
        if (cVar.f1549v) {
            return j0.u(cVar.c(), d8, e9);
        }
        return true;
    }

    public final float[] l() {
        float[] m8 = m();
        float[] fArr = this.f8300n;
        if (fArr == null) {
            fArr = z0.f0.a();
            this.f8300n = fArr;
        }
        if (j0.s(m8, fArr)) {
            return fArr;
        }
        return null;
    }

    public final float[] m() {
        c1.c cVar = this.f8292f;
        long j8 = cVar.f1548u;
        c1.e eVar = cVar.f1528a;
        long f9 = u3.r.i(j8) ? v0.d.f(j1.c.o0(this.f8297k)) : cVar.f1548u;
        float[] fArr = this.f8299m;
        z0.f0.d(fArr);
        float[] a3 = z0.f0.a();
        z0.f0.h(a3, -y0.c.d(f9), -y0.c.e(f9));
        z0.f0.g(fArr, a3);
        float[] a9 = z0.f0.a();
        z0.f0.h(a9, eVar.x(), eVar.s());
        double A = (eVar.A() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(A);
        float sin = (float) Math.sin(A);
        float f10 = a9[1];
        float f11 = a9[2];
        float f12 = a9[5];
        float f13 = a9[6];
        float f14 = a9[9];
        float f15 = a9[10];
        float f16 = a9[13];
        float f17 = a9[14];
        a9[1] = (f10 * cos) - (f11 * sin);
        a9[2] = (f11 * cos) + (f10 * sin);
        a9[5] = (f12 * cos) - (f13 * sin);
        a9[6] = (f13 * cos) + (f12 * sin);
        a9[9] = (f14 * cos) - (f15 * sin);
        a9[10] = (f15 * cos) + (f14 * sin);
        a9[13] = (f16 * cos) - (f17 * sin);
        a9[14] = (f17 * cos) + (f16 * sin);
        double G = (eVar.G() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(G);
        float sin2 = (float) Math.sin(G);
        float f18 = a9[0];
        float f19 = a9[2];
        float f20 = a9[4];
        float f21 = a9[6];
        float f22 = a9[8];
        float f23 = a9[10];
        float f24 = a9[12];
        float f25 = a9[14];
        a9[0] = (f19 * sin2) + (f18 * cos2);
        a9[2] = (f19 * cos2) + ((-f18) * sin2);
        a9[4] = (f21 * sin2) + (f20 * cos2);
        a9[6] = (f21 * cos2) + ((-f20) * sin2);
        a9[8] = (f23 * sin2) + (f22 * cos2);
        a9[10] = (f23 * cos2) + ((-f22) * sin2);
        a9[12] = (f25 * sin2) + (f24 * cos2);
        a9[14] = (f25 * cos2) + ((-f24) * sin2);
        z0.f0.e(a9, eVar.K());
        z0.f0.f(a9, eVar.q(), eVar.I());
        z0.f0.g(fArr, a9);
        float[] a10 = z0.f0.a();
        z0.f0.h(a10, y0.c.d(f9), y0.c.e(f9));
        z0.f0.g(fArr, a10);
        return fArr;
    }
}
