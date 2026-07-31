package io.opentelemetry.api.common;

import java.util.Objects;

/* loaded from: classes3.dex */
final class ValueString implements Value<String> {
    private final String value;

    private ValueString(String str) {
        this.value = str;
    }

    static Value<String> create(String str) {
        Objects.requireNonNull(str, "value must not be null");
        return new ValueString(str);
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.STRING;
    }

    @Override // io.opentelemetry.api.common.Value
    public String getValue() {
        return this.value;
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return this.value;
    }

    public String toString() {
        return "ValueString{" + this.value + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Value) && Objects.equals(this.value, ((Value) obj).getValue());
    }

    public int hashCode() {
        return this.value.hashCode();
    }
}
