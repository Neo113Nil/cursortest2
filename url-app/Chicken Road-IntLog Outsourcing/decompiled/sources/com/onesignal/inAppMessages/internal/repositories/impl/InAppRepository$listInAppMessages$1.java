package com.onesignal.inAppMessages.internal.repositories.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.repositories.impl.InAppRepository", f = "InAppRepository.kt", l = {68}, m = "listInAppMessages")
/* loaded from: classes.dex */
public final class InAppRepository$listInAppMessages$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppRepository this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppRepository$listInAppMessages$1(InAppRepository inAppRepository, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppRepository;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.listInAppMessages(this);
    }
}
