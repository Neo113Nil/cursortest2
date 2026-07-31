package com.explorestack.protobuf.adcom;

import com.explorestack.protobuf.Descriptors;
import com.explorestack.protobuf.Internal;

/* loaded from: classes15.dex */
public enum ConnectionStatus implements Internal.EnumLite {
    CONNECTION_STATUS_UNDEFINED(0),
    CONNECTION_STATUS_ENABLED(1),
    CONNECTION_STATUS_DISABLED(2),
    UNRECOGNIZED(-1);

    public static final int CONNECTION_STATUS_DISABLED_VALUE = 2;
    public static final int CONNECTION_STATUS_ENABLED_VALUE = 1;
    public static final int CONNECTION_STATUS_UNDEFINED_VALUE = 0;
    private final int value;
    private static final Internal.EnumLiteMap internalValueMap = new Internal.EnumLiteMap() { // from class: com.explorestack.protobuf.adcom.ConnectionStatus.1
        public ConnectionStatus findValueByNumber(int i) {
            return ConnectionStatus.forNumber(i);
        }
    };
    private static final ConnectionStatus[] VALUES = values();

    @Override // com.explorestack.protobuf.Internal.EnumLite
    public final int getNumber() {
        if (this == UNRECOGNIZED) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        return this.value;
    }

    @Deprecated
    public static ConnectionStatus valueOf(int i) {
        return forNumber(i);
    }

    public static ConnectionStatus forNumber(int i) {
        if (i == 0) {
            return CONNECTION_STATUS_UNDEFINED;
        }
        if (i == 1) {
            return CONNECTION_STATUS_ENABLED;
        }
        if (i != 2) {
            return null;
        }
        return CONNECTION_STATUS_DISABLED;
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
        return AdcomProto.getDescriptor().getEnumTypes().get(31);
    }

    public static ConnectionStatus valueOf(Descriptors.EnumValueDescriptor enumValueDescriptor) {
        if (enumValueDescriptor.getType() != getDescriptor()) {
            throw new IllegalArgumentException("EnumValueDescriptor is not for this type.");
        }
        if (enumValueDescriptor.getIndex() == -1) {
            return UNRECOGNIZED;
        }
        return VALUES[enumValueDescriptor.getIndex()];
    }

    ConnectionStatus(int i) {
        this.value = i;
    }
}
