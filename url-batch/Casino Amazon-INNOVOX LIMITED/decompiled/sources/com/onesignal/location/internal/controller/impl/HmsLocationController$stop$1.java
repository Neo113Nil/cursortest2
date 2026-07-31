package com.onesignal.location.internal.controller.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: HmsLocationController.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.location.internal.controller.impl.HmsLocationController", f = "HmsLocationController.kt", i = {0, 0}, l = {229}, m = "stop", n = {"this", "$this$withLock_u24default$iv"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class HmsLocationController$stop$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ HmsLocationController this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HmsLocationController$stop$1(HmsLocationController hmsLocationController, Continuation<? super HmsLocationController$stop$1> continuation) {
        super(continuation);
        this.this$0 = hmsLocationController;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.stop(this);
    }
}
