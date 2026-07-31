package com.onesignal.user.internal;

import com.onesignal.core.BuildConfig;
import com.onesignal.core.internal.config.ConfigModel;
import com.onesignal.core.internal.operations.IOperationRepo;
import com.onesignal.debug.internal.logging.Logging;
import com.onesignal.user.internal.identity.IdentityModel;
import com.onesignal.user.internal.identity.IdentityModelStore;
import com.onesignal.user.internal.jwt.JwtRequirement;
import com.onesignal.user.internal.jwt.JwtTokenStore;
import com.onesignal.user.internal.operations.LoginUserOperation;
import com.onesignal.user.internal.properties.PropertiesModel;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LoginHelper.kt */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0019B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u0001¢\u0006\u0002\u0010\rJ\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011H\u0080@¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0014\u001a\u0004\u0018\u00010\u00112\u0006\u0010\u0015\u001a\u00020\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0002\b\u0018R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0001X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/onesignal/user/internal/LoginHelper;", "", "identityModelStore", "Lcom/onesignal/user/internal/identity/IdentityModelStore;", "userSwitcher", "Lcom/onesignal/user/internal/UserSwitcher;", "operationRepo", "Lcom/onesignal/core/internal/operations/IOperationRepo;", "configModel", "Lcom/onesignal/core/internal/config/ConfigModel;", "jwtTokenStore", "Lcom/onesignal/user/internal/jwt/JwtTokenStore;", "lock", "(Lcom/onesignal/user/internal/identity/IdentityModelStore;Lcom/onesignal/user/internal/UserSwitcher;Lcom/onesignal/core/internal/operations/IOperationRepo;Lcom/onesignal/core/internal/config/ConfigModel;Lcom/onesignal/user/internal/jwt/JwtTokenStore;Ljava/lang/Object;)V", "enqueueLogin", "", "context", "Lcom/onesignal/user/internal/LoginHelper$LoginEnqueueContext;", "enqueueLogin$com_onesignal_core", "(Lcom/onesignal/user/internal/LoginHelper$LoginEnqueueContext;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "switchUser", "externalId", "", "jwtBearerToken", "switchUser$com_onesignal_core", "LoginEnqueueContext", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class LoginHelper {
    private final ConfigModel configModel;
    private final IdentityModelStore identityModelStore;
    private final JwtTokenStore jwtTokenStore;
    private final Object lock;
    private final IOperationRepo operationRepo;
    private final UserSwitcher userSwitcher;

    public LoginHelper(IdentityModelStore identityModelStore, UserSwitcher userSwitcher, IOperationRepo operationRepo, ConfigModel configModel, JwtTokenStore jwtTokenStore, Object lock) {
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

    /* compiled from: LoginHelper.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0007J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J3\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\t¨\u0006\u0018"}, d2 = {"Lcom/onesignal/user/internal/LoginHelper$LoginEnqueueContext;", "", "appId", "", "newIdentityOneSignalId", "externalId", "existingOneSignalId", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAppId", "()Ljava/lang/String;", "getExistingOneSignalId", "getExternalId", "getNewIdentityOneSignalId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", BuildConfig.LIBRARY_PACKAGE_NAME}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class LoginEnqueueContext {
        private final String appId;
        private final String existingOneSignalId;
        private final String externalId;
        private final String newIdentityOneSignalId;

        public static /* synthetic */ LoginEnqueueContext copy$default(LoginEnqueueContext loginEnqueueContext, String str, String str2, String str3, String str4, int i, Object obj) {
            if ((i & 1) != 0) {
                str = loginEnqueueContext.appId;
            }
            if ((i & 2) != 0) {
                str2 = loginEnqueueContext.newIdentityOneSignalId;
            }
            if ((i & 4) != 0) {
                str3 = loginEnqueueContext.externalId;
            }
            if ((i & 8) != 0) {
                str4 = loginEnqueueContext.existingOneSignalId;
            }
            return loginEnqueueContext.copy(str, str2, str3, str4);
        }

        /* renamed from: component1, reason: from getter */
        public final String getAppId() {
            return this.appId;
        }

        /* renamed from: component2, reason: from getter */
        public final String getNewIdentityOneSignalId() {
            return this.newIdentityOneSignalId;
        }

        /* renamed from: component3, reason: from getter */
        public final String getExternalId() {
            return this.externalId;
        }

        /* renamed from: component4, reason: from getter */
        public final String getExistingOneSignalId() {
            return this.existingOneSignalId;
        }

        public final LoginEnqueueContext copy(String appId, String newIdentityOneSignalId, String externalId, String existingOneSignalId) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newIdentityOneSignalId, "newIdentityOneSignalId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            return new LoginEnqueueContext(appId, newIdentityOneSignalId, externalId, existingOneSignalId);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof LoginEnqueueContext)) {
                return false;
            }
            LoginEnqueueContext loginEnqueueContext = (LoginEnqueueContext) other;
            return Intrinsics.areEqual(this.appId, loginEnqueueContext.appId) && Intrinsics.areEqual(this.newIdentityOneSignalId, loginEnqueueContext.newIdentityOneSignalId) && Intrinsics.areEqual(this.externalId, loginEnqueueContext.externalId) && Intrinsics.areEqual(this.existingOneSignalId, loginEnqueueContext.existingOneSignalId);
        }

        public int hashCode() {
            int hashCode = ((((this.appId.hashCode() * 31) + this.newIdentityOneSignalId.hashCode()) * 31) + this.externalId.hashCode()) * 31;
            String str = this.existingOneSignalId;
            return hashCode + (str == null ? 0 : str.hashCode());
        }

        public String toString() {
            return "LoginEnqueueContext(appId=" + this.appId + ", newIdentityOneSignalId=" + this.newIdentityOneSignalId + ", externalId=" + this.externalId + ", existingOneSignalId=" + this.existingOneSignalId + ')';
        }

        public LoginEnqueueContext(String appId, String newIdentityOneSignalId, String externalId, String str) {
            Intrinsics.checkNotNullParameter(appId, "appId");
            Intrinsics.checkNotNullParameter(newIdentityOneSignalId, "newIdentityOneSignalId");
            Intrinsics.checkNotNullParameter(externalId, "externalId");
            this.appId = appId;
            this.newIdentityOneSignalId = newIdentityOneSignalId;
            this.externalId = externalId;
            this.existingOneSignalId = str;
        }

        public final String getAppId() {
            return this.appId;
        }

        public final String getNewIdentityOneSignalId() {
            return this.newIdentityOneSignalId;
        }

        public final String getExternalId() {
            return this.externalId;
        }

        public final String getExistingOneSignalId() {
            return this.existingOneSignalId;
        }
    }

    public static /* synthetic */ LoginEnqueueContext switchUser$com_onesignal_core$default(LoginHelper loginHelper, String str, String str2, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        return loginHelper.switchUser$com_onesignal_core(str, str2);
    }

    public final LoginEnqueueContext switchUser$com_onesignal_core(final String externalId, String jwtBearerToken) {
        Intrinsics.checkNotNullParameter(externalId, "externalId");
        synchronized (this.lock) {
            String externalId2 = this.identityModelStore.getModel().getExternalId();
            String onesignalId = this.identityModelStore.getModel().getOnesignalId();
            if (Intrinsics.areEqual(externalId2, externalId)) {
                if (jwtBearerToken != null) {
                    this.jwtTokenStore.putJwt(externalId, jwtBearerToken);
                    this.operationRepo.forceExecuteOperations();
                }
                return null;
            }
            this.jwtTokenStore.putJwt(externalId, jwtBearerToken);
            UserSwitcher.createAndSwitchToNewUser$default(this.userSwitcher, false, new Function2<IdentityModel, PropertiesModel, Unit>() { // from class: com.onesignal.user.internal.LoginHelper$switchUser$1$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                {
                    super(2);
                }

                @Override // kotlin.jvm.functions.Function2
                public /* bridge */ /* synthetic */ Unit invoke(IdentityModel identityModel, PropertiesModel propertiesModel) {
                    invoke2(identityModel, propertiesModel);
                    return Unit.INSTANCE;
                }

                /* renamed from: invoke, reason: avoid collision after fix types in other method */
                public final void invoke2(IdentityModel identityModel, PropertiesModel propertiesModel) {
                    Intrinsics.checkNotNullParameter(identityModel, "identityModel");
                    Intrinsics.checkNotNullParameter(propertiesModel, "<anonymous parameter 1>");
                    identityModel.setExternalId(externalId);
                }
            }, 1, null);
            String onesignalId2 = this.identityModelStore.getModel().getOnesignalId();
            if (this.configModel.getUseIdentityVerification$com_onesignal_core() == JwtRequirement.REQUIRED || externalId2 != null) {
                onesignalId = null;
            }
            return new LoginEnqueueContext(this.configModel.getAppId(), onesignalId2, externalId, onesignalId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object enqueueLogin$com_onesignal_core(LoginEnqueueContext loginEnqueueContext, Continuation<? super Unit> continuation) {
        LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$1;
        Object obj;
        int i;
        if (continuation instanceof LoginHelper$enqueueLogin$1) {
            loginHelper$enqueueLogin$1 = (LoginHelper$enqueueLogin$1) continuation;
            if ((loginHelper$enqueueLogin$1.label & Integer.MIN_VALUE) != 0) {
                loginHelper$enqueueLogin$1.label -= Integer.MIN_VALUE;
                LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$12 = loginHelper$enqueueLogin$1;
                obj = loginHelper$enqueueLogin$12.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = loginHelper$enqueueLogin$12.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    IOperationRepo iOperationRepo = this.operationRepo;
                    LoginUserOperation loginUserOperation = new LoginUserOperation(loginEnqueueContext.getAppId(), loginEnqueueContext.getNewIdentityOneSignalId(), loginEnqueueContext.getExternalId(), loginEnqueueContext.getExistingOneSignalId());
                    loginHelper$enqueueLogin$12.label = 1;
                    obj = IOperationRepo.DefaultImpls.enqueueAndWait$default(iOperationRepo, loginUserOperation, false, loginHelper$enqueueLogin$12, 2, null);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    Logging.warn$default("Could not login user", null, 2, null);
                }
                return Unit.INSTANCE;
            }
        }
        loginHelper$enqueueLogin$1 = new LoginHelper$enqueueLogin$1(this, continuation);
        LoginHelper$enqueueLogin$1 loginHelper$enqueueLogin$122 = loginHelper$enqueueLogin$1;
        obj = loginHelper$enqueueLogin$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = loginHelper$enqueueLogin$122.label;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
        return Unit.INSTANCE;
    }
}
