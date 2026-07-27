package com.onesignal.internal;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.session.ISessionManager;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$session$1 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$session$1(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final ISessionManager invoke() {
        ServiceProvider serviceProvider;
        serviceProvider = this.this$0.services;
        return (ISessionManager) serviceProvider.getService(ISessionManager.class);
    }
}
