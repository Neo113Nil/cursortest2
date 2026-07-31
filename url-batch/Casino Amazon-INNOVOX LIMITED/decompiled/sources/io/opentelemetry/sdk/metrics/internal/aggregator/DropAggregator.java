package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/* loaded from: classes3.dex */
public final class DropAggregator implements Aggregator<PointData, DoubleExemplarData> {
    private static final PointData POINT_DATA = new PointData() { // from class: io.opentelemetry.sdk.metrics.internal.aggregator.DropAggregator.1
        @Override // io.opentelemetry.sdk.metrics.data.PointData
        public long getEpochNanos() {
            return 0L;
        }

        @Override // io.opentelemetry.sdk.metrics.data.PointData
        public long getStartEpochNanos() {
            return 0L;
        }

        @Override // io.opentelemetry.sdk.metrics.data.PointData
        public Attributes getAttributes() {
            return Attributes.empty();
        }

        @Override // io.opentelemetry.sdk.metrics.data.PointData
        public List<? extends ExemplarData> getExemplars() {
            return Collections.emptyList();
        }
    };
    public static final Aggregator<PointData, DoubleExemplarData> INSTANCE = new DropAggregator();
    private static final AggregatorHandle<PointData, DoubleExemplarData> HANDLE = new AggregatorHandle<PointData, DoubleExemplarData>(ExemplarReservoir.doubleNoSamples()) { // from class: io.opentelemetry.sdk.metrics.internal.aggregator.DropAggregator.2
        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected void doRecordDouble(double d) {
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected void doRecordLong(long j) {
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected PointData doAggregateThenMaybeReset(long j, long j2, Attributes attributes, List<DoubleExemplarData> list, boolean z) {
            return DropAggregator.POINT_DATA;
        }
    };

    private DropAggregator() {
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public AggregatorHandle<PointData, DoubleExemplarData> createHandle() {
        return HANDLE;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public MetricData toMetricData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, MetricDescriptor metricDescriptor, Collection<PointData> collection, AggregationTemporality aggregationTemporality) {
        return EmptyMetricData.getInstance();
    }
}
