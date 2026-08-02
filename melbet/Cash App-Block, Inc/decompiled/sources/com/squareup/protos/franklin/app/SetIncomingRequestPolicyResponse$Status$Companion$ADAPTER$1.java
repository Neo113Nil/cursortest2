package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SetIncomingRequestPolicyResponse;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SetIncomingRequestPolicyResponse$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SetIncomingRequestPolicyResponse.Status.Companion.getClass();
        if (i == 0) {
            return SetIncomingRequestPolicyResponse.Status.INVALID;
        }
        if (i == 1) {
            return SetIncomingRequestPolicyResponse.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return SetIncomingRequestPolicyResponse.Status.FAILURE;
    }
}
