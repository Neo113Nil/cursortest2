package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class i0 extends h0 {

    /* renamed from: w, reason: collision with root package name */
    public final ListenableFuture f4151w;

    public i0(ListenableFuture listenableFuture) {
        this.f4151w = listenableFuture;
    }

    @Override // f8.r, com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f4151w.a(runnable, executor);
    }

    @Override // f8.r, java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return this.f4151w.cancel(z10);
    }

    @Override // f8.r, java.util.concurrent.Future
    public final Object get() {
        return this.f4151w.get();
    }

    @Override // f8.r, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4151w.isCancelled();
    }

    @Override // f8.r, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4151w.isDone();
    }

    @Override // f8.r
    public final String toString() {
        return this.f4151w.toString();
    }

    @Override // f8.r, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f4151w.get(j, timeUnit);
    }
}
