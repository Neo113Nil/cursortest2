package com.onesignal.inAppMessages.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppMessagesManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", i = {0, 1, 1, 1, 2, 2}, l = {542, 1119, 572, 579, 583}, m = "attemptToShowInAppMessage", n = {"this", "this", "messageToDisplay", "$this$withLock_u24default$iv", "this", "messageToDisplay"}, s = {"L$0", "L$0", "L$1", "L$2", "L$0", "L$1"})
/* loaded from: classes3.dex */
final class InAppMessagesManager$attemptToShowInAppMessage$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$attemptToShowInAppMessage$1(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$attemptToShowInAppMessage$1> continuation) {
        super(continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object attemptToShowInAppMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        attemptToShowInAppMessage = this.this$0.attemptToShowInAppMessage(this);
        return attemptToShowInAppMessage;
    }
}
