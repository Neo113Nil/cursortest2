package okio;

import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes5.dex */
public class y0 {
    public static final b Companion = new b(null);
    public static final y0 NONE = new a();
    private long deadlineNanoTime;
    private boolean hasDeadline;
    private long timeoutNanos;

    public static final class a extends y0 {
        a() {
        }

        @Override // okio.y0
        public y0 deadlineNanoTime(long j8) {
            return this;
        }

        @Override // okio.y0
        public void throwIfReached() {
        }

        @Override // okio.y0
        public y0 timeout(long j8, TimeUnit unit) {
            kotlin.jvm.internal.s.checkNotNullParameter(unit, "unit");
            return this;
        }
    }

    public static final class b {
        private b() {
        }

        public /* synthetic */ b(kotlin.jvm.internal.o oVar) {
            this();
        }

        public final long minTimeout(long j8, long j9) {
            return (j8 != 0 && (j9 == 0 || j8 < j9)) ? j8 : j9;
        }
    }

    public y0 clearDeadline() {
        this.hasDeadline = false;
        return this;
    }

    public y0 clearTimeout() {
        this.timeoutNanos = 0L;
        return this;
    }

    public final y0 deadline(long j8, TimeUnit unit) {
        kotlin.jvm.internal.s.checkNotNullParameter(unit, "unit");
        if (j8 > 0) {
            return deadlineNanoTime(System.nanoTime() + unit.toNanos(j8));
        }
        throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("duration <= 0: ", Long.valueOf(j8)).toString());
    }

    public y0 deadlineNanoTime(long j8) {
        this.hasDeadline = true;
        this.deadlineNanoTime = j8;
        return this;
    }

    public boolean hasDeadline() {
        return this.hasDeadline;
    }

    public final <T> T intersectWith(y0 other, f6.a block) {
        kotlin.jvm.internal.s.checkNotNullParameter(other, "other");
        kotlin.jvm.internal.s.checkNotNullParameter(block, "block");
        long timeoutNanos = timeoutNanos();
        long minTimeout = Companion.minTimeout(other.timeoutNanos(), timeoutNanos());
        TimeUnit timeUnit = TimeUnit.NANOSECONDS;
        timeout(minTimeout, timeUnit);
        if (!hasDeadline()) {
            if (other.hasDeadline()) {
                deadlineNanoTime(other.deadlineNanoTime());
            }
            try {
                T t7 = (T) block.invoke();
                kotlin.jvm.internal.r.finallyStart(1);
                timeout(timeoutNanos, timeUnit);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                kotlin.jvm.internal.r.finallyEnd(1);
                return t7;
            } catch (Throwable th) {
                kotlin.jvm.internal.r.finallyStart(1);
                timeout(timeoutNanos, TimeUnit.NANOSECONDS);
                if (other.hasDeadline()) {
                    clearDeadline();
                }
                kotlin.jvm.internal.r.finallyEnd(1);
                throw th;
            }
        }
        long deadlineNanoTime = deadlineNanoTime();
        if (other.hasDeadline()) {
            deadlineNanoTime(Math.min(deadlineNanoTime(), other.deadlineNanoTime()));
        }
        try {
            T t8 = (T) block.invoke();
            kotlin.jvm.internal.r.finallyStart(1);
            timeout(timeoutNanos, timeUnit);
            if (other.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
            return t8;
        } catch (Throwable th2) {
            kotlin.jvm.internal.r.finallyStart(1);
            timeout(timeoutNanos, TimeUnit.NANOSECONDS);
            if (other.hasDeadline()) {
                deadlineNanoTime(deadlineNanoTime);
            }
            kotlin.jvm.internal.r.finallyEnd(1);
            throw th2;
        }
    }

    public void throwIfReached() {
        if (Thread.currentThread().isInterrupted()) {
            throw new InterruptedIOException("interrupted");
        }
        if (this.hasDeadline && this.deadlineNanoTime - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public y0 timeout(long j8, TimeUnit unit) {
        kotlin.jvm.internal.s.checkNotNullParameter(unit, "unit");
        if (!(j8 >= 0)) {
            throw new IllegalArgumentException(kotlin.jvm.internal.s.stringPlus("timeout < 0: ", Long.valueOf(j8)).toString());
        }
        this.timeoutNanos = unit.toNanos(j8);
        return this;
    }

    public long timeoutNanos() {
        return this.timeoutNanos;
    }

    public final void waitUntilNotified(Object monitor) {
        kotlin.jvm.internal.s.checkNotNullParameter(monitor, "monitor");
        try {
            boolean hasDeadline = hasDeadline();
            long timeoutNanos = timeoutNanos();
            long j8 = 0;
            if (!hasDeadline && timeoutNanos == 0) {
                monitor.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (hasDeadline && timeoutNanos != 0) {
                timeoutNanos = Math.min(timeoutNanos, deadlineNanoTime() - nanoTime);
            } else if (hasDeadline) {
                timeoutNanos = deadlineNanoTime() - nanoTime;
            }
            if (timeoutNanos > 0) {
                long j9 = timeoutNanos / 1000000;
                Long.signum(j9);
                monitor.wait(j9, (int) (timeoutNanos - (1000000 * j9)));
                j8 = System.nanoTime() - nanoTime;
            }
            if (j8 >= timeoutNanos) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }

    public long deadlineNanoTime() {
        if (this.hasDeadline) {
            return this.deadlineNanoTime;
        }
        throw new IllegalStateException("No deadline".toString());
    }
}
