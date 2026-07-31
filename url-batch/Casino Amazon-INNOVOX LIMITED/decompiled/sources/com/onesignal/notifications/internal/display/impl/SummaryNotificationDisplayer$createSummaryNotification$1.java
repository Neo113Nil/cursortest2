package com.onesignal.notifications.internal.display.impl;

import io.appmetrica.analytics.BuildConfig;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: SummaryNotificationDisplayer.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.display.impl.SummaryNotificationDisplayer", f = "SummaryNotificationDisplayer.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2}, l = {111, BuildConfig.API_LEVEL, 119}, m = "createSummaryNotification", n = {"this", "notificationJob", "notifBuilder", "fcmJson", "intentGenerator", "group", "random", "summaryDeleteIntent", "groupAlertBehavior", "updateSummary", "this", "notificationJob", "notifBuilder", "fcmJson", "intentGenerator", "group", "random", "summaryDeleteIntent", "summaryNotificationId", "groupAlertBehavior", "updateSummary", "this", "notificationJob", "notifBuilder", "fcmJson", "intentGenerator", "group", "random", "summaryDeleteIntent", "summaryNotificationId", "groupAlertBehavior", "updateSummary"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "Z$0", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "I$0", "Z$0"})
/* loaded from: classes3.dex */
final class SummaryNotificationDisplayer$createSummaryNotification$1 extends ContinuationImpl {
    int I$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ SummaryNotificationDisplayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SummaryNotificationDisplayer$createSummaryNotification$1(SummaryNotificationDisplayer summaryNotificationDisplayer, Continuation<? super SummaryNotificationDisplayer$createSummaryNotification$1> continuation) {
        super(continuation);
        this.this$0 = summaryNotificationDisplayer;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createSummaryNotification(null, null, 0, this);
    }
}
