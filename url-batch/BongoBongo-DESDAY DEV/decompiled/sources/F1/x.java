package F1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f280a;

    /* renamed from: b, reason: collision with root package name */
    public long f281b;

    /* renamed from: c, reason: collision with root package name */
    public long f282c;

    public x a() {
        this.f280a = false;
        return this;
    }

    public x b() {
        this.f282c = 0L;
        return this;
    }

    public long c() {
        if (this.f280a) {
            return this.f281b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f280a = true;
        this.f281b = j2;
        return this;
    }

    public boolean e() {
        return this.f280a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f280a && this.f281b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        h1.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f282c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
