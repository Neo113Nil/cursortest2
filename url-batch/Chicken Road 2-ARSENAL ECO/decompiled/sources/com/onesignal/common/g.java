package com.onesignal.common;

import a.AbstractC0219a;
import r5.InterfaceC0620a;

/* loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ InterfaceC0620a $ENTRIES;
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
            $ENTRIES = AbstractC0219a.n($values);
        }

        private a(String str, int i7) {
        }

        public static InterfaceC0620a getEntries() {
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

    public final a getResponseStatusType(int i7) {
        if (i7 == 409) {
            return a.CONFLICT;
        }
        if (i7 != 410) {
            if (i7 == 429) {
                return a.RETRYABLE;
            }
            switch (i7) {
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

    public final void setMaxNetworkRequestAttemptCount(int i7) {
        maxNetworkRequestAttemptCount = i7;
    }
}
