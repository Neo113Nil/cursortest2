package com.onesignal.notifications.internal.common;

import kotlin.Metadata;

/* compiled from: NotificationPriorityMapper.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\b\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004J\u000e\u0010\t\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0004R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lcom/onesignal/notifications/internal/common/NotificationPriorityMapper;", "", "()V", "HIGH_PRIORITY_THRESHOLD", "", "isHighPriority", "", "osPriority", "toAndroidImportance", "toAndroidPriority", "com.onesignal.notifications"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class NotificationPriorityMapper {
    private static final int HIGH_PRIORITY_THRESHOLD = 9;
    public static final NotificationPriorityMapper INSTANCE = new NotificationPriorityMapper();

    public final boolean isHighPriority(int osPriority) {
        return osPriority >= 9;
    }

    public final int toAndroidImportance(int osPriority) {
        if (osPriority >= 9) {
            return 5;
        }
        if (osPriority >= 7) {
            return 4;
        }
        if (osPriority >= 5) {
            return 3;
        }
        if (osPriority >= 3) {
            return 2;
        }
        return osPriority >= 1 ? 1 : 0;
    }

    public final int toAndroidPriority(int osPriority) {
        if (osPriority >= 9) {
            return 2;
        }
        if (osPriority >= 7) {
            return 1;
        }
        if (osPriority >= 5) {
            return 0;
        }
        return osPriority >= 3 ? -1 : -2;
    }

    private NotificationPriorityMapper() {
    }
}
