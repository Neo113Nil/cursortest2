package T3;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class k extends x {

    /* renamed from: e, reason: collision with root package name */
    public x f2980e;

    public k(x delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f2980e = delegate;
    }

    @Override // T3.x
    public final x a() {
        return this.f2980e.a();
    }

    @Override // T3.x
    public final x b() {
        return this.f2980e.b();
    }

    @Override // T3.x
    public final long c() {
        return this.f2980e.c();
    }

    @Override // T3.x
    public final x d(long j4) {
        return this.f2980e.d(j4);
    }

    @Override // T3.x
    public final boolean e() {
        return this.f2980e.e();
    }

    @Override // T3.x
    public final void f() {
        this.f2980e.f();
    }

    @Override // T3.x
    public final x g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.i.e(unit, "unit");
        return this.f2980e.g(j4);
    }
}
