package l;

import e2.InterfaceC0422a;
import m.e0;
import m.f0;
import m.l0;
import r0.AbstractC0893O;
import r0.InterfaceC0884F;
import r0.InterfaceC0886H;
import r0.InterfaceC0887I;
import t0.InterfaceC1009w;

/* loaded from: classes.dex */
public final class F extends U.p implements InterfaceC1009w {

    /* renamed from: q, reason: collision with root package name */
    public l0 f6442q;

    /* renamed from: r, reason: collision with root package name */
    public f0 f6443r;

    /* renamed from: s, reason: collision with root package name */
    public f0 f6444s;

    /* renamed from: t, reason: collision with root package name */
    public G f6445t;

    /* renamed from: u, reason: collision with root package name */
    public H f6446u;

    /* renamed from: v, reason: collision with root package name */
    public InterfaceC0422a f6447v;

    /* renamed from: w, reason: collision with root package name */
    public y f6448w;

    /* renamed from: x, reason: collision with root package name */
    public long f6449x = u.f6538a;

    /* renamed from: y, reason: collision with root package name */
    public U.d f6450y;

    /* renamed from: z, reason: collision with root package name */
    public final E f6451z;

    public F(l0 l0Var, f0 f0Var, f0 f0Var2, G g3, H h3, InterfaceC0422a interfaceC0422a, y yVar) {
        this.f6442q = l0Var;
        this.f6443r = f0Var;
        this.f6444s = f0Var2;
        this.f6445t = g3;
        this.f6446u = h3;
        this.f6447v = interfaceC0422a;
        this.f6448w = yVar;
        O2.d.b(0, 0, 15);
        this.f6451z = new E(this, 0);
        new E(this, 1);
    }

    @Override // t0.InterfaceC1009w
    public final int b(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.U(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int c(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.V(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int e(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.O(i3);
    }

    @Override // t0.InterfaceC1009w
    public final int f(t0.P p3, InterfaceC0884F interfaceC0884F, int i3) {
        return interfaceC0884F.c(i3);
    }

    @Override // t0.InterfaceC1009w
    public final InterfaceC0886H g(InterfaceC0887I interfaceC0887I, InterfaceC0884F interfaceC0884F, long j3) {
        Object obj = null;
        if (this.f6442q.f6836a.a() == this.f6442q.f6839d.getValue()) {
            this.f6450y = null;
        } else if (this.f6450y == null) {
            U.d y02 = y0();
            if (y02 == null) {
                y02 = U.b.f4461d;
            }
            this.f6450y = y02;
        }
        boolean D = interfaceC0887I.D();
        S1.v vVar = S1.v.f4321d;
        if (D) {
            AbstractC0893O b3 = interfaceC0884F.b(j3);
            long d3 = O2.d.d(b3.f8126d, b3.f8127e);
            this.f6449x = d3;
            return interfaceC0887I.i0((int) (d3 >> 32), (int) (4294967295L & d3), vVar, new A.i(b3, 5));
        }
        if (!((Boolean) this.f6447v.b()).booleanValue()) {
            AbstractC0893O b4 = interfaceC0884F.b(j3);
            return interfaceC0887I.i0(b4.f8126d, b4.f8127e, vVar, new A.i(b4, 6));
        }
        y yVar = this.f6448w;
        f0 f0Var = yVar.f6551a;
        G g3 = yVar.f6554d;
        H h3 = yVar.f6555e;
        e0 a3 = f0Var != null ? f0Var.a(new z(g3, h3, 0), new z(g3, h3, 1)) : null;
        f0 f0Var2 = yVar.f6552b;
        e0 a4 = f0Var2 != null ? f0Var2.a(new z(g3, h3, 2), new z(g3, h3, 3)) : null;
        if (yVar.f6553c.f6836a.a() == x.f6547d) {
            P p3 = h3.f6456a;
        } else {
            P p4 = h3.f6456a;
        }
        f0 f0Var3 = yVar.f6556f;
        R.h hVar = new R.h(a3, a4, f0Var3 != null ? f0Var3.a(q.f6525j, new R.h(obj, g3, h3, 6)) : null, 5);
        AbstractC0893O b5 = interfaceC0884F.b(j3);
        long d4 = O2.d.d(b5.f8126d, b5.f8127e);
        long j4 = !O0.j.a(this.f6449x, u.f6538a) ? this.f6449x : d4;
        f0 f0Var4 = this.f6443r;
        e0 a5 = f0Var4 != null ? f0Var4.a(this.f6451z, new D(this, j4, 0)) : null;
        if (a5 != null) {
            d4 = ((O0.j) a5.getValue()).f3740a;
        }
        long A3 = O2.d.A(j3, d4);
        f0 f0Var5 = this.f6444s;
        long j5 = f0Var5 != null ? ((O0.h) f0Var5.a(q.f6528m, new D(this, j4, 1)).getValue()).f3734a : 0L;
        U.d dVar = this.f6450y;
        return interfaceC0887I.i0((int) (A3 >> 32), (int) (4294967295L & A3), vVar, new C(b5, O0.h.c(dVar != null ? dVar.a(j4, A3, O0.k.f3741d) : 0L, 0L), j5, hVar, 0));
    }

    @Override // U.p
    public final void q0() {
        this.f6449x = u.f6538a;
    }

    public final U.d y0() {
        if (this.f6442q.f().a(x.f6547d, x.f6548e)) {
            v vVar = this.f6445t.f6453a.f6469b;
            if (vVar == null && (vVar = this.f6446u.f6456a.f6469b) == null) {
                return null;
            }
            return vVar.f6539a;
        }
        v vVar2 = this.f6446u.f6456a.f6469b;
        if (vVar2 == null && (vVar2 = this.f6445t.f6453a.f6469b) == null) {
            return null;
        }
        return vVar2.f6539a;
    }
}
