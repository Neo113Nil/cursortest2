package n6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f5562d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f5563a;

    /* renamed from: b, reason: collision with root package name */
    public long f5564b;

    /* renamed from: c, reason: collision with root package name */
    public long f5565c;

    public y a() {
        this.f5563a = false;
        return this;
    }

    public y b() {
        this.f5565c = 0L;
        return this;
    }

    public long c() {
        if (this.f5563a) {
            return this.f5564b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j4) {
        this.f5563a = true;
        this.f5564b = j4;
        return this;
    }

    public boolean e() {
        return this.f5563a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f5563a && this.f5564b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.i.e(unit, "unit");
        if (j4 >= 0) {
            this.f5565c = unit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j4).toString());
    }
}
