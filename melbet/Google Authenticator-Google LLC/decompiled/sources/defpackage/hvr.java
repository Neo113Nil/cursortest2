package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvr extends hvo implements AutoCloseable, hvm {
    final ScheduledExecutorService a;

    public hvr(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        scheduledExecutorService.getClass();
        this.a = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final hvk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        ScheduledExecutorService scheduledExecutorService = this.a;
        hwd d = hwd.d(runnable, null);
        return new hvp(d, scheduledExecutorService.schedule(d, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final hvk schedule(Callable callable, long j, TimeUnit timeUnit) {
        hwd hwdVar = new hwd(callable);
        return new hvp(hwdVar, this.a.schedule(hwdVar, j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final hvk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hvq hvqVar = new hvq(runnable);
        return new hvp(hvqVar, this.a.scheduleAtFixedRate(hvqVar, j, j2, timeUnit));
    }

    @Override // defpackage.htf, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final hvk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hvq hvqVar = new hvq(runnable);
        return new hvp(hvqVar, this.a.scheduleWithFixedDelay(hvqVar, j, j2, timeUnit));
    }
}
