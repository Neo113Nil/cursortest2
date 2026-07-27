package com.onesignal.notifications.internal.lifecycle.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", l = {211, 222}, m = "confirmNotificationOpened")
/* loaded from: classes.dex */
public final class NotificationLifecycleService$confirmNotificationOpened$1 extends AbstractC1295c {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLifecycleService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLifecycleService$confirmNotificationOpened$1(NotificationLifecycleService notificationLifecycleService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationLifecycleService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object confirmNotificationOpened;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmNotificationOpened = this.this$0.confirmNotificationOpened(null, null, null, null, this);
        return confirmNotificationOpened;
    }
}
