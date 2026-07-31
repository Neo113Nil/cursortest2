package c1;

import a0.q;
import a0.t;
import q6.i;
import w1.f1;
import w1.h0;
import w1.m;
import y0.l;

/* compiled from: r8-map-id-993246c4c69e1ebc8793f71aa12ed948588db4c1cf8ebcb9056be312299691df */
/* loaded from: classes.dex */
public final class b extends l implements f1, a, m {

    /* renamed from: r, reason: collision with root package name */
    public final c f1558r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f1559s;

    /* renamed from: t, reason: collision with root package name */
    public final t f1560t;

    public b(c cVar, t tVar) {
        this.f1558r = cVar;
        this.f1560t = tVar;
        cVar.f1561d = this;
    }

    @Override // w1.m
    public final void A(h0 h0Var) {
        boolean z3 = this.f1559s;
        c cVar = this.f1558r;
        if (!z3) {
            cVar.f1562e = null;
            w1.f.r(this, new a2.b(1, this, cVar));
            if (cVar.f1562e == null) {
                throw q.f("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f1559s = true;
        }
        b1.b bVar = cVar.f1562e;
        i.b(bVar);
        ((p6.c) bVar.f1050e).i(h0Var);
    }

    @Override // w1.f1
    public final void F() {
        r0();
    }

    @Override // w1.m
    public final void X() {
        r0();
    }

    @Override // w1.k
    public final void a() {
        r0();
    }

    @Override // c1.a
    public final r2.c b() {
        return w1.f.u(this).f7659y;
    }

    @Override // w1.k
    public final void b0() {
        r0();
    }

    @Override // c1.a
    public final long c() {
        return m.a.R(w1.f.s(this, 128).f7232f);
    }

    @Override // c1.a
    public final r2.l getLayoutDirection() {
        return w1.f.u(this).f7660z;
    }

    @Override // y0.l
    public final void l0() {
        r0();
    }

    public final void r0() {
        this.f1559s = false;
        this.f1558r.f1562e = null;
        w1.f.l(this);
    }

    @Override // y0.l
    public final void k0() {
    }
}
