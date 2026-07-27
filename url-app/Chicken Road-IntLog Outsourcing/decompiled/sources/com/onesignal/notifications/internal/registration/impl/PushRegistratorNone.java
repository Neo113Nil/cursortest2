package com.onesignal.notifications.internal.registration.impl;

import com.onesignal.notifications.internal.registration.IPushRegistrator;
import com.onesignal.user.internal.subscriptions.SubscriptionStatus;
import f4.v;
import k4.InterfaceC1218d;

/* loaded from: classes.dex */
public final class PushRegistratorNone implements IPushRegistrator, IPushRegistratorCallback {
    @Override // com.onesignal.notifications.internal.registration.impl.IPushRegistratorCallback
    public Object fireCallback(String str, InterfaceC1218d interfaceC1218d) {
        return v.f5689a;
    }

    @Override // com.onesignal.notifications.internal.registration.IPushRegistrator
    public Object registerForPush(InterfaceC1218d interfaceC1218d) {
        return new IPushRegistrator.RegisterResult(null, SubscriptionStatus.ERROR);
    }
}
