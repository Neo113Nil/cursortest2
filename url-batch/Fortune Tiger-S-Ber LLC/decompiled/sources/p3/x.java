package p3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-72a2021f0a77848162657eed404f056d03742612a99b9acca4b8f3bd8ed17555 */
/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static final w f3051d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3052a;

    /* renamed from: b, reason: collision with root package name */
    public long f3053b;
    public long c;

    public x a() {
        this.f3052a = false;
        return this;
    }

    public x b() {
        this.c = 0L;
        return this;
    }

    public long c() {
        if (this.f3052a) {
            return this.f3053b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j4) {
        this.f3052a = true;
        this.f3053b = j4;
        return this;
    }

    public boolean e() {
        return this.f3052a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3052a && this.f3053b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j4) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        u2.c.e(timeUnit, "unit");
        if (j4 >= 0) {
            this.c = timeUnit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j4).toString());
    }
}
