package com.onesignal.notifications.internal.restoration.impl;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationRestoreWorkManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.restoration.impl.NotificationRestoreWorkManager$NotificationRestoreWorker", f = "NotificationRestoreWorkManager.kt", i = {0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_BASELINE_TO_BOTTOM_OF, ConstraintLayout.LayoutParams.Table.LAYOUT_CONSTRAINT_HEIGHT}, m = "doWork", n = {"context"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationRestoreWorkManager.NotificationRestoreWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1(NotificationRestoreWorkManager.NotificationRestoreWorker notificationRestoreWorker, Continuation<? super NotificationRestoreWorkManager$NotificationRestoreWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = notificationRestoreWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
