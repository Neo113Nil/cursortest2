package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.collector.trace.v1.internal.ExportTraceServiceRequest;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.io.IOException;
import java.util.Collection;

/* loaded from: classes3.dex */
public final class TraceRequestMarshaler extends MarshalerWithSize {
    private final ResourceSpansMarshaler[] resourceSpansMarshalers;

    public static TraceRequestMarshaler create(Collection<SpanData> collection) {
        return new TraceRequestMarshaler(ResourceSpansMarshaler.create(collection));
    }

    private TraceRequestMarshaler(ResourceSpansMarshaler[] resourceSpansMarshalerArr) {
        super(MarshalerUtil.sizeRepeatedMessage(ExportTraceServiceRequest.RESOURCE_SPANS, resourceSpansMarshalerArr));
        this.resourceSpansMarshalers = resourceSpansMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeRepeatedMessage(ExportTraceServiceRequest.RESOURCE_SPANS, this.resourceSpansMarshalers);
    }
}
