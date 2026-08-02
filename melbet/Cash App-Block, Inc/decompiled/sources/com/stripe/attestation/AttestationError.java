package com.stripe.attestation;

import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.MapsKt__MapsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/stripe/attestation/AttestationError;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "ErrorType", "com/squareup/cash/filament/util/MeshLoaderKt", "stripe-attestation_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class AttestationError extends Exception {
    public static final Map errorCodeToErrorTypeMap = MapsKt__MapsKt.mapOf(new Pair(-1, ErrorType.API_NOT_AVAILABLE), new Pair(-5, ErrorType.APP_NOT_INSTALLED), new Pair(-7, ErrorType.APP_UID_MISMATCH), new Pair(-9, ErrorType.CANNOT_BIND_TO_SERVICE), new Pair(-18, ErrorType.CLIENT_TRANSIENT_ERROR), new Pair(-16, ErrorType.CLOUD_PROJECT_NUMBER_IS_INVALID), new Pair(-12, ErrorType.GOOGLE_SERVER_UNAVAILABLE), new Pair(-19, ErrorType.INTEGRITY_TOKEN_PROVIDER_INVALID), new Pair(-100, ErrorType.INTERNAL_ERROR), new Pair(-3, ErrorType.NETWORK_ERROR), new Pair(0, ErrorType.NO_ERROR), new Pair(-6, ErrorType.PLAY_SERVICES_NOT_FOUND), new Pair(-15, ErrorType.PLAY_SERVICES_VERSION_OUTDATED), new Pair(-2, ErrorType.PLAY_STORE_NOT_FOUND), new Pair(-14, ErrorType.PLAY_STORE_VERSION_OUTDATED), new Pair(-17, ErrorType.REQUEST_HASH_TOO_LONG), new Pair(-8, ErrorType.TOO_MANY_REQUESTS));
    public final ErrorType errorType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class ErrorType {
        public static final /* synthetic */ ErrorType[] $VALUES;
        public static final ErrorType API_NOT_AVAILABLE;
        public static final ErrorType APP_NOT_INSTALLED;
        public static final ErrorType APP_UID_MISMATCH;
        public static final ErrorType BACKEND_VERDICT_FAILED;
        public static final ErrorType CANNOT_BIND_TO_SERVICE;
        public static final ErrorType CLIENT_TRANSIENT_ERROR;
        public static final ErrorType CLOUD_PROJECT_NUMBER_IS_INVALID;
        public static final ErrorType GOOGLE_SERVER_UNAVAILABLE;
        public static final ErrorType INTEGRITY_TOKEN_PROVIDER_INVALID;
        public static final ErrorType INTERNAL_ERROR;
        public static final ErrorType NETWORK_ERROR;
        public static final ErrorType NO_ERROR;
        public static final ErrorType PLAY_SERVICES_NOT_FOUND;
        public static final ErrorType PLAY_SERVICES_VERSION_OUTDATED;
        public static final ErrorType PLAY_STORE_NOT_FOUND;
        public static final ErrorType PLAY_STORE_VERSION_OUTDATED;
        public static final ErrorType REQUEST_HASH_TOO_LONG;
        public static final ErrorType TOO_MANY_REQUESTS;
        public static final ErrorType UNKNOWN;

        static {
            ErrorType errorType = new ErrorType("API_NOT_AVAILABLE", 0);
            API_NOT_AVAILABLE = errorType;
            ErrorType errorType2 = new ErrorType("APP_NOT_INSTALLED", 1);
            APP_NOT_INSTALLED = errorType2;
            ErrorType errorType3 = new ErrorType("APP_UID_MISMATCH", 2);
            APP_UID_MISMATCH = errorType3;
            ErrorType errorType4 = new ErrorType("CANNOT_BIND_TO_SERVICE", 3);
            CANNOT_BIND_TO_SERVICE = errorType4;
            ErrorType errorType5 = new ErrorType("CLIENT_TRANSIENT_ERROR", 4);
            CLIENT_TRANSIENT_ERROR = errorType5;
            ErrorType errorType6 = new ErrorType("CLOUD_PROJECT_NUMBER_IS_INVALID", 5);
            CLOUD_PROJECT_NUMBER_IS_INVALID = errorType6;
            ErrorType errorType7 = new ErrorType("GOOGLE_SERVER_UNAVAILABLE", 6);
            GOOGLE_SERVER_UNAVAILABLE = errorType7;
            ErrorType errorType8 = new ErrorType("INTEGRITY_TOKEN_PROVIDER_INVALID", 7);
            INTEGRITY_TOKEN_PROVIDER_INVALID = errorType8;
            ErrorType errorType9 = new ErrorType("INTERNAL_ERROR", 8);
            INTERNAL_ERROR = errorType9;
            ErrorType errorType10 = new ErrorType("NO_ERROR", 9);
            NO_ERROR = errorType10;
            ErrorType errorType11 = new ErrorType("NETWORK_ERROR", 10);
            NETWORK_ERROR = errorType11;
            ErrorType errorType12 = new ErrorType("PLAY_SERVICES_NOT_FOUND", 11);
            PLAY_SERVICES_NOT_FOUND = errorType12;
            ErrorType errorType13 = new ErrorType("PLAY_SERVICES_VERSION_OUTDATED", 12);
            PLAY_SERVICES_VERSION_OUTDATED = errorType13;
            ErrorType errorType14 = new ErrorType("PLAY_STORE_NOT_FOUND", 13);
            PLAY_STORE_NOT_FOUND = errorType14;
            ErrorType errorType15 = new ErrorType("PLAY_STORE_VERSION_OUTDATED", 14);
            PLAY_STORE_VERSION_OUTDATED = errorType15;
            ErrorType errorType16 = new ErrorType("REQUEST_HASH_TOO_LONG", 15);
            REQUEST_HASH_TOO_LONG = errorType16;
            ErrorType errorType17 = new ErrorType("TOO_MANY_REQUESTS", 16);
            TOO_MANY_REQUESTS = errorType17;
            ErrorType errorType18 = new ErrorType("BACKEND_VERDICT_FAILED", 17);
            BACKEND_VERDICT_FAILED = errorType18;
            ErrorType errorType19 = new ErrorType("UNKNOWN", 18);
            UNKNOWN = errorType19;
            $VALUES = new ErrorType[]{errorType, errorType2, errorType3, errorType4, errorType5, errorType6, errorType7, errorType8, errorType9, errorType10, errorType11, errorType12, errorType13, errorType14, errorType15, errorType16, errorType17, errorType18, errorType19};
        }

        public static ErrorType valueOf(String str) {
            return (ErrorType) Enum.valueOf(ErrorType.class, str);
        }

        public static ErrorType[] values() {
            return (ErrorType[]) $VALUES.clone();
        }
    }

    public AttestationError(ErrorType errorType, String str, Throwable th) {
        super(str, th);
        this.errorType = errorType;
    }
}
