package io.opentelemetry.sdk.metrics.internal.aggregator;

import androidx.compose.runtime.CompositionImpl$$ExternalSyntheticBackportWithForwarding0;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.data.AggregationTemporality;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.DoublePointData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableDoublePointData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableGaugeData;
import io.opentelemetry.sdk.metrics.internal.data.ImmutableMetricData;
import io.opentelemetry.sdk.metrics.internal.data.MutableDoublePointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.MetricDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarReservoir;
import io.opentelemetry.sdk.resources.Resource;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public final class DoubleLastValueAggregator implements Aggregator<DoublePointData, DoubleExemplarData> {
    private final MemoryMode memoryMode;
    private final Supplier<ExemplarReservoir<DoubleExemplarData>> reservoirSupplier;

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public DoublePointData diff(DoublePointData doublePointData, DoublePointData doublePointData2) {
        return doublePointData2;
    }

    public DoubleLastValueAggregator(Supplier<ExemplarReservoir<DoubleExemplarData>> supplier, MemoryMode memoryMode) {
        this.reservoirSupplier = supplier;
        this.memoryMode = memoryMode;
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public AggregatorHandle<DoublePointData, DoubleExemplarData> createHandle() {
        return new Handle(this.reservoirSupplier.get(), this.memoryMode);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public void diffInPlace(DoublePointData doublePointData, DoublePointData doublePointData2) {
        ((MutableDoublePointData) doublePointData).set(doublePointData2);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public DoublePointData createReusablePoint() {
        return new MutableDoublePointData();
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public void copyPoint(DoublePointData doublePointData, DoublePointData doublePointData2) {
        ((MutableDoublePointData) doublePointData2).set(doublePointData);
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator
    public MetricData toMetricData(Resource resource, InstrumentationScopeInfo instrumentationScopeInfo, MetricDescriptor metricDescriptor, Collection<DoublePointData> collection, AggregationTemporality aggregationTemporality) {
        return ImmutableMetricData.createDoubleGauge(resource, instrumentationScopeInfo, metricDescriptor.getName(), metricDescriptor.getDescription(), metricDescriptor.getSourceInstrument().getUnit(), ImmutableGaugeData.create(collection));
    }

    static final class Handle extends AggregatorHandle<DoublePointData, DoubleExemplarData> {
        private final AtomicReference<AtomicLong> current;

        @Nullable
        private final MutableDoublePointData reusablePoint;
        private final AtomicLong valueBits;

        private Handle(ExemplarReservoir<DoubleExemplarData> exemplarReservoir, MemoryMode memoryMode) {
            super(exemplarReservoir);
            this.current = new AtomicReference<>(null);
            this.valueBits = new AtomicLong();
            if (memoryMode == MemoryMode.REUSABLE_DATA) {
                this.reusablePoint = new MutableDoublePointData();
            } else {
                this.reusablePoint = null;
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        public DoublePointData doAggregateThenMaybeReset(long j, long j2, Attributes attributes, List<DoubleExemplarData> list, boolean z) {
            AtomicReference<AtomicLong> atomicReference = this.current;
            double longBitsToDouble = Double.longBitsToDouble(((AtomicLong) Objects.requireNonNull(z ? atomicReference.getAndSet(null) : atomicReference.get())).get());
            MutableDoublePointData mutableDoublePointData = this.reusablePoint;
            if (mutableDoublePointData != null) {
                mutableDoublePointData.set(j, j2, attributes, longBitsToDouble, list);
                return this.reusablePoint;
            }
            return ImmutableDoublePointData.create(j, j2, attributes, longBitsToDouble, list);
        }

        @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorHandle
        protected void doRecordDouble(double d) {
            this.valueBits.set(Double.doubleToLongBits(d));
            CompositionImpl$$ExternalSyntheticBackportWithForwarding0.m(this.current, null, this.valueBits);
        }
    }
}
