package com.squareup.protos.cash.whimsicard.flows.v1;

import com.squareup.protos.cash.ui.ActionType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes8.dex */
public enum PaymentDeviceOrderScenarioType implements WireEnum {
    PAYMENT_DEVICE_ORDER_SCENARIO_TYPE_UNSPECIFIED(0),
    FIRST_TIME_ORDER(1),
    REPLACEMENT_ORDER(2),
    LOST_DEVICE_ORDER(3),
    EXPIRED_DEVICE_ORDER(4),
    DEBIT_FLEX_UPGRADE(5);

    public static final PaymentDeviceOrderScenarioType$Companion$ADAPTER$1 ADAPTER;
    public static final ActionType.Companion Companion;
    public final int value;

    static {
        PaymentDeviceOrderScenarioType paymentDeviceOrderScenarioType = PAYMENT_DEVICE_ORDER_SCENARIO_TYPE_UNSPECIFIED;
        Companion = new ActionType.Companion();
        ADAPTER = new PaymentDeviceOrderScenarioType$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(PaymentDeviceOrderScenarioType.class), Syntax.PROTO_2, paymentDeviceOrderScenarioType);
    }

    PaymentDeviceOrderScenarioType(int i) {
        this.value = i;
    }

    public static final PaymentDeviceOrderScenarioType fromValue(int i) {
        Companion.getClass();
        return ActionType.Companion.m3935fromValue(i);
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
