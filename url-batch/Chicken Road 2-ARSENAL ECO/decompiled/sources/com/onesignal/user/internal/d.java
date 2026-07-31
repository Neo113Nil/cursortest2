package com.onesignal.user.internal;

import k5.v;
import o5.InterfaceC0564d;
import p5.EnumC0580a;
import q5.AbstractC0607c;
import r3.C0617a;
import u0.AbstractC0676f;
import x5.InterfaceC0747p;

/* loaded from: classes.dex */
public final class d {
    private final com.onesignal.core.internal.config.b configModel;
    private final r3.b identityModelStore;
    private final com.onesignal.user.internal.jwt.c jwtTokenStore;
    private final Object lock;
    private final d2.f operationRepo;
    private final l userSwitcher;

    public static final class a {
        private final String appId;
        private final String existingOneSignalId;
        private final String externalId;
        private final String newIdentityOneSignalId;

        public a(String appId, String newIdentityOneSignalId, String externalId, String str) {
            kotlin.jvm.internal.i.e(appId, "appId");
            kotlin.jvm.internal.i.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            kotlin.jvm.internal.i.e(externalId, "externalId");
            this.appId = appId;
            this.newIdentityOneSignalId = newIdentityOneSignalId;
            this.externalId = externalId;
            this.existingOneSignalId = str;
        }

        public static /* synthetic */ a copy$default(a aVar, String str, String str2, String str3, String str4, int i7, Object obj) {
            if ((i7 & 1) != 0) {
                str = aVar.appId;
            }
            if ((i7 & 2) != 0) {
                str2 = aVar.newIdentityOneSignalId;
            }
            if ((i7 & 4) != 0) {
                str3 = aVar.externalId;
            }
            if ((i7 & 8) != 0) {
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
            kotlin.jvm.internal.i.e(appId, "appId");
            kotlin.jvm.internal.i.e(newIdentityOneSignalId, "newIdentityOneSignalId");
            kotlin.jvm.internal.i.e(externalId, "externalId");
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
            return kotlin.jvm.internal.i.a(this.appId, aVar.appId) && kotlin.jvm.internal.i.a(this.newIdentityOneSignalId, aVar.newIdentityOneSignalId) && kotlin.jvm.internal.i.a(this.externalId, aVar.externalId) && kotlin.jvm.internal.i.a(this.existingOneSignalId, aVar.existingOneSignalId);
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
            int hashCode = (this.externalId.hashCode() + ((this.newIdentityOneSignalId.hashCode() + (this.appId.hashCode() * 31)) * 31)) * 31;
            String str = this.existingOneSignalId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoginEnqueueContext(appId=" + this.appId + ", newIdentityOneSignalId=" + this.newIdentityOneSignalId + ", externalId=" + this.externalId + ", existingOneSignalId=" + this.existingOneSignalId + ')';
        }
    }

    public static final class b extends AbstractC0607c {
        int label;
        /* synthetic */ Object result;

        public b(InterfaceC0564d interfaceC0564d) {
            super(interfaceC0564d);
        }

        @Override // q5.AbstractC0605a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return d.this.enqueueLogin$com_onesignal_core(null, this);
        }
    }

    public static final class c extends kotlin.jvm.internal.j implements InterfaceC0747p {
        final /* synthetic */ String $externalId;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(2);
            this.$externalId = str;
        }

        @Override // x5.InterfaceC0747p
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            invoke((C0617a) obj, (com.onesignal.user.internal.properties.a) obj2);
            return v.f5219a;
        }

        public final void invoke(C0617a identityModel, com.onesignal.user.internal.properties.a aVar) {
            kotlin.jvm.internal.i.e(identityModel, "identityModel");
            kotlin.jvm.internal.i.e(aVar, "<anonymous parameter 1>");
            identityModel.setExternalId(this.$externalId);
        }
    }

    public d(r3.b identityModelStore, l userSwitcher, d2.f operationRepo, com.onesignal.core.internal.config.b configModel, com.onesignal.user.internal.jwt.c jwtTokenStore, Object lock) {
        kotlin.jvm.internal.i.e(identityModelStore, "identityModelStore");
        kotlin.jvm.internal.i.e(userSwitcher, "userSwitcher");
        kotlin.jvm.internal.i.e(operationRepo, "operationRepo");
        kotlin.jvm.internal.i.e(configModel, "configModel");
        kotlin.jvm.internal.i.e(jwtTokenStore, "jwtTokenStore");
        kotlin.jvm.internal.i.e(lock, "lock");
        this.identityModelStore = identityModelStore;
        this.userSwitcher = userSwitcher;
        this.operationRepo = operationRepo;
        this.configModel = configModel;
        this.jwtTokenStore = jwtTokenStore;
        this.lock = lock;
    }

    public static /* synthetic */ a switchUser$com_onesignal_core$default(d dVar, String str, String str2, int i7, Object obj) {
        if ((i7 & 2) != 0) {
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
    public final Object enqueueLogin$com_onesignal_core(a aVar, InterfaceC0564d interfaceC0564d) {
        b bVar;
        Object obj;
        int i7;
        if (interfaceC0564d instanceof b) {
            bVar = (b) interfaceC0564d;
            int i8 = bVar.label;
            if ((i8 & Integer.MIN_VALUE) != 0) {
                bVar.label = i8 - Integer.MIN_VALUE;
                b bVar2 = bVar;
                obj = bVar2.result;
                EnumC0580a enumC0580a = EnumC0580a.f5697f;
                i7 = bVar2.label;
                if (i7 != 0) {
                    AbstractC0676f.w(obj);
                    d2.f fVar = this.operationRepo;
                    s3.f fVar2 = new s3.f(aVar.getAppId(), aVar.getNewIdentityOneSignalId(), aVar.getExternalId(), aVar.getExistingOneSignalId());
                    bVar2.label = 1;
                    obj = d2.e.enqueueAndWait$default(fVar, fVar2, false, bVar2, 2, null);
                    if (obj == enumC0580a) {
                        return enumC0580a;
                    }
                } else {
                    if (i7 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC0676f.w(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    com.onesignal.debug.internal.logging.b.warn$default("Could not login user", null, 2, null);
                }
                return v.f5219a;
            }
        }
        bVar = new b(interfaceC0564d);
        b bVar22 = bVar;
        obj = bVar22.result;
        EnumC0580a enumC0580a2 = EnumC0580a.f5697f;
        i7 = bVar22.label;
        if (i7 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return v.f5219a;
    }

    public final a switchUser$com_onesignal_core(String externalId, String str) {
        kotlin.jvm.internal.i.e(externalId, "externalId");
        synchronized (this.lock) {
            String externalId2 = ((C0617a) this.identityModelStore.getModel()).getExternalId();
            String onesignalId = ((C0617a) this.identityModelStore.getModel()).getOnesignalId();
            if (kotlin.jvm.internal.i.a(externalId2, externalId)) {
                if (str != null) {
                    this.jwtTokenStore.putJwt(externalId, str);
                    this.operationRepo.forceExecuteOperations();
                }
                return null;
            }
            this.jwtTokenStore.putJwt(externalId, str);
            l.createAndSwitchToNewUser$default(this.userSwitcher, false, new c(externalId), 1, null);
            String onesignalId2 = ((C0617a) this.identityModelStore.getModel()).getOnesignalId();
            if (this.configModel.getUseIdentityVerification$com_onesignal_core() == com.onesignal.user.internal.jwt.b.REQUIRED || externalId2 != null) {
                onesignalId = null;
            }
            return new a(this.configModel.getAppId(), onesignalId2, externalId, onesignalId);
        }
    }
}
