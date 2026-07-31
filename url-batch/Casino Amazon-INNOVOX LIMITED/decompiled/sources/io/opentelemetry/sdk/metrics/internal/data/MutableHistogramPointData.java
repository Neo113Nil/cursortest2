package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.HistogramPointData;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class MutableHistogramPointData implements HistogramPointData {
    private long count;
    private final DynamicPrimitiveLongList counts;
    private long epochNanos;
    private boolean hasMax;
    private boolean hasMin;
    private double max;
    private double min;
    private long startEpochNanos;
    private double sum;
    private Attributes attributes = Attributes.empty();
    private List<Double> boundaries = Collections.emptyList();
    private List<DoubleExemplarData> exemplars = Collections.emptyList();

    public MutableHistogramPointData(int i) {
        DynamicPrimitiveLongList ofSubArrayCapacity = DynamicPrimitiveLongList.ofSubArrayCapacity(i);
        this.counts = ofSubArrayCapacity;
        ofSubArrayCapacity.resizeAndClear(i);
    }

    public MutableHistogramPointData set(long j, long j2, Attributes attributes, double d, boolean z, double d2, boolean z2, double d3, List<Double> list, long[] jArr, List<DoubleExemplarData> list2) {
        if (this.counts.size() != list.size() + 1) {
            throw new IllegalArgumentException("invalid boundaries: size should be " + (this.counts.size() - 1) + " but was " + list.size());
        }
        if (this.counts.size() != jArr.length) {
            throw new IllegalArgumentException("invalid counts: size should be " + this.counts.size() + " but was " + jArr.length);
        }
        HistogramPointDataValidations.validateIsStrictlyIncreasing(list);
        HistogramPointDataValidations.validateFiniteBoundaries(list);
        long j3 = 0;
        for (long j4 : jArr) {
            j3 += j4;
        }
        this.startEpochNanos = j;
        this.epochNanos = j2;
        this.attributes = attributes;
        this.sum = d;
        this.count = j3;
        this.hasMin = z;
        this.min = d2;
        this.hasMax = z2;
        this.max = d3;
        this.boundaries = list;
        for (int i = 0; i < jArr.length; i++) {
            this.counts.setLong(i, jArr[i]);
        }
        this.exemplars = list2;
        return this;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public long getStartEpochNanos() {
        return this.startEpochNanos;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public long getEpochNanos() {
        return this.epochNanos;
    }

    @Override // io.opentelemetry.sdk.metrics.data.PointData
    public Attributes getAttributes() {
        return this.attributes;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public double getSum() {
        return this.sum;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public long getCount() {
        return this.count;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public boolean hasMin() {
        return this.hasMin;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public double getMin() {
        return this.min;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public boolean hasMax() {
        return this.hasMax;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public double getMax() {
        return this.max;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public List<Double> getBoundaries() {
        return this.boundaries;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData
    public List<Long> getCounts() {
        return this.counts;
    }

    @Override // io.opentelemetry.sdk.metrics.data.HistogramPointData, io.opentelemetry.sdk.metrics.data.PointData
    public List<DoubleExemplarData> getExemplars() {
        return this.exemplars;
    }

    public String toString() {
        return "MutableHistogramPointData{startEpochNanos=" + this.startEpochNanos + ", epochNanos=" + this.epochNanos + ", attributes=" + this.attributes + ", sum=" + this.sum + ", count=" + this.count + ", hasMin=" + this.hasMin + ", min=" + this.min + ", hasMax=" + this.hasMax + ", max=" + this.max + ", boundaries=" + this.boundaries + ", counts=" + this.counts + ", exemplars=" + this.exemplars + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof HistogramPointData) {
            HistogramPointData histogramPointData = (HistogramPointData) obj;
            if (this.startEpochNanos == histogramPointData.getStartEpochNanos() && this.epochNanos == histogramPointData.getEpochNanos() && this.attributes.equals(histogramPointData.getAttributes()) && Double.doubleToLongBits(this.sum) == Double.doubleToLongBits(histogramPointData.getSum()) && this.count == histogramPointData.getCount() && this.hasMin == histogramPointData.hasMin() && Double.doubleToLongBits(this.min) == Double.doubleToLongBits(histogramPointData.getMin()) && this.hasMax == histogramPointData.hasMax() && Double.doubleToLongBits(this.max) == Double.doubleToLongBits(histogramPointData.getMax()) && this.boundaries.equals(histogramPointData.getBoundaries()) && this.counts.equals(histogramPointData.getCounts()) && this.exemplars.equals(histogramPointData.getExemplars())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long j = this.startEpochNanos;
        long j2 = this.epochNanos;
        int hashCode = (((((((((int) (j ^ (j >>> 32))) ^ 1000003) * 1000003) ^ ((int) (j2 ^ (j2 >>> 32)))) * 1000003) ^ this.attributes.hashCode()) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.sum) >>> 32) ^ Double.doubleToLongBits(this.sum)))) * 1000003;
        long j3 = this.count;
        return ((((((((((((((hashCode ^ ((int) (j3 ^ (j3 >>> 32)))) * 1000003) ^ (this.hasMin ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.min) >>> 32) ^ Double.doubleToLongBits(this.min)))) * 1000003) ^ (this.hasMax ? 1231 : 1237)) * 1000003) ^ ((int) ((Double.doubleToLongBits(this.max) >>> 32) ^ Double.doubleToLongBits(this.max)))) * 1000003) ^ this.boundaries.hashCode()) * 1000003) ^ this.counts.hashCode()) * 1000003) ^ this.exemplars.hashCode();
    }
}
