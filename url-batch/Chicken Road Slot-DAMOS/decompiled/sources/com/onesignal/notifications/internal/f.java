package com.onesignal.notifications.internal;

import android.content.Context;
import qb.k;

/* compiled from: r8-map-id-c4937ab901668f9cff4bec8519cace7e1239157a414c58210d923e8673528904 */
/* loaded from: classes.dex */
public final class f implements k {
    private final Context context;
    private boolean discard;
    private boolean isPreventDefault;
    private final c notification;

    public f(Context context, c cVar) {
        context.getClass();
        cVar.getClass();
        this.context = context;
        this.notification = cVar;
    }

    @Override // qb.k
    public Context getContext() {
        return this.context;
    }

    public final boolean getDiscard() {
        return this.discard;
    }

    public final boolean isPreventDefault() {
        return this.isPreventDefault;
    }

    @Override // qb.k
    public void preventDefault(boolean z10) {
        com.onesignal.debug.internal.logging.b.debug$default("NotificationReceivedEvent.preventDefault(" + z10 + ')', null, 2, null);
        if (this.isPreventDefault && z10) {
            getNotification().getDisplayWaiter().wake(Boolean.FALSE);
        }
        this.isPreventDefault = true;
        this.discard = z10;
    }

    public final void setDiscard(boolean z10) {
        this.discard = z10;
    }

    public final void setPreventDefault(boolean z10) {
        this.isPreventDefault = z10;
    }

    @Override // qb.k
    public c getNotification() {
        return this.notification;
    }

    @Override // qb.k
    public void preventDefault() {
        preventDefault(false);
    }
}
