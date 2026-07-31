package u0;

import C0.C0025a;
import a0.C0237b;
import a0.C0238c;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import b0.AbstractC0335d;
import b0.C0339h;
import b0.C0349s;
import e0.C0416b;
import r0.C0929z;

/* loaded from: classes.dex */
public final class E0 implements t0.g0 {

    /* renamed from: d, reason: collision with root package name */
    public final C1123s f9174d;

    /* renamed from: e, reason: collision with root package name */
    public C0025a f9175e;

    /* renamed from: f, reason: collision with root package name */
    public t0.D f9176f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f9177g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f9179i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9180j;

    /* renamed from: k, reason: collision with root package name */
    public C0339h f9181k;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC1105i0 f9185o;

    /* renamed from: p, reason: collision with root package name */
    public int f9186p;

    /* renamed from: h, reason: collision with root package name */
    public final C1132w0 f9178h = new C1132w0();

    /* renamed from: l, reason: collision with root package name */
    public final C1126t0 f9182l = new C1126t0(C1087D.f9135h);

    /* renamed from: m, reason: collision with root package name */
    public final C0349s f9183m = new C0349s();

    /* renamed from: n, reason: collision with root package name */
    public long f9184n = b0.U.f5400b;

    public E0(C1123s c1123s, C0025a c0025a, t0.D d3) {
        this.f9174d = c1123s;
        this.f9175e = c0025a;
        this.f9176f = d3;
        InterfaceC1105i0 c02 = Build.VERSION.SDK_INT >= 29 ? new C0() : new A0(c1123s);
        c02.I();
        c02.E(false);
        this.f9185o = c02;
    }

    @Override // t0.g0
    public final void a(float[] fArr) {
        float[] a3 = this.f9182l.a(this.f9185o);
        if (a3 != null) {
            b0.G.g(fArr, a3);
        }
    }

    @Override // t0.g0
    public final void b(C0237b c0237b, boolean z3) {
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        C1126t0 c1126t0 = this.f9182l;
        if (!z3) {
            b0.G.c(c1126t0.b(interfaceC1105i0), c0237b);
            return;
        }
        float[] a3 = c1126t0.a(interfaceC1105i0);
        if (a3 != null) {
            b0.G.c(a3, c0237b);
            return;
        }
        c0237b.f4718a = 0.0f;
        c0237b.f4719b = 0.0f;
        c0237b.f4720c = 0.0f;
        c0237b.f4721d = 0.0f;
    }

    @Override // t0.g0
    public final void c() {
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        if (interfaceC1105i0.l()) {
            interfaceC1105i0.o();
        }
        this.f9175e = null;
        this.f9176f = null;
        this.f9179i = true;
        m(false);
        C1123s c1123s = this.f9174d;
        c1123s.f9454B = true;
        c1123s.C(this);
    }

