package M1;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends x {
    public x e;

    public j(x xVar) {
        j1.h.e(xVar, "delegate");
        this.e = xVar;
    }

    @Override // M1.x
    public final x a() {
        return this.e.a();
    }

    @Override // M1.x
    public final x b() {
        return this.e.b();
    }

    @Override // M1.x
    public final long c() {
        return this.e.c();
    }

    @Override // M1.x
    public final x d(long j) {
        return this.e.d(j);
    }

    @Override // M1.x
    public final boolean e() {
        return this.e.e();
    }

    @Override // M1.x
    public final void f() {
        this.e.f();
    }

    @Override // M1.x
    public final x g(long j, TimeUnit timeUnit) {
        j1.h.e(timeUnit, "unit");
        return this.e.g(j, timeUnit);
    }
}
