package c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* compiled from: Timeout.java */
/* loaded from: classes.dex */
public class s {

    /* renamed from: c, reason: collision with root package name */
    public static final s f2222c = new s() { // from class: c.s.1
        @Override // c.s
        public s a(long j) {
            return this;
        }

        @Override // c.s
        public s a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // c.s
        public void g() throws IOException {
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private boolean f2223a;

    /* renamed from: b, reason: collision with root package name */
    private long f2224b;

    /* renamed from: d, reason: collision with root package name */
    private long f2225d;

    public s a(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.f2225d = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: " + j);
    }

    public long e_() {
        return this.f2225d;
    }

    public boolean f_() {
        return this.f2223a;
    }

    public long d() {
        if (!this.f2223a) {
            throw new IllegalStateException("No deadline");
        }
        return this.f2224b;
    }

    public s a(long j) {
        this.f2223a = true;
        this.f2224b = j;
        return this;
    }

    public s g_() {
        this.f2225d = 0L;
        return this;
    }

    public s f() {
        this.f2223a = false;
        return this;
    }

    public void g() throws IOException {
        if (Thread.interrupted()) {
            throw new InterruptedIOException("thread interrupted");
        }
        if (this.f2223a && this.f2224b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }
}
