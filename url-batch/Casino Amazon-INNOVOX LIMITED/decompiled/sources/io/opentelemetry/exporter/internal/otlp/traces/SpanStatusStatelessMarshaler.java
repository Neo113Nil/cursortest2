package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.trace.v1.internal.Status;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class SpanStatusStatelessMarshaler implements StatelessMarshaler<StatusData> {
    static final SpanStatusStatelessMarshaler INSTANCE = new SpanStatusStatelessMarshaler();

    private SpanStatusStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, StatusData statusData, MarshalerContext marshalerContext) throws IOException {
        ProtoEnumInfo protoSpanStatus = SpanStatusMarshaler.toProtoSpanStatus(statusData);
        serializer.serializeStringWithContext(Status.MESSAGE, statusData.getDescription(), marshalerContext);
        serializer.serializeEnum(Status.CODE, protoSpanStatus);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(StatusData statusData, MarshalerContext marshalerContext) {
        return StatelessMarshalerUtil.sizeStringWithContext(Status.MESSAGE, statusData.getDescription(), marshalerContext) + MarshalerUtil.sizeEnum(Status.CODE, SpanStatusMarshaler.toProtoSpanStatus(statusData));
    }
}
