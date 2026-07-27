package r0;

import B1.C0097d;
import Z.AbstractC0319p;
import Z.C0310g;
import Z.C0313j;
import Z.C0316m;
import b0.AbstractC0497e;
import b0.C0494b;
import b0.InterfaceC0496d;
import c0.C0531b;
import kotlin.jvm.internal.Intrinsics;
import s0.C1166s;

/* loaded from: classes.dex */
public final class G implements InterfaceC0496d {

    /* renamed from: d, reason: collision with root package name */
    public final C0494b f9624d = new C0494b();

    /* renamed from: e, reason: collision with root package name */
    public InterfaceC1074o f9625e;

    @Override // b0.InterfaceC0496d
    public final void B(long j4, long j5, long j6, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f9624d.B(j4, j5, j6, f4, abstractC0497e, c0316m, i2);
    }

    @Override // b0.InterfaceC0496d
    public final void D(C0313j c0313j, long j4, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f9624d.D(c0313j, j4, f4, abstractC0497e, c0316m, i2);
    }

    @Override // M0.b
    public final long E(long j4) {
        return this.f9624d.E(j4);
    }

    @Override // M0.b
    public final long I(float f4) {
        return this.f9624d.I(f4);
    }

    @Override // M0.b
    public final long J(long j4) {
        return this.f9624d.J(j4);
    }

    @Override // M0.b
    public final float L(float f4) {
        return this.f9624d.e() * f4;
    }

    @Override // M0.b
    public final float M(long j4) {
        return this.f9624d.M(j4);
    }

    @Override // b0.InterfaceC0496d
    public final void O(long j4, long j5, long j6, long j7, AbstractC0497e abstractC0497e, float f4, C0316m c0316m, int i2) {
        this.f9624d.O(j4, j5, j6, j7, abstractC0497e, f4, c0316m, i2);
    }

    @Override // b0.InterfaceC0496d
    public final void V(long j4, float f4, long j5, float f5, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f9624d.V(j4, f4, j5, f5, abstractC0497e, c0316m, i2);
    }

    @Override // b0.InterfaceC0496d
    public final C0097d Y() {
        return this.f9624d.f5603e;
    }

    public final void a() {
        C0494b c0494b = this.f9624d;
        Z.r k4 = c0494b.f5603e.k();
        InterfaceC1072m interfaceC1072m = this.f9625e;
        Intrinsics.c(interfaceC1072m);
        S.n nVar = (S.n) interfaceC1072m;
        S.n nVar2 = nVar.f3978d.f3983l;
        if (nVar2 != null && (nVar2.f3981j & 4) != 0) {
            while (nVar2 != null) {
                int i2 = nVar2.f3980i;
                if ((i2 & 2) != 0) {
                    break;
                } else if ((i2 & 4) != 0) {
                    break;
                } else {
                    nVar2 = nVar2.f3983l;
                }
            }
        }
        nVar2 = null;
        if (nVar2 == null) {
            a0 t4 = AbstractC1065f.t(interfaceC1072m, 4);
            if (t4.O0() == nVar.f3978d) {
                t4 = t4.f9763s;
                Intrinsics.c(t4);
            }
            t4.a1(k4, (C0531b) c0494b.f5603e.f988i);
            return;
        }
        I.d dVar = null;
        while (nVar2 != null) {
            if (nVar2 instanceof InterfaceC1074o) {
                InterfaceC1074o interfaceC1074o = (InterfaceC1074o) nVar2;
                C0531b c0531b = (C0531b) c0494b.f5603e.f988i;
                a0 t5 = AbstractC1065f.t(interfaceC1074o, 4);
                long U3 = u3.d.U(t5.f9007i);
                E e4 = t5.f9762r;
                e4.getClass();
                ((C1166s) H.a(e4)).getSharedDrawScope().b(k4, U3, t5, interfaceC1074o, c0531b);
            } else if ((nVar2.f3980i & 4) != 0 && (nVar2 instanceof AbstractC1073n)) {
                int i4 = 0;
                for (S.n nVar3 = ((AbstractC1073n) nVar2).f9826u; nVar3 != null; nVar3 = nVar3.f3983l) {
                    if ((nVar3.f3980i & 4) != 0) {
                        i4++;
                        if (i4 == 1) {
                            nVar2 = nVar3;
                        } else {
                            if (dVar == null) {
                                dVar = new I.d(new S.n[16]);
                            }
                            if (nVar2 != null) {
                                dVar.b(nVar2);
                                nVar2 = null;
                            }
                            dVar.b(nVar3);
                        }
                    }
                }
                if (i4 == 1) {
                }
            }
            nVar2 = AbstractC1065f.f(dVar);
        }
    }

