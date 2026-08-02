package defpackage;

import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public abstract class huq extends hdk implements Future, hvi {
    protected huq() {
    }

    protected abstract hvi a();

    protected /* bridge */ /* synthetic */ Future b() {
        throw null;
    }

    public void c(Runnable runnable, Executor executor) {
        a().c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return b().cancel(z);
    }

    @Override // defpackage.hdk
    protected /* bridge */ /* synthetic */ Object f() {
        throw null;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return b().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return b().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return b().isDone();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return b().get(j, timeUnit);
    }
}
