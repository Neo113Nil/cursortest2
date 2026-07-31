package io.opentelemetry.api.common;

import java.util.Objects;

/* loaded from: classes3.dex */
final class ValueBoolean implements Value<Boolean> {
    private final boolean value;

    private ValueBoolean(boolean z) {
        this.value = z;
    }

    static Value<Boolean> create(boolean z) {
        return new ValueBoolean(z);
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.BOOLEAN;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.api.common.Value
    public Boolean getValue() {
        return Boolean.valueOf(this.value);
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return String.valueOf(this.value);
    }

    public String toString() {
        return "ValueBoolean{" + asString() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Value) && Objects.equals(Boolean.valueOf(this.value), ((Value) obj).getValue());
    }

    public int hashCode() {
        return Boolean.hashCode(this.value);
    }
}
