package com.onesignal.user.internal.operations.impl.executors;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.operations.impl.executors.RefreshUserOperationExecutor", f = "RefreshUserOperationExecutor.kt", l = {66}, m = "getUser")
/* loaded from: classes.dex */
public final class RefreshUserOperationExecutor$getUser$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ RefreshUserOperationExecutor this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RefreshUserOperationExecutor$getUser$1(RefreshUserOperationExecutor refreshUserOperationExecutor, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = refreshUserOperationExecutor;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object user;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        user = this.this$0.getUser(null, this);
        return user;
    }
}