    @Override // t0.g0
    public final long d(long j3, boolean z3) {
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        C1126t0 c1126t0 = this.f9182l;
        if (!z3) {
            return b0.G.b(j3, c1126t0.b(interfaceC1105i0));
        }
        float[] a3 = c1126t0.a(interfaceC1105i0);
        if (a3 != null) {
            return b0.G.b(j3, a3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.g0
    public final void e(long j3) {
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        int A3 = interfaceC1105i0.A();
        int z3 = interfaceC1105i0.z();
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (A3 == i3 && z3 == i4) {
            return;
        }
        if (A3 != i3) {
            interfaceC1105i0.r(i3 - A3);
        }
        if (z3 != i4) {
            interfaceC1105i0.w(i4 - z3);
        }
        int i5 = Build.VERSION.SDK_INT;
        C1123s c1123s = this.f9174d;
        if (i5 >= 26) {
            l1.f9398a.a(c1123s);
        } else {
            c1123s.invalidate();
        }
        this.f9182l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // t0.g0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        b0.L l3;
        C0025a c0025a;
        boolean z3 = this.f9177g;
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        if (z3 || !interfaceC1105i0.l()) {
            if (interfaceC1105i0.v()) {
                C1132w0 c1132w0 = this.f9178h;
                if (c1132w0.f9542g) {
                    c1132w0.d();
                    l3 = c1132w0.f9540e;
                    c0025a = this.f9175e;
                    if (c0025a != null) {
                        interfaceC1105i0.u(this.f9183m, l3, new C0929z(11, c0025a));
                    }
                    m(false);
                }
            }
            l3 = null;
            c0025a = this.f9175e;
            if (c0025a != null) {
            }
            m(false);
        }
    }

    @Override // t0.g0
    public final void g(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        float b3 = b0.U.b(this.f9184n) * i3;
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        interfaceC1105i0.D(b3);
        interfaceC1105i0.p(b0.U.c(this.f9184n) * i4);
        if (interfaceC1105i0.H(interfaceC1105i0.A(), interfaceC1105i0.z(), interfaceC1105i0.A() + i3, interfaceC1105i0.z() + i4)) {
            interfaceC1105i0.F(this.f9178h.b());
            if (!this.f9177g && !this.f9179i) {
                this.f9174d.invalidate();
                m(true);
            }
            this.f9182l.c();
        }
    }

    @Override // t0.g0
    public final void h(b0.r rVar, C0416b c0416b) {
        Canvas a3 = AbstractC0335d.a(rVar);
        boolean isHardwareAccelerated = a3.isHardwareAccelerated();
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        if (isHardwareAccelerated) {
            f();
            boolean z3 = interfaceC1105i0.K() > 0.0f;
            this.f9180j = z3;
            if (z3) {
                rVar.q();
            }
            interfaceC1105i0.y(a3);
            if (this.f9180j) {
                rVar.h();
                return;
            }
            return;
        }
        float A3 = interfaceC1105i0.A();
        float z4 = interfaceC1105i0.z();
        float t3 = interfaceC1105i0.t();
        float s3 = interfaceC1105i0.s();
        if (interfaceC1105i0.a() < 1.0f) {
            C0339h c0339h = this.f9181k;
            if (c0339h == null) {
                c0339h = b0.M.g();
                this.f9181k = c0339h;
            }
            c0339h.c(interfaceC1105i0.a());
            a3.saveLayer(A3, z4, t3, s3, (Paint) c0339h.f5415b);
        } else {
            rVar.f();
        }
        rVar.s(A3, z4);
        rVar.o(this.f9182l.b(interfaceC1105i0));
        if (interfaceC1105i0.v() || interfaceC1105i0.x()) {
            this.f9178h.a(rVar);
        }
        C0025a c0025a = this.f9175e;
        if (c0025a != null) {
            c0025a.h(rVar, null);
        }
        rVar.a();
        m(false);
    }

    @Override // t0.g0
    public final void i(float[] fArr) {
        b0.G.g(fArr, this.f9182l.b(this.f9185o));
    }

    @Override // t0.g0
    public final void invalidate() {
        if (this.f9177g || this.f9179i) {
            return;
        }
        this.f9174d.invalidate();
        m(true);
    }

    @Override // t0.g0
    public final void j(C0025a c0025a, t0.D d3) {
        m(false);
        this.f9179i = false;
        this.f9180j = false;
        this.f9184n = b0.U.f5400b;
        this.f9175e = c0025a;
        this.f9176f = d3;
    }

    @Override // t0.g0
    public final boolean k(long j3) {
        b0.K k3;
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        if (interfaceC1105i0.x()) {
            return 0.0f <= d3 && d3 < ((float) interfaceC1105i0.f()) && 0.0f <= e3 && e3 < ((float) interfaceC1105i0.h());
        }
        if (!interfaceC1105i0.v()) {
            return true;
        }
        C1132w0 c1132w0 = this.f9178h;
        if (c1132w0.f9548m && (k3 = c1132w0.f9538c) != null) {
            return L.u(k3, C0238c.d(j3), C0238c.e(j3), null, null);
        }
        return true;
    }

    @Override // t0.g0
    public final void l(b0.O o3) {
        t0.D d3;
        int i3 = o3.f5359d | this.f9186p;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.f9184n = o3.f5372q;
        }
        InterfaceC1105i0 interfaceC1105i0 = this.f9185o;
        boolean v3 = interfaceC1105i0.v();
        C1132w0 c1132w0 = this.f9178h;
        boolean z3 = false;
        boolean z4 = v3 && c1132w0.f9542g;
        if ((i3 & 1) != 0) {
            interfaceC1105i0.m(o3.f5360e);
        }
        if ((i3 & 2) != 0) {
            interfaceC1105i0.e(o3.f5361f);
        }
        if ((i3 & 4) != 0) {
            interfaceC1105i0.d(o3.f5362g);
        }
        if ((i3 & 8) != 0) {
            interfaceC1105i0.c(o3.f5363h);
        }
        if ((i3 & 16) != 0) {
            interfaceC1105i0.j(o3.f5364i);
        }
        if ((i3 & 32) != 0) {
            interfaceC1105i0.q(o3.f5365j);
        }
        if ((i3 & 64) != 0) {
            interfaceC1105i0.L(b0.M.D(o3.f5366k));
        }
        if ((i3 & 128) != 0) {
            interfaceC1105i0.G(b0.M.D(o3.f5367l));
        }
        if ((i3 & 1024) != 0) {
            interfaceC1105i0.i(o3.f5370o);
        }
        if ((i3 & 256) != 0) {
            interfaceC1105i0.n(o3.f5368m);
        }
        if ((i3 & 512) != 0) {
            interfaceC1105i0.b(o3.f5369n);
        }
        if ((i3 & 2048) != 0) {
            interfaceC1105i0.k(o3.f5371p);
        }
        if (i4 != 0) {
            interfaceC1105i0.D(b0.U.b(this.f9184n) * interfaceC1105i0.f());
            interfaceC1105i0.p(b0.U.c(this.f9184n) * interfaceC1105i0.h());
        }
        boolean z5 = o3.f5374s;
        A1.i iVar = b0.M.f5355a;
        boolean z6 = z5 && o3.f5373r != iVar;
        if ((i3 & 24576) != 0) {
            interfaceC1105i0.B(z6);
            interfaceC1105i0.E(o3.f5374s && o3.f5373r == iVar);
        }
        if ((131072 & i3) != 0) {
            interfaceC1105i0.g();
        }
        if ((32768 & i3) != 0) {
            interfaceC1105i0.C(o3.f5375t);
        }
        boolean c2 = this.f9178h.c(o3.f5379x, o3.f5362g, z6, o3.f5365j, o3.f5376u);
        if (c1132w0.f9541f) {
            interfaceC1105i0.F(c1132w0.b());
        }
        if (z6 && c1132w0.f9542g) {
            z3 = true;
        }
        C1123s c1123s = this.f9174d;
        if (z4 != z3 || (z3 && c2)) {
            if (!this.f9177g && !this.f9179i) {
                c1123s.invalidate();
                m(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            l1.f9398a.a(c1123s);
        } else {
            c1123s.invalidate();
        }
        if (!this.f9180j && interfaceC1105i0.K() > 0.0f && (d3 = this.f9176f) != null) {
            d3.b();
        }
        if ((i3 & 7963) != 0) {
            this.f9182l.c();
        }
        this.f9186p = o3.f5359d;
    }

    public final void m(boolean z3) {
        if (z3 != this.f9177g) {
            this.f9177g = z3;
            this.f9174d.u(this, z3);
        }
    }
}
