package com.onesignal.inAppMessages.internal.display.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.display.impl.InAppDisplayer", f = "InAppDisplayer.kt", l = {145}, m = "initInAppMessage")
/* loaded from: classes.dex */
public final class InAppDisplayer$initInAppMessage$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppDisplayer this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppDisplayer$initInAppMessage$1(InAppDisplayer inAppDisplayer, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppDisplayer;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object initInAppMessage;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        initInAppMessage = this.this$0.initInAppMessage(null, null, null, this);
        return initInAppMessage;
    }
}
