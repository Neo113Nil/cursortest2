package com.onesignal.common.events;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import g4.AbstractC0465j;
import java.util.Iterator;
import java.util.List;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.events.EventProducer$suspendingFireOnMain$2", f = "EventProducer.kt", l = {93}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class EventProducer$suspendingFireOnMain$2 extends h implements InterfaceC1445p {
    final /* synthetic */ InterfaceC1445p $callback;
    Object L$0;
    int label;
    final /* synthetic */ EventProducer<THandler> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EventProducer$suspendingFireOnMain$2(EventProducer<THandler> eventProducer, InterfaceC1445p interfaceC1445p, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.this$0 = eventProducer;
        this.$callback = interfaceC1445p;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new EventProducer$suspendingFireOnMain$2(this.this$0, this.$callback, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((EventProducer$suspendingFireOnMain$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        List list;
        List list2;
        List S02;
        Iterator it;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            list = ((EventProducer) this.this$0).subscribers;
            EventProducer<THandler> eventProducer = this.this$0;
            synchronized (list) {
                list2 = ((EventProducer) eventProducer).subscribers;
                S02 = AbstractC0465j.S0(list2);
            }
            it = S02.iterator();
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = (Iterator) this.L$0;
            g.y(obj);
        }
        while (it.hasNext()) {
            Object next = it.next();
            InterfaceC1445p interfaceC1445p = this.$callback;
            this.L$0 = it;
            this.label = 1;
            if (interfaceC1445p.invoke(next, this) == enumC1260a) {
                return enumC1260a;
            }
        }
        return v.f5689a;
    }
}
