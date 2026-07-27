package com.onesignal.user.internal;

import B0.o;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.jvm.internal.i;

/* loaded from: classes.dex */
public final class LogoutHelper {
    private final ConfigModel configModel;
    private final IdentityModelStore identityModelStore;
    private final IdentityVerificationService identityVerificationService;
    private final Object lock;
    private final IOperationRepo operationRepo;
    private final SubscriptionModelStore subscriptionModelStore;
    private final UserSwitcher userSwitcher;

    public static final class LogoutEnqueueContext {
        private final String appId;
        private final String newOnesignalId;

        public LogoutEnqueueContext(String appId, String newOnesignalId) {
            i.e(appId, "appId");
            i.e(newOnesignalId, "newOnesignalId");
            this.appId = appId;
            this.newOnesignalId = newOnesignalId;
        }

        public static /* synthetic */ LogoutEnqueueContext copy$default(LogoutEnqueueContext logoutEnqueueContext, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = logoutEnqueueContext.appId;
            }
            if ((i2 & 2) != 0) {
                str2 = logoutEnqueueContext.newOnesignalId;
            }
            return logoutEnqueueContext.copy(str, str2);
        }

        public final String component1() {
            return this.appId;
        }

        public final String component2() {
            return this.newOnesignalId;
        }

        public final LogoutEnqueueContext copy(String appId, String newOnesignalId) {
            i.e(appId, "appId");
            i.e(newOnesignalId, "newOnesignalId");
            return new LogoutEnqueueContext(appId, newOnesignalId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof LogoutEnqueueContext)) {
                return false;
            }
            LogoutEnqueueContext logoutEnqueueContext = (LogoutEnqueueContext) obj;
            return i.a(this.appId, logoutEnqueueContext.appId) && i.a(this.newOnesignalId, logoutEnqueueContext.newOnesignalId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getNewOnesignalId() {
            return this.newOnesignalId;
        }

        public int hashCode() {
            return this.newOnesignalId.hashCode() + (this.appId.hashCode() * 31);
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("LogoutEnqueueContext(appId=");
            sb.append(this.appId);
            sb.append(", newOnesignalId=");
            return o.l(sb, this.newOnesignalId, ')');
        }
    }

    public LogoutHelper(IdentityModelStore identityModelStore, UserSwitcher userSwitcher, IOperationRepo operationRepo, ConfigModel configModel, SubscriptionModelStore subscriptionModelStore, IdentityVerificationService identityVerificationService, Object lock) {
        i.e(identityModelStore, "identityModelStore");
        i.e(userSwitcher, "userSwitcher");
        i.e(operationRepo, "operationRepo");
        i.e(configModel, "configModel");
        i.e(subscriptionModelStore, "subscriptionModelStore");
        i.e(identityVerificationService, "identityVerificationService");
        i.e(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.subscriptionModelStore = subscriptionModelStore;
        this.identityVerificationService = identityVerificationService;
        this.lock = lock;
    }

    public final void enqueueLogout$com_onesignal_core(LogoutEnqueueContext context) {
        i.e(context, "context");
        IOperationRepo.DefaultImpls.enqueue$default(this.operationRepo, new LoginUserOperation(context.getAppId(), context.getNewOnesignalId(), null, null, 8, null), false, 2, null);
    }

    public final LogoutEnqueueContext switchUser$com_onesignal_core() {
        synchronized (this.lock) {
            if (this.identityModelStore.getModel().getExternalId() == null) {
                return null;
            }
            if (this.identityVerificationService.getNewCodePathsRun() && LogoutHelperIvExtensionsKt.switchUserIv(this.userSwitcher, this.subscriptionModelStore, this.configModel, this.identityVerificationService.getIvBehaviorActive())) {
                return null;
            }
            UserSwitcher.createAndSwitchToNewUser$default(this.userSwitcher, false, null, 3, null);
            return new LogoutEnqueueContext(this.configModel.getAppId(), this.identityModelStore.getModel().getOnesignalId());
        }
    }
}
