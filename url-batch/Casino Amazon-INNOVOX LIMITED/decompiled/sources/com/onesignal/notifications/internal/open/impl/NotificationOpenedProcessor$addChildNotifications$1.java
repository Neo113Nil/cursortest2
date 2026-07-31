package com.onesignal.notifications.internal.open.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationOpenedProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", i = {0}, l = {179}, m = "addChildNotifications", n = {"dataArray"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class NotificationOpenedProcessor$addChildNotifications$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedProcessor$addChildNotifications$1(NotificationOpenedProcessor notificationOpenedProcessor, Continuation<? super NotificationOpenedProcessor$addChildNotifications$1> continuation) {
        super(continuation);
        this.this$0 = notificationOpenedProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object addChildNotifications;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        addChildNotifications = this.this$0.addChildNotifications(null, null, this);
        return addChildNotifications;
    }
}
