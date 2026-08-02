package com.squareup.protos.cash.deviceintegritly.api;

import com.squareup.protos.cash.deviceintegritly.api.PlayIntegrityVerdict;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes7.dex */
public final class PlayIntegrityVerdict$AccountDetails$AppLicensingVerdict$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.Companion.getClass();
        if (i == 1) {
            return PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.LICENSED;
        }
        if (i == 2) {
            return PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.UNLICENSED;
        }
        if (i == 3) {
            return PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.UNEVALUATED;
        }
        if (i != 4) {
            return null;
        }
        return PlayIntegrityVerdict.AccountDetails.AppLicensingVerdict.INVALID_ATTESTATION;
    }
}
