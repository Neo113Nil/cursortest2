package io.opentelemetry.api.common;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.stream.Collectors;

/* loaded from: classes3.dex */
final class KeyValueList implements Value<List<KeyValue>> {
    private final List<KeyValue> value;

    private KeyValueList(List<KeyValue> list) {
        this.value = list;
    }

    static Value<List<KeyValue>> create(KeyValue... keyValueArr) {
        Objects.requireNonNull(keyValueArr, "value must not be null");
        ArrayList arrayList = new ArrayList(keyValueArr.length);
        arrayList.addAll(Arrays.asList(keyValueArr));
        return new KeyValueList(Collections.unmodifiableList(arrayList));
    }

    static Value<List<KeyValue>> createFromMap(Map<String, Value<?>> map) {
        Objects.requireNonNull(map, "value must not be null");
        return create((KeyValue[]) map.entrySet().stream().map(new Function() { // from class: io.opentelemetry.api.common.KeyValueList$$ExternalSyntheticLambda1
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                KeyValue of;
                of = KeyValue.of((String) r1.getKey(), (Value) ((Map.Entry) obj).getValue());
                return of;
            }
        }).toArray(new IntFunction() { // from class: io.opentelemetry.api.common.KeyValueList$$ExternalSyntheticLambda2
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return KeyValueList.lambda$createFromMap$1(i);
            }
        }));
    }

    static /* synthetic */ KeyValue[] lambda$createFromMap$1(int i) {
        return new KeyValue[i];
    }

    @Override // io.opentelemetry.api.common.Value
    public ValueType getType() {
        return ValueType.KEY_VALUE_LIST;
    }

    @Override // io.opentelemetry.api.common.Value
    public List<KeyValue> getValue() {
        return this.value;
    }

    @Override // io.opentelemetry.api.common.Value
    public String asString() {
        return (String) this.value.stream().map(new Function() { // from class: io.opentelemetry.api.common.KeyValueList$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                return KeyValueList.lambda$asString$2((KeyValue) obj);
            }
        }).collect(Collectors.joining(", ", "[", "]"));
    }

    static /* synthetic */ String lambda$asString$2(KeyValue keyValue) {
        return keyValue.getKey() + "=" + keyValue.getValue().asString();
    }

    public String toString() {
        return "KeyValueList{" + asString() + "}";
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
