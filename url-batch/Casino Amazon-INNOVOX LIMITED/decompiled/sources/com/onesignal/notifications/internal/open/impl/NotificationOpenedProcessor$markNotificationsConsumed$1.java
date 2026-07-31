package com.onesignal.notifications.internal.open.impl;

import com.facebook.imageutils.JfifUtil;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationOpenedProcessor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessor", f = "NotificationOpenedProcessor.kt", i = {0, 0, 0, 0}, l = {191, JfifUtil.MARKER_SOFn}, m = "markNotificationsConsumed", n = {"this", "intent", "summaryGroup", "dismissed"}, s = {"L$0", "L$1", "L$2", "Z$0"})
/* loaded from: classes3.dex */
final class NotificationOpenedProcessor$markNotificationsConsumed$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedProcessor$markNotificationsConsumed$1(NotificationOpenedProcessor notificationOpenedProcessor, Continuation<? super NotificationOpenedProcessor$markNotificationsConsumed$1> continuation) {
        super(continuation);
        this.this$0 = notificationOpenedProcessor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object markNotificationsConsumed;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        markNotificationsConsumed = this.this$0.markNotificationsConsumed(null, null, false, this);
        return markNotificationsConsumed;
    }
}
