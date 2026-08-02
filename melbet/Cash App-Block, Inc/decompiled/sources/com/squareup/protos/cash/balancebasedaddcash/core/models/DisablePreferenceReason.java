package com.squareup.protos.cash.balancebasedaddcash.core.models;

import com.squareup.protos.cash.api.Error;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum DisablePreferenceReason implements WireEnum {
    USER_DISABLED(1),
    ADMIN_DISABLED(2),
    INSTRUMENT_UNLINKED(3),
    OVERDRAFT_DETECTED(4),
    OVERDUE_LOAN_DETECTED(5),
    AUTO_RELOAD_FAILED(6),
    CASH_OUT_BELOW_MINIMUM(7),
    ELIGIBILITY_VIOLATION(8),
    EXPIRED_OR_INACTIVE_DEBIT_CARD(9);

    public final int value;
    public static final Error.Code.Companion Companion = new Error.Code.Companion(17);
    public static final DisablePreferenceReason$Companion$ADAPTER$1 ADAPTER = new DisablePreferenceReason$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(DisablePreferenceReason.class), Syntax.PROTO_2, null);

    DisablePreferenceReason(int i) {
        this.value = i;
    }

    public static final DisablePreferenceReason fromValue(int i) {
        Companion.getClass();
        return Error.Code.Companion.m3838fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
