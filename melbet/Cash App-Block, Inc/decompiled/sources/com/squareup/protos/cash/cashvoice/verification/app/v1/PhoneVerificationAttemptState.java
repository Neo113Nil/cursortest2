package com.squareup.protos.cash.cashvoice.verification.app.v1;

import com.squareup.protos.cash.grantly.api.Action;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum PhoneVerificationAttemptState implements WireEnum {
    UNKNOWN(0),
    PENDING(1),
    VERIFIED(2),
    INVALID(3),
    REJECTED(4),
    EXPIRED(5),
    FAILED_PIN(6);

    public static final PhoneVerificationAttemptState$Companion$ADAPTER$1 ADAPTER;
    public static final Action.Type.Companion Companion;
    public final int value;

    static {
        PhoneVerificationAttemptState phoneVerificationAttemptState = UNKNOWN;
        Companion = new Action.Type.Companion();
        ADAPTER = new PhoneVerificationAttemptState$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PhoneVerificationAttemptState.class), Syntax.PROTO_2, phoneVerificationAttemptState);
    }

    PhoneVerificationAttemptState(int i) {
        this.value = i;
    }

    public static final PhoneVerificationAttemptState fromValue(int i) {
        Companion.getClass();
        switch (i) {
            case 0:
                return UNKNOWN;
            case 1:
                return PENDING;
            case 2:
                return VERIFIED;
            case 3:
                return INVALID;
            case 4:
                return REJECTED;
            case 5:
                return EXPIRED;
            case 6:
                return FAILED_PIN;
            default:
                return null;
        }
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
