package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes13.dex */
public enum DeviceType implements Internal.EnumLite {
    DEVICE_TYPE_INVALID(0),
    DEVICE_TYPE_MOBILE(1),
    DEVICE_TYPE_CTV(3),
    DEVICE_TYPE_PHONE_DEVICE(4),
    DEVICE_TYPE_TABLET(5),
    DEVICE_TYPE_TV_BOX(7),
    UNRECOGNIZED(-1);

    public static final int DEVICE_TYPE_CTV_VALUE = 3;
    public static final int DEVICE_TYPE_INVALID_VALUE = 0;
    public static final int DEVICE_TYPE_MOBILE_VALUE = 1;
    public static final int DEVICE_TYPE_PHONE_DEVICE_VALUE = 4;
    public static final int DEVICE_TYPE_TABLET_VALUE = 5;
    public static final int DEVICE_TYPE_TV_BOX_VALUE = 7;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: com.explorestack.protobuf.adcom.DeviceType.1
        public DeviceType findValueByNumber(int i) {
            return DeviceType.forNumber(i);
        }
    };
    private static final DeviceType[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static DeviceType valueOf(int i) {
        return forNumber(i);
    }

    public static DeviceType forNumber(int i) {
        if (i == 0) {
            return DEVICE_TYPE_INVALID;
        }
        if (i == 1) {
            return DEVICE_TYPE_MOBILE;
        }
        if (i == 3) {
            return DEVICE_TYPE_CTV;
        }
        if (i == 4) {
            return DEVICE_TYPE_PHONE_DEVICE;
        }
        if (i == 5) {
            return DEVICE_TYPE_TABLET;
        }
        if (i != 7) {
            return null;
        }
        return DEVICE_TYPE_TV_BOX;
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
        return AdcomProto.getDescriptor().getEnumTypes().get(9);
    }

    public static DeviceType valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    DeviceType(int i) {
        this.value = i;
    }
}
