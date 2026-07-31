package com.onesignal.notifications.internal.open.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationOpenedProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", i = {0, 0, 0, 0, 1, 1}, l = {150, 169}, m = "processToOpenIntent", n = {"this", "intent", "summaryGroup", "jsonData", "dataArray", "jsonData"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class NotificationOpenedProcessor$processToOpenIntent$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedProcessor$processToOpenIntent$1(NotificationOpenedProcessor notificationOpenedProcessor, Continuation<? super NotificationOpenedProcessor$processToOpenIntent$1> continuation) {
        super(continuation);
        this.this$0 = notificationOpenedProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processToOpenIntent;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processToOpenIntent = this.this$0.processToOpenIntent(null, null, null, this);
        return processToOpenIntent;
    }
}
