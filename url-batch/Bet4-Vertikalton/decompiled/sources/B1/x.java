package B1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f102a;

    /* renamed from: b, reason: collision with root package name */
    public long f103b;

    /* renamed from: c, reason: collision with root package name */
    public long f104c;

    public x a() {
        this.f102a = false;
        return this;
    }

    public x b() {
        this.f104c = 0L;
        return this;
    }

    public long c() {
        if (this.f102a) {
            return this.f103b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f102a = true;
        this.f103b = j2;
        return this;
    }

    public boolean e() {
        return this.f102a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f102a && this.f103b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2, TimeUnit timeUnit) {
        d1.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f104c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
