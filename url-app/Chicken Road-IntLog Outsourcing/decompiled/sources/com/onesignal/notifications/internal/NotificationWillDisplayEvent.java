package com.onesignal.notifications.internal;

import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.INotificationWillDisplayEvent;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class NotificationWillDisplayEvent implements INotificationWillDisplayEvent {
    private boolean discard;
    private boolean isPreventDefault;
    private final Notification notification;

    public NotificationWillDisplayEvent(Notification notification) {
        i.e(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z) {
        this.discard = z;
    }

    public final void setPreventDefault(boolean z) {
        this.isPreventDefault = z;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public Notification getNotification() {
        return this.notification;
    }

    @Override // com.onesignal.notifications.INotificationWillDisplayEvent
    public void preventDefault(boolean z) {
        Logging.debug$default("NotificationWillDisplayEvent.preventDefault(" + z + ')', null, 2, null);
        if (this.isPreventDefault && z) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z;
    }
}
