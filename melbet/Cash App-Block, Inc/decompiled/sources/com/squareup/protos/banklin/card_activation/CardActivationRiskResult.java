package com.squareup.protos.banklin.card_activation;

import com.squareup.cash.notifications.Op;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum CardActivationRiskResult implements WireEnum {
    SUCCESS(1),
    SUSPECTED_FRAUD(2),
    RESTRICTED_CARD(3),
    NO_VERIFIED_ADDRESS(4);

    public final int value;
    public static final Op.Companion Companion = new Op.Companion();
    public static final CardActivationRiskResult$Companion$ADAPTER$1 ADAPTER = new CardActivationRiskResult$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(CardActivationRiskResult.class), Syntax.PROTO_2, null);

    CardActivationRiskResult(int i) {
        this.value = i;
    }

    public static final CardActivationRiskResult fromValue(int i) {
        Companion.getClass();
        if (i == 1) {
            return SUCCESS;
        }
        if (i == 2) {
            return SUSPECTED_FRAUD;
        }
        if (i == 3) {
            return RESTRICTED_CARD;
        }
        if (i != 4) {
            return null;
        }
        return NO_VERIFIED_ADDRESS;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
