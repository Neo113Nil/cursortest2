package com.onesignal.inAppMessages.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppMessagesManager.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", i = {0, 0, 0}, l = {418}, m = "fetchIvOrSaveRetry", n = {"this", "externalId", "ivBehaviorActive"}, s = {"L$0", "L$1", "Z$0"})
/* loaded from: classes3.dex */
final class InAppMessagesManager$fetchIvOrSaveRetry$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagesManager$fetchIvOrSaveRetry$1(InAppMessagesManager inAppMessagesManager, Continuation<? super InAppMessagesManager$fetchIvOrSaveRetry$1> continuation) {
        super(continuation);
        this.this$0 = inAppMessagesManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object fetchIvOrSaveRetry;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchIvOrSaveRetry = this.this$0.fetchIvOrSaveRetry(null, null, null, null, this);
        return fetchIvOrSaveRetry;
    }
}
