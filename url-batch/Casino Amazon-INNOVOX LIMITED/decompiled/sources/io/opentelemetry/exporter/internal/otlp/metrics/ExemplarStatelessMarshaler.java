package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.exporter.internal.otlp.AttributeKeyValueStatelessMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.Exemplar;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class ExemplarStatelessMarshaler implements StatelessMarshaler<ExemplarData> {
    static final ExemplarStatelessMarshaler INSTANCE = new ExemplarStatelessMarshaler();

    private ExemplarStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, ExemplarData exemplarData, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeFixed64(Exemplar.TIME_UNIX_NANO, exemplarData.getEpochNanos());
        ProtoFieldInfo protoExemplarValueType = ExemplarMarshaler.toProtoExemplarValueType(exemplarData);
        if (protoExemplarValueType == Exemplar.AS_INT) {
            serializer.serializeFixed64Optional(protoExemplarValueType, ((LongExemplarData) exemplarData).getValue());
        } else {
            serializer.serializeDoubleOptional(protoExemplarValueType, ((DoubleExemplarData) exemplarData).getValue());
        }
        SpanContext spanContext = exemplarData.getSpanContext();
        if (spanContext.isValid()) {
            serializer.serializeSpanId(Exemplar.SPAN_ID, spanContext.getSpanId(), marshalerContext);
            serializer.serializeTraceId(Exemplar.TRACE_ID, spanContext.getTraceId(), marshalerContext);
        }
        serializer.serializeRepeatedMessageWithContext(Exemplar.FILTERED_ATTRIBUTES, exemplarData.getFilteredAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(ExemplarData exemplarData, MarshalerContext marshalerContext) {
        int sizeDoubleOptional;
        int sizeFixed64 = MarshalerUtil.sizeFixed64(Exemplar.TIME_UNIX_NANO, exemplarData.getEpochNanos());
        ProtoFieldInfo protoExemplarValueType = ExemplarMarshaler.toProtoExemplarValueType(exemplarData);
        if (protoExemplarValueType == Exemplar.AS_INT) {
            sizeDoubleOptional = MarshalerUtil.sizeFixed64Optional(protoExemplarValueType, ((LongExemplarData) exemplarData).getValue());
        } else {
            sizeDoubleOptional = MarshalerUtil.sizeDoubleOptional(protoExemplarValueType, ((DoubleExemplarData) exemplarData).getValue());
        }
        int i = sizeFixed64 + sizeDoubleOptional;
        SpanContext spanContext = exemplarData.getSpanContext();
        if (spanContext.isValid()) {
            i = i + MarshalerUtil.sizeSpanId(Exemplar.SPAN_ID, spanContext.getSpanId()) + MarshalerUtil.sizeTraceId(Exemplar.TRACE_ID, spanContext.getTraceId());
        }
        return i + StatelessMarshalerUtil.sizeRepeatedMessageWithContext(Exemplar.FILTERED_ATTRIBUTES, exemplarData.getFilteredAttributes(), AttributeKeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }
}
