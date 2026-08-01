package v1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends w {

    /* renamed from: e, reason: collision with root package name */
    public w f4056e;

    public j(w wVar) {
        X0.e.e(wVar, "delegate");
        this.f4056e = wVar;
    }

    @Override // v1.w
    public final w a() {
        return this.f4056e.a();
    }

    @Override // v1.w
    public final w b() {
        return this.f4056e.b();
    }

    @Override // v1.w
    public final long c() {
        return this.f4056e.c();
    }

    @Override // v1.w
    public final w d(long j2) {
        return this.f4056e.d(j2);
    }

    @Override // v1.w
    public final boolean e() {
        return this.f4056e.e();
    }

    @Override // v1.w
    public final void f() {
        this.f4056e.f();
    }

    @Override // v1.w
    public final w g(long j2, TimeUnit timeUnit) {
        X0.e.e(timeUnit, "unit");
        return this.f4056e.g(j2, timeUnit);
    }
}
