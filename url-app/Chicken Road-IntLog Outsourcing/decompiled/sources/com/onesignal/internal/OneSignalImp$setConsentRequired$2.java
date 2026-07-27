package com.onesignal.internal;

import D4.InterfaceC0022w;
import com.onesignal.core.internal.config.ConfigModel;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.internal.OneSignalImp$setConsentRequired$2", f = "OneSignalImp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$setConsentRequired$2 extends h implements InterfaceC1445p {
    final /* synthetic */ boolean $required;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$setConsentRequired$2(OneSignalImp oneSignalImp, boolean z, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$required = z;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$setConsentRequired$2(this.this$0, this.$required, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$setConsentRequired$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        ConfigModel configModel;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        this.this$0._consentRequired = Boolean.valueOf(this.$required);
        configModel = this.this$0.getConfigModel();
        configModel.setConsentRequired(Boolean.valueOf(this.$required));
        return v.f5689a;
    }
}
