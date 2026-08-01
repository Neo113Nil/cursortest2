package M1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f803e;

    public j(x xVar) {
        k1.e.e(xVar, "delegate");
        this.f803e = xVar;
    }

    @Override // M1.x
    public final x a() {
        return this.f803e.a();
    }

    @Override // M1.x
    public final x b() {
        return this.f803e.b();
    }

    @Override // M1.x
    public final long c() {
        return this.f803e.c();
    }

    @Override // M1.x
    public final x d(long j2) {
        return this.f803e.d(j2);
    }

    @Override // M1.x
    public final boolean e() {
        return this.f803e.e();
    }

    @Override // M1.x
    public final void f() {
        this.f803e.f();
    }

    @Override // M1.x
    public final x g(long j2, TimeUnit timeUnit) {
        k1.e.e(timeUnit, "unit");
        return this.f803e.g(j2, timeUnit);
    }
}
