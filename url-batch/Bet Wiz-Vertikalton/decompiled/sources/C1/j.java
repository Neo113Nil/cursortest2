package C1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f186e;

    public j(x xVar) {
        e1.d.e(xVar, "delegate");
        this.f186e = xVar;
    }

    @Override // C1.x
    public final x a() {
        return this.f186e.a();
    }

    @Override // C1.x
    public final x b() {
        return this.f186e.b();
    }

    @Override // C1.x
    public final long c() {
        return this.f186e.c();
    }

    @Override // C1.x
    public final x d(long j2) {
        return this.f186e.d(j2);
    }

    @Override // C1.x
    public final boolean e() {
        return this.f186e.e();
    }

    @Override // C1.x
    public final void f() {
        this.f186e.f();
    }

    @Override // C1.x
    public final x g(long j2, TimeUnit timeUnit) {
        e1.d.e(timeUnit, "unit");
        return this.f186e.g(j2, timeUnit);
    }
}
