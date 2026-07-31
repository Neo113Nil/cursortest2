package com.onesignal.notifications.internal.generation.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationGenerationProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", i = {}, l = {280}, m = "saveNotification", n = {}, s = {})
/* loaded from: classes3.dex */
final class NotificationGenerationProcessor$saveNotification$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationGenerationProcessor$saveNotification$1(NotificationGenerationProcessor notificationGenerationProcessor, Continuation<? super NotificationGenerationProcessor$saveNotification$1> continuation) {
        super(continuation);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object saveNotification;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        saveNotification = this.this$0.saveNotification(null, false, this);
        return saveNotification;
    }
}
