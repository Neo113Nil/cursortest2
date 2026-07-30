package T6;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class y {

    /* renamed from: d, reason: collision with root package name */
    public static final x f2655d = new x();

    /* renamed from: a, reason: collision with root package name */
    public boolean f2656a;

    /* renamed from: b, reason: collision with root package name */
    public long f2657b;

    /* renamed from: c, reason: collision with root package name */
    public long f2658c;

    public y a() {
        this.f2656a = false;
        return this;
    }

    public y b() {
        this.f2658c = 0L;
        return this;
    }

    public long c() {
        if (this.f2656a) {
            return this.f2657b;
        }
        throw new IllegalStateException("No deadline");
    }

    public y d(long j) {
        this.f2656a = true;
        this.f2657b = j;
        return this;
    }

    public boolean e() {
        return this.f2656a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f2656a && this.f2657b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y g(long j) {
        TimeUnit unit = TimeUnit.MILLISECONDS;
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j >= 0) {
            this.f2658c = unit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException(("timeout < 0: " + j).toString());
    }
}
