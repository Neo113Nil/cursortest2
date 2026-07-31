package io.opentelemetry.sdk.metrics.internal.data;

import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramData;
import io.opentelemetry.sdk.metrics.data.ExponentialHistogramPointData;
import java.util.Collection;
import java.util.Collections;

/* loaded from: classes3.dex */
public abstract class ImmutableExponentialHistogramData implements ExponentialHistogramData {
    private static final ExponentialHistogramData EMPTY = create(AggregationTemporality.CUMULATIVE, Collections.emptyList());

    public static ExponentialHistogramData empty() {
        return EMPTY;
    }

    public static ExponentialHistogramData create(AggregationTemporality aggregationTemporality, Collection<ExponentialHistogramPointData> collection) {
        return new AutoValue_ImmutableExponentialHistogramData(aggregationTemporality, collection);
    }

    ImmutableExponentialHistogramData() {
    }
}
