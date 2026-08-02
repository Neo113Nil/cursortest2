package com.squareup.protos.cash.local.client.v1;

import com.squareup.protos.cash.moneymap.app.RetailerType;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;

/* loaded from: classes7.dex */
public enum OrderWorkflow implements WireEnum {
    ORDER_WORKFLOW_UNSPECIFIED(0),
    ORDER_WORKFLOW_IMMEDIATE_CAPTURE(1),
    ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE(2),
    ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE(3);

    public static final OrderWorkflow$Companion$ADAPTER$1 ADAPTER;
    public static final RetailerType.Companion Companion;
    public final int value;

    static {
        OrderWorkflow orderWorkflow = ORDER_WORKFLOW_UNSPECIFIED;
        Companion = new RetailerType.Companion();
        ADAPTER = new OrderWorkflow$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(OrderWorkflow.class), Syntax.PROTO_2, orderWorkflow);
    }

    OrderWorkflow(int i) {
        this.value = i;
    }

    public static final OrderWorkflow fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return ORDER_WORKFLOW_UNSPECIFIED;
        }
        if (i == 1) {
            return ORDER_WORKFLOW_IMMEDIATE_CAPTURE;
        }
        if (i == 2) {
            return ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE;
        }
        if (i != 3) {
            return null;
        }
        return ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
