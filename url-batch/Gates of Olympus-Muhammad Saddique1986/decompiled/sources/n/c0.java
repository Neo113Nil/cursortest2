package n;

import I.C0143d;
import I.C0156j0;
import a0.C0238c;
import android.view.View;
import e2.InterfaceC0424c;
import q2.AbstractC0837y;
import t0.AbstractC0993f;
import t0.InterfaceC1002o;
import t0.InterfaceC1003p;

/* loaded from: classes.dex */
public final class c0 extends U.p implements InterfaceC1003p, InterfaceC1002o, t0.o0, t0.d0 {

    /* renamed from: A, reason: collision with root package name */
    public View f7095A;

    /* renamed from: B, reason: collision with root package name */
    public O0.b f7096B;
    public m0 C;

    /* renamed from: E, reason: collision with root package name */
    public I.F f7097E;

    /* renamed from: G, reason: collision with root package name */
    public O0.j f7099G;

    /* renamed from: H, reason: collision with root package name */
    public s2.g f7100H;

    /* renamed from: q, reason: collision with root package name */
    public A0.l f7101q;

    /* renamed from: r, reason: collision with root package name */
    public InterfaceC0424c f7102r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0424c f7103s;

    /* renamed from: t, reason: collision with root package name */
    public float f7104t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f7105u;

    /* renamed from: v, reason: collision with root package name */
    public long f7106v;

    /* renamed from: w, reason: collision with root package name */
    public float f7107w;

    /* renamed from: x, reason: collision with root package name */
    public float f7108x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f7109y;

    /* renamed from: z, reason: collision with root package name */
    public n0 f7110z;
    public final C0156j0 D = C0143d.K(null, I.W.f2780f);

    /* renamed from: F, reason: collision with root package name */
    public long f7098F = 9205357640488583168L;

    public c0(A0.l lVar, InterfaceC0424c interfaceC0424c, InterfaceC0424c interfaceC0424c2, float f3, boolean z3, long j3, float f4, float f5, boolean z4, n0 n0Var) {
        this.f7101q = lVar;
        this.f7102r = interfaceC0424c;
        this.f7103s = interfaceC0424c2;
        this.f7104t = f3;
        this.f7105u = z3;
        this.f7106v = j3;
        this.f7107w = f4;
        this.f7108x = f5;
        this.f7109y = z4;
        this.f7110z = n0Var;
    }

    public final void A0() {
        O0.b bVar = this.f7096B;
        if (bVar == null) {
            bVar = AbstractC0993f.t(this).f8556t;
            this.f7096B = bVar;
        }
        long j3 = ((C0238c) this.f7101q.n(bVar)).f4722a;
        long j4 = 9205357640488583168L;
        if (!l0.c.D(j3) || !l0.c.D(y0())) {
            this.f7098F = 9205357640488583168L;
            m0 m0Var = this.C;
            if (m0Var != null) {
                ((o0) m0Var).b();
                return;
            }
            return;
        }
        this.f7098F = C0238c.h(y0(), j3);
        InterfaceC0424c interfaceC0424c = this.f7102r;
        if (interfaceC0424c != null) {
            long j5 = ((C0238c) interfaceC0424c.n(bVar)).f4722a;
            C0238c c0238c = new C0238c(j5);
            if (!l0.c.D(j5)) {
                c0238c = null;
            }
            if (c0238c != null) {
                j4 = C0238c.h(y0(), c0238c.f4722a);
            }
        }
        long j6 = j4;
        if (this.C == null) {
            z0();
        }
        m0 m0Var2 = this.C;
        if (m0Var2 != null) {
            m0Var2.a(this.f7098F, j6, this.f7104t);
        }
        B0();
    }

    public final void B0() {
        O0.b bVar;
        m0 m0Var = this.C;
        if (m0Var == null || (bVar = this.f7096B) == null) {
            return;
        }
        o0 o0Var = (o0) m0Var;
        long c2 = o0Var.c();
        O0.j jVar = this.f7099G;
        if (jVar != null && c2 == jVar.f3740a) {
            return;
        }
        InterfaceC0424c interfaceC0424c = this.f7103s;
        if (interfaceC0424c != null) {
            interfaceC0424c.n(new O0.g(bVar.H(O2.d.f0(o0Var.c()))));
        }
        this.f7099G = new O0.j(o0Var.c());
    }

    @Override // t0.InterfaceC1003p
    public final void c0(t0.b0 b0Var) {
        this.D.setValue(b0Var);
    }

    @Override // t0.d0
    public final void e0() {
        AbstractC0993f.q(this, new C0675a0(this, 2));
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        g3.b();
        s2.g gVar = this.f7100H;
        if (gVar != null) {
            gVar.p(R1.y.f4171a);
        }
    }

    @Override // t0.o0
    public final void j(A0.i iVar) {
        iVar.c(d0.f7118a, new C0675a0(this, 1));
    }

    @Override // U.p
    public final void q0() {
        e0();
        this.f7100H = r.a(0, 7, null);
        AbstractC0837y.r(m0(), null, null, new b0(this, null), 3);
    }

    @Override // U.p
    public final void r0() {
        m0 m0Var = this.C;
        if (m0Var != null) {
            ((o0) m0Var).b();
        }
        this.C = null;
    }

    public final long y0() {
        if (this.f7097E == null) {
            this.f7097E = C0143d.D(new C0675a0(this, 0));
        }
        I.F f3 = this.f7097E;
        if (f3 != null) {
            return ((C0238c) f3.getValue()).f4722a;
        }
        return 9205357640488583168L;
    }

    public final void z0() {
        m0 m0Var = this.C;
        if (m0Var != null) {
            ((o0) m0Var).b();
        }
        View view = this.f7095A;
        if (view == null) {
            view = AbstractC0993f.v(this);
        }
        View view2 = view;
        this.f7095A = view2;
        O0.b bVar = this.f7096B;
        if (bVar == null) {
            bVar = AbstractC0993f.t(this).f8556t;
        }
        O0.b bVar2 = bVar;
        this.f7096B = bVar2;
        this.C = this.f7110z.a(view2, this.f7105u, this.f7106v, this.f7107w, this.f7108x, this.f7109y, bVar2, this.f7104t);
        B0();
    }
}
