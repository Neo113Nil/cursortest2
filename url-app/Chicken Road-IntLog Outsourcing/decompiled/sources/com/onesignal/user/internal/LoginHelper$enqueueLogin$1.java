package com.onesignal.user.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.LoginHelper", f = "LoginHelper.kt", l = {82}, m = "enqueueLogin$com_onesignal_core")
/* loaded from: classes.dex */
public final class LoginHelper$enqueueLogin$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ LoginHelper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LoginHelper$enqueueLogin$1(LoginHelper loginHelper, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = loginHelper;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.enqueueLogin$com_onesignal_core(null, this);
    }
}
