package com.squareup.protos.cash.cashliteflow.api.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PushProvisionStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PushProvisionStatus.Companion.getClass();
        if (i == 0) {
            return PushProvisionStatus.PUSH_PROVISION_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PushProvisionStatus.PUSH_PROVISION_STATUS_SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return PushProvisionStatus.PUSH_PROVISION_STATUS_FAILED;
    }
}
