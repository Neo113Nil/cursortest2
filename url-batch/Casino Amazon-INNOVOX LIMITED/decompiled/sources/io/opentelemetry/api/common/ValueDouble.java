package io.opentelemetry.api.common;

import java.util.Objects;

/* loaded from: classes3.dex */
final class ValueDouble implements Value<Double> {
    private final double value;

    private ValueDouble(double d) {
        this.value = d;
    }

    static Value<Double> create(double d) {
        return new ValueDouble(d);
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.DOUBLE;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // io.opentelemetry.api.common.Value
    public Double getValue() {
        return Double.valueOf(this.value);
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return String.valueOf(this.value);
    }

    public String toString() {
        return "ValueDouble{" + asString() + "}";
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof Value) && Objects.equals(Double.valueOf(this.value), ((Value) obj).getValue());
    }

    public int hashCode() {
        return Double.hashCode(this.value);
    }
}
