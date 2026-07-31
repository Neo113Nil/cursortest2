package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class BytesAnyValueMarshaler extends MarshalerWithSize {
    private final byte[] value;

    private BytesAnyValueMarshaler(byte[] bArr) {
        super(calculateSize(bArr));
        this.value = bArr;
    }

    static MarshalerWithSize create(ByteBuffer byteBuffer) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        return new BytesAnyValueMarshaler(bArr);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.writeBytes(AnyValue.BYTES_VALUE, this.value);
    }

    private static int calculateSize(byte[] bArr) {
        return AnyValue.BYTES_VALUE.getTagSize() + CodedOutputStream.computeByteArraySizeNoTag(bArr);
    }
}
