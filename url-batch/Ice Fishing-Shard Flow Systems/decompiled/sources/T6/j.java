package T6;

import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class j extends y {

    /* renamed from: e, reason: collision with root package name */
    public y f2622e;

    public j(y delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f2622e = delegate;
    }

    @Override // T6.y
    public final y a() {
        return this.f2622e.a();
    }

    @Override // T6.y
    public final y b() {
        return this.f2622e.b();
    }

    @Override // T6.y
    public final long c() {
        return this.f2622e.c();
    }

    @Override // T6.y
    public final y d(long j) {
        return this.f2622e.d(j);
    }

    @Override // T6.y
    public final boolean e() {
        return this.f2622e.e();
    }

    @Override // T6.y
    public final void f() {
        this.f2622e.f();
    }

    @Override // T6.y
    public final y g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        return this.f2622e.g(j);
    }
}
