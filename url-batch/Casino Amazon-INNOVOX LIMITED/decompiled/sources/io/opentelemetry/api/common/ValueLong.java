package io.opentelemetry.api.common;

import java.util.Objects;

/* loaded from: classes3.dex */
final class ValueLong implements Value<Long> {
    private final long value;

    private ValueLong(long j) {
        this.value = j;
    }

    static Value<Long> create(long j) {
        return new ValueLong(j);
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.LONG;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.api.common.Value
    public Long getValue() {
        return Long.valueOf(this.value);
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return String.valueOf(this.value);
    }

    public String toString() {
        return "ValueLong{" + asString() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Value) && Objects.equals(Long.valueOf(this.value), ((Value) obj).getValue());
    }

    public int hashCode() {
        return Long.hashCode(this.value);
    }
}
