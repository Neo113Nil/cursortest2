package com.withpersona.sdk2.inquiry.internal.network;

import com.squareup.moshi.Json;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesList;

@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/withpersona/sdk2/inquiry/internal/network/ErrorRequest;", "", "ErrorType", "inquiry-internal_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class ErrorRequest {
    public final Object debugDescription;
    public final ErrorType errorType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ErrorType[] $VALUES;

        @Json(name = "camera")
        public static final ErrorType Camera;

        @Json(name = "network")
        public static final ErrorType Network;

        @Json(name = "nfc")
        public static final ErrorType Nfc;

        @Json(name = "other")
        public static final ErrorType Other;

        @Json(name = "permissions")
        public static final ErrorType Permissions;

        static {
            ErrorType errorType = new ErrorType("Camera", 0);
            Camera = errorType;
            ErrorType errorType2 = new ErrorType("Network", 1);
            Network = errorType2;
            ErrorType errorType3 = new ErrorType("Permissions", 2);
            Permissions = errorType3;
            ErrorType errorType4 = new ErrorType("Nfc", 3);
            Nfc = errorType4;
            ErrorType errorType5 = new ErrorType("Other", 4);
            Other = errorType5;
            ErrorType[] errorTypeArr = {errorType, errorType2, errorType3, errorType4, errorType5};
            $VALUES = errorTypeArr;
            $ENTRIES = new EnumEntriesList(errorTypeArr);
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public ErrorRequest(ErrorType errorType, Object obj) {
        errorType.getClass();
        this.errorType = errorType;
        this.debugDescription = obj;
    }
}
