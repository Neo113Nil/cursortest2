package v1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f4489e;

    public k(y yVar) {
        X0.f.e(yVar, "delegate");
        this.f4489e = yVar;
    }

    @Override // v1.y
    public final y a() {
        return this.f4489e.a();
    }

    @Override // v1.y
    public final y b() {
        return this.f4489e.b();
    }

    @Override // v1.y
    public final long c() {
        return this.f4489e.c();
    }

    @Override // v1.y
    public final y d(long j2) {
        return this.f4489e.d(j2);
    }

    @Override // v1.y
    public final boolean e() {
        return this.f4489e.e();
    }

    @Override // v1.y
    public final void f() {
        this.f4489e.f();
    }

    @Override // v1.y
    public final y g(long j2, TimeUnit timeUnit) {
        X0.f.e(timeUnit, "unit");
        return this.f4489e.g(j2, timeUnit);
    }
}
