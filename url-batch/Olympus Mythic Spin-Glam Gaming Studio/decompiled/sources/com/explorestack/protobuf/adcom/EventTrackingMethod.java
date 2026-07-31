package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes8.dex */
public enum EventTrackingMethod implements Internal.EnumLite {
    EVENT_TRACKING_METHOD_INVALID(0),
    EVENT_TRACKING_METHOD_IMAGE_PIXEL(1),
    EVENT_TRACKING_METHOD_JAVASCRIPT(2),
    UNRECOGNIZED(-1);

    public static final int EVENT_TRACKING_METHOD_IMAGE_PIXEL_VALUE = 1;
    public static final int EVENT_TRACKING_METHOD_INVALID_VALUE = 0;
    public static final int EVENT_TRACKING_METHOD_JAVASCRIPT_VALUE = 2;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: com.explorestack.protobuf.adcom.EventTrackingMethod.1
    };
    private static final EventTrackingMethod[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static EventTrackingMethod valueOf(int i) {
        return forNumber(i);
    }

    public static EventTrackingMethod forNumber(int i) {
        if (i == 0) {
            return EVENT_TRACKING_METHOD_INVALID;
        }
        if (i == 1) {
            return EVENT_TRACKING_METHOD_IMAGE_PIXEL;
        }
        if (i != 2) {
            return null;
        }
        return EVENT_TRACKING_METHOD_JAVASCRIPT;
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
        return AdcomProto.getDescriptor().getEnumTypes().get(14);
    }

    public static EventTrackingMethod valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    EventTrackingMethod(int i) {
        this.value = i;
    }
}
