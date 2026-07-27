package com.onesignal.inAppMessages.internal;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.inAppMessages.internal.InAppMessagesManager", f = "InAppMessagesManager.kt", l = {944, 958}, m = "showMultiplePrompts")
/* loaded from: classes.dex */
public final class InAppMessagesManager$showMultiplePrompts$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ InAppMessagesManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppMessagesManager$showMultiplePrompts$1(InAppMessagesManager inAppMessagesManager, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = inAppMessagesManager;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object showMultiplePrompts;
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        showMultiplePrompts = this.this$0.showMultiplePrompts(null, null, this);
        return showMultiplePrompts;
    }
}
