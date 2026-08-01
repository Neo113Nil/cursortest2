package z1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f4272e;

    public j(x xVar) {
        b1.d.e(xVar, "delegate");
        this.f4272e = xVar;
    }

    @Override // z1.x
    public final x a() {
        return this.f4272e.a();
    }

    @Override // z1.x
    public final x b() {
        return this.f4272e.b();
    }

    @Override // z1.x
    public final long c() {
        return this.f4272e.c();
    }

    @Override // z1.x
    public final x d(long j2) {
        return this.f4272e.d(j2);
    }

    @Override // z1.x
    public final boolean e() {
        return this.f4272e.e();
    }

    @Override // z1.x
    public final void f() {
        this.f4272e.f();
    }

    @Override // z1.x
    public final x g(long j2, TimeUnit timeUnit) {
        b1.d.e(timeUnit, "unit");
        return this.f4272e.g(j2, timeUnit);
    }
}
