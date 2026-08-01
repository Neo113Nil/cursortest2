package x1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f4240e;

    public j(x xVar) {
        Z0.d.e(xVar, "delegate");
        this.f4240e = xVar;
    }

    @Override // x1.x
    public final x a() {
        return this.f4240e.a();
    }

    @Override // x1.x
    public final x b() {
        return this.f4240e.b();
    }

    @Override // x1.x
    public final long c() {
        return this.f4240e.c();
    }

    @Override // x1.x
    public final x d(long j2) {
        return this.f4240e.d(j2);
    }

    @Override // x1.x
    public final boolean e() {
        return this.f4240e.e();
    }

    @Override // x1.x
    public final void f() {
        this.f4240e.f();
    }

    @Override // x1.x
    public final x g(long j2, TimeUnit timeUnit) {
        Z0.d.e(timeUnit, "unit");
        return this.f4240e.g(j2, timeUnit);
    }
}
