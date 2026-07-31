package io.opentelemetry.sdk.metrics.internal.aggregator;

import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.PointData;
import io.opentelemetry.sdk.metrics.internal.descriptor.InstrumentDescriptor;

/* loaded from: classes3.dex */
abstract class AbstractSumAggregator<T extends PointData, U extends ExemplarData> implements Aggregator<T, U> {
    private final boolean isMonotonic;

    AbstractSumAggregator(InstrumentDescriptor instrumentDescriptor) {
        this.isMonotonic = isMonotonicInstrument(instrumentDescriptor);
    }

    private static boolean isMonotonicInstrument(InstrumentDescriptor instrumentDescriptor) {
        InstrumentType type = instrumentDescriptor.getType();
        return type == InstrumentType.HISTOGRAM || type == InstrumentType.COUNTER || type == InstrumentType.OBSERVABLE_COUNTER;
    }

    final boolean isMonotonic() {
        return this.isMonotonic;
    }
}
