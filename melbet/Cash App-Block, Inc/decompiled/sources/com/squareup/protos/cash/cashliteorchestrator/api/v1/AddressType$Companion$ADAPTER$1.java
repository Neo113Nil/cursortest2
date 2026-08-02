package com.squareup.protos.cash.cashliteorchestrator.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddressType$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddressType.Companion.getClass();
        if (i == 0) {
            return AddressType.ADDRESS_TYPE_UNSPECIFIED;
        }
        if (i == 1) {
            return AddressType.ADDRESS_TYPE_EVM;
        }
        if (i == 2) {
            return AddressType.ADDRESS_TYPE_SPARK;
        }
        if (i != 3) {
            return null;
        }
        return AddressType.ADDRESS_TYPE_SVM;
    }
}
