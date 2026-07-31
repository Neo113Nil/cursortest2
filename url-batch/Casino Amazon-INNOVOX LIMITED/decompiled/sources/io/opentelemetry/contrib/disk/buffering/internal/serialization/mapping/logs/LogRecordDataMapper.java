package io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.Value;
import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.AttributesMapper;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.common.ByteStringMapper;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.models.LogRecordDataImpl;
import io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.spans.SpanDataMapper;
import io.opentelemetry.contrib.disk.buffering.internal.utils.ProtobufTools;
import io.opentelemetry.diskbuffering.proto.common.v1.AnyValue;
import io.opentelemetry.diskbuffering.proto.common.v1.KeyValue;
import io.opentelemetry.diskbuffering.proto.logs.v1.LogRecord;
import io.opentelemetry.diskbuffering.proto.logs.v1.SeverityNumber;
import io.opentelemetry.sdk.common.InstrumentationScopeInfo;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import io.opentelemetry.sdk.resources.Resource;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
public final class LogRecordDataMapper {
    private static final LogRecordDataMapper INSTANCE = new LogRecordDataMapper();

    public static LogRecordDataMapper getInstance() {
        return INSTANCE;
    }

    public LogRecord mapToProto(LogRecordData logRecordData) {
        LogRecord.Builder builder = new LogRecord.Builder();
        builder.time_unix_nano(logRecordData.getTimestampEpochNanos());
        builder.observed_time_unix_nano(logRecordData.getObservedTimestampEpochNanos());
        if (logRecordData.getSeverity() != null) {
            builder.severity_number(severityToProto(logRecordData.getSeverity()));
        }
        if (logRecordData.getSeverityText() != null) {
            builder.severity_text(logRecordData.getSeverityText());
        }
        if (logRecordData.getBodyValue() != null) {
            builder.body(bodyToAnyValue(logRecordData.getBodyValue()));
        }
        builder.flags(ProtobufTools.toUnsignedInt(logRecordData.getSpanContext().getTraceFlags().asByte()));
        addExtrasToProtoBuilder(logRecordData, builder);
        return builder.build();
    }

    private static void addExtrasToProtoBuilder(LogRecordData logRecordData, LogRecord.Builder builder) {
        builder.attributes.addAll(AttributesMapper.getInstance().attributesToProto(logRecordData.getAttributes()));
        SpanContext spanContext = logRecordData.getSpanContext();
        builder.span_id(ByteStringMapper.getInstance().stringToProto(spanContext.getSpanId()));
        builder.trace_id(ByteStringMapper.getInstance().stringToProto(spanContext.getTraceId()));
        builder.dropped_attributes_count(logRecordData.getTotalAttributeCount() - logRecordData.getAttributes().size());
        if (logRecordData.getEventName() != null) {
            builder.event_name(logRecordData.getEventName());
        }
    }

    public LogRecordData mapToSdk(LogRecord logRecord, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        LogRecordDataImpl.Builder builder = LogRecordDataImpl.builder();
        builder.setTimestampEpochNanos(Long.valueOf(logRecord.time_unix_nano));
        builder.setObservedTimestampEpochNanos(Long.valueOf(logRecord.observed_time_unix_nano));
        builder.setSeverity(severityNumberToSdk(logRecord.severity_number));
        builder.setSeverityText(logRecord.severity_text);
        if (logRecord.body != null) {
            builder.setBodyValue(anyValueToBody(logRecord.body));
        }
        addExtrasToSdkItemBuilder(logRecord, builder, resource, instrumentationScopeInfo);
        return builder.build();
    }

    private static void addExtrasToSdkItemBuilder(LogRecord logRecord, LogRecordDataImpl.Builder builder, Resource resource, InstrumentationScopeInfo instrumentationScopeInfo) {
        Attributes protoToAttributes = AttributesMapper.getInstance().protoToAttributes(logRecord.attributes);
        builder.setAttributes(protoToAttributes);
        builder.setSpanContext(SpanContext.create(ByteStringMapper.getInstance().protoToString(logRecord.trace_id), ByteStringMapper.getInstance().protoToString(logRecord.span_id), SpanDataMapper.flagsFromInt(logRecord.flags), TraceState.getDefault()));
        builder.setTotalAttributeCount(Integer.valueOf(logRecord.dropped_attributes_count + protoToAttributes.size()));
        builder.setResource(resource);
        builder.setInstrumentationScopeInfo(instrumentationScopeInfo);
        builder.setEventName(logRecord.event_name);
    }

    private static AnyValue bodyToAnyValue(Value<?> value) {
        return new AnyValue.Builder().string_value(value.asString()).build();
    }

    private static SeverityNumber severityToProto(Severity severity) {
        return SeverityNumber.fromValue(severity.getSeverityNumber());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Value<?> anyValueToBody(AnyValue anyValue) {
        if (anyValue.string_value != null) {
            return Value.of(anyValue.string_value);
        }
        if (anyValue.int_value != null) {
            return Value.of(anyValue.int_value.longValue());
        }
        if (anyValue.double_value != null) {
            return Value.of(anyValue.double_value.doubleValue());
        }
        if (anyValue.bool_value != null) {
            return Value.of(anyValue.bool_value.booleanValue());
        }
        if (anyValue.bytes_value != null) {
            return Value.of(anyValue.bytes_value.toByteArray());
        }
        if (anyValue.kvlist_value != null) {
            return Value.of((Map<String, Value<?>>) anyValue.kvlist_value.values.stream().collect(Collectors.toMap(new Function() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.LogRecordDataMapper$$ExternalSyntheticLambda0
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    String str;
                    str = ((KeyValue) obj).key;
                    return str;
                }
            }, new Function() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.LogRecordDataMapper$$ExternalSyntheticLambda1
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Value anyValueToBody;
                    anyValueToBody = LogRecordDataMapper.anyValueToBody(((KeyValue) obj).value);
                    return anyValueToBody;
                }
            })));
        }
        if (anyValue.array_value != null) {
            return Value.of((List<Value<?>>) anyValue.array_value.values.stream().map(new Function() { // from class: io.opentelemetry.contrib.disk.buffering.internal.serialization.mapping.logs.LogRecordDataMapper$$ExternalSyntheticLambda2
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    Value anyValueToBody;
                    anyValueToBody = LogRecordDataMapper.anyValueToBody((AnyValue) obj);
                    return anyValueToBody;
                }
            }).collect(Collectors.toList()));
        }
        throw new IllegalArgumentException("Unrecognized AnyValue type");
    }

    private static Severity severityNumberToSdk(SeverityNumber severityNumber) {
        for (Severity severity : Severity.values()) {
            if (severity.getSeverityNumber() == severityNumber.getValue()) {
                return severity;
            }
        }
        throw new IllegalArgumentException();
    }
}
