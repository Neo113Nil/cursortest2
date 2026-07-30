package com.google.common.util.concurrent;

import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.annotations.VisibleForTesting;
import com.google.common.base.Preconditions;
import com.google.common.base.Stopwatch;
import com.google.common.util.concurrent.SmoothRateLimiter;
import com.google.errorprone.annotations.CanIgnoreReturnValue;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import javax.annotation.CheckForNull;

@Beta
@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
public abstract class RateLimiter {

    @CheckForNull
    private volatile Object mutexDoNotUseDirectly;
    private final SleepingStopwatch stopwatch;

    static abstract class SleepingStopwatch {
        protected SleepingStopwatch() {
        }

        public static SleepingStopwatch createFromSystemTimer() {
            return new SleepingStopwatch() { // from class: com.google.common.util.concurrent.RateLimiter.SleepingStopwatch.1
                final Stopwatch stopwatch = Stopwatch.createStarted();

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected long readMicros() {
                    return this.stopwatch.elapsed(TimeUnit.MICROSECONDS);
                }

                @Override // com.google.common.util.concurrent.RateLimiter.SleepingStopwatch
                protected void sleepMicrosUninterruptibly(long j8) {
                    if (j8 > 0) {
                        Uninterruptibles.sleepUninterruptibly(j8, TimeUnit.MICROSECONDS);
                    }
                }
            };
        }

        protected abstract long readMicros();

        protected abstract void sleepMicrosUninterruptibly(long j8);
    }

    RateLimiter(SleepingStopwatch sleepingStopwatch) {
        this.stopwatch = (SleepingStopwatch) Preconditions.checkNotNull(sleepingStopwatch);
    }

    private boolean canAcquire(long j8, long j9) {
        return queryEarliestAvailable(j8) - j9 <= j8;
    }

    private static void checkPermits(int i8) {
        Preconditions.checkArgument(i8 > 0, "Requested permits (%s) must be positive", i8);
    }

    public static RateLimiter create(double d8) {
        return create(d8, SleepingStopwatch.createFromSystemTimer());
    }

    private Object mutex() {
        Object obj = this.mutexDoNotUseDirectly;
        if (obj == null) {
            synchronized (this) {
                try {
                    obj = this.mutexDoNotUseDirectly;
                    if (obj == null) {
                        obj = new Object();
                        this.mutexDoNotUseDirectly = obj;
                    }
                } finally {
                }
            }
        }
        return obj;
    }

    @CanIgnoreReturnValue
    public double acquire() {
        return acquire(1);
    }

    abstract double doGetRate();

    abstract void doSetRate(double d8, long j8);

    public final double getRate() {
        double doGetRate;
        synchronized (mutex()) {
            doGetRate = doGetRate();
        }
        return doGetRate;
    }

    abstract long queryEarliestAvailable(long j8);

    final long reserve(int i8) {
        long reserveAndGetWaitLength;
        checkPermits(i8);
        synchronized (mutex()) {
            reserveAndGetWaitLength = reserveAndGetWaitLength(i8, this.stopwatch.readMicros());
        }
        return reserveAndGetWaitLength;
    }

    final long reserveAndGetWaitLength(int i8, long j8) {
        return Math.max(reserveEarliestAvailable(i8, j8) - j8, 0L);
    }

    abstract long reserveEarliestAvailable(int i8, long j8);

    public final void setRate(double d8) {
        Preconditions.checkArgument(d8 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON && !Double.isNaN(d8), "rate must be positive");
        synchronized (mutex()) {
            doSetRate(d8, this.stopwatch.readMicros());
        }
    }

    public String toString() {
        return String.format(Locale.ROOT, "RateLimiter[stableRate=%3.1fqps]", Double.valueOf(getRate()));
    }

    public boolean tryAcquire(long j8, TimeUnit timeUnit) {
        return tryAcquire(1, j8, timeUnit);
    }

    @VisibleForTesting
    static RateLimiter create(double d8, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothBursty smoothBursty = new SmoothRateLimiter.SmoothBursty(sleepingStopwatch, 1.0d);
        smoothBursty.setRate(d8);
        return smoothBursty;
    }

    @CanIgnoreReturnValue
    public double acquire(int i8) {
        long reserve = reserve(i8);
        this.stopwatch.sleepMicrosUninterruptibly(reserve);
        return (reserve * 1.0d) / TimeUnit.SECONDS.toMicros(1L);
    }

    public boolean tryAcquire(int i8) {
        return tryAcquire(i8, 0L, TimeUnit.MICROSECONDS);
    }

    public boolean tryAcquire() {
        return tryAcquire(1, 0L, TimeUnit.MICROSECONDS);
    }

    public static RateLimiter create(double d8, long j8, TimeUnit timeUnit) {
        Preconditions.checkArgument(j8 >= 0, "warmupPeriod must not be negative: %s", j8);
        return create(d8, j8, timeUnit, 3.0d, SleepingStopwatch.createFromSystemTimer());
    }

    public boolean tryAcquire(int i8, long j8, TimeUnit timeUnit) {
        long max = Math.max(timeUnit.toMicros(j8), 0L);
        checkPermits(i8);
        synchronized (mutex()) {
            try {
                long readMicros = this.stopwatch.readMicros();
                if (!canAcquire(readMicros, max)) {
                    return false;
                }
                this.stopwatch.sleepMicrosUninterruptibly(reserveAndGetWaitLength(i8, readMicros));
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @VisibleForTesting
    static RateLimiter create(double d8, long j8, TimeUnit timeUnit, double d9, SleepingStopwatch sleepingStopwatch) {
        SmoothRateLimiter.SmoothWarmingUp smoothWarmingUp = new SmoothRateLimiter.SmoothWarmingUp(sleepingStopwatch, j8, timeUnit, d9);
        smoothWarmingUp.setRate(d8);
        return smoothWarmingUp;
    }
}
