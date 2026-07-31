package t0;

import D1.C0014b;
import a0.AbstractC0158a;
import b0.AbstractC0259J;
import b0.C0275h;
import b0.C0278k;
import b0.C0281n;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;
import d0.AbstractC0322c;
import d0.C0321b;
import d0.InterfaceC0323d;
import e0.C0336b;
import u0.C0997t;

/* loaded from: classes.dex */
public final class F implements InterfaceC0323d {

    /* renamed from: d, reason: collision with root package name */
    public final C0321b f7748d = new C0321b();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC0907o f7749e;

    @Override // M0.b
    public final long C(long j3) {
        return this.f7748d.C(j3);
    }

    @Override // M0.b
    public final long D(float f3) {
        return this.f7748d.D(f3);
    }

    @Override // M0.b
    public final float F(float f3) {
        return this.f7748d.a() * f3;
    }

    @Override // M0.b
    public final float G(long j3) {
        return this.f7748d.G(j3);
    }

    @Override // d0.InterfaceC0323d
    public final void M(C0278k c0278k, long j3, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f7748d.M(c0278k, j3, f3, abstractC0322c, c0281n, i3);
    }

    @Override // d0.InterfaceC0323d
    public final C0014b P() {
        return this.f7748d.f4444e;
    }

    @Override // M0.b
    public final long R(float f3) {
        return this.f7748d.R(f3);
    }

    @Override // d0.InterfaceC0323d
    public final void V(long j3, long j4, long j5, float f3, int i3, float f4, C0281n c0281n, int i4) {
        this.f7748d.V(j3, j4, j5, f3, i3, f4, c0281n, i4);
    }

    @Override // M0.b
    public final float Z(int i3) {
        return this.f7748d.Z(i3);
    }

    @Override // M0.b
    public final float a() {
        return this.f7748d.a();
    }

    @Override // M0.b
    public final float a0(long j3) {
        return this.f7748d.a0(j3);
    }

    public final void b() {
        C0321b c0321b = this.f7748d;
        InterfaceC0285r h3 = c0321b.f4444e.h();
        InterfaceC0904l interfaceC0904l = this.f7749e;
        Z1.i.c(interfaceC0904l);
        U.k kVar = (U.k) interfaceC0904l;
        U.k kVar2 = kVar.f3303d.f3308i;
        if (kVar2 != null && (kVar2.f3306g & 4) != 0) {
            while (kVar2 != null) {
                int i3 = kVar2.f3305f;
                if ((i3 & 2) != 0) {
                    break;
                } else if ((i3 & 4) != 0) {
                    break;
                } else {
                    kVar2 = kVar2.f3308i;
                }
            }
        }
        kVar2 = null;
        if (kVar2 == null) {
            a0 r3 = AbstractC0898f.r(interfaceC0904l, 4);
            if (r3.B0() == kVar.f3303d) {
                r3 = r3.p;
                Z1.i.c(r3);
            }
            r3.O0(h3, (C0336b) c0321b.f4444e.f537c);
            return;
        }
        K.d dVar = null;
        while (kVar2 != null) {
            if (kVar2 instanceof InterfaceC0907o) {
                InterfaceC0907o interfaceC0907o = (InterfaceC0907o) kVar2;
                C0336b c0336b = (C0336b) c0321b.f4444e.f537c;
                a0 r4 = AbstractC0898f.r(interfaceC0907o, 4);
                long R2 = I2.l.R(r4.f7116f);
                D d3 = r4.f7877o;
                d3.getClass();
                ((C0997t) G.a(d3)).getSharedDrawScope().d(h3, R2, r4, interfaceC0907o, c0336b);
            } else if ((kVar2.f3305f & 4) != 0 && (kVar2 instanceof AbstractC0905m)) {
                int i4 = 0;
                for (U.k kVar3 = ((AbstractC0905m) kVar2).f7937r; kVar3 != null; kVar3 = kVar3.f3308i) {
                    if ((kVar3.f3305f & 4) != 0) {
                        i4++;
                        if (i4 == 1) {
                            kVar2 = kVar3;
                        } else {
                            if (dVar == null) {
                                dVar = new K.d(new U.k[16]);
                            }
                            if (kVar2 != null) {
                                dVar.b(kVar2);
                                kVar2 = null;
                            }
                            dVar.b(kVar3);
                        }
                    }
                }
                if (i4 == 1) {
                }
            }
            kVar2 = AbstractC0898f.f(dVar);
        }
    }

