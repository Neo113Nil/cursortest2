package M1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f832a;

    /* renamed from: b, reason: collision with root package name */
    public long f833b;

    /* renamed from: c, reason: collision with root package name */
    public long f834c;

    public x a() {
        this.f832a = false;
        return this;
    }

    public x b() {
        this.f834c = 0L;
        return this;
    }

    public long c() {
        if (this.f832a) {
            return this.f833b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f832a = true;
        this.f833b = j2;
        return this;
    }

    public boolean e() {
        return this.f832a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f832a && this.f833b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        k1.e.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f834c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