    @Override // M0.b
    public final long a0(float f4) {
        return this.f9624d.a0(f4);
    }

    public final void b(Z.r rVar, long j4, a0 a0Var, InterfaceC1074o interfaceC1074o, C0531b c0531b) {
        InterfaceC1074o interfaceC1074o2 = this.f9625e;
        this.f9625e = interfaceC1074o;
        M0.k kVar = a0Var.f9762r.f9611x;
        C0494b c0494b = this.f9624d;
        M0.b m4 = c0494b.f5603e.m();
        C0097d c0097d = c0494b.f5603e;
        M0.k q2 = c0097d.q();
        Z.r k4 = c0097d.k();
        long s4 = c0097d.s();
        C0531b c0531b2 = (C0531b) c0097d.f988i;
        c0097d.D(a0Var);
        c0097d.F(kVar);
        c0097d.C(rVar);
        c0097d.G(j4);
        c0097d.f988i = c0531b;
        rVar.g();
        try {
            interfaceC1074o.a(this);
            rVar.b();
            c0097d.D(m4);
            c0097d.F(q2);
            c0097d.C(k4);
            c0097d.G(s4);
            c0097d.f988i = c0531b2;
            this.f9625e = interfaceC1074o2;
        } catch (Throwable th) {
            rVar.b();
            c0097d.D(m4);
            c0097d.F(q2);
            c0097d.C(k4);
            c0097d.G(s4);
            c0097d.f988i = c0531b2;
            throw th;
        }
    }

    public final void c(AbstractC0319p abstractC0319p, long j4, long j5, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        C0494b c0494b = this.f9624d;
        c0494b.f5602d.f5600c.m(Y.c.d(j4), Y.c.e(j4), Y.f.d(j5) + Y.c.d(j4), Y.f.b(j5) + Y.c.e(j4), c0494b.b(abstractC0319p, abstractC0497e, f4, c0316m, i2, 1));
    }

    @Override // b0.InterfaceC0496d
    public final void c0(C0310g c0310g, long j4, long j5, long j6, long j7, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2, int i4) {
        this.f9624d.c0(c0310g, j4, j5, j6, j7, f4, abstractC0497e, c0316m, i2, i4);
    }

    public final void d(AbstractC0319p abstractC0319p, long j4, long j5, long j6, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        C0494b c0494b = this.f9624d;
        c0494b.f5602d.f5600c.a(Y.c.d(j4), Y.c.e(j4), Y.f.d(j5) + Y.c.d(j4), Y.f.b(j5) + Y.c.e(j4), Y.a.b(j6), Y.a.c(j6), c0494b.b(abstractC0319p, abstractC0497e, f4, c0316m, i2, 1));
    }

    @Override // M0.b
    public final float e() {
        return this.f9624d.e();
    }

    @Override // b0.InterfaceC0496d
    public final M0.k getLayoutDirection() {
        return this.f9624d.f5602d.f5599b;
    }

    @Override // b0.InterfaceC0496d
    public final long h() {
        return this.f9624d.h();
    }

    @Override // M0.b
    public final int h0(long j4) {
        return this.f9624d.h0(j4);
    }

    @Override // M0.b
    public final float i0(int i2) {
        return this.f9624d.i0(i2);
    }

    @Override // M0.b
    public final float j0(long j4) {
        return this.f9624d.j0(j4);
    }

    @Override // M0.b
    public final float k0(float f4) {
        return f4 / this.f9624d.e();
    }

    @Override // M0.b
    public final int l(float f4) {
        return this.f9624d.l(f4);
    }

    @Override // b0.InterfaceC0496d
    public final void m0(Z.J j4, AbstractC0319p abstractC0319p, float f4, AbstractC0497e abstractC0497e, C0316m c0316m, int i2) {
        this.f9624d.m0(j4, abstractC0319p, f4, abstractC0497e, c0316m, i2);
    }

    @Override // b0.InterfaceC0496d
    public final void o(long j4, long j5, long j6, float f4, int i2, float f5, C0316m c0316m, int i4) {
        this.f9624d.o(j4, j5, j6, f4, i2, f5, c0316m, i4);
    }

    @Override // M0.b
    public final float q() {
        return this.f9624d.q();
    }

    @Override // b0.InterfaceC0496d
    public final long w() {
        return this.f9624d.w();
    }
}
