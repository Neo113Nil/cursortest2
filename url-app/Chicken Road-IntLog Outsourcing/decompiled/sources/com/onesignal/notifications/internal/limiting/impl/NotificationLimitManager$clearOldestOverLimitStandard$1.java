package com.onesignal.notifications.internal.limiting.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.limiting.impl.NotificationLimitManager", f = "NotificationLimitManager.kt", l = {57, 60}, m = "clearOldestOverLimitStandard")
/* loaded from: classes.dex */
public final class NotificationLimitManager$clearOldestOverLimitStandard$1 extends AbstractC1295c {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLimitManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationLimitManager$clearOldestOverLimitStandard$1(NotificationLimitManager notificationLimitManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationLimitManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object clearOldestOverLimitStandard;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        clearOldestOverLimitStandard = this.this$0.clearOldestOverLimitStandard(0, this);
        return clearOldestOverLimitStandard;
    }
}
