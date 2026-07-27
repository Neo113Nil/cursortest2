package j5;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f10500e;

    public j(y delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f10500e = delegate;
    }

    @Override // j5.y
    public final y a() {
        return this.f10500e.a();
    }

    @Override // j5.y
    public final y b() {
        return this.f10500e.b();
    }

    @Override // j5.y
    public final long c() {
        return this.f10500e.c();
    }

    @Override // j5.y
    public final y d(long j2) {
        return this.f10500e.d(j2);
    }

    @Override // j5.y
    public final boolean e() {
        return this.f10500e.e();
    }

    @Override // j5.y
    public final void f() {
        this.f10500e.f();
    }

    @Override // j5.y
    public final y g(long j2, TimeUnit unit) {
        kotlin.jvm.internal.i.e(unit, "unit");
        return this.f10500e.g(j2, unit);
    }
}
