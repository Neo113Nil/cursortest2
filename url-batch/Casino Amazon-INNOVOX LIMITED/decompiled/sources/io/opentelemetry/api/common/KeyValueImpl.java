package io.opentelemetry.api.common;

/* loaded from: classes3.dex */
abstract class KeyValueImpl implements KeyValue {
    KeyValueImpl() {
    }

    static KeyValueImpl create(String str, Value<?> value) {
        return new AutoValue_KeyValueImpl(str, value);
    }
}
