package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class s0 extends cf.c implements ScheduledFuture, ListenableFuture, Future {

    /* renamed from: r, reason: collision with root package name */
    public final r f4179r;

    /* renamed from: s, reason: collision with root package name */
    public final ScheduledFuture f4180s;

    public s0(r rVar, ScheduledFuture scheduledFuture) {
        super(3);
        this.f4179r = rVar;
        this.f4180s = scheduledFuture;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        this.f4179r.a(runnable, executor);
    }

    public final boolean b0(boolean z10) {
        return this.f4179r.cancel(z10);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        boolean b02 = b0(z10);
        if (b02) {
            this.f4180s.cancel(z10);
        }
        return b02;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.f4180s.compareTo(delayed);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4179r.get();
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f4180s.getDelay(timeUnit);
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f4179r.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f4179r.isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.f4179r.get(j, timeUnit);
    }
}
