package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.KeyValue;
import io.opentelemetry.exporter.internal.marshal.Marshaler;
import io.opentelemetry.exporter.internal.marshal.MarshalerUtil;
import io.opentelemetry.exporter.internal.marshal.MarshalerWithSize;
import io.opentelemetry.exporter.internal.marshal.Serializer;
import io.opentelemetry.proto.common.v1.internal.AnyValue;
import io.opentelemetry.proto.common.v1.internal.KeyValueList;
import java.io.IOException;
import java.util.List;

/* loaded from: classes3.dex */
final class KeyValueListAnyValueMarshaler extends MarshalerWithSize {
    private final Marshaler value;

    KeyValueListAnyValueMarshaler(KeyValueListMarshaler keyValueListMarshaler) {
        super(calculateSize(keyValueListMarshaler));
        this.value = keyValueListMarshaler;
    }

    static MarshalerWithSize create(List<KeyValue> list) {
        int size = list.size();
        KeyValueMarshaler[] keyValueMarshalerArr = new KeyValueMarshaler[list.size()];
        for (int i = 0; i < size; i++) {
            keyValueMarshalerArr[i] = KeyValueMarshaler.createForKeyValue(list.get(i));
        }
        return new KeyValueListAnyValueMarshaler(new KeyValueListMarshaler(keyValueMarshalerArr));
    }

    @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
    public void writeTo(Serializer serializer) throws IOException {
        serializer.serializeMessage(AnyValue.KVLIST_VALUE, this.value);
    }

    private static int calculateSize(Marshaler marshaler) {
        return MarshalerUtil.sizeMessage(AnyValue.KVLIST_VALUE, marshaler);
    }

    static class KeyValueListMarshaler extends MarshalerWithSize {
        private final Marshaler[] values;

        KeyValueListMarshaler(KeyValueMarshaler[] keyValueMarshalerArr) {
            super(calculateSize(keyValueMarshalerArr));
            this.values = keyValueMarshalerArr;
        }

        @Override // io.opentelemetry.exporter.internal.marshal.Marshaler
        public void writeTo(Serializer serializer) throws IOException {
            serializer.serializeRepeatedMessage(KeyValueList.VALUES, this.values);
        }

        private static int calculateSize(Marshaler[] marshalerArr) {
            return MarshalerUtil.sizeRepeatedMessage(KeyValueList.VALUES, marshalerArr);
        }
    }
}
