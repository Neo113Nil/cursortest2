package com.onesignal.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: OneSignalImp.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.internal.OneSignalImp", f = "OneSignalImp.kt", i = {0, 0, 0}, l = {584}, m = "awaitInitCompletion", n = {"this", "operationName", "startTime"}, s = {"L$0", "L$1", "J$0"})
/* loaded from: classes3.dex */
final class OneSignalImp$awaitInitCompletion$1 extends ContinuationImpl {
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OneSignalImp$awaitInitCompletion$1(OneSignalImp oneSignalImp, Continuation<? super OneSignalImp$awaitInitCompletion$1> continuation) {
        super(continuation);
        this.this$0 = oneSignalImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object awaitInitCompletion;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        awaitInitCompletion = this.this$0.awaitInitCompletion(null, null, this);
        return awaitInitCompletion;
    }
}
