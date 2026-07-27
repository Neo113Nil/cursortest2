package com.onesignal.notifications.internal.registration.impl;

import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorADM", f = "PushRegistratorADM.kt", l = {C0793l9.f8688J}, m = "registerForPush")
/* loaded from: classes.dex */
public final class PushRegistratorADM$registerForPush$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushRegistratorADM this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorADM$registerForPush$1(PushRegistratorADM pushRegistratorADM, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = pushRegistratorADM;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.registerForPush(this);
    }
}
