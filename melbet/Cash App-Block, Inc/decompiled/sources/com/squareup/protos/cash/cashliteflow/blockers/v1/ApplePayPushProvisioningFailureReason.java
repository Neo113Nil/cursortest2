package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.protos.cash.compass.api.RadioType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum ApplePayPushProvisioningFailureReason implements WireEnum {
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED(0),
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNKNOWN_ERROR(1),
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_DATA_ERROR(2),
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSUPPORTED_VERSION_ERROR(3),
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_INVALID_SIGNATURE(4),
    APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_NOT_ENTITLED_ERROR(5);

    public static final ApplePayPushProvisioningFailureReason$Companion$ADAPTER$1 ADAPTER;
    public static final RadioType.Companion Companion;
    public final int value;

    static {
        ApplePayPushProvisioningFailureReason applePayPushProvisioningFailureReason = APPLE_PAY_PUSH_PROVISIONING_FAILURE_REASON_UNSPECIFIED;
        Companion = new RadioType.Companion();
        ADAPTER = new ApplePayPushProvisioningFailureReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(ApplePayPushProvisioningFailureReason.class), Syntax.PROTO_2, applePayPushProvisioningFailureReason);
    }

    ApplePayPushProvisioningFailureReason(int i) {
        this.value = i;
    }

    public static final ApplePayPushProvisioningFailureReason fromValue(int i) {
        Companion.getClass();
        return RadioType.Companion.m3849fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
