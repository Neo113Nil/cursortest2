package com.onesignal.notifications.internal.open.impl;

import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: NotificationOpenedProcessorHMS.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.open.impl.NotificationOpenedProcessorHMS", f = "NotificationOpenedProcessorHMS.kt", i = {0, 0, 0}, l = {Elf64.Ehdr.E_SHSTRNDX, ConstraintLayout.LayoutParams.Table.LAYOUT_WRAP_BEHAVIOR_IN_PARENT}, m = "handleProcessJsonOpenData", n = {"this", "activity", "jsonData"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ NotificationOpenedProcessorHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1(NotificationOpenedProcessorHMS notificationOpenedProcessorHMS, Continuation<? super NotificationOpenedProcessorHMS$handleProcessJsonOpenData$1> continuation) {
        super(continuation);
        this.this$0 = notificationOpenedProcessorHMS;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object handleProcessJsonOpenData;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        handleProcessJsonOpenData = this.this$0.handleProcessJsonOpenData(null, null, this);
        return handleProcessJsonOpenData;
    }
}
