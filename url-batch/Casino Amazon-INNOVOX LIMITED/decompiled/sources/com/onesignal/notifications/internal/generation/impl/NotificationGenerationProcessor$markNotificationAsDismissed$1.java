package com.onesignal.notifications.internal.generation.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationGenerationProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", i = {0, 0}, l = {305, 308}, m = "markNotificationAsDismissed", n = {"this", "notifiJob"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class NotificationGenerationProcessor$markNotificationAsDismissed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationGenerationProcessor$markNotificationAsDismissed$1(NotificationGenerationProcessor notificationGenerationProcessor, Continuation<? super NotificationGenerationProcessor$markNotificationAsDismissed$1> continuation) {
        super(continuation);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object markNotificationAsDismissed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        markNotificationAsDismissed = this.this$0.markNotificationAsDismissed(null, this);
        return markNotificationAsDismissed;
    }
}
