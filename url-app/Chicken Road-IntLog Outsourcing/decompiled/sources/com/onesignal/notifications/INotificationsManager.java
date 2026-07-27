package com.onesignal.notifications;

import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationsManager {
    /* renamed from: addClickListener */
    void mo19addClickListener(INotificationClickListener iNotificationClickListener);

    /* renamed from: addForegroundLifecycleListener */
    void mo20addForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    /* renamed from: addPermissionObserver */
    void mo21addPermissionObserver(IPermissionObserver iPermissionObserver);

    /* renamed from: clearAllNotifications */
    void mo22clearAllNotifications();

    /* renamed from: getCanRequestPermission */
    boolean mo23getCanRequestPermission();

    /* renamed from: getPermission */
    boolean mo24getPermission();

    /* renamed from: removeClickListener */
    void mo25removeClickListener(INotificationClickListener iNotificationClickListener);

    /* renamed from: removeForegroundLifecycleListener */
    void mo26removeForegroundLifecycleListener(INotificationLifecycleListener iNotificationLifecycleListener);

    /* renamed from: removeGroupedNotifications */
    void mo27removeGroupedNotifications(String str);

    /* renamed from: removeNotification */
    void mo28removeNotification(int i2);

    /* renamed from: removePermissionObserver */
    void mo29removePermissionObserver(IPermissionObserver iPermissionObserver);

    Object requestPermission(boolean z, InterfaceC1218d interfaceC1218d);
}
