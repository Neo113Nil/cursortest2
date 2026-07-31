package com.onesignal.inAppMessages.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppMessagesManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", i = {0, 0, 0}, l = {1119, 537}, m = "queueMessageForDisplay", n = {"this", "message", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1", "L$2"})
/* loaded from: classes3.dex */
final class InAppMessagesManager$queueMessageForDisplay$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$queueMessageForDisplay$1(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$queueMessageForDisplay$1> continuation) {
        super(continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object queueMessageForDisplay;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        queueMessageForDisplay = this.this$0.queueMessageForDisplay(null, this);
        return queueMessageForDisplay;
    }
}
