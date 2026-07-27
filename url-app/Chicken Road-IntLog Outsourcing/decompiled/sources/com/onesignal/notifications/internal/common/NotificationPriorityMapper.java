package com.onesignal.notifications.internal.common;

/* loaded from: classes.dex */
public final class NotificationPriorityMapper {
    private static final int HIGH_PRIORITY_THRESHOLD = 9;
    public static final NotificationPriorityMapper INSTANCE = new NotificationPriorityMapper();

    private NotificationPriorityMapper() {
    }

    public final boolean isHighPriority(int i2) {
        return i2 >= 9;
    }

    public final int toAndroidImportance(int i2) {
        if (i2 >= 9) {
            return 5;
        }
        if (i2 >= 7) {
            return 4;
        }
        if (i2 >= 5) {
            return 3;
        }
        if (i2 >= 3) {
            return 2;
        }
        return i2 >= 1 ? 1 : 0;
    }

    public final int toAndroidPriority(int i2) {
        if (i2 >= 9) {
            return 2;
        }
        if (i2 >= 7) {
            return 1;
        }
        if (i2 >= 5) {
            return 0;
        }
        return i2 >= 3 ? -1 : -2;
    }
}
