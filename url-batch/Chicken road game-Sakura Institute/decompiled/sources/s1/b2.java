package s1;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.os.Build;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b2 implements r1.f1 {

    /* renamed from: f, reason: collision with root package name */
    public final r f8139f;

    /* renamed from: g, reason: collision with root package name */
    public q6.e f8140g;

    /* renamed from: h, reason: collision with root package name */
    public q6.a f8141h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8142i;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8144k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f8145l;

    /* renamed from: m, reason: collision with root package name */
    public f7.i0 f8146m;

    /* renamed from: q, reason: collision with root package name */
    public final h1 f8150q;

    /* renamed from: r, reason: collision with root package name */
    public int f8151r;

    /* renamed from: j, reason: collision with root package name */
    public final u1 f8143j = new u1();

    /* renamed from: n, reason: collision with root package name */
    public final r1 f8147n = new r1(c1.f8184i);

    /* renamed from: o, reason: collision with root package name */
    public final z0.s f8148o = new z0.s();

    /* renamed from: p, reason: collision with root package name */
    public long f8149p = z0.s0.f10047b;

    public b2(r rVar, q6.e eVar, q6.a aVar) {
        this.f8139f = rVar;
        this.f8140g = eVar;
        this.f8141h = aVar;
        h1 z1Var = Build.VERSION.SDK_INT >= 29 ? new z1() : new y1(rVar);
        z1Var.J();
        z1Var.x(false);
        this.f8150q = z1Var;
    }

    @Override // r1.f1
    public final void a(q6.e eVar, q6.a aVar) {
        l(false);
        this.f8144k = false;
        this.f8145l = false;
        int i7 = z0.s0.f10048c;
        this.f8149p = z0.s0.f10047b;
        this.f8140g = eVar;
        this.f8141h = aVar;
    }

    @Override // r1.f1
    public final long b(long j8, boolean z8) {
        h1 h1Var = this.f8150q;
        r1 r1Var = this.f8147n;
        if (!z8) {
            return z0.f0.b(j8, r1Var.b(h1Var));
        }
        float[] a3 = r1Var.a(h1Var);
        if (a3 != null) {
            return z0.f0.b(j8, a3);
        }
        return 9187343241974906880L;
    }

    @Override // r1.f1
    public final void c(z0.n0 n0Var) {
        q6.a aVar;
        int i7 = n0Var.f10014f | this.f8151r;
        int i8 = i7 & 4096;
        if (i8 != 0) {
            this.f8149p = n0Var.f10022n;
        }
        h1 h1Var = this.f8150q;
        boolean E = h1Var.E();
        u1 u1Var = this.f8143j;
        boolean z8 = false;
        boolean z9 = E && u1Var.f8441g;
        if ((i7 & 1) != 0) {
            h1Var.h(n0Var.f10015g);
        }
        if ((i7 & 2) != 0) {
            h1Var.l(n0Var.f10016h);
        }
        if ((i7 & 4) != 0) {
            h1Var.c(n0Var.f10017i);
        }
        if ((i7 & 8) != 0) {
            h1Var.j();
        }
        if ((i7 & 16) != 0) {
            h1Var.e();
        }
        if ((i7 & 32) != 0) {
            h1Var.D(n0Var.f10018j);
        }
        if ((i7 & 64) != 0) {
            h1Var.B(z0.l0.w(n0Var.f10019k));
        }
        if ((i7 & 128) != 0) {
            h1Var.I(z0.l0.w(n0Var.f10020l));
        }
        if ((i7 & 1024) != 0) {
            h1Var.k();
        }
        if ((i7 & 256) != 0) {
            h1Var.b();
        }
        if ((i7 & 512) != 0) {
            h1Var.g();
        }
        if ((i7 & 2048) != 0) {
            h1Var.o(n0Var.f10021m);
        }
        if (i8 != 0) {
            h1Var.w(z0.s0.b(this.f8149p) * h1Var.n());
            h1Var.C(z0.s0.c(this.f8149p) * h1Var.f());
        }
        boolean z10 = n0Var.f10024p;
        j4.i iVar = z0.l0.f10006a;
        boolean z11 = z10 && n0Var.f10023o != iVar;
        if ((i7 & 24576) != 0) {
            h1Var.G(z11);
            h1Var.x(n0Var.f10024p && n0Var.f10023o == iVar);
        }
        if ((131072 & i7) != 0) {
            h1Var.t();
        }
        if ((32768 & i7) != 0) {
            h1Var.z();
        }
        boolean c4 = this.f8143j.c(n0Var.f10028t, n0Var.f10017i, z11, n0Var.f10018j, n0Var.f10025q);
        if (u1Var.f8440f) {
            h1Var.H(u1Var.b());
        }
        if (z11 && u1Var.f8441g) {
            z8 = true;
        }
        r rVar = this.f8139f;
        if (z9 != z8 || (z8 && c4)) {
            if (!this.f8142i && !this.f8144k) {
                rVar.invalidate();
                l(true);
            }
        } else if (Build.VERSION.SDK_INT >= 26) {
            d3.f8199a.a(rVar);
        } else {
            rVar.invalidate();
        }
        if (!this.f8145l && h1Var.L() > 0.0f && (aVar = this.f8141h) != null) {
            aVar.a();
        }
        if ((i7 & 7963) != 0) {
            this.f8147n.c();
        }
        this.f8151r = n0Var.f10014f;
    }

    @Override // r1.f1
    public final void d(long j8) {
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        float b9 = z0.s0.b(this.f8149p) * i7;
        h1 h1Var = this.f8150q;
        h1Var.w(b9);
        h1Var.C(z0.s0.c(this.f8149p) * i8);
        if (h1Var.y(h1Var.d(), h1Var.v(), h1Var.d() + i7, h1Var.v() + i8)) {
            h1Var.H(this.f8143j.b());
            if (!this.f8142i && !this.f8144k) {
                this.f8139f.invalidate();
                l(true);
            }
            this.f8147n.c();
        }
    }

    @Override // r1.f1
    public final void destroy() {
        h1 h1Var = this.f8150q;
        if (h1Var.p()) {
            h1Var.i();
        }
        this.f8140g = null;
        this.f8141h = null;
        this.f8144k = true;
        l(false);
        r rVar = this.f8139f;
        rVar.D = true;
        rVar.B(this);
    }

    @Override // r1.f1
    public final void e(float[] fArr) {
        z0.f0.g(fArr, this.f8147n.b(this.f8150q));
    }

    @Override // r1.f1
    public final void f(float[] fArr) {
        float[] a3 = this.f8147n.a(this.f8150q);
        if (a3 != null) {
            z0.f0.g(fArr, a3);
        }
    }

    @Override // r1.f1
    public final void g(y0.b bVar, boolean z8) {
        h1 h1Var = this.f8150q;
        r1 r1Var = this.f8147n;
        if (!z8) {
            z0.f0.c(r1Var.b(h1Var), bVar);
            return;
        }
        float[] a3 = r1Var.a(h1Var);
        if (a3 != null) {
            z0.f0.c(a3, bVar);
            return;
        }
        bVar.f9774a = 0.0f;
        bVar.f9775b = 0.0f;
        bVar.f9776c = 0.0f;
        bVar.f9777d = 0.0f;
    }

    @Override // r1.f1
    public final void h(long j8) {
        h1 h1Var = this.f8150q;
        int d8 = h1Var.d();
        int v5 = h1Var.v();
        int i7 = (int) (j8 >> 32);
        int i8 = (int) (j8 & 4294967295L);
        if (d8 == i7 && v5 == i8) {
            return;
        }
        if (d8 != i7) {
            h1Var.q(i7 - d8);
        }
        if (v5 != i8) {
            h1Var.F(i8 - v5);
        }
        int i9 = Build.VERSION.SDK_INT;
        r rVar = this.f8139f;
        if (i9 >= 26) {
            d3.f8199a.a(rVar);
        } else {
            rVar.invalidate();
        }
        this.f8147n.c();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025  */
    @Override // r1.f1
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void i() {
        z0.k0 k0Var;
        q6.e eVar;
        boolean z8 = this.f8142i;
        h1 h1Var = this.f8150q;
        if (z8 || !h1Var.p()) {
            if (h1Var.E()) {
                u1 u1Var = this.f8143j;
                if (u1Var.f8441g) {
                    u1Var.d();
                    k0Var = u1Var.f8439e;
                    eVar = this.f8140g;
                    if (eVar != null) {
                        h1Var.A(this.f8148o, k0Var, new l0(4, eVar));
                    }
                    l(false);
                }
            }
            k0Var = null;
            eVar = this.f8140g;
            if (eVar != null) {
            }
            l(false);
        }
    }

    @Override // r1.f1
    public final void invalidate() {
        if (this.f8142i || this.f8144k) {
            return;
        }
        this.f8139f.invalidate();
        l(true);
    }

    @Override // r1.f1
    public final void j(z0.r rVar, c1.c cVar) {
        Canvas a3 = z0.e.a(rVar);
        boolean isHardwareAccelerated = a3.isHardwareAccelerated();
        h1 h1Var = this.f8150q;
        if (isHardwareAccelerated) {
            i();
            boolean z8 = h1Var.L() > 0.0f;
            this.f8145l = z8;
            if (z8) {
                rVar.s();
            }
            h1Var.u(a3);
            if (this.f8145l) {
                rVar.p();
                return;
            }
            return;
        }
        float d8 = h1Var.d();
        float v5 = h1Var.v();
        float m8 = h1Var.m();
        float r8 = h1Var.r();
        if (h1Var.a() < 1.0f) {
            f7.i0 i0Var = this.f8146m;
            if (i0Var == null) {
                i0Var = z0.l0.g();
                this.f8146m = i0Var;
            }
            i0Var.c(h1Var.a());
            a3.saveLayer(d8, v5, m8, r8, (Paint) i0Var.f3488b);
        } else {
            rVar.o();
        }
        rVar.k(d8, v5);
        rVar.r(this.f8147n.b(h1Var));
        if (h1Var.E() || h1Var.s()) {
            this.f8143j.a(rVar);
        }
        q6.e eVar = this.f8140g;
        if (eVar != null) {
            eVar.d(rVar, null);
        }
        rVar.n();
        l(false);
    }

    @Override // r1.f1
    public final boolean k(long j8) {
        z0.j0 j0Var;
        float d8 = y0.c.d(j8);
        float e9 = y0.c.e(j8);
        h1 h1Var = this.f8150q;
        if (h1Var.s()) {
            if (0.0f > d8 || d8 >= h1Var.n() || 0.0f > e9 || e9 >= h1Var.f()) {
                return false;
            }
        } else if (h1Var.E()) {
            u1 u1Var = this.f8143j;
            if (u1Var.f8447m && (j0Var = u1Var.f8437c) != null) {
                return j0.u(j0Var, y0.c.d(j8), y0.c.e(j8));
            }
            return true;
        }
        return true;
    }

    public final void l(boolean z8) {
        if (z8 != this.f8142i) {
            this.f8142i = z8;
            this.f8139f.s(this, z8);
        }
    }
}
