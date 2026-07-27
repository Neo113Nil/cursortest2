package com.onesignal.notifications.internal.summary.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {44, 48, 59, 67, 81}, m = "internalUpdateSummaryNotificationAfterChildRemoved")
/* loaded from: classes.dex */
public final class NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSummaryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSummaryManager$internalUpdateSummaryNotificationAfterChildRemoved$1(NotificationSummaryManager notificationSummaryManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationSummaryManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object internalUpdateSummaryNotificationAfterChildRemoved;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        internalUpdateSummaryNotificationAfterChildRemoved = this.this$0.internalUpdateSummaryNotificationAfterChildRemoved(null, false, this);
        return internalUpdateSummaryNotificationAfterChildRemoved;
    }
}
