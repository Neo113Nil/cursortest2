package com.onesignal.inAppMessages.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {1060}, m = "fireRESTCallForClick")
/* loaded from: classes.dex */
public final class InAppMessagesManager$fireRESTCallForClick$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$fireRESTCallForClick$1(InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object fireRESTCallForClick;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        fireRESTCallForClick = this.this$0.fireRESTCallForClick(null, null, this);
        return fireRESTCallForClick;
    }
}
