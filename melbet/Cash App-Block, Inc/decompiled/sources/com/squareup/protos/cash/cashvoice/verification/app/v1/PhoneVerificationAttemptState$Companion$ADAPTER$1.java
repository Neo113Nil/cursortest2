package com.squareup.protos.cash.cashvoice.verification.app.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PhoneVerificationAttemptState$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PhoneVerificationAttemptState.Companion.getClass();
        switch (i) {
            case 0:
                return PhoneVerificationAttemptState.UNKNOWN;
            case 1:
                return PhoneVerificationAttemptState.PENDING;
            case 2:
                return PhoneVerificationAttemptState.VERIFIED;
            case 3:
                return PhoneVerificationAttemptState.INVALID;
            case 4:
                return PhoneVerificationAttemptState.REJECTED;
            case 5:
                return PhoneVerificationAttemptState.EXPIRED;
            case 6:
                return PhoneVerificationAttemptState.FAILED_PIN;
            default:
                return null;
        }
    }
}
