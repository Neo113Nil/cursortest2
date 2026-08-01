package F1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f251e;

    public j(x xVar) {
        h1.d.e(xVar, "delegate");
        this.f251e = xVar;
    }

    @Override // F1.x
    public final x a() {
        return this.f251e.a();
    }

    @Override // F1.x
    public final x b() {
        return this.f251e.b();
    }

    @Override // F1.x
    public final long c() {
        return this.f251e.c();
    }

    @Override // F1.x
    public final x d(long j2) {
        return this.f251e.d(j2);
    }

    @Override // F1.x
    public final boolean e() {
        return this.f251e.e();
    }

    @Override // F1.x
    public final void f() {
        this.f251e.f();
    }

    @Override // F1.x
    public final x g(long j2, TimeUnit timeUnit) {
        h1.d.e(timeUnit, "unit");
        return this.f251e.g(j2, timeUnit);
    }
}
