package B1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f73e;

    public j(x xVar) {
        d1.d.e(xVar, "delegate");
        this.f73e = xVar;
    }

    @Override // B1.x
    public final x a() {
        return this.f73e.a();
    }

    @Override // B1.x
    public final x b() {
        return this.f73e.b();
    }

    @Override // B1.x
    public final long c() {
        return this.f73e.c();
    }

    @Override // B1.x
    public final x d(long j2) {
        return this.f73e.d(j2);
    }

    @Override // B1.x
    public final boolean e() {
        return this.f73e.e();
    }

    @Override // B1.x
    public final void f() {
        this.f73e.f();
    }

    @Override // B1.x
    public final x g(long j2, TimeUnit timeUnit) {
        d1.d.e(timeUnit, "unit");
        return this.f73e.g(j2, timeUnit);
    }
}
