package com.onesignal.notifications.internal.registration.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorAbstractGoogle", f = "PushRegistratorAbstractGoogle.kt", l = {84, 86}, m = "internalRegisterForPush")
/* loaded from: classes.dex */
public final class PushRegistratorAbstractGoogle$internalRegisterForPush$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ PushRegistratorAbstractGoogle this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorAbstractGoogle$internalRegisterForPush$1(PushRegistratorAbstractGoogle pushRegistratorAbstractGoogle, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = pushRegistratorAbstractGoogle;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object internalRegisterForPush;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        internalRegisterForPush = this.this$0.internalRegisterForPush(null, this);
        return internalRegisterForPush;
    }
}
