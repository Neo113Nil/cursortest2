package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.protos.cash.cashsuggest.api.ImageLayout;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum GooglePayPushProvisioningFailureReason implements WireEnum {
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED(0),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR(1),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NO_ACTIVE_WALLET(2),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TOKEN_NOT_FOUND(3),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_TOKEN_STATE(4),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_ATTESTATION_ERROR(5),
    GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TAP_AND_PAY_UNAVAILABLE(6);

    public static final GooglePayPushProvisioningFailureReason$Companion$ADAPTER$1 ADAPTER;
    public static final ImageLayout.Companion Companion;
    public final int value;

    static {
        GooglePayPushProvisioningFailureReason googlePayPushProvisioningFailureReason = GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED;
        Companion = new ImageLayout.Companion();
        ADAPTER = new GooglePayPushProvisioningFailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GooglePayPushProvisioningFailureReason.class), Syntax.PROTO_2, googlePayPushProvisioningFailureReason);
    }

    GooglePayPushProvisioningFailureReason(int i) {
        this.value = i;
    }

    public static final GooglePayPushProvisioningFailureReason fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED;
            case 1:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR;
            case 2:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NO_ACTIVE_WALLET;
            case 3:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TOKEN_NOT_FOUND;
            case 4:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_TOKEN_STATE;
            case 5:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_ATTESTATION_ERROR;
            case 6:
                return GOOGLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_TAP_AND_PAY_UNAVAILABLE;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
