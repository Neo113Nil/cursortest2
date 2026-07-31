package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableExponentialHistogramData;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface ExponentialHistogramData extends Data<ExponentialHistogramPointData> {
    AggregationTemporality getAggregationTemporality();

    @Override // io.opentelemetry.sdk.metrics.data.Data
    Collection<ExponentialHistogramPointData> getPoints();

    static ExponentialHistogramData create(AggregationTemporality aggregationTemporality, Collection<ExponentialHistogramPointData> collection) {
        return ImmutableExponentialHistogramData.create(aggregationTemporality, collection);
    }
}
