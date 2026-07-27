package com.onesignal.common.events;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.common.events.CallbackProducer$fireOnMain$1", f = "CallbackProducer.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class CallbackProducer$fireOnMain$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InterfaceC1441l $callback;
    int label;
    final /* synthetic */ CallbackProducer<THandler> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CallbackProducer$fireOnMain$1(CallbackProducer<THandler> callbackProducer, InterfaceC1441l interfaceC1441l, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = callbackProducer;
        this.$callback = interfaceC1441l;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new CallbackProducer$fireOnMain$1(this.this$0, this.$callback, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        obj2 = ((CallbackProducer) this.this$0).callback;
        if (obj2 != null) {
            InterfaceC1441l interfaceC1441l = this.$callback;
            obj3 = ((CallbackProducer) this.this$0).callback;
            i.b(obj3);
            interfaceC1441l.invoke(obj3);
        }
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((CallbackProducer$fireOnMain$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
