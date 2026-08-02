package com.withpersona.sdk2.inquiry.tracking.model;

import com.knotapi.knot.utilities.BreadcrumbHelper;
import com.squareup.moshi.Json;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import okhttp3.internal.Tags;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lcom/withpersona/sdk2/inquiry/tracking/model/NfcErrorType;", "", "<init>", "(Ljava/lang/String;I)V", "Connection", "Authentication", "UnsupportedOperation", "Unknown", "Security", "Io", "tracking-events_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class NfcErrorType {
    private static final /* synthetic */ EnumEntries $ENTRIES;
    private static final /* synthetic */ NfcErrorType[] $VALUES;

    @Json(name = "connection")
    public static final NfcErrorType Connection = new NfcErrorType("Connection", 0);

    @Json(name = BreadcrumbHelper.Category.AUTHENTICATION)
    public static final NfcErrorType Authentication = new NfcErrorType("Authentication", 1);

    @Json(name = "unsupported_operation")
    public static final NfcErrorType UnsupportedOperation = new NfcErrorType("UnsupportedOperation", 2);

    @Json(name = "unknown")
    public static final NfcErrorType Unknown = new NfcErrorType("Unknown", 3);

    @Json(name = "security")
    public static final NfcErrorType Security = new NfcErrorType("Security", 4);

    @Json(name = "io")
    public static final NfcErrorType Io = new NfcErrorType("Io", 5);

    private static final /* synthetic */ NfcErrorType[] $values() {
        return new NfcErrorType[]{Connection, Authentication, UnsupportedOperation, Unknown, Security, Io};
    }

    static {
        NfcErrorType[] $values = $values();
        $VALUES = $values;
        $ENTRIES = Tags.enumEntries($values);
    }

    private NfcErrorType(String str, int i) {
    }

    public static EnumEntries getEntries() {
        return $ENTRIES;
    }

    public static NfcErrorType valueOf(String str) {
        return (NfcErrorType) Enum.valueOf(NfcErrorType.class, str);
    }

    public static NfcErrorType[] values() {
        return (NfcErrorType[]) $VALUES.clone();
    }
}
