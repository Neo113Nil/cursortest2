package v1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f4521d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4522a;

    /* renamed from: b, reason: collision with root package name */
    public long f4523b;

    /* renamed from: c, reason: collision with root package name */
    public long f4524c;

    public y a() {
        this.f4522a = false;
        return this;
    }

    public y b() {
        this.f4524c = 0L;
        return this;
    }

    public long c() {
        if (this.f4522a) {
            return this.f4523b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j2) {
        this.f4522a = true;
        this.f4523b = j2;
        return this;
    }

    public boolean e() {
        return this.f4522a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4522a && this.f4523b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit timeUnit) {
        X0.f.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f4524c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
