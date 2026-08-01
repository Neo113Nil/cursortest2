package com.onesignal.common;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class g {
    public static final g INSTANCE = new g();
    private static int maxNetworkRequestAttemptCount = 3;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
    public static final class a {
        private static final /* synthetic */ od.a $ENTRIES;
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
            $ENTRIES = i7.a.J($values);
        }

        private a(String str, int i3) {
        }

        public static od.a getEntries() {
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

    public final a getResponseStatusType(int i3) {
        if (i3 == 409) {
            return a.CONFLICT;
        }
        if (i3 != 410) {
            if (i3 == 429) {
                return a.RETRYABLE;
            }
            switch (i3) {
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

    public final void setMaxNetworkRequestAttemptCount(int i3) {
        maxNetworkRequestAttemptCount = i3;
    }
}
