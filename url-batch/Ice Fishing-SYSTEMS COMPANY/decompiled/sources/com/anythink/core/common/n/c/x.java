package com.anythink.core.common.n.c;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public class x {

    /* renamed from: c, reason: collision with root package name */
    public static final x f16083c = new x() { // from class: com.anythink.core.common.n.c.x.1
        @Override // com.anythink.core.common.n.c.x
        public final x a(long j9) {
            return this;
        }

        @Override // com.anythink.core.common.n.c.x
        public final void g() {
        }

        @Override // com.anythink.core.common.n.c.x
        public final x a(long j9, TimeUnit timeUnit) {
            return this;
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private boolean f16084a;

    /* renamed from: b, reason: collision with root package name */
    private long f16085b;

    /* renamed from: d, reason: collision with root package name */
    private long f16086d;

    private static long a(long j9, long j10) {
        return (j9 != 0 && (j10 == 0 || j9 < j10)) ? j9 : j10;
    }

    private x b(long j9, TimeUnit timeUnit) {
        if (j9 <= 0) {
            throw new IllegalArgumentException("duration <= 0: ".concat(String.valueOf(j9)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        return a(timeUnit.toNanos(j9) + System.nanoTime());
    }

    public x f() {
        this.f16084a = false;
        return this;
    }

    public boolean f_() {
        return this.f16084a;
    }

    public void g() {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
        if (this.f16084a && this.f16085b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public long g_() {
        if (this.f16084a) {
            return this.f16085b;
        }
        throw new IllegalStateException("No deadline");
    }

    public x h_() {
        this.f16086d = 0L;
        return this;
    }

    public long i_() {
        return this.f16086d;
    }

    public x a(long j9, TimeUnit timeUnit) {
        if (j9 < 0) {
            throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j9)));
        }
        if (timeUnit == null) {
            throw new IllegalArgumentException("unit == null");
        }
        this.f16086d = timeUnit.toNanos(j9);
        return this;
    }

    public x a(long j9) {
        this.f16084a = true;
        this.f16085b = j9;
        return this;
    }

    private void a(Object obj) {
        try {
            boolean f_ = f_();
            long i_ = i_();
            long j9 = 0;
            if (!f_ && i_ == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (f_ && i_ != 0) {
                i_ = Math.min(i_, g_() - nanoTime);
            } else if (f_) {
                i_ = g_() - nanoTime;
            }
            if (i_ > 0) {
                long j10 = i_ / 1000000;
                obj.wait(j10, (int) (i_ - (1000000 * j10)));
                j9 = System.nanoTime() - nanoTime;
            }
            if (j9 >= i_) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
