package com.onesignal.user.internal;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoginHelper.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.LoginHelper", f = "LoginHelper.kt", i = {}, l = {82}, m = "enqueueLogin$com_onesignal_core", n = {}, s = {})
/* loaded from: classes3.dex */
final class LoginHelper$enqueueLogin$1 extends ContinuationImpl {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginHelper$enqueueLogin$1(LoginHelper loginHelper, Continuation<? super LoginHelper$enqueueLogin$1> continuation) {
        super(continuation);
        this.this$0 = loginHelper;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.enqueueLogin$com_onesignal_core(null, this);
    }
}
