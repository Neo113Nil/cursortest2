package t0;

import a0.AbstractC0236a;
import a0.C0238c;
import a0.C0241f;
import b0.AbstractC0347p;
import b0.C0338g;
import b0.C0341j;
import b0.C0344m;
import d0.AbstractC0404e;
import d0.C0401b;
import d0.InterfaceC0403d;
import e0.C0416b;
import u0.C1123s;

/* loaded from: classes.dex */
public final class G implements InterfaceC0403d {

    /* renamed from: d, reason: collision with root package name */
    public final C0401b f8573d = new C0401b();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1002o f8574e;

    @Override // d0.InterfaceC0403d
    public final void A(long j3, long j4, long j5, long j6, AbstractC0404e abstractC0404e, float f3, C0344m c0344m, int i3) {
        this.f8573d.A(j3, j4, j5, j6, abstractC0404e, f3, c0344m, i3);
    }

    @Override // O0.b
    public final long E(long j3) {
        return this.f8573d.E(j3);
    }

    @Override // d0.InterfaceC0403d
    public final void F(long j3, long j4, long j5, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f8573d.F(j3, j4, j5, f3, abstractC0404e, c0344m, i3);
    }

    @Override // O0.b
    public final long G(float f3) {
        return this.f8573d.G(f3);
    }

    @Override // O0.b
    public final long H(long j3) {
        return this.f8573d.H(j3);
    }

    @Override // O0.b
    public final float J(float f3) {
        return this.f8573d.a() * f3;
    }

    @Override // O0.b
    public final float K(long j3) {
        return this.f8573d.K(j3);
    }

    @Override // d0.InterfaceC0403d
    public final void M(long j3, float f3, long j4, float f4, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f8573d.M(j3, f3, j4, f4, abstractC0404e, c0344m, i3);
    }

    @Override // d0.InterfaceC0403d
    public final G1.m S() {
        return this.f8573d.f5649e;
    }

    @Override // O0.b
    public final long T(float f3) {
        return this.f8573d.T(f3);
    }

    @Override // d0.InterfaceC0403d
    public final void X(C0341j c0341j, long j3, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f8573d.X(c0341j, j3, f3, abstractC0404e, c0344m, i3);
    }

    @Override // O0.b
    public final float Y(int i3) {
        return this.f8573d.Y(i3);
    }

    @Override // O0.b
    public final float a() {
        return this.f8573d.a();
    }

    @Override // d0.InterfaceC0403d
    public final void a0(b0.L l3, AbstractC0347p abstractC0347p, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        this.f8573d.a0(l3, abstractC0347p, f3, abstractC0404e, c0344m, i3);
    }

