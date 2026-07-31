package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import io.opentelemetry.sdk.metrics.data.LongPointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableGaugeData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableLongPointData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableMetricData;
import io.opentelemetry.sdk.metrics.internal.data.MutableLongPointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class LongLastValueAggregator implements Aggregator<LongPointData, LongExemplarData> {
    private final MemoryMode memoryMode;
    private final Supplier<ExemplarReservoir<LongExemplarData>> reservoirSupplier;

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public LongPointData diff(LongPointData longPointData, LongPointData longPointData2) {
        return longPointData2;
    }

    public LongLastValueAggregator(Supplier<ExemplarReservoir<LongExemplarData>> supplier, MemoryMode memoryMode) {
        this.reservoirSupplier = supplier;
        this.memoryMode = memoryMode;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public AggregatorHandle<LongPointData, LongExemplarData> createHandle() {
        return new Handle(this.reservoirSupplier.get(), this.memoryMode);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public void diffInPlace(LongPointData longPointData, LongPointData longPointData2) {
        ((MutableLongPointData) longPointData).set(longPointData2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
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
        return ImmutableMetricData.createLongGauge(resource, instrumentationScopeInfo, metricDescriptor.getName(), metricDescriptor.getDescription(), metricDescriptor.getSourceInstrument().getUnit(), ImmutableGaugeData.create(collection));
    }

    static final class Handle extends AggregatorHandle<LongPointData, LongExemplarData> {

        @Nullable
        private static final Long DEFAULT_VALUE = null;
        private final AtomicReference<Long> current;

        @Nullable
        private final MutableLongPointData reusablePoint;

        Handle(ExemplarReservoir<LongExemplarData> exemplarReservoir, MemoryMode memoryMode) {
            super(exemplarReservoir);
            this.current = new AtomicReference<>(DEFAULT_VALUE);
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                this.reusablePoint = new MutableLongPointData();
            } else {
                this.reusablePoint = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public LongPointData doAggregateThenMaybeReset(long j, long j2, Attributes attributes, List<LongExemplarData> list, boolean z) {
            AtomicReference<Long> atomicReference = this.current;
            Long andSet = z ? atomicReference.getAndSet(DEFAULT_VALUE) : atomicReference.get();
            MutableLongPointData mutableLongPointData = this.reusablePoint;
            if (mutableLongPointData != null) {
                mutableLongPointData.set(j, j2, attributes, ((Long) Objects.requireNonNull(andSet)).longValue(), list);
                return this.reusablePoint;
            }
            return ImmutableLongPointData.create(j, j2, attributes, ((Long) Objects.requireNonNull(andSet)).longValue(), list);
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected void doRecordLong(long j) {
            this.current.set(Long.valueOf(j));
        }
    }
}
