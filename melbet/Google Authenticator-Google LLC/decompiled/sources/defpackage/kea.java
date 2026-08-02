package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class kea implements kfl {
    public final ScheduledExecutorService a;
    public final Executor b;
    public final int c;
    public final keb d;
    public final kmt e;
    private final boolean f;

    public kea(keb kebVar, Executor executor, ScheduledExecutorService scheduledExecutorService, int i, kmt kmtVar) {
        boolean z = scheduledExecutorService == null;
        this.f = z;
        this.a = z ? (ScheduledExecutorService) kmi.a(khd.o) : scheduledExecutorService;
        this.c = i;
        this.d = kebVar;
        executor.getClass();
        this.b = executor;
        this.e = kmtVar;
    }

    @Override // defpackage.kfl
    public final ScheduledExecutorService a() {
        throw null;
    }

    @Override // defpackage.kfl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (this.f) {
            kmi.c(khd.o, this.a);
        }
    }
}
