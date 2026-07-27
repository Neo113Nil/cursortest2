package com.onesignal.common.events;

import k4.InterfaceC1218d;
import m4.AbstractC1295c;
import m4.e;

@e(c = "com.onesignal.common.events.EventProducer", f = "EventProducer.kt", l = {79}, m = "suspendingFire")
/* loaded from: classes.dex */
public final class EventProducer$suspendingFire$1 extends AbstractC1295c {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;
    final /* synthetic */ EventProducer<THandler> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventProducer$suspendingFire$1(EventProducer<THandler> eventProducer, InterfaceC1218d interfaceC1218d) {
        super(interfaceC1218d);
        this.this$0 = eventProducer;
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.suspendingFire(null, this);
    }
}
