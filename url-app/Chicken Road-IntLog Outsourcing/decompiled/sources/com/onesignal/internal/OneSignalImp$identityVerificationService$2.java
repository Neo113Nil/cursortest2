package com.onesignal.internal;

import com.onesignal.common.services.ServiceProvider;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$identityVerificationService$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$identityVerificationService$2(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final IdentityVerificationService invoke() {
        ServiceProvider serviceProvider;
        serviceProvider = this.this$0.services;
        return (IdentityVerificationService) serviceProvider.getService(IdentityVerificationService.class);
    }
}
