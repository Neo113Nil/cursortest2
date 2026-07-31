package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.exporter.internal.otlp.ResourceMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ResourceMetrics;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.resources.Resource;
import java.io.IOException;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/* loaded from: classes3.dex */
public final class ResourceMetricsMarshaler extends MarshalerWithSize {
    private final InstrumentationScopeMetricsMarshaler[] instrumentationScopeMetricsMarshalers;
    private final ResourceMarshaler resourceMarshaler;
    private final byte[] schemaUrl;

    public static ResourceMetricsMarshaler[] create(Collection<MetricData> collection) {
        Map<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> groupByResourceAndScope = groupByResourceAndScope(collection);
        ResourceMetricsMarshaler[] resourceMetricsMarshalerArr = new ResourceMetricsMarshaler[groupByResourceAndScope.size()];
        int i = 0;
        for (Map.Entry<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> entry : groupByResourceAndScope.entrySet()) {
            InstrumentationScopeMetricsMarshaler[] instrumentationScopeMetricsMarshalerArr = new InstrumentationScopeMetricsMarshaler[entry.getValue().size()];
            int i2 = 0;
            for (Map.Entry<InstrumentationScopeInfo, List<Marshaler>> entry2 : entry.getValue().entrySet()) {
                instrumentationScopeMetricsMarshalerArr[i2] = new InstrumentationScopeMetricsMarshaler(InstrumentationScopeMarshaler.create(entry2.getKey()), MarshalerUtil.toBytes(entry2.getKey().getSchemaUrl()), entry2.getValue());
                i2++;
            }
            resourceMetricsMarshalerArr[i] = new ResourceMetricsMarshaler(ResourceMarshaler.create(entry.getKey()), MarshalerUtil.toBytes(entry.getKey().getSchemaUrl()), instrumentationScopeMetricsMarshalerArr);
            i++;
        }
        return resourceMetricsMarshalerArr;
    }

    ResourceMetricsMarshaler(ResourceMarshaler resourceMarshaler, byte[] bArr, InstrumentationScopeMetricsMarshaler[] instrumentationScopeMetricsMarshalerArr) {
        super(calculateSize(resourceMarshaler, bArr, instrumentationScopeMetricsMarshalerArr));
        this.resourceMarshaler = resourceMarshaler;
        this.schemaUrl = bArr;
        this.instrumentationScopeMetricsMarshalers = instrumentationScopeMetricsMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(ResourceMetrics.RESOURCE, this.resourceMarshaler);
        serializer.serializeRepeatedMessage(ResourceMetrics.SCOPE_METRICS, this.instrumentationScopeMetricsMarshalers);
        serializer.serializeString(ResourceMetrics.SCHEMA_URL, this.schemaUrl);
    }

    private static int calculateSize(ResourceMarshaler resourceMarshaler, byte[] bArr, InstrumentationScopeMetricsMarshaler[] instrumentationScopeMetricsMarshalerArr) {
        return MarshalerUtil.sizeMessage(ResourceMetrics.RESOURCE, resourceMarshaler) + MarshalerUtil.sizeBytes(ResourceMetrics.SCHEMA_URL, bArr) + MarshalerUtil.sizeRepeatedMessage(ResourceMetrics.SCOPE_METRICS, instrumentationScopeMetricsMarshalerArr);
    }

    private static Map<Resource, Map<InstrumentationScopeInfo, List<Marshaler>>> groupByResourceAndScope(Collection<MetricData> collection) {
        return MarshalerUtil.groupByResourceAndScope(collection, new LowAllocationMetricsRequestMarshaler$$ExternalSyntheticLambda0(), new LowAllocationMetricsRequestMarshaler$$ExternalSyntheticLambda1(), new Function() { // from class: io.opentelemetry.exporter.internal.otlp.metrics.ResourceMetricsMarshaler$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return MetricMarshaler.create((MetricData) obj);
            }
        });
    }
}
