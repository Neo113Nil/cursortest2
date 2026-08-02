package defpackage;

import android.os.SystemClock;
import java.util.concurrent.Delayed;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: PG */
/* loaded from: classes2.dex */
final class dgy extends hsw implements Runnable, hvk {
    final long a;
    final long b;
    final boolean c;
    final AtomicLong d = new AtomicLong(0);
    Runnable e;
    final /* synthetic */ dha f;

    public dgy(dha dhaVar, Runnable runnable, long j, long j2, boolean z) {
        this.f = dhaVar;
        this.e = runnable;
        this.a = j;
        this.b = j2;
        this.c = z;
    }

    private final long d() {
        return Math.max(0L, ((this.d.get() * this.b) + this.a) - SystemClock.elapsedRealtime());
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Delayed delayed) {
        return dha.e(this, delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return timeUnit.convert(d(), TimeUnit.MILLISECONDS);
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (isDone()) {
            return;
        }
        this.d.incrementAndGet();
        try {
            this.e.run();
            boolean z = this.c;
            dha dhaVar = this.f;
            if (z) {
                dhaVar.a.postDelayed(this, d());
            } else {
                dhaVar.a.postDelayed(this, this.b);
            }
        } catch (Throwable th) {
            this.e = null;
            p(th);
        }
    }
}
