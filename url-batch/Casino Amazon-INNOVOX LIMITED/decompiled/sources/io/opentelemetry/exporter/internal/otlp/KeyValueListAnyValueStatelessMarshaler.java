package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.KeyValue;
import io.opentelemetry.exporter.internal.marshal.MarshalerContext;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshaler;
import io.opentelemetry.exporter.internal.marshal.StatelessMarshalerUtil;
import io.opentelemetry.proto.common.v1.internal.KeyValueList;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class KeyValueListAnyValueStatelessMarshaler implements StatelessMarshaler<List<KeyValue>> {
    static final KeyValueListAnyValueStatelessMarshaler INSTANCE = new KeyValueListAnyValueStatelessMarshaler();

    private KeyValueListAnyValueStatelessMarshaler() {
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public void writeTo(Serializer serializer, List<KeyValue> list, MarshalerContext marshalerContext) throws IOException {
        serializer.serializeRepeatedMessageWithContext(KeyValueList.VALUES, list, KeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }

    @Override // io.opentelemetry.exporter.internal.marshal.StatelessMarshaler
    public int getBinarySerializedSize(List<KeyValue> list, MarshalerContext marshalerContext) {
        return StatelessMarshalerUtil.sizeRepeatedMessageWithContext(KeyValueList.VALUES, list, KeyValueStatelessMarshaler.INSTANCE, marshalerContext);
    }
}
