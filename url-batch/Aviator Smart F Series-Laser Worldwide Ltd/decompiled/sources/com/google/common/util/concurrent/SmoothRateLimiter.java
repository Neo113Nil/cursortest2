package com.google.common.util.concurrent;

import com.google.common.annotations.GwtIncompatible;
import com.google.common.math.LongMath;
import com.google.common.util.concurrent.RateLimiter;
import java.util.concurrent.TimeUnit;

@ElementTypesAreNonnullByDefault
@GwtIncompatible
/* loaded from: classes4.dex */
abstract class SmoothRateLimiter extends RateLimiter {
    double maxPermits;
    private long nextFreeTicketMicros;
    double stableIntervalMicros;
    double storedPermits;

    static final class SmoothBursty extends SmoothRateLimiter {
        final double maxBurstSeconds;

        SmoothBursty(RateLimiter.SleepingStopwatch sleepingStopwatch, double d8) {
            super(sleepingStopwatch);
            this.maxBurstSeconds = d8;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
            return this.stableIntervalMicros;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double d8, double d9) {
            double d10 = this.maxPermits;
            double d11 = this.maxBurstSeconds * d8;
            this.maxPermits = d11;
            if (d10 == Double.POSITIVE_INFINITY) {
                this.storedPermits = d11;
                return;
            }
            double d12 = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
            if (d10 != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                d12 = (this.storedPermits * d11) / d10;
            }
            this.storedPermits = d12;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double d8, double d9) {
            return 0L;
        }
    }

    static final class SmoothWarmingUp extends SmoothRateLimiter {
        private double coldFactor;
        private double slope;
        private double thresholdPermits;
        private final long warmupPeriodMicros;

        SmoothWarmingUp(RateLimiter.SleepingStopwatch sleepingStopwatch, long j8, TimeUnit timeUnit, double d8) {
            super(sleepingStopwatch);
            this.warmupPeriodMicros = timeUnit.toMicros(j8);
            this.coldFactor = d8;
        }

        private double permitsToTime(double d8) {
            return this.stableIntervalMicros + (d8 * this.slope);
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        double coolDownIntervalMicros() {
            return this.warmupPeriodMicros / this.maxPermits;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        void doSetRate(double d8, double d9) {
            double d10 = this.maxPermits;
            double d11 = this.coldFactor * d9;
            long j8 = this.warmupPeriodMicros;
            double d12 = (j8 * 0.5d) / d9;
            this.thresholdPermits = d12;
            double d13 = ((j8 * 2.0d) / (d9 + d11)) + d12;
            this.maxPermits = d13;
            this.slope = (d11 - d9) / (d13 - d12);
            if (d10 == Double.POSITIVE_INFINITY) {
                this.storedPermits = com.github.mikephil.charting.utils.i.DOUBLE_EPSILON;
                return;
            }
            if (d10 != com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                d13 = (this.storedPermits * d13) / d10;
            }
            this.storedPermits = d13;
        }

        @Override // com.google.common.util.concurrent.SmoothRateLimiter
        long storedPermitsToWaitTime(double d8, double d9) {
            long j8;
            double d10 = d8 - this.thresholdPermits;
            if (d10 > com.github.mikephil.charting.utils.i.DOUBLE_EPSILON) {
                double min = Math.min(d10, d9);
                j8 = (long) (((permitsToTime(d10) + permitsToTime(d10 - min)) * min) / 2.0d);
                d9 -= min;
            } else {
                j8 = 0;
            }
            return j8 + ((long) (this.stableIntervalMicros * d9));
        }
    }

    abstract double coolDownIntervalMicros();

    @Override // com.google.common.util.concurrent.RateLimiter
    final double doGetRate() {
        return TimeUnit.SECONDS.toMicros(1L) / this.stableIntervalMicros;
    }

    abstract void doSetRate(double d8, double d9);

    @Override // com.google.common.util.concurrent.RateLimiter
    final void doSetRate(double d8, long j8) {
        resync(j8);
        double micros = TimeUnit.SECONDS.toMicros(1L) / d8;
        this.stableIntervalMicros = micros;
        doSetRate(d8, micros);
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long queryEarliestAvailable(long j8) {
        return this.nextFreeTicketMicros;
    }

    @Override // com.google.common.util.concurrent.RateLimiter
    final long reserveEarliestAvailable(int i8, long j8) {
        resync(j8);
        long j9 = this.nextFreeTicketMicros;
        double d8 = i8;
        double min = Math.min(d8, this.storedPermits);
        this.nextFreeTicketMicros = LongMath.saturatedAdd(this.nextFreeTicketMicros, storedPermitsToWaitTime(this.storedPermits, min) + ((long) ((d8 - min) * this.stableIntervalMicros)));
        this.storedPermits -= min;
        return j9;
    }

    void resync(long j8) {
        if (j8 > this.nextFreeTicketMicros) {
            this.storedPermits = Math.min(this.maxPermits, this.storedPermits + ((j8 - r0) / coolDownIntervalMicros()));
            this.nextFreeTicketMicros = j8;
        }
    }

    abstract long storedPermitsToWaitTime(double d8, double d9);

    private SmoothRateLimiter(RateLimiter.SleepingStopwatch sleepingStopwatch) {
        super(sleepingStopwatch);
        this.nextFreeTicketMicros = 0L;
    }
}
