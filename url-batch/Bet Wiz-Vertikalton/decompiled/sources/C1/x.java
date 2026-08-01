package C1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f215a;

    /* renamed from: b, reason: collision with root package name */
    public long f216b;

    /* renamed from: c, reason: collision with root package name */
    public long f217c;

    public x a() {
        this.f215a = false;
        return this;
    }

    public x b() {
        this.f217c = 0L;
        return this;
    }

    public long c() {
        if (this.f215a) {
            return this.f216b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f215a = true;
        this.f216b = j2;
        return this;
    }

    public boolean e() {
        return this.f215a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f215a && this.f216b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        e1.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f217c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
