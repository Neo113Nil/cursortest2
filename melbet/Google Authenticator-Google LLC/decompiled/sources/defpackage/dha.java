package defpackage;

import android.os.Handler;
import android.os.SystemClock;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Delayed;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dha extends htf implements AutoCloseable, hvm {
    public final Handler a;

    public dha(Handler handler) {
        this.a = handler;
    }

    public static int e(Delayed delayed, Delayed delayed2) {
        long delay = delayed2.getDelay(TimeUnit.MILLISECONDS);
        long delay2 = delayed.getDelay(TimeUnit.MILLISECONDS);
        if (delay > delay2) {
            return -1;
        }
        return delay == delay2 ? 0 : 1;
    }

    private final hvk i(Runnable runnable, long j, long j2, TimeUnit timeUnit, boolean z) {
        long millis = timeUnit.toMillis(j);
        dgy dgyVar = new dgy(this, runnable, millis + SystemClock.elapsedRealtime(), timeUnit.toMillis(j2), z);
        this.a.postDelayed(dgyVar, millis);
        j(dgyVar, dgyVar);
        return dgyVar;
    }

    private final void j(hvi hviVar, Runnable runnable) {
        hviVar.c(new dgc(this, runnable, 3), huf.a);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final hvk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return schedule(Executors.callable(runnable), j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final hvk schedule(Callable callable, long j, TimeUnit timeUnit) {
        long millis = timeUnit.toMillis(j);
        dgz dgzVar = new dgz(callable, SystemClock.elapsedRealtime() + millis);
        this.a.postDelayed(dgzVar, millis);
        j(dgzVar, dgzVar);
        return dgzVar;
    }

    @Override // defpackage.hvm
    /* renamed from: c */
    public final hvk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // defpackage.htf, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.e(this);
    }

    @Override // defpackage.hvm
    /* renamed from: d */
    public final hvk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.a.post(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return false;
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return false;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, true);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return i(runnable, j, j2, timeUnit, false);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List shutdownNow() {
        throw new UnsupportedOperationException();
    }
}
