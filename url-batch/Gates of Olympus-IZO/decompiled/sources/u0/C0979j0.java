package u0;

import D1.C0014b;
import F.C0036e;
import a.AbstractC0157a;
import a0.AbstractC0158a;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0254E;
import b0.C0255F;
import b0.C0256G;
import b0.C0261L;
import b0.C0266Q;
import b0.C0276i;
import b0.C0278k;
import b0.C0288u;
import b0.InterfaceC0251B;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;
import d0.C0321b;
import e0.C0336b;
import j.AbstractC0479E;
import j.C0475A;

/* renamed from: u0.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0979j0 implements t0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public C0336b f8338d;

    /* renamed from: e, reason: collision with root package name */
    public final InterfaceC0251B f8339e;

    /* renamed from: f, reason: collision with root package name */
    public final C0997t f8340f;

    /* renamed from: g, reason: collision with root package name */
    public C0036e f8341g;

    /* renamed from: h, reason: collision with root package name */
    public r1.r f8342h;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8344j;

    /* renamed from: l, reason: collision with root package name */
    public float[] f8346l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f8347m;

    /* renamed from: q, reason: collision with root package name */
    public int f8350q;

    /* renamed from: s, reason: collision with root package name */
    public AbstractC0257H f8352s;

    /* renamed from: t, reason: collision with root package name */
    public C0278k f8353t;

    /* renamed from: u, reason: collision with root package name */
    public C0276i f8354u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f8355v;

    /* renamed from: i, reason: collision with root package name */
    public long f8343i = I2.l.e(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: k, reason: collision with root package name */
    public final float[] f8345k = AbstractC0259J.l();

    /* renamed from: n, reason: collision with root package name */
    public M0.b f8348n = AbstractC0157a.a();

    /* renamed from: o, reason: collision with root package name */
    public M0.j f8349o = M0.j.f2775d;
    public final C0321b p = new C0321b();

    /* renamed from: r, reason: collision with root package name */
    public long f8351r = C0266Q.f4258b;

    /* renamed from: w, reason: collision with root package name */
    public final t.x f8356w = new t.x(8, this);

    public C0979j0(C0336b c0336b, InterfaceC0251B interfaceC0251B, C0997t c0997t, C0036e c0036e, r1.r rVar) {
        this.f8338d = c0336b;
        this.f8339e = interfaceC0251B;
        this.f8340f = c0997t;
        this.f8341g = c0036e;
        this.f8342h = rVar;
    }

    @Override // t0.f0
    public final void a(C0036e c0036e, r1.r rVar) {
        InterfaceC0251B interfaceC0251B = this.f8339e;
        if (interfaceC0251B == null) {
            throw new IllegalArgumentException("currently reuse is only supported when we manage the layer lifecycle");
        }
        if (!this.f8338d.f4488r) {
            throw new IllegalArgumentException("layer should have been released before reuse");
        }
        this.f8338d = interfaceC0251B.b();
        this.f8344j = false;
        this.f8341g = c0036e;
        this.f8342h = rVar;
        this.f8351r = C0266Q.f4258b;
        this.f8355v = false;
        this.f8343i = I2.l.e(Integer.MAX_VALUE, Integer.MAX_VALUE);
        this.f8352s = null;
        this.f8350q = 0;
    }

    @Override // t0.f0
    public final void b(a0.b bVar, boolean z3) {
        if (!z3) {
            AbstractC0259J.v(k(), bVar);
            return;
        }
        float[] k3 = k();
        float[] fArr = this.f8346l;
        if (fArr == null) {
            fArr = AbstractC0259J.l();
            this.f8346l = fArr;
        }
        if (!L.o(k3, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            AbstractC0259J.v(fArr, bVar);
            return;
        }
        bVar.f3485a = 0.0f;
        bVar.f3486b = 0.0f;
        bVar.f3487c = 0.0f;
        bVar.f3488d = 0.0f;
    }

    @Override // t0.f0
    public final void c() {
        this.f8341g = null;
        this.f8342h = null;
        this.f8344j = true;
        boolean z3 = this.f8347m;
        C0997t c0997t = this.f8340f;
        if (z3) {
            this.f8347m = false;
            c0997t.u(this, false);
        }
        InterfaceC0251B interfaceC0251B = this.f8339e;
        if (interfaceC0251B != null) {
            interfaceC0251B.a(this.f8338d);
            c0997t.C(this);
        }
    }

    @Override // t0.f0
    public final long d(long j3, boolean z3) {
        if (!z3) {
            return AbstractC0259J.u(k(), j3);
        }
        float[] k3 = k();
        float[] fArr = this.f8346l;
        if (fArr == null) {
            fArr = AbstractC0259J.l();
            this.f8346l = fArr;
        }
        if (!L.o(k3, fArr)) {
            fArr = null;
        }
        if (fArr != null) {
            return AbstractC0259J.u(fArr, j3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.f0
    public final void e(long j3) {
        C0336b c0336b = this.f8338d;
        if (!M0.g.a(c0336b.f4489s, j3)) {
            c0336b.f4489s = j3;
            long j4 = c0336b.f4490t;
            c0336b.f4472a.w((int) (j3 >> 32), (int) (j3 & 4294967295L), j4);
        }
        int i3 = Build.VERSION.SDK_INT;
        C0997t c0997t = this.f8340f;
        if (i3 >= 26) {
            a1.f8288a.a(c0997t);
        } else {
            c0997t.invalidate();
        }
    }

    @Override // t0.f0
    public final void f() {
        if (this.f8347m) {
            if (!C0266Q.a(this.f8351r, C0266Q.f4258b) && !M0.i.a(this.f8338d.f4490t, this.f8343i)) {
                C0336b c0336b = this.f8338d;
                long f3 = I2.l.f(C0266Q.b(this.f8351r) * ((int) (this.f8343i >> 32)), C0266Q.c(this.f8351r) * ((int) (this.f8343i & 4294967295L)));
                if (!a0.c.b(c0336b.f4491u, f3)) {
                    c0336b.f4491u = f3;
                    c0336b.f4472a.G(f3);
                }
            }
            C0336b c0336b2 = this.f8338d;
            M0.b bVar = this.f8348n;
            M0.j jVar = this.f8349o;
            long j3 = this.f8343i;
            if (!M0.i.a(c0336b2.f4490t, j3)) {
                c0336b2.f4490t = j3;
                long j4 = c0336b2.f4489s;
                c0336b2.f4472a.w((int) (j4 >> 32), (int) (4294967295L & j4), j3);
                if (c0336b2.f4480i == 9205357640488583168L) {
                    c0336b2.f4478g = true;
                    c0336b2.a();
                }
            }
            c0336b2.f4473b = bVar;
            c0336b2.f4474c = jVar;
            c0336b2.f4475d = this.f8356w;
            c0336b2.e();
            if (this.f8347m) {
                this.f8347m = false;
                this.f8340f.u(this, false);
            }
        }
    }

    @Override // t0.f0
    public final void g(long j3) {
        if (M0.i.a(j3, this.f8343i)) {
            return;
        }
        this.f8343i = j3;
        if (this.f8347m || this.f8344j) {
            return;
        }
        C0997t c0997t = this.f8340f;
        c0997t.invalidate();
        if (true != this.f8347m) {
            this.f8347m = true;
            c0997t.u(this, true);
        }
    }

    @Override // t0.f0
    public final void h(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        boolean z3;
        C0336b c0336b2;
        int i3;
        boolean z4;
        Canvas a3 = AbstractC0272e.a(interfaceC0285r);
        if (!a3.isHardwareAccelerated()) {
            C0336b c0336b3 = this.f8338d;
            long j3 = c0336b3.f4489s;
            float f3 = (int) (j3 >> 32);
            float f4 = (int) (j3 & 4294967295L);
            long j4 = this.f8343i;
            float f5 = f3 + ((int) (j4 >> 32));
            float f6 = f4 + ((int) (4294967295L & j4));
            if (c0336b3.f4472a.a() < 1.0f) {
                C0276i c0276i = this.f8354u;
                if (c0276i == null) {
                    c0276i = AbstractC0259J.f();
                    this.f8354u = c0276i;
                }
                c0276i.c(this.f8338d.f4472a.a());
                a3.saveLayer(f3, f4, f5, f6, (Paint) c0276i.f4273b);
            } else {
                interfaceC0285r.f();
            }
            interfaceC0285r.r(f3, f4);
            interfaceC0285r.o(k());
            C0336b c0336b4 = this.f8338d;
            boolean z5 = c0336b4.f4492v;
            if (z5 && z5) {
                AbstractC0257H c3 = c0336b4.c();
                if (c3 instanceof C0255F) {
                    InterfaceC0285r.d(interfaceC0285r, ((C0255F) c3).f4212a);
                } else if (c3 instanceof C0256G) {
                    C0278k c0278k = this.f8353t;
                    if (c0278k == null) {
                        c0278k = AbstractC0259J.g();
                        this.f8353t = c0278k;
                    }
                    c0278k.h();
                    InterfaceC0258I.a(c0278k, ((C0256G) c3).f4213a);
                    interfaceC0285r.i(c0278k, 1);
                } else if (c3 instanceof C0254E) {
                    interfaceC0285r.i(((C0254E) c3).f4211a, 1);
                }
            }
            C0036e c0036e = this.f8341g;
            if (c0036e != null) {
                c0036e.g(interfaceC0285r, null);
            }
            interfaceC0285r.a();
            return;
        }
        f();
        this.f8355v = this.f8338d.f4472a.A() > 0.0f;
        C0321b c0321b = this.p;
        C0014b c0014b = c0321b.f4444e;
        c0014b.u(interfaceC0285r);
        c0014b.f537c = c0336b;
        C0336b c0336b5 = this.f8338d;
        InterfaceC0285r h3 = c0321b.P().h();
        C0336b c0336b6 = (C0336b) c0321b.P().f537c;
        if (c0336b5.f4488r) {
            return;
        }
        c0336b5.a();
        e0.d dVar = c0336b5.f4472a;
        if (!dVar.l()) {
            try {
                c0336b5.e();
            } catch (Throwable unused) {
            }
        }
        boolean z6 = dVar.A() > 0.0f;
        if (z6) {
            h3.p();
        }
        Canvas a4 = AbstractC0272e.a(h3);
        boolean isHardwareAccelerated = a4.isHardwareAccelerated();
        if (isHardwareAccelerated) {
            z3 = z6;
            c0336b2 = c0336b6;
        } else {
            a4.save();
            z3 = z6;
            long j5 = c0336b5.f4489s;
            float f7 = (int) (j5 >> 32);
            float f8 = (int) (j5 & 4294967295L);
            long j6 = c0336b5.f4490t;
            c0336b2 = c0336b6;
            float f9 = f7 + ((int) (j6 >> 32));
            float f10 = f8 + ((int) (4294967295L & j6));
            float a5 = dVar.a();
            int F3 = dVar.F();
            if (a5 < 1.0f || !AbstractC0259J.n(F3, 3) || I2.l.x(dVar.K(), 1)) {
                C0276i c0276i2 = c0336b5.f4486o;
                if (c0276i2 == null) {
                    c0276i2 = AbstractC0259J.f();
                    c0336b5.f4486o = c0276i2;
                }
                c0276i2.c(a5);
                c0276i2.d(F3);
                c0276i2.f(null);
                a4.saveLayer(f7, f8, f9, f10, (Paint) c0276i2.f4273b);
            } else {
                a4.save();
            }
            a4.translate(f7, f8);
            a4.concat(dVar.t());
        }
        boolean z7 = !isHardwareAccelerated && c0336b5.f4492v;
        if (z7) {
            h3.f();
            AbstractC0257H c4 = c0336b5.c();
            if (c4 instanceof C0255F) {
                InterfaceC0285r.d(h3, c4.a());
            } else if (c4 instanceof C0256G) {
                C0278k c0278k2 = c0336b5.f4484m;
                if (c0278k2 != null) {
                    c0278k2.f4278a.rewind();
                } else {
                    c0278k2 = AbstractC0259J.g();
                    c0336b5.f4484m = c0278k2;
                }
                InterfaceC0258I.a(c0278k2, ((C0256G) c4).f4213a);
                h3.i(c0278k2, 1);
            } else if (c4 instanceof C0254E) {
                h3.i(((C0254E) c4).f4211a, 1);
            }
        }
        if (c0336b2 != null) {
            E.G g3 = c0336b2.f4487q;
            if (!g3.f621a) {
                throw new IllegalArgumentException("Only add dependencies during a tracking");
            }
            C0475A c0475a = (C0475A) g3.f624d;
            if (c0475a != null) {
                c0475a.a(c0336b5);
            } else if (((C0336b) g3.f622b) != null) {
                int i4 = AbstractC0479E.f5137a;
                C0475A c0475a2 = new C0475A();
                C0336b c0336b7 = (C0336b) g3.f622b;
                Z1.i.c(c0336b7);
                c0475a2.a(c0336b7);
                c0475a2.a(c0336b5);
                g3.f624d = c0475a2;
                g3.f622b = null;
            } else {
                g3.f622b = c0336b5;
            }
            C0475A c0475a3 = (C0475A) g3.f625e;
            if (c0475a3 != null) {
                boolean j7 = c0475a3.j(c0336b5);
                i3 = 1;
                z4 = !j7;
            } else {
                i3 = 1;
                if (((C0336b) g3.f623c) != c0336b5) {
                    z4 = true;
                } else {
                    g3.f623c = null;
                    z4 = false;
                }
            }
            if (z4) {
                c0336b5.p += i3;
            }
        }
        dVar.r(h3);
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

    @Override // t0.f0
    public final boolean i(long j3) {
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        C0336b c0336b = this.f8338d;
        if (c0336b.f4492v) {
            return L.q(c0336b.c(), d3, e3, null, null);
        }
        return true;
    }

    @Override // t0.f0
    public final void invalidate() {
        if (this.f8347m || this.f8344j) {
            return;
        }
        C0997t c0997t = this.f8340f;
        c0997t.invalidate();
        if (true != this.f8347m) {
            this.f8347m = true;
            c0997t.u(this, true);
        }
    }

    @Override // t0.f0
    public final void j(C0261L c0261l) {
        r1.r rVar;
        int i3;
        r1.r rVar2;
        int i4 = c0261l.f4219d | this.f8350q;
        this.f8349o = c0261l.f4237w;
        this.f8348n = c0261l.f4236v;
        int i5 = i4 & 4096;
        if (i5 != 0) {
            this.f8351r = c0261l.f4231q;
        }
        if ((i4 & 1) != 0) {
            C0336b c0336b = this.f8338d;
            float f3 = c0261l.f4220e;
            e0.d dVar = c0336b.f4472a;
            if (dVar.s() != f3) {
                dVar.m(f3);
            }
        }
        if ((i4 & 2) != 0) {
            C0336b c0336b2 = this.f8338d;
            float f4 = c0261l.f4221f;
            e0.d dVar2 = c0336b2.f4472a;
            if (dVar2.C() != f4) {
                dVar2.e(f4);
            }
        }
        if ((i4 & 4) != 0) {
            C0336b c0336b3 = this.f8338d;
            float f5 = c0261l.f4222g;
            e0.d dVar3 = c0336b3.f4472a;
            if (dVar3.a() != f5) {
                dVar3.d(f5);
            }
        }
        if ((i4 & 8) != 0) {
            C0336b c0336b4 = this.f8338d;
            float f6 = c0261l.f4223h;
            e0.d dVar4 = c0336b4.f4472a;
            if (dVar4.I() != f6) {
                dVar4.c(f6);
            }
        }
        if ((i4 & 16) != 0) {
            C0336b c0336b5 = this.f8338d;
            float f7 = c0261l.f4224i;
            e0.d dVar5 = c0336b5.f4472a;
            if (dVar5.v() != f7) {
                dVar5.j(f7);
            }
        }
        boolean z3 = true;
        if ((i4 & 32) != 0) {
            C0336b c0336b6 = this.f8338d;
            float f8 = c0261l.f4225j;
            e0.d dVar6 = c0336b6.f4472a;
            if (dVar6.A() != f8) {
                dVar6.u(f8);
                c0336b6.f4478g = true;
                c0336b6.a();
            }
            if (c0261l.f4225j > 0.0f && !this.f8355v && (rVar2 = this.f8342h) != null) {
                rVar2.b();
            }
        }
        if ((i4 & 64) != 0) {
            C0336b c0336b7 = this.f8338d;
            long j3 = c0261l.f4226k;
            e0.d dVar7 = c0336b7.f4472a;
            if (!C0288u.c(j3, dVar7.H())) {
                dVar7.z(j3);
            }
        }
        if ((i4 & 128) != 0) {
            C0336b c0336b8 = this.f8338d;
            long j4 = c0261l.f4227l;
            e0.d dVar8 = c0336b8.f4472a;
            if (!C0288u.c(j4, dVar8.y())) {
                dVar8.q(j4);
            }
        }
        if ((i4 & 1024) != 0) {
            C0336b c0336b9 = this.f8338d;
            float f9 = c0261l.f4230o;
            e0.d dVar9 = c0336b9.f4472a;
            if (dVar9.E() != f9) {
                dVar9.i(f9);
            }
        }
        if ((i4 & 256) != 0) {
            C0336b c0336b10 = this.f8338d;
            float f10 = c0261l.f4228m;
            e0.d dVar10 = c0336b10.f4472a;
            if (dVar10.M() != f10) {
                dVar10.n(f10);
            }
        }
        if ((i4 & 512) != 0) {
            C0336b c0336b11 = this.f8338d;
            float f11 = c0261l.f4229n;
            e0.d dVar11 = c0336b11.f4472a;
            if (dVar11.x() != f11) {
                dVar11.b(f11);
            }
        }
        if ((i4 & 2048) != 0) {
            C0336b c0336b12 = this.f8338d;
            float f12 = c0261l.p;
            e0.d dVar12 = c0336b12.f4472a;
            if (dVar12.D() != f12) {
                dVar12.k(f12);
            }
        }
        if (i5 != 0) {
            if (C0266Q.a(this.f8351r, C0266Q.f4258b)) {
                C0336b c0336b13 = this.f8338d;
                if (!a0.c.b(c0336b13.f4491u, 9205357640488583168L)) {
                    c0336b13.f4491u = 9205357640488583168L;
                    c0336b13.f4472a.G(9205357640488583168L);
                }
            } else {
                C0336b c0336b14 = this.f8338d;
                long f13 = I2.l.f(C0266Q.b(this.f8351r) * ((int) (this.f8343i >> 32)), C0266Q.c(this.f8351r) * ((int) (this.f8343i & 4294967295L)));
                if (!a0.c.b(c0336b14.f4491u, f13)) {
                    c0336b14.f4491u = f13;
                    c0336b14.f4472a.G(f13);
                }
            }
        }
        if ((i4 & 16384) != 0) {
            C0336b c0336b15 = this.f8338d;
            boolean z4 = c0261l.f4233s;
            if (c0336b15.f4492v != z4) {
                c0336b15.f4492v = z4;
                c0336b15.f4478g = true;
                c0336b15.a();
            }
        }
        if ((131072 & i4) != 0) {
            e0.d dVar13 = this.f8338d.f4472a;
            if (!Z1.i.a(null, null)) {
                dVar13.g();
            }
        }
        if ((32768 & i4) != 0) {
            C0336b c0336b16 = this.f8338d;
            int i6 = c0261l.f4234t;
            if (AbstractC0259J.o(i6, 0)) {
                i3 = 0;
            } else if (AbstractC0259J.o(i6, 1)) {
                i3 = 1;
            } else {
                i3 = 2;
                if (!AbstractC0259J.o(i6, 2)) {
                    throw new IllegalStateException("Not supported composition strategy");
                }
            }
            e0.d dVar14 = c0336b16.f4472a;
            if (!I2.l.x(dVar14.K(), i3)) {
                dVar14.p(i3);
            }
        }
        if (Z1.i.a(this.f8352s, c0261l.f4238x)) {
            z3 = false;
        } else {
            AbstractC0257H abstractC0257H = c0261l.f4238x;
            this.f8352s = abstractC0257H;
            if (abstractC0257H != null) {
                C0336b c0336b17 = this.f8338d;
                if (abstractC0257H instanceof C0255F) {
                    a0.d dVar15 = ((C0255F) abstractC0257H).f4212a;
                    c0336b17.f(I2.l.f(dVar15.f3491a, dVar15.f3492b), I2.d.h(dVar15.c(), dVar15.b()), 0.0f);
                } else if (abstractC0257H instanceof C0254E) {
                    c0336b17.f4482k = null;
                    c0336b17.f4480i = 9205357640488583168L;
                    c0336b17.f4479h = 0L;
                    c0336b17.f4481j = 0.0f;
                    c0336b17.f4478g = true;
                    c0336b17.f4485n = false;
                    c0336b17.f4483l = ((C0254E) abstractC0257H).f4211a;
                    c0336b17.a();
                } else if (abstractC0257H instanceof C0256G) {
                    C0256G c0256g = (C0256G) abstractC0257H;
                    C0278k c0278k = c0256g.f4214b;
                    if (c0278k != null) {
                        c0336b17.f4482k = null;
                        c0336b17.f4480i = 9205357640488583168L;
                        c0336b17.f4479h = 0L;
                        c0336b17.f4481j = 0.0f;
                        c0336b17.f4478g = true;
                        c0336b17.f4485n = false;
                        c0336b17.f4483l = c0278k;
                        c0336b17.a();
                    } else {
                        a0.e eVar = c0256g.f4213a;
                        c0336b17.f(I2.l.f(eVar.f3495a, eVar.f3496b), I2.d.h(eVar.b(), eVar.a()), AbstractC0158a.b(eVar.f3502h));
                    }
                }
                if ((abstractC0257H instanceof C0254E) && Build.VERSION.SDK_INT < 33 && (rVar = this.f8342h) != null) {
                    rVar.b();
                }
            }
        }
        this.f8350q = c0261l.f4219d;
        if (i4 != 0 || z3) {
            int i7 = Build.VERSION.SDK_INT;
            C0997t c0997t = this.f8340f;
            if (i7 >= 26) {
                a1.f8288a.a(c0997t);
            } else {
                c0997t.invalidate();
            }
        }
    }

    public final float[] k() {
        C0336b c0336b = this.f8338d;
        long z3 = I2.l.F(c0336b.f4491u) ? I2.d.z(I2.l.R(this.f8343i)) : c0336b.f4491u;
        float[] fArr = this.f8345k;
        AbstractC0259J.w(fArr);
        float[] l3 = AbstractC0259J.l();
        AbstractC0259J.H(l3, -a0.c.d(z3), -a0.c.e(z3));
        AbstractC0259J.A(fArr, l3);
        float[] l4 = AbstractC0259J.l();
        e0.d dVar = c0336b.f4472a;
        AbstractC0259J.H(l4, dVar.I(), dVar.v());
        double M3 = (dVar.M() * 3.141592653589793d) / 180.0d;
        float cos = (float) Math.cos(M3);
        float sin = (float) Math.sin(M3);
        float f3 = l4[1];
        float f4 = l4[2];
        float f5 = l4[5];
        float f6 = l4[6];
        float f7 = l4[9];
        float f8 = l4[10];
        float f9 = l4[13];
        float f10 = l4[14];
        l4[1] = (f3 * cos) - (f4 * sin);
        l4[2] = (f4 * cos) + (f3 * sin);
        l4[5] = (f5 * cos) - (f6 * sin);
        l4[6] = (f6 * cos) + (f5 * sin);
        l4[9] = (f7 * cos) - (f8 * sin);
        l4[10] = (f8 * cos) + (f7 * sin);
        l4[13] = (f9 * cos) - (f10 * sin);
        l4[14] = (f10 * cos) + (f9 * sin);
        double x3 = (dVar.x() * 3.141592653589793d) / 180.0d;
        float cos2 = (float) Math.cos(x3);
        float sin2 = (float) Math.sin(x3);
        float f11 = l4[0];
        float f12 = l4[2];
        float f13 = l4[4];
        float f14 = l4[6];
        float f15 = (f14 * sin2) + (f13 * cos2);
        float f16 = (f14 * cos2) + ((-f13) * sin2);
        float f17 = l4[8];
        float f18 = l4[10];
        float f19 = l4[12];
        float f20 = l4[14];
        l4[0] = (f12 * sin2) + (f11 * cos2);
        l4[2] = (f12 * cos2) + ((-f11) * sin2);
        l4[4] = f15;
        l4[6] = f16;
        l4[8] = (f18 * sin2) + (f17 * cos2);
        l4[10] = (f18 * cos2) + ((-f17) * sin2);
        l4[12] = (f20 * sin2) + (f19 * cos2);
        l4[14] = (f20 * cos2) + ((-f19) * sin2);
        AbstractC0259J.x(l4, dVar.E());
        AbstractC0259J.y(l4, dVar.s(), dVar.C(), 1.0f);
        AbstractC0259J.A(fArr, l4);
        float[] l5 = AbstractC0259J.l();
        AbstractC0259J.H(l5, a0.c.d(z3), a0.c.e(z3));
        AbstractC0259J.A(fArr, l5);
        return fArr;
    }
}
