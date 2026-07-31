package com.onesignal.notifications.internal.receivereceipt.impl;

import com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: ReceiveReceiptWorkManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.notifications.internal.receivereceipt.impl.ReceiveReceiptWorkManager$ReceiveReceiptWorker", f = "ReceiveReceiptWorkManager.kt", i = {0}, l = {76, 86}, m = "doWork", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ ReceiveReceiptWorkManager.ReceiveReceiptWorker this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1(ReceiveReceiptWorkManager.ReceiveReceiptWorker receiveReceiptWorker, Continuation<? super ReceiveReceiptWorkManager$ReceiveReceiptWorker$doWork$1> continuation) {
        super(continuation);
        this.this$0 = receiveReceiptWorker;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.doWork(this);
    }
}
