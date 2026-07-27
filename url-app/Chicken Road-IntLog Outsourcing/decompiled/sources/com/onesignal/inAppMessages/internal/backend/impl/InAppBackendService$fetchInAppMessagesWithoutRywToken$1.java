package com.onesignal.inAppMessages.internal.backend.impl;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.backend.impl.InAppBackendService", f = "InAppBackendService.kt", l = {284}, m = "fetchInAppMessagesWithoutRywToken")
/* loaded from: classes.dex */
public final class InAppBackendService$fetchInAppMessagesWithoutRywToken$1 extends AbstractC1295c {
    Object L$0;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppBackendService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppBackendService$fetchInAppMessagesWithoutRywToken$1(InAppBackendService inAppBackendService, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppBackendService;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object fetchInAppMessagesWithoutRywToken;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fetchInAppMessagesWithoutRywToken = this.this$0.fetchInAppMessagesWithoutRywToken(null, null, null, this);
        return fetchInAppMessagesWithoutRywToken;
    }
}
