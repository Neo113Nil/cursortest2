package defpackage;

import java.util.concurrent.Executor;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class ldm extends kwm implements Executor {
    public static final ldm a = new ldm();
    private static final kvj d = lds.a.g(jav.n("kotlinx.coroutines.io.parallelism", ksl.f(64, ldc.a), Integer.MAX_VALUE));

    @Override // defpackage.kvj
    public final void a(kqn kqnVar, Runnable runnable) {
        d.a(kqnVar, runnable);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Cannot be invoked on Dispatchers.IO");
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(kqo.a, runnable);
    }

    @Override // defpackage.kvj
    public final void f(kqn kqnVar, Runnable runnable) {
        d.f(kqnVar, runnable);
    }

    @Override // defpackage.kvj
    public final String toString() {
        return "Dispatchers.IO";
    }

    @Override // defpackage.kwm
    public final Executor e() {
        return this;
    }
}
