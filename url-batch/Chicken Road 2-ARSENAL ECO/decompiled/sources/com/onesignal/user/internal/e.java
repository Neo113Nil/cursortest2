package com.onesignal.user.internal;

import r3.C0617a;

/* loaded from: classes.dex */
public final class e {
    private final com.onesignal.core.internal.config.b configModel;
    private final r3.b identityModelStore;
    private final com.onesignal.core.internal.config.impl.c identityVerificationService;
    private final Object lock;
    private final d2.f operationRepo;
    private final w3.e subscriptionModelStore;
    private final l userSwitcher;

    public static final class a {
        private final String appId;
        private final String newOnesignalId;

        public a(String appId, String newOnesignalId) {
            kotlin.jvm.internal.i.e(appId, "appId");
            kotlin.jvm.internal.i.e(newOnesignalId, "newOnesignalId");
            this.appId = appId;
            this.newOnesignalId = newOnesignalId;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = aVar.appId;
            }
            if ((i7 & 2) != 0) {
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
            kotlin.jvm.internal.i.e(appId, "appId");
            kotlin.jvm.internal.i.e(newOnesignalId, "newOnesignalId");
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
            return kotlin.jvm.internal.i.a(this.appId, aVar.appId) && kotlin.jvm.internal.i.a(this.newOnesignalId, aVar.newOnesignalId);
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

    public e(r3.b identityModelStore, l userSwitcher, d2.f operationRepo, com.onesignal.core.internal.config.b configModel, w3.e subscriptionModelStore, com.onesignal.core.internal.config.impl.c identityVerificationService, Object lock) {
        kotlin.jvm.internal.i.e(identityModelStore, "identityModelStore");
        kotlin.jvm.internal.i.e(userSwitcher, "userSwitcher");
        kotlin.jvm.internal.i.e(operationRepo, "operationRepo");
        kotlin.jvm.internal.i.e(configModel, "configModel");
        kotlin.jvm.internal.i.e(subscriptionModelStore, "subscriptionModelStore");
        kotlin.jvm.internal.i.e(identityVerificationService, "identityVerificationService");
        kotlin.jvm.internal.i.e(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.subscriptionModelStore = subscriptionModelStore;
        this.identityVerificationService = identityVerificationService;
        this.lock = lock;
    }

    public final void enqueueLogout$com_onesignal_core(a context) {
        kotlin.jvm.internal.i.e(context, "context");
        d2.e.enqueue$default(this.operationRepo, new s3.f(context.getAppId(), context.getNewOnesignalId(), null, null, 8, null), false, 2, null);
    }

    public final a switchUser$com_onesignal_core() {
        synchronized (this.lock) {
            if (((C0617a) this.identityModelStore.getModel()).getExternalId() == null) {
                return null;
            }
            if (this.identityVerificationService.getNewCodePathsRun() && f.switchUserIv(this.userSwitcher, this.subscriptionModelStore, this.configModel, this.identityVerificationService.getIvBehaviorActive())) {
                return null;
            }
            l.createAndSwitchToNewUser$default(this.userSwitcher, false, null, 3, null);
            return new a(this.configModel.getAppId(), ((C0617a) this.identityModelStore.getModel()).getOnesignalId());
        }
    }
}
