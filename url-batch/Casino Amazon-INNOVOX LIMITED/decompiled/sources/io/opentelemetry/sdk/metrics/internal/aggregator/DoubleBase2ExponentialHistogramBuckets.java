package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.internal.PrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.util.Collections;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class DoubleBase2ExponentialHistogramBuckets implements ExponentialHistogramBuckets {
    private Base2ExponentialHistogramIndexer base2ExponentialHistogramIndexer;
    private AdaptingCircularBufferCounter counts;
    private final MemoryMode memoryMode;

    @Nullable
    private AdaptingCircularBufferCounter reusableCounts;
    private int scale;
    private long totalCount;

    DoubleBase2ExponentialHistogramBuckets(int i, int i2, MemoryMode memoryMode) {
        this.memoryMode = memoryMode;
        this.counts = new AdaptingCircularBufferCounter(i2);
        this.scale = i;
        this.base2ExponentialHistogramIndexer = Base2ExponentialHistogramIndexer.get(i);
        this.totalCount = 0L;
    }

    DoubleBase2ExponentialHistogramBuckets(DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets) {
        this.counts = new AdaptingCircularBufferCounter(doubleBase2ExponentialHistogramBuckets.counts);
        this.scale = doubleBase2ExponentialHistogramBuckets.scale;
        this.base2ExponentialHistogramIndexer = doubleBase2ExponentialHistogramBuckets.base2ExponentialHistogramIndexer;
        this.totalCount = doubleBase2ExponentialHistogramBuckets.totalCount;
        this.memoryMode = doubleBase2ExponentialHistogramBuckets.memoryMode;
        this.reusableCounts = doubleBase2ExponentialHistogramBuckets.reusableCounts;
    }

    DoubleBase2ExponentialHistogramBuckets copy() {
        return new DoubleBase2ExponentialHistogramBuckets(this);
    }

    void clear(int i) {
        this.totalCount = 0L;
        this.scale = i;
        this.base2ExponentialHistogramIndexer = Base2ExponentialHistogramIndexer.get(i);
        this.counts.clear();
    }

    boolean record(double d) {
        if (d == 0.0d) {
            throw new IllegalStateException("Illegal attempted recording of zero at bucket level.");
        }
        boolean increment = this.counts.increment(this.base2ExponentialHistogramIndexer.computeIndex(d), 1L);
        if (increment) {
            this.totalCount++;
        }
        return increment;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public int getOffset() {
        if (this.counts.isEmpty()) {
            return 0;
        }
        return this.counts.getIndexStart();
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public List<Long> getBucketCounts() {
        if (this.counts.isEmpty()) {
            return Collections.emptyList();
        }
        int indexEnd = (this.counts.getIndexEnd() - this.counts.getIndexStart()) + 1;
        long[] jArr = new long[indexEnd];
        for (int i = 0; i < indexEnd; i++) {
            AdaptingCircularBufferCounter adaptingCircularBufferCounter = this.counts;
            jArr[i] = adaptingCircularBufferCounter.get(adaptingCircularBufferCounter.getIndexStart() + i);
        }
        return PrimitiveLongList.wrap(jArr);
    }

    void getBucketCountsIntoReusableList(DynamicPrimitiveLongList dynamicPrimitiveLongList) {
        if (this.counts.isEmpty()) {
            dynamicPrimitiveLongList.resizeAndClear(0);
            return;
        }
        int indexEnd = (this.counts.getIndexEnd() - this.counts.getIndexStart()) + 1;
        if (dynamicPrimitiveLongList.size() != indexEnd) {
            dynamicPrimitiveLongList.resizeAndClear(indexEnd);
        }
        for (int i = 0; i < indexEnd; i++) {
            AdaptingCircularBufferCounter adaptingCircularBufferCounter = this.counts;
            dynamicPrimitiveLongList.setLong(i, adaptingCircularBufferCounter.get(adaptingCircularBufferCounter.getIndexStart() + i));
        }
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public long getTotalCount() {
        return this.totalCount;
    }

    void downscale(int i) {
        AdaptingCircularBufferCounter adaptingCircularBufferCounter;
        if (i == 0) {
            return;
        }
        if (i < 0) {
            throw new IllegalStateException("Cannot downscale by negative amount. Was given " + i + ".");
        }
        if (!this.counts.isEmpty()) {
            if (this.memoryMode == MemoryMode.IMMUTABLE_DATA) {
                adaptingCircularBufferCounter = new AdaptingCircularBufferCounter(this.counts);
            } else {
                if (this.reusableCounts == null) {
                    this.reusableCounts = new AdaptingCircularBufferCounter(this.counts);
                }
                adaptingCircularBufferCounter = this.reusableCounts;
            }
            adaptingCircularBufferCounter.clear();
            for (int indexStart = this.counts.getIndexStart(); indexStart <= this.counts.getIndexEnd(); indexStart++) {
                long j = this.counts.get(indexStart);
                if (j > 0 && !adaptingCircularBufferCounter.increment(indexStart >> i, j)) {
                    throw new IllegalStateException("Failed to create new downscaled buckets.");
                }
            }
            if (this.memoryMode == MemoryMode.REUSABLE_DATA) {
                AdaptingCircularBufferCounter adaptingCircularBufferCounter2 = this.counts;
                this.counts = adaptingCircularBufferCounter;
                this.reusableCounts = adaptingCircularBufferCounter2;
            } else {
                this.counts = adaptingCircularBufferCounter;
            }
        }
        int i2 = this.scale - i;
        this.scale = i2;
        this.base2ExponentialHistogramIndexer = Base2ExponentialHistogramIndexer.get(i2);
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public int getScale() {
        return this.scale;
    }

    int getScaleReduction(double d) {
        long computeIndex = this.base2ExponentialHistogramIndexer.computeIndex(d);
        return getScaleReduction(Math.min(computeIndex, this.counts.getIndexStart()), Math.max(computeIndex, this.counts.getIndexEnd()));
    }

    int getScaleReduction(long j, long j2) {
        int i = 0;
        while ((j2 - j) + 1 > this.counts.getMaxSize()) {
            j >>= 1;
            j2 >>= 1;
            i++;
        }
        return i;
    }

    public boolean equals(@Nullable Object obj) {
        if (!(obj instanceof DoubleBase2ExponentialHistogramBuckets)) {
            return false;
        }
        DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets = (DoubleBase2ExponentialHistogramBuckets) obj;
        return this.scale == doubleBase2ExponentialHistogramBuckets.scale && sameBucketCounts(doubleBase2ExponentialHistogramBuckets);
    }

    private boolean sameBucketCounts(DoubleBase2ExponentialHistogramBuckets doubleBase2ExponentialHistogramBuckets) {
        if (this.totalCount != doubleBase2ExponentialHistogramBuckets.totalCount) {
            return false;
        }
        int min = Math.min(this.counts.getIndexStart(), doubleBase2ExponentialHistogramBuckets.counts.getIndexStart());
        if (min == Integer.MIN_VALUE) {
            min = Math.max(this.counts.getIndexStart(), doubleBase2ExponentialHistogramBuckets.counts.getIndexStart());
        }
        int max = Math.max(this.counts.getIndexEnd(), doubleBase2ExponentialHistogramBuckets.counts.getIndexEnd());
        while (min <= max) {
            if (this.counts.get(min) != doubleBase2ExponentialHistogramBuckets.counts.get(min)) {
                return false;
            }
            min++;
        }
        return true;
    }

    public int hashCode() {
        int i = 1000003;
        for (int indexStart = this.counts.getIndexStart(); indexStart <= this.counts.getIndexEnd(); indexStart++) {
            long j = this.counts.get(indexStart);
            if (j != 0) {
                i = ((int) (((i ^ indexStart) * 1000003) ^ j)) * 1000003;
            }
        }
        return this.scale ^ i;
    }

    public String toString() {
        return "DoubleExponentialHistogramBuckets{scale: " + this.scale + ", offset: " + getOffset() + ", counts: " + this.counts + " }";
    }
}
