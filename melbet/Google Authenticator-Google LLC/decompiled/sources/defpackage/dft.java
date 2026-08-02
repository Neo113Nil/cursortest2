package defpackage;

import android.os.Binder;
import android.os.Build;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class dft extends ThreadPoolExecutor implements AutoCloseable {
    public dft(TimeUnit timeUnit, BlockingQueue blockingQueue, ThreadFactory threadFactory) {
        super(0, Integer.MAX_VALUE, 60L, timeUnit, (BlockingQueue<Runnable>) blockingQueue, threadFactory);
    }

    @Override // java.util.concurrent.ThreadPoolExecutor
    protected final void afterExecute(Runnable runnable, Throwable th) {
        super.afterExecute(runnable, th);
        if (Build.VERSION.SDK_INT < 31) {
            Binder.flushPendingCommands();
        }
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        a.d(this);
    }
}
