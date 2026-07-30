package t3;

import java.util.List;

/* loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i2, int i5, V5.b bVar);

    Object createNotification(String str, String str2, String str3, boolean z7, boolean z8, int i2, String str4, String str5, long j, String str6, V5.b bVar);

    Object createSummaryNotification(int i2, String str, V5.b bVar);

    Object deleteExpiredNotifications(V5.b bVar);

    Object doesNotificationExist(String str, V5.b bVar);

    Object getAndroidIdForGroup(String str, boolean z7, V5.b bVar);

    Object getAndroidIdFromCollapseKey(String str, V5.b bVar);

    Object getGroupId(int i2, V5.b bVar);

    Object listNotificationsForGroup(String str, V5.b bVar);

    Object listNotificationsForOutstanding(List<Integer> list, V5.b bVar);

    Object markAsConsumed(int i2, boolean z7, String str, boolean z8, V5.b bVar);

    Object markAsDismissed(int i2, V5.b bVar);

    Object markAsDismissedForGroup(String str, V5.b bVar);

    Object markAsDismissedForOutstanding(V5.b bVar);
}
