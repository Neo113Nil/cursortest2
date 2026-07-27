package com.onesignal.notifications.internal.generation.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {280}, m = "saveNotification")
/* loaded from: classes.dex */
public final class NotificationGenerationProcessor$saveNotification$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationProcessor$saveNotification$1(NotificationGenerationProcessor notificationGenerationProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object saveNotification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveNotification = this.this$0.saveNotification(null, false, this);
        return saveNotification;
    }
}
