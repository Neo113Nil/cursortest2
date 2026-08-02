package com.squareup.protos.cash.agentcore.api.v1;

import com.squareup.protos.cash.agentcore.api.v1.AgentWalletRetrievePaymentResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class AgentWalletRetrievePaymentResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        AgentWalletRetrievePaymentResponse.Status.Companion.getClass();
        switch (i) {
            case 0:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_UNSPECIFIED;
            case 1:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_PENDING_APPROVAL;
            case 2:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_COMPLETED;
            case 3:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_DECLINED;
            case 4:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_EXPIRED;
            case 5:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_FAILED;
            case 6:
                return AgentWalletRetrievePaymentResponse.Status.STATUS_PROCESSING;
            default:
                return null;
        }
    }
}
