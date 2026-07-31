package com.onesignal.user.internal.operations.impl.executors;

import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;

/* compiled from: LoginUserFromSubscriptionOperationExecutor.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "com.onesignal.user.internal.operations.impl.executors.LoginUserFromSubscriptionOperationExecutor", f = "LoginUserFromSubscriptionOperationExecutor.kt", i = {0, 0}, l = {ConstraintLayout.LayoutParams.Table.LAYOUT_GONE_MARGIN_BASELINE}, m = "loginUser", n = {"this", "loginUserOp"}, s = {"L$0", "L$1"})
/* loaded from: classes3.dex */
final class LoginUserFromSubscriptionOperationExecutor$loginUser$1 extends ContinuationImpl {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginUserFromSubscriptionOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LoginUserFromSubscriptionOperationExecutor$loginUser$1(LoginUserFromSubscriptionOperationExecutor loginUserFromSubscriptionOperationExecutor, Continuation<? super LoginUserFromSubscriptionOperationExecutor$loginUser$1> continuation) {
        super(continuation);
        this.this$0 = loginUserFromSubscriptionOperationExecutor;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object loginUser;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        loginUser = this.this$0.loginUser(null, this);
        return loginUser;
    }
}
