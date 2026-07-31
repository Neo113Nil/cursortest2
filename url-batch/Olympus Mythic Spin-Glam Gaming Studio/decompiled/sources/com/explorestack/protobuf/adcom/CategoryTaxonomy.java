package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes13.dex */
public enum CategoryTaxonomy implements Internal.EnumLite {
    CATEGORY_TAXONOMY_INVALID(0),
    CATEGORY_TAXONOMY_IAB_CONTENT_1_0(1),
    CATEGORY_TAXONOMY_IAB_CONTENT_2_0(2),
    CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0(3),
    UNRECOGNIZED(-1);

    public static final int CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0_VALUE = 3;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_1_0_VALUE = 1;
    public static final int CATEGORY_TAXONOMY_IAB_CONTENT_2_0_VALUE = 2;
    public static final int CATEGORY_TAXONOMY_INVALID_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: com.explorestack.protobuf.adcom.CategoryTaxonomy.1
    };
    private static final CategoryTaxonomy[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static CategoryTaxonomy valueOf(int i) {
        return forNumber(i);
    }

    public static CategoryTaxonomy forNumber(int i) {
        if (i == 0) {
            return CATEGORY_TAXONOMY_INVALID;
        }
        if (i == 1) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_1_0;
        }
        if (i == 2) {
            return CATEGORY_TAXONOMY_IAB_CONTENT_2_0;
        }
        if (i != 3) {
            return null;
        }
        return CATEGORY_TAXONOMY_IAB_AD_PRODUCT_1_0;
    }

    public static Internal.EnumLiteMap internalGetValueMap() {
        return internalValueMap;
    }

    public final Descriptors.EnumValueDescriptor getValueDescriptor() {
        if (this == UNRECOGNIZED) {
            throw new IllegalStateException("Can't get the descriptor of an unrecognized enum value.");
        }
        return getDescriptor().getValues().get(ordinal());
    }

    public final Descriptors.EnumDescriptor getDescriptorForType() {
        return getDescriptor();
    }

    public static final Descriptors.EnumDescriptor getDescriptor() {
        return AdcomProto.getDescriptor().getEnumTypes().get(2);
    }

    public static CategoryTaxonomy valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    CategoryTaxonomy(int i) {
        this.value = i;
    }
}
