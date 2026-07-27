package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.services.ADMMessageHandlerJob$onMessage$1", f = "ADMMessageHandlerJob.kt", l = {26}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ADMMessageHandlerJob$onMessage$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $safeContext;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ADMMessageHandlerJob$onMessage$1(Context context, Bundle bundle, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$safeContext = context;
        this.$bundle = bundle;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new ADMMessageHandlerJob$onMessage$1(this.$safeContext, this.$bundle, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Context safeContext = this.$safeContext;
            i.d(safeContext, "$safeContext");
            this.label = 1;
            obj = OneSignal.initWithContext(safeContext, this);
            if (obj == enumC1260a) {
                return enumC1260a;
            }
        } else {
            if (i2 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            g.y(obj);
        }
        boolean booleanValue = ((Boolean) obj).booleanValue();
        v vVar = v.f5689a;
        if (!booleanValue) {
            Logging.warn$default("onMessage skipped due to failed OneSignal init", null, 2, null);
            return vVar;
        }
        INotificationBundleProcessor iNotificationBundleProcessor = (INotificationBundleProcessor) OneSignal.INSTANCE.getServices().getService(INotificationBundleProcessor.class);
        Context safeContext2 = this.$safeContext;
        i.d(safeContext2, "$safeContext");
        iNotificationBundleProcessor.processBundleFromReceiver(safeContext2, this.$bundle);
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((ADMMessageHandlerJob$onMessage$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
