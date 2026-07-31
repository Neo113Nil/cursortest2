package io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers;

import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.metrics.ProtoMetricsDataMapper;
import io.opentelemetry.diskbuffering.proto.collector.metrics.v1.ExportMetricsServiceRequest;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
public final class MetricDataDeserializer implements SignalDeserializer<MetricData> {
    private static final MetricDataDeserializer INSTANCE = new MetricDataDeserializer();

    private MetricDataDeserializer() {
    }

    static MetricDataDeserializer getInstance() {
        return INSTANCE;
    }

    @Override // io.opentelemetry.contrib.disk.buffering.internal.serialization.deserializers.SignalDeserializer
    public List<MetricData> deserialize(byte[] bArr) throws DeserializationException {
        try {
            return ProtoMetricsDataMapper.getInstance().fromProto(ExportMetricsServiceRequest.ADAPTER.decode(bArr));
        } catch (IOException | IllegalStateException e) {
            throw new DeserializationException(e);
        }
    }
}
