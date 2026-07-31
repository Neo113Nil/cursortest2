package io.opentelemetry.sdk.metrics.data;

import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableSumData;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface SumData<T extends PointData> extends Data<T> {
    AggregationTemporality getAggregationTemporality();

    boolean isMonotonic();

    static SumData<LongPointData> createLongSumData(boolean z, AggregationTemporality aggregationTemporality, Collection<LongPointData> collection) {
        return ImmutableSumData.create(z, aggregationTemporality, collection);
    }

    static SumData<DoublePointData> createDoubleSumData(boolean z, AggregationTemporality aggregationTemporality, Collection<DoublePointData> collection) {
        return ImmutableSumData.create(z, aggregationTemporality, collection);
    }
}
