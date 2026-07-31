package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.collector.metrics.v1.internal.ExportMetricsServiceRequest;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.MetricData;
import io.opentelemetry.sdk.resources.Resource;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public final class LowAllocationMetricsRequestMarshaler extends Marshaler {
    private static final MarshalerContext.Key RESOURCE_METRIC_SIZE_CALCULATOR_KEY = MarshalerContext.key();
    private static final MarshalerContext.Key RESOURCE_METRIC_WRITER_KEY = MarshalerContext.key();
    private final MarshalerContext context = new MarshalerContext();
    private Map<Resource, Map<InstrumentationScopeInfo, List<MetricData>>> resourceAndScopeMap;
    private int size;

    public void initialize(Collection<MetricData> collection) {
        Map<Resource, Map<InstrumentationScopeInfo, List<MetricData>>> groupByResourceAndScope = groupByResourceAndScope(this.context, collection);
        this.resourceAndScopeMap = groupByResourceAndScope;
        this.size = calculateSize(this.context, groupByResourceAndScope);
    }

    public void reset() {
        this.context.reset();
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public int getBinarySerializedSize() {
        return this.size;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        this.context.resetReadIndex();
        serializer.serializeRepeatedMessageWithContext(ExportMetricsServiceRequest.RESOURCE_METRICS, this.resourceAndScopeMap, ResourceMetricsStatelessMarshaler.INSTANCE, this.context, RESOURCE_METRIC_WRITER_KEY);
    }

    private static int calculateSize(MarshalerContext marshalerContext, Map<Resource, Map<InstrumentationScopeInfo, List<MetricData>>> map) {
        return StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ExportMetricsServiceRequest.RESOURCE_METRICS, map, ResourceMetricsStatelessMarshaler.INSTANCE, marshalerContext, RESOURCE_METRIC_SIZE_CALCULATOR_KEY);
    }

    private static Map<Resource, Map<InstrumentationScopeInfo, List<MetricData>>> groupByResourceAndScope(MarshalerContext marshalerContext, Collection<MetricData> collection) {
        if (collection.isEmpty()) {
            return Collections.emptyMap();
        }
        return StatelessMarshalerUtil.groupByResourceAndScope(collection, new LowAllocationMetricsRequestMarshaler$$ExternalSyntheticLambda0(), new LowAllocationMetricsRequestMarshaler$$ExternalSyntheticLambda1(), marshalerContext);
    }
}
