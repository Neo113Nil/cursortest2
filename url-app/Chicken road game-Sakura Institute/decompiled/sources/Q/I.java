package Q;

import G.C0192d;
import i.C0661B;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class I extends C0269e {

    /* renamed from: o, reason: collision with root package name */
    public final C0269e f3818o;

    /* renamed from: p, reason: collision with root package name */
    public final boolean f3819p;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f3820q;

    /* renamed from: r, reason: collision with root package name */
    public Function1 f3821r;

    /* renamed from: s, reason: collision with root package name */
    public Function1 f3822s;

    /* renamed from: t, reason: collision with root package name */
    public final long f3823t;

    public I(C0269e c0269e, Function1 function1, Function1 function12, boolean z4, boolean z5) {
        super(0, o.f3869k, q.l(function1, (c0269e == null || (r1 = c0269e.f()) == null) ? ((C0268d) q.f3885i.get()).f3836e : r1, z4), q.b(function12, (c0269e == null || (r1 = c0269e.i()) == null) ? ((C0268d) q.f3885i.get()).f3837f : r1));
        Function1 i2;
        Function1 f4;
        this.f3818o = c0269e;
        this.f3819p = z4;
        this.f3820q = z5;
        this.f3821r = this.f3836e;
        this.f3822s = this.f3837f;
        this.f3823t = C0192d.A();
    }

    @Override // Q.C0269e
    public final void A(C0661B c0661b) {
        w.g();
        throw null;
    }

    @Override // Q.C0269e
    public final C0269e B(Function1 function1, Function1 function12) {
        Function1 l4 = q.l(function1, this.f3821r, true);
        Function1 b4 = q.b(function12, this.f3822s);
        return !this.f3819p ? new I(C().B(null, b4), l4, b4, false, true) : C().B(l4, b4);
    }

    public final C0269e C() {
        C0269e c0269e = this.f3818o;
        return c0269e == null ? (C0269e) q.f3885i.get() : c0269e;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void c() {
        C0269e c0269e;
        this.f3855c = true;
        if (!this.f3820q || (c0269e = this.f3818o) == null) {
            return;
        }
        c0269e.c();
    }

    @Override // Q.AbstractC0274j
    public final int d() {
        return C().d();
    }

    @Override // Q.AbstractC0274j
    public final o e() {
        return C().e();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final Function1 f() {
        return this.f3821r;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final boolean g() {
        return C().g();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final int h() {
        return C().h();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final Function1 i() {
        return this.f3822s;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void k() {
        w.g();
        throw null;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void l() {
        w.g();
        throw null;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void m() {
        C().m();
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void n(D d4) {
        C().n(d4);
    }

    @Override // Q.AbstractC0274j
    public final void q(int i2) {
        w.g();
        throw null;
    }

    @Override // Q.AbstractC0274j
    public final void r(o oVar) {
        w.g();
        throw null;
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final void s(int i2) {
        C().s(i2);
    }

    @Override // Q.C0269e, Q.AbstractC0274j
    public final AbstractC0274j t(Function1 function1) {
        Function1 l4 = q.l(function1, this.f3821r, true);
        return !this.f3819p ? q.h(C().t(null), l4, true) : C().t(l4);
    }

    @Override // Q.C0269e
    public final w v() {
        return C().v();
    }

    @Override // Q.C0269e
    public final C0661B w() {
        return C().w();
    }

    @Override // Q.C0269e
    /* renamed from: x */
    public final Function1 f() {
        return this.f3821r;
    }
}
