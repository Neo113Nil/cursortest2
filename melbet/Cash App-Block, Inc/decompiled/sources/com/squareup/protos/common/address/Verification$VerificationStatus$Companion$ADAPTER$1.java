package com.squareup.protos.common.address;

import com.squareup.protos.common.address.Verification;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class Verification$VerificationStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        Verification.VerificationStatus.Companion.getClass();
        if (i == 0) {
            return Verification.VerificationStatus.UNVERIFIED;
        }
        if (i == 1) {
            return Verification.VerificationStatus.VERIFY_FAILED;
        }
        if (i == 2) {
            return Verification.VerificationStatus.PARTIALLY_VERIFIED;
        }
        if (i != 3) {
            return null;
        }
        return Verification.VerificationStatus.VERIFIED;
    }
}
