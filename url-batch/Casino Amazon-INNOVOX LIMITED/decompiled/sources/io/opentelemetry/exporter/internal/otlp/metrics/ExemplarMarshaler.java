package io.opentelemetry.exporter.internal.otlp.metrics;

import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoFieldInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler;
import io.opentelemetry.proto.metrics.v1.internal.Exemplar;
import io.opentelemetry.sdk.metrics.data.DoubleExemplarData;
import io.opentelemetry.sdk.metrics.data.ExemplarData;
import io.opentelemetry.sdk.metrics.data.LongExemplarData;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class ExemplarMarshaler extends MarshalerWithSize {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private final KeyValueMarshaler[] filteredAttributeMarshalers;
    private final SpanContext spanContext;
    private final long timeUnixNano;
    private final ExemplarData value;
    private final ProtoFieldInfo valueField;

    static ExemplarMarshaler[] createRepeated(List<? extends ExemplarData> list) {
        int size = list.size();
        ExemplarMarshaler[] exemplarMarshalerArr = new ExemplarMarshaler[size];
        for (int i = 0; i < size; i++) {
            exemplarMarshalerArr[i] = create(list.get(i));
        }
        return exemplarMarshalerArr;
    }

    static ExemplarMarshaler create(ExemplarData exemplarData) {
        return new ExemplarMarshaler(exemplarData.getEpochNanos(), exemplarData, toProtoExemplarValueType(exemplarData), exemplarData.getSpanContext(), KeyValueMarshaler.createForAttributes(exemplarData.getFilteredAttributes()));
    }

    private ExemplarMarshaler(long j, ExemplarData exemplarData, ProtoFieldInfo protoFieldInfo, SpanContext spanContext, KeyValueMarshaler[] keyValueMarshalerArr) {
        super(calculateSize(j, protoFieldInfo, exemplarData, spanContext, keyValueMarshalerArr));
        this.timeUnixNano = j;
        this.value = exemplarData;
        this.valueField = protoFieldInfo;
        this.spanContext = spanContext;
        this.filteredAttributeMarshalers = keyValueMarshalerArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeFixed64(Exemplar.TIME_UNIX_NANO, this.timeUnixNano);
        if (this.valueField == Exemplar.AS_INT) {
            serializer.serializeFixed64Optional(this.valueField, ((LongExemplarData) this.value).getValue());
        } else {
            serializer.serializeDoubleOptional(this.valueField, ((DoubleExemplarData) this.value).getValue());
        }
        if (this.spanContext.isValid()) {
            serializer.serializeSpanId(Exemplar.SPAN_ID, this.spanContext.getSpanId());
            serializer.serializeTraceId(Exemplar.TRACE_ID, this.spanContext.getTraceId());
        }
        serializer.serializeRepeatedMessage(Exemplar.FILTERED_ATTRIBUTES, this.filteredAttributeMarshalers);
    }

    private static int calculateSize(long j, ProtoFieldInfo protoFieldInfo, ExemplarData exemplarData, SpanContext spanContext, KeyValueMarshaler[] keyValueMarshalerArr) {
        int sizeDoubleOptional;
        int sizeFixed64 = MarshalerUtil.sizeFixed64(Exemplar.TIME_UNIX_NANO, j);
        if (protoFieldInfo == Exemplar.AS_INT) {
            sizeDoubleOptional = MarshalerUtil.sizeFixed64Optional(protoFieldInfo, ((LongExemplarData) exemplarData).getValue());
        } else {
            sizeDoubleOptional = MarshalerUtil.sizeDoubleOptional(protoFieldInfo, ((DoubleExemplarData) exemplarData).getValue());
        }
        int i = sizeFixed64 + sizeDoubleOptional;
        if (spanContext.isValid()) {
            i = i + MarshalerUtil.sizeSpanId(Exemplar.SPAN_ID, spanContext.getSpanId()) + MarshalerUtil.sizeTraceId(Exemplar.TRACE_ID, spanContext.getTraceId());
        }
        return i + MarshalerUtil.sizeRepeatedMessage(Exemplar.FILTERED_ATTRIBUTES, keyValueMarshalerArr);
    }

    static ProtoFieldInfo toProtoExemplarValueType(ExemplarData exemplarData) {
        if (exemplarData instanceof LongExemplarData) {
            return Exemplar.AS_INT;
        }
        return Exemplar.AS_DOUBLE;
    }
}
