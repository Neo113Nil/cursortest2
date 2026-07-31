package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.collector.metrics.v1.internal.ExportMetricsServiceRequest;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class MetricsRequestMarshaler extends MarshalerWithSize {
    private final ResourceMetricsMarshaler[] resourceMetricsMarshalers;

    public static MetricsRequestMarshaler create(Collection<MetricData> collection) {
        return new MetricsRequestMarshaler(ResourceMetricsMarshaler.create(collection));
    }

    private MetricsRequestMarshaler(ResourceMetricsMarshaler[] resourceMetricsMarshalerArr) {
        super(calculateSize(resourceMetricsMarshalerArr));
        this.resourceMetricsMarshalers = resourceMetricsMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(ExportMetricsServiceRequest.RESOURCE_METRICS, this.resourceMetricsMarshalers);
    }

    private static int calculateSize(ResourceMetricsMarshaler[] resourceMetricsMarshalerArr) {
        return MarshalerUtil.sizeRepeatedMessage(ExportMetricsServiceRequest.RESOURCE_METRICS, resourceMetricsMarshalerArr);
    }
}
