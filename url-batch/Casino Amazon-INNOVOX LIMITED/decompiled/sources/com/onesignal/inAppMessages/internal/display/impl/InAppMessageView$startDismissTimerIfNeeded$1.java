package com.onesignal.inAppMessages.internal.display.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppMessageView.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.display.impl.InAppMessageView", f = "InAppMessageView.kt", i = {0, 1}, l = {428, 439}, m = "startDismissTimerIfNeeded", n = {"this", "this"}, s = {"L$0", "L$0"})
/* loaded from: classes3.dex */
final class InAppMessageView$startDismissTimerIfNeeded$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessageView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessageView$startDismissTimerIfNeeded$1(InAppMessageView inAppMessageView, Continuation<? super InAppMessageView$startDismissTimerIfNeeded$1> continuation) {
        super(continuation);
        this.this$0 = inAppMessageView;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object startDismissTimerIfNeeded;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        startDismissTimerIfNeeded = this.this$0.startDismissTimerIfNeeded(this);
        return startDismissTimerIfNeeded;
    }
}
