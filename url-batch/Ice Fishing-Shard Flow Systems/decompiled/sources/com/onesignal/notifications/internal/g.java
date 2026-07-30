package com.onesignal.notifications.internal;

import h3.m;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class g implements m {
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public g(c notification) {
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.notification = notification;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // h3.m
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z7) {
        this.discard = z7;
    }

    public final void setPreventDefault(boolean z7) {
        this.isPreventDefault = z7;
    }

    @Override // h3.m
    public c getNotification() {
        return this.notification;
    }

    @Override // h3.m
    public void preventDefault(boolean z7) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationWillDisplayEvent.preventDefault(" + z7 + ')', null, 2, null);
        if (this.isPreventDefault && z7) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z7;
    }
}
