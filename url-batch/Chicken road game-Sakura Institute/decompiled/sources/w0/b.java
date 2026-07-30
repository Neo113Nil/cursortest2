package w0;

import a0.b1;
import l1.x;
import r1.c1;
import r1.f0;
import r1.o;
import r6.k;
import r6.l;
import s0.n;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public final class b extends n implements c1, a, o {

    /* renamed from: s, reason: collision with root package name */
    public final c f9474s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f9475t;

    /* renamed from: u, reason: collision with root package name */
    public q6.c f9476u;

    public b(c cVar, q6.c cVar2) {
        this.f9474s = cVar;
        this.f9476u = cVar2;
        cVar.f9477f = this;
    }

    public final void A0() {
        this.f9475t = false;
        this.f9474s.f9478g = null;
        r1.f.m(this);
    }

    @Override // r1.c1
    public final void I() {
        A0();
    }

    @Override // w0.a
    public final m2.b a() {
        return r1.f.t(this).f7735v;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [q6.c, r6.l] */
    @Override // r1.o
    public final void c(f0 f0Var) {
        boolean z8 = this.f9475t;
        c cVar = this.f9474s;
        if (!z8) {
            cVar.f9478g = null;
            r1.f.q(this, new b1(this, 15, cVar));
            if (cVar.f9478g == null) {
                a.a.N("DrawResult not defined, did you forget to call onDraw?");
                throw null;
            }
            this.f9475t = true;
        }
        x xVar = cVar.f9478g;
        k.c(xVar);
        ((l) xVar.f5847g).f(f0Var);
    }

    @Override // w0.a
    public final long d() {
        return j1.c.o0(r1.f.r(this, 128).f7065h);
    }

    @Override // w0.a
    public final m2.k getLayoutDirection() {
        return r1.f.t(this).f7736w;
    }

    @Override // r1.o
    public final void i0() {
        A0();
    }

    @Override // s0.n
    public final void t0() {
    }
}
