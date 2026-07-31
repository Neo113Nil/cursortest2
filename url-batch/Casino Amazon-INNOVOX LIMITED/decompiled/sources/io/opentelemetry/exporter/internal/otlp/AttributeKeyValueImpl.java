package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.AttributeKey;

/* loaded from: classes3.dex */
abstract class AttributeKeyValueImpl<T> implements AttributeKeyValue<T> {
    AttributeKeyValueImpl() {
    }

    static <T> AttributeKeyValueImpl<T> create(AttributeKey<T> attributeKey, T t) {
        return new AutoValue_AttributeKeyValueImpl(attributeKey, t);
    }
}
