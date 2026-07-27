package com.onesignal.core.internal.operations.impl;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.core.internal.operations.impl.OperationRepo$onJwtConfigHydrated$1", f = "OperationRepo.kt", l = {326}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OperationRepo$onJwtConfigHydrated$1 extends h implements InterfaceC1441l {
    final /* synthetic */ boolean $ivRequired;
    int label;
    final /* synthetic */ OperationRepo this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OperationRepo$onJwtConfigHydrated$1(OperationRepo operationRepo, boolean z, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = operationRepo;
        this.$ivRequired = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OperationRepo$onJwtConfigHydrated$1(this.this$0, this.$ivRequired, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            OperationRepo operationRepo = this.this$0;
            this.label = 1;
            if (operationRepo.awaitInitialized(this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        if (this.$ivRequired) {
            this.this$0.removeOperationsWithoutExternalId$com_onesignal_core();
        }
        this.this$0.forceExecuteOperations();
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OperationRepo$onJwtConfigHydrated$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
