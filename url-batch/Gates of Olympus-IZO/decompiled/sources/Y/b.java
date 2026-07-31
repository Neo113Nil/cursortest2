package Y;

import F.C0047j0;
import I.C0125v0;
import I2.l;
import U.k;
import Z1.i;
import Z1.j;
import e2.AbstractC0381e;
import t0.AbstractC0898f;
import t0.F;
import t0.InterfaceC0907o;
import t0.c0;

/* loaded from: classes.dex */
public final class b extends k implements c0, a, InterfaceC0907o {

    /* renamed from: q, reason: collision with root package name */
    public final c f3392q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f3393r;

    /* renamed from: s, reason: collision with root package name */
    public final C0047j0 f3394s;

    public b(c cVar, C0047j0 c0047j0) {
        this.f3392q = cVar;
        this.f3394s = c0047j0;
        cVar.f3395d = this;
    }

    @Override // t0.InterfaceC0907o
    public final void U() {
        v0();
    }

    @Override // Y.a
    public final M0.b a() {
        return AbstractC0898f.t(this).f7730s;
    }

    @Override // Y.a
    public final long c() {
        return l.R(AbstractC0898f.r(this, 128).f7116f);
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [Y1.c, Z1.j] */
    @Override // t0.InterfaceC0907o
    public final void d(F f3) {
        boolean z3 = this.f3393r;
        c cVar = this.f3392q;
        if (!z3) {
            cVar.f3396e = null;
            AbstractC0898f.q(this, new C0125v0(this, 1, cVar));
            if (cVar.f3396e == null) {
                AbstractC0381e.O("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f3393r = true;
        }
        A2.g gVar = cVar.f3396e;
        i.c(gVar);
        ((j) gVar.f83b).j(f3);
    }

    @Override // t0.c0
    public final void d0() {
        v0();
    }

    @Override // Y.a
    public final M0.j getLayoutDirection() {
        return AbstractC0898f.t(this).f7731t;
    }

    public final void v0() {
        this.f3393r = false;
        this.f3392q.f3396e = null;
        AbstractC0898f.m(this);
    }

    @Override // U.k
    public final void o0() {
    }
}
