package cc;

import java.util.List;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i3, int i10, ld.a aVar);

    Object createNotification(String str, String str2, String str3, boolean z10, boolean z11, int i3, String str4, String str5, long j, String str6, ld.a aVar);

    Object createSummaryNotification(int i3, String str, ld.a aVar);

    Object deleteExpiredNotifications(ld.a aVar);

    Object doesNotificationExist(String str, ld.a aVar);

    Object getAndroidIdForGroup(String str, boolean z10, ld.a aVar);

    Object getAndroidIdFromCollapseKey(String str, ld.a aVar);

    Object getGroupId(int i3, ld.a aVar);

    Object listNotificationsForGroup(String str, ld.a aVar);

    Object listNotificationsForOutstanding(List<Integer> list, ld.a aVar);

    Object markAsConsumed(int i3, boolean z10, String str, boolean z11, ld.a aVar);

    Object markAsDismissed(int i3, ld.a aVar);

    Object markAsDismissedForGroup(String str, ld.a aVar);

    Object markAsDismissedForOutstanding(ld.a aVar);
}
