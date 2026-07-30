package J0;

import O7.b0;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class m implements J3.a {

    /* renamed from: n, reason: collision with root package name */
    public final U0.k f1325n = new U0.k();

    public m(b0 b0Var) {
        b0Var.G(false, true, new l(0, this));
    }

    @Override // J3.a
    public final void c(Runnable runnable, Executor executor) {
        this.f1325n.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z8) {
        return this.f1325n.cancel(z8);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f1325n.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f1325n.f3237n instanceof U0.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f1325n.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j9, TimeUnit timeUnit) {
        return this.f1325n.get(j9, timeUnit);
    }
}
