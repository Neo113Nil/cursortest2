package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.InstrumentationScopeMarshaler;
import io.opentelemetry.proto.trace.v1.internal.ScopeSpans;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class InstrumentationScopeSpansMarshaler extends MarshalerWithSize {
    private final InstrumentationScopeMarshaler instrumentationScope;
    private final byte[] schemaUrlUtf8;
    private final List<SpanMarshaler> spanMarshalers;

    InstrumentationScopeSpansMarshaler(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<SpanMarshaler> list) {
        super(calculateSize(instrumentationScopeMarshaler, bArr, list));
        this.instrumentationScope = instrumentationScopeMarshaler;
        this.schemaUrlUtf8 = bArr;
        this.spanMarshalers = list;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(ScopeSpans.SCOPE, this.instrumentationScope);
        serializer.serializeRepeatedMessage(ScopeSpans.SPANS, this.spanMarshalers);
        serializer.serializeString(ScopeSpans.SCHEMA_URL, this.schemaUrlUtf8);
    }

    private static int calculateSize(InstrumentationScopeMarshaler instrumentationScopeMarshaler, byte[] bArr, List<SpanMarshaler> list) {
        return MarshalerUtil.sizeMessage(ScopeSpans.SCOPE, instrumentationScopeMarshaler) + MarshalerUtil.sizeBytes(ScopeSpans.SCHEMA_URL, bArr) + MarshalerUtil.sizeRepeatedMessage(ScopeSpans.SPANS, list);
    }
}
