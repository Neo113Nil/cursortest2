package com.onesignal.notifications.internal;

import F2.k;
import android.content.Context;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c notification) {
        i.e(context, "context");
        i.e(notification, "notification");
        this.context = context;
        this.notification = notification;
    }

    @Override // F2.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // F2.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z5) {
        this.discard = z5;
    }

    public final void setPreventDefault(boolean z5) {
        this.isPreventDefault = z5;
    }

    @Override // F2.k
    public c getNotification() {
        return this.notification;
    }

    @Override // F2.k
    public void preventDefault(boolean z5) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z5 + ')', null, 2, null);
        if (this.isPreventDefault && z5) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z5;
    }
}
