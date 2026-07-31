package io.opentelemetry.api.incubator.common;

import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.internal.ImmutableKeyValuePairs;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.function.BiConsumer;
import java.util.function.Function;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
final class ArrayBackedExtendedAttributes extends ImmutableKeyValuePairs<ExtendedAttributeKey<?>, Object> implements ExtendedAttributes {

    @Nullable
    private Attributes attributes;
    private static final Comparator<ExtendedAttributeKey<?>> KEY_COMPARATOR_FOR_CONSTRUCTION = Comparator.comparing(new Function() { // from class: io.opentelemetry.api.incubator.common.ArrayBackedExtendedAttributes$$ExternalSyntheticLambda1
        @Override // java.util.function.Function
        public final Object apply(Object obj) {
            return ((ExtendedAttributeKey) obj).getKey();
        }
    });
    static final ExtendedAttributes EMPTY = ExtendedAttributes.builder().build();

    private ArrayBackedExtendedAttributes(Object[] objArr, Comparator<ExtendedAttributeKey<?>> comparator) {
        super(objArr, comparator);
    }

    ArrayBackedExtendedAttributes(Object[] objArr) {
        super(objArr);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    public ExtendedAttributesBuilder toBuilder() {
        return new ArrayBackedExtendedAttributesBuilder(new ArrayList(data()));
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    @Nullable
    public <T> T get(ExtendedAttributeKey<T> extendedAttributeKey) {
        return (T) super.get((ArrayBackedExtendedAttributes) extendedAttributeKey);
    }

    @Override // io.opentelemetry.api.incubator.common.ExtendedAttributes
    public Attributes asAttributes() {
        if (this.attributes == null) {
            final AttributesBuilder builder = Attributes.builder();
            forEach(new BiConsumer() { // from class: io.opentelemetry.api.incubator.common.ArrayBackedExtendedAttributes$$ExternalSyntheticLambda0
                @Override // java.util.function.BiConsumer
                public final void accept(Object obj, Object obj2) {
                    ArrayBackedExtendedAttributes.lambda$asAttributes$0(AttributesBuilder.this, (ExtendedAttributeKey) obj, obj2);
                }
            });
            this.attributes = builder.build();
        }
        return this.attributes;
    }

    static /* synthetic */ void lambda$asAttributes$0(AttributesBuilder attributesBuilder, ExtendedAttributeKey extendedAttributeKey, Object obj) {
        AttributeKey asAttributeKey = extendedAttributeKey.asAttributeKey();
        if (asAttributeKey != null) {
            attributesBuilder.put((AttributeKey<AttributeKey>) asAttributeKey, (AttributeKey) obj);
        }
    }

    static ExtendedAttributes sortAndFilterToAttributes(Object... objArr) {
        for (int i = 0; i < objArr.length; i += 2) {
            ExtendedAttributeKey extendedAttributeKey = (ExtendedAttributeKey) objArr[i];
            if (extendedAttributeKey != null && extendedAttributeKey.getKey().isEmpty()) {
                objArr[i] = null;
            }
        }
        return new ArrayBackedExtendedAttributes(objArr, KEY_COMPARATOR_FOR_CONSTRUCTION);
    }
}
