package E1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f236a;

    /* renamed from: b, reason: collision with root package name */
    public long f237b;

    /* renamed from: c, reason: collision with root package name */
    public long f238c;

    public x a() {
        this.f236a = false;
        return this;
    }

    public x b() {
        this.f238c = 0L;
        return this;
    }

    public long c() {
        if (this.f236a) {
            return this.f237b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f236a = true;
        this.f237b = j2;
        return this;
    }

    public boolean e() {
        return this.f236a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f236a && this.f237b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        g1.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f238c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
