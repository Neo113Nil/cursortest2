package com.onesignal.notifications.internal;

import android.content.Context;
import h3.k;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c notification) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(notification, "notification");
        this.context = context;
        this.notification = notification;
    }

    @Override // h3.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // h3.k
    public void preventDefault() {
        preventDefault(false);
    }

    public final void setDiscard(boolean z7) {
        this.discard = z7;
    }

    public final void setPreventDefault(boolean z7) {
        this.isPreventDefault = z7;
    }

    @Override // h3.k
    public c getNotification() {
        return this.notification;
    }

    @Override // h3.k
    public void preventDefault(boolean z7) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z7 + ')', null, 2, null);
        if (this.isPreventDefault && z7) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z7;
    }
}
