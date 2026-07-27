package com.onesignal.common.events;

import D4.InterfaceC0022w;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.events.CallbackProducer$suspendingFireOnMain$2", f = "CallbackProducer.kt", l = {75}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CallbackProducer$suspendingFireOnMain$2 extends h implements InterfaceC1445p {
    final /* synthetic */ InterfaceC1445p $callback;
    int label;
    final /* synthetic */ CallbackProducer<THandler> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackProducer$suspendingFireOnMain$2(InterfaceC1445p interfaceC1445p, CallbackProducer<THandler> callbackProducer, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$callback = interfaceC1445p;
        this.this$0 = callbackProducer;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new CallbackProducer$suspendingFireOnMain$2(this.$callback, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((CallbackProducer$suspendingFireOnMain$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            InterfaceC1445p interfaceC1445p = this.$callback;
            obj2 = ((CallbackProducer) this.this$0).callback;
            i.b(obj2);
            this.label = 1;
            if (interfaceC1445p.invoke(obj2, this) == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        return v.f5689a;
    }
}
