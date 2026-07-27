package m;

import G.C0192d;
import G.C0205j0;
import a.AbstractC0345a;
import android.view.View;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import r0.AbstractC1065f;
import r0.InterfaceC1074o;
import r0.InterfaceC1075p;

/* loaded from: classes.dex */
public final class Z extends S.n implements InterfaceC1075p, InterfaceC1074o, r0.n0, r0.c0 {

    /* renamed from: A, reason: collision with root package name */
    public float f8055A;
    public boolean B;

    /* renamed from: C, reason: collision with root package name */
    public k0 f8056C;

    /* renamed from: D, reason: collision with root package name */
    public View f8057D;

    /* renamed from: E, reason: collision with root package name */
    public M0.b f8058E;

    /* renamed from: F, reason: collision with root package name */
    public j0 f8059F;

    /* renamed from: H, reason: collision with root package name */
    public G.F f8061H;

    /* renamed from: J, reason: collision with root package name */
    public M0.j f8063J;

    /* renamed from: K, reason: collision with root package name */
    public Y2.e f8064K;

    /* renamed from: t, reason: collision with root package name */
    public A.g0 f8065t;

    /* renamed from: u, reason: collision with root package name */
    public Function1 f8066u;

    /* renamed from: v, reason: collision with root package name */
    public Function1 f8067v;

    /* renamed from: w, reason: collision with root package name */
    public float f8068w;

    /* renamed from: x, reason: collision with root package name */
    public boolean f8069x;

    /* renamed from: y, reason: collision with root package name */
    public long f8070y;

    /* renamed from: z, reason: collision with root package name */
    public float f8071z;

    /* renamed from: G, reason: collision with root package name */
    public final C0205j0 f8060G = C0192d.K(null, G.W.f2776i);

    /* renamed from: I, reason: collision with root package name */
    public long f8062I = 9205357640488583168L;

    public Z(A.g0 g0Var, Function1 function1, Function1 function12, float f4, boolean z4, long j4, float f5, float f6, boolean z5, k0 k0Var) {
        this.f8065t = g0Var;
        this.f8066u = function1;
        this.f8067v = function12;
        this.f8068w = f4;
        this.f8069x = z4;
        this.f8070y = j4;
        this.f8071z = f5;
        this.f8055A = f6;
        this.B = z5;
        this.f8056C = k0Var;
    }

    public final long B0() {
        if (this.f8061H == null) {
            this.f8061H = C0192d.D(new X(this, 0));
        }
        G.F f4 = this.f8061H;
        if (f4 != null) {
            return ((Y.c) f4.getValue()).f4372a;
        }
        return 9205357640488583168L;
    }

    public final void C0() {
        j0 j0Var = this.f8059F;
        if (j0Var != null) {
            ((l0) j0Var).b();
        }
        View view = this.f8057D;
        if (view == null) {
            view = AbstractC1065f.x(this);
        }
        View view2 = view;
        this.f8057D = view2;
        M0.b bVar = this.f8058E;
        if (bVar == null) {
            bVar = AbstractC1065f.v(this).f9610w;
        }
        M0.b bVar2 = bVar;
        this.f8058E = bVar2;
        this.f8059F = this.f8056C.b(view2, this.f8069x, this.f8070y, this.f8071z, this.f8055A, this.B, bVar2, this.f8068w);
        E0();
    }

    public final void D0() {
        M0.b bVar = this.f8058E;
        if (bVar == null) {
            bVar = AbstractC1065f.v(this).f9610w;
            this.f8058E = bVar;
        }
        long j4 = ((Y.c) this.f8065t.invoke(bVar)).f4372a;
        long j5 = 9205357640488583168L;
        if (!AbstractC0345a.z(j4) || !AbstractC0345a.z(B0())) {
            this.f8062I = 9205357640488583168L;
            j0 j0Var = this.f8059F;
            if (j0Var != null) {
                ((l0) j0Var).b();
                return;
            }
            return;
        }
        this.f8062I = Y.c.h(B0(), j4);
        Function1 function1 = this.f8066u;
        if (function1 != null) {
            long j6 = ((Y.c) function1.invoke(bVar)).f4372a;
            Y.c cVar = new Y.c(j6);
            if (!AbstractC0345a.z(j6)) {
                cVar = null;
            }
            if (cVar != null) {
                j5 = Y.c.h(B0(), cVar.f4372a);
            }
        }
        long j7 = j5;
        if (this.f8059F == null) {
            C0();
        }
        j0 j0Var2 = this.f8059F;
        if (j0Var2 != null) {
            j0Var2.a(this.f8062I, j7, this.f8068w);
        }
        E0();
    }

    public final void E0() {
        M0.b bVar;
        j0 j0Var = this.f8059F;
        if (j0Var == null || (bVar = this.f8058E) == null) {
            return;
        }
        l0 l0Var = (l0) j0Var;
        long c4 = l0Var.c();
        M0.j jVar = this.f8063J;
        if (jVar != null && c4 == jVar.f3554a) {
            return;
        }
        Function1 function1 = this.f8067v;
        if (function1 != null) {
            function1.invoke(new M0.g(bVar.J(u3.d.U(l0Var.c()))));
        }
        this.f8063J = new M0.j(l0Var.c());
    }

    @Override // r0.InterfaceC1075p
    public final void H(r0.a0 a0Var) {
        this.f8060G.setValue(a0Var);
    }

    @Override // r0.InterfaceC1074o
    public final void a(r0.G g4) {
        g4.a();
        Y2.e eVar = this.f8064K;
        if (eVar != null) {
            eVar.o(Unit.f7487a);
        }
    }

    @Override // r0.c0
    public final void l0() {
        AbstractC1065f.s(this, new X(this, 2));
    }

    @Override // r0.n0
    public final void p(y0.i iVar) {
        iVar.s(a0.f8075a, new X(this, 1));
    }

    @Override // S.n
    public final void t0() {
        l0();
        this.f8064K = Y2.l.a(0, 7, null);
        W2.B.m(p0(), null, null, new Y(this, null), 3);
    }

    @Override // S.n
    public final void u0() {
        j0 j0Var = this.f8059F;
        if (j0Var != null) {
            ((l0) j0Var).b();
        }
        this.f8059F = null;
    }
}
