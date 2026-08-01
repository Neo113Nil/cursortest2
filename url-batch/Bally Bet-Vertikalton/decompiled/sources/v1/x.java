package v1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4089a;

    /* renamed from: b, reason: collision with root package name */
    public long f4090b;

    /* renamed from: c, reason: collision with root package name */
    public long f4091c;

    public x a() {
        this.f4089a = false;
        return this;
    }

    public x b() {
        this.f4091c = 0L;
        return this;
    }

    public long c() {
        if (this.f4089a) {
            return this.f4090b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f4089a = true;
        this.f4090b = j2;
        return this;
    }

    public boolean e() {
        return this.f4089a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4089a && this.f4090b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        X0.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f4091c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
