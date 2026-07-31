package io.opentelemetry.api.common;

import java.nio.ByteBuffer;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
public interface Value<T> {
    String asString();

    ValueType getType();

    T getValue();

    static Value<String> of(String str) {
        return ValueString.create(str);
    }

    static Value<Boolean> of(boolean z) {
        return ValueBoolean.create(z);
    }

    static Value<Long> of(long j) {
        return ValueLong.create(j);
    }

    static Value<Double> of(double d) {
        return ValueDouble.create(d);
    }

    static Value<ByteBuffer> of(byte[] bArr) {
        return ValueBytes.create(bArr);
    }

    static Value<List<Value<?>>> of(Value<?>... valueArr) {
        return ValueArray.create(valueArr);
    }

    static Value<List<Value<?>>> of(List<Value<?>> list) {
        return ValueArray.create(list);
    }

    static Value<List<KeyValue>> of(KeyValue... keyValueArr) {
        return KeyValueList.create(keyValueArr);
    }

    static Value<List<KeyValue>> of(Map<String, Value<?>> map) {
        return KeyValueList.createFromMap(map);
    }
}
