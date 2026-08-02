package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dgh extends hus implements AutoCloseable, hvm {
    public static final /* synthetic */ int b = 0;
    public final hvm a;
    private final hvl c;

    public dgh(hvl hvlVar, hvm hvmVar) {
        this.c = hvlVar;
        this.a = hvmVar;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a */
    public final hvk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        hvj hvjVar = new hvj(runnable);
        return j <= 0 ? new dgg(this.c.submit(runnable), System.nanoTime()) : new dgf(hvjVar, this.a.schedule(new dgc(this, hvjVar, 1), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b */
    public final hvk schedule(Callable callable, long j, TimeUnit timeUnit) {
        if (j <= 0) {
            return new dgg(this.c.submit(callable), System.nanoTime());
        }
        hvj hvjVar = new hvj(callable);
        return new dgf(hvjVar, this.a.schedule(new dgc(this, hvjVar, 0), j, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c */
    public final hvk scheduleAtFixedRate(final Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        final hvv hvvVar = new hvv(this);
        final hvw hvwVar = new hvw();
        return new dgf(hvwVar, this.a.scheduleAtFixedRate(new Runnable() { // from class: dgb
            @Override // java.lang.Runnable
            public final void run() {
                int i = dgh.b;
                final Runnable runnable2 = runnable;
                final hvw hvwVar2 = hvwVar;
                hvvVar.execute(new Runnable() { // from class: dga
                    @Override // java.lang.Runnable
                    public final void run() {
                        int i2 = dgh.b;
                        try {
                            runnable2.run();
                        } catch (Throwable th) {
                            hvwVar2.p(th);
                        }
                    }
                });
            }
        }, j, j2, timeUnit));
    }

    @Override // defpackage.hus, defpackage.huo, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d */
    public final hvk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        hvw hvwVar = new hvw();
        dgf dgfVar = new dgf(hvwVar, null);
        dgfVar.a = this.a.schedule(new dge(this, runnable, hvwVar, dgfVar, j2, timeUnit), j, timeUnit);
        return dgfVar;
    }

    @Override // defpackage.hus
    public final hvl e() {
        return this.c;
    }

    @Override // defpackage.huo, defpackage.hdk
    public final /* synthetic */ Object f() {
        return this.c;
    }

    @Override // defpackage.hus, defpackage.huo
    public final /* synthetic */ ExecutorService g() {
        return this.c;
    }
}
