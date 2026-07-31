package E;

import F.Q;
import j.C0504v;
import k2.AbstractC0552y;
import t0.AbstractC0898f;
import t0.InterfaceC0903k;
import t0.InterfaceC0907o;
import t0.InterfaceC0913v;

/* loaded from: classes.dex */
public abstract class z extends U.k implements InterfaceC0903k, InterfaceC0907o, InterfaceC0913v {

    /* renamed from: q, reason: collision with root package name */
    public final q.i f712q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f713r;

    /* renamed from: s, reason: collision with root package name */
    public final float f714s;

    /* renamed from: t, reason: collision with root package name */
    public final A2.g f715t;

    /* renamed from: u, reason: collision with root package name */
    public final Q f716u;

    /* renamed from: v, reason: collision with root package name */
    public G f717v;

    /* renamed from: w, reason: collision with root package name */
    public float f718w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f720y;

    /* renamed from: x, reason: collision with root package name */
    public long f719x = 0;

    /* renamed from: z, reason: collision with root package name */
    public final C0504v f721z = new C0504v();

    public z(q.i iVar, boolean z3, float f3, A2.g gVar, Q q2) {
        this.f712q = iVar;
        this.f713r = z3;
        this.f714s = f3;
        this.f715t = gVar;
        this.f716u = q2;
    }

    @Override // t0.InterfaceC0913v
    public final void A(long j3) {
        this.f720y = true;
        M0.b bVar = AbstractC0898f.t(this).f7730s;
        this.f719x = I2.l.R(j3);
        float f3 = this.f714s;
        this.f718w = Float.isNaN(f3) ? r.a(bVar, this.f713r, this.f719x) : bVar.F(f3);
        C0504v c0504v = this.f721z;
        Object[] objArr = c0504v.f5218a;
        int i3 = c0504v.f5219b;
        for (int i4 = 0; i4 < i3; i4++) {
            x0((q.n) objArr[i4]);
        }
        M1.k.c0(c0504v.f5218a, 0, c0504v.f5219b);
        c0504v.f5219b = 0;
    }

    @Override // t0.InterfaceC0907o
    public final void d(t0.F f3) {
        f3.b();
        G g3 = this.f717v;
        if (g3 != null) {
            g3.b(f3, this.f718w, this.f715t.o());
        }
        w0(f3);
    }

    @Override // U.k
    public final boolean k0() {
        return false;
    }

    @Override // U.k
    public final void n0() {
        AbstractC0552y.q(j0(), null, null, new y(this, null), 3);
    }

    public abstract void v0(q.l lVar, long j3, float f3);

    public abstract void w0(t0.F f3);

    public final void x0(q.n nVar) {
        if (nVar instanceof q.l) {
            v0((q.l) nVar, this.f719x, this.f718w);
        } else if (nVar instanceof q.m) {
            y0(((q.m) nVar).f6820a);
        } else if (nVar instanceof q.k) {
            y0(((q.k) nVar).f6818a);
        }
    }

    public abstract void y0(q.l lVar);
}
