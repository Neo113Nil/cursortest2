package com.onesignal.notifications.internal.generation.impl;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationGenerationWorkManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.generation.impl.NotificationGenerationWorkManager$NotificationGenerationWorker", f = "NotificationGenerationWorkManager.kt", i = {0, 1}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT, 87}, m = "doWork", n = {"this", "id"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationGenerationWorkManager.NotificationGenerationWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1(NotificationGenerationWorkManager.NotificationGenerationWorker notificationGenerationWorker, Continuation<? super NotificationGenerationWorkManager$NotificationGenerationWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = notificationGenerationWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
