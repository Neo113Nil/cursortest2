package com.onesignal.inAppMessages.internal.preview;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppMessagePreviewHandler.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.preview.InAppMessagePreviewHandler", f = "InAppMessagePreviewHandler.kt", i = {0}, l = {40, 46}, m = "canReceiveNotification", n = {"this"}, s = {"L$0"})
/* loaded from: classes3.dex */
final class InAppMessagePreviewHandler$canReceiveNotification$1 extends ContinuationImpl {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagePreviewHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppMessagePreviewHandler$canReceiveNotification$1(InAppMessagePreviewHandler inAppMessagePreviewHandler, Continuation<? super InAppMessagePreviewHandler$canReceiveNotification$1> continuation) {
        super(continuation);
        this.this$0 = inAppMessagePreviewHandler;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.canReceiveNotification(null, this);
    }
}
