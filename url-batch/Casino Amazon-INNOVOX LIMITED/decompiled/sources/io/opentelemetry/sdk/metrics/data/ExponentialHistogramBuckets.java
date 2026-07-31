package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableExponentialHistogramBuckets;
import java.util.List;

/* loaded from: classes3.dex */
public interface ExponentialHistogramBuckets {
    List<Long> getBucketCounts();

    int getOffset();

    int getScale();

    long getTotalCount();

    static ExponentialHistogramBuckets create(int i, int i2, List<Long> list) {
        return ImmutableExponentialHistogramBuckets.create(i, i2, list);
    }
}
