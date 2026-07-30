package com.onesignal.user.internal;

import C4.p;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class d {
    private final com.onesignal.core.internal.config.b configModel;
    private final T3.b identityModelStore;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;
    private final Object lock;
    private final F2.f operationRepo;
    private final l userSwitcher;

    public static final class a {
        private final String appId;
        private final String existingOneSignalId;
        private final String externalId;
        private final String newIdentityOneSignalId;

        public a(String appId, String newIdentityOneSignalId, String externalId, String str) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newIdentityOneSignalId, "newIdentityOneSignalId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            this.appId = appId;
            this.newIdentityOneSignalId = newIdentityOneSignalId;
            this.externalId = externalId;
            this.existingOneSignalId = str;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, int i2, Object obj) {
            if ((i2 & 1) != 0) {
                str = aVar.appId;
            }
            if ((i2 & 2) != 0) {
                str2 = aVar.newIdentityOneSignalId;
            }
            if ((i2 & 4) != 0) {
                str3 = aVar.externalId;
            }
            if ((i2 & 8) != 0) {
                str4 = aVar.existingOneSignalId;
            }
            return aVar.copy(str, str2, str3, str4);
        }

        public final String component1() {
            return this.appId;
        }

        public final String component2() {
            return this.newIdentityOneSignalId;
        }

        public final String component3() {
            return this.externalId;
        }

        public final String component4() {
            return this.existingOneSignalId;
        }

        public final a copy(String appId, String newIdentityOneSignalId, String externalId, String str) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newIdentityOneSignalId, "newIdentityOneSignalId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            return new a(appId, newIdentityOneSignalId, externalId, str);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return Intrinsics.a(this.appId, aVar.appId) && Intrinsics.a(this.newIdentityOneSignalId, aVar.newIdentityOneSignalId) && Intrinsics.a(this.externalId, aVar.externalId) && Intrinsics.a(this.existingOneSignalId, aVar.existingOneSignalId);
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getExistingOneSignalId() {
            return this.existingOneSignalId;
        }

        public final String getExternalId() {
            return this.externalId;
        }

        public final String getNewIdentityOneSignalId() {
            return this.newIdentityOneSignalId;
        }

        public int hashCode() {
            int e7 = p.e(this.externalId, p.e(this.newIdentityOneSignalId, this.appId.hashCode() * 31, 31), 31);
            String str = this.existingOneSignalId;
            return e7 + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoginEnqueueContext(appId=" + this.appId + ", newIdentityOneSignalId=" + this.newIdentityOneSignalId + ", externalId=" + this.externalId + ", existingOneSignalId=" + this.existingOneSignalId + ')';
        }
    }

    public static final class b extends X5.c {
        int label;
        /* synthetic */ Object result;

        public b(V5.b bVar) {
            super(bVar);
        }

        @Override // X5.a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.enqueueLogin$com_onesignal_core(null, this);
        }
    }

    public static final class c extends kotlin.jvm.internal.p implements Function2 {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((T3.a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return Unit.f6114a;
        }

        public final void invoke(T3.a identityModel, com.onesignal.user.internal.properties.a aVar) {
            Intrinsics.checkNotNullParameter(identityModel, "identityModel");
            Intrinsics.checkNotNullParameter(aVar, "<anonymous parameter 1>");
            identityModel.setExternalId(this.$externalId);
        }
    }

    public d(T3.b identityModelStore, l userSwitcher, F2.f operationRepo, com.onesignal.core.internal.config.b configModel, com.onesignal.user.internal.jwt.c jwtTokenStore, Object lock) {
        Intrinsics.checkNotNullParameter(identityModelStore, "identityModelStore");
        Intrinsics.checkNotNullParameter(userSwitcher, "userSwitcher");
        Intrinsics.checkNotNullParameter(operationRepo, "operationRepo");
        Intrinsics.checkNotNullParameter(configModel, "configModel");
        Intrinsics.checkNotNullParameter(jwtTokenStore, "jwtTokenStore");
        Intrinsics.checkNotNullParameter(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.jwtTokenStore = jwtTokenStore;
        this.lock = lock;
    }

    public static /* synthetic */ a switchUser$com_onesignal_core$default(d dVar, String str, String str2, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str2 = null;
        }
        return dVar.switchUser$com_onesignal_core(str, str2);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueLogin$com_onesignal_core(a aVar, V5.b bVar) {
        b bVar2;
        Object obj;
        int i2;
        if (bVar instanceof b) {
            bVar2 = (b) bVar;
            int i5 = bVar2.label;
            if ((i5 & Integer.MIN_VALUE) != 0) {
                bVar2.label = i5 - Integer.MIN_VALUE;
                b bVar3 = bVar2;
                obj = bVar3.result;
                W5.a aVar2 = W5.a.f2787d;
                i2 = bVar3.label;
                if (i2 != 0) {
                    V6.b.P(obj);
                    F2.f fVar = this.operationRepo;
                    U3.f fVar2 = new U3.f(aVar.getAppId(), aVar.getNewIdentityOneSignalId(), aVar.getExternalId(), aVar.getExistingOneSignalId());
                    bVar3.label = 1;
                    obj = F2.e.enqueueAndWait$default(fVar, fVar2, false, bVar3, 2, null);
                    if (obj == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i2 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    V6.b.P(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Could not login user", null, 2, null);
                }
                return Unit.f6114a;
            }
        }
        bVar2 = new b(bVar);
        b bVar32 = bVar2;
        obj = bVar32.result;
        W5.a aVar22 = W5.a.f2787d;
        i2 = bVar32.label;
        if (i2 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.f6114a;
    }

    public final a switchUser$com_onesignal_core(String externalId, String str) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        synchronized (this.lock) {
            String externalId2 = ((T3.a) this.identityModelStore.getModel()).getExternalId();
            String onesignalId = ((T3.a) this.identityModelStore.getModel()).getOnesignalId();
            if (Intrinsics.a(externalId2, externalId)) {
                if (str != null) {
                    this.jwtTokenStore.putJwt(externalId, str);
                    this.operationRepo.forceExecuteOperations();
                }
                return null;
            }
            this.jwtTokenStore.putJwt(externalId, str);
            l.createAndSwitchToNewUser$default(this.userSwitcher, false, new c(externalId), 1, null);
            String onesignalId2 = ((T3.a) this.identityModelStore.getModel()).getOnesignalId();
            if (this.configModel.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED || externalId2 != null) {
                onesignalId = null;
            }
            return new a(this.configModel.getAppId(), onesignalId2, externalId, onesignalId);
        }
    }
}
