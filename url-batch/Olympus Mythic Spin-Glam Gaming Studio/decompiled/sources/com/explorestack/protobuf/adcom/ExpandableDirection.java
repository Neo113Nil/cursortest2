package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes4.dex */
public enum ExpandableDirection implements Internal.EnumLite {
    EXPANDABLE_DIRECTION_INVALID(0),
    EXPANDABLE_DIRECTION_LEFT(1),
    EXPANDABLE_DIRECTION_RIGHT(2),
    EXPANDABLE_DIRECTION_UP(3),
    EXPANDABLE_DIRECTION_DOWN(4),
    EXPANDABLE_DIRECTION_FULL_SCREEN(5),
    UNRECOGNIZED(-1);

    public static final int EXPANDABLE_DIRECTION_DOWN_VALUE = 4;
    public static final int EXPANDABLE_DIRECTION_FULL_SCREEN_VALUE = 5;
    public static final int EXPANDABLE_DIRECTION_INVALID_VALUE = 0;
    public static final int EXPANDABLE_DIRECTION_LEFT_VALUE = 1;
    public static final int EXPANDABLE_DIRECTION_RIGHT_VALUE = 2;
    public static final int EXPANDABLE_DIRECTION_UP_VALUE = 3;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: com.explorestack.protobuf.adcom.ExpandableDirection.1
    };
    private static final ExpandableDirection[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static ExpandableDirection valueOf(int i) {
        return forNumber(i);
    }

    public static ExpandableDirection forNumber(int i) {
        if (i == 0) {
            return EXPANDABLE_DIRECTION_INVALID;
        }
        if (i == 1) {
            return EXPANDABLE_DIRECTION_LEFT;
        }
        if (i == 2) {
            return EXPANDABLE_DIRECTION_RIGHT;
        }
        if (i == 3) {
            return EXPANDABLE_DIRECTION_UP;
        }
        if (i == 4) {
            return EXPANDABLE_DIRECTION_DOWN;
        }
        if (i != 5) {
            return null;
        }
        return EXPANDABLE_DIRECTION_FULL_SCREEN;
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
        return AdcomProto.getDescriptor().getEnumTypes().get(13);
    }

    public static ExpandableDirection valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    ExpandableDirection(int i) {
        this.value = i;
    }
}
