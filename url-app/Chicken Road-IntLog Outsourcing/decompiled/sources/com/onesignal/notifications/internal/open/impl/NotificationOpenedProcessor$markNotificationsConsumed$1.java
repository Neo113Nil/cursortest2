package com.onesignal.notifications.internal.open.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", l = {191, 192}, m = "markNotificationsConsumed")
/* loaded from: classes.dex */
public final class NotificationOpenedProcessor$markNotificationsConsumed$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenedProcessor$markNotificationsConsumed$1(NotificationOpenedProcessor notificationOpenedProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationOpenedProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object markNotificationsConsumed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        markNotificationsConsumed = this.this$0.markNotificationsConsumed(null, null, false, this);
        return markNotificationsConsumed;
    }
}
