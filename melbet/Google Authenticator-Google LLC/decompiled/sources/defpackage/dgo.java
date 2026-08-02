package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class dgo extends hus implements AutoCloseable, hvm {
    protected dgo() {
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final hvk schedule(Runnable runnable, long j, TimeUnit timeUnit) {
        return h().schedule(runnable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final hvk schedule(Callable callable, long j, TimeUnit timeUnit) {
        return h().schedule(callable, j, timeUnit);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final hvk scheduleAtFixedRate(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleAtFixedRate(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.hus, defpackage.huo, java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final hvk scheduleWithFixedDelay(Runnable runnable, long j, long j2, TimeUnit timeUnit) {
        return h().scheduleWithFixedDelay(runnable, j, j2, timeUnit);
    }

    @Override // defpackage.hus
    protected /* bridge */ /* synthetic */ hvl e() {
        throw null;
    }

    protected abstract hvm h();
}
