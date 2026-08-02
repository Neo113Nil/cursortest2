package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum AddressType implements WireEnum {
    ADDRESS_TYPE_UNSPECIFIED(0),
    ADDRESS_TYPE_EVM(1),
    ADDRESS_TYPE_SPARK(2),
    ADDRESS_TYPE_SVM(3);

    public static final AddressType$Companion$ADAPTER$1 ADAPTER;
    public static final Alignment.Companion Companion;
    public final int value;

    static {
        AddressType addressType = ADDRESS_TYPE_UNSPECIFIED;
        Companion = new Alignment.Companion();
        ADAPTER = new AddressType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(AddressType.class), Syntax.PROTO_2, addressType);
    }

    AddressType(int i) {
        this.value = i;
    }

    public static final AddressType fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return ADDRESS_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return ADDRESS_TYPE_EVM;
        }
        if (i == 2) {
            return ADDRESS_TYPE_SPARK;
        }
        if (i != 3) {
            return null;
        }
        return ADDRESS_TYPE_SVM;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
