package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class ket implements kfl {
    public final kfl a;

    public ket(kfl kflVar, Executor executor) {
        this.a = kflVar;
        executor.getClass();
    }

    @Override // defpackage.kfl
    public final ScheduledExecutorService a() {
        return ((kea) this.a).a;
    }

    @Override // defpackage.kfl, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }
}
