package u0;

import C0.C0025a;
import a.AbstractC0235a;
import a0.AbstractC0236a;
import a0.C0237b;
import a0.C0238c;
import a0.C0239d;
import a0.C0240e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import b0.AbstractC0335d;
import b0.C0339h;
import b0.C0341j;
import b0.C0352v;
import d0.C0401b;
import e0.C0416b;
import e0.InterfaceC0418d;
import h2.AbstractC0508a;
import j.AbstractC0523E;
import j.C0519A;
import r0.C0929z;

/* renamed from: u0.p0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1119p0 implements t0.g0 {

    /* renamed from: d, reason: collision with root package name */
    public C0416b f9418d;

    /* renamed from: e, reason: collision with root package name */
    public final b0.D f9419e;

    /* renamed from: f, reason: collision with root package name */
    public final C1123s f9420f;

    /* renamed from: g, reason: collision with root package name */
    public C0025a f9421g;

    /* renamed from: h, reason: collision with root package name */
    public t0.D f9422h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f9424j;

    /* renamed from: l, reason: collision with root package name */
    public float[] f9426l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f9427m;

    /* renamed from: q, reason: collision with root package name */
    public int f9431q;

    /* renamed from: s, reason: collision with root package name */
    public b0.K f9433s;

    /* renamed from: t, reason: collision with root package name */
    public C0341j f9434t;

    /* renamed from: u, reason: collision with root package name */
    public C0339h f9435u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f9436v;

    /* renamed from: i, reason: collision with root package name */
    public long f9423i = O2.d.d(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: k, reason: collision with root package name */
    public final float[] f9425k = b0.G.a();

    /* renamed from: n, reason: collision with root package name */
    public O0.b f9428n = O2.l.G();

    /* renamed from: o, reason: collision with root package name */
    public O0.k f9429o = O0.k.f3741d;

    /* renamed from: p, reason: collision with root package name */
    public final C0401b f9430p = new C0401b();

    /* renamed from: r, reason: collision with root package name */
    public long f9432r = b0.U.f5400b;

    /* renamed from: w, reason: collision with root package name */
    public final C0929z f9437w = new C0929z(9, this);

    public C1119p0(C0416b c0416b, b0.D d3, C1123s c1123s, C0025a c0025a, t0.D d4) {
        this.f9418d = c0416b;
        this.f9419e = d3;
        this.f9420f = c1123s;
        this.f9421g = c0025a;
        this.f9422h = d4;
    }

    @Override // t0.g0
    public final void a(float[] fArr) {
        float[] m3 = m();
        if (m3 != null) {
            b0.G.g(fArr, m3);
        }
    }

    @Override // t0.g0
    public final void b(C0237b c0237b, boolean z3) {
        if (!z3) {
            b0.G.c(n(), c0237b);
            return;
        }
        float[] m3 = m();
        if (m3 != null) {
            b0.G.c(m3, c0237b);
            return;
        }
        c0237b.f4718a = 0.0f;
        c0237b.f4719b = 0.0f;
        c0237b.f4720c = 0.0f;
        c0237b.f4721d = 0.0f;
    }

    @Override // t0.g0
    public final void c() {
        this.f9421g = null;
        this.f9422h = null;
        this.f9424j = true;
        boolean z3 = this.f9427m;
        C1123s c1123s = this.f9420f;
        if (z3) {
            this.f9427m = false;
            c1123s.u(this, false);
        }
        b0.D d3 = this.f9419e;
        if (d3 != null) {
            d3.a(this.f9418d);
            c1123s.C(this);
        }
    }

    @Override // t0.g0
    public final long d(long j3, boolean z3) {
        if (!z3) {
            return b0.G.b(j3, n());
        }
        float[] m3 = m();
        if (m3 != null) {
            return b0.G.b(j3, m3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.g0
    public final void e(long j3) {
        C0416b c0416b = this.f9418d;
        if (!O0.h.a(c0416b.f5712s, j3)) {
            c0416b.f5712s = j3;
            long j4 = c0416b.f5713t;
            c0416b.f5694a.w((int) (j3 >> 32), (int) (j3 & 4294967295L), j4);
        }
        int i3 = Build.VERSION.SDK_INT;
        C1123s c1123s = this.f9420f;
        if (i3 >= 26) {
            l1.f9398a.a(c1123s);
        } else {
            c1123s.invalidate();
        }
    }

    @Override // t0.g0
    public final void f() {
        if (this.f9427m) {
            if (!b0.U.a(this.f9432r, b0.U.f5400b) && !O0.j.a(this.f9418d.f5713t, this.f9423i)) {
                C0416b c0416b = this.f9418d;
                long e3 = l0.c.e(b0.U.b(this.f9432r) * ((int) (this.f9423i >> 32)), b0.U.c(this.f9432r) * ((int) (this.f9423i & 4294967295L)));
                if (!C0238c.b(c0416b.f5714u, e3)) {
                    c0416b.f5714u = e3;
                    c0416b.f5694a.H(e3);
                }
            }
            C0416b c0416b2 = this.f9418d;
            O0.b bVar = this.f9428n;
            O0.k kVar = this.f9429o;
            long j3 = this.f9423i;
            if (!O0.j.a(c0416b2.f5713t, j3)) {
                c0416b2.f5713t = j3;
                long j4 = c0416b2.f5712s;
                c0416b2.f5694a.w((int) (j4 >> 32), (int) (4294967295L & j4), j3);
                if (c0416b2.f5702i == 9205357640488583168L) {
                    c0416b2.f5700g = true;
                    c0416b2.a();
                }
            }
            c0416b2.f5695b = bVar;
            c0416b2.f5696c = kVar;
            c0416b2.f5697d = this.f9437w;
            c0416b2.e();
            if (this.f9427m) {
                this.f9427m = false;
                this.f9420f.u(this, false);
            }
        }
    }

    @Override // t0.g0
    public final void g(long j3) {
        if (O0.j.a(j3, this.f9423i)) {
            return;
        }
        this.f9423i = j3;
        if (this.f9427m || this.f9424j) {
            return;
        }
        C1123s c1123s = this.f9420f;
        c1123s.invalidate();
        if (true != this.f9427m) {
            this.f9427m = true;
            c1123s.u(this, true);
        }
    }

    @Override // t0.g0
    public final void h(b0.r rVar, C0416b c0416b) {
        boolean z3;
        C0416b c0416b2;
        int i3;
        boolean z4;
        Canvas a3 = AbstractC0335d.a(rVar);
        if (!a3.isHardwareAccelerated()) {
            C0416b c0416b3 = this.f9418d;
            long j3 = c0416b3.f5712s;
            float f3 = (int) (j3 >> 32);
            float f4 = (int) (j3 & 4294967295L);
            long j4 = this.f9423i;
            float f5 = f3 + ((int) (j4 >> 32));
            float f6 = f4 + ((int) (4294967295L & j4));
            if (c0416b3.f5694a.a() < 1.0f) {
                C0339h c0339h = this.f9435u;
                if (c0339h == null) {
                    c0339h = b0.M.g();
                    this.f9435u = c0339h;
                }
                c0339h.c(this.f9418d.f5694a.a());
                a3.saveLayer(f3, f4, f5, f6, (Paint) c0339h.f5415b);
            } else {
                rVar.f();
            }
            rVar.s(f3, f4);
            rVar.o(n());
            C0416b c0416b4 = this.f9418d;
            boolean z5 = c0416b4.f5715v;
            if (z5 && z5) {
                b0.K c2 = c0416b4.c();
                if (c2 instanceof b0.I) {
                    b0.r.d(rVar, ((b0.I) c2).f5352a);
                } else if (c2 instanceof b0.J) {
                    C0341j c0341j = this.f9434t;
                    if (c0341j == null) {
                        c0341j = b0.M.h();
                        this.f9434t = c0341j;
                    }
                    c0341j.e();
                    b0.L.a(c0341j, ((b0.J) c2).f5353a);
                    rVar.i(c0341j, 1);
                } else if (c2 instanceof b0.H) {
                    rVar.i(((b0.H) c2).f5351a, 1);
                }
            }
            C0025a c0025a = this.f9421g;
            if (c0025a != null) {
                c0025a.h(rVar, null);
            }
            rVar.a();
            return;
        }
        f();
        this.f9436v = this.f9418d.f5694a.A() > 0.0f;
        C0401b c0401b = this.f9430p;
        G1.m mVar = c0401b.f5649e;
        mVar.v(rVar);
        mVar.f2117c = c0416b;
        C0416b c0416b5 = this.f9418d;
        b0.r h3 = c0401b.S().h();
        C0416b c0416b6 = (C0416b) c0401b.S().f2117c;
        if (c0416b5.f5711r) {
            return;
        }
        c0416b5.a();
        InterfaceC0418d interfaceC0418d = c0416b5.f5694a;
        if (!interfaceC0418d.l()) {
            try {
                c0416b5.e();
            } catch (Throwable unused) {
            }
        }
        boolean z6 = interfaceC0418d.A() > 0.0f;
        if (z6) {
            h3.q();
        }
        Canvas a4 = AbstractC0335d.a(h3);
        boolean isHardwareAccelerated = a4.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            z3 = z6;
            c0416b2 = c0416b6;
        } else {
            a4.save();
            z3 = z6;
            long j5 = c0416b5.f5712s;
            float f7 = (int) (j5 >> 32);
            float f8 = (int) (j5 & 4294967295L);
            long j6 = c0416b5.f5713t;
            c0416b2 = c0416b6;
            float f9 = f7 + ((int) (j6 >> 32));
            float f10 = f8 + ((int) (4294967295L & j6));
            float a5 = interfaceC0418d.a();
            int G3 = interfaceC0418d.G();
            if (a5 < 1.0f || !b0.M.p(G3, 3) || AbstractC0508a.x(interfaceC0418d.L(), 1)) {
                C0339h c0339h2 = c0416b5.f5708o;
                if (c0339h2 == null) {
                    c0339h2 = b0.M.g();
                    c0416b5.f5708o = c0339h2;
                }
                c0339h2.c(a5);
                c0339h2.d(G3);
                c0339h2.f(null);
                a4.saveLayer(f7, f8, f9, f10, (Paint) c0339h2.f5415b);
            } else {
                a4.save();
            }
            a4.translate(f7, f8);
            a4.concat(interfaceC0418d.t());
        }
        boolean z7 = !isHardwareAccelerated && c0416b5.f5715v;
        if (z7) {
            h3.f();
            b0.K c3 = c0416b5.c();
            if (c3 instanceof b0.I) {
                b0.r.d(h3, c3.a());
            } else if (c3 instanceof b0.J) {
                C0341j c0341j2 = c0416b5.f5706m;
                if (c0341j2 != null) {
                    c0341j2.f5420a.rewind();
                } else {
                    c0341j2 = b0.M.h();
                    c0416b5.f5706m = c0341j2;
                }
                b0.L.a(c0341j2, ((b0.J) c3).f5353a);
                h3.i(c0341j2, 1);
            } else if (c3 instanceof b0.H) {
                h3.i(((b0.H) c3).f5351a, 1);
            }
        }
        if (c0416b2 != null) {
            E.F f11 = c0416b2.f5710q;
            if (!f11.f922a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C0519A c0519a = (C0519A) f11.f925d;
            if (c0519a != null) {
                c0519a.a(c0416b5);
            } else if (((C0416b) f11.f923b) != null) {
                int i4 = AbstractC0523E.f6255a;
                C0519A c0519a2 = new C0519A();
                C0416b c0416b7 = (C0416b) f11.f923b;
                f2.j.c(c0416b7);
                c0519a2.a(c0416b7);
                c0519a2.a(c0416b5);
                f11.f925d = c0519a2;
                f11.f923b = null;
            } else {
                f11.f923b = c0416b5;
            }
            C0519A c0519a3 = (C0519A) f11.f926e;
            if (c0519a3 != null) {
                boolean j7 = c0519a3.j(c0416b5);
                i3 = 1;
                z4 = !j7;
            } else {
                i3 = 1;
                if (((C0416b) f11.f924c) != c0416b5) {
                    z4 = true;
                } else {
                    f11.f924c = null;
                    z4 = false;
                }
            }
            if (z4) {
                c0416b5.f5709p += i3;
            }
        }
        interfaceC0418d.r(h3);
        if (z7) {
            h3.a();
        }
        if (z3) {
            h3.h();
        }
        if (isHardwareAccelerated) {
            return;
        }
        a4.restore();
    }

    @Override // t0.g0
    public final void i(float[] fArr) {
        b0.G.g(fArr, n());
    }

    @Override // t0.g0
    public final void invalidate() {
        if (this.f9427m || this.f9424j) {
            return;
        }
        C1123s c1123s = this.f9420f;
        c1123s.invalidate();
        if (true != this.f9427m) {
            this.f9427m = true;
            c1123s.u(this, true);
        }
    }

    @Override // t0.g0
    public final void j(C0025a c0025a, t0.D d3) {
        b0.D d4 = this.f9419e;
        if (d4 == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f9418d.f5711r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f9418d = d4.b();
        this.f9424j = false;
        this.f9421g = c0025a;
        this.f9422h = d3;
        this.f9432r = b0.U.f5400b;
        this.f9436v = false;
        this.f9423i = O2.d.d(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f9433s = null;
        this.f9431q = 0;
    }

    @Override // t0.g0
    public final boolean k(long j3) {
        float d3 = C0238c.d(j3);
        float e3 = C0238c.e(j3);
        C0416b c0416b = this.f9418d;
        if (c0416b.f5715v) {
            return L.u(c0416b.c(), d3, e3, null, null);
        }
        return true;
    }

    @Override // t0.g0
    public final void l(b0.O o3) {
        t0.D d3;
        int i3;
        t0.D d4;
        int i4 = o3.f5359d | this.f9431q;
        this.f9429o = o3.f5378w;
        this.f9428n = o3.f5377v;
        int i5 = i4 & 4096;
        if (i5 != 0) {
            this.f9432r = o3.f5372q;
        }
        if ((i4 & 1) != 0) {
            C0416b c0416b = this.f9418d;
            float f3 = o3.f5360e;
            InterfaceC0418d interfaceC0418d = c0416b.f5694a;
            if (interfaceC0418d.s() != f3) {
                interfaceC0418d.m(f3);
            }
        }
        if ((i4 & 2) != 0) {
            C0416b c0416b2 = this.f9418d;
            float f4 = o3.f5361f;
            InterfaceC0418d interfaceC0418d2 = c0416b2.f5694a;
            if (interfaceC0418d2.D() != f4) {
                interfaceC0418d2.e(f4);
            }
        }
        if ((i4 & 4) != 0) {
            C0416b c0416b3 = this.f9418d;
            float f5 = o3.f5362g;
            InterfaceC0418d interfaceC0418d3 = c0416b3.f5694a;
            if (interfaceC0418d3.a() != f5) {
                interfaceC0418d3.d(f5);
            }
        }
        if ((i4 & 8) != 0) {
            C0416b c0416b4 = this.f9418d;
            float f6 = o3.f5363h;
            InterfaceC0418d interfaceC0418d4 = c0416b4.f5694a;
            if (interfaceC0418d4.J() != f6) {
                interfaceC0418d4.c(f6);
            }
        }
        if ((i4 & 16) != 0) {
            C0416b c0416b5 = this.f9418d;
            float f7 = o3.f5364i;
            InterfaceC0418d interfaceC0418d5 = c0416b5.f5694a;
            if (interfaceC0418d5.v() != f7) {
                interfaceC0418d5.j(f7);
            }
        }
        boolean z3 = true;
        if ((i4 & 32) != 0) {
            C0416b c0416b6 = this.f9418d;
            float f8 = o3.f5365j;
            InterfaceC0418d interfaceC0418d6 = c0416b6.f5694a;
            if (interfaceC0418d6.A() != f8) {
                interfaceC0418d6.u(f8);
                c0416b6.f5700g = true;
                c0416b6.a();
            }
            if (o3.f5365j > 0.0f && !this.f9436v && (d4 = this.f9422h) != null) {
                d4.b();
            }
        }
        if ((i4 & 64) != 0) {
            C0416b c0416b7 = this.f9418d;
            long j3 = o3.f5366k;
            InterfaceC0418d interfaceC0418d7 = c0416b7.f5694a;
            if (!C0352v.c(j3, interfaceC0418d7.I())) {
                interfaceC0418d7.z(j3);
            }
        }
        if ((i4 & 128) != 0) {
            C0416b c0416b8 = this.f9418d;
            long j4 = o3.f5367l;
            InterfaceC0418d interfaceC0418d8 = c0416b8.f5694a;
            if (!C0352v.c(j4, interfaceC0418d8.y())) {
                interfaceC0418d8.q(j4);
            }
        }
        if ((i4 & 1024) != 0) {
            C0416b c0416b9 = this.f9418d;
            float f9 = o3.f5370o;
            InterfaceC0418d interfaceC0418d9 = c0416b9.f5694a;
            if (interfaceC0418d9.F() != f9) {
                interfaceC0418d9.i(f9);
            }
        }
        if ((i4 & 256) != 0) {
            C0416b c0416b10 = this.f9418d;
            float f10 = o3.f5368m;
            InterfaceC0418d interfaceC0418d10 = c0416b10.f5694a;
            if (interfaceC0418d10.M() != f10) {
                interfaceC0418d10.n(f10);
            }
        }
        if ((i4 & 512) != 0) {
            C0416b c0416b11 = this.f9418d;
            float f11 = o3.f5369n;
            InterfaceC0418d interfaceC0418d11 = c0416b11.f5694a;
            if (interfaceC0418d11.x() != f11) {
                interfaceC0418d11.b(f11);
            }
        }
        if ((i4 & 2048) != 0) {
            C0416b c0416b12 = this.f9418d;
            float f12 = o3.f5371p;
            InterfaceC0418d interfaceC0418d12 = c0416b12.f5694a;
            if (interfaceC0418d12.E() != f12) {
                interfaceC0418d12.k(f12);
            }
        }
        if (i5 != 0) {
            if (b0.U.a(this.f9432r, b0.U.f5400b)) {
                C0416b c0416b13 = this.f9418d;
                if (!C0238c.b(c0416b13.f5714u, 9205357640488583168L)) {
                    c0416b13.f5714u = 9205357640488583168L;
                    c0416b13.f5694a.H(9205357640488583168L);
                }
            } else {
                C0416b c0416b14 = this.f9418d;
                long e3 = l0.c.e(b0.U.b(this.f9432r) * ((int) (this.f9423i >> 32)), b0.U.c(this.f9432r) * ((int) (this.f9423i & 4294967295L)));
                if (!C0238c.b(c0416b14.f5714u, e3)) {
                    c0416b14.f5714u = e3;
                    c0416b14.f5694a.H(e3);
                }
            }
        }
        if ((i4 & 16384) != 0) {
            C0416b c0416b15 = this.f9418d;
            boolean z4 = o3.f5374s;
            if (c0416b15.f5715v != z4) {
                c0416b15.f5715v = z4;
                c0416b15.f5700g = true;
                c0416b15.a();
            }
        }
        if ((131072 & i4) != 0) {
            InterfaceC0418d interfaceC0418d13 = this.f9418d.f5694a;
            if (!f2.j.a(null, null)) {
                interfaceC0418d13.g();
            }
        }
        if ((32768 & i4) != 0) {
            C0416b c0416b16 = this.f9418d;
            int i6 = o3.f5375t;
            if (b0.M.q(i6, 0)) {
                i3 = 0;
            } else if (b0.M.q(i6, 1)) {
                i3 = 1;
            } else {
                i3 = 2;
                if (!b0.M.q(i6, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            InterfaceC0418d interfaceC0418d14 = c0416b16.f5694a;
            if (!AbstractC0508a.x(interfaceC0418d14.L(), i3)) {
                interfaceC0418d14.p(i3);
            }
        }
        if (f2.j.a(this.f9433s, o3.f5379x)) {
            z3 = false;
        } else {
            b0.K k3 = o3.f5379x;
            this.f9433s = k3;
            if (k3 != null) {
                C0416b c0416b17 = this.f9418d;
                if (k3 instanceof b0.I) {
                    C0239d c0239d = ((b0.I) k3).f5352a;
                    c0416b17.f(l0.c.e(c0239d.f4724a, c0239d.f4725b), AbstractC0235a.e(c0239d.c(), c0239d.b()), 0.0f);
                } else if (k3 instanceof b0.H) {
                    c0416b17.f5704k = null;
                    c0416b17.f5702i = 9205357640488583168L;
                    c0416b17.f5701h = 0L;
                    c0416b17.f5703j = 0.0f;
                    c0416b17.f5700g = true;
                    c0416b17.f5707n = false;
                    c0416b17.f5705l = ((b0.H) k3).f5351a;
                    c0416b17.a();
                } else if (k3 instanceof b0.J) {
                    b0.J j5 = (b0.J) k3;
                    C0341j c0341j = j5.f5354b;
                    if (c0341j != null) {
                        c0416b17.f5704k = null;
                        c0416b17.f5702i = 9205357640488583168L;
                        c0416b17.f5701h = 0L;
                        c0416b17.f5703j = 0.0f;
                        c0416b17.f5700g = true;
                        c0416b17.f5707n = false;
                        c0416b17.f5705l = c0341j;
                        c0416b17.a();
                    } else {
                        C0240e c0240e = j5.f5353a;
                        c0416b17.f(l0.c.e(c0240e.f4728a, c0240e.f4729b), AbstractC0235a.e(c0240e.b(), c0240e.a()), AbstractC0236a.b(c0240e.f4735h));
                    }
                }
                if ((k3 instanceof b0.H) && Build.VERSION.SDK_INT < 33 && (d3 = this.f9422h) != null) {
                    d3.b();
                }
            }
        }
        this.f9431q = o3.f5359d;
        if (i4 != 0 || z3) {
            int i7 = Build.VERSION.SDK_INT;
            C1123s c1123s = this.f9420f;
            if (i7 >= 26) {
                l1.f9398a.a(c1123s);
            } else {
                c1123s.invalidate();
            }
        }
    }

    public final float[] m() {
        float[] n3 = n();
        float[] fArr = this.f9426l;
        if (fArr == null) {
            fArr = b0.G.a();
            this.f9426l = fArr;
        }
        if (L.s(n3, fArr)) {
            return fArr;
        }
        return null;
    }

    public final float[] n() {
        C0416b c0416b = this.f9418d;
        long w2 = l0.c.E(c0416b.f5714u) ? AbstractC0235a.w(O2.d.f0(this.f9423i)) : c0416b.f5714u;
        float[] fArr = this.f9425k;
        b0.G.d(fArr);
        float[] a3 = b0.G.a();
        b0.G.h(a3, -C0238c.d(w2), -C0238c.e(w2), 0.0f);
        b0.G.g(fArr, a3);
        float[] a4 = b0.G.a();
        InterfaceC0418d interfaceC0418d = c0416b.f5694a;
        b0.G.h(a4, interfaceC0418d.J(), interfaceC0418d.v(), 0.0f);
        double M3 = (interfaceC0418d.M() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(M3);
        float sin = (float) Math.sin(M3);
        float f3 = a4[1];
        float f4 = a4[2];
        float f5 = a4[5];
        float f6 = a4[6];
        float f7 = a4[9];
        float f8 = a4[10];
        float f9 = a4[13];
        float f10 = a4[14];
        a4[1] = (f3 * cos) - (f4 * sin);
        a4[2] = (f4 * cos) + (f3 * sin);
        a4[5] = (f5 * cos) - (f6 * sin);
        a4[6] = (f6 * cos) + (f5 * sin);
        a4[9] = (f7 * cos) - (f8 * sin);
        a4[10] = (f8 * cos) + (f7 * sin);
        a4[13] = (f9 * cos) - (f10 * sin);
        a4[14] = (f10 * cos) + (f9 * sin);
        double x3 = (interfaceC0418d.x() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(x3);
        float sin2 = (float) Math.sin(x3);
        float f11 = a4[0];
        float f12 = a4[2];
        float f13 = a4[4];
        float f14 = a4[6];
        float f15 = (f14 * sin2) + (f13 * cos2);
        float f16 = (f14 * cos2) + ((-f13) * sin2);
        float f17 = a4[8];
        float f18 = a4[10];
        float f19 = a4[12];
        float f20 = a4[14];
        a4[0] = (f12 * sin2) + (f11 * cos2);
        a4[2] = (f12 * cos2) + ((-f11) * sin2);
        a4[4] = f15;
        a4[6] = f16;
        a4[8] = (f18 * sin2) + (f17 * cos2);
        a4[10] = (f18 * cos2) + ((-f17) * sin2);
        a4[12] = (f20 * sin2) + (f19 * cos2);
        a4[14] = (f20 * cos2) + ((-f19) * sin2);
        b0.G.e(a4, interfaceC0418d.F());
        b0.G.f(a4, interfaceC0418d.s(), interfaceC0418d.D(), 1.0f);
        b0.G.g(fArr, a4);
        float[] a5 = b0.G.a();
        b0.G.h(a5, C0238c.d(w2), C0238c.e(w2), 0.0f);
        b0.G.g(fArr, a5);
        return fArr;
    }
}
