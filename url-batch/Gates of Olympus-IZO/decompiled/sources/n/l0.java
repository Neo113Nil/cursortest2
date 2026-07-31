package n;

import I.C0096g0;
import I.C0117r0;
import h.AbstractC0416e;
import t0.InterfaceC0914w;

/* loaded from: classes.dex */
public final class l0 extends U.k implements InterfaceC0914w {

    /* renamed from: q, reason: collision with root package name */
    public k0 f6117q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f6118r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f6119s;

    @Override // t0.InterfaceC0914w
    public final r0.B b(t0.O o3, r0.z zVar, long j3) {
        AbstractC0416e.n(j3, this.f6119s ? o.J.f6443d : o.J.f6444e);
        r0.H b2 = zVar.b(M0.a.a(j3, 0, this.f6119s ? M0.a.h(j3) : Integer.MAX_VALUE, 0, this.f6119s ? Integer.MAX_VALUE : M0.a.g(j3), 5));
        int i3 = b2.f7114d;
        int h3 = M0.a.h(j3);
        if (i3 > h3) {
            i3 = h3;
        }
        int i4 = b2.f7115e;
        int g3 = M0.a.g(j3);
        if (i4 > g3) {
            i4 = g3;
        }
        int i5 = b2.f7115e - i4;
        int i6 = b2.f7114d - i3;
        if (!this.f6119s) {
            i5 = i6;
        }
        k0 k0Var = this.f6117q;
        C0096g0 c0096g0 = k0Var.f6109d;
        C0096g0 c0096g02 = k0Var.f6106a;
        c0096g0.h(i5);
        S.i c3 = S.u.c();
        Y1.c f3 = c3 != null ? c3.f() : null;
        S.i d3 = S.u.d(c3);
        try {
            if (c0096g02.g() > i5) {
                c0096g02.h(i5);
            }
            S.u.f(c3, d3, f3);
            this.f6117q.f6107b.h(this.f6119s ? i4 : i3);
            return o3.Y(i3, i4, M1.v.f2804d, new C0117r0(i5, 1, this, b2));
        } catch (Throwable th) {
            S.u.f(c3, d3, f3);
            throw th;
        }
    }
}
