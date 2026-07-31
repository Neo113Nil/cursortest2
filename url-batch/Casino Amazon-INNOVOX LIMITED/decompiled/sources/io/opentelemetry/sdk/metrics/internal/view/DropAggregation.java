package io.opentelemetry.sdk.metrics.internal.view;

import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.aggregator.Aggregator;
import io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;
import io.opentelemetry.sdk.metrics.internal.exemplar.ExemplarFilter;

/* loaded from: classes3.dex */
public final class DropAggregation implements Aggregation, AggregatorFactory {
    private static final Aggregation INSTANCE = new DropAggregation();

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public boolean isCompatibleWithInstrument(InstrumentDescriptor instrumentDescriptor) {
        return true;
    }

    public static Aggregation getInstance() {
        return INSTANCE;
    }

    private DropAggregation() {
    }

    @Override // io.opentelemetry.sdk.metrics.internal.aggregator.AggregatorFactory
    public <T extends PointData, U extends ExemplarData> Aggregator<T, U> createAggregator(InstrumentDescriptor instrumentDescriptor, ExemplarFilter exemplarFilter, MemoryMode memoryMode) {
        return (Aggregator<T, U>) Aggregator.drop();
    }

    public String toString() {
        return "DropAggregation";
    }
}
