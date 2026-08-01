package v1;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f4525d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4526a;

    /* renamed from: b, reason: collision with root package name */
    public long f4527b;

    /* renamed from: c, reason: collision with root package name */
    public long f4528c;

    public y a() {
        this.f4526a = false;
        return this;
    }

    public y b() {
        this.f4528c = 0L;
        return this;
    }

    public long c() {
        if (this.f4526a) {
            return this.f4527b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j2) {
        this.f4526a = true;
        this.f4527b = j2;
        return this;
    }

    public boolean e() {
        return this.f4526a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4526a && this.f4527b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j2, TimeUnit timeUnit) {
        X0.f.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f4528c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
