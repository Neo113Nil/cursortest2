package com.squareup.protos.cash.grantly.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AddressVerificationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AddressVerificationStatus.Companion.getClass();
        if (i == 0) {
            return AddressVerificationStatus.UNVERIFIED;
        }
        if (i == 1) {
            return AddressVerificationStatus.VERIFIED_STANDARDIZED;
        }
        if (i != 2) {
            return null;
        }
        return AddressVerificationStatus.VERIFIED_NOT_STANDARDIZED;
    }
}
