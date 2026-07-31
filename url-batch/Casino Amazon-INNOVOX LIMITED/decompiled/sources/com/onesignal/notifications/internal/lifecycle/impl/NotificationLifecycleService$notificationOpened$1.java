package com.onesignal.notifications.internal.lifecycle.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationLifecycleService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.lifecycle.impl.NotificationLifecycleService", f = "NotificationLifecycleService.kt", i = {0, 0}, l = {183}, m = "notificationOpened", n = {"this", "data"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class NotificationLifecycleService$notificationOpened$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationLifecycleService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationLifecycleService$notificationOpened$1(NotificationLifecycleService notificationLifecycleService, Continuation<? super NotificationLifecycleService$notificationOpened$1> continuation) {
        super(continuation);
        this.this$0 = notificationLifecycleService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.notificationOpened(null, null, this);
    }
}
