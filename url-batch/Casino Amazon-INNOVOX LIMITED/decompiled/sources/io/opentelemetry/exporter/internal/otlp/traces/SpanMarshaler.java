package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.api.trace.SpanKind;
import io.opentelemetry.api.trace.TraceFlags;
import io.opentelemetry.api.trace.TraceState;
import io.opentelemetry.api.trace.propagation.internal.W3CTraceContextEncoding;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.otlp.KeyValueMarshaler;
import io.opentelemetry.proto.trace.v1.internal.Span;
import io.opentelemetry.sdk.trace.data.SpanData;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class SpanMarshaler extends MarshalerWithSize {
    private static final byte[] EMPTY_BYTES = new byte[0];
    private final KeyValueMarshaler[] attributeMarshalers;
    private final int droppedAttributesCount;
    private final int droppedEventsCount;
    private final int droppedLinksCount;
    private final long endEpochNanos;
    private final TraceFlags flags;
    private final boolean isParentContextRemote;
    private final byte[] nameUtf8;

    @Nullable
    private final String parentSpanId;
    private final SpanEventMarshaler[] spanEventMarshalers;
    private final String spanId;
    private final ProtoEnumInfo spanKind;
    private final SpanLinkMarshaler[] spanLinkMarshalers;
    private final SpanStatusMarshaler spanStatusMarshaler;
    private final long startEpochNanos;
    private final String traceId;
    private final byte[] traceStateUtf8;

    static SpanMarshaler create(SpanData spanData) {
        KeyValueMarshaler[] createForAttributes = KeyValueMarshaler.createForAttributes(spanData.getAttributes());
        SpanEventMarshaler[] createRepeated = SpanEventMarshaler.createRepeated(spanData.getEvents());
        SpanLinkMarshaler[] createRepeated2 = SpanLinkMarshaler.createRepeated(spanData.getLinks());
        return new SpanMarshaler(spanData.getSpanContext().getTraceId(), spanData.getSpanContext().getSpanId(), encodeSpanTraceState(spanData), spanData.getParentSpanContext().isValid() ? spanData.getParentSpanContext().getSpanId() : null, MarshalerUtil.toBytes(spanData.getName()), toProtoSpanKind(spanData.getKind()), spanData.getStartEpochNanos(), spanData.getEndEpochNanos(), createForAttributes, spanData.getTotalAttributeCount() - spanData.getAttributes().size(), createRepeated, spanData.getTotalRecordedEvents() - spanData.getEvents().size(), createRepeated2, spanData.getTotalRecordedLinks() - spanData.getLinks().size(), SpanStatusMarshaler.create(spanData.getStatus()), spanData.getSpanContext().getTraceFlags(), spanData.getParentSpanContext().isRemote());
    }

    private SpanMarshaler(String str, String str2, byte[] bArr, @Nullable String str3, byte[] bArr2, ProtoEnumInfo protoEnumInfo, long j, long j2, KeyValueMarshaler[] keyValueMarshalerArr, int i, SpanEventMarshaler[] spanEventMarshalerArr, int i2, SpanLinkMarshaler[] spanLinkMarshalerArr, int i3, SpanStatusMarshaler spanStatusMarshaler, TraceFlags traceFlags, boolean z) {
        super(calculateSize(str, str2, bArr, str3, bArr2, protoEnumInfo, j, j2, keyValueMarshalerArr, i, spanEventMarshalerArr, i2, spanLinkMarshalerArr, i3, spanStatusMarshaler, traceFlags, z));
        this.traceId = str;
        this.spanId = str2;
        this.traceStateUtf8 = bArr;
        this.parentSpanId = str3;
        this.nameUtf8 = bArr2;
        this.spanKind = protoEnumInfo;
        this.startEpochNanos = j;
        this.endEpochNanos = j2;
        this.attributeMarshalers = keyValueMarshalerArr;
        this.droppedAttributesCount = i;
        this.spanEventMarshalers = spanEventMarshalerArr;
        this.droppedEventsCount = i2;
        this.spanLinkMarshalers = spanLinkMarshalerArr;
        this.droppedLinksCount = i3;
        this.spanStatusMarshaler = spanStatusMarshaler;
        this.flags = traceFlags;
        this.isParentContextRemote = z;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeTraceId(Span.TRACE_ID, this.traceId);
        serializer.serializeSpanId(Span.SPAN_ID, this.spanId);
        serializer.serializeString(Span.TRACE_STATE, this.traceStateUtf8);
        serializer.serializeSpanId(Span.PARENT_SPAN_ID, this.parentSpanId);
        serializer.serializeString(Span.NAME, this.nameUtf8);
        serializer.serializeEnum(Span.KIND, this.spanKind);
        serializer.serializeFixed64(Span.START_TIME_UNIX_NANO, this.startEpochNanos);
        serializer.serializeFixed64(Span.END_TIME_UNIX_NANO, this.endEpochNanos);
        serializer.serializeRepeatedMessage(Span.ATTRIBUTES, this.attributeMarshalers);
        serializer.serializeUInt32(Span.DROPPED_ATTRIBUTES_COUNT, this.droppedAttributesCount);
        serializer.serializeRepeatedMessage(Span.EVENTS, this.spanEventMarshalers);
        serializer.serializeUInt32(Span.DROPPED_EVENTS_COUNT, this.droppedEventsCount);
        serializer.serializeRepeatedMessage(Span.LINKS, this.spanLinkMarshalers);
        serializer.serializeUInt32(Span.DROPPED_LINKS_COUNT, this.droppedLinksCount);
        serializer.serializeMessage(Span.STATUS, this.spanStatusMarshaler);
        serializer.serializeFixed32(Span.FLAGS, SpanFlags.withParentIsRemoteFlags(this.flags, this.isParentContextRemote));
    }

    private static int calculateSize(String str, String str2, byte[] bArr, @Nullable String str3, byte[] bArr2, ProtoEnumInfo protoEnumInfo, long j, long j2, KeyValueMarshaler[] keyValueMarshalerArr, int i, SpanEventMarshaler[] spanEventMarshalerArr, int i2, SpanLinkMarshaler[] spanLinkMarshalerArr, int i3, SpanStatusMarshaler spanStatusMarshaler, TraceFlags traceFlags, boolean z) {
        return MarshalerUtil.sizeTraceId(Span.TRACE_ID, str) + MarshalerUtil.sizeSpanId(Span.SPAN_ID, str2) + MarshalerUtil.sizeBytes(Span.TRACE_STATE, bArr) + MarshalerUtil.sizeSpanId(Span.PARENT_SPAN_ID, str3) + MarshalerUtil.sizeBytes(Span.NAME, bArr2) + MarshalerUtil.sizeEnum(Span.KIND, protoEnumInfo) + MarshalerUtil.sizeFixed64(Span.START_TIME_UNIX_NANO, j) + MarshalerUtil.sizeFixed64(Span.END_TIME_UNIX_NANO, j2) + MarshalerUtil.sizeRepeatedMessage(Span.ATTRIBUTES, keyValueMarshalerArr) + MarshalerUtil.sizeUInt32(Span.DROPPED_ATTRIBUTES_COUNT, i) + MarshalerUtil.sizeRepeatedMessage(Span.EVENTS, spanEventMarshalerArr) + MarshalerUtil.sizeUInt32(Span.DROPPED_EVENTS_COUNT, i2) + MarshalerUtil.sizeRepeatedMessage(Span.LINKS, spanLinkMarshalerArr) + MarshalerUtil.sizeUInt32(Span.DROPPED_LINKS_COUNT, i3) + MarshalerUtil.sizeMessage(Span.STATUS, spanStatusMarshaler) + MarshalerUtil.sizeFixed32(Span.FLAGS, SpanFlags.withParentIsRemoteFlags(traceFlags, z));
    }

    /* renamed from: io.opentelemetry.exporter.internal.otlp.traces.SpanMarshaler$1, reason: invalid class name */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$io$opentelemetry$api$trace$SpanKind;

        static {
            int[] iArr = new int[SpanKind.values().length];
            $SwitchMap$io$opentelemetry$api$trace$SpanKind = iArr;
            try {
                iArr[SpanKind.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$trace$SpanKind[SpanKind.SERVER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$trace$SpanKind[SpanKind.CLIENT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$trace$SpanKind[SpanKind.PRODUCER.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$io$opentelemetry$api$trace$SpanKind[SpanKind.CONSUMER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
        }
    }

    static ProtoEnumInfo toProtoSpanKind(SpanKind spanKind) {
        int i = AnonymousClass1.$SwitchMap$io$opentelemetry$api$trace$SpanKind[spanKind.ordinal()];
        if (i == 1) {
            return Span.SpanKind.SPAN_KIND_INTERNAL;
        }
        if (i == 2) {
            return Span.SpanKind.SPAN_KIND_SERVER;
        }
        if (i == 3) {
            return Span.SpanKind.SPAN_KIND_CLIENT;
        }
        if (i == 4) {
            return Span.SpanKind.SPAN_KIND_PRODUCER;
        }
        if (i == 5) {
            return Span.SpanKind.SPAN_KIND_CONSUMER;
        }
        return Span.SpanKind.SPAN_KIND_UNSPECIFIED;
    }

    static byte[] encodeSpanTraceState(SpanData spanData) {
        return encodeTraceState(spanData.getSpanContext().getTraceState());
    }

    static byte[] encodeTraceState(TraceState traceState) {
        if (traceState.isEmpty()) {
            return EMPTY_BYTES;
        }
        return W3CTraceContextEncoding.encodeTraceState(traceState).getBytes(StandardCharsets.UTF_8);
    }
}
