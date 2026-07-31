package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.ScopeMetrics;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class InstrumentationScopeMetricsMarshaler extends MarshalerWithSize {
    private final InstrumentationScopeMarshaler instrumentationScope;
    private final List<Marshaler> metricMarshalers;
    private final byte[] schemaUrlUtf8;

    InstrumentationScopeMetricsMarshaler(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<Marshaler> list) {
        super(calculateSize(instrumentationScopeMarshaler, bArr, list));
        this.instrumentationScope = instrumentationScopeMarshaler;
        this.schemaUrlUtf8 = bArr;
        this.metricMarshalers = list;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(ScopeMetrics.SCOPE, this.instrumentationScope);
        serializer.serializeRepeatedMessage(ScopeMetrics.METRICS, this.metricMarshalers);
        serializer.serializeString(ScopeMetrics.SCHEMA_URL, this.schemaUrlUtf8);
    }

    private static int calculateSize(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<Marshaler> list) {
        return MarshalerUtil.sizeMessage(ScopeMetrics.SCOPE, instrumentationScopeMarshaler) + MarshalerUtil.sizeBytes(ScopeMetrics.SCHEMA_URL, bArr) + MarshalerUtil.sizeRepeatedMessage(ScopeMetrics.METRICS, list);
    }
}
