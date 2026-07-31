package T2;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class n extends H {

    /* renamed from: e, reason: collision with root package name */
    public H f4428e;

    public n(H h3) {
        f2.j.f(h3, "delegate");
        this.f4428e = h3;
    }

    @Override // T2.H
    public final H a() {
        return this.f4428e.a();
    }

    @Override // T2.H
    public final H b() {
        return this.f4428e.b();
    }

    @Override // T2.H
    public final long c() {
        return this.f4428e.c();
    }

    @Override // T2.H
    public final H d(long j3) {
        return this.f4428e.d(j3);
    }

    @Override // T2.H
    public final boolean e() {
        return this.f4428e.e();
    }

    @Override // T2.H
    public final void f() {
        this.f4428e.f();
    }

    @Override // T2.H
    public final H g(long j3, TimeUnit timeUnit) {
        f2.j.f(timeUnit, "unit");
        return this.f4428e.g(j3, timeUnit);
    }
}
