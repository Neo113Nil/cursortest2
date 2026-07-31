package com.onesignal.notifications.internal.generation.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationGenerationProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationProcessor", f = "NotificationGenerationProcessor.kt", i = {0, 0}, l = {172, 190, 195}, m = "processHandlerResponse", n = {"this", "notificationJob"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class NotificationGenerationProcessor$processHandlerResponse$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationGenerationProcessor$processHandlerResponse$1(NotificationGenerationProcessor notificationGenerationProcessor, Continuation<? super NotificationGenerationProcessor$processHandlerResponse$1> continuation) {
        super(continuation);
        this.this$0 = notificationGenerationProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object processHandlerResponse;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processHandlerResponse = this.this$0.processHandlerResponse(null, false, false, this);
        return processHandlerResponse;
    }
}
