package io.opentelemetry.sdk.metrics.internal.view;

import io.appmetrica.analytics.coreutils.internal.StringUtils;
import io.opentelemetry.api.common.AttributeKey;
import io.opentelemetry.api.common.Attributes;
import io.opentelemetry.api.common.AttributesBuilder;
import io.opentelemetry.api.internal.ImmutableKeyValuePairs;
import java.util.BitSet;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.StringJoiner;
import java.util.function.BiConsumer;
import javax.annotation.Nullable;

/* loaded from: classes3.dex */
abstract class FilteredAttributes implements Attributes {
    private final int hashcode;
    private final int size;
    private final Object[] sourceData;

    abstract boolean includeIndexInOutput(int i);

    @Override // io.opentelemetry.api.common.Attributes
    public boolean isEmpty() {
        return false;
    }

    private FilteredAttributes(Object[] objArr, int i, int i2) {
        this.sourceData = objArr;
        this.hashcode = i;
        this.size = i2;
    }

    static Attributes create(Attributes attributes, Set<AttributeKey<?>> set) {
        if (!(attributes instanceof ImmutableKeyValuePairs)) {
            attributes = convertToStandardImplementation(attributes);
        }
        if (!(attributes instanceof ImmutableKeyValuePairs)) {
            throw new IllegalStateException("Expected ImmutableKeyValuePairs based implementation of Attributes. This is a programming error.");
        }
        Object[] data = ((ImmutableKeyValuePairs) attributes).getData();
        BitSet bitSet = attributes.size() > 32 ? new BitSet(attributes.size()) : null;
        int i = 0;
        int i2 = 1;
        int i3 = 0;
        for (int i4 = 0; i4 < data.length; i4 += 2) {
            int i5 = i4 / 2;
            if (set.contains(data[i4])) {
                i2 = (((i2 * 31) + data[i4].hashCode()) * 31) + data[i4 + 1].hashCode();
                i++;
            } else if (bitSet != null) {
                bitSet.set(i5);
            } else {
                i3 |= 1 << i5;
            }
        }
        if (i == 0) {
            return Attributes.empty();
        }
        if (bitSet != null) {
            return new RegularFilteredAttributes(data, i2, i, bitSet);
        }
        return new SmallFilteredAttributes(data, i2, i, i3);
    }

    private static class SmallFilteredAttributes extends FilteredAttributes {
        private static final int BITS_PER_INTEGER = 32;
        private final int filteredIndices;

        private SmallFilteredAttributes(Object[] objArr, int i, int i2, int i3) {
            super(objArr, i, i2);
            this.filteredIndices = i3;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.FilteredAttributes
        boolean includeIndexInOutput(int i) {
            return ((1 << (i / 2)) & this.filteredIndices) == 0;
        }
    }

    private static class RegularFilteredAttributes extends FilteredAttributes {
        private final BitSet bitSet;

        private RegularFilteredAttributes(Object[] objArr, int i, int i2, BitSet bitSet) {
            super(objArr, i, i2);
            this.bitSet = bitSet;
        }

        @Override // io.opentelemetry.sdk.metrics.internal.view.FilteredAttributes
        boolean includeIndexInOutput(int i) {
            return !this.bitSet.get(i / 2);
        }
    }

    private static Attributes convertToStandardImplementation(Attributes attributes) {
        final AttributesBuilder builder = Attributes.builder();
        attributes.forEach(new BiConsumer() { // from class: io.opentelemetry.sdk.metrics.internal.view.FilteredAttributes$$ExternalSyntheticLambda0
            @Override // java.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                FilteredAttributes.putInBuilder(AttributesBuilder.this, (AttributeKey) obj, obj2);
            }
        });
        return builder.build();
    }

    @Override // io.opentelemetry.api.common.Attributes
    @Nullable
    public <T> T get(AttributeKey<T> attributeKey) {
        if (attributeKey == null) {
            return null;
        }
        int i = 0;
        while (true) {
            Object[] objArr = this.sourceData;
            if (i >= objArr.length) {
                return null;
            }
            if (attributeKey.equals(objArr[i]) && includeIndexInOutput(i)) {
                return (T) this.sourceData[i + 1];
            }
            i += 2;
        }
    }

    @Override // io.opentelemetry.api.common.Attributes, java.util.Map
    public void forEach(BiConsumer<? super AttributeKey<?>, ? super Object> biConsumer) {
        for (int i = 0; i < this.sourceData.length; i += 2) {
            if (includeIndexInOutput(i)) {
                Object[] objArr = this.sourceData;
                biConsumer.accept((AttributeKey) objArr[i], objArr[i + 1]);
            }
        }
    }

    @Override // io.opentelemetry.api.common.Attributes
    public int size() {
        return this.size;
    }

    @Override // io.opentelemetry.api.common.Attributes
    public Map<AttributeKey<?>, Object> asMap() {
        LinkedHashMap linkedHashMap = new LinkedHashMap(this.size);
        for (int i = 0; i < this.sourceData.length; i += 2) {
            if (includeIndexInOutput(i)) {
                Object[] objArr = this.sourceData;
                linkedHashMap.put((AttributeKey) objArr[i], objArr[i + 1]);
            }
        }
        return Collections.unmodifiableMap(linkedHashMap);
    }

    @Override // io.opentelemetry.api.common.Attributes
    public AttributesBuilder toBuilder() {
        AttributesBuilder builder = Attributes.builder();
        for (int i = 0; i < this.sourceData.length; i += 2) {
            if (includeIndexInOutput(i)) {
                Object[] objArr = this.sourceData;
                putInBuilder(builder, (AttributeKey) objArr[i], objArr[i + 1]);
            }
        }
        return builder;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static <T> void putInBuilder(AttributesBuilder attributesBuilder, AttributeKey<T> attributeKey, T t) {
        attributesBuilder.put((AttributeKey<AttributeKey<T>>) attributeKey, (AttributeKey<T>) t);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && (obj instanceof FilteredAttributes)) {
            FilteredAttributes filteredAttributes = (FilteredAttributes) obj;
            if (size() != filteredAttributes.size()) {
                return false;
            }
            int i = 0;
            int i2 = 0;
            while (true) {
                boolean z = i >= this.sourceData.length;
                boolean z2 = i2 >= filteredAttributes.sourceData.length;
                if (z || includeIndexInOutput(i)) {
                    if (z2 || filteredAttributes.includeIndexInOutput(i2)) {
                        if (!z || !z2) {
                            if (z != z2 || !Objects.equals(this.sourceData[i], filteredAttributes.sourceData[i2]) || !Objects.equals(this.sourceData[i + 1], filteredAttributes.sourceData[i2 + 1])) {
                                break;
                            }
                            i += 2;
                        } else {
                            return true;
                        }
                    }
                    i2 += 2;
                } else {
                    i += 2;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        return this.hashcode;
    }

    public String toString() {
        StringJoiner stringJoiner = new StringJoiner(StringUtils.COMMA, "FilteredAttributes{", "}");
        for (int i = 0; i < this.sourceData.length; i += 2) {
            if (includeIndexInOutput(i)) {
                stringJoiner.add(((AttributeKey) this.sourceData[i]).getKey() + "=" + this.sourceData[i + 1]);
            }
        }
        return stringJoiner.toString();
    }
}
