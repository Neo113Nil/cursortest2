package T2;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class H {

    /* renamed from: d, reason: collision with root package name */
    public static final G f4385d = new G();

    /* renamed from: a, reason: collision with root package name */
    public boolean f4386a;

    /* renamed from: b, reason: collision with root package name */
    public long f4387b;

    /* renamed from: c, reason: collision with root package name */
    public long f4388c;

    public H a() {
        this.f4386a = false;
        return this;
    }

    public H b() {
        this.f4388c = 0L;
        return this;
    }

    public long c() {
        if (this.f4386a) {
            return this.f4387b;
        }
        throw new IllegalStateException("No deadline");
    }

    public H d(long j3) {
        this.f4386a = true;
        this.f4387b = j3;
        return this;
    }

    public boolean e() {
        return this.f4386a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f4386a && this.f4387b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public H g(long j3, TimeUnit timeUnit) {
        f2.j.f(timeUnit, "unit");
        if (j3 >= 0) {
            this.f4388c = timeUnit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j3).toString());
    }
}
