package com.onesignal.inAppMessages.internal.backend.impl;

import com.facebook.soloader.Elf64;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: InAppBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", i = {1, 1, 1, 1, 1}, l = {54, Elf64.Ehdr.E_SHENTSIZE, 59}, m = "listInAppMessagesIv", n = {"this", "rywData", "sessionDurationProvider", "jwt", "baseUrl"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4"})
/* loaded from: classes3.dex */
final class InAppBackendService$listInAppMessagesIv$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InAppBackendService$listInAppMessagesIv$1(InAppBackendService inAppBackendService, Continuation<? super InAppBackendService$listInAppMessagesIv$1> continuation) {
        super(continuation);
        this.this$0 = inAppBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.listInAppMessagesIv(null, null, null, null, null, null, null, this);
    }
}
