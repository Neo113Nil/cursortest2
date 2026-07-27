package Q;

import B1.C0097d;
import kotlin.jvm.functions.Function1;

/* renamed from: Q.h, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0272h extends AbstractC0274j {

    /* renamed from: e, reason: collision with root package name */
    public final Function1 f3849e;

    /* renamed from: f, reason: collision with root package name */
    public int f3850f;

    public C0272h(int i2, o oVar, Function1 function1) {
        super(i2, oVar);
        this.f3849e = function1;
        this.f3850f = 1;
    }

    @Override // Q.AbstractC0274j
    public final void c() {
        if (this.f3855c) {
            return;
        }
        l();
        super.c();
    }

    @Override // Q.AbstractC0274j
    public final Function1 f() {
        return this.f3849e;
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
        this.f3850f++;
    }

    @Override // Q.AbstractC0274j
    public final void l() {
        int i2 = this.f3850f - 1;
        this.f3850f = i2;
        if (i2 == 0) {
            a();
        }
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
        q.d(this);
        return new C0271g(this.f3854b, this.f3853a, q.l(function1, this.f3849e, true), this);
    }
}
