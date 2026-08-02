package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class GooglePayPushProvisioningFailureReason$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GooglePayPushProvisioningFailureReason.Companion.getClass();
        switch (i) {
            case 0:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED;
            case 1:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR;
            case 2:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NO_ACTIVE_WALLET;
            case 3:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TOKEN_NOT_FOUND;
            case 4:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_TOKEN_STATE;
            case 5:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_ATTESTATION_ERROR;
            case 6:
                return GooglePayPushProvisioningFailureReason.GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TAP_AND_PAY_UNAVAILABLE;
            default:
                return null;
        }
    }
}
