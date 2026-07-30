package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-99198b194f64cf930afe678846937ee242c378eb2e5d7167669b3ca844d0162b */
/* loaded from: classes.dex */
public final class i70 extends h70 implements rx {
    public final Executor wdg6QnbFHrFF;

    public i70(Executor executor) {
        this.wdg6QnbFHrFF = executor;
        if (executor instanceof ScheduledThreadPoolExecutor) {
            ((ScheduledThreadPoolExecutor) executor).setRemoveOnCancelPolicy(true);
        }
    }

    @Override // defpackage.ju
    public final void Pf0ThKz3j5YS(hu huVar, Runnable runnable) {
        try {
            this.wdg6QnbFHrFF.execute(runnable);
        } catch (RejectedExecutionException e) {
            CancellationException cancellationException = new CancellationException("The task was rejected");
            cancellationException.initCause(e);
            ki0.XL4ISE6Oc65B(huVar, cancellationException);
            yw ywVar = j00.PxuCJdSBwIXG;
            qw.wdg6QnbFHrFF.Pf0ThKz3j5YS(huVar, runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        Executor executor = this.wdg6QnbFHrFF;
        ExecutorService executorService = executor instanceof ExecutorService ? (ExecutorService) executor : null;
        if (executorService != null) {
            executorService.shutdown();
        }
    }

    @Override // defpackage.rx
    public final s00 cpQdD2nAriOS(long j, ak2 ak2Var, hu huVar) {
        Executor executor = this.wdg6QnbFHrFF;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            try {
                scheduledFuture = scheduledExecutorService.schedule(ak2Var, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ki0.XL4ISE6Oc65B(huVar, cancellationException);
            }
        }
        return scheduledFuture != null ? new r00(scheduledFuture) : iw.RfyTYNmI9Srp.cpQdD2nAriOS(j, ak2Var, huVar);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof i70) && ((i70) obj).wdg6QnbFHrFF == this.wdg6QnbFHrFF;
    }

    @Override // defpackage.rx
    public final void gPXPFXrUH4XX(long j, bi biVar) {
        Executor executor = this.wdg6QnbFHrFF;
        ScheduledFuture<?> scheduledFuture = null;
        ScheduledExecutorService scheduledExecutorService = executor instanceof ScheduledExecutorService ? (ScheduledExecutorService) executor : null;
        if (scheduledExecutorService != null) {
            sh shVar = new sh(4, this, biVar);
            hu huVar = biVar.x50lh2ztY7Y5;
            try {
                scheduledFuture = scheduledExecutorService.schedule(shVar, j, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e) {
                CancellationException cancellationException = new CancellationException("The task was rejected");
                cancellationException.initCause(e);
                ki0.XL4ISE6Oc65B(huVar, cancellationException);
            }
        }
        if (scheduledFuture != null) {
            biVar.e6tOsSdd2EFb(new vh(0, scheduledFuture));
        } else {
            iw.RfyTYNmI9Srp.gPXPFXrUH4XX(j, biVar);
        }
    }

    public final int hashCode() {
        return System.identityHashCode(this.wdg6QnbFHrFF);
    }

    @Override // defpackage.ju
    public final String toString() {
        return this.wdg6QnbFHrFF.toString();
    }
}
