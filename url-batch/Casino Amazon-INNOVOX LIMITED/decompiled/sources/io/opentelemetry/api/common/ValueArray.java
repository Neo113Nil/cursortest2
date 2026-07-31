package io.opentelemetry.api.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Objects;
import java.util.function.Function;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
final class ValueArray implements Value<List<Value<?>>> {
    private final List<Value<?>> value;

    private ValueArray(List<Value<?>> list) {
        this.value = list;
    }

    static Value<List<Value<?>>> create(Value<?>... valueArr) {
        Objects.requireNonNull(valueArr, "value must not be null");
        ArrayList arrayList = new ArrayList(valueArr.length);
        arrayList.addAll(Arrays.asList(valueArr));
        return new ValueArray(Collections.unmodifiableList(arrayList));
    }

    static Value<List<Value<?>>> create(List<Value<?>> list) {
        return new ValueArray(Collections.unmodifiableList(list));
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.ARRAY;
    }

    @Override // io.opentelemetry.api.common.Value
    public List<Value<?>> getValue() {
        return this.value;
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return (String) this.value.stream().map(new Function() { // from class: io.opentelemetry.api.common.ValueArray$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return ((Value) obj).asString();
            }
        }).collect(Collectors.joining(", ", "[", "]"));
    }

    public String toString() {
        return "ValueArray{" + asString() + "}";
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
