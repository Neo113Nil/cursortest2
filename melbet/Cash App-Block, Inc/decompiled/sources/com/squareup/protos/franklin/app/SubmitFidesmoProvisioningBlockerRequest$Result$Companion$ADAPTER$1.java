package com.squareup.protos.franklin.app;

import com.squareup.protos.franklin.app.SubmitFidesmoProvisioningBlockerRequest;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes8.dex */
public final class SubmitFidesmoProvisioningBlockerRequest$Result$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        SubmitFidesmoProvisioningBlockerRequest.Result.Companion.getClass();
        if (i == 1) {
            return SubmitFidesmoProvisioningBlockerRequest.Result.UNKNOWN;
        }
        if (i == 2) {
            return SubmitFidesmoProvisioningBlockerRequest.Result.SUCCESS;
        }
        if (i == 3) {
            return SubmitFidesmoProvisioningBlockerRequest.Result.FAILURE;
        }
        if (i != 4) {
            return null;
        }
        return SubmitFidesmoProvisioningBlockerRequest.Result.TOKEN_ACTIVATION_REQUIRED;
    }
}
