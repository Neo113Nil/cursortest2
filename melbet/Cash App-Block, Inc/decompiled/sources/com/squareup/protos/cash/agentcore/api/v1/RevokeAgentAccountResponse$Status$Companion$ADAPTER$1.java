package com.squareup.protos.cash.agentcore.api.v1;

import com.squareup.protos.cash.agentcore.api.v1.RevokeAgentAccountResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class RevokeAgentAccountResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        RevokeAgentAccountResponse.Status.Companion.getClass();
        if (i == 0) {
            return RevokeAgentAccountResponse.Status.STATUS_UNSPECIFIED;
        }
        if (i != 1) {
            return null;
        }
        return RevokeAgentAccountResponse.Status.STATUS_REVOKED;
    }
}
