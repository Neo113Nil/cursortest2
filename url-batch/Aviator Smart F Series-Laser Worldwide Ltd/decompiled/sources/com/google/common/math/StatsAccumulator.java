package com.google.common.math;

import com.github.mikephil.charting.utils.i;
import com.google.common.annotations.Beta;
import com.google.common.annotations.GwtIncompatible;
import com.google.common.base.Preconditions;
import com.google.common.primitives.Doubles;
import java.util.Iterator;

@ElementTypesAreNonnullByDefault
@Beta
@GwtIncompatible
/* loaded from: classes4.dex */
public final class StatsAccumulator {
    private long count = 0;
    private double mean = i.DOUBLE_EPSILON;
    private double sumOfSquaresOfDeltas = i.DOUBLE_EPSILON;
    private double min = Double.NaN;
    private double max = Double.NaN;

    static double calculateNewMeanNonFinite(double d8, double d9) {
        if (Doubles.isFinite(d8)) {
            return d9;
        }
        if (Doubles.isFinite(d9) || d8 == d9) {
            return d8;
        }
        return Double.NaN;
    }

    private void merge(long j8, double d8, double d9, double d10, double d11) {
        long j9 = this.count;
        if (j9 == 0) {
            this.count = j8;
            this.mean = d8;
            this.sumOfSquaresOfDeltas = d9;
            this.min = d10;
            this.max = d11;
            return;
        }
        this.count = j9 + j8;
        if (Doubles.isFinite(this.mean) && Doubles.isFinite(d8)) {
            double d12 = this.mean;
            double d13 = d8 - d12;
            double d14 = j8;
            double d15 = d12 + ((d13 * d14) / this.count);
            this.mean = d15;
            this.sumOfSquaresOfDeltas += d9 + (d13 * (d8 - d15) * d14);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d8);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d10);
        this.max = Math.max(this.max, d11);
    }

    public void add(double d8) {
        long j8 = this.count;
        if (j8 == 0) {
            this.count = 1L;
            this.mean = d8;
            this.min = d8;
            this.max = d8;
            if (Doubles.isFinite(d8)) {
                return;
            }
            this.sumOfSquaresOfDeltas = Double.NaN;
            return;
        }
        this.count = j8 + 1;
        if (Doubles.isFinite(d8) && Doubles.isFinite(this.mean)) {
            double d9 = this.mean;
            double d10 = d8 - d9;
            double d11 = d9 + (d10 / this.count);
            this.mean = d11;
            this.sumOfSquaresOfDeltas += d10 * (d8 - d11);
        } else {
            this.mean = calculateNewMeanNonFinite(this.mean, d8);
            this.sumOfSquaresOfDeltas = Double.NaN;
        }
        this.min = Math.min(this.min, d8);
        this.max = Math.max(this.max, d8);
    }

    public void addAll(Iterable<? extends Number> iterable) {
        Iterator<? extends Number> it = iterable.iterator();
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public long count() {
        return this.count;
    }

    public double max() {
        Preconditions.checkState(this.count != 0);
        return this.max;
    }

    public double mean() {
        Preconditions.checkState(this.count != 0);
        return this.mean;
    }

    public double min() {
        Preconditions.checkState(this.count != 0);
        return this.min;
    }

    public final double populationStandardDeviation() {
        return Math.sqrt(populationVariance());
    }

    public final double populationVariance() {
        Preconditions.checkState(this.count != 0);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return this.count == 1 ? i.DOUBLE_EPSILON : DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / this.count;
    }

    public final double sampleStandardDeviation() {
        return Math.sqrt(sampleVariance());
    }

    public final double sampleVariance() {
        Preconditions.checkState(this.count > 1);
        if (Double.isNaN(this.sumOfSquaresOfDeltas)) {
            return Double.NaN;
        }
        return DoubleUtils.ensureNonNegative(this.sumOfSquaresOfDeltas) / (this.count - 1);
    }

    public Stats snapshot() {
        return new Stats(this.count, this.mean, this.sumOfSquaresOfDeltas, this.min, this.max);
    }

    public final double sum() {
        return this.mean * this.count;
    }

    double sumOfSquaresOfDeltas() {
        return this.sumOfSquaresOfDeltas;
    }

    public void addAll(Iterator<? extends Number> it) {
        while (it.hasNext()) {
            add(it.next().doubleValue());
        }
    }

    public void addAll(double... dArr) {
        for (double d8 : dArr) {
            add(d8);
        }
    }

    public void addAll(int... iArr) {
        for (int i8 : iArr) {
            add(i8);
        }
    }

    public void addAll(long... jArr) {
        for (long j8 : jArr) {
            add(j8);
        }
    }

    public void addAll(Stats stats) {
        if (stats.count() == 0) {
            return;
        }
        merge(stats.count(), stats.mean(), stats.sumOfSquaresOfDeltas(), stats.min(), stats.max());
    }

    public void addAll(StatsAccumulator statsAccumulator) {
        if (statsAccumulator.count() == 0) {
            return;
        }
        merge(statsAccumulator.count(), statsAccumulator.mean(), statsAccumulator.sumOfSquaresOfDeltas(), statsAccumulator.min(), statsAccumulator.max());
    }
}
