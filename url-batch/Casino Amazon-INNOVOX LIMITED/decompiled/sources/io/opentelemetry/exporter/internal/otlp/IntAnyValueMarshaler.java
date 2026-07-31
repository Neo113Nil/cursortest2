package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class IntAnyValueMarshaler extends MarshalerWithSize {
    private final long value;

    private IntAnyValueMarshaler(long j) {
        super(calculateSize(j));
        this.value = j;
    }

    static MarshalerWithSize create(long j) {
        return new IntAnyValueMarshaler(j);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.writeInt64(AnyValue.INT_VALUE, this.value);
    }

    private static int calculateSize(long j) {
        return AnyValue.INT_VALUE.getTagSize() + CodedOutputStream.computeInt64SizeNoTag(j);
    }
}
