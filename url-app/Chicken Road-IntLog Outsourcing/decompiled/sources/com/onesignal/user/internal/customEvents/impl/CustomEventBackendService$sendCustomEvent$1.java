package com.onesignal.user.internal.customEvents.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.user.internal.customEvents.impl.CustomEventBackendService", f = "CustomEventBackendService.kt", l = {47}, m = "sendCustomEvent")
/* loaded from: classes.dex */
public final class CustomEventBackendService$sendCustomEvent$1 extends AbstractC1295c {
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ CustomEventBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CustomEventBackendService$sendCustomEvent$1(CustomEventBackendService customEventBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = customEventBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.sendCustomEvent(null, null, null, 0L, null, null, null, null, this);
    }
}
