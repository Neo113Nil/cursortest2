package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.Value;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.common.v1.internal.ArrayValue;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class ArrayAnyValueStatelessMarshaler implements StatelessMarshaler<List<Value<?>>> {
    static final ArrayAnyValueStatelessMarshaler INSTANCE = new ArrayAnyValueStatelessMarshaler();

    private ArrayAnyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, List<Value<?>> list, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeRepeatedMessageWithContext(ArrayValue.VALUES, list, AnyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(List<Value<?>> list, MarshalerContext marshalerContext) {
        return StatelessMarshalerUtil.sizeRepeatedMessageWithContext(ArrayValue.VALUES, list, AnyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }
}
