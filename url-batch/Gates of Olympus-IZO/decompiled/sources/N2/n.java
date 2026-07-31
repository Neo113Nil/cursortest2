package N2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends H {

    /* renamed from: e, reason: collision with root package name */
    public H f2948e;

    public n(H h3) {
        Z1.i.f(h3, "delegate");
        this.f2948e = h3;
    }

    @Override // N2.H
    public final H a() {
        return this.f2948e.a();
    }

    @Override // N2.H
    public final H b() {
        return this.f2948e.b();
    }

    @Override // N2.H
    public final long c() {
        return this.f2948e.c();
    }

    @Override // N2.H
    public final H d(long j3) {
        return this.f2948e.d(j3);
    }

    @Override // N2.H
    public final boolean e() {
        return this.f2948e.e();
    }

    @Override // N2.H
    public final void f() {
        this.f2948e.f();
    }

    @Override // N2.H
    public final H g(long j3, TimeUnit timeUnit) {
        Z1.i.f(timeUnit, "unit");
        return this.f2948e.g(j3, timeUnit);
    }
}
