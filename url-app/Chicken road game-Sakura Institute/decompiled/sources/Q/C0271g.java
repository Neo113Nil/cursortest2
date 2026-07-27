package Q;

import B1.C0097d;
import kotlin.jvm.functions.Function1;

/* renamed from: Q.g, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271g extends AbstractC0274j {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f3847e;

    /* renamed from: f, reason: collision with root package name */
    public final AbstractC0274j f3848f;

    public C0271g(int i2, o oVar, Function1 function1, AbstractC0274j abstractC0274j) {
        super(i2, oVar);
        this.f3847e = function1;
        this.f3848f = abstractC0274j;
        abstractC0274j.k();
    }

    @Override // Q.AbstractC0274j
    public final void c() {
        if (this.f3855c) {
            return;
        }
        int i2 = this.f3854b;
        AbstractC0274j abstractC0274j = this.f3848f;
        if (i2 != abstractC0274j.d()) {
            a();
        }
        abstractC0274j.l();
        super.c();
    }

    @Override // Q.AbstractC0274j
    public final Function1 f() {
        return this.f3847e;
    }

    @Override // Q.AbstractC0274j
    public final boolean g() {
        return true;
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
    }

    @Override // Q.AbstractC0274j
    public final void n(D d4) {
        C0097d c0097d = q.f3877a;
        throw new IllegalStateException("Cannot modify a state object in a read-only snapshot");
    }

    @Override // Q.AbstractC0274j
    public final AbstractC0274j t(Function1 function1) {
        return new C0271g(this.f3854b, this.f3853a, q.l(function1, this.f3847e, true), this.f3848f);
    }
}
