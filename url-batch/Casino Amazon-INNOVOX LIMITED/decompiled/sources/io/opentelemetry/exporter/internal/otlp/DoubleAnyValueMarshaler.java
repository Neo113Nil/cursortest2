package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class DoubleAnyValueMarshaler extends MarshalerWithSize {
    private final double value;

    private DoubleAnyValueMarshaler(double d) {
        super(calculateSize(d));
        this.value = d;
    }

    static MarshalerWithSize create(double d) {
        return new DoubleAnyValueMarshaler(d);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.writeDouble(AnyValue.DOUBLE_VALUE, this.value);
    }

    private static int calculateSize(double d) {
        return AnyValue.DOUBLE_VALUE.getTagSize() + CodedOutputStream.computeDoubleSizeNoTag(d);
    }
}
