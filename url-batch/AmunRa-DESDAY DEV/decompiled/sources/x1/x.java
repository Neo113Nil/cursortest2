package x1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4269a;

    /* renamed from: b, reason: collision with root package name */
    public long f4270b;

    /* renamed from: c, reason: collision with root package name */
    public long f4271c;

    public x a() {
        this.f4269a = false;
        return this;
    }

    public x b() {
        this.f4271c = 0L;
        return this;
    }

    public long c() {
        if (this.f4269a) {
            return this.f4270b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f4269a = true;
        this.f4270b = j2;
        return this;
    }

    public boolean e() {
        return this.f4269a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4269a && this.f4270b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        Z0.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f4271c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