    @Override // d0.InterfaceC0323d
    public final long c() {
        return this.f7748d.c();
    }

    @Override // M0.b
    public final float c0(float f3) {
        return f3 / this.f7748d.a();
    }

    public final void d(InterfaceC0285r interfaceC0285r, long j3, a0 a0Var, InterfaceC0907o interfaceC0907o, C0336b c0336b) {
        InterfaceC0907o interfaceC0907o2 = this.f7749e;
        this.f7749e = interfaceC0907o;
        M0.j jVar = a0Var.f7877o.f7731t;
        C0321b c0321b = this.f7748d;
        M0.b j4 = c0321b.f4444e.j();
        C0014b c0014b = c0321b.f4444e;
        M0.j l3 = c0014b.l();
        InterfaceC0285r h3 = c0014b.h();
        long m3 = c0014b.m();
        C0336b c0336b2 = (C0336b) c0014b.f537c;
        c0014b.v(a0Var);
        c0014b.x(jVar);
        c0014b.u(interfaceC0285r);
        c0014b.y(j3);
        c0014b.f537c = c0336b;
        interfaceC0285r.f();
        try {
            interfaceC0907o.d(this);
            interfaceC0285r.a();
            c0014b.v(j4);
            c0014b.x(l3);
            c0014b.u(h3);
            c0014b.y(m3);
            c0014b.f537c = c0336b2;
            this.f7749e = interfaceC0907o2;
        } catch (Throwable th) {
            interfaceC0285r.a();
            c0014b.v(j4);
            c0014b.x(l3);
            c0014b.u(h3);
            c0014b.y(m3);
            c0014b.f537c = c0336b2;
            throw th;
        }
    }

    public final void e(AbstractC0259J abstractC0259J, long j3, long j4, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        C0321b c0321b = this.f7748d;
        c0321b.f4443d.f4441c.b(a0.c.d(j3), a0.c.e(j3), a0.f.d(j4) + a0.c.d(j3), a0.f.b(j4) + a0.c.e(j3), c0321b.d(abstractC0259J, abstractC0322c, f3, c0281n, i3, 1));
    }

    @Override // d0.InterfaceC0323d
    public final void f(C0275h c0275h, long j3, long j4, long j5, long j6, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3, int i4) {
        this.f7748d.f(c0275h, j3, j4, j5, j6, f3, abstractC0322c, c0281n, i3, i4);
    }

    @Override // d0.InterfaceC0323d
    public final void g(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f7748d.g(j3, j4, j5, f3, abstractC0322c, c0281n, i3);
    }

    @Override // d0.InterfaceC0323d
    public final M0.j getLayoutDirection() {
        return this.f7748d.f4443d.f4440b;
    }

    public final void h(AbstractC0259J abstractC0259J, long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        C0321b c0321b = this.f7748d;
        c0321b.f4443d.f4441c.m(a0.c.d(j3), a0.c.e(j3), a0.f.d(j4) + a0.c.d(j3), a0.f.b(j4) + a0.c.e(j3), AbstractC0158a.b(j5), AbstractC0158a.c(j5), c0321b.d(abstractC0259J, abstractC0322c, f3, c0281n, i3, 1));
    }

    @Override // d0.InterfaceC0323d
    public final void h0(long j3, float f3, long j4, float f4, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f7748d.h0(j3, f3, j4, f4, abstractC0322c, c0281n, i3);
    }

    @Override // M0.b
    public final int k(float f3) {
        return this.f7748d.k(f3);
    }

    @Override // M0.b
    public final float p() {
        return this.f7748d.p();
    }

    @Override // d0.InterfaceC0323d
    public final long w() {
        return this.f7748d.w();
    }

    @Override // d0.InterfaceC0323d
    public final void x(long j3, long j4, long j5, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f7748d.x(j3, j4, j5, f3, abstractC0322c, c0281n, i3);
    }

    @Override // d0.InterfaceC0323d
    public final void z(InterfaceC0258I interfaceC0258I, AbstractC0259J abstractC0259J, float f3, AbstractC0322c abstractC0322c, C0281n c0281n, int i3) {
        this.f7748d.z(interfaceC0258I, abstractC0259J, f3, abstractC0322c, c0281n, i3);
    }
}
