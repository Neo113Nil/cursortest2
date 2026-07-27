package com.onesignal.internal;

import android.content.Context;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.internal.OneSignalImp$initWithContext$2", f = "OneSignalImp.kt", l = {}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class OneSignalImp$initWithContext$2 extends h implements InterfaceC1441l {
    final /* synthetic */ String $appId;
    final /* synthetic */ Context $context;
    int label;
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$initWithContext$2(OneSignalImp oneSignalImp, Context context, String str, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.this$0 = oneSignalImp;
        this.$context = context;
        this.$appId = str;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new OneSignalImp$initWithContext$2(this.this$0, this.$context, this.$appId, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        g.y(obj);
        this.this$0.internalInit(this.$context, this.$appId);
        return v.f5689a;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((OneSignalImp$initWithContext$2) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
