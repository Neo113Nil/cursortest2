package s0;

import A0.C0030a;
import Z.AbstractC0307d;
import Z.C0311h;
import Z.C0321s;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import c0.C0531b;

/* loaded from: classes.dex */
public final class F0 implements r0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final C1166s f10038d;

    /* renamed from: e, reason: collision with root package name */
    public C0030a f10039e;

    /* renamed from: i, reason: collision with root package name */
    public A3.e f10040i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f10041j;

    /* renamed from: l, reason: collision with root package name */
    public boolean f10043l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f10044m;

    /* renamed from: n, reason: collision with root package name */
    public C0311h f10045n;

    /* renamed from: r, reason: collision with root package name */
    public final InterfaceC1148i0 f10049r;

    /* renamed from: s, reason: collision with root package name */
    public int f10050s;

    /* renamed from: k, reason: collision with root package name */
    public final C1177x0 f10042k = new C1177x0();

    /* renamed from: o, reason: collision with root package name */
    public final C1171u0 f10046o = new C1171u0(C1117C.f9995j);

    /* renamed from: p, reason: collision with root package name */
    public final C0321s f10047p = new C0321s();

    /* renamed from: q, reason: collision with root package name */
    public long f10048q = Z.U.f4510b;

    public F0(C1166s c1166s, C0030a c0030a, A3.e eVar) {
        this.f10038d = c1166s;
        this.f10039e = c0030a;
        this.f10040i = eVar;
        InterfaceC1148i0 d02 = Build.VERSION.SDK_INT >= 29 ? new D0() : new B0(c1166s);
        d02.H();
        d02.E(false);
        this.f10049r = d02;
    }

    @Override // r0.f0
    public final void a(Z.r rVar, C0531b c0531b) {
        Canvas a4 = AbstractC0307d.a(rVar);
        boolean isHardwareAccelerated = a4.isHardwareAccelerated();
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        if (isHardwareAccelerated) {
            g();
            boolean z4 = interfaceC1148i0.J() > 0.0f;
            this.f10044m = z4;
            if (z4) {
                rVar.o();
            }
            interfaceC1148i0.z(a4);
            if (this.f10044m) {
                rVar.j();
                return;
            }
            return;
        }
        float i2 = interfaceC1148i0.i();
        float A4 = interfaceC1148i0.A();
        float f4 = interfaceC1148i0.f();
        float v4 = interfaceC1148i0.v();
        if (interfaceC1148i0.a() < 1.0f) {
            C0311h c0311h = this.f10045n;
            if (c0311h == null) {
                c0311h = Z.K.g();
                this.f10045n = c0311h;
            }
            c0311h.c(interfaceC1148i0.a());
            a4.saveLayer(i2, A4, f4, v4, (Paint) c0311h.f4525b);
        } else {
            rVar.g();
        }
        rVar.q(i2, A4);
        rVar.n(this.f10046o.b(interfaceC1148i0));
        if (interfaceC1148i0.w() || interfaceC1148i0.y()) {
            this.f10042k.a(rVar);
        }
        C0030a c0030a = this.f10039e;
        if (c0030a != null) {
            c0030a.h(rVar, null);
        }
        rVar.b();
        m(false);
    }

    @Override // r0.f0
    public final void b(Z.M m4) {
        A3.e eVar;
        int i2 = m4.f4466d | this.f10050s;
        int i4 = i2 & 4096;
        if (i4 != 0) {
            this.f10048q = m4.f4479t;
        }
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        boolean w4 = interfaceC1148i0.w();
        C1177x0 c1177x0 = this.f10042k;
        boolean z4 = false;
        boolean z5 = w4 && c1177x0.f10411g;
        if ((i2 & 1) != 0) {
            interfaceC1148i0.p(m4.f4467e);
        }
        if ((i2 & 2) != 0) {
            interfaceC1148i0.e(m4.f4468i);
        }
        if ((i2 & 4) != 0) {
            interfaceC1148i0.d(m4.f4469j);
        }
        if ((i2 & 8) != 0) {
            interfaceC1148i0.c(m4.f4470k);
        }
        if ((i2 & 16) != 0) {
            interfaceC1148i0.l(m4.f4471l);
        }
        if ((i2 & 32) != 0) {
            interfaceC1148i0.t(m4.f4472m);
        }
        if ((i2 & 64) != 0) {
            interfaceC1148i0.L(Z.K.D(m4.f4473n));
        }
        if ((i2 & 128) != 0) {
            interfaceC1148i0.F(Z.K.D(m4.f4474o));
        }
        if ((i2 & 1024) != 0) {
            interfaceC1148i0.k(m4.f4477r);
        }
        if ((i2 & 256) != 0) {
            interfaceC1148i0.q(m4.f4475p);
        }
        if ((i2 & 512) != 0) {
            interfaceC1148i0.b(m4.f4476q);
        }
        if ((i2 & 2048) != 0) {
            interfaceC1148i0.m(m4.f4478s);
        }
        if (i4 != 0) {
            interfaceC1148i0.D(Z.U.b(this.f10048q) * interfaceC1148i0.g());
            interfaceC1148i0.s(Z.U.c(this.f10048q) * interfaceC1148i0.j());
        }
        boolean z6 = m4.f4481v;
        E1.i iVar = Z.K.f4461a;
        boolean z7 = z6 && m4.f4480u != iVar;
        if ((i2 & 24576) != 0) {
            interfaceC1148i0.B(z7);
            interfaceC1148i0.E(m4.f4481v && m4.f4480u == iVar);
        }
        if ((131072 & i2) != 0) {
            interfaceC1148i0.h();
        }
        if ((32768 & i2) != 0) {
            interfaceC1148i0.C(m4.f4482w);
        }
        boolean c4 = this.f10042k.c(m4.f4465A, m4.f4469j, z7, m4.f4472m, m4.f4483x);
        if (c1177x0.f10410f) {
            interfaceC1148i0.o(c1177x0.b());
        }
        if (z7 && c1177x0.f10411g) {
            z4 = true;
        }
        C1166s c1166s = this.f10038d;
        if (z5 == z4 && (!z4 || !c4)) {
            m1.f10266a.a(c1166s);
        } else if (!this.f10041j && !this.f10043l) {
            c1166s.invalidate();
            m(true);
        }
        if (!this.f10044m && interfaceC1148i0.J() > 0.0f && (eVar = this.f10040i) != null) {
            eVar.invoke();
        }
        if ((i2 & 7963) != 0) {
            this.f10046o.c();
        }
        this.f10050s = m4.f4466d;
    }

    @Override // r0.f0
    public final void c(float[] fArr) {
        float[] a4 = this.f10046o.a(this.f10049r);
        if (a4 != null) {
            Z.E.g(fArr, a4);
        }
    }

    @Override // r0.f0
    public final void d() {
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        if (interfaceC1148i0.n()) {
            interfaceC1148i0.r();
        }
        this.f10039e = null;
        this.f10040i = null;
        this.f10043l = true;
        m(false);
        C1166s c1166s = this.f10038d;
        c1166s.f10322E = true;
        c1166s.B(this);
    }

    @Override // r0.f0
    public final long e(long j4, boolean z4) {
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        C1171u0 c1171u0 = this.f10046o;
        if (!z4) {
            return Z.E.b(j4, c1171u0.b(interfaceC1148i0));
        }
        float[] a4 = c1171u0.a(interfaceC1148i0);
        if (a4 != null) {
            return Z.E.b(j4, a4);
        }
        return 9187343241974906880L;
    }

    @Override // r0.f0
    public final void f(long j4) {
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        int i2 = interfaceC1148i0.i();
        int A4 = interfaceC1148i0.A();
        int i4 = (int) (j4 >> 32);
        int i5 = (int) (j4 & 4294967295L);
        if (i2 == i4 && A4 == i5) {
            return;
        }
        if (i2 != i4) {
            interfaceC1148i0.u(i4 - i2);
        }
        if (A4 != i5) {
            interfaceC1148i0.x(i5 - A4);
        }
        m1.f10266a.a(this.f10038d);
        this.f10046o.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // r0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void g() {
        Z.J j4;
        C0030a c0030a;
        boolean z4 = this.f10041j;
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        if (z4 || !interfaceC1148i0.n()) {
            if (interfaceC1148i0.w()) {
                C1177x0 c1177x0 = this.f10042k;
                if (c1177x0.f10411g) {
                    c1177x0.d();
                    j4 = c1177x0.f10409e;
                    c0030a = this.f10039e;
                    if (c0030a != null) {
                        interfaceC1148i0.K(this.f10047p, j4, new C1160o0(3, c0030a));
                    }
                    m(false);
                }
            }
            j4 = null;
            c0030a = this.f10039e;
            if (c0030a != null) {
            }
            m(false);
        }
    }

    @Override // r0.f0
    public final void h(long j4) {
        int i2 = (int) (j4 >> 32);
        int i4 = (int) (j4 & 4294967295L);
        float b4 = Z.U.b(this.f10048q) * i2;
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        interfaceC1148i0.D(b4);
        interfaceC1148i0.s(Z.U.c(this.f10048q) * i4);
        if (interfaceC1148i0.G(interfaceC1148i0.i(), interfaceC1148i0.A(), interfaceC1148i0.i() + i2, interfaceC1148i0.A() + i4)) {
            interfaceC1148i0.o(this.f10042k.b());
            if (!this.f10041j && !this.f10043l) {
                this.f10038d.invalidate();
                m(true);
            }
            this.f10046o.c();
        }
    }

    @Override // r0.f0
    public final void i(C0030a c0030a, A3.e eVar) {
        m(false);
        this.f10043l = false;
        this.f10044m = false;
        this.f10048q = Z.U.f4510b;
        this.f10039e = c0030a;
        this.f10040i = eVar;
    }

    @Override // r0.f0
    public final void invalidate() {
        if (this.f10041j || this.f10043l) {
            return;
        }
        this.f10038d.invalidate();
        m(true);
    }

    @Override // r0.f0
    public final void j(float[] fArr) {
        Z.E.g(fArr, this.f10046o.b(this.f10049r));
    }

    @Override // r0.f0
    public final boolean k(long j4) {
        Z.I i2;
        float d4 = Y.c.d(j4);
        float e4 = Y.c.e(j4);
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        if (interfaceC1148i0.y()) {
            return 0.0f <= d4 && d4 < ((float) interfaceC1148i0.g()) && 0.0f <= e4 && e4 < ((float) interfaceC1148i0.j());
        }
        if (!interfaceC1148i0.w()) {
            return true;
        }
        C1177x0 c1177x0 = this.f10042k;
        if (c1177x0.f10417m && (i2 = c1177x0.f10407c) != null) {
            return AbstractC1125K.j(i2, Y.c.d(j4), Y.c.e(j4), null, null);
        }
        return true;
    }

    @Override // r0.f0
    public final void l(Y.b bVar, boolean z4) {
        InterfaceC1148i0 interfaceC1148i0 = this.f10049r;
        C1171u0 c1171u0 = this.f10046o;
        if (!z4) {
            Z.E.c(c1171u0.b(interfaceC1148i0), bVar);
            return;
        }
        float[] a4 = c1171u0.a(interfaceC1148i0);
        if (a4 != null) {
            Z.E.c(a4, bVar);
            return;
        }
        bVar.f4368a = 0.0f;
        bVar.f4369b = 0.0f;
        bVar.f4370c = 0.0f;
        bVar.f4371d = 0.0f;
    }

    public final void m(boolean z4) {
        if (z4 != this.f10041j) {
            this.f10041j = z4;
            this.f10038d.t(this, z4);
        }
    }
}
