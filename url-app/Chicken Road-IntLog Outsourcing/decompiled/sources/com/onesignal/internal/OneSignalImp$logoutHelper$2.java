package com.onesignal.internal;

import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.user.internal.LogoutHelper;
import com.onesignal.user.internal.UserSwitcher;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.jvm.internal.j;
import t4.InterfaceC1430a;

/* loaded from: classes.dex */
public final class OneSignalImp$logoutHelper$2 extends j implements InterfaceC1430a {
    final /* synthetic */ OneSignalImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OneSignalImp$logoutHelper$2(OneSignalImp oneSignalImp) {
        super(0);
        this.this$0 = oneSignalImp;
    }

    @Override // t4.InterfaceC1430a
    public final LogoutHelper invoke() {
        IdentityModelStore identityModelStore;
        UserSwitcher userSwitcher;
        IOperationRepo operationRepo;
        ConfigModel configModel;
        SubscriptionModelStore subscriptionModelStore;
        IdentityVerificationService identityVerificationService;
        Object obj;
        identityModelStore = this.this$0.getIdentityModelStore();
        userSwitcher = this.this$0.getUserSwitcher();
        operationRepo = this.this$0.getOperationRepo();
        configModel = this.this$0.getConfigModel();
        subscriptionModelStore = this.this$0.getSubscriptionModelStore();
        identityVerificationService = this.this$0.getIdentityVerificationService();
        obj = this.this$0.loginLogoutLock;
        return new LogoutHelper(identityModelStore, userSwitcher, operationRepo, configModel, subscriptionModelStore, identityVerificationService, obj);
    }
}
