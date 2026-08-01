package v1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f4077e;

    public j(x xVar) {
        X0.d.e(xVar, "delegate");
        this.f4077e = xVar;
    }

    @Override // v1.x
    public final x a() {
        return this.f4077e.a();
    }

    @Override // v1.x
    public final x b() {
        return this.f4077e.b();
    }

    @Override // v1.x
    public final long c() {
        return this.f4077e.c();
    }

    @Override // v1.x
    public final x d(long j2) {
        return this.f4077e.d(j2);
    }

    @Override // v1.x
    public final boolean e() {
        return this.f4077e.e();
    }

    @Override // v1.x
    public final void f() {
        this.f4077e.f();
    }

    @Override // v1.x
    public final x g(long j2, TimeUnit timeUnit) {
        X0.d.e(timeUnit, "unit");
        return this.f4077e.g(j2, timeUnit);
    }
}
