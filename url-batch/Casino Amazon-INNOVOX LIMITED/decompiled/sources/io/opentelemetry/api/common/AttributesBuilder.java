package io.opentelemetry.api.common;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface AttributesBuilder {
    Attributes build();

    <T> AttributesBuilder put(AttributeKey<Long> attributeKey, int i);

    <T> AttributesBuilder put(AttributeKey<T> attributeKey, @Nullable T t);

    AttributesBuilder putAll(Attributes attributes);

    default <T> AttributesBuilder remove(AttributeKey<T> attributeKey) {
        return this;
    }

    default AttributesBuilder removeIf(Predicate<AttributeKey<?>> predicate) {
        return this;
    }

    default AttributesBuilder put(String str, @Nullable String str2) {
        return put((AttributeKey<AttributeKey<String>>) AttributeKey.stringKey(str), (AttributeKey<String>) str2);
    }

    default AttributesBuilder put(String str, long j) {
        return put((AttributeKey<AttributeKey<Long>>) AttributeKey.longKey(str), (AttributeKey<Long>) Long.valueOf(j));
    }

    default AttributesBuilder put(String str, double d) {
        return put((AttributeKey<AttributeKey<Double>>) AttributeKey.doubleKey(str), (AttributeKey<Double>) Double.valueOf(d));
    }

    default AttributesBuilder put(String str, boolean z) {
        return put((AttributeKey<AttributeKey<Boolean>>) AttributeKey.booleanKey(str), (AttributeKey<Boolean>) Boolean.valueOf(z));
    }

    default AttributesBuilder put(String str, String... strArr) {
        return strArr == null ? this : put((AttributeKey<AttributeKey<List<String>>>) AttributeKey.stringArrayKey(str), (AttributeKey<List<String>>) Arrays.asList(strArr));
    }

    default <T> AttributesBuilder put(AttributeKey<List<T>> attributeKey, T... tArr) {
        return tArr == null ? this : put((AttributeKey<AttributeKey<List<T>>>) attributeKey, (AttributeKey<List<T>>) Arrays.asList(tArr));
    }

    default AttributesBuilder put(String str, long... jArr) {
        return jArr == null ? this : put((AttributeKey<AttributeKey<List<Long>>>) AttributeKey.longArrayKey(str), (AttributeKey<List<Long>>) ArrayBackedAttributesBuilder.toList(jArr));
    }

    default AttributesBuilder put(String str, double... dArr) {
        return dArr == null ? this : put((AttributeKey<AttributeKey<List<Double>>>) AttributeKey.doubleArrayKey(str), (AttributeKey<List<Double>>) ArrayBackedAttributesBuilder.toList(dArr));
    }

    default AttributesBuilder put(String str, boolean... zArr) {
        return zArr == null ? this : put((AttributeKey<AttributeKey<List<Boolean>>>) AttributeKey.booleanArrayKey(str), (AttributeKey<List<Boolean>>) ArrayBackedAttributesBuilder.toList(zArr));
    }
}
