package io.opentelemetry.api.incubator.common;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import java.util.Map;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExtendedAttributes {
    Attributes asAttributes();

    Map<ExtendedAttributeKey<?>, Object> asMap();

    void forEach(BiConsumer<? super ExtendedAttributeKey<?>, ? super Object> biConsumer);

    @Nullable
    <T> T get(ExtendedAttributeKey<T> extendedAttributeKey);

    boolean isEmpty();

    int size();

    ExtendedAttributesBuilder toBuilder();

    @Nullable
    default <T> T get(AttributeKey<T> attributeKey) {
        if (attributeKey == null) {
            return null;
        }
        return (T) get(ExtendedAttributeKey.fromAttributeKey(attributeKey));
    }

    static ExtendedAttributes empty() {
        return ArrayBackedExtendedAttributes.EMPTY;
    }

    static ExtendedAttributesBuilder builder() {
        return new ArrayBackedExtendedAttributesBuilder();
    }
}
