package io.opentelemetry.api.incubator.common;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

/* loaded from: classes3.dex */
public interface ExtendedAttributesBuilder {
    ExtendedAttributes build();

    <T> ExtendedAttributesBuilder put(ExtendedAttributeKey<T> extendedAttributeKey, T t);

    ExtendedAttributesBuilder removeIf(Predicate<ExtendedAttributeKey<?>> predicate);

    default <T> ExtendedAttributesBuilder put(AttributeKey<T> attributeKey, T t) {
        return (attributeKey == null || attributeKey.getKey().isEmpty() || t == null) ? this : put((ExtendedAttributeKey<ExtendedAttributeKey<T>>) ExtendedAttributeKey.fromAttributeKey(attributeKey), (ExtendedAttributeKey<T>) t);
    }

    default ExtendedAttributesBuilder put(String str, String str2) {
        return put((ExtendedAttributeKey<ExtendedAttributeKey<String>>) ExtendedAttributeKey.stringKey(str), (ExtendedAttributeKey<String>) str2);
    }

    default ExtendedAttributesBuilder put(String str, long j) {
        return put((ExtendedAttributeKey<ExtendedAttributeKey<Long>>) ExtendedAttributeKey.longKey(str), (ExtendedAttributeKey<Long>) Long.valueOf(j));
    }

    default ExtendedAttributesBuilder put(String str, double d) {
        return put((ExtendedAttributeKey<ExtendedAttributeKey<Double>>) ExtendedAttributeKey.doubleKey(str), (ExtendedAttributeKey<Double>) Double.valueOf(d));
    }

    default ExtendedAttributesBuilder put(String str, boolean z) {
        return put((ExtendedAttributeKey<ExtendedAttributeKey<Boolean>>) ExtendedAttributeKey.booleanKey(str), (ExtendedAttributeKey<Boolean>) Boolean.valueOf(z));
    }

    default <T> ExtendedAttributesBuilder put(String str, ExtendedAttributes extendedAttributes) {
        return put((ExtendedAttributeKey<ExtendedAttributeKey<ExtendedAttributes>>) ExtendedAttributeKey.extendedAttributesKey(str), (ExtendedAttributeKey<ExtendedAttributes>) extendedAttributes);
    }

    default ExtendedAttributesBuilder put(String str, String... strArr) {
        return strArr == null ? this : put((ExtendedAttributeKey<ExtendedAttributeKey<List<String>>>) ExtendedAttributeKey.stringArrayKey(str), (ExtendedAttributeKey<List<String>>) Arrays.asList(strArr));
    }

    default <T> ExtendedAttributesBuilder put(AttributeKey<List<T>> attributeKey, T... tArr) {
        return tArr == null ? this : put((AttributeKey<AttributeKey<List<T>>>) attributeKey, (AttributeKey<List<T>>) Arrays.asList(tArr));
    }

    default ExtendedAttributesBuilder put(String str, long... jArr) {
        return jArr == null ? this : put((ExtendedAttributeKey<ExtendedAttributeKey<List<Long>>>) ExtendedAttributeKey.longArrayKey(str), (ExtendedAttributeKey<List<Long>>) ArrayBackedExtendedAttributesBuilder.toList(jArr));
    }

    default ExtendedAttributesBuilder put(String str, double... dArr) {
        return dArr == null ? this : put((ExtendedAttributeKey<ExtendedAttributeKey<List<Double>>>) ExtendedAttributeKey.doubleArrayKey(str), (ExtendedAttributeKey<List<Double>>) ArrayBackedExtendedAttributesBuilder.toList(dArr));
    }

    default ExtendedAttributesBuilder put(String str, boolean... zArr) {
        return zArr == null ? this : put((ExtendedAttributeKey<ExtendedAttributeKey<List<Boolean>>>) ExtendedAttributeKey.booleanArrayKey(str), (ExtendedAttributeKey<List<Boolean>>) ArrayBackedExtendedAttributesBuilder.toList(zArr));
    }

    default ExtendedAttributesBuilder putAll(Attributes attributes) {
        if (attributes == null) {
            return this;
        }
        attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.common.ExtendedAttributesBuilder$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ExtendedAttributesBuilder.this.put((AttributeKey<AttributeKey<AttributeKey>>) ((AttributeKey<AttributeKey>) obj), (AttributeKey<AttributeKey>) ((AttributeKey) obj2));
            }
        });
        return this;
    }

    default ExtendedAttributesBuilder putAll(ExtendedAttributes extendedAttributes) {
        if (extendedAttributes == null) {
            return this;
        }
        extendedAttributes.forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.common.ExtendedAttributesBuilder$$ExternalSyntheticLambda2
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ExtendedAttributesBuilder.this.put((ExtendedAttributeKey<ExtendedAttributeKey<ExtendedAttributeKey>>) ((ExtendedAttributeKey<ExtendedAttributeKey>) obj), (ExtendedAttributeKey<ExtendedAttributeKey>) ((ExtendedAttributeKey) obj2));
            }
        });
        return this;
    }

    default <T> ExtendedAttributesBuilder remove(AttributeKey<T> attributeKey) {
        return remove(ExtendedAttributeKey.fromAttributeKey(attributeKey));
    }

    default <T> ExtendedAttributesBuilder remove(final ExtendedAttributeKey<T> extendedAttributeKey) {
        return (extendedAttributeKey == null || extendedAttributeKey.getKey().isEmpty()) ? this : removeIf(new Predicate() { // from class: io.opentelemetry.api.incubator.common.ExtendedAttributesBuilder$$ExternalSyntheticLambda1
            @Override // java.util.function.Predicate
            public final boolean test(Object obj) {
                return ExtendedAttributesBuilder.lambda$remove$2(ExtendedAttributeKey.this, (ExtendedAttributeKey) obj);
            }
        });
    }

    static /* synthetic */ boolean lambda$remove$2(ExtendedAttributeKey extendedAttributeKey, ExtendedAttributeKey extendedAttributeKey2) {
        return extendedAttributeKey.getKey().equals(extendedAttributeKey2.getKey()) && extendedAttributeKey.getType().equals(extendedAttributeKey2.getType());
    }
}
