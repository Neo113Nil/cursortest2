package l;

import m.k0;
import m.l0;
import m.s0;
import t0.InterfaceC0914w;

/* loaded from: classes.dex */
public final class E extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public s0 f5424q;

    /* renamed from: r, reason: collision with root package name */
    public F f5425r;

    /* renamed from: s, reason: collision with root package name */
    public G f5426s;

    /* renamed from: t, reason: collision with root package name */
    public Y1.a f5427t;

    /* renamed from: u, reason: collision with root package name */
    public y f5428u;

    /* renamed from: v, reason: collision with root package name */
    public long f5429v;

    /* renamed from: w, reason: collision with root package name */
    public U.d f5430w;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        long j4;
        long j5;
        if (this.f5424q.f5841a.a() == this.f5424q.f5844d.getValue()) {
            this.f5430w = null;
        } else if (this.f5430w == null) {
            if (this.f5424q.f().a(x.f5514d, x.f5515e)) {
                O o4 = this.f5426s.f5435a;
            } else {
                O o5 = this.f5426s.f5435a;
            }
            this.f5430w = U.a.f3280d;
        }
        boolean B = o3.B();
        M1.v vVar = M1.v.f2804d;
        if (B) {
            r0.H b2 = zVar.b(j3);
            long e3 = I2.l.e(b2.f7114d, b2.f7115e);
            this.f5429v = e3;
            return o3.Y((int) (e3 >> 32), (int) (4294967295L & e3), vVar, new Y.g(b2, 1));
        }
        if (!((Boolean) this.f5427t.b()).booleanValue()) {
            r0.H b3 = zVar.b(j3);
            return o3.Y(b3.f7114d, b3.f7115e, vVar, new Y.g(b3, 2));
        }
        y yVar = this.f5428u;
        l0 l0Var = yVar.f5518a;
        F f3 = yVar.f5521d;
        G g3 = yVar.f5522e;
        k0 a3 = l0Var != null ? l0Var.a(new z(f3, g3, 0), new z(f3, g3, 1)) : null;
        l0 l0Var2 = yVar.f5519b;
        k0 a4 = l0Var2 != null ? l0Var2.a(new z(f3, g3, 2), new z(f3, g3, 3)) : null;
        if (yVar.f5520c.f5841a.a() == x.f5514d) {
            O o6 = g3.f5435a;
        } else {
            O o7 = g3.f5435a;
        }
        l0 l0Var3 = yVar.f5523f;
        R.h hVar = new R.h(a3, a4, l0Var3 != null ? l0Var3.a(v.f5508i, new R.h(r4, f3, g3, 6)) : null, 5);
        r0.H b4 = zVar.b(j3);
        long e4 = I2.l.e(b4.f7114d, b4.f7115e);
        if (M0.i.a(this.f5429v, u.f5504a)) {
            j4 = j3;
            j5 = e4;
        } else {
            j5 = this.f5429v;
            j4 = j3;
        }
        long o8 = I2.l.o(j4, e4);
        U.d dVar = this.f5430w;
        return o3.Y((int) (o8 >> 32), (int) (4294967295L & o8), vVar, new C(b4, M0.g.c(dVar != null ? dVar.a(j5, o8, M0.j.f2775d) : 0L, 0L), 0L, hVar, 0));
    }

    @Override // U.k
    public final void n0() {
        this.f5429v = u.f5504a;
    }
}
