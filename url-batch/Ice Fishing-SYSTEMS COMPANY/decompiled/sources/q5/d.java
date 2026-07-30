package q5;

import java.util.List;
import v7.InterfaceC5133d;

/* loaded from: classes2.dex */
public interface d {
    Object clearOldestOverLimitFallback(int i, int i4, InterfaceC5133d interfaceC5133d);

    Object createNotification(String str, String str2, String str3, boolean z8, boolean z9, int i, String str4, String str5, long j9, String str6, InterfaceC5133d interfaceC5133d);

    Object createSummaryNotification(int i, String str, InterfaceC5133d interfaceC5133d);

    Object deleteExpiredNotifications(InterfaceC5133d interfaceC5133d);

    Object doesNotificationExist(String str, InterfaceC5133d interfaceC5133d);

    Object getAndroidIdForGroup(String str, boolean z8, InterfaceC5133d interfaceC5133d);

    Object getAndroidIdFromCollapseKey(String str, InterfaceC5133d interfaceC5133d);

    Object getGroupId(int i, InterfaceC5133d interfaceC5133d);

    Object listNotificationsForGroup(String str, InterfaceC5133d interfaceC5133d);

    Object listNotificationsForOutstanding(List<Integer> list, InterfaceC5133d interfaceC5133d);

    Object markAsConsumed(int i, boolean z8, String str, boolean z9, InterfaceC5133d interfaceC5133d);

    Object markAsDismissed(int i, InterfaceC5133d interfaceC5133d);

    Object markAsDismissedForGroup(String str, InterfaceC5133d interfaceC5133d);

    Object markAsDismissedForOutstanding(InterfaceC5133d interfaceC5133d);
}
