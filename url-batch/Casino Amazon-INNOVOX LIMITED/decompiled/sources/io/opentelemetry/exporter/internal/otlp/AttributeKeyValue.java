package io.opentelemetry.exporter.internal.otlp;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import java.util.ArrayList;
import java.util.List;
import java.util.function.BiConsumer;

/* loaded from: classes3.dex */
public interface AttributeKeyValue<T> {
    AttributeKey<T> getAttributeKey();

    T getValue();

    static <T> AttributeKeyValue<T> of(AttributeKey<T> attributeKey, T t) {
        return AttributeKeyValueImpl.create(attributeKey, t);
    }

    static <T> List<AttributeKeyValue<?>> of(Attributes attributes) {
        final ArrayList arrayList = new ArrayList(attributes.size());
        attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.exporter.internal.otlp.AttributeKeyValue$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                arrayList.add(AttributeKeyValue.of((AttributeKey) obj, obj2));
            }
        });
        return arrayList;
    }
}
