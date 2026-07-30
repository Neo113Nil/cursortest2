package com.onesignal.notifications.internal;

import e5.m;

/* loaded from: classes2.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c notification) {
        kotlin.jvm.internal.h.e(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // e5.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z8) {
        this.discard = z8;
    }

    public final void setPreventDefault(boolean z8) {
        this.isPreventDefault = z8;
    }

    @Override // e5.m
    public c getNotification() {
        return this.notification;
    }

    @Override // e5.m
    public void preventDefault(boolean z8) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z8 + ')', null, 2, null);
        if (this.isPreventDefault && z8) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z8;
    }
}
