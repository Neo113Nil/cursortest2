package z3;

import A.AbstractC0017m;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public class H {

    /* renamed from: d, reason: collision with root package name */
    public static final G f11975d = new G();

    /* renamed from: a, reason: collision with root package name */
    public boolean f11976a;

    /* renamed from: b, reason: collision with root package name */
    public long f11977b;

    /* renamed from: c, reason: collision with root package name */
    public long f11978c;

    public H a() {
        this.f11976a = false;
        return this;
    }

    public H b() {
        this.f11978c = 0L;
        return this;
    }

    public long c() {
        if (this.f11976a) {
            return this.f11977b;
        }
        throw new IllegalStateException("No deadline");
    }

    public H d(long j4) {
        this.f11976a = true;
        this.f11977b = j4;
        return this;
    }

    public boolean e() {
        return this.f11976a;
    }

    public void f() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.f11976a && this.f11977b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public H g(long j4, TimeUnit unit) {
        Intrinsics.checkNotNullParameter(unit, "unit");
        if (j4 < 0) {
            throw new IllegalArgumentException(AbstractC0017m.i("timeout < 0: ", j4).toString());
        }
        this.f11978c = unit.toNanos(j4);
        return this;
    }
}
