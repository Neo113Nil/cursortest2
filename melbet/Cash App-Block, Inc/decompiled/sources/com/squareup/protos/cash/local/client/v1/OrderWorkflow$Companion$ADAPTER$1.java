package com.squareup.protos.cash.local.client.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class OrderWorkflow$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        OrderWorkflow.Companion.getClass();
        if (i == 0) {
            return OrderWorkflow.ORDER_WORKFLOW_UNSPECIFIED;
        }
        if (i == 1) {
            return OrderWorkflow.ORDER_WORKFLOW_IMMEDIATE_CAPTURE;
        }
        if (i == 2) {
            return OrderWorkflow.ORDER_WORKFLOW_PREAUTHORIZED_DELAYED_CAPTURE;
        }
        if (i != 3) {
            return null;
        }
        return OrderWorkflow.ORDER_WORKFLOW_FINALIZE_DELAYED_CAPTURE;
    }
}
