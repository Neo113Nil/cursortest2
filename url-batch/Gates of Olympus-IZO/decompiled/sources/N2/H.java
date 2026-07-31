package N2;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class H {

    /* renamed from: d, reason: collision with root package name */
    public static final G f2905d = new G();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2906a;

    /* renamed from: b, reason: collision with root package name */
    public long f2907b;

    /* renamed from: c, reason: collision with root package name */
    public long f2908c;

    public H a() {
        this.f2906a = false;
        return this;
    }

    public H b() {
        this.f2908c = 0L;
        return this;
    }

    public long c() {
        if (this.f2906a) {
            return this.f2907b;
        }
        throw new IllegalStateException("No deadline");
    }

    public H d(long j3) {
        this.f2906a = true;
        this.f2907b = j3;
        return this;
    }

    public boolean e() {
        return this.f2906a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2906a && this.f2907b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public H g(long j3, TimeUnit timeUnit) {
        Z1.i.f(timeUnit, "unit");
        if (j3 >= 0) {
            this.f2908c = timeUnit.toNanos(j3);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j3).toString());
    }
}
