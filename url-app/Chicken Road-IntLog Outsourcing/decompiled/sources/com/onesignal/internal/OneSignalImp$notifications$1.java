package com.onesignal.internal;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.notifications.INotificationsManager;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$notifications$1 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$notifications$1(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final INotificationsManager invoke() {
        ServiceProvider serviceProvider;
        serviceProvider = this.this$0.services;
        return (INotificationsManager) serviceProvider.getService(INotificationsManager.class);
    }
}
