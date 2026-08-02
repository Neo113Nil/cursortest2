package defpackage;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class hvj extends FutureTask implements hvi {
    private final hui a;

    public hvj(Runnable runnable) {
        super(runnable, null);
        this.a = new hui();
    }

    @Override // defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        runnable.getClass();
        executor.getClass();
        hui huiVar = this.a;
        synchronized (huiVar.b) {
            if (huiVar.a) {
                hui.a(runnable, executor);
            } else {
                huiVar.c = new byo(runnable, executor, huiVar.c);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.lang.Object, java.util.concurrent.Executor] */
    /* JADX WARN: Type inference failed for: r3v3, types: [java.lang.Object, java.lang.Runnable] */
    @Override // java.util.concurrent.FutureTask
    protected final void done() {
        hui huiVar = this.a;
        synchronized (huiVar.b) {
            if (huiVar.a) {
                return;
            }
            huiVar.a = true;
            Object obj = huiVar.c;
            Object obj2 = null;
            huiVar.c = null;
            while (obj != null) {
                byo byoVar = (byo) obj;
                Object obj3 = byoVar.b;
                byoVar.b = obj2;
                obj2 = obj;
                obj = obj3;
            }
            while (obj2 != null) {
                byo byoVar2 = (byo) obj2;
                hui.a(byoVar2.a, byoVar2.c);
                obj2 = byoVar2.b;
            }
        }
    }

    @Override // java.util.concurrent.FutureTask, java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j);
        return nanos <= 2147483647999999999L ? super.get(j, timeUnit) : super.get(Math.min(nanos, 2147483647999999999L), TimeUnit.NANOSECONDS);
    }

    public hvj(Callable callable) {
        super(callable);
        this.a = new hui();
    }
}
