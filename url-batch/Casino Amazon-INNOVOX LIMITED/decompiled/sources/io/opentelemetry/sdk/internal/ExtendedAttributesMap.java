package io.opentelemetry.sdk.internal;

import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.incubator.common.ExtendedAttributeKey;
import io.opentelemetry.api.incubator.common.ExtendedAttributes;
import io.opentelemetry.api.incubator.common.ExtendedAttributesBuilder;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class ExtendedAttributesMap extends HashMap<ExtendedAttributeKey<?>, Object> implements ExtendedAttributes {
    private static final long serialVersionUID = -2674974862318200501L;
    private final long capacity;
    private final int lengthLimit;
    private int totalAddedValues = 0;

    private ExtendedAttributesMap(long j, int i) {
        this.capacity = j;
        this.lengthLimit = i;
    }

    public static ExtendedAttributesMap create(long j, int i) {
        return new ExtendedAttributesMap(j, i);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    @Nullable
    public Object put(ExtendedAttributeKey<?> extendedAttributeKey, @Nullable Object obj) {
        if (obj == null) {
            return null;
        }
        this.totalAddedValues++;
        if (size() < this.capacity || containsKey(extendedAttributeKey)) {
            return super.put((ExtendedAttributesMap) extendedAttributeKey, (ExtendedAttributeKey<?>) AttributeUtil.applyAttributeLengthLimit(obj, this.lengthLimit));
        }
        return null;
    }

    public <T> void putIfCapacity(ExtendedAttributeKey<T> extendedAttributeKey, @Nullable T t) {
        put((ExtendedAttributeKey<?>) extendedAttributeKey, (Object) t);
    }

    public int getTotalAddedValues() {
        return this.totalAddedValues;
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    @Nullable
    public <T> T get(ExtendedAttributeKey<T> extendedAttributeKey) {
        return (T) super.get((Object) extendedAttributeKey);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    public Map<ExtendedAttributeKey<?>, Object> asMap() {
        return Collections.unmodifiableMap(this);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    public ExtendedAttributesBuilder toBuilder() {
        return ExtendedAttributes.builder().putAll(this);
    }

    @Override // java.util.HashMap, java.util.Map, io.opentelemetry.api.incubator.common.ExtendedAttributes
    public void forEach(BiConsumer<? super ExtendedAttributeKey<?>, ? super Object> biConsumer) {
        super.forEach(biConsumer);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    public Attributes asAttributes() {
        return immutableCopy().asAttributes();
    }

    @Override // java.util.AbstractMap
    public String toString() {
        return "ExtendedAttributesMap{data=" + super.toString() + ", capacity=" + this.capacity + ", totalAddedValues=" + this.totalAddedValues + AbstractJsonLexerKt.END_OBJ;
    }

    public ExtendedAttributes immutableCopy() {
        return ExtendedAttributes.builder().putAll(this).build();
    }
}
