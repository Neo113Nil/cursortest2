package com.onesignal.notifications.internal;

import android.content.Context;
import e5.k;

/* loaded from: classes2.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c notification) {
        kotlin.jvm.internal.h.e(context, "context");
        kotlin.jvm.internal.h.e(notification, "notification");
        this.context = context;
        this.notification = notification;
    }

    @Override // e5.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // e5.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z8) {
        this.discard = z8;
    }

    public final void setPreventDefault(boolean z8) {
        this.isPreventDefault = z8;
    }

    @Override // e5.k
    public c getNotification() {
        return this.notification;
    }

    @Override // e5.k
    public void preventDefault(boolean z8) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z8 + ')', null, 2, null);
        if (this.isPreventDefault && z8) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z8;
    }
}
