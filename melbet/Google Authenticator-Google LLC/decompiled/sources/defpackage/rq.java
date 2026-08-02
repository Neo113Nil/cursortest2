package defpackage;

import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: PG */
/* loaded from: classes2.dex */
public final class rq implements hvi {
    final WeakReference a;
    public final rl b = new rp(this);

    public rq(rm rmVar) {
        this.a = new WeakReference(rmVar);
    }

    public final boolean a(Throwable th) {
        rf rfVar = new rf(th);
        rc rcVar = rl.b;
        rl rlVar = this.b;
        if (!rcVar.d(rlVar, null, rfVar)) {
            return false;
        }
        rl.d(rlVar);
        return true;
    }

    @Override // defpackage.hvi
    public final void c(Runnable runnable, Executor executor) {
        this.b.c(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        rm rmVar = (rm) this.a.get();
        boolean cancel = this.b.cancel(z);
        if (!cancel || rmVar == null) {
            return cancel;
        }
        rmVar.a = null;
        rmVar.b = null;
        rmVar.c.e(null);
        return true;
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        return this.b.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.b.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.b.isDone();
    }

    public final String toString() {
        return this.b.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j, TimeUnit timeUnit) {
        return this.b.get(j, timeUnit);
    }
}
