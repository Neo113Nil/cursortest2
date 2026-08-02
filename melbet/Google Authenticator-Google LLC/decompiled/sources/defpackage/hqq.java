package defpackage;

import j$.time.Duration;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hqq extends hsw {
    public static final Logger a = Logger.getLogger(hqq.class.getCanonicalName());
    public static final Object b = new Object();
    public static final hoq i = new hoq();
    public final hac c;
    public final hqj d;
    public final gzr e;
    public final hab f;
    public final hvm g;
    private final Executor n;
    public volatile int h = 0;
    private final AtomicReference o = new AtomicReference(hnu.aJ(new Object()));

    public hqq(hac hacVar, hqj hqjVar, gzr gzrVar, Executor executor, ScheduledExecutorService scheduledExecutorService, hai haiVar) {
        this.c = hacVar;
        this.d = hqjVar;
        this.e = gzrVar;
        this.n = new hqn(this, executor);
        this.g = hnu.aC(scheduledExecutorService);
        this.f = hab.c(haiVar);
        d(0L, TimeUnit.MILLISECONDS);
        c(new cov(13), executor);
    }

    @Override // defpackage.hsw
    protected final String a() {
        hvi hviVar = (hvi) this.o.get();
        String obj = hviVar.toString();
        hqj hqjVar = this.d;
        gzr gzrVar = this.e;
        return "futureSupplier=[" + this.c.toString() + "], shouldContinue=[" + gzrVar.toString() + "], strategy=[" + hqjVar.toString() + "], tries=[" + this.h + "]" + (hviVar.isDone() ? "" : a.Z(obj, ", activeTry=[", "]"));
    }

    @Override // defpackage.hsw
    protected final void b() {
        hvi hviVar = (hvi) this.o.getAndSet(hnu.aH());
        if (hviVar != null) {
            boolean z = true;
            if (isCancelled() && !r()) {
                z = false;
            }
            hviVar.cancel(z);
        }
    }

    public final void d(final long j, final TimeUnit timeUnit) {
        hvw hvwVar = new hvw();
        hvi hviVar = (hvi) this.o.getAndSet(hvwVar);
        if (j != 0) {
            hviVar = hti.g(hviVar, new htr() { // from class: hqk
                @Override // defpackage.htr
                public final hvi a(Object obj) {
                    return hqq.this.g.schedule(new bws(19), j, timeUnit);
                }
            }, huf.a);
        }
        htr htrVar = new htr() { // from class: hql
            /* JADX WARN: Type inference failed for: r0v5, types: [hvi, java.lang.Object] */
            @Override // defpackage.htr
            public final hvi a(Object obj) {
                hqq hqqVar = hqq.this;
                hqqVar.h++;
                try {
                    return hqqVar.c.bB();
                } catch (Exception e) {
                    hqqVar.p(e);
                    return hnu.aJ(null);
                }
            }
        };
        Executor executor = this.n;
        final hvi g = hti.g(hviVar, htrVar, executor);
        hvwVar.q(hso.g(g, Exception.class, new htr() { // from class: hqm
            @Override // defpackage.htr
            public final hvi a(Object obj) {
                hvi hviVar2 = g;
                Exception exc = (Exception) obj;
                if (hviVar2.isCancelled()) {
                    return hviVar2;
                }
                hqq hqqVar = hqq.this;
                int i2 = hqqVar.h;
                Duration.ofNanos(hqqVar.f.b()).getClass();
                hqj hqjVar = hqqVar.d;
                long millis = (!hqjVar.a(i2) ? hqj.b : hqjVar.a(i2) ? Duration.ZERO : hqj.b).toMillis();
                if (millis < 0) {
                    hqq.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "terminalExceptionCaught", "RetryingFuture caught terminal exception", (Throwable) exc);
                    int i3 = hqqVar.h;
                    throw new hqg(exc);
                }
                hqqVar.e.a(exc);
                hqq.a.logp(Level.FINE, "com.google.common.labs.concurrent.RetryingFuture$1", "retryableExceptionCaught", "RetryingFuture caught exception; retrying", (Throwable) exc);
                hqqVar.d(millis, TimeUnit.MILLISECONDS);
                return hnu.aJ(hqq.b);
            }
        }, executor));
        hvwVar.c(new hqo(this, hvwVar), huf.a);
    }
}
