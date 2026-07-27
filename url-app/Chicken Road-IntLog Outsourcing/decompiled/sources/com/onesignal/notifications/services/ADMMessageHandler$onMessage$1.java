package com.onesignal.notifications.services;

import android.content.Context;
import android.os.Bundle;
import com.onesignal.OneSignal;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.bundle.INotificationBundleProcessor;
import e5.g;
import f4.v;
import io.appmetrica.analytics.impl.C0793l9;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import l4.EnumC1260a;
import m4.e;
import m4.h;
import t4.InterfaceC1441l;

@e(c = "com.onesignal.notifications.services.ADMMessageHandler$onMessage$1", f = "ADMMessageHandler.kt", l = {C0793l9.f8681C}, m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ADMMessageHandler$onMessage$1 extends h implements InterfaceC1441l {
    final /* synthetic */ Bundle $bundle;
    final /* synthetic */ Context $context;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ADMMessageHandler$onMessage$1(Context context, Bundle bundle, InterfaceC1218d interfaceC1218d) {
        super(1, interfaceC1218d);
        this.$context = context;
        this.$bundle = bundle;
    }

    @Override // m4.AbstractC1293a
    public final InterfaceC1218d create(InterfaceC1218d interfaceC1218d) {
        return new ADMMessageHandler$onMessage$1(this.$context, this.$bundle, interfaceC1218d);
    }

    @Override // m4.AbstractC1293a
    public final Object invokeSuspend(Object obj) {
        EnumC1260a enumC1260a = EnumC1260a.f11058a;
        int i2 = this.label;
        if (i2 == 0) {
            g.y(obj);
            Context context = this.$context;
            i.d(context, "$context");
            this.label = 1;
            obj = OneSignal.initWithContext(context, this);
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
        Context context2 = this.$context;
        i.d(context2, "$context");
        iNotificationBundleProcessor.processBundleFromReceiver(context2, this.$bundle);
        return vVar;
    }

    @Override // t4.InterfaceC1441l
    public final Object invoke(InterfaceC1218d interfaceC1218d) {
        return ((ADMMessageHandler$onMessage$1) create(interfaceC1218d)).invokeSuspend(v.f5689a);
    }
}
