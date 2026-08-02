package com.squareup.protos.cash.compass.api;

import com.squareup.wire.EnumAdapter;
import com.squareup.wire.WireEnum;

/* loaded from: classes.dex */
public final class GpsConsentStatus$Companion$ADAPTER$1 extends EnumAdapter {
    @Override // com.squareup.wire.EnumAdapter
    public final WireEnum fromValue(int i) {
        GpsConsentStatus.Companion.getClass();
        if (i == 0) {
            return GpsConsentStatus.GPS_CONSENT_STATUS_UNSPECIFIED;
        }
        if (i == 2) {
            return GpsConsentStatus.GPS_CONSENT_STATUS_ALWAYS;
        }
        if (i == 3) {
            return GpsConsentStatus.GPS_CONSENT_STATUS_DENIED;
        }
        if (i != 4) {
            return null;
        }
        return GpsConsentStatus.GPS_CONSENT_STATUS_ALLOW_ONCE_OR_WHILE_USING_APP;
    }
}
