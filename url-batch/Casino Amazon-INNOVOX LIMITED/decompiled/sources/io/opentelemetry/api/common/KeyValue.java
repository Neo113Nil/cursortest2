package io.opentelemetry.api.common;

/* loaded from: classes3.dex */
public interface KeyValue {
    String getKey();

    Value<?> getValue();

    static KeyValue of(String str, Value<?> value) {
        return KeyValueImpl.create(str, value);
    }
}
