package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.internal.data.ImmutableHistogramData;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface HistogramData extends Data<HistogramPointData> {
    AggregationTemporality getAggregationTemporality();

    @Override // io.opentelemetry.sdk.metrics.data.Data
    Collection<HistogramPointData> getPoints();

    static HistogramData create(AggregationTemporality aggregationTemporality, Collection<HistogramPointData> collection) {
        return ImmutableHistogramData.create(aggregationTemporality, collection);
    }
}
