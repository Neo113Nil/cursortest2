package com.squareup.protos.cash.cashliteflow.blockers.v1;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PushProvisioningStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PushProvisioningStatus.Companion.getClass();
        if (i == 0) {
            return PushProvisioningStatus.PUSH_PROVISIONING_STATUS_UNSPECIFIED;
        }
        if (i == 1) {
            return PushProvisioningStatus.PUSH_PROVISIONING_STATUS_SUCCESS;
        }
        if (i == 2) {
            return PushProvisioningStatus.PUSH_PROVISIONING_STATUS_FAILED;
        }
        if (i != 3) {
            return null;
        }
        return PushProvisioningStatus.PUSH_PROVISIONING_STATUS_USER_CANCELED;
    }
}
