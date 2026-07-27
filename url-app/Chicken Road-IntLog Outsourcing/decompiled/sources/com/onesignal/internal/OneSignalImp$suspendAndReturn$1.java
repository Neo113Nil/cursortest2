package com.onesignal.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.internal.OneSignalImp", f = "OneSignalImp.kt", l = {706}, m = "suspendAndReturn")
/* loaded from: classes.dex */
public final class OneSignalImp$suspendAndReturn$1<T> extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$suspendAndReturn$1(OneSignalImp oneSignalImp, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = oneSignalImp;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object suspendAndReturn;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        suspendAndReturn = this.this$0.suspendAndReturn(null, this);
        return suspendAndReturn;
    }
}
