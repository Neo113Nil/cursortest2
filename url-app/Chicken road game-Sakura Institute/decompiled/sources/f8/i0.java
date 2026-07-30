package f8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-3718d86f024053e6fa1584ac4fc5ef8b7a782884c1fb644516f65396fe794720 */
/* loaded from: classes.dex */
public class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final h0 f3604d = new h0();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3605a;

    /* renamed from: b, reason: collision with root package name */
    public long f3606b;

    /* renamed from: c, reason: collision with root package name */
    public long f3607c;

    public i0 a() {
        this.f3605a = false;
        return this;
    }

    public i0 b() {
        this.f3607c = 0L;
        return this;
    }

    public long c() {
        if (this.f3605a) {
            return this.f3606b;
        }
        throw new IllegalStateException("No deadline");
    }

    public i0 d(long j8) {
        this.f3605a = true;
        this.f3606b = j8;
        return this;
    }

    public boolean e() {
        return this.f3605a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3605a && this.f3606b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public i0 g(long j8) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        r6.k.f(timeUnit, "unit");
        if (j8 < 0) {
            throw new IllegalArgumentException(a0.m.h(j8, "timeout < 0: ").toString());
        }
        this.f3607c = timeUnit.toNanos(j8);
        return this;
    }
}
