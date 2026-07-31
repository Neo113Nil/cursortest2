package com.onesignal.common;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.onesignal.core.BuildConfig;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;

/* compiled from: NetworkUtils.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\fB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004R\u001a\u0010\u0003\u001a\u00020\u0004X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lcom/onesignal/common/NetworkUtils;", "", "()V", "maxNetworkRequestAttemptCount", "", "getMaxNetworkRequestAttemptCount", "()I", "setMaxNetworkRequestAttemptCount", "(I)V", "getResponseStatusType", "Lcom/onesignal/common/NetworkUtils$ResponseStatusType;", "statusCode", "ResponseStatusType", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NetworkUtils {
    public static final NetworkUtils INSTANCE = new NetworkUtils();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: NetworkUtils.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/onesignal/common/NetworkUtils$ResponseStatusType;", "", "(Ljava/lang/String;I)V", "INVALID", "RETRYABLE", "UNAUTHORIZED", "MISSING", "CONFLICT", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ResponseStatusType {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ ResponseStatusType[] $VALUES;
        public static final ResponseStatusType INVALID = new ResponseStatusType("INVALID", 0);
        public static final ResponseStatusType RETRYABLE = new ResponseStatusType("RETRYABLE", 1);
        public static final ResponseStatusType UNAUTHORIZED = new ResponseStatusType("UNAUTHORIZED", 2);
        public static final ResponseStatusType MISSING = new ResponseStatusType("MISSING", 3);
        public static final ResponseStatusType CONFLICT = new ResponseStatusType("CONFLICT", 4);

        private static final /* synthetic */ ResponseStatusType[] $values() {
            return new ResponseStatusType[]{INVALID, RETRYABLE, UNAUTHORIZED, MISSING, CONFLICT};
        }

        public static EnumEntries<ResponseStatusType> getEntries() {
            return $ENTRIES;
        }

        public static ResponseStatusType valueOf(String str) {
            return (ResponseStatusType) Enum.valueOf(ResponseStatusType.class, str);
        }

        public static ResponseStatusType[] values() {
            return (ResponseStatusType[]) $VALUES.clone();
        }

        private ResponseStatusType(String str, int i) {
        }

        static {
            ResponseStatusType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }
    }

    private NetworkUtils() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final void setMaxNetworkRequestAttemptCount(int i) {
        maxNetworkRequestAttemptCount = i;
    }

    public final ResponseStatusType getResponseStatusType(int statusCode) {
        if (statusCode != 409) {
            if (statusCode != 410) {
                if (statusCode != 429) {
                    switch (statusCode) {
                        case 400:
                        case TypedValues.Cycle.TYPE_VISIBILITY /* 402 */:
                            return ResponseStatusType.INVALID;
                        case TypedValues.Cycle.TYPE_CURVE_FIT /* 401 */:
                        case TypedValues.Cycle.TYPE_ALPHA /* 403 */:
                            return ResponseStatusType.UNAUTHORIZED;
                        case 404:
                            break;
                        default:
                            return ResponseStatusType.RETRYABLE;
                    }
                } else {
                    return ResponseStatusType.RETRYABLE;
                }
            }
            return ResponseStatusType.MISSING;
        }
        return ResponseStatusType.CONFLICT;
    }
}
