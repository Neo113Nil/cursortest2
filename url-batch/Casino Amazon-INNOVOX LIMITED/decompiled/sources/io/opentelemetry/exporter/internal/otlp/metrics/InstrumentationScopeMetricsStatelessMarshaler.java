package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ScopeMetrics;
import io.opentelemetry.proto.trace.v1.internal.ScopeSpans;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.metrics.data.MetricData;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class InstrumentationScopeMetricsStatelessMarshaler implements StatelessMarshaler2<InstrumentationScopeInfo, List<MetricData>> {
    static final InstrumentationScopeMetricsStatelessMarshaler INSTANCE = new InstrumentationScopeMetricsStatelessMarshaler();

    private InstrumentationScopeMetricsStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public void writeTo(Serializer serializer, InstrumentationScopeInfo instrumentationScopeInfo, List<MetricData> list, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeMessage(ScopeMetrics.SCOPE, (InstrumentationScopeMarshaler) marshalerContext.getData(InstrumentationScopeMarshaler.class));
        serializer.serializeRepeatedMessageWithContext(ScopeMetrics.METRICS, list, MetricStatelessMarshaler.INSTANCE, marshalerContext);
        serializer.serializeStringWithContext(ScopeMetrics.SCHEMA_URL, instrumentationScopeInfo.getSchemaUrl(), marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler2
    public int getBinarySerializedSize(InstrumentationScopeInfo instrumentationScopeInfo, List<MetricData> list, MarshalerContext marshalerContext) {
        InstrumentationScopeMarshaler create = InstrumentationScopeMarshaler.create(instrumentationScopeInfo);
        marshalerContext.addData(create);
        return MarshalerUtil.sizeMessage(ScopeMetrics.SCOPE, create) + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ScopeMetrics.METRICS, list, MetricStatelessMarshaler.INSTANCE, marshalerContext) + StatelessMarshalerUtil.sizeStringWithContext(ScopeSpans.SCHEMA_URL, instrumentationScopeInfo.getSchemaUrl(), marshalerContext);
    }
}
