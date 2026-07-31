package u0;

import F.C0036e;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;
import b0.AbstractC0257H;
import b0.AbstractC0259J;
import b0.AbstractC0272e;
import b0.C0261L;
import b0.C0266Q;
import b0.C0276i;
import b0.C0286s;
import b0.InterfaceC0258I;
import b0.InterfaceC0285r;
import e0.C0336b;

/* renamed from: u0.u0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1000u0 implements t0.f0 {

    /* renamed from: d, reason: collision with root package name */
    public final C0997t f8478d;

    /* renamed from: e, reason: collision with root package name */
    public C0036e f8479e;

    /* renamed from: f, reason: collision with root package name */
    public r1.r f8480f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f8481g;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8483i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8484j;

    /* renamed from: k, reason: collision with root package name */
    public C0276i f8485k;

    /* renamed from: o, reason: collision with root package name */
    public final InterfaceC0965c0 f8489o;
    public int p;

    /* renamed from: h, reason: collision with root package name */
    public final C0991p0 f8482h = new C0991p0();

    /* renamed from: l, reason: collision with root package name */
    public final C0985m0 f8486l = new C0985m0(C0958E.f8122h);

    /* renamed from: m, reason: collision with root package name */
    public final C0286s f8487m = new C0286s();

    /* renamed from: n, reason: collision with root package name */
    public long f8488n = C0266Q.f4258b;

    public C1000u0(C0997t c0997t, C0036e c0036e, r1.r rVar) {
        this.f8478d = c0997t;
        this.f8479e = c0036e;
        this.f8480f = rVar;
        InterfaceC0965c0 c0996s0 = Build.VERSION.SDK_INT >= 29 ? new C0996s0() : new C0993q0(c0997t);
        c0996s0.H();
        c0996s0.D(false);
        this.f8489o = c0996s0;
    }

    @Override // t0.f0
    public final void a(C0036e c0036e, r1.r rVar) {
        k(false);
        this.f8483i = false;
        this.f8484j = false;
        this.f8488n = C0266Q.f4258b;
        this.f8479e = c0036e;
        this.f8480f = rVar;
    }

    @Override // t0.f0
    public final void b(a0.b bVar, boolean z3) {
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        C0985m0 c0985m0 = this.f8486l;
        if (!z3) {
            AbstractC0259J.v(c0985m0.b(interfaceC0965c0), bVar);
            return;
        }
        float[] a3 = c0985m0.a(interfaceC0965c0);
        if (a3 != null) {
            AbstractC0259J.v(a3, bVar);
            return;
        }
        bVar.f3485a = 0.0f;
        bVar.f3486b = 0.0f;
        bVar.f3487c = 0.0f;
        bVar.f3488d = 0.0f;
    }

    @Override // t0.f0
    public final void c() {
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        if (interfaceC0965c0.l()) {
            interfaceC0965c0.o();
        }
        this.f8479e = null;
        this.f8480f = null;
        this.f8483i = true;
        k(false);
        C0997t c0997t = this.f8478d;
        c0997t.B = true;
        c0997t.C(this);
    }

    @Override // t0.f0
    public final long d(long j3, boolean z3) {
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        C0985m0 c0985m0 = this.f8486l;
        if (!z3) {
            return AbstractC0259J.u(c0985m0.b(interfaceC0965c0), j3);
        }
        float[] a3 = c0985m0.a(interfaceC0965c0);
        if (a3 != null) {
            return AbstractC0259J.u(a3, j3);
        }
        return 9187343241974906880L;
    }

    @Override // t0.f0
    public final void e(long j3) {
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        int z3 = interfaceC0965c0.z();
        int y3 = interfaceC0965c0.y();
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        if (z3 == i3 && y3 == i4) {
            return;
        }
        if (z3 != i3) {
            interfaceC0965c0.r(i3 - z3);
        }
        if (y3 != i4) {
            interfaceC0965c0.v(i4 - y3);
        }
        int i5 = Build.VERSION.SDK_INT;
        C0997t c0997t = this.f8478d;
        if (i5 >= 26) {
            a1.f8288a.a(c0997t);
        } else {
            c0997t.invalidate();
        }
        this.f8486l.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0023  */
    @Override // t0.f0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void f() {
        InterfaceC0258I interfaceC0258I;
        C0036e c0036e;
        boolean z3 = this.f8481g;
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        if (z3 || !interfaceC0965c0.l()) {
            if (interfaceC0965c0.u()) {
                C0991p0 c0991p0 = this.f8482h;
                if (c0991p0.f8388g) {
                    c0991p0.d();
                    interfaceC0258I = c0991p0.f8386e;
                    c0036e = this.f8479e;
                    if (c0036e != null) {
                        interfaceC0965c0.K(this.f8487m, interfaceC0258I, new t.x(9, c0036e));
                    }
                    k(false);
                }
            }
            interfaceC0258I = null;
            c0036e = this.f8479e;
            if (c0036e != null) {
            }
            k(false);
        }
    }

    @Override // t0.f0
    public final void g(long j3) {
        int i3 = (int) (j3 >> 32);
        int i4 = (int) (j3 & 4294967295L);
        float b2 = C0266Q.b(this.f8488n) * i3;
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        interfaceC0965c0.C(b2);
        interfaceC0965c0.p(C0266Q.c(this.f8488n) * i4);
        if (interfaceC0965c0.G(interfaceC0965c0.z(), interfaceC0965c0.y(), interfaceC0965c0.z() + i3, interfaceC0965c0.y() + i4)) {
            interfaceC0965c0.E(this.f8482h.b());
            if (!this.f8481g && !this.f8483i) {
                this.f8478d.invalidate();
                k(true);
            }
            this.f8486l.c();
        }
    }

    @Override // t0.f0
    public final void h(InterfaceC0285r interfaceC0285r, C0336b c0336b) {
        Canvas a3 = AbstractC0272e.a(interfaceC0285r);
        boolean isHardwareAccelerated = a3.isHardwareAccelerated();
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        if (isHardwareAccelerated) {
            f();
            boolean z3 = interfaceC0965c0.J() > 0.0f;
            this.f8484j = z3;
            if (z3) {
                interfaceC0285r.p();
            }
            interfaceC0965c0.x(a3);
            if (this.f8484j) {
                interfaceC0285r.h();
                return;
            }
            return;
        }
        float z4 = interfaceC0965c0.z();
        float y3 = interfaceC0965c0.y();
        float t3 = interfaceC0965c0.t();
        float s3 = interfaceC0965c0.s();
        if (interfaceC0965c0.a() < 1.0f) {
            C0276i c0276i = this.f8485k;
            if (c0276i == null) {
                c0276i = AbstractC0259J.f();
                this.f8485k = c0276i;
            }
            c0276i.c(interfaceC0965c0.a());
            a3.saveLayer(z4, y3, t3, s3, (Paint) c0276i.f4273b);
        } else {
            interfaceC0285r.f();
        }
        interfaceC0285r.r(z4, y3);
        interfaceC0285r.o(this.f8486l.b(interfaceC0965c0));
        if (interfaceC0965c0.u() || interfaceC0965c0.w()) {
            this.f8482h.a(interfaceC0285r);
        }
        C0036e c0036e = this.f8479e;
        if (c0036e != null) {
            c0036e.g(interfaceC0285r, null);
        }
        interfaceC0285r.a();
        k(false);
    }

    @Override // t0.f0
    public final boolean i(long j3) {
        AbstractC0257H abstractC0257H;
        float d3 = a0.c.d(j3);
        float e3 = a0.c.e(j3);
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        if (interfaceC0965c0.w()) {
            return 0.0f <= d3 && d3 < ((float) interfaceC0965c0.f()) && 0.0f <= e3 && e3 < ((float) interfaceC0965c0.h());
        }
        if (!interfaceC0965c0.u()) {
            return true;
        }
        C0991p0 c0991p0 = this.f8482h;
        if (c0991p0.f8394m && (abstractC0257H = c0991p0.f8384c) != null) {
            return L.q(abstractC0257H, a0.c.d(j3), a0.c.e(j3), null, null);
        }
        return true;
    }

    @Override // t0.f0
    public final void invalidate() {
        if (this.f8481g || this.f8483i) {
            return;
        }
        this.f8478d.invalidate();
        k(true);
    }

    @Override // t0.f0
    public final void j(C0261L c0261l) {
        r1.r rVar;
        int i3 = c0261l.f4219d | this.p;
        int i4 = i3 & 4096;
        if (i4 != 0) {
            this.f8488n = c0261l.f4231q;
        }
        InterfaceC0965c0 interfaceC0965c0 = this.f8489o;
        boolean u3 = interfaceC0965c0.u();
        C0991p0 c0991p0 = this.f8482h;
        boolean z3 = false;
        boolean z4 = u3 && c0991p0.f8388g;
        if ((i3 & 1) != 0) {
            interfaceC0965c0.m(c0261l.f4220e);
        }
        if ((i3 & 2) != 0) {
            interfaceC0965c0.e(c0261l.f4221f);
        }
        if ((i3 & 4) != 0) {
            interfaceC0965c0.d(c0261l.f4222g);
        }
        if ((i3 & 8) != 0) {
            interfaceC0965c0.c(c0261l.f4223h);
        }
        if ((i3 & 16) != 0) {
            interfaceC0965c0.j(c0261l.f4224i);
        }
        if ((i3 & 32) != 0) {
            interfaceC0965c0.q(c0261l.f4225j);
        }
        if ((i3 & 64) != 0) {
            interfaceC0965c0.L(AbstractC0259J.E(c0261l.f4226k));
        }
        if ((i3 & 128) != 0) {
            interfaceC0965c0.F(AbstractC0259J.E(c0261l.f4227l));
        }
        if ((i3 & 1024) != 0) {
            interfaceC0965c0.i(c0261l.f4230o);
        }
        if ((i3 & 256) != 0) {
            interfaceC0965c0.n(c0261l.f4228m);
        }
        if ((i3 & 512) != 0) {
            interfaceC0965c0.b(c0261l.f4229n);
        }
        if ((i3 & 2048) != 0) {
            interfaceC0965c0.k(c0261l.p);
        }
        if (i4 != 0) {
            interfaceC0965c0.C(C0266Q.b(this.f8488n) * interfaceC0965c0.f());
            interfaceC0965c0.p(C0266Q.c(this.f8488n) * interfaceC0965c0.h());
        }
        boolean z5 = c0261l.f4233s;
        F0.a aVar = AbstractC0259J.f4215a;
        boolean z6 = z5 && c0261l.f4232r != aVar;
        if ((i3 & 24576) != 0) {
            interfaceC0965c0.A(z6);
            interfaceC0965c0.D(c0261l.f4233s && c0261l.f4232r == aVar);
        }
        if ((131072 & i3) != 0) {
            interfaceC0965c0.g();
        }
        if ((32768 & i3) != 0) {
            interfaceC0965c0.B(c0261l.f4234t);
        }
        boolean c3 = this.f8482h.c(c0261l.f4238x, c0261l.f4222g, z6, c0261l.f4225j, c0261l.f4235u);
        if (c0991p0.f8387f) {
            interfaceC0965c0.E(c0991p0.b());
        }
        if (z6 && c0991p0.f8388g) {
            z3 = true;
        }
        C0997t c0997t = this.f8478d;
        if (z4 != z3 || (z3 && c3)) {
            if (!this.f8481g && !this.f8483i) {
                c0997t.invalidate();
                k(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            a1.f8288a.a(c0997t);
        } else {
            c0997t.invalidate();
        }
        if (!this.f8484j && interfaceC0965c0.J() > 0.0f && (rVar = this.f8480f) != null) {
            rVar.b();
        }
        if ((i3 & 7963) != 0) {
            this.f8486l.c();
        }
        this.p = c0261l.f4219d;
    }

    public final void k(boolean z3) {
        if (z3 != this.f8481g) {
            this.f8481g = z3;
            this.f8478d.u(this, z3);
        }
    }
}
