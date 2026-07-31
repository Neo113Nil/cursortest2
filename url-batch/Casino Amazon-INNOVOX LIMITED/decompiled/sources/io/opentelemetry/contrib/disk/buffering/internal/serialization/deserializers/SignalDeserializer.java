package io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers;

import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.util.List;

/* loaded from: classes3.dex */
public interface SignalDeserializer<SDK_ITEM> {
    List<SDK_ITEM> deserialize(byte[] bArr) throws DeserializationException;

    static SignalDeserializer<SpanData> ofSpans() {
        return SpanDataDeserializer.getInstance();
    }

    static SignalDeserializer<MetricData> ofMetrics() {
        return MetricDataDeserializer.getInstance();
    }

    static SignalDeserializer<LogRecordData> ofLogs() {
        return LogRecordDataDeserializer.getInstance();
    }
}
