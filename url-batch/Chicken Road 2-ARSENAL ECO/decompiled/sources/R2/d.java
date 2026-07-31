package R2;

import java.util.List;
import o5.InterfaceC0564d;

/* loaded from: classes.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i7, int i8, InterfaceC0564d interfaceC0564d);

    Object createNotification(String str, String str2, String str3, boolean z5, boolean z6, int i7, String str4, String str5, long j4, String str6, InterfaceC0564d interfaceC0564d);

    Object createSummaryNotification(int i7, String str, InterfaceC0564d interfaceC0564d);

    Object deleteExpiredNotifications(InterfaceC0564d interfaceC0564d);

    Object doesNotificationExist(String str, InterfaceC0564d interfaceC0564d);

    Object getAndroidIdForGroup(String str, boolean z5, InterfaceC0564d interfaceC0564d);

    Object getAndroidIdFromCollapseKey(String str, InterfaceC0564d interfaceC0564d);

    Object getGroupId(int i7, InterfaceC0564d interfaceC0564d);

    Object listNotificationsForGroup(String str, InterfaceC0564d interfaceC0564d);

    Object listNotificationsForOutstanding(List<Integer> list, InterfaceC0564d interfaceC0564d);

    Object markAsConsumed(int i7, boolean z5, String str, boolean z6, InterfaceC0564d interfaceC0564d);

    Object markAsDismissed(int i7, InterfaceC0564d interfaceC0564d);

    Object markAsDismissedForGroup(String str, InterfaceC0564d interfaceC0564d);

    Object markAsDismissedForOutstanding(InterfaceC0564d interfaceC0564d);
}
