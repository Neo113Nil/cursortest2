package com.onesignal.core.internal.operations.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo", f = "OperationRepo.kt", l = {257, 272, 275, 277}, m = "processQueueForever")
/* loaded from: classes.dex */
public final class OperationRepo$processQueueForever$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$processQueueForever$1(OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object processQueueForever;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        processQueueForever = this.this$0.processQueueForever(this);
        return processQueueForever;
    }
}
