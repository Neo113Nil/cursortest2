package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.ResourceMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ResourceMetrics;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.resources.Resource;
import java.io.IOException;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class ResourceMetricsStatelessMarshaler implements StatelessMarshaler2<Resource, Map<InstrumentationScopeInfo, List<MetricData>>> {
    static final ResourceMetricsStatelessMarshaler INSTANCE = new ResourceMetricsStatelessMarshaler();
    private static final MarshalerContext.Key SCOPE_METRIC_WRITER_KEY = MarshalerContext.key();
    private static final MarshalerContext.Key SCOPE_METRIC_SIZE_CALCULATOR_KEY = MarshalerContext.key();

    private ResourceMetricsStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public void writeTo(Serializer serializer, Resource resource, Map<InstrumentationScopeInfo, List<MetricData>> map, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeMessage(ResourceMetrics.RESOURCE, (ResourceMarshaler) marshalerContext.getData(ResourceMarshaler.class));
        serializer.serializeRepeatedMessageWithContext(ResourceMetrics.SCOPE_METRICS, map, InstrumentationScopeMetricsStatelessMarshaler.INSTANCE, marshalerContext, SCOPE_METRIC_WRITER_KEY);
        serializer.serializeStringWithContext(ResourceMetrics.SCHEMA_URL, resource.getSchemaUrl(), marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public int getBinarySerializedSize(Resource resource, Map<InstrumentationScopeInfo, List<MetricData>> map, MarshalerContext marshalerContext) {
        ResourceMarshaler create = ResourceMarshaler.create(resource);
        marshalerContext.addData(create);
        return MarshalerUtil.sizeMessage(ResourceMetrics.RESOURCE, create) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ResourceMetrics.SCOPE_METRICS, map, InstrumentationScopeMetricsStatelessMarshaler.INSTANCE, marshalerContext, SCOPE_METRIC_SIZE_CALCULATOR_KEY) + StatelessMarshalerUtil.sizeStringWithContext(ResourceMetrics.SCHEMA_URL, resource.getSchemaUrl(), marshalerContext);
    }
}
