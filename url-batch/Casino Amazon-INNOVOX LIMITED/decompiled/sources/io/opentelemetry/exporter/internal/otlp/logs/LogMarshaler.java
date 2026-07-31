package io.opentelemetry.exporter.internal.otlp.logs;

import io.opentelemetry.api.logs.Severity;
import io.opentelemetry.api.trace.SpanContext;
import io.opentelemetry.api.trace.SpanId;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceId;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.AnyValueMarshaler;
import io.opentelemetry.exporter.internal.otlp.IncubatingUtil;
import io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler;
import io.opentelemetry.proto.logs.v1.internal.LogRecord;
import io.opentelemetry.proto.logs.v1.internal.SeverityNumber;
import io.opentelemetry.sdk.logs.data.LogRecordData;
import java.io.IOException;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class LogMarshaler extends MarshalerWithSize {

    @Nullable
    private final MarshalerWithSize anyValueMarshaler;
    private final KeyValueMarshaler[] attributeMarshalers;
    private final int droppedAttributesCount;
    private final byte[] eventName;
    private final long observedTimeUnixNano;
    private final ProtoEnumInfo severityNumber;
    private final byte[] severityText;

    @Nullable
    private final String spanId;
    private final long timeUnixNano;
    private final TraceFlags traceFlags;

    @Nullable
    private final String traceId;
    private static final String INVALID_TRACE_ID = TraceId.getInvalid();
    private static final String INVALID_SPAN_ID = SpanId.getInvalid();

    static LogMarshaler create(LogRecordData logRecordData) {
        KeyValueMarshaler[] createForAttributes;
        int size;
        if (IncubatingUtil.isExtendedLogRecordData(logRecordData)) {
            createForAttributes = IncubatingUtil.createdExtendedAttributesMarhsalers(logRecordData);
        } else {
            createForAttributes = KeyValueMarshaler.createForAttributes(logRecordData.getAttributes());
        }
        KeyValueMarshaler[] keyValueMarshalerArr = createForAttributes;
        if (IncubatingUtil.isExtendedLogRecordData(logRecordData)) {
            size = IncubatingUtil.extendedAttributesSize(logRecordData);
        } else {
            size = logRecordData.getAttributes().size();
        }
        MarshalerWithSize create = logRecordData.getBodyValue() == null ? null : AnyValueMarshaler.create(logRecordData.getBodyValue());
        SpanContext spanContext = logRecordData.getSpanContext();
        long timestampEpochNanos = logRecordData.getTimestampEpochNanos();
        long observedTimestampEpochNanos = logRecordData.getObservedTimestampEpochNanos();
        ProtoEnumInfo protoSeverityNumber = toProtoSeverityNumber(logRecordData.getSeverity());
        byte[] bytes = MarshalerUtil.toBytes(logRecordData.getSeverityText());
        int totalAttributeCount = logRecordData.getTotalAttributeCount() - size;
        String str = null;
        TraceFlags traceFlags = spanContext.getTraceFlags();
        String traceId = spanContext.getTraceId().equals(INVALID_TRACE_ID) ? null : spanContext.getTraceId();
        if (!spanContext.getSpanId().equals(INVALID_SPAN_ID)) {
            str = spanContext.getSpanId();
        }
        return new LogMarshaler(timestampEpochNanos, observedTimestampEpochNanos, protoSeverityNumber, bytes, create, keyValueMarshalerArr, totalAttributeCount, traceFlags, traceId, str, MarshalerUtil.toBytes(logRecordData.getEventName()));
    }

    private LogMarshaler(long j, long j2, ProtoEnumInfo protoEnumInfo, byte[] bArr, @Nullable MarshalerWithSize marshalerWithSize, KeyValueMarshaler[] keyValueMarshalerArr, int i, TraceFlags traceFlags, @Nullable String str, @Nullable String str2, byte[] bArr2) {
        super(calculateSize(j, j2, protoEnumInfo, bArr, marshalerWithSize, keyValueMarshalerArr, i, traceFlags, str, str2, bArr2));
        this.timeUnixNano = j;
        this.observedTimeUnixNano = j2;
        this.traceId = str;
        this.spanId = str2;
        this.traceFlags = traceFlags;
        this.severityNumber = protoEnumInfo;
        this.severityText = bArr;
        this.anyValueMarshaler = marshalerWithSize;
        this.attributeMarshalers = keyValueMarshalerArr;
        this.droppedAttributesCount = i;
        this.eventName = bArr2;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    protected void writeTo(Serializer serializer) throws IOException {
        serializer.serializeFixed64(LogRecord.TIME_UNIX_NANO, this.timeUnixNano);
        serializer.serializeFixed64(LogRecord.OBSERVED_TIME_UNIX_NANO, this.observedTimeUnixNano);
        serializer.serializeEnum(LogRecord.SEVERITY_NUMBER, this.severityNumber);
        serializer.serializeString(LogRecord.SEVERITY_TEXT, this.severityText);
        if (this.anyValueMarshaler != null) {
            serializer.serializeMessage(LogRecord.BODY, this.anyValueMarshaler);
        }
        serializer.serializeRepeatedMessage(LogRecord.ATTRIBUTES, this.attributeMarshalers);
        serializer.serializeUInt32(LogRecord.DROPPED_ATTRIBUTES_COUNT, this.droppedAttributesCount);
        serializer.serializeByteAsFixed32(LogRecord.FLAGS, this.traceFlags.asByte());
        serializer.serializeTraceId(LogRecord.TRACE_ID, this.traceId);
        serializer.serializeSpanId(LogRecord.SPAN_ID, this.spanId);
        serializer.serializeString(LogRecord.EVENT_NAME, this.eventName);
    }

    private static int calculateSize(long j, long j2, ProtoEnumInfo protoEnumInfo, byte[] bArr, @Nullable MarshalerWithSize marshalerWithSize, KeyValueMarshaler[] keyValueMarshalerArr, int i, TraceFlags traceFlags, @Nullable String str, @Nullable String str2, byte[] bArr2) {
        int sizeFixed64 = MarshalerUtil.sizeFixed64(LogRecord.TIME_UNIX_NANO, j) + MarshalerUtil.sizeFixed64(LogRecord.OBSERVED_TIME_UNIX_NANO, j2) + MarshalerUtil.sizeEnum(LogRecord.SEVERITY_NUMBER, protoEnumInfo) + MarshalerUtil.sizeBytes(LogRecord.SEVERITY_TEXT, bArr);
        if (marshalerWithSize != null) {
            sizeFixed64 += MarshalerUtil.sizeMessage(LogRecord.BODY, marshalerWithSize);
        }
        return sizeFixed64 + MarshalerUtil.sizeRepeatedMessage(LogRecord.ATTRIBUTES, keyValueMarshalerArr) + MarshalerUtil.sizeUInt32(LogRecord.DROPPED_ATTRIBUTES_COUNT, i) + MarshalerUtil.sizeByteAsFixed32(LogRecord.FLAGS, traceFlags.asByte()) + MarshalerUtil.sizeTraceId(LogRecord.TRACE_ID, str) + MarshalerUtil.sizeSpanId(LogRecord.SPAN_ID, str2) + MarshalerUtil.sizeBytes(LogRecord.EVENT_NAME, bArr2);
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.logs.LogMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$logs$Severity;

        static {
            int[] iArr = new int[Severity.values().length];
            $SwitchMap$io$opentelemetry$api$logs$Severity = iArr;
            try {
                iArr[Severity.TRACE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.TRACE2.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.TRACE3.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.TRACE4.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.DEBUG.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.DEBUG2.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.DEBUG3.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.DEBUG4.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.INFO.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.INFO2.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.INFO3.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.INFO4.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.WARN.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.WARN2.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.WARN3.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.WARN4.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.ERROR.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.ERROR2.ordinal()] = 18;
            } catch (NoSuchFieldError unused18) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.ERROR3.ordinal()] = 19;
            } catch (NoSuchFieldError unused19) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.ERROR4.ordinal()] = 20;
            } catch (NoSuchFieldError unused20) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.FATAL.ordinal()] = 21;
            } catch (NoSuchFieldError unused21) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.FATAL2.ordinal()] = 22;
            } catch (NoSuchFieldError unused22) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.FATAL3.ordinal()] = 23;
            } catch (NoSuchFieldError unused23) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.FATAL4.ordinal()] = 24;
            } catch (NoSuchFieldError unused24) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$logs$Severity[Severity.UNDEFINED_SEVERITY_NUMBER.ordinal()] = 25;
            } catch (NoSuchFieldError unused25) {
            }
        }
    }

    static ProtoEnumInfo toProtoSeverityNumber(Severity severity) {
        switch (AnonymousClass1.$SwitchMap$io$opentelemetry$api$logs$Severity[severity.ordinal()]) {
        }
        return SeverityNumber.SEVERITY_NUMBER_UNSPECIFIED;
    }
}
