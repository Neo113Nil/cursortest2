package com.onesignal.common.threading;

import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1430a;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.common.threading.ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1", f = "ThreadUtils.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1 extends h implements InterfaceC1441l {
    final /* synthetic */ InterfaceC1430a $block;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1(InterfaceC1430a interfaceC1430a, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$block = interfaceC1430a;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1(this.$block, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        this.$block.invoke();
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((ThreadUtilsKt$runOnSerialIOIfBackgroundThreading$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
