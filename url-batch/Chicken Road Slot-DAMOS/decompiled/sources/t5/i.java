package t5;

import com.google.common.util.concurrent.ListenableFuture;
import ge.e1;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i implements ListenableFuture {

    /* renamed from: d, reason: collision with root package name */
    public final e6.j f9309d = new e6.j();

    public i(e1 e1Var) {
        e1Var.o(new a3.e(21, this));
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f9309d.a(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f9309d.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f9309d.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f9309d.f3948d instanceof e6.a;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f9309d.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f9309d.get(j, timeUnit);
    }
}
