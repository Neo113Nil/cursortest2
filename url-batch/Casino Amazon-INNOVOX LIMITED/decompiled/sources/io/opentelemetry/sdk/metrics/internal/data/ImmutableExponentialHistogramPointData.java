package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramBuckets;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramPointData;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class ImmutableExponentialHistogramPointData implements ExponentialHistogramPointData {
    ImmutableExponentialHistogramPointData() {
    }

    public static ExponentialHistogramPointData create(int i, double d, long j, boolean z, double d2, boolean z2, double d3, ExponentialHistogramBuckets exponentialHistogramBuckets, ExponentialHistogramBuckets exponentialHistogramBuckets2, long j2, long j3, Attributes attributes, List<DoubleExemplarData> list) {
        return new AutoValue_ImmutableExponentialHistogramPointData(j2, j3, attributes, i, d, j + exponentialHistogramBuckets.getTotalCount() + exponentialHistogramBuckets2.getTotalCount(), j, z, d2, z2, d3, exponentialHistogramBuckets, exponentialHistogramBuckets2, list);
    }
}
