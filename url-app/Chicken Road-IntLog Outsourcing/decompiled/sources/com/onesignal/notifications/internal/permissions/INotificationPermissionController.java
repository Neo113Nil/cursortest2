package com.onesignal.notifications.internal.permissions;

import com.onesignal.common.events.IEventNotifier;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public interface INotificationPermissionController extends IEventNotifier<INotificationPermissionChangedHandler> {
    boolean getCanRequestPermission();

    Object prompt(boolean z, InterfaceC1218d interfaceC1218d);
}
