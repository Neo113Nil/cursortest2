package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class BoolAnyValueMarshaler extends MarshalerWithSize {
    private final boolean value;

    private BoolAnyValueMarshaler(boolean z) {
        super(calculateSize(z));
        this.value = z;
    }

    static MarshalerWithSize create(boolean z) {
        return new BoolAnyValueMarshaler(z);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.writeBool(AnyValue.BOOL_VALUE, this.value);
    }

    private static int calculateSize(boolean z) {
        return AnyValue.BOOL_VALUE.getTagSize() + CodedOutputStream.computeBoolSizeNoTag(z);
    }
}
