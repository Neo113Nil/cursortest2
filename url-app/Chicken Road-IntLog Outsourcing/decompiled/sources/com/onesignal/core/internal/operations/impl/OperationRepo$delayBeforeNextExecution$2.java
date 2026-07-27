package com.onesignal.core.internal.operations.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.permissions.PermissionsViewModel;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo$delayBeforeNextExecution$2", f = "OperationRepo.kt", l = {PermissionsViewModel.DELAY_TIME_CALLBACK_CALL}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperationRepo$delayBeforeNextExecution$2 extends h implements InterfaceC1445p {
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$delayBeforeNextExecution$2(OperationRepo operationRepo, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = operationRepo;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OperationRepo$delayBeforeNextExecution$2(this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OperationRepo$delayBeforeNextExecution$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        WaiterWithValue waiterWithValue;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            waiterWithValue = this.this$0.retryWaiter;
            this.label = 1;
            obj = waiterWithValue.waitForWake(this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return obj;
    }
}
