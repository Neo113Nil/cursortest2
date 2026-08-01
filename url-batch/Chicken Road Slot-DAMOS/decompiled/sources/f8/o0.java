package f8;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class o0 implements ListenableFuture {

    /* renamed from: e, reason: collision with root package name */
    public static final o0 f4157e = new o0(null);

    /* renamed from: i, reason: collision with root package name */
    public static final Logger f4158i = Logger.getLogger(o0.class.getName());

    /* renamed from: d, reason: collision with root package name */
    public final Object f4159d;

    public o0(Object obj) {
        this.f4159d = obj;
    }

    @Override // com.google.common.util.concurrent.ListenableFuture
    public final void a(Runnable runnable, Executor executor) {
        i7.a.y(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Level level = Level.SEVERE;
            String valueOf = String.valueOf(runnable);
            String valueOf2 = String.valueOf(executor);
            StringBuilder sb2 = new StringBuilder(valueOf2.length() + valueOf.length() + 57);
            sb2.append("RuntimeException while executing runnable ");
            sb2.append(valueOf);
            sb2.append(" with executor ");
            sb2.append(valueOf2);
            f4158i.log(level, sb2.toString(), (Throwable) e2);
        }
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z10) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        timeUnit.getClass();
        return this.f4159d;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.f4159d);
        StringBuilder sb2 = new StringBuilder(valueOf.length() + String.valueOf(obj).length() + 27);
        sb2.append(obj);
        sb2.append("[status=SUCCESS, result=[");
        sb2.append(valueOf);
        sb2.append("]]");
        return sb2.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.f4159d;
    }
}
