package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.concurrent.AdderUtil;
import io.opentelemetry.sdk.metrics.internal.concurrent.LongAdder;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableLongPointData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableMetricData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableSumData;
import io.opentelemetry.sdk.metrics.internal.data.MutableLongPointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;
import java.util.List;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class LongSumAggregator extends AbstractSumAggregator<LongPointData, LongExemplarData> {
    private final MemoryMode memoryMode;
    private final Supplier<ExemplarReservoir<LongExemplarData>> reservoirSupplier;

    public LongSumAggregator(InstrumentDescriptor instrumentDescriptor, Supplier<ExemplarReservoir<LongExemplarData>> supplier, MemoryMode memoryMode) {
        super(instrumentDescriptor);
        this.reservoirSupplier = supplier;
        this.memoryMode = memoryMode;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public AggregatorHandle<LongPointData, LongExemplarData> createHandle() {
        return new Handle(this.reservoirSupplier.get(), this.memoryMode);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public LongPointData diff(LongPointData longPointData, LongPointData longPointData2) {
        return ImmutableLongPointData.create(longPointData2.getStartEpochNanos(), longPointData2.getEpochNanos(), longPointData2.getAttributes(), longPointData2.getValue() - longPointData.getValue(), longPointData2.getExemplars());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public void diffInPlace(LongPointData longPointData, LongPointData longPointData2) {
        ((MutableLongPointData) longPointData).set(longPointData2.getStartEpochNanos(), longPointData2.getEpochNanos(), longPointData2.getAttributes(), longPointData2.getValue() - longPointData.getValue(), longPointData2.getExemplars());
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public LongPointData createReusablePoint() {
        return new MutableLongPointData();
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public void copyPoint(LongPointData longPointData, LongPointData longPointData2) {
        ((MutableLongPointData) longPointData2).set(longPointData);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public MetricData toMetricData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, MetricDescriptor metricDescriptor, Collection<LongPointData> collection, AggregationTemporality aggregationTemporality) {
        return ImmutableMetricData.createLongSum(resource, instrumentationScopeInfo, metricDescriptor.getName(), metricDescriptor.getDescription(), metricDescriptor.getSourceInstrument().getUnit(), ImmutableSumData.create(isMonotonic(), aggregationTemporality, collection));
    }

    static final class Handle extends AggregatorHandle<LongPointData, LongExemplarData> {
        private final LongAdder current;

        @Nullable
        private final MutableLongPointData reusablePointData;

        Handle(ExemplarReservoir<LongExemplarData> exemplarReservoir, MemoryMode memoryMode) {
            super(exemplarReservoir);
            this.current = AdderUtil.createLongAdder();
            this.reusablePointData = memoryMode == MemoryMode.REUSABLE_DATA ? new MutableLongPointData() : null;
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public LongPointData doAggregateThenMaybeReset(long j, long j2, Attributes attributes, List<LongExemplarData> list, boolean z) {
            LongAdder longAdder = this.current;
            long sumThenReset = z ? longAdder.sumThenReset() : longAdder.sum();
            MutableLongPointData mutableLongPointData = this.reusablePointData;
            if (mutableLongPointData != null) {
                mutableLongPointData.set(j, j2, attributes, sumThenReset, list);
                return this.reusablePointData;
            }
            return ImmutableLongPointData.create(j, j2, attributes, sumThenReset, list);
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public void doRecordLong(long j) {
            this.current.add(j);
        }
    }
}
