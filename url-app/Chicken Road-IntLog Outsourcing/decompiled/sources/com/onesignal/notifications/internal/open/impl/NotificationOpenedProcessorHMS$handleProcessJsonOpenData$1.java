package com.onesignal.notifications.internal.open.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS", f = "NotificationOpenedProcessorHMS.kt", l = {62, 66}, m = "handleProcessJsonOpenData")
/* loaded from: classes.dex */
public final class NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessorHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1(NotificationOpenedProcessorHMS notificationOpenedProcessorHMS, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationOpenedProcessorHMS;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object handleProcessJsonOpenData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleProcessJsonOpenData = this.this$0.handleProcessJsonOpenData(null, null, this);
        return handleProcessJsonOpenData;
    }
}
