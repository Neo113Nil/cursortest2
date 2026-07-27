package com.onesignal.notifications.internal.backend.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.backend.impl.NotificationBackendService", f = "NotificationBackendService.kt", l = {24}, m = "updateNotificationAsReceived")
/* loaded from: classes.dex */
public final class NotificationBackendService$updateNotificationAsReceived$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationBackendService$updateNotificationAsReceived$1(NotificationBackendService notificationBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateNotificationAsReceived(null, null, null, null, this);
    }
}
