package com.onesignal.notifications.internal.lifecycle.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationLifecycleService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", i = {0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1}, l = {211, 222}, m = "confirmNotificationOpened", n = {"this", "appId", "notificationId", "subscriptionId", "deviceType", "attempt", "this", "appId", "notificationId", "subscriptionId", "deviceType", "attempt"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "I$0", "L$0", "L$1", "L$2", "L$3", "L$4", "I$0"})
/* loaded from: classes3.dex */
final class NotificationLifecycleService$confirmNotificationOpened$1 extends ContinuationImpl {
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLifecycleService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationLifecycleService$confirmNotificationOpened$1(NotificationLifecycleService notificationLifecycleService, Continuation<? super NotificationLifecycleService$confirmNotificationOpened$1> continuation) {
        super(continuation);
        this.this$0 = notificationLifecycleService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object confirmNotificationOpened;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        confirmNotificationOpened = this.this$0.confirmNotificationOpened(null, null, null, null, this);
        return confirmNotificationOpened;
    }
}
