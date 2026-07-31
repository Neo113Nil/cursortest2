package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.exporter.internal.marshal.CodedOutputStream;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import java.io.IOException;

/* loaded from: classes3.dex */
final class IntAnyValueStatelessMarshaler implements StatelessMarshaler<Long> {
    static final IntAnyValueStatelessMarshaler INSTANCE = new IntAnyValueStatelessMarshaler();

    private IntAnyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, Long l, MarshalerContext marshalerContext) throws IOException {
        serializer.writeInt64(AnyValue.INT_VALUE, l.longValue());
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(Long l, MarshalerContext marshalerContext) {
        return AnyValue.INT_VALUE.getTagSize() + CodedOutputStream.computeInt64SizeNoTag(l.longValue());
    }
}
