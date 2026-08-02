package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class kki {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final Runnable c;
    public long d;
    public boolean e;
    public ScheduledFuture f;
    private final hab g;

    public kki(Runnable runnable, Executor executor, ScheduledExecutorService scheduledExecutorService, hab habVar) {
        this.c = runnable;
        this.b = executor;
        this.a = scheduledExecutorService;
        this.g = habVar;
        habVar.e();
    }

    public final long a() {
        return this.g.a(TimeUnit.NANOSECONDS);
    }
}
