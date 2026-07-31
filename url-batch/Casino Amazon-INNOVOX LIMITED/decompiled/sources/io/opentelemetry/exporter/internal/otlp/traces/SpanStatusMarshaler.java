package io.opentelemetry.exporter.internal.otlp.traces;

import io.opentelemetry.api.trace.StatusCode;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.ProtoEnumInfo;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.trace.v1.internal.Status;
import io.opentelemetry.sdk.trace.data.StatusData;
import java.io.IOException;

/* loaded from: classes3.dex */
final class SpanStatusMarshaler extends MarshalerWithSize {
    private final byte[] descriptionUtf8;
    private final ProtoEnumInfo protoStatusCode;

    static SpanStatusMarshaler create(StatusData statusData) {
        return new SpanStatusMarshaler(toProtoSpanStatus(statusData), MarshalerUtil.toBytes(statusData.getDescription()));
    }

    private SpanStatusMarshaler(ProtoEnumInfo protoEnumInfo, byte[] bArr) {
        super(computeSize(protoEnumInfo, bArr));
        this.protoStatusCode = protoEnumInfo;
        this.descriptionUtf8 = bArr;
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeString(Status.MESSAGE, this.descriptionUtf8);
        serializer.serializeEnum(Status.CODE, this.protoStatusCode);
    }

    private static int computeSize(ProtoEnumInfo protoEnumInfo, byte[] bArr) {
        return MarshalerUtil.sizeBytes(Status.MESSAGE, bArr) + MarshalerUtil.sizeEnum(Status.CODE, protoEnumInfo);
    }

    static ProtoEnumInfo toProtoSpanStatus(StatusData statusData) {
        ProtoEnumInfo protoEnumInfo = Status.StatusCode.STATUS_CODE_UNSET;
        if (statusData.getStatusCode() == StatusCode.OK) {
            return Status.StatusCode.STATUS_CODE_OK;
        }
        return statusData.getStatusCode() == StatusCode.ERROR ? Status.StatusCode.STATUS_CODE_ERROR : protoEnumInfo;
    }
}
