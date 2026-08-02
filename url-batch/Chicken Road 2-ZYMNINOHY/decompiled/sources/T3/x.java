package T3;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: d, reason: collision with root package name */
    public static final w f3010d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f3011a;

    /* renamed from: b, reason: collision with root package name */
    public long f3012b;

    /* renamed from: c, reason: collision with root package name */
    public long f3013c;

    public x a() {
        this.f3011a = false;
        return this;
    }

    public x b() {
        this.f3013c = 0L;
        return this;
    }

    public long c() {
        if (this.f3011a) {
            return this.f3012b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j4) {
        this.f3011a = true;
        this.f3012b = j4;
        return this;
    }

    public boolean e() {
        return this.f3011a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f3011a && this.f3012b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j4) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.i.e(unit, "unit");
        if (j4 >= 0) {
            this.f3013c = unit.toNanos(j4);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j4).toString());
    }
}
