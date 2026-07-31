package com.onesignal.notifications.internal;

import F2.m;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c notification) {
        i.e(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // F2.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z5) {
        this.discard = z5;
    }

    public final void setPreventDefault(boolean z5) {
        this.isPreventDefault = z5;
    }

    @Override // F2.m
    public c getNotification() {
        return this.notification;
    }

    @Override // F2.m
    public void preventDefault(boolean z5) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z5 + ')', null, 2, null);
        if (this.isPreventDefault && z5) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z5;
    }
}
