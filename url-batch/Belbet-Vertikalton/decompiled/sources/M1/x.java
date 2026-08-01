package M1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static final w f860d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f861a;

    /* renamed from: b, reason: collision with root package name */
    public long f862b;

    /* renamed from: c, reason: collision with root package name */
    public long f863c;

    public x a() {
        this.f861a = false;
        return this;
    }

    public x b() {
        this.f863c = 0L;
        return this;
    }

    public long c() {
        if (this.f861a) {
            return this.f862b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j) {
        this.f861a = true;
        this.f862b = j;
        return this;
    }

    public boolean e() {
        return this.f861a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f861a && this.f862b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j, TimeUnit timeUnit) {
        j1.h.e(timeUnit, "unit");
        if (j >= 0) {
            this.f863c = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }
}
