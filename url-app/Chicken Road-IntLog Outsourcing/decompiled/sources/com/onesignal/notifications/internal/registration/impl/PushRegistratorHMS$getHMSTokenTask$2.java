package com.onesignal.notifications.internal.registration.impl;

import D4.InterfaceC0022w;
import com.onesignal.common.threading.WaiterWithValue;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1445p;

@e(c = "com.onesignal.notifications.internal.registration.impl.PushRegistratorHMS$getHMSTokenTask$2", f = "PushRegistratorHMS.kt", l = {77}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class PushRegistratorHMS$getHMSTokenTask$2 extends h implements InterfaceC1445p {
    final /* synthetic */ s $pushToken;
    Object L$0;
    int label;
    final /* synthetic */ PushRegistratorHMS this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PushRegistratorHMS$getHMSTokenTask$2(s sVar, PushRegistratorHMS pushRegistratorHMS, InterfaceC1218d interfaceC1218d) {
        super(2, interfaceC1218d);
        this.$pushToken = sVar;
        this.this$0 = pushRegistratorHMS;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(Object obj, InterfaceC1218d interfaceC1218d) {
        return new PushRegistratorHMS$getHMSTokenTask$2(this.$pushToken, this.this$0, interfaceC1218d);
    }

    @Override // t4.InterfaceC1445p
    public final Object invoke(InterfaceC0022w interfaceC0022w, InterfaceC1218d interfaceC1218d) {
        return ((PushRegistratorHMS$getHMSTokenTask$2) create(interfaceC0022w, interfaceC1218d)).invokeSuspend(v.f5689a);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        s sVar;
        WaiterWithValue waiterWithValue;
        String str;
        s sVar2;
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            sVar = this.$pushToken;
            waiterWithValue = this.this$0.waiter;
            if (waiterWithValue == null) {
                str = null;
                sVar.f10741a = str;
                return v.f5689a;
            }
            this.L$0 = sVar;
            this.label = 1;
            Object waitForWake = waiterWithValue.waitForWake(this);
            if (waitForWake == enumC1260a) {
                return enumC1260a;
            }
            sVar2 = sVar;
            obj = waitForWake;
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            sVar2 = (s) this.L$0;
            g.y(obj);
        }
        s sVar3 = sVar2;
        str = (String) obj;
        sVar = sVar3;
        sVar.f10741a = str;
        return v.f5689a;
    }
}
