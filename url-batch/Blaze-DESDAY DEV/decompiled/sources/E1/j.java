package E1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f207e;

    public j(x xVar) {
        g1.d.e(xVar, "delegate");
        this.f207e = xVar;
    }

    @Override // E1.x
    public final x a() {
        return this.f207e.a();
    }

    @Override // E1.x
    public final x b() {
        return this.f207e.b();
    }

    @Override // E1.x
    public final long c() {
        return this.f207e.c();
    }

    @Override // E1.x
    public final x d(long j2) {
        return this.f207e.d(j2);
    }

    @Override // E1.x
    public final boolean e() {
        return this.f207e.e();
    }

    @Override // E1.x
    public final void f() {
        this.f207e.f();
    }

    @Override // E1.x
    public final x g(long j2, TimeUnit timeUnit) {
        g1.d.e(timeUnit, "unit");
        return this.f207e.g(j2, timeUnit);
    }
}
