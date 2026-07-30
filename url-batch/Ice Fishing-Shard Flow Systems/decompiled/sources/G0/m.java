package G0;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;
import n6.I;
import n6.Z;

/* loaded from: classes.dex */
public final class m implements O1.a {

    /* renamed from: d, reason: collision with root package name */
    public final R0.k f819d;

    public m(Z job) {
        R0.k underlying = new R0.k();
        Intrinsics.checkNotNullExpressionValue(underlying, "create()");
        Intrinsics.checkNotNullParameter(job, "job");
        Intrinsics.checkNotNullParameter(underlying, "underlying");
        this.f819d = underlying;
        job.F(true, new I(1, new l(0, this)));
    }

    @Override // O1.a
    public final void a(Runnable runnable, Executor executor) {
        this.f819d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        return this.f819d.cancel(z7);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f819d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f819d.f2395d instanceof R0.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f819d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f819d.get(j, timeUnit);
    }
}
