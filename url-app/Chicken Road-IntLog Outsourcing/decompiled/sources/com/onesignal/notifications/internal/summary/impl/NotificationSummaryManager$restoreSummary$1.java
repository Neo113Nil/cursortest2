package com.onesignal.notifications.internal.summary.impl;

import io.appmetrica.analytics.AppMetricaDefaultValues;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.summary.impl.NotificationSummaryManager", f = "NotificationSummaryManager.kt", l = {88, AppMetricaDefaultValues.DEFAULT_DISPATCH_PERIOD_SECONDS}, m = "restoreSummary")
/* loaded from: classes.dex */
public final class NotificationSummaryManager$restoreSummary$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationSummaryManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationSummaryManager$restoreSummary$1(NotificationSummaryManager notificationSummaryManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = notificationSummaryManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object restoreSummary;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        restoreSummary = this.this$0.restoreSummary(null, this);
        return restoreSummary;
    }
}
