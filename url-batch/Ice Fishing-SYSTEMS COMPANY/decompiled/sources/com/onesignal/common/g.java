package com.onesignal.common;

import y7.InterfaceC5255a;

/* loaded from: classes2.dex */
public final class g {
    public static final g INSTANCE = new g();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC5255a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a INVALID = new a("INVALID", 0);
        public static final a RETRYABLE = new a("RETRYABLE", 1);
        public static final a UNAUTHORIZED = new a("UNAUTHORIZED", 2);
        public static final a MISSING = new a("MISSING", 3);
        public static final a CONFLICT = new a("CONFLICT", 4);

        private static final /* synthetic */ a[] $values() {
            return new a[]{INVALID, RETRYABLE, UNAUTHORIZED, MISSING, CONFLICT};
        }

        static {
            a[] $values = $values();
            $VALUES = $values;
            $ENTRIES = W2.e.d($values);
        }

        private a(String str, int i) {
        }

        public static InterfaceC5255a getEntries() {
            return $ENTRIES;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    private g() {
    }

    public final int getMaxNetworkRequestAttemptCount() {
        return maxNetworkRequestAttemptCount;
    }

    public final a getResponseStatusType(int i) {
        if (i == 409) {
            return a.CONFLICT;
        }
        if (i != 410) {
            if (i == 429) {
                return a.RETRYABLE;
            }
            switch (i) {
                case 400:
                case 402:
                    return a.INVALID;
                case 401:
                case 403:
                    return a.UNAUTHORIZED;
                case 404:
                    break;
                default:
                    return a.RETRYABLE;
            }
        }
        return a.MISSING;
    }

    public final void setMaxNetworkRequestAttemptCount(int i) {
        maxNetworkRequestAttemptCount = i;
    }
}
