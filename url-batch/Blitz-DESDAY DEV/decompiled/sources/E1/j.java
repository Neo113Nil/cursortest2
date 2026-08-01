package E1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f206e;

    public j(x xVar) {
        g1.d.e(xVar, "delegate");
        this.f206e = xVar;
    }

    @Override // E1.x
    public final x a() {
        return this.f206e.a();
    }

    @Override // E1.x
    public final x b() {
        return this.f206e.b();
    }

    @Override // E1.x
    public final long c() {
        return this.f206e.c();
    }

    @Override // E1.x
    public final x d(long j2) {
        return this.f206e.d(j2);
    }

    @Override // E1.x
    public final boolean e() {
        return this.f206e.e();
    }

    @Override // E1.x
    public final void f() {
        this.f206e.f();
    }

    @Override // E1.x
    public final x g(long j2, TimeUnit timeUnit) {
        g1.d.e(timeUnit, "unit");
        return this.f206e.g(j2, timeUnit);
    }
}
