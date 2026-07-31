package com.onesignal.user.internal.customEvents.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: CustomEventBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.customEvents.impl.CustomEventBackendService", f = "CustomEventBackendService.kt", i = {}, l = {47}, m = "sendCustomEvent", n = {}, s = {})
/* loaded from: classes3.dex */
final class CustomEventBackendService$sendCustomEvent$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomEventBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CustomEventBackendService$sendCustomEvent$1(CustomEventBackendService customEventBackendService, Continuation<? super CustomEventBackendService$sendCustomEvent$1> continuation) {
        super(continuation);
        this.this$0 = customEventBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
    }
}
