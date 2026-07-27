package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$setConsentGiven$2", f = "OneSignalImp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$setConsentGiven$2 extends h implements InterfaceC1445p {
    final /* synthetic */ boolean $value;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$setConsentGiven$2(OneSignalImp oneSignalImp, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$value = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$setConsentGiven$2(this.this$0, this.$value, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$setConsentGiven$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Boolean bool;
        ConfigModel configModel;
        IOperationRepo operationRepo;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        bool = this.this$0._consentGiven;
        this.this$0._consentGiven = Boolean.valueOf(this.$value);
        configModel = this.this$0.getConfigModel();
        configModel.setConsentGiven(Boolean.valueOf(this.$value));
        if (!i.a(bool, Boolean.valueOf(this.$value)) && this.$value) {
            operationRepo = this.this$0.getOperationRepo();
            operationRepo.forceExecuteOperations();
        }
        return v.f5689a;
    }
}
