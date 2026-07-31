package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class StringAnyValueMarshaler extends MarshalerWithSize {
    private final byte[] valueUtf8;

    private StringAnyValueMarshaler(byte[] bArr) {
        super(calculateSize(bArr));
        this.valueUtf8 = bArr;
    }

    static MarshalerWithSize create(String str) {
        return new StringAnyValueMarshaler(MarshalerUtil.toBytes(str));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        if (this.valueUtf8.length == 0) {
            return;
        }
        serializer.writeString(AnyValue.STRING_VALUE, this.valueUtf8);
    }

    private static int calculateSize(byte[] bArr) {
        if (bArr.length == 0) {
            return 0;
        }
        return AnyValue.STRING_VALUE.getTagSize() + CodedOutputStream.computeByteArraySizeNoTag(bArr);
    }
}
