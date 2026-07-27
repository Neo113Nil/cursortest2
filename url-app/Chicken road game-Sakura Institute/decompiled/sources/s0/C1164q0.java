package s0;

import A0.C0030a;
import B1.C0097d;
import Z.AbstractC0307d;
import Z.C0311h;
import Z.C0313j;
import Z.C0323u;
import a.AbstractC0345a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import b0.C0494b;
import c0.C0531b;
import c0.InterfaceC0533d;
import i.AbstractC0665F;
import i.C0661B;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: s0.q0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1164q0 implements r0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public C0531b f10288d;

    /* renamed from: e, reason: collision with root package name */
    public final Z.A f10289e;

    /* renamed from: i, reason: collision with root package name */
    public final C1166s f10290i;

    /* renamed from: j, reason: collision with root package name */
    public C0030a f10291j;

    /* renamed from: k, reason: collision with root package name */
    public A3.e f10292k;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10294m;

    /* renamed from: o, reason: collision with root package name */
    public float[] f10296o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f10297p;

    /* renamed from: t, reason: collision with root package name */
    public int f10301t;

    /* renamed from: v, reason: collision with root package name */
    public Z.I f10303v;

    /* renamed from: w, reason: collision with root package name */
    public C0313j f10304w;

    /* renamed from: x, reason: collision with root package name */
    public C0311h f10305x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f10306y;

    /* renamed from: l, reason: collision with root package name */
    public long f10293l = u3.d.c(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: n, reason: collision with root package name */
    public final float[] f10295n = Z.E.a();

    /* renamed from: q, reason: collision with root package name */
    public M0.b f10298q = u3.l.J();

    /* renamed from: r, reason: collision with root package name */
    public M0.k f10299r = M0.k.f3555d;

    /* renamed from: s, reason: collision with root package name */
    public final C0494b f10300s = new C0494b();

    /* renamed from: u, reason: collision with root package name */
    public long f10302u = Z.U.f4510b;

    /* renamed from: z, reason: collision with root package name */
    public final C1160o0 f10307z = new C1160o0(1, this);

    public C1164q0(C0531b c0531b, Z.A a4, C1166s c1166s, C0030a c0030a, A3.e eVar) {
        this.f10288d = c0531b;
        this.f10289e = a4;
        this.f10290i = c1166s;
        this.f10291j = c0030a;
        this.f10292k = eVar;
    }

    @Override // r0.f0
    public final void a(Z.r rVar, C0531b c0531b) {
        boolean z4;
        C0531b c0531b2;
        int i2;
        boolean z5;
        Canvas a4 = AbstractC0307d.a(rVar);
        if (!a4.isHardwareAccelerated()) {
            C0531b c0531b3 = this.f10288d;
            long j4 = c0531b3.f5742r;
            float f4 = (int) (j4 >> 32);
            float f5 = (int) (j4 & 4294967295L);
            long j5 = this.f10293l;
            float f6 = f4 + ((int) (j5 >> 32));
            float f7 = f5 + ((int) (4294967295L & j5));
            if (c0531b3.f5725a.a() < 1.0f) {
                C0311h c0311h = this.f10305x;
                if (c0311h == null) {
                    c0311h = Z.K.g();
                    this.f10305x = c0311h;
                }
                c0311h.c(this.f10288d.f5725a.a());
                a4.saveLayer(f4, f5, f6, f7, (Paint) c0311h.f4525b);
            } else {
                rVar.g();
            }
            rVar.q(f4, f5);
            rVar.n(n());
            if (this.f10288d.f5725a.u() && this.f10288d.f5725a.u()) {
                Z.I c4 = this.f10288d.c();
                if (c4 instanceof Z.G) {
                    Z.r.l(rVar, ((Z.G) c4).f4458a);
                } else if (c4 instanceof Z.H) {
                    C0313j c0313j = this.f10304w;
                    if (c0313j == null) {
                        c0313j = Z.K.h();
                        this.f10304w = c0313j;
                    }
                    c0313j.e();
                    Z.J.a(c0313j, ((Z.H) c4).f4459a);
                    rVar.k(c0313j, 1);
                } else if (c4 instanceof Z.F) {
                    rVar.k(((Z.F) c4).f4457a, 1);
                }
            }
            C0030a c0030a = this.f10291j;
            if (c0030a != null) {
                c0030a.h(rVar, null);
            }
            rVar.b();
            return;
        }
        g();
        this.f10306y = this.f10288d.f5725a.F() > 0.0f;
        C0494b c0494b = this.f10300s;
        C0097d c0097d = c0494b.f5603e;
        c0097d.C(rVar);
        c0097d.f988i = c0531b;
        C0531b c0531b4 = this.f10288d;
        Z.r k4 = c0494b.Y().k();
        C0531b c0531b5 = (C0531b) c0494b.Y().f988i;
        if (c0531b4.f5741q) {
            return;
        }
        InterfaceC0533d interfaceC0533d = c0531b4.f5725a;
        if (!interfaceC0533d.n()) {
            try {
                c0531b4.e();
            } catch (Throwable unused) {
            }
        }
        c0531b4.a();
        boolean z6 = interfaceC0533d.F() > 0.0f;
        if (z6) {
            k4.o();
        }
        Canvas a5 = AbstractC0307d.a(k4);
        boolean isHardwareAccelerated = a5.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            z4 = z6;
            c0531b2 = c0531b5;
        } else {
            a5.save();
            z4 = z6;
            long j6 = c0531b4.f5742r;
            float f8 = (int) (j6 >> 32);
            float f9 = (int) (j6 & 4294967295L);
            long j7 = c0531b4.f5743s;
            c0531b2 = c0531b5;
            float f10 = f8 + ((int) (j7 >> 32));
            float f11 = f9 + ((int) (4294967295L & j7));
            float a6 = interfaceC0533d.a();
            int J3 = interfaceC0533d.J();
            if (a6 < 1.0f || !Z.K.o(J3, 3) || u3.l.c0(interfaceC0533d.O(), 1)) {
                C0311h c0311h2 = c0531b4.f5738n;
                if (c0311h2 == null) {
                    c0311h2 = Z.K.g();
                    c0531b4.f5738n = c0311h2;
                }
                c0311h2.c(a6);
                c0311h2.d(J3);
                c0311h2.f(null);
                a5.saveLayer(f8, f9, f10, f11, (Paint) c0311h2.f4525b);
            } else {
                a5.save();
            }
            a5.translate(f8, f9);
            a5.concat(interfaceC0533d.w());
        }
        boolean z7 = c0531b4.f5737m || (!isHardwareAccelerated && interfaceC0533d.u());
        if (z7) {
            k4.g();
            Z.I c5 = c0531b4.c();
            if (c5 instanceof Z.G) {
                Z.r.l(k4, c5.a());
            } else if (c5 instanceof Z.H) {
                C0313j c0313j2 = c0531b4.f5736l;
                if (c0313j2 != null) {
                    c0313j2.f4530a.rewind();
                } else {
                    c0313j2 = Z.K.h();
                    c0531b4.f5736l = c0313j2;
                }
                Z.J.a(c0313j2, ((Z.H) c5).f4459a);
                k4.k(c0313j2, 1);
            } else if (c5 instanceof Z.F) {
                k4.k(((Z.F) c5).f4457a, 1);
            }
        }
        if (c0531b2 != null) {
            C.F f12 = c0531b2.f5740p;
            if (!f12.f1051a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C0661B c0661b = (C0661B) f12.f1054d;
            if (c0661b != null) {
                c0661b.a(c0531b4);
            } else if (((C0531b) f12.f1052b) != null) {
                int i4 = AbstractC0665F.f6892a;
                C0661B c0661b2 = new C0661B();
                C0531b c0531b6 = (C0531b) f12.f1052b;
                Intrinsics.c(c0531b6);
                c0661b2.a(c0531b6);
                c0661b2.a(c0531b4);
                f12.f1054d = c0661b2;
                f12.f1052b = null;
            } else {
                f12.f1052b = c0531b4;
            }
            C0661B c0661b3 = (C0661B) f12.f1055e;
            if (c0661b3 != null) {
                boolean j8 = c0661b3.j(c0531b4);
                i2 = 1;
                z5 = !j8;
            } else {
                i2 = 1;
                if (((C0531b) f12.f1053c) != c0531b4) {
                    z5 = true;
                } else {
                    f12.f1053c = null;
                    z5 = false;
                }
            }
            if (z5) {
                c0531b4.f5739o += i2;
            }
        }
        interfaceC0533d.z(k4);
        if (z7) {
            k4.b();
        }
        if (z4) {
            k4.j();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a5.restore();
    }

    @Override // r0.f0
    public final void b(Z.M m4) {
        A3.e eVar;
        int i2;
        A3.e eVar2;
        int i4 = m4.f4466d | this.f10301t;
        this.f10299r = m4.f4485z;
        this.f10298q = m4.f4484y;
        int i5 = i4 & 4096;
        if (i5 != 0) {
            this.f10302u = m4.f4479t;
        }
        if ((i4 & 1) != 0) {
            C0531b c0531b = this.f10288d;
            float f4 = m4.f4467e;
            InterfaceC0533d interfaceC0533d = c0531b.f5725a;
            if (interfaceC0533d.v() != f4) {
                interfaceC0533d.p(f4);
            }
        }
        if ((i4 & 2) != 0) {
            C0531b c0531b2 = this.f10288d;
            float f5 = m4.f4468i;
            InterfaceC0533d interfaceC0533d2 = c0531b2.f5725a;
            if (interfaceC0533d2.G() != f5) {
                interfaceC0533d2.e(f5);
            }
        }
        if ((i4 & 4) != 0) {
            C0531b c0531b3 = this.f10288d;
            float f6 = m4.f4469j;
            InterfaceC0533d interfaceC0533d3 = c0531b3.f5725a;
            if (interfaceC0533d3.a() != f6) {
                interfaceC0533d3.d(f6);
            }
        }
        if ((i4 & 8) != 0) {
            C0531b c0531b4 = this.f10288d;
            float f7 = m4.f4470k;
            InterfaceC0533d interfaceC0533d4 = c0531b4.f5725a;
            if (interfaceC0533d4.M() != f7) {
                interfaceC0533d4.c(f7);
            }
        }
        if ((i4 & 16) != 0) {
            C0531b c0531b5 = this.f10288d;
            float f8 = m4.f4471l;
            InterfaceC0533d interfaceC0533d5 = c0531b5.f5725a;
            if (interfaceC0533d5.y() != f8) {
                interfaceC0533d5.l(f8);
            }
        }
        boolean z4 = false;
        if ((i4 & 32) != 0) {
            C0531b c0531b6 = this.f10288d;
            float f9 = m4.f4472m;
            InterfaceC0533d interfaceC0533d6 = c0531b6.f5725a;
            if (interfaceC0533d6.F() != f9) {
                interfaceC0533d6.x(f9);
                interfaceC0533d6.N(interfaceC0533d6.u() || f9 > 0.0f);
                c0531b6.f5730f = true;
                c0531b6.a();
            }
            if (m4.f4472m > 0.0f && !this.f10306y && (eVar2 = this.f10292k) != null) {
                eVar2.invoke();
            }
        }
        if ((i4 & 64) != 0) {
            C0531b c0531b7 = this.f10288d;
            long j4 = m4.f4473n;
            InterfaceC0533d interfaceC0533d7 = c0531b7.f5725a;
            if (!C0323u.c(j4, interfaceC0533d7.L())) {
                interfaceC0533d7.E(j4);
            }
        }
        if ((i4 & 128) != 0) {
            C0531b c0531b8 = this.f10288d;
            long j5 = m4.f4474o;
            InterfaceC0533d interfaceC0533d8 = c0531b8.f5725a;
            if (!C0323u.c(j5, interfaceC0533d8.D())) {
                interfaceC0533d8.t(j5);
            }
        }
        if ((i4 & 1024) != 0) {
            C0531b c0531b9 = this.f10288d;
            float f10 = m4.f4477r;
            InterfaceC0533d interfaceC0533d9 = c0531b9.f5725a;
            if (interfaceC0533d9.I() != f10) {
                interfaceC0533d9.k(f10);
            }
        }
        if ((i4 & 256) != 0) {
            C0531b c0531b10 = this.f10288d;
            float f11 = m4.f4475p;
            InterfaceC0533d interfaceC0533d10 = c0531b10.f5725a;
            if (interfaceC0533d10.P() != f11) {
                interfaceC0533d10.q(f11);
            }
        }
        if ((i4 & 512) != 0) {
            C0531b c0531b11 = this.f10288d;
            float f12 = m4.f4476q;
            InterfaceC0533d interfaceC0533d11 = c0531b11.f5725a;
            if (interfaceC0533d11.B() != f12) {
                interfaceC0533d11.b(f12);
            }
        }
        if ((i4 & 2048) != 0) {
            C0531b c0531b12 = this.f10288d;
            float f13 = m4.f4478s;
            InterfaceC0533d interfaceC0533d12 = c0531b12.f5725a;
            if (interfaceC0533d12.H() != f13) {
                interfaceC0533d12.m(f13);
            }
        }
        if (i5 != 0) {
            if (Z.U.a(this.f10302u, Z.U.f4510b)) {
                C0531b c0531b13 = this.f10288d;
                if (!Y.c.b(c0531b13.f5744t, 9205357640488583168L)) {
                    c0531b13.f5744t = 9205357640488583168L;
                    c0531b13.f5725a.K(9205357640488583168L);
                }
            } else {
                C0531b c0531b14 = this.f10288d;
                long c4 = AbstractC0345a.c(Z.U.b(this.f10302u) * ((int) (this.f10293l >> 32)), Z.U.c(this.f10302u) * ((int) (this.f10293l & 4294967295L)));
                if (!Y.c.b(c0531b14.f5744t, c4)) {
                    c0531b14.f5744t = c4;
                    c0531b14.f5725a.K(c4);
                }
            }
        }
        if ((i4 & 16384) != 0) {
            C0531b c0531b15 = this.f10288d;
            boolean z5 = m4.f4481v;
            InterfaceC0533d interfaceC0533d13 = c0531b15.f5725a;
            if (interfaceC0533d13.u() != z5) {
                interfaceC0533d13.N(z5);
                c0531b15.f5730f = true;
                c0531b15.a();
            }
        }
        if ((131072 & i4) != 0) {
            InterfaceC0533d interfaceC0533d14 = this.f10288d.f5725a;
            if (!Intrinsics.a(null, null)) {
                interfaceC0533d14.h();
            }
        }
        if ((32768 & i4) != 0) {
            C0531b c0531b16 = this.f10288d;
            int i6 = m4.f4482w;
            if (Z.K.p(i6, 0)) {
                i2 = 0;
            } else if (Z.K.p(i6, 1)) {
                i2 = 1;
            } else {
                i2 = 2;
                if (!Z.K.p(i6, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC0533d interfaceC0533d15 = c0531b16.f5725a;
            if (!u3.l.c0(interfaceC0533d15.O(), i2)) {
                interfaceC0533d15.s(i2);
            }
        }
        if (!Intrinsics.a(this.f10303v, m4.f4465A)) {
            Z.I i7 = m4.f4465A;
            this.f10303v = i7;
            if (i7 != null) {
                C0531b c0531b17 = this.f10288d;
                if (i7 instanceof Z.G) {
                    Y.d dVar = ((Z.G) i7).f4458a;
                    c0531b17.f(AbstractC0345a.c(dVar.f4374a, dVar.f4375b), u3.l.N(dVar.c(), dVar.b()), 0.0f);
                } else if (i7 instanceof Z.F) {
                    c0531b17.f5734j = null;
                    c0531b17.f5732h = 9205357640488583168L;
                    c0531b17.f5731g = 0L;
                    c0531b17.f5733i = 0.0f;
                    c0531b17.f5730f = true;
                    c0531b17.f5737m = false;
                    c0531b17.f5735k = ((Z.F) i7).f4457a;
                    c0531b17.a();
                } else if (i7 instanceof Z.H) {
                    Z.H h4 = (Z.H) i7;
                    C0313j c0313j = h4.f4460b;
                    if (c0313j != null) {
                        c0531b17.f5734j = null;
                        c0531b17.f5732h = 9205357640488583168L;
                        c0531b17.f5731g = 0L;
                        c0531b17.f5733i = 0.0f;
                        c0531b17.f5730f = true;
                        c0531b17.f5737m = false;
                        c0531b17.f5735k = c0313j;
                        c0531b17.a();
                    } else {
                        Y.e eVar3 = h4.f4459a;
                        c0531b17.f(AbstractC0345a.c(eVar3.f4378a, eVar3.f4379b), u3.l.N(eVar3.b(), eVar3.a()), Y.a.b(eVar3.f4385h));
                    }
                }
                if ((i7 instanceof Z.F) && Build.VERSION.SDK_INT < 33 && (eVar = this.f10292k) != null) {
                    eVar.invoke();
                }
            }
            z4 = true;
        }
        this.f10301t = m4.f4466d;
        if (i4 != 0 || z4) {
            m1.f10266a.a(this.f10290i);
        }
    }

    @Override // r0.f0
    public final void c(float[] fArr) {
        float[] m4 = m();
        if (m4 != null) {
            Z.E.g(fArr, m4);
        }
    }

    @Override // r0.f0
    public final void d() {
        this.f10291j = null;
        this.f10292k = null;
        this.f10294m = true;
        boolean z4 = this.f10297p;
        C1166s c1166s = this.f10290i;
        if (z4) {
            this.f10297p = false;
            c1166s.t(this, false);
        }
        Z.A a4 = this.f10289e;
        if (a4 != null) {
            a4.a(this.f10288d);
            c1166s.B(this);
        }
    }

    @Override // r0.f0
    public final long e(long j4, boolean z4) {
        if (!z4) {
            return Z.E.b(j4, n());
        }
        float[] m4 = m();
        if (m4 != null) {
            return Z.E.b(j4, m4);
        }
        return 9187343241974906880L;
    }

    @Override // r0.f0
    public final void f(long j4) {
        C0531b c0531b = this.f10288d;
        if (!M0.h.a(c0531b.f5742r, j4)) {
            c0531b.f5742r = j4;
            long j5 = c0531b.f5743s;
            c0531b.f5725a.A((int) (j4 >> 32), (int) (j4 & 4294967295L), j5);
        }
        m1.f10266a.a(this.f10290i);
    }

    @Override // r0.f0
    public final void g() {
        if (this.f10297p) {
            if (!Z.U.a(this.f10302u, Z.U.f4510b) && !M0.j.a(this.f10288d.f5743s, this.f10293l)) {
                C0531b c0531b = this.f10288d;
                long c4 = AbstractC0345a.c(Z.U.b(this.f10302u) * ((int) (this.f10293l >> 32)), Z.U.c(this.f10302u) * ((int) (this.f10293l & 4294967295L)));
                if (!Y.c.b(c0531b.f5744t, c4)) {
                    c0531b.f5744t = c4;
                    c0531b.f5725a.K(c4);
                }
            }
            C0531b c0531b2 = this.f10288d;
            M0.b bVar = this.f10298q;
            M0.k kVar = this.f10299r;
            long j4 = this.f10293l;
            if (!M0.j.a(c0531b2.f5743s, j4)) {
                c0531b2.f5743s = j4;
                long j5 = c0531b2.f5742r;
                c0531b2.f5725a.A((int) (j5 >> 32), (int) (4294967295L & j5), j4);
                if (c0531b2.f5732h == 9205357640488583168L) {
                    c0531b2.f5730f = true;
                    c0531b2.a();
                }
            }
            c0531b2.f5726b = bVar;
            c0531b2.f5727c = kVar;
            c0531b2.f5728d = this.f10307z;
            c0531b2.e();
            if (this.f10297p) {
                this.f10297p = false;
                this.f10290i.t(this, false);
            }
        }
    }

    @Override // r0.f0
    public final void h(long j4) {
        if (M0.j.a(j4, this.f10293l)) {
            return;
        }
        this.f10293l = j4;
        if (this.f10297p || this.f10294m) {
            return;
        }
        C1166s c1166s = this.f10290i;
        c1166s.invalidate();
        if (true != this.f10297p) {
            this.f10297p = true;
            c1166s.t(this, true);
        }
    }

    @Override // r0.f0
    public final void i(C0030a c0030a, A3.e eVar) {
        Z.A a4 = this.f10289e;
        if (a4 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f10288d.f5741q) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f10288d = a4.b();
        this.f10294m = false;
        this.f10291j = c0030a;
        this.f10292k = eVar;
        this.f10302u = Z.U.f4510b;
        this.f10306y = false;
        this.f10293l = u3.d.c(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f10303v = null;
        this.f10301t = 0;
    }

    @Override // r0.f0
    public final void invalidate() {
        if (this.f10297p || this.f10294m) {
            return;
        }
        C1166s c1166s = this.f10290i;
        c1166s.invalidate();
        if (true != this.f10297p) {
            this.f10297p = true;
            c1166s.t(this, true);
        }
    }

    @Override // r0.f0
    public final void j(float[] fArr) {
        Z.E.g(fArr, n());
    }

    @Override // r0.f0
    public final boolean k(long j4) {
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        if (this.f10288d.f5725a.u()) {
            return AbstractC1125K.j(this.f10288d.c(), d4, e4, null, null);
        }
        return true;
    }

    @Override // r0.f0
    public final void l(Y.b bVar, boolean z4) {
        if (!z4) {
            Z.E.c(n(), bVar);
            return;
        }
        float[] m4 = m();
        if (m4 != null) {
            Z.E.c(m4, bVar);
            return;
        }
        bVar.f4368a = 0.0f;
        bVar.f4369b = 0.0f;
        bVar.f4370c = 0.0f;
        bVar.f4371d = 0.0f;
    }

    public final float[] m() {
        float[] n2 = n();
        float[] fArr = this.f10296o;
        if (fArr == null) {
            fArr = Z.E.a();
            this.f10296o = fArr;
        }
        if (AbstractC1125K.h(n2, fArr)) {
            return fArr;
        }
        return null;
    }

    public final float[] n() {
        C0531b c0531b = this.f10288d;
        long e02 = AbstractC0345a.A(c0531b.f5744t) ? u3.l.e0(u3.d.U(this.f10293l)) : c0531b.f5744t;
        float[] fArr = this.f10295n;
        Z.E.d(fArr);
        float[] a4 = Z.E.a();
        Z.E.h(a4, -Y.c.d(e02), -Y.c.e(e02), 0.0f);
        Z.E.g(fArr, a4);
        float[] a5 = Z.E.a();
        InterfaceC0533d interfaceC0533d = c0531b.f5725a;
        Z.E.h(a5, interfaceC0533d.M(), interfaceC0533d.y(), 0.0f);
        double P3 = (interfaceC0533d.P() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(P3);
        float sin = (float) Math.sin(P3);
        float f4 = a5[1];
        float f5 = a5[2];
        float f6 = a5[5];
        float f7 = a5[6];
        float f8 = a5[9];
        float f9 = a5[10];
        float f10 = a5[13];
        float f11 = a5[14];
        a5[1] = (f4 * cos) - (f5 * sin);
        a5[2] = (f5 * cos) + (f4 * sin);
        a5[5] = (f6 * cos) - (f7 * sin);
        a5[6] = (f7 * cos) + (f6 * sin);
        a5[9] = (f8 * cos) - (f9 * sin);
        a5[10] = (f9 * cos) + (f8 * sin);
        a5[13] = (f10 * cos) - (f11 * sin);
        a5[14] = (f11 * cos) + (f10 * sin);
        double B = (interfaceC0533d.B() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(B);
        float sin2 = (float) Math.sin(B);
        float f12 = a5[0];
        float f13 = a5[2];
        float f14 = a5[4];
        float f15 = a5[6];
        float f16 = (f15 * sin2) + (f14 * cos2);
        float f17 = (f15 * cos2) + ((-f14) * sin2);
        float f18 = a5[8];
        float f19 = a5[10];
        float f20 = a5[12];
        float f21 = a5[14];
        a5[0] = (f13 * sin2) + (f12 * cos2);
        a5[2] = (f13 * cos2) + ((-f12) * sin2);
        a5[4] = f16;
        a5[6] = f17;
        a5[8] = (f19 * sin2) + (f18 * cos2);
        a5[10] = (f19 * cos2) + ((-f18) * sin2);
        a5[12] = (f21 * sin2) + (f20 * cos2);
        a5[14] = (f21 * cos2) + ((-f20) * sin2);
        Z.E.e(a5, interfaceC0533d.I());
        Z.E.f(a5, interfaceC0533d.v(), interfaceC0533d.G(), 1.0f);
        Z.E.g(fArr, a5);
        float[] a6 = Z.E.a();
        Z.E.h(a6, Y.c.d(e02), Y.c.e(e02), 0.0f);
        Z.E.g(fArr, a6);
        return fArr;
    }
}
