package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.sdk.internal.DynamicPrimitiveLongList;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import java.util.List;
import java.util.Objects;

/* loaded from: classes3.dex */
public final class MutableExponentialHistogramBuckets implements ExponentialHistogramBuckets {
    private DynamicPrimitiveLongList bucketCounts = DynamicPrimitiveLongList.empty();
    private int offset;
    private int scale;
    private long totalCount;

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public int getScale() {
        return this.scale;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public int getOffset() {
        return this.offset;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public List<Long> getBucketCounts() {
        return this.bucketCounts;
    }

    public DynamicPrimitiveLongList getReusableBucketCountsList() {
        return this.bucketCounts;
    }

    @Override // io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets
    public long getTotalCount() {
        return this.totalCount;
    }

    public MutableExponentialHistogramBuckets set(int i, int i2, long j, DynamicPrimitiveLongList dynamicPrimitiveLongList) {
        this.scale = i;
        this.offset = i2;
        this.totalCount = j;
        this.bucketCounts = dynamicPrimitiveLongList;
        return this;
    }

    public String toString() {
        return "MutableExponentialHistogramBuckets{scale=" + this.scale + ", offset=" + this.offset + ", bucketCounts=" + this.bucketCounts + ", totalCount=" + this.totalCount + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof ExponentialHistogramBuckets) {
            ExponentialHistogramBuckets exponentialHistogramBuckets = (ExponentialHistogramBuckets) obj;
            if (this.scale == exponentialHistogramBuckets.getScale() && this.offset == exponentialHistogramBuckets.getOffset() && this.totalCount == exponentialHistogramBuckets.getTotalCount() && Objects.equals(this.bucketCounts, exponentialHistogramBuckets.getBucketCounts())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        int i = ((this.scale * 31) + this.offset) * 31;
        long j = this.totalCount;
        int i2 = (i + ((int) (j ^ (j >>> 32)))) * 31;
        DynamicPrimitiveLongList dynamicPrimitiveLongList = this.bucketCounts;
        return i2 + (dynamicPrimitiveLongList != null ? dynamicPrimitiveLongList.hashCode() : 0);
    }
}
