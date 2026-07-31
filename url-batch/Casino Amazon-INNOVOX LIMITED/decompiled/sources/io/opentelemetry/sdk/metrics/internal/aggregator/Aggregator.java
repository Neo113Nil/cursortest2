package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;

/* loaded from: classes3.dex */
public interface Aggregator<T extends PointData, U extends ExemplarData> {
    AggregatorHandle<T, U> createHandle();

    MetricData toMetricData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, MetricDescriptor metricDescriptor, Collection<T> collection, AggregationTemporality aggregationTemporality);

    static Aggregator<?, DoubleExemplarData> drop() {
        return DropAggregator.INSTANCE;
    }

    default T diff(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support diff.");
    }

    default void diffInPlace(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support diffInPlace.");
    }

    default T createReusablePoint() {
        throw new UnsupportedOperationException("This aggregator does not support createReusablePoint.");
    }

    default void copyPoint(T t, T t2) {
        throw new UnsupportedOperationException("This aggregator does not support toPoint.");
    }
}
