package u8;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public class z {

    /* renamed from: d, reason: collision with root package name */
    public static final y f41323d = new y();

    /* renamed from: a, reason: collision with root package name */
    public boolean f41324a;

    /* renamed from: b, reason: collision with root package name */
    public long f41325b;

    /* renamed from: c, reason: collision with root package name */
    public long f41326c;

    public z a() {
        this.f41324a = false;
        return this;
    }

    public z b() {
        this.f41326c = 0L;
        return this;
    }

    public long c() {
        if (this.f41324a) {
            return this.f41325b;
        }
        throw new IllegalStateException("No deadline");
    }

    public z d(long j9) {
        this.f41324a = true;
        this.f41325b = j9;
        return this;
    }

    public boolean e() {
        return this.f41324a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f41324a && this.f41325b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public z g(long j9) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        kotlin.jvm.internal.h.e(unit, "unit");
        if (j9 >= 0) {
            this.f41326c = unit.toNanos(j9);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j9).toString());
    }
}
