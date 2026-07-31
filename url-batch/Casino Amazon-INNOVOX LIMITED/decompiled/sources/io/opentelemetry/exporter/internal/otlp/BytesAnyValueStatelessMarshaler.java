package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;
import java.nio.ByteBuffer;

/* loaded from: classes3.dex */
final class BytesAnyValueStatelessMarshaler implements StatelessMarshaler<ByteBuffer> {
    static final BytesAnyValueStatelessMarshaler INSTANCE = new BytesAnyValueStatelessMarshaler();

    private BytesAnyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, ByteBuffer byteBuffer, MarshalerContext marshalerContext) throws IOException {
        serializer.writeBytes(AnyValue.BYTES_VALUE, (byte[]) marshalerContext.getData(byte[].class));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(ByteBuffer byteBuffer, MarshalerContext marshalerContext) {
        byte[] bArr = new byte[byteBuffer.remaining()];
        byteBuffer.get(bArr);
        marshalerContext.addData(bArr);
        return AnyValue.BYTES_VALUE.getTagSize() + CodedOutputStream.computeByteArraySizeNoTag(bArr);
    }
}
