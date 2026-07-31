package E;

import F.W;
import F.X;
import j.C0548v;
import q2.AbstractC0837y;
import t0.AbstractC0993f;
import t0.InterfaceC0998k;
import t0.InterfaceC1002o;
import t0.InterfaceC1008v;

/* loaded from: classes.dex */
public abstract class y extends U.p implements InterfaceC0998k, InterfaceC1002o, InterfaceC1008v {

    /* renamed from: q, reason: collision with root package name */
    public final q.j f1012q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f1013r;

    /* renamed from: s, reason: collision with root package name */
    public final float f1014s;

    /* renamed from: t, reason: collision with root package name */
    public final W f1015t;

    /* renamed from: u, reason: collision with root package name */
    public final X f1016u;

    /* renamed from: v, reason: collision with root package name */
    public F f1017v;

    /* renamed from: w, reason: collision with root package name */
    public float f1018w;

    /* renamed from: y, reason: collision with root package name */
    public boolean f1020y;

    /* renamed from: x, reason: collision with root package name */
    public long f1019x = 0;

    /* renamed from: z, reason: collision with root package name */
    public final C0548v f1021z = new C0548v();

    public y(q.j jVar, boolean z3, float f3, W w2, X x3) {
        this.f1012q = jVar;
        this.f1013r = z3;
        this.f1014s = f3;
        this.f1015t = w2;
        this.f1016u = x3;
    }

    public final void A0(q.o oVar) {
        if (oVar instanceof q.m) {
            y0((q.m) oVar, this.f1019x, this.f1018w);
        } else if (oVar instanceof q.n) {
            B0(((q.n) oVar).f7846a);
        } else if (oVar instanceof q.l) {
            B0(((q.l) oVar).f7844a);
        }
    }

    public abstract void B0(q.m mVar);

    @Override // t0.InterfaceC1008v
    public final void C(long j3) {
        this.f1020y = true;
        O0.b bVar = AbstractC0993f.t(this).f8556t;
        this.f1019x = O2.d.f0(j3);
        float f3 = this.f1014s;
        this.f1018w = Float.isNaN(f3) ? q.a(bVar, this.f1013r, this.f1019x) : bVar.J(f3);
        C0548v c0548v = this.f1021z;
        Object[] objArr = c0548v.f6336a;
        int i3 = c0548v.f6337b;
        for (int i4 = 0; i4 < i3; i4++) {
            A0((q.o) objArr[i4]);
        }
        S1.k.r0(c0548v.f6336a, null, 0, c0548v.f6337b);
        c0548v.f6337b = 0;
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        g3.b();
        F f3 = this.f1017v;
        if (f3 != null) {
            f3.b(g3, this.f1018w, this.f1015t.a());
        }
        z0(g3);
    }

    @Override // U.p
    public final boolean n0() {
        return false;
    }

    @Override // U.p
    public final void q0() {
        AbstractC0837y.r(m0(), null, null, new x(this, null), 3);
    }

    public abstract void y0(q.m mVar, long j3, float f3);

    public abstract void z0(t0.G g3);
}
