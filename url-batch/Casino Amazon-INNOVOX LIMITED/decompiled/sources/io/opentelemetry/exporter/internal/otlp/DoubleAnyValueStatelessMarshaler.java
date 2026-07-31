package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class DoubleAnyValueStatelessMarshaler implements StatelessMarshaler<Double> {
    static final DoubleAnyValueStatelessMarshaler INSTANCE = new DoubleAnyValueStatelessMarshaler();

    private DoubleAnyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, Double d, MarshalerContext marshalerContext) throws IOException {
        serializer.writeDouble(AnyValue.DOUBLE_VALUE, d.doubleValue());
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(Double d, MarshalerContext marshalerContext) {
        return AnyValue.DOUBLE_VALUE.getTagSize() + CodedOutputStream.computeDoubleSizeNoTag(d.doubleValue());
    }
}
