package n;

import b0.C0352v;
import d0.C0401b;
import d0.C0406g;
import d0.InterfaceC0403d;
import q2.AbstractC0837y;
import t0.InterfaceC1002o;

/* renamed from: n.D, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0661D extends U.p implements InterfaceC1002o {

    /* renamed from: q, reason: collision with root package name */
    public final q.j f7026q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f7027r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f7028s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f7029t;

    public C0661D(q.j jVar) {
        this.f7026q = jVar;
    }

    @Override // t0.InterfaceC1002o
    public final void h(t0.G g3) {
        g3.b();
        boolean z3 = this.f7027r;
        C0401b c0401b = g3.f8573d;
        if (z3) {
            g3.F(C0352v.b(C0352v.f5434b, 0.3f), 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(g3.d(), 0L) : c0401b.d(), 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
        } else if (this.f7028s || this.f7029t) {
            g3.F(C0352v.b(C0352v.f5434b, 0.1f), 0L, (r17 & 4) != 0 ? InterfaceC0403d.j0(g3.d(), 0L) : c0401b.d(), 1.0f, C0406g.f5653a, null, (r17 & 64) != 0 ? 3 : 0);
        }
    }

    @Override // U.p
    public final void q0() {
        AbstractC0837y.r(m0(), null, null, new C0660C(this, null), 3);
    }
}