    public final void b() {
        C0401b c0401b = this.f8573d;
        b0.r h3 = c0401b.f5649e.h();
        InterfaceC0999l interfaceC0999l = this.f8574e;
        f2.j.c(interfaceC0999l);
        U.p pVar = (U.p) interfaceC0999l;
        U.p pVar2 = pVar.f4489d.f4494i;
        if (pVar2 != null && (pVar2.f4492g & 4) != 0) {
            while (pVar2 != null) {
                int i3 = pVar2.f4491f;
                if ((i3 & 2) != 0) {
                    break;
                } else if ((i3 & 4) != 0) {
                    break;
                } else {
                    pVar2 = pVar2.f4494i;
                }
            }
        }
        pVar2 = null;
        if (pVar2 == null) {
            b0 r3 = AbstractC0993f.r(interfaceC0999l, 4);
            if (r3.K0() == pVar.f4489d) {
                r3 = r3.f8712p;
                f2.j.c(r3);
            }
            r3.W0(h3, (C0416b) c0401b.f5649e.f2117c);
            return;
        }
        K.d dVar = null;
        while (pVar2 != null) {
            if (pVar2 instanceof InterfaceC1002o) {
                InterfaceC1002o interfaceC1002o = (InterfaceC1002o) pVar2;
                C0416b c0416b = (C0416b) c0401b.f5649e.f2117c;
                b0 r4 = AbstractC0993f.r(interfaceC1002o, 4);
                long f02 = O2.d.f0(r4.f8128f);
                E e3 = r4.f8711o;
                e3.getClass();
                ((C1123s) H.a(e3)).getSharedDrawScope().c(h3, f02, r4, interfaceC1002o, c0416b);
            } else if ((pVar2.f4491f & 4) != 0 && (pVar2 instanceof AbstractC1000m)) {
                int i4 = 0;
                for (U.p pVar3 = ((AbstractC1000m) pVar2).f8771r; pVar3 != null; pVar3 = pVar3.f4494i) {
                    if ((pVar3.f4491f & 4) != 0) {
                        i4++;
                        if (i4 == 1) {
                            pVar2 = pVar3;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.p[16]);
                            }
                            if (pVar2 != null) {
                                dVar.b(pVar2);
                                pVar2 = null;
                            }
                            dVar.b(pVar3);
                        }
                    }
                }
                if (i4 == 1) {
                }
            }
            pVar2 = AbstractC0993f.f(dVar);
        }
    }

    @Override // O0.b
    public final float b0(long j3) {
        return this.f8573d.b0(j3);
    }

    public final void c(b0.r rVar, long j3, b0 b0Var, InterfaceC1002o interfaceC1002o, C0416b c0416b) {
        InterfaceC1002o interfaceC1002o2 = this.f8574e;
        this.f8574e = interfaceC1002o;
        O0.k kVar = b0Var.f8711o.f8557u;
        C0401b c0401b = this.f8573d;
        O0.b j4 = c0401b.f5649e.j();
        G1.m mVar = c0401b.f5649e;
        O0.k m3 = mVar.m();
        b0.r h3 = mVar.h();
        long n3 = mVar.n();
        C0416b c0416b2 = (C0416b) mVar.f2117c;
        mVar.w(b0Var);
        mVar.y(kVar);
        mVar.v(rVar);
        mVar.z(j3);
        mVar.f2117c = c0416b;
        rVar.f();
        try {
            interfaceC1002o.h(this);
            rVar.a();
            mVar.w(j4);
            mVar.y(m3);
            mVar.v(h3);
            mVar.z(n3);
            mVar.f2117c = c0416b2;
            this.f8574e = interfaceC1002o2;
        } catch (Throwable th) {
            rVar.a();
            mVar.w(j4);
            mVar.y(m3);
            mVar.v(h3);
            mVar.z(n3);
            mVar.f2117c = c0416b2;
            throw th;
        }
    }

    @Override // d0.InterfaceC0403d
    public final long d() {
        return this.f8573d.d();
    }

    @Override // O0.b
    public final float d0(float f3) {
        return f3 / this.f8573d.a();
    }

    public final void e(AbstractC0347p abstractC0347p, long j3, long j4, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        C0401b c0401b = this.f8573d;
        c0401b.f5648d.f5646c.b(C0238c.d(j3), C0238c.e(j3), C0241f.d(j4) + C0238c.d(j3), C0241f.b(j4) + C0238c.e(j3), c0401b.c(abstractC0347p, abstractC0404e, f3, c0344m, i3, 1));
    }

    public final void f(AbstractC0347p abstractC0347p, long j3, long j4, long j5, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3) {
        C0401b c0401b = this.f8573d;
        c0401b.f5648d.f5646c.m(C0238c.d(j3), C0238c.e(j3), C0241f.d(j4) + C0238c.d(j3), C0241f.b(j4) + C0238c.e(j3), AbstractC0236a.b(j5), AbstractC0236a.c(j5), c0401b.c(abstractC0347p, abstractC0404e, f3, c0344m, i3, 1));
    }

    @Override // d0.InterfaceC0403d
    public final O0.k getLayoutDirection() {
        return this.f8573d.f5648d.f5645b;
    }

    @Override // d0.InterfaceC0403d
    public final void k0(C0338g c0338g, long j3, long j4, long j5, long j6, float f3, AbstractC0404e abstractC0404e, C0344m c0344m, int i3, int i4) {
        this.f8573d.k0(c0338g, j3, j4, j5, j6, f3, abstractC0404e, c0344m, i3, i4);
    }

    @Override // O0.b
    public final int l(float f3) {
        return this.f8573d.l(f3);
    }

    @Override // O0.b
    public final float r() {
        return this.f8573d.r();
    }

    @Override // d0.InterfaceC0403d
    public final long y() {
        return this.f8573d.y();
    }
}
