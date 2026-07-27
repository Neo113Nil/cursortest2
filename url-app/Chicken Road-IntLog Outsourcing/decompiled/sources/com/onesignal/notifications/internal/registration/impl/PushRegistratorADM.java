package com.onesignal.notifications.internal.registration.impl;

import B0.f;
import D4.AbstractC0024y;
import com.amazon.device.messaging.ADM;
import com.onesignal.common.threading.WaiterWithValue;
import com.onesignal.core.internal.application.IApplicationService;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import e5.g;
import f4.v;
import k4.InterfaceC1218d;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.s;
import l4.EnumC1260a;

/* loaded from: classes.dex */
public final class PushRegistratorADM implements IPushRegistrator, IPushRegistratorCallback {
    private final IApplicationService _applicationService;
    private WaiterWithValue<String> waiter;

    public PushRegistratorADM(IApplicationService _applicationService) {
        i.e(_applicationService, "_applicationService");
        this._applicationService = _applicationService;
    }

    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, InterfaceC1218d interfaceC1218d) {
        WaiterWithValue<String> waiterWithValue = this.waiter;
        if (waiterWithValue != null) {
            waiterWithValue.wake(str);
        }
        return v.f5689a;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0095  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object registerForPush(InterfaceC1218d interfaceC1218d) {
        PushRegistratorADM$registerForPush$1 pushRegistratorADM$registerForPush$1;
        int i2;
        s sVar;
        if (interfaceC1218d instanceof PushRegistratorADM$registerForPush$1) {
            pushRegistratorADM$registerForPush$1 = (PushRegistratorADM$registerForPush$1) interfaceC1218d;
            int i3 = pushRegistratorADM$registerForPush$1.label;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                pushRegistratorADM$registerForPush$1.label = i3 - Integer.MIN_VALUE;
                Object obj = pushRegistratorADM$registerForPush$1.result;
                f.u();
                EnumC1260a enumC1260a = EnumC1260a.f11058a;
                i2 = pushRegistratorADM$registerForPush$1.label;
                if (i2 != 0) {
                    g.y(obj);
                    this.waiter = new WaiterWithValue<>();
                    ADM adm = new ADM(this._applicationService.getAppContext());
                    s sVar2 = new s();
                    String registrationId = adm.getRegistrationId();
                    sVar2.f10741a = registrationId;
                    if (registrationId != null) {
                        Logging.debug$default("ADM Already registered with ID:" + ((String) sVar2.f10741a), null, 2, null);
                        return new IPushRegistrator.RegisterResult((String) sVar2.f10741a, SubscriptionStatus.SUBSCRIBED);
                    }
                    adm.startRegister();
                    PushRegistratorADM$registerForPush$2 pushRegistratorADM$registerForPush$2 = new PushRegistratorADM$registerForPush$2(sVar2, this, null);
                    pushRegistratorADM$registerForPush$1.L$0 = sVar2;
                    pushRegistratorADM$registerForPush$1.label = 1;
                    if (AbstractC0024y.x(30000L, pushRegistratorADM$registerForPush$2, pushRegistratorADM$registerForPush$1) == enumC1260a) {
                        return enumC1260a;
                    }
                    sVar = sVar2;
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sVar = (s) pushRegistratorADM$registerForPush$1.L$0;
                    g.y(obj);
                }
                if (sVar.f10741a != null) {
                    Logging.info$default("com.onesignal.ADMMessageHandler timed out, please check that your have the receiver, service, and your package name matches(NOTE: Case Sensitive) per the OneSignal instructions.", null, 2, null);
                    return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.ERROR);
                }
                Logging.debug$default("ADM registered with ID:" + ((String) sVar.f10741a), null, 2, null);
                return new IPushRegistrator.RegisterResult((String) sVar.f10741a, SubscriptionStatus.SUBSCRIBED);
            }
        }
        pushRegistratorADM$registerForPush$1 = new PushRegistratorADM$registerForPush$1(this, interfaceC1218d);
        Object obj2 = pushRegistratorADM$registerForPush$1.result;
        f.u();
        EnumC1260a enumC1260a2 = EnumC1260a.f11058a;
        i2 = pushRegistratorADM$registerForPush$1.label;
        if (i2 != 0) {
        }
        if (sVar.f10741a != null) {
        }
    }
}
