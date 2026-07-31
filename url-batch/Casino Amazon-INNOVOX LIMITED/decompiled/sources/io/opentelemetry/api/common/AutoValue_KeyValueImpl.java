package io.opentelemetry.api.common;

/* loaded from: classes3.dex */
final class AutoValue_KeyValueImpl extends KeyValueImpl {
    private final String key;
    private final Value<?> value;

    AutoValue_KeyValueImpl(String str, Value<?> value) {
        if (str == null) {
            throw new NullPointerException("Null key");
        }
        this.key = str;
        if (value == null) {
            throw new NullPointerException("Null value");
        }
        this.value = value;
    }

    @Override // io.opentelemetry.api.common.KeyValue
    public String getKey() {
        return this.key;
    }

    @Override // io.opentelemetry.api.common.KeyValue
    public Value<?> getValue() {
        return this.value;
    }

    public String toString() {
        return "KeyValueImpl{key=" + this.key + ", value=" + this.value + "}";
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof KeyValueImpl) {
            KeyValueImpl keyValueImpl = (KeyValueImpl) obj;
            if (this.key.equals(keyValueImpl.getKey()) && this.value.equals(keyValueImpl.getValue())) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return ((this.key.hashCode() ^ 1000003) * 1000003) ^ this.value.hashCode();
    }
}
