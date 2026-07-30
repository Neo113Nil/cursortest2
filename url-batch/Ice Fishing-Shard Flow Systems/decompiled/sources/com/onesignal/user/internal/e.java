package com.onesignal.user.internal;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class e {
    private final com.onesignal.core.internal.config.b configModel;
    private final T3.b identityModelStore;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final Object lock;
    private final F2.f operationRepo;
    private final Y3.e subscriptionModelStore;
    private final l userSwitcher;

    public static final class a {
        private final String appId;
        private final String newOnesignalId;

        public a(String appId, String newOnesignalId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newOnesignalId, "newOnesignalId");
            this.appId = appId;
            this.newOnesignalId = newOnesignalId;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.appId;
            }
            if ((i2 & 2) != 0) {
                str2 = aVar.newOnesignalId;
            }
            return aVar.copy(str, str2);
        }

        public final String component1() {
            return this.appId;
        }

        public final String component2() {
            return this.newOnesignalId;
        }

        public final a copy(String appId, String newOnesignalId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newOnesignalId, "newOnesignalId");
            return new a(appId, newOnesignalId);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.appId, aVar.appId) && Intrinsics.a(this.newOnesignalId, aVar.newOnesignalId);
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
            return "LogoutEnqueueContext(appId=" + this.appId + ", newOnesignalId=" + this.newOnesignalId + ')';
        }
    }

    public e(T3.b identityModelStore, l userSwitcher, F2.f operationRepo, com.onesignal.core.internal.config.b configModel, Y3.e subscriptionModelStore, com.onesignal.core.internal.config.impl.c identityVerificationService, Object lock) {
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

    public final void enqueueLogout$com_onesignal_core(a context) {
        Intrinsics.checkNotNullParameter(context, "context");
        F2.e.enqueue$default(this.operationRepo, new U3.f(context.getAppId(), context.getNewOnesignalId(), null, null, 8, null), false, 2, null);
    }

    public final a switchUser$com_onesignal_core() {
        synchronized (this.lock) {
            if (((T3.a) this.identityModelStore.getModel()).getExternalId() == null) {
                return null;
            }
            if (this.identityVerificationService.getNewCodePathsRun() && f.switchUserIv(this.userSwitcher, this.subscriptionModelStore, this.configModel, this.identityVerificationService.getIvBehaviorActive())) {
                return null;
            }
            l.createAndSwitchToNewUser$default(this.userSwitcher, false, null, 3, null);
            return new a(this.configModel.getAppId(), ((T3.a) this.identityModelStore.getModel()).getOnesignalId());
        }
    }
}
