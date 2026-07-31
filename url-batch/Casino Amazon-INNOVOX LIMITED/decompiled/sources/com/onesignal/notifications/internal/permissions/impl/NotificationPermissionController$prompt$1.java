package com.onesignal.notifications.internal.permissions.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationPermissionController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.permissions.impl.NotificationPermissionController", f = "NotificationPermissionController.kt", i = {0, 0}, l = {152, 173}, m = "prompt", n = {"this", "fallbackToSettings"}, s = {"L$0", "Z$0"})
/* loaded from: classes3.dex */
final class NotificationPermissionController$prompt$1 extends ContinuationImpl {
    Object L$0;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationPermissionController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationPermissionController$prompt$1(NotificationPermissionController notificationPermissionController, Continuation<? super NotificationPermissionController$prompt$1> continuation) {
        super(continuation);
        this.this$0 = notificationPermissionController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.prompt(false, this);
    }
}
