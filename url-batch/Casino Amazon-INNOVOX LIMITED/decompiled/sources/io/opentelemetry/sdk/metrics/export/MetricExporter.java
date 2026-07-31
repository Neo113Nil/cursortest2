package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.io.Closeable;
import java.util.Collection;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface MetricExporter extends AggregationTemporalitySelector, DefaultAggregationSelector, Closeable {
    CompletableResultCode export(Collection<MetricData> collection);

    CompletableResultCode flush();

    CompletableResultCode shutdown();

    default Aggregation getDefaultAggregation(InstrumentType instrumentType) {
        return Aggregation.defaultAggregation();
    }

    default MemoryMode getMemoryMode() {
        return MemoryMode.IMMUTABLE_DATA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() {
        shutdown().join(10L, TimeUnit.SECONDS);
    }
}
