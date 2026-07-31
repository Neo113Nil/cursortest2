package com.onesignal.user.internal.backend.impl;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: UserBackendService.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.backend.impl.UserBackendService", f = "UserBackendService.kt", i = {}, l = {44}, m = "createUser", n = {}, s = {})
/* loaded from: classes3.dex */
final class UserBackendService$createUser$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ UserBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    UserBackendService$createUser$1(UserBackendService userBackendService, Continuation<? super UserBackendService$createUser$1> continuation) {
        super(continuation);
        this.this$0 = userBackendService;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.createUser(null, null, null, null, null, this);
    }
}
