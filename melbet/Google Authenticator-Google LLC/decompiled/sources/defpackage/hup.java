package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class hup extends hvc {
    private final hvi a;

    public hup(hvi hviVar) {
        hviVar.getClass();
        this.a = hviVar;
    }

    @Override // defpackage.hsw, defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        this.a.c(runnable, executor);
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.a.cancel(z);
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final Object get() {
        return this.a.get();
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.a.isCancelled();
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final boolean isDone() {
        return this.a.isDone();
    }

    @Override // defpackage.hsw
    public final String toString() {
        return this.a.toString();
    }

    @Override // defpackage.hsw, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.a.get(j, timeUnit);
    }
}
