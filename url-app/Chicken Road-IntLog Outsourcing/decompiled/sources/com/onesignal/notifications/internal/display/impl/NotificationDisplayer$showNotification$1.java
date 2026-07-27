package com.onesignal.notifications.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.display.impl.NotificationDisplayer", f = "NotificationDisplayer.kt", l = {118, 133, 140}, m = "showNotification")
/* loaded from: classes.dex */
public final class NotificationDisplayer$showNotification$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationDisplayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationDisplayer$showNotification$1(NotificationDisplayer notificationDisplayer, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationDisplayer;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object showNotification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        showNotification = this.this$0.showNotification(null, this);
        return showNotification;
    }
}
