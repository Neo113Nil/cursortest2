package com.onesignal.notifications.internal.limiting.impl;

import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager", f = "NotificationLimitManager.kt", l = {C0793l9.f8683E, 23, 30}, m = "clearOldestOverLimit")
/* loaded from: classes.dex */
public final class NotificationLimitManager$clearOldestOverLimit$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLimitManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLimitManager$clearOldestOverLimit$1(NotificationLimitManager notificationLimitManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationLimitManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.clearOldestOverLimit(0, this);
    }
}
