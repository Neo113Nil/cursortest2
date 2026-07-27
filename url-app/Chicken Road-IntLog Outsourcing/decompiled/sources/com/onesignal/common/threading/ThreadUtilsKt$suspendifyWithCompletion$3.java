package com.onesignal.common.threading;

import D4.InterfaceC0022w;
import com.onesignal.debug.internal.logging.Logging;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.common.threading.ThreadUtilsKt$suspendifyWithCompletion$3", f = "ThreadUtils.kt", l = {171}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThreadUtilsKt$suspendifyWithCompletion$3 extends h implements InterfaceC1445p {
    final /* synthetic */ InterfaceC1441l $block;
    final /* synthetic */ InterfaceC1430a $onComplete;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUtilsKt$suspendifyWithCompletion$3(InterfaceC1441l interfaceC1441l, InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$block = interfaceC1441l;
        this.$onComplete = interfaceC1430a;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new ThreadUtilsKt$suspendifyWithCompletion$3(this.$block, this.$onComplete, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((ThreadUtilsKt$suspendifyWithCompletion$3) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        try {
            if (i2 == 0) {
                g.y(obj);
                InterfaceC1441l interfaceC1441l = this.$block;
                this.label = 1;
                if (interfaceC1441l.invoke(this) == enumC1260a) {
                    return enumC1260a;
                }
            } else {
                if (i2 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                g.y(obj);
            }
            InterfaceC1430a interfaceC1430a = this.$onComplete;
            if (interfaceC1430a != null) {
                interfaceC1430a.invoke();
            }
        } catch (Exception e3) {
            Logging.error("Exception in suspendifyWithCompletion", e3);
        }
        return v.f5689a;
    }
}
