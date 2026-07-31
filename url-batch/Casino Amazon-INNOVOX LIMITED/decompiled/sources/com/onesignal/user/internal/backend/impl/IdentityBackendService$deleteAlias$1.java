package com.onesignal.user.internal.backend.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: IdentityBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.backend.impl.IdentityBackendService", f = "IdentityBackendService.kt", i = {}, l = {45}, m = "deleteAlias", n = {}, s = {})
/* loaded from: classes3.dex */
final class IdentityBackendService$deleteAlias$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ IdentityBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    IdentityBackendService$deleteAlias$1(IdentityBackendService identityBackendService, Continuation<? super IdentityBackendService$deleteAlias$1> continuation) {
        super(continuation);
        this.this$0 = identityBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.deleteAlias(null, null, null, null, null, this);
    }
}
