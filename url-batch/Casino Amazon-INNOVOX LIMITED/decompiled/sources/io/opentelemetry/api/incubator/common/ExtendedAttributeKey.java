package io.opentelemetry.api.incubator.common;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.incubator.internal.InternalExtendedAttributeKeyImpl;
import java.util.List;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
public interface ExtendedAttributeKey<T> {
    String getKey();

    ExtendedAttributeType getType();

    @Nullable
    default AttributeKey<T> asAttributeKey() {
        return InternalExtendedAttributeKeyImpl.toAttributeKey(this);
    }

    static <T> ExtendedAttributeKey<T> fromAttributeKey(AttributeKey<T> attributeKey) {
        return InternalExtendedAttributeKeyImpl.toExtendedAttributeKey(attributeKey);
    }

    static ExtendedAttributeKey<String> stringKey(String str) {
        return fromAttributeKey(AttributeKey.stringKey(str));
    }

    static ExtendedAttributeKey<Boolean> booleanKey(String str) {
        return fromAttributeKey(AttributeKey.booleanKey(str));
    }

    static ExtendedAttributeKey<Long> longKey(String str) {
        return fromAttributeKey(AttributeKey.longKey(str));
    }

    static ExtendedAttributeKey<Double> doubleKey(String str) {
        return fromAttributeKey(AttributeKey.doubleKey(str));
    }

    static ExtendedAttributeKey<List<String>> stringArrayKey(String str) {
        return fromAttributeKey(AttributeKey.stringArrayKey(str));
    }

    static ExtendedAttributeKey<List<Boolean>> booleanArrayKey(String str) {
        return fromAttributeKey(AttributeKey.booleanArrayKey(str));
    }

    static ExtendedAttributeKey<List<Long>> longArrayKey(String str) {
        return fromAttributeKey(AttributeKey.longArrayKey(str));
    }

    static ExtendedAttributeKey<List<Double>> doubleArrayKey(String str) {
        return fromAttributeKey(AttributeKey.doubleArrayKey(str));
    }

    static ExtendedAttributeKey<ExtendedAttributes> extendedAttributesKey(String str) {
        return InternalExtendedAttributeKeyImpl.create(str, ExtendedAttributeType.EXTENDED_ATTRIBUTES);
    }
}
