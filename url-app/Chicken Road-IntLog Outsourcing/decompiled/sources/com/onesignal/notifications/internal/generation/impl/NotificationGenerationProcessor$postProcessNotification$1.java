package com.onesignal.notifications.internal.generation.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", l = {231, 235, 239}, m = "postProcessNotification")
/* loaded from: classes.dex */
public final class NotificationGenerationProcessor$postProcessNotification$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationGenerationProcessor$postProcessNotification$1(NotificationGenerationProcessor notificationGenerationProcessor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object postProcessNotification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        postProcessNotification = this.this$0.postProcessNotification(null, false, false, this);
        return postProcessNotification;
    }
}
