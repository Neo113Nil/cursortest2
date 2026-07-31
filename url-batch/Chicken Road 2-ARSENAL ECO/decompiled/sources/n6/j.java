package n6;

import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f5529e;

    public j(y delegate) {
        kotlin.jvm.internal.i.e(delegate, "delegate");
        this.f5529e = delegate;
    }

    @Override // n6.y
    public final y a() {
        return this.f5529e.a();
    }

    @Override // n6.y
    public final y b() {
        return this.f5529e.b();
    }

    @Override // n6.y
    public final long c() {
        return this.f5529e.c();
    }

    @Override // n6.y
    public final y d(long j4) {
        return this.f5529e.d(j4);
    }

    @Override // n6.y
    public final boolean e() {
        return this.f5529e.e();
    }

    @Override // n6.y
    public final void f() {
        this.f5529e.f();
    }

    @Override // n6.y
    public final y g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.i.e(unit, "unit");
        return this.f5529e.g(j4);
    }
}
