package com.onesignal.core.internal.operations.impl;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo$start$2", f = "OperationRepo.kt", l = {123}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperationRepo$start$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$start$2(OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OperationRepo$start$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OperationRepo$start$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object processQueueForever;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            this.this$0.loadSavedOperations$com_onesignal_core();
            OperationRepo operationRepo = this.this$0;
            this.label = 1;
            processQueueForever = operationRepo.processQueueForever(this);
            if (processQueueForever == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
