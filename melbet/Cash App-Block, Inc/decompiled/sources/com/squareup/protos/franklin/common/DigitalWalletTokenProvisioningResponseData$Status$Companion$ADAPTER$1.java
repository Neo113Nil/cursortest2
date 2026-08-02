package com.squareup.protos.franklin.common;

import com.squareup.protos.franklin.common.DigitalWalletTokenProvisioningResponseData;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class DigitalWalletTokenProvisioningResponseData$Status$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        DigitalWalletTokenProvisioningResponseData.Status.Companion.getClass();
        if (i == 1) {
            return DigitalWalletTokenProvisioningResponseData.Status.SUCCESS;
        }
        if (i != 2) {
            return null;
        }
        return DigitalWalletTokenProvisioningResponseData.Status.FAILED;
    }
}
