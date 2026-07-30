package u8;

import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public final class i extends z {

    /* renamed from: e, reason: collision with root package name */
    public z f41282e;

    public i(z delegate) {
        kotlin.jvm.internal.h.e(delegate, "delegate");
        this.f41282e = delegate;
    }

    @Override // u8.z
    public final z a() {
        return this.f41282e.a();
    }

    @Override // u8.z
    public final z b() {
        return this.f41282e.b();
    }

    @Override // u8.z
    public final long c() {
        return this.f41282e.c();
    }

    @Override // u8.z
    public final z d(long j9) {
        return this.f41282e.d(j9);
    }

    @Override // u8.z
    public final boolean e() {
        return this.f41282e.e();
    }

    @Override // u8.z
    public final void f() {
        this.f41282e.f();
    }

    @Override // u8.z
    public final z g(long j9) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        return this.f41282e.g(j9);
    }
}
