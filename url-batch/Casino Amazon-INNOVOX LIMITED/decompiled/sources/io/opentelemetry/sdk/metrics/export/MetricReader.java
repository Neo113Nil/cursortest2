package io.opentelemetry.sdk.metrics.export;

import io.opentelemetry.sdk.common.CompletableResultCode;
import io.opentelemetry.sdk.common.export.MemoryMode;
import io.opentelemetry.sdk.metrics.Aggregation;
import io.opentelemetry.sdk.metrics.InstrumentType;
import java.io.Closeable;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

/* loaded from: classes3.dex */
public interface MetricReader extends AggregationTemporalitySelector, DefaultAggregationSelector, Closeable {
    CompletableResultCode forceFlush();

    void register(CollectionRegistration collectionRegistration);

    CompletableResultCode shutdown();

    @Override // io.opentelemetry.sdk.metrics.export.DefaultAggregationSelector
    default Aggregation getDefaultAggregation(InstrumentType instrumentType) {
        return Aggregation.defaultAggregation();
    }

    default MemoryMode getMemoryMode() {
        return MemoryMode.IMMUTABLE_DATA;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    default void close() throws IOException {
        shutdown().join(10L, TimeUnit.SECONDS);
    }
}
