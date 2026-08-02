package com.squareup.protos.cash.compass.api;

import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import kotlin.jvm.internal.Reflection;
import okio.internal.ResourceFileSystem;

/* loaded from: classes.dex */
public enum GpsConsentStatus implements WireEnum {
    GPS_CONSENT_STATUS_UNSPECIFIED(0),
    GPS_CONSENT_STATUS_ALWAYS(2),
    GPS_CONSENT_STATUS_DENIED(3),
    GPS_CONSENT_STATUS_ALLOW_ONCE_OR_WHILE_USING_APP(4);

    public static final GpsConsentStatus$Companion$ADAPTER$1 ADAPTER;
    public static final ResourceFileSystem.Companion Companion;
    public final int value;

    static {
        GpsConsentStatus gpsConsentStatus = GPS_CONSENT_STATUS_UNSPECIFIED;
        Companion = new ResourceFileSystem.Companion();
        ADAPTER = new GpsConsentStatus$Companion$ADAPTER$1(Reflection.factory.getOrCreateKotlinClass(GpsConsentStatus.class), Syntax.PROTO_2, gpsConsentStatus);
    }

    GpsConsentStatus(int i) {
        this.value = i;
    }

    public static final GpsConsentStatus fromValue(int i) {
        Companion.getClass();
        if (i == 0) {
            return GPS_CONSENT_STATUS_UNSPECIFIED;
        }
        if (i == 2) {
            return GPS_CONSENT_STATUS_ALWAYS;
        }
        if (i == 3) {
            return GPS_CONSENT_STATUS_DENIED;
        }
        if (i != 4) {
            return null;
        }
        return GPS_CONSENT_STATUS_ALLOW_ONCE_OR_WHILE_USING_APP;
    }

    @Override // com.squareup.wire.WireEnum
    public final int getValue() {
        return this.value;
    }
}
