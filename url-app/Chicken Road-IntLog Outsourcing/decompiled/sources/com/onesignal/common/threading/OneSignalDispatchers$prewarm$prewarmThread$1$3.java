package com.onesignal.common.threading;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.common.threading.OneSignalDispatchers$prewarm$prewarmThread$1$3", f = "OneSignalDispatchers.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalDispatchers$prewarm$prewarmThread$1$3 extends h implements InterfaceC1441l {
    int label;

    public OneSignalDispatchers$prewarm$prewarmThread$1$3(InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OneSignalDispatchers$prewarm$prewarmThread$1$3(interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OneSignalDispatchers$prewarm$prewarmThread$1$3) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
