package com.onesignal.user.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.config.impl.IdentityVerificationService;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.subscriptions.SubscriptionModelStore;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LogoutHelper.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0017B=\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u0001¢\u0006\u0002\u0010\u000fJ\u0015\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013H\u0000¢\u0006\u0002\b\u0014J\u000f\u0010\u0015\u001a\u0004\u0018\u00010\u0013H\u0000¢\u0006\u0002\b\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/onesignal/user/internal/LogoutHelper;", "", "identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "userSwitcher", "Lcom/onesignal/user/internal/UserSwitcher;", "operationRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "subscriptionModelStore", "Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;", "identityVerificationService", "Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;", "lock", "(Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/UserSwitcher;Lcom/onesignal/core/internal/operations/IOperationRepo;Lcom/onesignal/core/internal/config/ConfigModel;Lcom/onesignal/user/internal/subscriptions/SubscriptionModelStore;Lcom/onesignal/core/internal/config/impl/IdentityVerificationService;Ljava/lang/Object;)V", "enqueueLogout", "", "context", "Lcom/onesignal/user/internal/LogoutHelper$LogoutEnqueueContext;", "enqueueLogout$com_onesignal_core", "switchUser", "switchUser$com_onesignal_core", "LogoutEnqueueContext", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LogoutHelper {
    private final ConfigModel configModel;
    private final IdentityModelStore identityModelStore;
    private final IdentityVerificationService identityVerificationService;
    private final Object lock;
    private final IOperationRepo operationRepo;
    private final SubscriptionModelStore subscriptionModelStore;
    private final UserSwitcher userSwitcher;

    public LogoutHelper(IdentityModelStore identityModelStore, UserSwitcher userSwitcher, IOperationRepo operationRepo, ConfigModel configModel, SubscriptionModelStore subscriptionModelStore, IdentityVerificationService identityVerificationService, Object lock) {
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(userSwitcher, "userSwitcher");
        Intrinsics.checkNotNullParameter(operationRepo, "operationRepo");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(subscriptionModelStore, "subscriptionModelStore");
        Intrinsics.checkNotNullParameter(identityVerificationService, "identityVerificationService");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.subscriptionModelStore = subscriptionModelStore;
        this.identityVerificationService = identityVerificationService;
        this.lock = lock;
    }

    /* compiled from: LogoutHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005J\t\u0010\t\u001a\u00020\u0003HÆ\u0003J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/onesignal/user/internal/LogoutHelper$LogoutEnqueueContext;", "", "appId", "", "newOnesignalId", "(Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getNewOnesignalId", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LogoutEnqueueContext {
        private final String appId;
        private final String newOnesignalId;

        public static /* synthetic */ LogoutEnqueueContext copy$default(LogoutEnqueueContext logoutEnqueueContext, String str, String str2, int i, Object obj) {
            if ((i & 1) != 0) {
                str = logoutEnqueueContext.appId;
            }
            if ((i & 2) != 0) {
                str2 = logoutEnqueueContext.newOnesignalId;
            }
            return logoutEnqueueContext.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNewOnesignalId() {
            return this.newOnesignalId;
        }

        public final LogoutEnqueueContext copy(String appId, String newOnesignalId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newOnesignalId, "newOnesignalId");
            return new LogoutEnqueueContext(appId, newOnesignalId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LogoutEnqueueContext)) {
                return false;
            }
            LogoutEnqueueContext logoutEnqueueContext = (LogoutEnqueueContext) other;
            return Intrinsics.areEqual(this.appId, logoutEnqueueContext.appId) && Intrinsics.areEqual(this.newOnesignalId, logoutEnqueueContext.newOnesignalId);
        }

        public int hashCode() {
            return (this.appId.hashCode() * 31) + this.newOnesignalId.hashCode();
        }

        public String toString() {
            return "LogoutEnqueueContext(appId=" + this.appId + ", newOnesignalId=" + this.newOnesignalId + ')';
        }

        public LogoutEnqueueContext(String appId, String newOnesignalId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newOnesignalId, "newOnesignalId");
            this.appId = appId;
            this.newOnesignalId = newOnesignalId;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getNewOnesignalId() {
            return this.newOnesignalId;
        }
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

    public final void enqueueLogout$com_onesignal_core(LogoutEnqueueContext context) {
        Intrinsics.checkNotNullParameter(context, "context");
        IOperationRepo.DefaultImpls.enqueue$default(this.operationRepo, new LoginUserOperation(context.getAppId(), context.getNewOnesignalId(), null, null, 8, null), false, 2, null);
    }
}
