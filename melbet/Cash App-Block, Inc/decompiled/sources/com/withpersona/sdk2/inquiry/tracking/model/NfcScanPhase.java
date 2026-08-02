package com.withpersona.sdk2.inquiry.tracking.model;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\f\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanPhase;", "", "<init>", "(Ljava/lang/String;I)V", "ServiceOpen", "Authentication", "ChipAuthentication", "Dg1Read", "Dg2Read", "SodRead", "Copy", "Complete", "Unknown", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcScanPhase {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NfcScanPhase[] $VALUES;

    @Json(name = "service_open")
    public static final NfcScanPhase ServiceOpen = new NfcScanPhase("ServiceOpen", 0);

    @Json(name = BreadcrumbHelper.Category.AUTHENTICATION)
    public static final NfcScanPhase Authentication = new NfcScanPhase("Authentication", 1);

    @Json(name = "chip_authentication")
    public static final NfcScanPhase ChipAuthentication = new NfcScanPhase("ChipAuthentication", 2);

    @Json(name = "dg1_read")
    public static final NfcScanPhase Dg1Read = new NfcScanPhase("Dg1Read", 3);

    @Json(name = "dg2_read")
    public static final NfcScanPhase Dg2Read = new NfcScanPhase("Dg2Read", 4);

    @Json(name = "sod_read")
    public static final NfcScanPhase SodRead = new NfcScanPhase("SodRead", 5);

    @Json(name = "copy")
    public static final NfcScanPhase Copy = new NfcScanPhase("Copy", 6);

    @Json(name = "complete")
    public static final NfcScanPhase Complete = new NfcScanPhase("Complete", 7);

    @Json(name = "unknown")
    public static final NfcScanPhase Unknown = new NfcScanPhase("Unknown", 8);

    private static final /* synthetic */ NfcScanPhase[] $values() {
        return new NfcScanPhase[]{ServiceOpen, Authentication, ChipAuthentication, Dg1Read, Dg2Read, SodRead, Copy, Complete, Unknown};
    }

    static {
        NfcScanPhase[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private NfcScanPhase(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NfcScanPhase valueOf(String str) {
        return (NfcScanPhase) Enum.valueOf(NfcScanPhase.class, str);
    }

    public static NfcScanPhase[] values() {
        return (NfcScanPhase[]) $VALUES.clone();
    }
}
