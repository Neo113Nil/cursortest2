package com.withpersona.sdk2.inquiry.tracking.model;

import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcScanStatus;", "", "<init>", "(Ljava/lang/String;I)V", "Started", "Success", "Skipped", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcScanStatus {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NfcScanStatus[] $VALUES;

    @Json(name = "started")
    public static final NfcScanStatus Started = new NfcScanStatus("Started", 0);

    @Json(name = "success")
    public static final NfcScanStatus Success = new NfcScanStatus("Success", 1);

    @Json(name = "skipped")
    public static final NfcScanStatus Skipped = new NfcScanStatus("Skipped", 2);

    private static final /* synthetic */ NfcScanStatus[] $values() {
        return new NfcScanStatus[]{Started, Success, Skipped};
    }

    static {
        NfcScanStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private NfcScanStatus(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NfcScanStatus valueOf(String str) {
        return (NfcScanStatus) Enum.valueOf(NfcScanStatus.class, str);
    }

    public static NfcScanStatus[] values() {
        return (NfcScanStatus[]) $VALUES.clone();
    }
}
