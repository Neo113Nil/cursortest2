package Y;

import B.Y;
import B.f0;
import O0.k;
import U.p;
import e2.InterfaceC0424c;
import f2.j;
import n.z0;
import t0.AbstractC0993f;
import t0.G;
import t0.InterfaceC1002o;
import t0.d0;

/* loaded from: classes.dex */
public final class b extends p implements d0, a, InterfaceC1002o {

    /* renamed from: q, reason: collision with root package name */
    public final c f4648q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f4649r;

    /* renamed from: s, reason: collision with root package name */
    public InterfaceC0424c f4650s;

    public b(c cVar, InterfaceC0424c interfaceC0424c) {
        this.f4648q = cVar;
        this.f4650s = interfaceC0424c;
        cVar.f4651d = this;
    }

    @Override // t0.InterfaceC1002o
    public final void V() {
        y0();
    }

    @Override // Y.a
    public final O0.b a() {
        return AbstractC0993f.t(this).f8556t;
    }

    @Override // Y.a
    public final long d() {
        return O2.d.f0(AbstractC0993f.r(this, 128).f8128f);
    }

    @Override // t0.d0
    public final void e0() {
        y0();
    }

    @Override // Y.a
    public final k getLayoutDirection() {
        return AbstractC0993f.t(this).f8557u;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [e2.c, f2.k] */
    @Override // t0.InterfaceC1002o
    public final void h(G g3) {
        boolean z3 = this.f4649r;
        c cVar = this.f4648q;
        if (!z3) {
            cVar.f4652e = null;
            AbstractC0993f.q(this, new f0(this, 2, cVar));
            if (cVar.f4652e == null) {
                z0.p("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f4649r = true;
        }
        Y y3 = cVar.f4652e;
        j.c(y3);
        ((f2.k) y3.f334d).n(g3);
    }

    public final void y0() {
        this.f4649r = false;
        this.f4648q.f4652e = null;
        AbstractC0993f.m(this);
    }

    @Override // U.p
    public final void r0() {
    }
}
