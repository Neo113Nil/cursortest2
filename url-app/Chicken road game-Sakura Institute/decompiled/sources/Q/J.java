package Q;

import G.C0192d;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class J extends AbstractC0274j {

    /* renamed from: e, reason: collision with root package name */
    public final AbstractC0274j f3824e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f3825f;

    /* renamed from: g, reason: collision with root package name */
    public Function1 f3826g;

    /* renamed from: h, reason: collision with root package name */
    public final long f3827h;

    public J(AbstractC0274j abstractC0274j, Function1 function1, boolean z4) {
        super(0, o.f3869k);
        Function1 f4;
        this.f3824e = abstractC0274j;
        this.f3825f = z4;
        this.f3826g = q.l(function1, (abstractC0274j == null || (f4 = abstractC0274j.f()) == null) ? ((C0268d) q.f3885i.get()).f3836e : f4, false);
        this.f3827h = C0192d.A();
    }

    @Override // Q.AbstractC0274j
    public final void c() {
        AbstractC0274j abstractC0274j;
        this.f3855c = true;
        if (!this.f3825f || (abstractC0274j = this.f3824e) == null) {
            return;
        }
        abstractC0274j.c();
    }

    @Override // Q.AbstractC0274j
    public final int d() {
        return u().d();
    }

    @Override // Q.AbstractC0274j
    public final o e() {
        return u().e();
    }

    @Override // Q.AbstractC0274j
    public final Function1 f() {
        return this.f3826g;
    }

    @Override // Q.AbstractC0274j
    public final boolean g() {
        return u().g();
    }

    @Override // Q.AbstractC0274j
    public final Function1 i() {
        return null;
    }

    @Override // Q.AbstractC0274j
    public final void k() {
        w.g();
        throw null;
    }

    @Override // Q.AbstractC0274j
    public final void l() {
        w.g();
        throw null;
    }

    @Override // Q.AbstractC0274j
    public final void m() {
        u().m();
    }

    @Override // Q.AbstractC0274j
    public final void n(D d4) {
        u().n(d4);
    }

    @Override // Q.AbstractC0274j
    public final AbstractC0274j t(Function1 function1) {
        return q.h(u().t(null), q.l(function1, this.f3826g, true), true);
    }

    public final AbstractC0274j u() {
        AbstractC0274j abstractC0274j = this.f3824e;
        return abstractC0274j == null ? (AbstractC0274j) q.f3885i.get() : abstractC0274j;
    }
}
