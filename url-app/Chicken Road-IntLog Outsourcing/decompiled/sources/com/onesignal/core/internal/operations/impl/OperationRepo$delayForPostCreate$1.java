package com.onesignal.core.internal.operations.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {514}, m = "delayForPostCreate")
/* loaded from: classes.dex */
public final class OperationRepo$delayForPostCreate$1 extends AbstractC1295c {
    long J$0;
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$delayForPostCreate$1(OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.delayForPostCreate(0L, this);
    }
}
