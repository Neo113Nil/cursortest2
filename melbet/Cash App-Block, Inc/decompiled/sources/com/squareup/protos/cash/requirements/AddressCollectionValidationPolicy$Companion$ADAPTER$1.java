package com.squareup.protos.cash.requirements;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddressCollectionValidationPolicy$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddressCollectionValidationPolicy.Companion.getClass();
        if (i == 0) {
            return AddressCollectionValidationPolicy.VALIDATION_POLICY_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return AddressCollectionValidationPolicy.VALIDATION_POLICY_REQUIRED;
    }
}
