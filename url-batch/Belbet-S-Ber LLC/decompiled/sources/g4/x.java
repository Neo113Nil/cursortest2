package g4;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-cbdb90155a17acee3f5e5c838b1038a1056cff151b1a2a170c159711c8afb558 */
/* loaded from: classes.dex */
public class x {
    public static final w d = new w();

    /* renamed from: a, reason: collision with root package name */
    public boolean f1963a;

    /* renamed from: b, reason: collision with root package name */
    public long f1964b;

    /* renamed from: c, reason: collision with root package name */
    public long f1965c;

    public x a() {
        this.f1963a = false;
        return this;
    }

    public x b() {
        this.f1965c = 0L;
        return this;
    }

    public long c() {
        if (this.f1963a) {
            return this.f1964b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x d(long j2) {
        this.f1963a = true;
        this.f1964b = j2;
        return this;
    }

    public boolean e() {
        return this.f1963a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f1963a && this.f1964b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public x g(long j2) {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        i3.d.e(timeUnit, "unit");
        if (j2 >= 0) {
            this.f1965c = timeUnit.toNanos(j2);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j2).toString());
    }
}
