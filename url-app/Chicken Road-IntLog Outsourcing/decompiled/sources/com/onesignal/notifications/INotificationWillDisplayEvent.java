package com.onesignal.notifications;

/* loaded from: classes.dex */
public interface INotificationWillDisplayEvent {
    IDisplayableNotification getNotification();

    void preventDefault();

    void preventDefault(boolean z);
}
